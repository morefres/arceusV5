package dd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class g extends Drawable implements Animatable {

    /* renamed from: o, reason: collision with root package name */
    public static final Property<g, Float> f14534o = new c(Float.class, "growFraction");

    /* renamed from: a, reason: collision with root package name */
    public final Context f14535a;
    public final dd.b b;

    /* renamed from: d, reason: collision with root package name */
    public ValueAnimator f14537d;

    /* renamed from: e, reason: collision with root package name */
    public ValueAnimator f14538e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14539f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14540g;

    /* renamed from: h, reason: collision with root package name */
    public float f14541h;

    /* renamed from: i, reason: collision with root package name */
    public List<p5.b> f14542i;

    /* renamed from: j, reason: collision with root package name */
    public p5.b f14543j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14544k;

    /* renamed from: l, reason: collision with root package name */
    public float f14545l;

    /* renamed from: n, reason: collision with root package name */
    public int f14547n;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f14546m = new Paint();

    /* renamed from: c, reason: collision with root package name */
    public dd.a f14536c = new dd.a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            g.this.f();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            g.super.setVisible(false, false);
            g.this.e();
        }
    }

    public class c extends Property<g, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(g gVar) {
            return Float.valueOf(gVar.h());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(g gVar, Float f10) {
            gVar.n(f10.floatValue());
        }
    }

    public g(@NonNull Context context, @NonNull dd.b bVar) {
        this.f14535a = context;
        this.b = bVar;
        setAlpha(255);
    }

    public final void d(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f14544k;
        this.f14544k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f14544k = z10;
    }

    public final void e() {
        p5.b bVar = this.f14543j;
        if (bVar != null) {
            bVar.b(this);
        }
        List<p5.b> list = this.f14542i;
        if (list == null || this.f14544k) {
            return;
        }
        Iterator<p5.b> it = list.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public final void f() {
        p5.b bVar = this.f14543j;
        if (bVar != null) {
            bVar.c(this);
        }
        List<p5.b> list = this.f14542i;
        if (list == null || this.f14544k) {
            return;
        }
        Iterator<p5.b> it = list.iterator();
        while (it.hasNext()) {
            it.next().c(this);
        }
    }

    public final void g(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f14544k;
        this.f14544k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f14544k = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f14547n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float h() {
        if (this.b.b() || this.b.a()) {
            return (this.f14540g || this.f14539f) ? this.f14541h : this.f14545l;
        }
        return 1.0f;
    }

    public boolean i() {
        return q(false, false, false);
    }

    public boolean isRunning() {
        return k() || j();
    }

    public boolean j() {
        ValueAnimator valueAnimator = this.f14538e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f14540g;
    }

    public boolean k() {
        ValueAnimator valueAnimator = this.f14537d;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f14539f;
    }

    public final void l() {
        if (this.f14537d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f14534o, 0.0f, 1.0f);
            this.f14537d = ofFloat;
            ofFloat.setDuration(500L);
            this.f14537d.setInterpolator(jc.a.b);
            p(this.f14537d);
        }
        if (this.f14538e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f14534o, 1.0f, 0.0f);
            this.f14538e = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f14538e.setInterpolator(jc.a.b);
            o(this.f14538e);
        }
    }

    public void m(@NonNull p5.b bVar) {
        if (this.f14542i == null) {
            this.f14542i = new ArrayList();
        }
        if (this.f14542i.contains(bVar)) {
            return;
        }
        this.f14542i.add(bVar);
    }

    public void n(float f10) {
        if (this.f14545l != f10) {
            this.f14545l = f10;
            invalidateSelf();
        }
    }

    public final void o(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f14538e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f14538e = valueAnimator;
        valueAnimator.addListener(new b());
    }

    public final void p(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f14537d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f14537d = valueAnimator;
        valueAnimator.addListener(new a());
    }

    public boolean q(boolean z10, boolean z11, boolean z12) {
        return r(z10, z11, z12 && this.f14536c.a(this.f14535a.getContentResolver()) > 0.0f);
    }

    public boolean r(boolean z10, boolean z11, boolean z12) {
        l();
        if (!isVisible() && !z10) {
            return false;
        }
        ValueAnimator valueAnimator = z10 ? this.f14537d : this.f14538e;
        ValueAnimator valueAnimator2 = z10 ? this.f14538e : this.f14537d;
        if (!z12) {
            if (valueAnimator2.isRunning()) {
                d(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                g(valueAnimator);
            }
            return super.setVisible(z10, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z13 = !z10 || super.setVisible(z10, false);
        if (!(z10 ? this.b.b() : this.b.a())) {
            g(valueAnimator);
            return z13;
        }
        if (z11 || !valueAnimator.isPaused()) {
            valueAnimator.start();
            return z13;
        }
        valueAnimator.resume();
        return z13;
    }

    public boolean s(@NonNull p5.b bVar) {
        List<p5.b> list = this.f14542i;
        if (list == null || !list.contains(bVar)) {
            return false;
        }
        this.f14542i.remove(bVar);
        if (!this.f14542i.isEmpty()) {
            return true;
        }
        this.f14542i = null;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f14547n = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f14546m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return q(z10, z11, true);
    }

    public void start() {
        r(true, true, false);
    }

    public void stop() {
        r(false, true, false);
    }
}
