package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class a implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22954a;
    public final Class b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22955c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22956d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22957e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22958f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22959g;

    public a(int i10, Class cls, String str, String str2, int i11) {
        this(i10, d.NO_RECEIVER, cls, str, str2, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f22957e == aVar.f22957e && this.f22958f == aVar.f22958f && this.f22959g == aVar.f22959g && Intrinsics.c(this.f22954a, aVar.f22954a) && Intrinsics.c(this.b, aVar.b) && this.f22955c.equals(aVar.f22955c) && this.f22956d.equals(aVar.f22956d);
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.f22958f;
    }

    public int hashCode() {
        Object obj = this.f22954a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.b;
        return ((((((((((hashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f22955c.hashCode()) * 31) + this.f22956d.hashCode()) * 31) + (this.f22957e ? 1231 : 1237)) * 31) + this.f22958f) * 31) + this.f22959g;
    }

    public String toString() {
        return d0.i(this);
    }

    public a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f22954a = obj;
        this.b = cls;
        this.f22955c = str;
        this.f22956d = str2;
        this.f22957e = (i11 & 1) == 1;
        this.f22958f = i10;
        this.f22959g = i11 >> 1;
    }
}
