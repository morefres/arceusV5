package de;

import java.util.Map;

/* loaded from: classes2.dex */
public final class f extends v {
    public final Integer b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f14578c;

    public /* synthetic */ f(Integer num, Map map, e eVar) {
        this.b = num;
        this.f14578c = map;
    }

    @Override // de.v
    public final Integer a() {
        return this.b;
    }

    @Override // de.v
    public final Map b() {
        return this.f14578c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            Integer num = this.b;
            if (num != null ? num.equals(vVar.a()) : vVar.a() == null) {
                if (this.f14578c.equals(vVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.b;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f14578c.hashCode();
    }

    public final String toString() {
        return "LocalTestingConfig{defaultSplitInstallErrorCode=" + this.b + ", splitInstallErrorCodeByModule=" + String.valueOf(this.f14578c) + "}";
    }
}
