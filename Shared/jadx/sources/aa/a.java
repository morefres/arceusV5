package aa;

import android.content.Context;
import androidx.annotation.NonNull;
import eb.c;
import k9.a;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public static final a.g f262a;

    @NonNull
    public static final k9.a b;

    /* renamed from: c, reason: collision with root package name */
    public static final eb.b f263c;

    static {
        a.g gVar = new a.g();
        f262a = gVar;
        b = new k9.a("Fido.U2F_ZERO_PARTY_API", new c(), gVar);
        f263c = new eb.b();
    }

    @NonNull
    public static ba.a a(@NonNull Context context) {
        return new ba.a(context);
    }
}
