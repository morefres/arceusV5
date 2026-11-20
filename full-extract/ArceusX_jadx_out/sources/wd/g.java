package wd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.roblox.client.personasdk.BuildConfig;
import sb.k;
import sb.m;
import xd.i;
import xd.t;
import xd.w;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final i f34191c = new i("ReviewService");

    /* renamed from: a, reason: collision with root package name */
    public t f34192a;
    public final String b;

    /* JADX WARN: Type inference failed for: r7v0, types: [wd.d] */
    public g(Context context) {
        this.b = context.getPackageName();
        if (w.a(context)) {
            this.f34192a = new t(context, f34191c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage(BuildConfig.STORE_PACKAGE), new Object() { // from class: wd.d
            }, null);
        }
    }

    public final Task a() {
        String str = this.b;
        i iVar = f34191c;
        iVar.c("requestInAppReview (%s)", str);
        if (this.f34192a == null) {
            iVar.a("Play Store app is either not installed or not the official version", new Object[0]);
            return m.e(new a(-1));
        }
        k kVar = new k();
        this.f34192a.s(new e(this, kVar, kVar), kVar);
        return kVar.a();
    }
}
