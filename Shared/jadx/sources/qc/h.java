package qc;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class h extends f {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f29634d = {1};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f29635e = {1, 0};

    /* renamed from: c, reason: collision with root package name */
    public int f29636c = 0;

    @Override // qc.f
    @NonNull
    public com.google.android.material.carousel.b g(@NonNull b bVar, @NonNull View view) {
        float b = bVar.b();
        if (bVar.f()) {
            b = bVar.a();
        }
        float f10 = b;
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        float f11 = ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.f()) {
            f11 = ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f12 = f11;
        float d10 = d() + f12;
        float max = Math.max(c() + f12, d10);
        float min = Math.min(measuredHeight + f12, f10);
        float b10 = s2.a.b((measuredHeight / 3.0f) + f12, d10 + f12, max + f12);
        float f13 = (min + b10) / 2.0f;
        int[] iArr = f29634d;
        if (f10 < 2.0f * d10) {
            iArr = new int[]{0};
        }
        int[] iArr2 = f29635e;
        if (bVar.d() == 1) {
            iArr = f.a(iArr);
            iArr2 = f.a(iArr2);
        }
        int[] iArr3 = iArr2;
        int[] iArr4 = iArr;
        int max2 = (int) Math.max(1.0d, Math.floor(((f10 - (com.google.android.material.carousel.a.i(iArr3) * f13)) - (com.google.android.material.carousel.a.i(iArr4) * max)) / min));
        int ceil = (int) Math.ceil(f10 / min);
        int i10 = (ceil - max2) + 1;
        int[] iArr5 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr5[i11] = ceil - i11;
        }
        a c10 = a.c(f10, b10, d10, max, iArr4, f13, iArr3, min, iArr5);
        this.f29636c = c10.e();
        if (i(c10, bVar.e())) {
            c10 = a.c(f10, b10, d10, max, new int[]{c10.f29624c}, f13, new int[]{c10.f29625d}, min, new int[]{c10.f29628g});
        }
        return com.google.android.material.carousel.a.d(view.getContext(), f12, f10, c10, bVar.d());
    }

    @Override // qc.f
    public boolean h(b bVar, int i10) {
        if (i10 >= this.f29636c || bVar.e() < this.f29636c) {
            return i10 >= this.f29636c && bVar.e() < this.f29636c;
        }
        return true;
    }

    public boolean i(a aVar, int i10) {
        int e10 = aVar.e() - i10;
        boolean z10 = e10 > 0 && (aVar.f29624c > 0 || aVar.f29625d > 1);
        while (e10 > 0) {
            int i11 = aVar.f29624c;
            if (i11 > 0) {
                aVar.f29624c = i11 - 1;
            } else {
                int i12 = aVar.f29625d;
                if (i12 > 1) {
                    aVar.f29625d = i12 - 1;
                }
            }
            e10--;
        }
        return z10;
    }
}
