package dd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import dd.h;

/* loaded from: classes2.dex */
public final class d extends i<ObjectAnimator> {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f14510k = {0, 1350, 2700, 4050};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f14511l = {667, 2017, 3367, 4717};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f14512m = {1000, 2350, 3700, 5050};

    /* renamed from: n, reason: collision with root package name */
    public static final Property<d, Float> f14513n = new c(Float.class, "animationFraction");

    /* renamed from: o, reason: collision with root package name */
    public static final Property<d, Float> f14514o = new C0283d(Float.class, "completeEndFraction");

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f14515c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f14516d;

    /* renamed from: e, reason: collision with root package name */
    public final g4.b f14517e;

    /* renamed from: f, reason: collision with root package name */
    public final dd.b f14518f;

    /* renamed from: g, reason: collision with root package name */
    public int f14519g;

    /* renamed from: h, reason: collision with root package name */
    public float f14520h;

    /* renamed from: i, reason: collision with root package name */
    public float f14521i;

    /* renamed from: j, reason: collision with root package name */
    public p5.b f14522j;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            d dVar = d.this;
            dVar.f14519g = (dVar.f14519g + 4) % d.this.f14518f.f14501c.length;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            d.this.a();
            d dVar = d.this;
            p5.b bVar = dVar.f14522j;
            if (bVar != null) {
                bVar.b(dVar.f14554a);
            }
        }
    }

    public class c extends Property<d, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.o());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f10) {
            dVar.t(f10.floatValue());
        }
    }

    /* renamed from: dd.d$d, reason: collision with other inner class name */
    public class C0283d extends Property<d, Float> {
        public C0283d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.p());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f10) {
            dVar.u(f10.floatValue());
        }
    }

    public d(@NonNull e eVar) {
        super(1);
        this.f14519g = 0;
        this.f14522j = null;
        this.f14518f = eVar;
        this.f14517e = new g4.b();
    }

    @Override // dd.i
    public void a() {
        ObjectAnimator objectAnimator = this.f14515c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // dd.i
    public void c() {
        s();
    }

    @Override // dd.i
    public void d(@NonNull p5.b bVar) {
        this.f14522j = bVar;
    }

    @Override // dd.i
    public void f() {
        ObjectAnimator objectAnimator = this.f14516d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f14554a.isVisible()) {
            this.f14516d.start();
        } else {
            a();
        }
    }

    @Override // dd.i
    public void g() {
        q();
        s();
        this.f14515c.start();
    }

    @Override // dd.i
    public void h() {
        this.f14522j = null;
    }

    public final float o() {
        return this.f14520h;
    }

    public final float p() {
        return this.f14521i;
    }

    public final void q() {
        if (this.f14515c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f14513n, 0.0f, 1.0f);
            this.f14515c = ofFloat;
            ofFloat.setDuration(5400L);
            this.f14515c.setInterpolator(null);
            this.f14515c.setRepeatCount(-1);
            this.f14515c.addListener(new a());
        }
        if (this.f14516d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f14514o, 0.0f, 1.0f);
            this.f14516d = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f14516d.setInterpolator(this.f14517e);
            this.f14516d.addListener(new b());
        }
    }

    public final void r(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            float b10 = b(i10, f14512m[i11], 333);
            if (b10 >= 0.0f && b10 <= 1.0f) {
                int i12 = i11 + this.f14519g;
                int[] iArr = this.f14518f.f14501c;
                int length = i12 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i13 = iArr[length];
                int i14 = iArr[length2];
                this.b.get(0).f14552c = jc.c.b().evaluate(this.f14517e.getInterpolation(b10), Integer.valueOf(i13), Integer.valueOf(i14)).intValue();
                return;
            }
        }
    }

    public void s() {
        this.f14519g = 0;
        this.b.get(0).f14552c = this.f14518f.f14501c[0];
        this.f14521i = 0.0f;
    }

    public void t(float f10) {
        this.f14520h = f10;
        int i10 = (int) (f10 * 5400.0f);
        v(i10);
        r(i10);
        this.f14554a.invalidateSelf();
    }

    public final void u(float f10) {
        this.f14521i = f10;
    }

    public final void v(int i10) {
        h.a aVar = this.b.get(0);
        float f10 = this.f14520h;
        aVar.f14551a = (f10 * 1520.0f) - 20.0f;
        aVar.b = f10 * 1520.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            aVar.b += this.f14517e.getInterpolation(b(i10, f14510k[i11], 667)) * 250.0f;
            aVar.f14551a += this.f14517e.getInterpolation(b(i10, f14511l[i11], 667)) * 250.0f;
        }
        float f11 = aVar.f14551a;
        float f12 = aVar.b;
        aVar.f14551a = (f11 + ((f12 - f11) * this.f14521i)) / 360.0f;
        aVar.b = f12 / 360.0f;
    }
}
