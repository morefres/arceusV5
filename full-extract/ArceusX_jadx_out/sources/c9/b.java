package c9;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import d9.n;
import k9.e;
import n9.l;

@Deprecated
/* loaded from: classes.dex */
public class b extends k9.e<GoogleSignInOptions> {

    /* renamed from: k, reason: collision with root package name */
    public static final j f4799k = new j(null);

    /* renamed from: l, reason: collision with root package name */
    public static int f4800l = 1;

    public b(@NonNull Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, y8.a.b, googleSignInOptions, new e.a.C0395a().b(new l9.a()).a());
    }

    @NonNull
    public Task<Void> P() {
        return l.b(n.a(w(), G(), Q() == 3));
    }

    public final synchronized int Q() {
        int i10;
        try {
            i10 = f4800l;
            if (i10 == 1) {
                Context G = G();
                j9.c o8 = j9.c.o();
                int h10 = o8.h(G, j9.h.f21609a);
                if (h10 == 0) {
                    i10 = 4;
                    f4800l = 4;
                } else if (o8.b(G, h10, null) != null || DynamiteModule.a(G, "com.google.android.gms.auth.api.fallback") == 0) {
                    i10 = 2;
                    f4800l = 2;
                } else {
                    i10 = 3;
                    f4800l = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }

    @NonNull
    public Task<Void> r() {
        return l.b(n.b(w(), G(), Q() == 3));
    }
}
