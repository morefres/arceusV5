package h1;

import java.util.List;
import n0.a2;

/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: a, reason: collision with root package name */
    public final int f18928a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final List<a2.a> f18929c;

    /* renamed from: d, reason: collision with root package name */
    public final List<a2.c> f18930d;

    /* renamed from: e, reason: collision with root package name */
    public final a2.a f18931e;

    /* renamed from: f, reason: collision with root package name */
    public final a2.c f18932f;

    public a(int i10, int i11, List<a2.a> list, List<a2.c> list2, a2.a aVar, a2.c cVar) {
        this.f18928a = i10;
        this.b = i11;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f18929c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f18930d = list2;
        this.f18931e = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f18932f = cVar;
    }

    @Override // n0.a2
    public int a() {
        return this.f18928a;
    }

    @Override // n0.a2
    public List<a2.c> b() {
        return this.f18930d;
    }

    @Override // n0.a2
    public int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        a2.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f18928a == iVar.a() && this.b == iVar.e() && this.f18929c.equals(iVar.f()) && this.f18930d.equals(iVar.b()) && ((aVar = this.f18931e) != null ? aVar.equals(iVar.j()) : iVar.j() == null) && this.f18932f.equals(iVar.k())) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.a2
    public List<a2.a> f() {
        return this.f18929c;
    }

    public int hashCode() {
        int hashCode = (((((((this.f18928a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f18929c.hashCode()) * 1000003) ^ this.f18930d.hashCode()) * 1000003;
        a2.a aVar = this.f18931e;
        return ((hashCode ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003) ^ this.f18932f.hashCode();
    }

    @Override // h1.i
    public a2.a j() {
        return this.f18931e;
    }

    @Override // h1.i
    public a2.c k() {
        return this.f18932f;
    }

    public String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f18928a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.f18929c + ", videoProfiles=" + this.f18930d + ", defaultAudioProfile=" + this.f18931e + ", defaultVideoProfile=" + this.f18932f + "}";
    }
}
