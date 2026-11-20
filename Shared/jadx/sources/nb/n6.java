package nb;

import com.roblox.client.personasdk.BuildConfig;

/* loaded from: classes.dex */
public final class n6 {

    /* renamed from: a, reason: collision with root package name */
    public final g7 f26489a;

    public n6(me meVar) {
        this.f26489a = meVar.g0();
    }

    public final boolean a() {
        try {
            g7 g7Var = this.f26489a;
            w9.b a10 = w9.c.a(g7Var.d());
            if (a10 != null) {
                return a10.e(BuildConfig.STORE_PACKAGE, 128).versionCode >= 80837300;
            }
            g7Var.a().w().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f26489a.a().w().b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
