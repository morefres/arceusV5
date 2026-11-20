package d9;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static o f14450d;

    /* renamed from: a, reason: collision with root package name */
    public final b f14451a;
    public GoogleSignInAccount b;

    /* renamed from: c, reason: collision with root package name */
    public GoogleSignInOptions f14452c;

    public o(Context context) {
        b b = b.b(context);
        this.f14451a = b;
        this.b = b.c();
        this.f14452c = b.d();
    }

    public static synchronized o a(@NonNull Context context) {
        o d10;
        synchronized (o.class) {
            d10 = d(context.getApplicationContext());
        }
        return d10;
    }

    public static synchronized o d(Context context) {
        synchronized (o.class) {
            o oVar = f14450d;
            if (oVar != null) {
                return oVar;
            }
            o oVar2 = new o(context);
            f14450d = oVar2;
            return oVar2;
        }
    }

    public final synchronized void b() {
        this.f14451a.a();
        this.b = null;
        this.f14452c = null;
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f14451a.f(googleSignInAccount, googleSignInOptions);
        this.b = googleSignInAccount;
        this.f14452c = googleSignInOptions;
    }
}
