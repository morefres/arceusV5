package dd;

import ad.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import ic.k;

/* loaded from: classes2.dex */
public final class e extends b {

    /* renamed from: h, reason: collision with root package name */
    public int f14525h;

    /* renamed from: i, reason: collision with root package name */
    public int f14526i;

    /* renamed from: j, reason: collision with root package name */
    public int f14527j;

    public e(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ic.b.f20395f);
    }

    public e(@NonNull Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, CircularProgressIndicator.f8102p);
    }

    public e(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(ic.d.f20437e0);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(ic.d.f20435d0);
        TypedArray i12 = o.i(context, attributeSet, k.f20614e1, i10, i11, new int[0]);
        this.f14525h = Math.max(ed.c.c(context, i12, k.f20641h1, dimensionPixelSize), this.f14500a * 2);
        this.f14526i = ed.c.c(context, i12, k.f20632g1, dimensionPixelSize2);
        this.f14527j = i12.getInt(k.f20623f1, 0);
        i12.recycle();
        e();
    }
}
