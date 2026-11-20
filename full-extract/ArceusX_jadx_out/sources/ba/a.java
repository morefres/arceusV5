package ba;

import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.tasks.Task;
import eb.s4;
import eb.t4;
import eb.w4;
import k9.a;
import k9.e;
import l9.q;
import l9.u;
import sb.k;

/* loaded from: classes.dex */
public class a extends e<a.d.c> {

    /* renamed from: k, reason: collision with root package name */
    public static final a.g f3920k;

    /* renamed from: l, reason: collision with root package name */
    public static final k9.a f3921l;

    static {
        a.g gVar = new a.g();
        f3920k = gVar;
        f3921l = new k9.a("Fido.FIDO2_API", new s4(), gVar);
    }

    @Deprecated
    public a(@NonNull Context context) {
        super(context, (k9.a<a.d.c>) f3921l, a.d.Ko, new l9.a());
    }

    @NonNull
    public Task<PendingIntent> P(@NonNull final PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        return z(u.c().b(new q() { // from class: ba.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((w4) ((t4) obj).getService()).t2(new c(a.this, (k) obj2), publicKeyCredentialCreationOptions);
            }
        }).e(5407).a());
    }
}
