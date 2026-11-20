package j9;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import k2.k;
import l9.p0;
import l9.q0;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {bb.d.class, bb.e.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public class c extends d {

    /* renamed from: c, reason: collision with root package name */
    public String f21595c;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f21593e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final c f21594f = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final int f21592d = d.f21604a;

    @NonNull
    public static c o() {
        return f21594f;
    }

    @NonNull
    public static final Task z(@NonNull k9.g gVar, @NonNull k9.g... gVarArr) {
        n9.m.m(gVar, "Requested API must not be null.");
        for (k9.g gVar2 : gVarArr) {
            n9.m.m(gVar2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(gVarArr.length + 1);
        arrayList.add(gVar);
        arrayList.addAll(Arrays.asList(gVarArr));
        return l9.f.u().x(arrayList);
    }

    @Override // j9.d
    public Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    @Override // j9.d
    public PendingIntent c(@NonNull Context context, int i10, int i11) {
        return super.c(context, i10, i11);
    }

    @Override // j9.d
    @NonNull
    public final String e(int i10) {
        return super.e(i10);
    }

    @Override // j9.d
    @ResultIgnorabilityUnspecified
    public int g(@NonNull Context context) {
        return super.g(context);
    }

    @Override // j9.d
    public int h(@NonNull Context context, int i10) {
        return super.h(context, i10);
    }

    @Override // j9.d
    public final boolean j(int i10) {
        return super.j(i10);
    }

    @NonNull
    public Task<Void> l(@NonNull k9.g<?> gVar, @NonNull k9.g<?>... gVarArr) {
        return z(gVar, gVarArr).o(new sb.j() { // from class: j9.m
            @Override // sb.j
            public final Task then(Object obj) {
                int i10 = c.f21592d;
                return sb.m.f(null);
            }
        });
    }

    public Dialog m(@NonNull Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return r(activity, i10, n9.a0.b(activity, b(activity, i10, rl.d.f30696a), i11), onCancelListener, null);
    }

    public PendingIntent n(@NonNull Context context, @NonNull ConnectionResult connectionResult) {
        return connectionResult.z3() ? connectionResult.y3() : c(context, connectionResult.w3(), 0);
    }

    @ResultIgnorabilityUnspecified
    public boolean p(@NonNull Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m10 = m(activity, i10, i11, onCancelListener);
        if (m10 == null) {
            return false;
        }
        u(activity, m10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void q(@NonNull Context context, int i10) {
        v(context, i10, null, d(context, i10, 0, "n"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Dialog r(@NonNull Context context, int i10, n9.a0 a0Var, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(n9.x.c(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String b = n9.x.b(context, i10);
        if (b != null) {
            if (a0Var == null) {
                a0Var = onClickListener;
            }
            builder.setPositiveButton(b, a0Var);
        }
        String f10 = n9.x.f(context, i10);
        if (f10 != null) {
            builder.setTitle(f10);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    @NonNull
    public final Dialog s(@NonNull Activity activity, @NonNull DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(n9.x.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        u(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @ResultIgnorabilityUnspecified
    public final q0 t(Context context, p0 p0Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        q0 q0Var = new q0(p0Var);
        bb.h.r(context, q0Var, intentFilter);
        q0Var.a(context);
        if (i(context, "com.google.android.gms")) {
            return q0Var;
        }
        p0Var.a();
        q0Var.b();
        return null;
    }

    public final void u(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof e4.q) {
                k.u2(dialog, onCancelListener).t2(((e4.q) activity).l1(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    public final void v(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            w(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e10 = n9.x.e(context, i10);
        String d10 = n9.x.d(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) n9.m.l(context.getSystemService("notification"));
        k.f B = new k.f(context).u(true).f(true).l(e10).B(new k.d().h(d10));
        if (u9.i.c(context)) {
            n9.m.p(u9.m.d());
            B.z(context.getApplicationInfo().icon).x(2);
            if (u9.i.d(context)) {
                B.a(h9.a.f19171a, resources.getString(h9.b.f19185o), pendingIntent);
            } else {
                B.j(pendingIntent);
            }
        } else {
            B.z(R.drawable.stat_sys_warning).C(resources.getString(h9.b.f19178h)).G(System.currentTimeMillis()).j(pendingIntent).k(d10);
        }
        if (u9.m.g()) {
            n9.m.p(u9.m.g());
            synchronized (f21593e) {
                str2 = this.f21595c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(h9.b.f19177g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            B.g(str2);
        }
        Notification c10 = B.c();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            h.b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, c10);
    }

    public final void w(Context context) {
        new n(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @ResultIgnorabilityUnspecified
    public final boolean x(@NonNull Activity activity, @NonNull l9.j jVar, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog r8 = r(activity, i10, n9.a0.c(jVar, b(activity, i10, rl.d.f30696a), 2), onCancelListener, null);
        if (r8 == null) {
            return false;
        }
        u(activity, r8, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean y(@NonNull Context context, @NonNull ConnectionResult connectionResult, int i10) {
        PendingIntent n10;
        if (w9.a.a(context) || (n10 = n(context, connectionResult)) == null) {
            return false;
        }
        v(context, connectionResult.w3(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, n10, i10, true), bb.i.f3947a | 134217728));
        return true;
    }
}
