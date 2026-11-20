package nb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Objects;

/* loaded from: classes.dex */
public final class da implements Application.ActivityLifecycleCallbacks, ba {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qa f26157a;

    public da(qa qaVar) {
        Objects.requireNonNull(qaVar);
        this.f26157a = qaVar;
    }

    @Override // nb.ba
    public final void a(zzdf zzdfVar) {
        g7 g7Var = this.f26157a.f26328a;
        g7Var.I().x(zzdfVar);
        ld z10 = g7Var.z();
        g7 g7Var2 = z10.f26328a;
        g7Var2.b().t(new dd(z10, g7Var2.e().b()));
    }

    @Override // nb.ba
    public final void b(zzdf zzdfVar) {
        this.f26157a.f26328a.I().z(zzdfVar);
    }

    @Override // nb.ba
    public final void c(zzdf zzdfVar, Bundle bundle) {
        this.f26157a.f26328a.I().y(zzdfVar, bundle);
    }

    @Override // nb.ba
    public final void d(zzdf zzdfVar) {
        g7 g7Var = this.f26157a.f26328a;
        ld z10 = g7Var.z();
        g7 g7Var2 = z10.f26328a;
        g7Var2.b().t(new cd(z10, g7Var2.e().b()));
        g7Var.I().w(zzdfVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:13|(12:20|21|22|(1:24)(1:39)|25|26|27|28|29|30|31|32)|40|21|22|(0)(0)|25|26|27|28|29|30|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        r2.f26157a.f26328a.a().o().b("Throwable caught in onActivityCreated", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // nb.ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.android.gms.internal.measurement.zzdf r8, android.os.Bundle r9) {
        /*
            r7 = this;
            nb.qa r0 = r7.f26157a     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            nb.g7 r1 = r0.f26328a     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            nb.w5 r2 = r1.a()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            nb.u5 r2 = r2.w()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            java.lang.String r3 = "onActivityCreated"
            r2.a(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            android.content.Intent r2 = r8.f7027h     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r2 == 0) goto L4c
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r3 == 0) goto L2c
            boolean r4 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r4 != 0) goto L22
            goto L2c
        L22:
            r4 = r3
            goto L44
        L24:
            r0 = move-exception
            r2 = r7
            goto Lb6
        L28:
            r0 = move-exception
            r2 = r7
            goto La0
        L2c:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            r4 = 0
            if (r3 == 0) goto L44
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r5 != 0) goto L44
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            goto L22
        L44:
            if (r4 == 0) goto L4c
            boolean r3 = r4.isHierarchical()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r3 != 0) goto L4e
        L4c:
            r2 = r7
            goto L96
        L4e:
            r1.C()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            java.lang.String r0 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r2.getStringExtra(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            java.lang.String r2 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r2 != 0) goto L74
            java.lang.String r2 = "https://www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r2 != 0) goto L74
            java.lang.String r2 = "android-app://com.google.appcrawler"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r0 == 0) goto L70
            goto L74
        L70:
            java.lang.String r0 = "auto"
        L72:
            r5 = r0
            goto L77
        L74:
            java.lang.String r0 = "gs"
            goto L72
        L77:
            java.lang.String r0 = "referrer"
            java.lang.String r6 = r4.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r9 != 0) goto L82
            r0 = 1
        L80:
            r3 = r0
            goto L84
        L82:
            r0 = 0
            goto L80
        L84:
            nb.c7 r0 = r1.b()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            nb.ca r1 = new nb.ca     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L92 java.lang.RuntimeException -> L94
            r0.t(r1)     // Catch: java.lang.Throwable -> L92 java.lang.RuntimeException -> L94
            goto Lb1
        L92:
            r0 = move-exception
            goto Lb6
        L94:
            r0 = move-exception
            goto La0
        L96:
            nb.g7 r0 = r0.f26328a
        L98:
            nb.jb r0 = r0.I()
            r0.v(r8, r9)
            return
        La0:
            nb.qa r1 = r2.f26157a     // Catch: java.lang.Throwable -> L92
            nb.g7 r1 = r1.f26328a     // Catch: java.lang.Throwable -> L92
            nb.w5 r1 = r1.a()     // Catch: java.lang.Throwable -> L92
            nb.u5 r1 = r1.o()     // Catch: java.lang.Throwable -> L92
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r1.b(r3, r0)     // Catch: java.lang.Throwable -> L92
        Lb1:
            nb.qa r0 = r2.f26157a
            nb.g7 r0 = r0.f26328a
            goto L98
        Lb6:
            nb.qa r1 = r2.f26157a
            nb.g7 r1 = r1.f26328a
            nb.jb r1 = r1.I()
            r1.v(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.da.e(com.google.android.gms.internal.measurement.zzdf, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(zzdf.a(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b(zzdf.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(zzdf.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(zzdf.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c(zzdf.a(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
