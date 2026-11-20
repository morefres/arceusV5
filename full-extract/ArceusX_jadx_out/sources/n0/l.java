package n0;

import java.util.List;
import n0.a2;

/* loaded from: classes.dex */
public final class l extends a2.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f25425a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final List<a2.a> f25426c;

    /* renamed from: d, reason: collision with root package name */
    public final List<a2.c> f25427d;

    public l(int i10, int i11, List<a2.a> list, List<a2.c> list2) {
        this.f25425a = i10;
        this.b = i11;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f25426c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f25427d = list2;
    }

    @Override // n0.a2
    public int a() {
        return this.f25425a;
    }

    @Override // n0.a2
    public List<a2.c> b() {
        return this.f25427d;
    }

    @Override // n0.a2
    public int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2.b) {
            a2.b bVar = (a2.b) obj;
            if (this.f25425a == bVar.a() && this.b == bVar.e() && this.f25426c.equals(bVar.f()) && this.f25427d.equals(bVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.a2
    public List<a2.a> f() {
        return this.f25426c;
    }

    public int hashCode() {
        return ((((((this.f25425a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f25426c.hashCode()) * 1000003) ^ this.f25427d.hashCode();
    }

    public String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.f25425a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.f25426c + ", videoProfiles=" + this.f25427d + "}";
    }
}
