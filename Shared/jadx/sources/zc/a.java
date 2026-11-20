package zc;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.core.graphics.c;
import androidx.core.view.MotionEventCompat;
import hd.k;
import hd.l;

/* loaded from: classes2.dex */
public class a extends Drawable {

    @NonNull
    public final Paint b;

    /* renamed from: h, reason: collision with root package name */
    public float f37977h;

    /* renamed from: i, reason: collision with root package name */
    public int f37978i;

    /* renamed from: j, reason: collision with root package name */
    public int f37979j;

    /* renamed from: k, reason: collision with root package name */
    public int f37980k;

    /* renamed from: l, reason: collision with root package name */
    public int f37981l;

    /* renamed from: m, reason: collision with root package name */
    public int f37982m;

    /* renamed from: o, reason: collision with root package name */
    public k f37984o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f37985p;

    /* renamed from: a, reason: collision with root package name */
    public final l f37971a = l.k();

    /* renamed from: c, reason: collision with root package name */
    public final Path f37972c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f37973d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final RectF f37974e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f37975f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final b f37976g = new b();

    /* renamed from: n, reason: collision with root package name */
    public boolean f37983n = true;

    public class b extends Drawable.ConstantState {
        public b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return a.this;
        }
    }

    public a(k kVar) {
        this.f37984o = kVar;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @NonNull
    public final Shader a() {
        copyBounds(this.f37973d);
        float height = this.f37977h / r1.height();
        return new LinearGradient(0.0f, r1.top, 0.0f, r1.bottom, new int[]{c.h(this.f37978i, this.f37982m), c.h(this.f37979j, this.f37982m), c.h(c.l(this.f37979j, 0), this.f37982m), c.h(c.l(this.f37981l, 0), this.f37982m), c.h(this.f37981l, this.f37982m), c.h(this.f37980k, this.f37982m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    @NonNull
    public RectF b() {
        this.f37975f.set(getBounds());
        return this.f37975f;
    }

    public void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f37982m = colorStateList.getColorForState(getState(), this.f37982m);
        }
        this.f37985p = colorStateList;
        this.f37983n = true;
        invalidateSelf();
    }

    public void d(float f10) {
        if (this.f37977h != f10) {
            this.f37977h = f10;
            this.b.setStrokeWidth(f10 * 1.3333f);
            this.f37983n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f37983n) {
            this.b.setShader(a());
            this.f37983n = false;
        }
        float strokeWidth = this.b.getStrokeWidth() / 2.0f;
        copyBounds(this.f37973d);
        this.f37974e.set(this.f37973d);
        float min = Math.min(this.f37984o.r().a(b()), this.f37974e.width() / 2.0f);
        if (this.f37984o.u(b())) {
            this.f37974e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f37974e, min, min, this.b);
        }
    }

    public void e(int i10, int i11, int i12, int i13) {
        this.f37978i = i10;
        this.f37979j = i11;
        this.f37980k = i12;
        this.f37981l = i13;
    }

    public void f(k kVar) {
        this.f37984o = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f37976g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f37977h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(MotionEventCompat.AXIS_WHEEL)
    public void getOutline(@NonNull Outline outline) {
        if (this.f37984o.u(b())) {
            outline.setRoundRect(getBounds(), this.f37984o.r().a(b()));
        } else {
            copyBounds(this.f37973d);
            this.f37974e.set(this.f37973d);
            this.f37971a.d(this.f37984o, 1.0f, this.f37974e, this.f37972c);
            wc.c.k(outline, this.f37972c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        if (!this.f37984o.u(b())) {
            return true;
        }
        int round = Math.round(this.f37977h);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f37985p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f37983n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f37985p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f37982m)) != this.f37982m) {
            this.f37983n = true;
            this.f37982m = colorForState;
        }
        if (this.f37983n) {
            invalidateSelf();
        }
        return this.f37983n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
