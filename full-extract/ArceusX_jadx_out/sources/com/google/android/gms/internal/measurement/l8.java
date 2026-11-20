package com.google.android.gms.internal.measurement;

import android.content.Context;

/* loaded from: classes.dex */
public final class l8 extends g9 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6650a;
    public final he.s b;

    public l8(Context context, he.s sVar) {
        this.f6650a = context;
        this.b = sVar;
    }

    @Override // com.google.android.gms.internal.measurement.g9
    public final Context a() {
        return this.f6650a;
    }

    @Override // com.google.android.gms.internal.measurement.g9
    public final he.s b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        he.s sVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g9) {
            g9 g9Var = (g9) obj;
            if (this.f6650a.equals(g9Var.a()) && ((sVar = this.b) != null ? sVar.equals(g9Var.b()) : g9Var.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f6650a.hashCode() ^ 1000003;
        he.s sVar = this.b;
        return (hashCode * 1000003) ^ (sVar == null ? 0 : sVar.hashCode());
    }

    public final String toString() {
        String obj = this.f6650a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.b);
        StringBuilder sb2 = new StringBuilder(length + 45 + valueOf.length() + 1);
        sb2.append("FlagsContext{context=");
        sb2.append(obj);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
