package d9;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes.dex */
public final class u extends p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14453a;

    public u(Context context) {
        this.f14453a = context;
    }

    @Override // d9.q
    public final void E() {
        s2();
        b b = b.b(this.f14453a);
        GoogleSignInAccount c10 = b.c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f5675q;
        if (c10 != null) {
            googleSignInOptions = b.d();
        }
        c9.b a10 = com.google.android.gms.auth.api.signin.a.a(this.f14453a, googleSignInOptions);
        if (c10 != null) {
            a10.P();
        } else {
            a10.r();
        }
    }

    public final void s2() {
        if (u9.p.a(this.f14453a, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // d9.q
    public final void t() {
        s2();
        o.a(this.f14453a).b();
    }
}
