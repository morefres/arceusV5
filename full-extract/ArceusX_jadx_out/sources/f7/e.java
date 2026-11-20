package f7;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f16906a = false;
    public static boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f16907c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f16908d = true;

    /* renamed from: f, reason: collision with root package name */
    public static p7.f f16910f;

    /* renamed from: g, reason: collision with root package name */
    public static p7.e f16911g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile p7.h f16912h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile p7.g f16913i;

    /* renamed from: j, reason: collision with root package name */
    public static ThreadLocal<s7.g> f16914j;

    /* renamed from: e, reason: collision with root package name */
    public static a f16909e = a.AUTOMATIC;

    /* renamed from: k, reason: collision with root package name */
    public static j7.b f16915k = new j7.c();

    public static /* synthetic */ File a(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static void b(String str) {
        if (b) {
            g().a(str);
        }
    }

    public static float c(String str) {
        if (b) {
            return g().b(str);
        }
        return 0.0f;
    }

    public static a d() {
        return f16909e;
    }

    public static boolean e() {
        return f16908d;
    }

    public static j7.b f() {
        return f16915k;
    }

    public static s7.g g() {
        s7.g gVar = f16914j.get();
        if (gVar != null) {
            return gVar;
        }
        s7.g gVar2 = new s7.g();
        f16914j.set(gVar2);
        return gVar2;
    }

    public static boolean h() {
        return b;
    }

    public static p7.g i(@NonNull Context context) {
        p7.g gVar;
        if (!f16907c) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        p7.g gVar2 = f16913i;
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (p7.g.class) {
            try {
                gVar = f16913i;
                if (gVar == null) {
                    p7.e eVar = f16911g;
                    if (eVar == null) {
                        eVar = new p7.e() { // from class: f7.d
                            @Override // p7.e
                            public final File a() {
                                return e.a(applicationContext);
                            }
                        };
                    }
                    gVar = new p7.g(eVar);
                    f16913i = gVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @NonNull
    public static p7.h j(@NonNull Context context) {
        p7.h hVar;
        p7.h hVar2 = f16912h;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (p7.h.class) {
            try {
                hVar = f16912h;
                if (hVar == null) {
                    p7.g i10 = i(context);
                    p7.f fVar = f16910f;
                    if (fVar == null) {
                        fVar = new p7.b();
                    }
                    hVar = new p7.h(i10, fVar);
                    f16912h = hVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
