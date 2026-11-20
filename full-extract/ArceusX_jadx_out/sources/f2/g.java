package f2;

import android.view.View;
import android.view.animation.Interpolator;
import e2.b;
import e2.c;
import e2.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16655a;
    public k b;

    /* renamed from: c, reason: collision with root package name */
    public k f16656c;

    /* renamed from: d, reason: collision with root package name */
    public f f16657d;

    /* renamed from: e, reason: collision with root package name */
    public f f16658e;

    /* renamed from: f, reason: collision with root package name */
    public a2.a[] f16659f;

    /* renamed from: g, reason: collision with root package name */
    public a2.a f16660g;

    /* renamed from: h, reason: collision with root package name */
    public float f16661h;

    /* renamed from: i, reason: collision with root package name */
    public float f16662i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f16663j;

    /* renamed from: k, reason: collision with root package name */
    public double[] f16664k;

    /* renamed from: l, reason: collision with root package name */
    public double[] f16665l;

    /* renamed from: m, reason: collision with root package name */
    public String[] f16666m;

    /* renamed from: n, reason: collision with root package name */
    public float[] f16667n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<k> f16668o;

    /* renamed from: p, reason: collision with root package name */
    public HashMap<String, e2.d> f16669p;

    /* renamed from: q, reason: collision with root package name */
    public HashMap<String, e2.c> f16670q;

    /* renamed from: r, reason: collision with root package name */
    public HashMap<String, e2.b> f16671r;

    /* renamed from: s, reason: collision with root package name */
    public e[] f16672s;

    /* renamed from: t, reason: collision with root package name */
    public int f16673t;

    /* renamed from: u, reason: collision with root package name */
    public View f16674u;

    /* renamed from: v, reason: collision with root package name */
    public int f16675v;

    /* renamed from: w, reason: collision with root package name */
    public float f16676w;

    /* renamed from: x, reason: collision with root package name */
    public Interpolator f16677x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f16678y;

    public final float a(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f16662i;
            if (f12 != 1.0d) {
                float f13 = this.f16661h;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        a2.b bVar = this.b.f16720a;
        ArrayList<k> arrayList = this.f16668o;
        int size = arrayList.size();
        float f14 = Float.NaN;
        int i10 = 0;
        while (i10 < size) {
            k kVar = arrayList.get(i10);
            i10++;
            k kVar2 = kVar;
            a2.b bVar2 = kVar2.f16720a;
            if (bVar2 != null) {
                float f15 = kVar2.f16721c;
                if (f15 < f10) {
                    bVar = bVar2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = kVar2.f16721c;
                }
            }
        }
        if (bVar != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d10 = (f10 - f11) / f16;
            f10 = (((float) bVar.a(d10)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) bVar.b(d10);
            }
        }
        return f10;
    }

    public void b(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f16659f[0].a(d10, dArr);
        this.f16659f[0].c(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.b.b(d10, this.f16663j, dArr, fArr, dArr2, fArr2);
    }

    public boolean c(View view, float f10, long j10, a2.c cVar) {
        boolean z10;
        View view2;
        View view3 = view;
        float a10 = a(f10, null);
        int i10 = this.f16675v;
        if (i10 != d.f16653a) {
            float f11 = 1.0f / i10;
            float floor = ((float) Math.floor(a10 / f11)) * f11;
            float f12 = (a10 % f11) / f11;
            if (!Float.isNaN(this.f16676w)) {
                f12 = (f12 + this.f16676w) % 1.0f;
            }
            Interpolator interpolator = this.f16677x;
            a10 = ((interpolator != null ? interpolator.getInterpolation(f12) : ((double) f12) > 0.5d ? 1.0f : 0.0f) * f11) + floor;
        }
        float f13 = a10;
        HashMap<String, e2.c> hashMap = this.f16670q;
        if (hashMap != null) {
            Iterator<e2.c> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().a(view3, f13);
            }
        }
        HashMap<String, e2.d> hashMap2 = this.f16669p;
        if (hashMap2 != null) {
            boolean z11 = false;
            for (e2.d dVar : hashMap2.values()) {
                if (!(dVar instanceof d.a)) {
                    z11 |= dVar.a(view3, f13, j10, cVar);
                    view3 = view;
                }
            }
            z10 = z11;
        } else {
            z10 = false;
        }
        a2.a[] aVarArr = this.f16659f;
        if (aVarArr != null) {
            double d10 = f13;
            aVarArr[0].a(d10, this.f16664k);
            this.f16659f[0].c(d10, this.f16665l);
            if (this.f16678y) {
                view2 = view;
            } else {
                this.b.c(f13, view, this.f16663j, this.f16664k, this.f16665l, null, this.f16655a);
                f13 = f13;
                view2 = view;
                this.f16655a = false;
            }
            if (this.f16673t != d.f16653a) {
                if (this.f16674u == null) {
                    this.f16674u = ((View) view2.getParent()).findViewById(this.f16673t);
                }
                if (this.f16674u != null) {
                    float top = (r1.getTop() + this.f16674u.getBottom()) / 2.0f;
                    float left = (this.f16674u.getLeft() + this.f16674u.getRight()) / 2.0f;
                    if (view2.getRight() - view2.getLeft() > 0 && view2.getBottom() - view2.getTop() > 0) {
                        view2.setPivotX(left - view2.getLeft());
                        view2.setPivotY(top - view2.getTop());
                    }
                }
            }
            HashMap<String, e2.c> hashMap3 = this.f16670q;
            if (hashMap3 != null) {
                for (e2.c cVar2 : hashMap3.values()) {
                    if (cVar2 instanceof c.a) {
                        double[] dArr = this.f16665l;
                        if (dArr.length > 1) {
                            ((c.a) cVar2).b(view2, f13, dArr[0], dArr[1]);
                        }
                    }
                }
            }
            int i11 = 1;
            while (true) {
                a2.a[] aVarArr2 = this.f16659f;
                if (i11 >= aVarArr2.length) {
                    break;
                }
                aVarArr2[i11].b(d10, this.f16667n);
                e2.a.b(this.b.f16733o.get(this.f16666m[i11 - 1]), view2, this.f16667n);
                i11++;
            }
            f fVar = this.f16657d;
            if (fVar.f16654a == 0) {
                if (f13 <= 0.0f) {
                    view2.setVisibility(fVar.b);
                } else if (f13 >= 1.0f) {
                    view2.setVisibility(this.f16658e.b);
                } else if (this.f16658e.b != fVar.b) {
                    view2.setVisibility(0);
                }
            }
            if (this.f16672s != null) {
                int i12 = 0;
                while (true) {
                    e[] eVarArr = this.f16672s;
                    if (i12 >= eVarArr.length) {
                        break;
                    }
                    eVarArr[i12].a(f13, view2);
                    i12++;
                }
            }
        } else {
            view2 = view;
            k kVar = this.b;
            float f14 = kVar.f16723e;
            k kVar2 = this.f16656c;
            float f15 = f14 + ((kVar2.f16723e - f14) * f13);
            float f16 = kVar.f16724f;
            float f17 = f16 + ((kVar2.f16724f - f16) * f13);
            float f18 = kVar.f16725g;
            float f19 = kVar2.f16725g;
            float f20 = kVar.f16726h;
            float f21 = kVar2.f16726h;
            float f22 = f15 + 0.5f;
            int i13 = (int) f22;
            float f23 = f17 + 0.5f;
            int i14 = (int) f23;
            int i15 = (int) (f22 + ((f19 - f18) * f13) + f18);
            int i16 = (int) (f23 + ((f21 - f20) * f13) + f20);
            int i17 = i15 - i13;
            int i18 = i16 - i14;
            if (f19 != f18 || f21 != f20 || this.f16655a) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
                this.f16655a = false;
            }
            view2.layout(i13, i14, i15, i16);
        }
        HashMap<String, e2.b> hashMap4 = this.f16671r;
        if (hashMap4 != null) {
            for (e2.b bVar : hashMap4.values()) {
                if (bVar instanceof b.a) {
                    double[] dArr2 = this.f16665l;
                    ((b.a) bVar).b(view2, f13, dArr2[0], dArr2[1]);
                } else {
                    bVar.a(view2, f13);
                }
            }
        }
        return z10;
    }

    public String toString() {
        return " start: x: " + this.b.f16723e + " y: " + this.b.f16724f + " end: x: " + this.f16656c.f16723e + " y: " + this.f16656c.f16724f;
    }
}
