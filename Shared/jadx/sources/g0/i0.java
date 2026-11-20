package g0;

/* loaded from: classes.dex */
public class i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final i0 f17905d = new b().b(1.0f).c(0.0f, 0.0f).d(1.0f, 1.0f).a();

    /* renamed from: a, reason: collision with root package name */
    public final float f17906a;
    public final x2.c<Float, Float> b;

    /* renamed from: c, reason: collision with root package name */
    public final x2.c<Float, Float> f17907c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public float f17908a;
        public x2.c<Float, Float> b;

        /* renamed from: c, reason: collision with root package name */
        public x2.c<Float, Float> f17909c;

        public b() {
            Float valueOf = Float.valueOf(1.0f);
            this.f17908a = 1.0f;
            Float valueOf2 = Float.valueOf(0.0f);
            this.b = x2.c.a(valueOf2, valueOf2);
            this.f17909c = x2.c.a(valueOf, valueOf);
        }

        public i0 a() {
            return new i0(this.f17908a, this.b, this.f17909c);
        }

        public b b(float f10) {
            this.f17908a = f10;
            return this;
        }

        public b c(float f10, float f11) {
            this.b = x2.c.a(Float.valueOf(f10), Float.valueOf(f11));
            return this;
        }

        public b d(float f10, float f11) {
            this.f17909c = x2.c.a(Float.valueOf(f10), Float.valueOf(f11));
            return this;
        }
    }

    public float a() {
        return this.f17906a;
    }

    public x2.c<Float, Float> b() {
        return this.b;
    }

    public x2.c<Float, Float> c() {
        return this.f17907c;
    }

    public i0(float f10, x2.c<Float, Float> cVar, x2.c<Float, Float> cVar2) {
        this.f17906a = f10;
        this.b = cVar;
        this.f17907c = cVar2;
    }
}
