package l7;

import android.graphics.PointF;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f23245a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public float f23246c;

    /* renamed from: d, reason: collision with root package name */
    public a f23247d;

    /* renamed from: e, reason: collision with root package name */
    public int f23248e;

    /* renamed from: f, reason: collision with root package name */
    public float f23249f;

    /* renamed from: g, reason: collision with root package name */
    public float f23250g;

    /* renamed from: h, reason: collision with root package name */
    public int f23251h;

    /* renamed from: i, reason: collision with root package name */
    public int f23252i;

    /* renamed from: j, reason: collision with root package name */
    public float f23253j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23254k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f23255l;

    /* renamed from: m, reason: collision with root package name */
    public PointF f23256m;

    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        a(str, str2, f10, aVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public void a(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.f23245a = str;
        this.b = str2;
        this.f23246c = f10;
        this.f23247d = aVar;
        this.f23248e = i10;
        this.f23249f = f11;
        this.f23250g = f12;
        this.f23251h = i11;
        this.f23252i = i12;
        this.f23253j = f13;
        this.f23254k = z10;
        this.f23255l = pointF;
        this.f23256m = pointF2;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f23245a.hashCode() * 31) + this.b.hashCode()) * 31) + this.f23246c)) * 31) + this.f23247d.ordinal()) * 31) + this.f23248e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f23249f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f23251h;
    }

    public b() {
    }
}
