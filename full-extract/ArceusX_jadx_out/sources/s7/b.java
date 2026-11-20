package s7;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import s7.l;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public float f30907a;
    public float b;

    /* renamed from: c, reason: collision with root package name */
    public float f30908c;

    /* renamed from: d, reason: collision with root package name */
    public int f30909d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f30910e = null;

    public b(float f10, float f11, float f12, int i10) {
        this.f30907a = f10;
        this.b = f11;
        this.f30908c = f12;
        this.f30909d = i10;
    }

    public void a(Paint paint) {
        if (Color.alpha(this.f30909d) > 0) {
            paint.setShadowLayer(Math.max(this.f30907a, Float.MIN_VALUE), this.b, this.f30908c, this.f30909d);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void b(l.a aVar) {
        if (Color.alpha(this.f30909d) > 0) {
            aVar.f30959d = this;
        } else {
            aVar.f30959d = null;
        }
    }

    public void c(int i10, Paint paint) {
        int l10 = m.l(Color.alpha(this.f30909d), j.c(i10, 0, 255));
        if (l10 <= 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(Math.max(this.f30907a, Float.MIN_VALUE), this.b, this.f30908c, Color.argb(l10, Color.red(this.f30909d), Color.green(this.f30909d), Color.blue(this.f30909d)));
        }
    }

    public void d(int i10, l.a aVar) {
        b bVar = new b(this);
        aVar.f30959d = bVar;
        bVar.i(i10);
    }

    public int e() {
        return this.f30909d;
    }

    public float f() {
        return this.b;
    }

    public float g() {
        return this.f30908c;
    }

    public float h() {
        return this.f30907a;
    }

    public void i(int i10) {
        this.f30909d = Color.argb(Math.round((Color.alpha(this.f30909d) * j.c(i10, 0, 255)) / 255.0f), Color.red(this.f30909d), Color.green(this.f30909d), Color.blue(this.f30909d));
    }

    public boolean j(b bVar) {
        return this.f30907a == bVar.f30907a && this.b == bVar.b && this.f30908c == bVar.f30908c && this.f30909d == bVar.f30909d;
    }

    public void k(Matrix matrix) {
        if (this.f30910e == null) {
            this.f30910e = new float[2];
        }
        float[] fArr = this.f30910e;
        fArr[0] = this.b;
        fArr[1] = this.f30908c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f30910e;
        this.b = fArr2[0];
        this.f30908c = fArr2[1];
        this.f30907a = matrix.mapRadius(this.f30907a);
    }

    public b(b bVar) {
        this.f30907a = 0.0f;
        this.b = 0.0f;
        this.f30908c = 0.0f;
        this.f30909d = 0;
        this.f30907a = bVar.f30907a;
        this.b = bVar.b;
        this.f30908c = bVar.f30908c;
        this.f30909d = bVar.f30909d;
    }
}
