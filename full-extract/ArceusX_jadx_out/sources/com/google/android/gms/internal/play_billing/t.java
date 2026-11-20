package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f7366a;
    public final s b;

    /* renamed from: c, reason: collision with root package name */
    public s f7367c;

    public /* synthetic */ t(String str, u uVar) {
        s sVar = new s();
        this.b = sVar;
        this.f7367c = sVar;
        str.getClass();
        this.f7366a = str;
    }

    public final t a(Object obj) {
        s sVar = new s();
        this.f7367c.b = sVar;
        this.f7367c = sVar;
        sVar.f7275a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f7366a);
        sb2.append('{');
        s sVar = this.b.b;
        String str = "";
        while (sVar != null) {
            Object obj = sVar.f7275a;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            sVar = sVar.b;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
