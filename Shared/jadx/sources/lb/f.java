package lb;

import android.content.Context;
import androidx.annotation.NonNull;
import k9.a;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public static final k9.a<a.d.c> f23410a;

    @NonNull
    @Deprecated
    public static final a b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final c f23411c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final h f23412d;

    /* renamed from: e, reason: collision with root package name */
    public static final a.g<hb.n> f23413e;

    /* renamed from: f, reason: collision with root package name */
    public static final a.AbstractC0393a<hb.n, a.d.c> f23414f;

    static {
        a.g<hb.n> gVar = new a.g<>();
        f23413e = gVar;
        v vVar = new v();
        f23414f = vVar;
        f23410a = new k9.a<>("LocationServices.API", vVar, gVar);
        b = new hb.y();
        f23411c = new hb.b();
        f23412d = new hb.s();
    }

    @NonNull
    public static b a(@NonNull Context context) {
        return new b(context);
    }

    @NonNull
    public static i b(@NonNull Context context) {
        return new i(context);
    }
}
