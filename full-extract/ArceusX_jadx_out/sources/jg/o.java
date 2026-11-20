package jg;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class o extends l {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedTreeMap<String, l> f21746a = new LinkedTreeMap<>(false);

    public void A(String str, String str2) {
        v(str, str2 == null ? n.f21745a : new r(str2));
    }

    public Map<String, l> B() {
        return this.f21746a;
    }

    @Override // jg.l
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public o a() {
        o oVar = new o();
        for (Map.Entry<String, l> entry : this.f21746a.entrySet()) {
            oVar.v(entry.getKey(), entry.getValue().a());
        }
        return oVar;
    }

    public Set<Map.Entry<String, l>> D() {
        return this.f21746a.entrySet();
    }

    public l E(String str) {
        return this.f21746a.get(str);
    }

    public i F(String str) {
        return (i) this.f21746a.get(str);
    }

    public o G(String str) {
        return (o) this.f21746a.get(str);
    }

    public boolean H(String str) {
        return this.f21746a.containsKey(str);
    }

    public Set<String> I() {
        return this.f21746a.keySet();
    }

    public l J(String str) {
        return this.f21746a.remove(str);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof o) && ((o) obj).f21746a.equals(this.f21746a);
        }
        return true;
    }

    public int hashCode() {
        return this.f21746a.hashCode();
    }

    public boolean isEmpty() {
        return this.f21746a.isEmpty();
    }

    public void v(String str, l lVar) {
        LinkedTreeMap<String, l> linkedTreeMap = this.f21746a;
        if (lVar == null) {
            lVar = n.f21745a;
        }
        linkedTreeMap.put(str, lVar);
    }

    public void y(String str, Boolean bool) {
        v(str, bool == null ? n.f21745a : new r(bool));
    }

    public void z(String str, Number number) {
        v(str, number == null ? n.f21745a : new r(number));
    }
}
