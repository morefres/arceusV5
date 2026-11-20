package dd;

import ad.o;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import ic.k;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public int f14500a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public int[] f14501c = new int[0];

    /* renamed from: d, reason: collision with root package name */
    public int f14502d;

    /* renamed from: e, reason: collision with root package name */
    public int f14503e;

    /* renamed from: f, reason: collision with root package name */
    public int f14504f;

    /* renamed from: g, reason: collision with root package name */
    public int f14505g;

    public b(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(ic.d.f20439f0);
        TypedArray i12 = o.i(context, attributeSet, k.f20781x, i10, i11, new int[0]);
        this.f14500a = ed.c.c(context, i12, k.G, dimensionPixelSize);
        this.b = Math.min(ed.c.c(context, i12, k.F, 0), this.f14500a / 2);
        this.f14503e = i12.getInt(k.C, 0);
        this.f14504f = i12.getInt(k.f20790y, 0);
        this.f14505g = i12.getDimensionPixelSize(k.A, 0);
        c(context, i12);
        d(context, i12);
        i12.recycle();
    }

    public boolean a() {
        return this.f14504f != 0;
    }

    public boolean b() {
        return this.f14503e != 0;
    }

    public final void c(@NonNull Context context, @NonNull TypedArray typedArray) {
        if (!typedArray.hasValue(k.f20799z)) {
            this.f14501c = new int[]{uc.a.b(context, ic.b.f20405l, -1)};
            return;
        }
        if (typedArray.peekValue(k.f20799z).type != 1) {
            this.f14501c = new int[]{typedArray.getColor(k.f20799z, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(k.f20799z, -1));
        this.f14501c = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    public final void d(@NonNull Context context, @NonNull TypedArray typedArray) {
        if (typedArray.hasValue(k.E)) {
            this.f14502d = typedArray.getColor(k.E, -1);
            return;
        }
        this.f14502d = this.f14501c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f10 = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f14502d = uc.a.a(this.f14502d, (int) (f10 * 255.0f));
    }

    public void e() {
        if (this.f14505g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
