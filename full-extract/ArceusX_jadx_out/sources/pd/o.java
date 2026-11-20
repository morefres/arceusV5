package pd;

import java.util.Date;

/* loaded from: classes2.dex */
public final class o extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f28582a;
    public final Integer b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f28583c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f28584d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28585e;

    public /* synthetic */ o(Integer num, Integer num2, Integer num3, Date date, String str, n nVar) {
        this.f28582a = num;
        this.b = num2;
        this.f28583c = num3;
        this.f28584d = date;
        this.f28585e = str;
    }

    @Override // pd.e
    public final Integer a() {
        return this.b;
    }

    @Override // pd.e
    public final Integer b() {
        return this.f28583c;
    }

    @Override // pd.e
    public final String d() {
        return this.f28585e;
    }

    @Override // pd.e
    public final Date e() {
        return this.f28584d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            Integer num = this.f28582a;
            if (num != null ? num.equals(eVar.f()) : eVar.f() == null) {
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(eVar.a()) : eVar.a() == null) {
                    Integer num3 = this.f28583c;
                    if (num3 != null ? num3.equals(eVar.b()) : eVar.b() == null) {
                        Date date = this.f28584d;
                        if (date != null ? date.equals(eVar.e()) : eVar.e() == null) {
                            String str = this.f28585e;
                            if (str != null ? str.equals(eVar.d()) : eVar.d() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // pd.e
    public final Integer f() {
        return this.f28582a;
    }

    public final int hashCode() {
        Integer num = this.f28582a;
        int hashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.b;
        int hashCode2 = num2 == null ? 0 : num2.hashCode();
        int i10 = hashCode ^ 1000003;
        Integer num3 = this.f28583c;
        int hashCode3 = ((((i10 * 1000003) ^ hashCode2) * 1000003) ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Date date = this.f28584d;
        int hashCode4 = (hashCode3 ^ (date == null ? 0 : date.hashCode())) * 1000003;
        String str = this.f28585e;
        return hashCode4 ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AgeSignalsResult{userStatus=" + this.f28582a + ", ageLower=" + this.b + ", ageUpper=" + this.f28583c + ", mostRecentApprovalDate=" + String.valueOf(this.f28584d) + ", installId=" + this.f28585e + "}";
    }
}
