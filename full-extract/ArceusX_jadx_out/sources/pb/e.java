package pb;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;
import k9.a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final a.g f28536a;
    public static final a.g b;

    /* renamed from: c, reason: collision with root package name */
    public static final a.AbstractC0393a f28537c;

    /* renamed from: d, reason: collision with root package name */
    public static final a.AbstractC0393a f28538d;

    /* renamed from: e, reason: collision with root package name */
    public static final Scope f28539e;

    /* renamed from: f, reason: collision with root package name */
    public static final Scope f28540f;

    /* renamed from: g, reason: collision with root package name */
    public static final k9.a f28541g;

    /* renamed from: h, reason: collision with root package name */
    public static final k9.a f28542h;

    static {
        a.g gVar = new a.g();
        f28536a = gVar;
        a.g gVar2 = new a.g();
        b = gVar2;
        b bVar = new b();
        f28537c = bVar;
        c cVar = new c();
        f28538d = cVar;
        f28539e = new Scope("profile");
        f28540f = new Scope(NotificationCompat.CATEGORY_EMAIL);
        f28541g = new k9.a("SignIn.API", bVar, gVar);
        f28542h = new k9.a("SignIn.INTERNAL_API", cVar, gVar2);
    }
}
