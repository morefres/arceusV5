package n9;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f25955a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final ComponentName f25956c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25957d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25958e;

    public e1(String str, String str2, int i10, boolean z10) {
        m.f(str);
        this.f25955a = str;
        m.f(str2);
        this.b = str2;
        this.f25956c = null;
        this.f25957d = 4225;
        this.f25958e = z10;
    }

    public final String a() {
        return this.f25955a;
    }

    public final String b() {
        return this.b;
    }

    public final ComponentName c() {
        return this.f25956c;
    }

    public final boolean d() {
        return this.f25958e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return k.b(this.f25955a, e1Var.f25955a) && k.b(this.b, e1Var.b) && k.b(this.f25956c, e1Var.f25956c) && this.f25958e == e1Var.f25958e;
    }

    public final int hashCode() {
        return k.c(this.f25955a, this.b, this.f25956c, 4225, Boolean.valueOf(this.f25958e));
    }

    public final String toString() {
        String str = this.f25955a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f25956c;
        m.l(componentName);
        return componentName.flattenToString();
    }
}
