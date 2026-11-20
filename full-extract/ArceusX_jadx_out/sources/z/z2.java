package z;

import g0.w;
import java.util.Objects;
import n0.p0;

/* loaded from: classes.dex */
public class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final n0.g1 f37593a;
    public final android.view.d0<g0.w> b;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37594a;

        static {
            int[] iArr = new int[p0.a.values().length];
            f37594a = iArr;
            try {
                iArr[p0.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37594a[p0.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37594a[p0.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37594a[p0.a.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37594a[p0.a.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37594a[p0.a.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37594a[p0.a.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37594a[p0.a.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public z2(n0.g1 g1Var) {
        this.f37593a = g1Var;
        android.view.d0<g0.w> d0Var = new android.view.d0<>();
        this.b = d0Var;
        d0Var.m(g0.w.a(w.b.CLOSED));
    }

    public android.view.a0<g0.w> a() {
        return this.b;
    }

    public final g0.w b() {
        return this.f37593a.c() ? g0.w.a(w.b.OPENING) : g0.w.a(w.b.PENDING_OPEN);
    }

    public void c(p0.a aVar, w.a aVar2) {
        g0.w b;
        if (aVar2 == null || aVar2.d() != 8) {
            switch (a.f37594a[aVar.ordinal()]) {
                case 1:
                    b = b();
                    break;
                case 2:
                    b = g0.w.b(w.b.OPENING, aVar2);
                    break;
                case 3:
                case 4:
                    b = g0.w.b(w.b.OPEN, aVar2);
                    break;
                case 5:
                case 6:
                    b = g0.w.b(w.b.CLOSING, aVar2);
                    break;
                case 7:
                case 8:
                    b = g0.w.b(w.b.CLOSED, aVar2);
                    break;
                default:
                    throw new IllegalStateException("Unknown internal camera state: " + aVar);
            }
        } else {
            b = g0.w.b(w.b.CLOSED, aVar2);
        }
        g0.r1.a("CameraStateMachine", "New public camera state " + b + " from " + aVar + " and " + aVar2);
        if (Objects.equals(this.b.f(), b)) {
            return;
        }
        g0.r1.a("CameraStateMachine", "Publishing new public camera state " + b);
        this.b.m(b);
    }
}
