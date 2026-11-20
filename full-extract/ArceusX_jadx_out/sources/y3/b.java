package y3;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.o0;
import java.util.ArrayList;
import y3.a;
import y3.b;

/* loaded from: classes.dex */
public abstract class b<T extends b<T>> implements a.b {

    /* renamed from: m, reason: collision with root package name */
    public static final s f36307m = new g("translationX");

    /* renamed from: n, reason: collision with root package name */
    public static final s f36308n = new h("translationY");

    /* renamed from: o, reason: collision with root package name */
    public static final s f36309o = new i("translationZ");

    /* renamed from: p, reason: collision with root package name */
    public static final s f36310p = new j("scaleX");

    /* renamed from: q, reason: collision with root package name */
    public static final s f36311q = new k("scaleY");

    /* renamed from: r, reason: collision with root package name */
    public static final s f36312r = new l("rotation");

    /* renamed from: s, reason: collision with root package name */
    public static final s f36313s = new m("rotationX");

    /* renamed from: t, reason: collision with root package name */
    public static final s f36314t = new n("rotationY");

    /* renamed from: u, reason: collision with root package name */
    public static final s f36315u = new o("x");

    /* renamed from: v, reason: collision with root package name */
    public static final s f36316v = new a("y");

    /* renamed from: w, reason: collision with root package name */
    public static final s f36317w = new C0672b("z");

    /* renamed from: x, reason: collision with root package name */
    public static final s f36318x = new c("alpha");

    /* renamed from: y, reason: collision with root package name */
    public static final s f36319y = new d("scrollX");

    /* renamed from: z, reason: collision with root package name */
    public static final s f36320z = new e("scrollY");

    /* renamed from: a, reason: collision with root package name */
    public float f36321a;
    public float b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f36322c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f36323d;

    /* renamed from: e, reason: collision with root package name */
    public final y3.c f36324e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f36325f;

    /* renamed from: g, reason: collision with root package name */
    public float f36326g;

    /* renamed from: h, reason: collision with root package name */
    public float f36327h;

    /* renamed from: i, reason: collision with root package name */
    public long f36328i;

    /* renamed from: j, reason: collision with root package name */
    public float f36329j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList<q> f36330k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList<r> f36331l;

    public static class a extends s {
        public a(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // y3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setY(f10);
        }
    }

    /* renamed from: y3.b$b, reason: collision with other inner class name */
    public static class C0672b extends s {
        public C0672b(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return o0.L(view);
        }

