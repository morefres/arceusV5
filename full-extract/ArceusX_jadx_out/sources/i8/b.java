package i8;

import i8.f;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final l8.a f20259a;
    public final Map<y7.e, f.b> b;

    public b(l8.a aVar, Map<y7.e, f.b> map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f20259a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.b = map;
    }

    @Override // i8.f
    public l8.a e() {
        return this.f20259a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f20259a.equals(fVar.e()) && this.b.equals(fVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // i8.f
    public Map<y7.e, f.b> h() {
        return this.b;
    }

    public int hashCode() {
        return ((this.f20259a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f20259a + ", values=" + this.b + "}";
    }
}
