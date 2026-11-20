package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import b6.b;
import b6.i;
import b6.l;
import b6.m;
import f6.WorkGenerationalId;
import f6.j0;
import f6.o1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import ju.d2;
import x5.k;
import x5.w;
import y5.e;
import y5.f1;

/* loaded from: classes.dex */
public class a implements i, e {

    /* renamed from: k, reason: collision with root package name */
    public static final String f3336k = w.i("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public Context f3337a;
    public f1 b;

    /* renamed from: c, reason: collision with root package name */
    public final h6.b f3338c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3339d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public WorkGenerationalId f3340e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<WorkGenerationalId, k> f3341f;

    /* renamed from: g, reason: collision with root package name */
    public final Map<WorkGenerationalId, j0> f3342g;

    /* renamed from: h, reason: collision with root package name */
    public final Map<WorkGenerationalId, d2> f3343h;

    /* renamed from: i, reason: collision with root package name */
    public final l f3344i;

    /* renamed from: j, reason: collision with root package name */
    public b f3345j;

    /* renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    public class RunnableC0065a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f3346a;

        public RunnableC0065a(String str) {
            this.f3346a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            j0 g10 = a.this.b.r().g(this.f3346a);
            if (g10 == null || !g10.m()) {
                return;
            }
            synchronized (a.this.f3339d) {
                a.this.f3342g.put(o1.a(g10), g10);
                a aVar = a.this;
                a.this.f3343h.put(o1.a(g10), m.e(aVar.f3344i, g10, aVar.f3338c.b(), a.this));
            }
        }
    }

    public interface b {
        void b(int i10, Notification notification);

        void c(int i10);

        void d(int i10, int i11, Notification notification);

        void e(int i10);
    }

    public a(Context context) {
        this.f3337a = context;
        f1 p8 = f1.p(context);
        this.b = p8;
        this.f3338c = p8.v();
        this.f3340e = null;
        this.f3341f = new LinkedHashMap();
        this.f3343h = new HashMap();
        this.f3342g = new HashMap();
        this.f3344i = new l(this.b.t());
        this.b.r().e(this);
    }

    public static Intent c(Context context, WorkGenerationalId workGenerationalId, k kVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", kVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", kVar.a());
        intent.putExtra("KEY_NOTIFICATION", kVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        return intent;
    }

    public static Intent f(Context context, WorkGenerationalId workGenerationalId, k kVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        intent.putExtra("KEY_NOTIFICATION_ID", kVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", kVar.a());
        intent.putExtra("KEY_NOTIFICATION", kVar.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // y5.e
    public void d(WorkGenerationalId workGenerationalId, boolean z10) {
        Map.Entry<WorkGenerationalId, k> entry;
        synchronized (this.f3339d) {
            try {
                d2 remove = this.f3342g.remove(workGenerationalId) != null ? this.f3343h.remove(workGenerationalId) : null;
                if (remove != null) {
                    remove.c(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k remove2 = this.f3341f.remove(workGenerationalId);
        if (workGenerationalId.equals(this.f3340e)) {
            if (this.f3341f.size() > 0) {
                Iterator<Map.Entry<WorkGenerationalId, k>> it = this.f3341f.entrySet().iterator();
                Map.Entry<WorkGenerationalId, k> next = it.next();
                while (true) {
                    entry = next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f3340e = entry.getKey();
                if (this.f3345j != null) {
                    k value = entry.getValue();
                    this.f3345j.d(value.c(), value.a(), value.b());
                    this.f3345j.e(value.c());
                }
            } else {
                this.f3340e = null;
            }
        }
        b bVar = this.f3345j;
        if (remove2 == null || bVar == null) {
            return;
        }
        w.e().a(f3336k, "Removing Notification (id: " + remove2.c() + ", workSpecId: " + workGenerationalId + ", notificationType: " + remove2.a());
        bVar.e(remove2.c());
    }

    @Override // b6.i
    public void e(j0 j0Var, b6.b bVar) {
        if (bVar instanceof b.ConstraintsNotMet) {
            String str = j0Var.id;
            w.e().a(f3336k, "Constraints unmet for WorkSpec " + str);
            this.b.z(o1.a(j0Var), ((b.ConstraintsNotMet) bVar).getReason());
        }
    }

    public final void h(Intent intent) {
        w.e().f(f3336k, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.b.k(UUID.fromString(stringExtra));
    }

    public final void i(Intent intent) {
        if (this.f3345j == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        WorkGenerationalId workGenerationalId = new WorkGenerationalId(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        w.e().a(f3336k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        k kVar = new k(intExtra, notification, intExtra2);
        this.f3341f.put(workGenerationalId, kVar);
        k kVar2 = this.f3341f.get(this.f3340e);
        if (kVar2 == null) {
            this.f3340e = workGenerationalId;
        } else {
            this.f3345j.b(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator<Map.Entry<WorkGenerationalId, k>> it = this.f3341f.entrySet().iterator();
                while (it.hasNext()) {
                    i10 |= it.next().getValue().a();
                }
                kVar = new k(kVar2.c(), kVar2.b(), i10);
            } else {
                kVar = kVar2;
            }
        }
        this.f3345j.d(kVar.c(), kVar.a(), kVar.b());
    }

    public final void j(Intent intent) {
        w.e().f(f3336k, "Started foreground service " + intent);
        this.f3338c.d(new RunnableC0065a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    public void k(Intent intent, int i10) {
        w.e().f(f3336k, "Stopping foreground service");
        b bVar = this.f3345j;
        if (bVar != null) {
            bVar.c(i10);
        }
    }

    public void l() {
        this.f3345j = null;
        synchronized (this.f3339d) {
            try {
                Iterator<d2> it = this.f3343h.values().iterator();
                while (it.hasNext()) {
                    it.next().c(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.b.r().m(this);
    }

    public void m(Intent intent, int i10) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent, i10);
        }
    }

    public void n(int i10, int i11) {
        w.e().f(f3336k, "Foreground service timed out, FGS type: " + i11);
        for (Map.Entry<WorkGenerationalId, k> entry : this.f3341f.entrySet()) {
            if (entry.getValue().a() == i11) {
                this.b.z(entry.getKey(), -128);
            }
        }
        b bVar = this.f3345j;
        if (bVar != null) {
            bVar.c(i10);
        }
    }

    public void o(b bVar) {
        if (this.f3345j != null) {
            w.e().c(f3336k, "A callback already exists.");
        } else {
            this.f3345j = bVar;
        }
    }
}
