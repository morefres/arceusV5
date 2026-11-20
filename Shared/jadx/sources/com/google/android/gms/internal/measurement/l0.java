package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class l0 extends x {
    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, u4 u4Var, List list) {
        if (str == null || str.isEmpty() || !u4Var.d(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        q h10 = u4Var.h(str);
        if (h10 instanceof k) {
            return ((k) h10).h(u4Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
