package d9;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final q9.a f14449a = new q9.a("GoogleSignInCommon", new String[0]);

    public static k9.i a(k9.f fVar, Context context, boolean z10) {
        f14449a.a("Revoking access", new Object[0]);
        String e10 = b.b(context).e();
        c(context);
        return z10 ? e.a(e10) : fVar.a(new l(fVar));
    }

    public static k9.i b(k9.f fVar, Context context, boolean z10) {
        f14449a.a("Signing out", new Object[0]);
        c(context);
        return z10 ? k9.j.b(Status.f5766k, fVar) : fVar.a(new j(fVar));
    }

    public static void c(Context context) {
        o.a(context).b();
        Iterator<k9.f> it = k9.f.b().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        l9.f.a();
    }
}
