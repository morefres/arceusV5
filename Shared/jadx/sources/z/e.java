package z;

import android.util.Size;
import java.util.List;
import z.g5;

/* loaded from: classes.dex */
public final class e extends g5.b {

    /* renamed from: a, reason: collision with root package name */
    public final List<Size> f37092a;
    public final List<Size> b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37093c;

    /* renamed from: d, reason: collision with root package name */
    public final int f37094d;

    /* renamed from: e, reason: collision with root package name */
    public final int f37095e;

    public e(List<Size> list, List<Size> list2, int i10, int i11, int i12) {
        this.f37092a = list;
        this.b = list2;
        this.f37093c = i10;
        this.f37094d = i11;
        this.f37095e = i12;
    }

    @Override // z.g5.b
    public List<Size> a() {
        return this.f37092a;
    }

    @Override // z.g5.b
    public List<Size> b() {
        return this.b;
    }

    @Override // z.g5.b
    public int c() {
        return this.f37095e;
    }

    @Override // z.g5.b
    public int d() {
        return this.f37093c;
    }

    @Override // z.g5.b
    public int e() {
        return this.f37094d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g5.b) {
            g5.b bVar = (g5.b) obj;
            List<Size> list = this.f37092a;
            if (list != null ? list.equals(bVar.a()) : bVar.a() == null) {
                List<Size> list2 = this.b;
                if (list2 != null ? list2.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f37093c == bVar.d() && this.f37094d == bVar.e() && this.f37095e == bVar.c()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        List<Size> list = this.f37092a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        List<Size> list2 = this.b;
        return ((((((hashCode ^ (list2 != null ? list2.hashCode() : 0)) * 1000003) ^ this.f37093c) * 1000003) ^ this.f37094d) * 1000003) ^ this.f37095e;
    }

    public String toString() {
        return "BestSizesAndMaxFpsForConfigs{bestSizes=" + this.f37092a + ", bestSizesForStreamUseCase=" + this.b + ", maxFpsForBestSizes=" + this.f37093c + ", maxFpsForStreamUseCase=" + this.f37094d + ", maxFpsForAllSizes=" + this.f37095e + "}";
    }
}
