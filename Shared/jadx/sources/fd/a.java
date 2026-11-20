package fd;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import hd.g;
import hd.k;
import hd.n;

/* loaded from: classes2.dex */
public class a extends Drawable implements n {

    /* renamed from: a, reason: collision with root package name */
    public b f17152a;

    @Override // android.graphics.drawable.Drawable
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f17152a = new b(this.f17152a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f17152a;
        if (bVar.b) {
            bVar.f17153a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f17152a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f17152a.f17153a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f17152a.f17153a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f17152a.f17153a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b10 = fd.b.b(iArr);
        b bVar = this.f17152a;
        if (bVar.b == b10) {
            return onStateChange;
        }
        bVar.b = b10;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f17152a.f17153a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f17152a.f17153a.setColorFilter(colorFilter);
    }

    @Override // hd.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        this.f17152a.f17153a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f17152a.f17153a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f17152a.f17153a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f17152a.f17153a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    public static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public g f17153a;
        public boolean b;

        public b(g gVar) {
            this.f17153a = gVar;
            this.b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(@NonNull b bVar) {
            this.f17153a = (g) bVar.f17153a.getConstantState().newDrawable();
            this.b = bVar.b;
        }
    }

    public a(b bVar) {
        this.f17152a = bVar;
    }
}
