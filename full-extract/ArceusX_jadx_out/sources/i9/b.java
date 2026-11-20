package i9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class b {

    /* renamed from: h, reason: collision with root package name */
    public static int f20313h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f20314i;

    /* renamed from: j, reason: collision with root package name */
    public static final Executor f20315j = new Executor() { // from class: i9.e0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f20316k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f20318c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f20319d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f20321f;

    /* renamed from: g, reason: collision with root package name */
    public zzd f20322g;

    /* renamed from: a, reason: collision with root package name */
    public final w1.j f20317a = new w1.j();

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f20320e = new Messenger(new h(this, Looper.getMainLooper()));

    public b(@NonNull Context context) {
        this.b = context;
        this.f20318c = new c0(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f20319d = scheduledThreadPoolExecutor;
    }

    public static /* synthetic */ Task e(Bundle bundle) {
        return m(bundle) ? sb.m.f(null) : sb.m.f(bundle);
    }

    public static /* bridge */ /* synthetic */ void g(b bVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new j());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        bVar.f20322g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        bVar.f20321f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f20316k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        bVar.l(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (bVar.f20317a) {
                        for (int i10 = 0; i10 < bVar.f20317a.getSize(); i10++) {
                            try {
                                bVar.l((String) bVar.f20317a.f(i10), intent2.getExtras());
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                bVar.l(str, intent2.putExtra("error", str2).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    public static synchronized String j() {
        String num;
        synchronized (b.class) {
            int i10 = f20313h;
            f20313h = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    public static synchronized void k(Context context, Intent intent) {
        synchronized (b.class) {
            try {
                if (f20314i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f20314i = PendingIntent.getBroadcast(context, 0, intent2, cb.a.f4820a);
                }
                intent.putExtra(Payload.TYPE_APP, f20314i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    @NonNull
    public Task<CloudMessage> a() {
        return this.f20318c.a() >= 241100000 ? b0.b(this.b).d(5, Bundle.EMPTY).h(f20315j, new sb.c() { // from class: i9.e
            @Override // sb.c
            public final Object then(Task task) {
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
            }
        }) : sb.m.e(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    @NonNull
    public Task<Void> b(@NonNull CloudMessage cloudMessage) {
        if (this.f20318c.a() < 233700000) {
            return sb.m.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", cloudMessage.w3());
        Integer x32 = cloudMessage.x3();
        if (x32 != null) {
            bundle.putInt("google.product_id", x32.intValue());
        }
        return b0.b(this.b).c(3, bundle);
    }

    @NonNull
    public Task<Bundle> c(@NonNull final Bundle bundle) {
        return this.f20318c.a() < 12000000 ? this.f20318c.b() != 0 ? i(bundle).i(f20315j, new sb.c() { // from class: i9.f0
            @Override // sb.c
            public final Object then(Task task) {
                return b.this.f(bundle, task);
            }
        }) : sb.m.e(new IOException("MISSING_INSTANCEID_SERVICE")) : b0.b(this.b).d(1, bundle).h(f20315j, new sb.c() { // from class: i9.d
            @Override // sb.c
            public final Object then(Task task) {
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            }
        });
    }

    @NonNull
    public Task<Void> d(boolean z10) {
        if (this.f20318c.a() < 241100000) {
            return sb.m.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z10);
        return b0.b(this.b).c(4, bundle);
    }

    public final /* synthetic */ Task f(Bundle bundle, Task task) {
        return (task.isSuccessful() && m((Bundle) task.getResult())) ? i(bundle).n(f20315j, new sb.j() { // from class: i9.d0
            @Override // sb.j
            public final Task then(Object obj) {
                return b.e((Bundle) obj);
            }
        }) : task;
    }

    public final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f20317a) {
            this.f20317a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public final Task i(Bundle bundle) {
        final String j10 = j();
        final sb.k kVar = new sb.k();
        synchronized (this.f20317a) {
            this.f20317a.put(j10, kVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f20318c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        k(this.b, intent);
        intent.putExtra("kid", "|ID|" + j10 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f20320e);
        if (this.f20321f != null || this.f20322g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f20321f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f20322g.f(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f20319d.schedule(new Runnable() { // from class: i9.f
                @Override // java.lang.Runnable
                public final void run() {
                    if (sb.k.this.d(new IOException(Payload.RESPONSE_TIMEOUT))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            kVar.a().c(f20315j, new OnCompleteListener() { // from class: i9.g
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    b.this.h(j10, schedule, task);
                }
            });
            return kVar.a();
        }
        if (this.f20318c.b() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f20319d.schedule(new Runnable() { // from class: i9.f
            @Override // java.lang.Runnable
            public final void run() {
                if (sb.k.this.d(new IOException(Payload.RESPONSE_TIMEOUT))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        kVar.a().c(f20315j, new OnCompleteListener() { // from class: i9.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                b.this.h(j10, schedule2, task);
            }
        });
        return kVar.a();
    }

    public final void l(String str, Bundle bundle) {
        synchronized (this.f20317a) {
            try {
                sb.k kVar = (sb.k) this.f20317a.remove(str);
                if (kVar != null) {
                    kVar.c(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
