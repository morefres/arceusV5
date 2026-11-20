package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: classes.dex */
public final class c9 extends l9 {
    public c9(f9 f9Var, String str, Boolean bool, boolean z10) {
        super(f9Var, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.l9
    public final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (e8.f6475c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (e8.f6476d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String str2 = this.b;
        String obj2 = obj.toString();
        StringBuilder sb2 = new StringBuilder(str2.length() + 28 + obj2.length());
        sb2.append("Invalid boolean value for ");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(obj2);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
