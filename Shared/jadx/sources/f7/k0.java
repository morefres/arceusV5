package f7;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f16972a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16973c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16974d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16975e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f16976f;

    public k0(int i10, int i11, String str, String str2, String str3) {
        this.f16972a = i10;
        this.b = i11;
        this.f16973c = str;
        this.f16974d = str2;
        this.f16975e = str3;
    }

    public k0 a(float f10) {
        k0 k0Var = new k0((int) (this.f16972a * f10), (int) (this.b * f10), this.f16973c, this.f16974d, this.f16975e);
        Bitmap bitmap = this.f16976f;
        if (bitmap != null) {
            k0Var.g(Bitmap.createScaledBitmap(bitmap, k0Var.f16972a, k0Var.b, true));
        }
        return k0Var;
    }

    public Bitmap b() {
        return this.f16976f;
    }

    public String c() {
        return this.f16974d;
    }

    public int d() {
        return this.b;
    }

    public String e() {
        return this.f16973c;
    }

    public int f() {
        return this.f16972a;
    }

    public void g(Bitmap bitmap) {
        this.f16976f = bitmap;
    }
}
