package hd;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: m, reason: collision with root package name */
    public static final hd.c f19280m = new i(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public d f19281a;
    public d b;

    /* renamed from: c, reason: collision with root package name */
    public d f19282c;

    /* renamed from: d, reason: collision with root package name */
    public d f19283d;

    /* renamed from: e, reason: collision with root package name */
    public hd.c f19284e;

    /* renamed from: f, reason: collision with root package name */
    public hd.c f19285f;

    /* renamed from: g, reason: collision with root package name */
    public hd.c f19286g;

    /* renamed from: h, reason: collision with root package name */
    public hd.c f19287h;

    /* renamed from: i, reason: collision with root package name */
    public f f19288i;

    /* renamed from: j, reason: collision with root package name */
    public f f19289j;

    /* renamed from: k, reason: collision with root package name */
    public f f19290k;

    /* renamed from: l, reason: collision with root package name */
    public f f19291l;

    public interface c {
        @NonNull
        hd.c a(@NonNull hd.c cVar);
    }

    @NonNull
    public static b a() {
        return new b();
    }

    @NonNull
    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    @NonNull
    public static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new hd.a(i12));
    }

    @NonNull
    public static b d(Context context, int i10, int i11, @NonNull hd.c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ic.k.f20654i5);
        try {
            int i12 = obtainStyledAttributes.getInt(ic.k.f20663j5, 0);
            int i13 = obtainStyledAttributes.getInt(ic.k.f20690m5, i12);
            int i14 = obtainStyledAttributes.getInt(ic.k.f20699n5, i12);
            int i15 = obtainStyledAttributes.getInt(ic.k.f20681l5, i12);
            int i16 = obtainStyledAttributes.getInt(ic.k.f20672k5, i12);
            hd.c m10 = m(obtainStyledAttributes, ic.k.f20708o5, cVar);
            hd.c m11 = m(obtainStyledAttributes, ic.k.f20735r5, m10);
            hd.c m12 = m(obtainStyledAttributes, ic.k.f20744s5, m10);
            hd.c m13 = m(obtainStyledAttributes, ic.k.f20726q5, m10);
            return new b().y(i13, m11).C(i14, m12).u(i15, m13).q(i16, m(obtainStyledAttributes, ic.k.f20717p5, m10));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static b e(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    @NonNull
    public static b f(@NonNull Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new hd.a(i12));
    }

    @NonNull
    public static b g(@NonNull Context context, AttributeSet attributeSet, int i10, int i11, @NonNull hd.c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ic.k.f20626f4, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(ic.k.f20635g4, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(ic.k.f20644h4, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    @NonNull
    public static hd.c m(TypedArray typedArray, int i10, @NonNull hd.c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue != null) {
            int i11 = peekValue.type;
            if (i11 == 5) {
                return new hd.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new i(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    @NonNull
    public f h() {
        return this.f19290k;
    }

    @NonNull
    public d i() {
        return this.f19283d;
    }

    @NonNull
    public hd.c j() {
        return this.f19287h;
    }

    @NonNull
    public d k() {
        return this.f19282c;
    }

    @NonNull
    public hd.c l() {
        return this.f19286g;
    }

    @NonNull
    public f n() {
        return this.f19291l;
    }

    @NonNull
    public f o() {
        return this.f19289j;
    }

    @NonNull
    public f p() {
        return this.f19288i;
    }

    @NonNull
    public d q() {
        return this.f19281a;
    }

    @NonNull
    public hd.c r() {
        return this.f19284e;
    }

    @NonNull
    public d s() {
        return this.b;
    }

    @NonNull
    public hd.c t() {
        return this.f19285f;
    }

    public boolean u(@NonNull RectF rectF) {
        boolean z10 = this.f19291l.getClass().equals(f.class) && this.f19289j.getClass().equals(f.class) && this.f19288i.getClass().equals(f.class) && this.f19290k.getClass().equals(f.class);
        float a10 = this.f19284e.a(rectF);
        return z10 && ((this.f19285f.a(rectF) > a10 ? 1 : (this.f19285f.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f19287h.a(rectF) > a10 ? 1 : (this.f19287h.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f19286g.a(rectF) > a10 ? 1 : (this.f19286g.a(rectF) == a10 ? 0 : -1)) == 0) && ((this.b instanceof j) && (this.f19281a instanceof j) && (this.f19282c instanceof j) && (this.f19283d instanceof j));
    }

    @NonNull
    public b v() {
        return new b(this);
    }

    @NonNull
    public k w(float f10) {
        return v().o(f10).m();
    }

    @NonNull
    public k x(@NonNull hd.c cVar) {
        return v().p(cVar).m();
    }

    @NonNull
    public k y(@NonNull c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    public k(@NonNull b bVar) {
        this.f19281a = bVar.f19292a;
        this.b = bVar.b;
        this.f19282c = bVar.f19293c;
        this.f19283d = bVar.f19294d;
        this.f19284e = bVar.f19295e;
        this.f19285f = bVar.f19296f;
        this.f19286g = bVar.f19297g;
        this.f19287h = bVar.f19298h;
        this.f19288i = bVar.f19299i;
        this.f19289j = bVar.f19300j;
        this.f19290k = bVar.f19301k;
        this.f19291l = bVar.f19302l;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public d f19292a;

        @NonNull
        public d b;

        /* renamed from: c, reason: collision with root package name */
        @NonNull
        public d f19293c;

        /* renamed from: d, reason: collision with root package name */
        @NonNull
        public d f19294d;

        /* renamed from: e, reason: collision with root package name */
        @NonNull
        public hd.c f19295e;

        /* renamed from: f, reason: collision with root package name */
        @NonNull
        public hd.c f19296f;

        /* renamed from: g, reason: collision with root package name */
        @NonNull
        public hd.c f19297g;

        /* renamed from: h, reason: collision with root package name */
        @NonNull
        public hd.c f19298h;

        /* renamed from: i, reason: collision with root package name */
        @NonNull
        public f f19299i;

        /* renamed from: j, reason: collision with root package name */
        @NonNull
        public f f19300j;

        /* renamed from: k, reason: collision with root package name */
        @NonNull
        public f f19301k;

        /* renamed from: l, reason: collision with root package name */
        @NonNull
        public f f19302l;

        public b() {
            this.f19292a = h.b();
            this.b = h.b();
            this.f19293c = h.b();
            this.f19294d = h.b();
            this.f19295e = new hd.a(0.0f);
            this.f19296f = new hd.a(0.0f);
            this.f19297g = new hd.a(0.0f);
            this.f19298h = new hd.a(0.0f);
            this.f19299i = h.c();
            this.f19300j = h.c();
            this.f19301k = h.c();
            this.f19302l = h.c();
        }

        public static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f19279a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f19230a;
            }
            return -1.0f;
        }

        @NonNull
        public b A(float f10) {
            this.f19295e = new hd.a(f10);
            return this;
        }

        @NonNull
        public b B(@NonNull hd.c cVar) {
            this.f19295e = cVar;
            return this;
        }

        @NonNull
        public b C(int i10, @NonNull hd.c cVar) {
            return D(h.a(i10)).F(cVar);
        }

        @NonNull
        public b D(@NonNull d dVar) {
            this.b = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                E(n10);
            }
            return this;
        }

        @NonNull
        public b E(float f10) {
            this.f19296f = new hd.a(f10);
            return this;
        }

        @NonNull
        public b F(@NonNull hd.c cVar) {
            this.f19296f = cVar;
            return this;
        }

        @NonNull
        public k m() {
            return new k(this);
        }

        @NonNull
        public b o(float f10) {
            return A(f10).E(f10).w(f10).s(f10);
        }

        @NonNull
        public b p(@NonNull hd.c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        @NonNull
        public b q(int i10, @NonNull hd.c cVar) {
            return r(h.a(i10)).t(cVar);
        }

        @NonNull
        public b r(@NonNull d dVar) {
            this.f19294d = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                s(n10);
            }
            return this;
        }

        @NonNull
        public b s(float f10) {
            this.f19298h = new hd.a(f10);
            return this;
        }

        @NonNull
        public b t(@NonNull hd.c cVar) {
            this.f19298h = cVar;
            return this;
        }

        @NonNull
        public b u(int i10, @NonNull hd.c cVar) {
            return v(h.a(i10)).x(cVar);
        }

        @NonNull
        public b v(@NonNull d dVar) {
            this.f19293c = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                w(n10);
            }
            return this;
        }

        @NonNull
        public b w(float f10) {
            this.f19297g = new hd.a(f10);
            return this;
        }

        @NonNull
        public b x(@NonNull hd.c cVar) {
            this.f19297g = cVar;
            return this;
        }

        @NonNull
        public b y(int i10, @NonNull hd.c cVar) {
            return z(h.a(i10)).B(cVar);
        }

        @NonNull
        public b z(@NonNull d dVar) {
            this.f19292a = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                A(n10);
            }
            return this;
        }

        public b(@NonNull k kVar) {
            this.f19292a = h.b();
            this.b = h.b();
            this.f19293c = h.b();
            this.f19294d = h.b();
            this.f19295e = new hd.a(0.0f);
            this.f19296f = new hd.a(0.0f);
            this.f19297g = new hd.a(0.0f);
            this.f19298h = new hd.a(0.0f);
            this.f19299i = h.c();
            this.f19300j = h.c();
            this.f19301k = h.c();
            this.f19302l = h.c();
            this.f19292a = kVar.f19281a;
            this.b = kVar.b;
            this.f19293c = kVar.f19282c;
            this.f19294d = kVar.f19283d;
            this.f19295e = kVar.f19284e;
            this.f19296f = kVar.f19285f;
            this.f19297g = kVar.f19286g;
            this.f19298h = kVar.f19287h;
            this.f19299i = kVar.f19288i;
            this.f19300j = kVar.f19289j;
            this.f19301k = kVar.f19290k;
            this.f19302l = kVar.f19291l;
        }
    }

    public k() {
        this.f19281a = h.b();
        this.b = h.b();
        this.f19282c = h.b();
        this.f19283d = h.b();
        this.f19284e = new hd.a(0.0f);
        this.f19285f = new hd.a(0.0f);
        this.f19286g = new hd.a(0.0f);
        this.f19287h = new hd.a(0.0f);
        this.f19288i = h.c();
        this.f19289j = h.c();
        this.f19290k = h.c();
        this.f19291l = h.c();
    }
}
