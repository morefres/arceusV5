package f2;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class k implements Comparable<k> {

    /* renamed from: s, reason: collision with root package name */
    public static String[] f16719s = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: a, reason: collision with root package name */
    public a2.b f16720a;

    /* renamed from: c, reason: collision with root package name */
    public float f16721c;

    /* renamed from: d, reason: collision with root package name */
    public float f16722d;

    /* renamed from: e, reason: collision with root package name */
    public float f16723e;

    /* renamed from: f, reason: collision with root package name */
    public float f16724f;

    /* renamed from: g, reason: collision with root package name */
    public float f16725g;

    /* renamed from: h, reason: collision with root package name */
    public float f16726h;

    /* renamed from: k, reason: collision with root package name */
    public int f16729k;

    /* renamed from: l, reason: collision with root package name */
    public int f16730l;

    /* renamed from: m, reason: collision with root package name */
    public float f16731m;

    /* renamed from: n, reason: collision with root package name */
    public g f16732n;

    /* renamed from: o, reason: collision with root package name */
    public LinkedHashMap<String, androidx.constraintlayout.widget.a> f16733o;

    /* renamed from: p, reason: collision with root package name */
    public int f16734p;

    /* renamed from: q, reason: collision with root package name */
    public double[] f16735q;

    /* renamed from: r, reason: collision with root package name */
    public double[] f16736r;
    public int b = 0;

    /* renamed from: i, reason: collision with root package name */
    public float f16727i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    public float f16728j = Float.NaN;

    public k() {
        int i10 = d.f16653a;
        this.f16729k = i10;
        this.f16730l = i10;
        this.f16731m = Float.NaN;
        this.f16732n = null;
        this.f16733o = new LinkedHashMap<>();
        this.f16734p = 0;
        this.f16735q = new double[18];
        this.f16736r = new double[18];
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull k kVar) {
        return Float.compare(this.f16722d, kVar.f16722d);
    }

    public void b(double d10, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f10;
        float f11 = this.f16723e;
        float f12 = this.f16724f;
        float f13 = this.f16725g;
        float f14 = this.f16726h;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f19 = (float) dArr[i10];
            float f20 = (float) dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f11 = f19;
                f15 = f20;
            } else if (i11 == 2) {
                f12 = f19;
                f17 = f20;
            } else if (i11 == 3) {
                f13 = f19;
                f16 = f20;
            } else if (i11 == 4) {
                f14 = f19;
                f18 = f20;
            }
        }
        float f21 = (f16 / 2.0f) + f15;
        float f22 = (f18 / 2.0f) + f17;
        g gVar = this.f16732n;
        if (gVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            gVar.b(d10, fArr3, fArr4);
            float f23 = fArr3[0];
            float f24 = fArr3[1];
            float f25 = fArr4[0];
            float f26 = fArr4[1];
            f10 = 2.0f;
            double d11 = f11;
            double d12 = f12;
            f11 = (float) ((f23 + (Math.sin(d12) * d11)) - (f13 / 2.0f));
            f12 = (float) ((f24 - (Math.cos(d12) * d11)) - (f14 / 2.0f));
            double d13 = f15;
            double sin = f25 + (Math.sin(d12) * d13);
            double d14 = f17;
            float cos = (float) (sin + (Math.cos(d12) * d14));
            f22 = (float) ((f26 - (d13 * Math.cos(d12))) + (Math.sin(d12) * d14));
            f21 = cos;
        } else {
            f10 = 2.0f;
        }
        fArr[0] = f11 + (f13 / f10) + 0.0f;
        fArr[1] = f12 + (f14 / f10) + 0.0f;
        fArr2[0] = f21;
        fArr2[1] = f22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(float f10, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z10) {
        float f11;
        float f12 = this.f16723e;
        float f13 = this.f16724f;
        float f14 = this.f16725g;
        float f15 = this.f16726h;
        if (iArr.length != 0 && this.f16735q.length <= iArr[iArr.length - 1]) {
            int i10 = iArr[iArr.length - 1] + 1;
            this.f16735q = new double[i10];
            this.f16736r = new double[i10];
        }
        Arrays.fill(this.f16735q, Double.NaN);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            double[] dArr4 = this.f16735q;
            int i12 = iArr[i11];
            dArr4[i12] = dArr[i11];
            this.f16736r[i12] = dArr2[i11];
        }
        float f16 = Float.NaN;
        int i13 = 0;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        while (true) {
            double[] dArr5 = this.f16735q;
            if (i13 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i13]) && (dArr3 == null || dArr3[i13] == 0.0d)) {
                f11 = f16;
            } else {
                double d10 = dArr3 != null ? dArr3[i13] : 0.0d;
                if (!Double.isNaN(this.f16735q[i13])) {
                    d10 = this.f16735q[i13] + d10;
                }
                f11 = f16;
                float f21 = (float) d10;
                float f22 = (float) this.f16736r[i13];
                if (i13 == 1) {
                    f16 = f11;
                    f17 = f22;
                    f12 = f21;
                } else if (i13 == 2) {
                    f16 = f11;
                    f18 = f22;
                    f13 = f21;
                } else if (i13 == 3) {
                    f16 = f11;
                    f19 = f22;
                    f14 = f21;
                } else if (i13 == 4) {
                    f16 = f11;
                    f20 = f22;
                    f15 = f21;
                } else if (i13 == 5) {
                    f16 = f21;
                }
                i13++;
            }
            f16 = f11;
            i13++;
        }
        float f23 = f16;
        g gVar = this.f16732n;
        if (gVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            gVar.b(f10, fArr, fArr2);
            float f24 = fArr[0];
            float f25 = fArr[1];
            float f26 = fArr2[0];
            float f27 = fArr2[1];
            double d11 = f24;
            double d12 = f12;
            double d13 = f13;
            f12 = (float) ((d11 + (Math.sin(d13) * d12)) - (f14 / 2.0f));
            f13 = (float) ((f25 - (Math.cos(d13) * d12)) - (f15 / 2.0f));
            double d14 = f26;
            double d15 = f17;
            double sin = d14 + (Math.sin(d13) * d15);
            double cos = Math.cos(d13) * d12;
            double d16 = f18;
            float f28 = (float) (sin + (cos * d16));
            float cos2 = (float) ((f27 - (d15 * Math.cos(d13))) + (Math.sin(d13) * d12 * d16));
            if (dArr2.length >= 2) {
                dArr2[0] = f28;
                dArr2[1] = cos2;
            }
            if (!Float.isNaN(f23)) {
                view.setRotation((float) (f23 + Math.toDegrees(Math.atan2(cos2, f28))));
            }
        } else if (!Float.isNaN(f23)) {
            view.setRotation(f23 + ((float) Math.toDegrees(Math.atan2(f18 + (f20 / 2.0f), f17 + (f19 / 2.0f)))) + 0.0f);
        }
        if (view instanceof c) {
            ((c) view).a(f12, f13, f14 + f12, f15 + f13);
            return;
        }
        float f29 = f12 + 0.5f;
        int i14 = (int) f29;
        float f30 = f13 + 0.5f;
        int i15 = (int) f30;
        int i16 = (int) (f29 + f14);
        int i17 = (int) (f30 + f15);
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        if (i18 != view.getMeasuredWidth() || i19 != view.getMeasuredHeight() || z10) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
        }
        view.layout(i14, i15, i16, i17);
    }
}
