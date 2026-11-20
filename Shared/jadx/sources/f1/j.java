package f1;

import android.util.Size;
import f1.x;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends x.b {

    /* renamed from: j, reason: collision with root package name */
    public final int f16427j;

    /* renamed from: k, reason: collision with root package name */
    public final int f16428k;

    /* renamed from: l, reason: collision with root package name */
    public final String f16429l;

    /* renamed from: m, reason: collision with root package name */
    public final List<Size> f16430m;

    public j(int i10, int i11, String str, List<Size> list) {
        this.f16427j = i10;
        this.f16428k = i11;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f16429l = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.f16430m = list;
    }

    @Override // f1.x.b
    public int c() {
        return this.f16428k;
    }

    @Override // f1.x.b
    public String d() {
        return this.f16429l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x.b) {
            x.b bVar = (x.b) obj;
            if (this.f16427j == bVar.g() && this.f16428k == bVar.c() && this.f16429l.equals(bVar.d()) && this.f16430m.equals(bVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // f1.x.b
    public List<Size> f() {
        return this.f16430m;
    }

    @Override // f1.x.b
    public int g() {
        return this.f16427j;
    }

    public int hashCode() {
        return ((((((this.f16427j ^ 1000003) * 1000003) ^ this.f16428k) * 1000003) ^ this.f16429l.hashCode()) * 1000003) ^ this.f16430m.hashCode();
    }

    public String toString() {
        return "ConstantQuality{value=" + this.f16427j + ", highSpeedValue=" + this.f16428k + ", name=" + this.f16429l + ", typicalSizes=" + this.f16430m + "}";
    }
}