        @Override // y3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            o0.I0(view, f10);
        }
    }

    public static class c extends s {
        public c(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // y3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    public static class d extends s {
        public d(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // y3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    public static class e extends s {
        public e(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // y3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    public class f extends y3.c {
        public final /* synthetic */ y3.d b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, y3.d dVar) {
            super(str);
            this.b = dVar;
        }

        @Override // y3.c
        public float a(Object obj) {
            return this.b.a();
        }

        @Override // y3.c
        public void b(Object obj, float f10) {
            this.b.b(f10);
        }
    }

    public static class g extends s {
        public g(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // y3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    public static class h extends s {
        public h(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // y3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    public static class i extends s {
        public i(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return o0.I(view);
        }

        @Override // y3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            o0.G0(view, f10);
        }
    }

    public static class j extends s {
        public j(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // y3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    public static class k extends s {
        public k(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // y3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    public static class l extends s {
        public l(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // y3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotation(f10);
        }
    }

    public static class m extends s {
        public m(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // y3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    public static class n extends s {
        public n(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // y3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    public static class o extends s {
        public o(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // y3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setX(f10);
        }
    }

    public static class p {

        /* renamed from: a, reason: collision with root package name */
        public float f36333a;
        public float b;
    }

    public interface q {
        void a(b bVar, boolean z10, float f10, float f11);
    }

    public interface r {
        void e(b bVar, float f10, float f11);
    }

    public static abstract class s extends y3.c<View> {
        public /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        public s(String str) {
            super(str);
        }
    }

    public b(y3.d dVar) {
        this.f36321a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.f36322c = false;
        this.f36325f = false;
        this.f36326g = Float.MAX_VALUE;
        this.f36327h = -Float.MAX_VALUE;
        this.f36328i = 0L;
        this.f36330k = new ArrayList<>();
        this.f36331l = new ArrayList<>();
        this.f36323d = null;
        this.f36324e = new f("FloatValueHolder", dVar);
        this.f36329j = 1.0f;
    }

    public static <T> void h(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // y3.a.b
    public boolean a(long j10) {
        long j11 = this.f36328i;
        if (j11 == 0) {
            this.f36328i = j10;
            l(this.b);
            return false;
        }
        this.f36328i = j10;
        boolean r8 = r(j10 - j11);
        float min = Math.min(this.b, this.f36326g);
        this.b = min;
        float max = Math.max(min, this.f36327h);
        this.b = max;
        l(max);
        if (r8) {
            d(false);
        }
        return r8;
    }

    public T b(q qVar) {
        if (!this.f36330k.contains(qVar)) {
            this.f36330k.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (g()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f36331l.contains(rVar)) {
            this.f36331l.add(rVar);
        }
        return this;
    }

    public final void d(boolean z10) {
        this.f36325f = false;
        y3.a.d().g(this);
        this.f36328i = 0L;
        this.f36322c = false;
        for (int i10 = 0; i10 < this.f36330k.size(); i10++) {
            if (this.f36330k.get(i10) != null) {
                this.f36330k.get(i10).a(this, z10, this.b, this.f36321a);
            }
        }
        h(this.f36330k);
    }

    public final float e() {
        return this.f36324e.a(this.f36323d);
    }

    public float f() {
        return this.f36329j * 0.75f;
    }

    public boolean g() {
        return this.f36325f;
    }

    public T i(float f10) {
        this.f36326g = f10;
        return this;
    }

    public T j(float f10) {
        this.f36327h = f10;
        return this;
    }

    public T k(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f36329j = f10;
        o(f10 * 0.75f);
        return this;
    }

    public void l(float f10) {
        this.f36324e.b(this.f36323d, f10);
        for (int i10 = 0; i10 < this.f36331l.size(); i10++) {
            if (this.f36331l.get(i10) != null) {
                this.f36331l.get(i10).e(this, this.b, this.f36321a);
            }
        }
        h(this.f36331l);
    }

    public T m(float f10) {
        this.b = f10;
        this.f36322c = true;
        return this;
    }

    public T n(float f10) {
        this.f36321a = f10;
        return this;
    }

    public abstract void o(float f10);

    public void p() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f36325f) {
            return;
        }
        q();
    }

    public final void q() {
        if (this.f36325f) {
            return;
        }
        this.f36325f = true;
        if (!this.f36322c) {
            this.b = e();
        }
        float f10 = this.b;
        if (f10 > this.f36326g || f10 < this.f36327h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        y3.a.d().a(this, 0L);
    }

    public abstract boolean r(long j10);

    public <K> b(K k10, y3.c<K> cVar) {
        this.f36321a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.f36322c = false;
        this.f36325f = false;
        this.f36326g = Float.MAX_VALUE;
        this.f36327h = -Float.MAX_VALUE;
        this.f36328i = 0L;
        this.f36330k = new ArrayList<>();
        this.f36331l = new ArrayList<>();
        this.f36323d = k10;
        this.f36324e = cVar;
        if (cVar != f36312r && cVar != f36313s && cVar != f36314t) {
            if (cVar == f36318x) {
                this.f36329j = 0.00390625f;
                return;
            } else if (cVar != f36310p && cVar != f36311q) {
                this.f36329j = 1.0f;
                return;
            } else {
                this.f36329j = 0.00390625f;
                return;
            }
        }
        this.f36329j = 0.1f;
    }
}
