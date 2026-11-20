package com.withpersona.sdk2.inquiry.network.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.m;
import sm.t;
import sm.z;

/* loaded from: classes3.dex */
public final class NumberAdapter {

    @NotNull
    public static final NumberAdapter INSTANCE = new NumberAdapter();

    private NumberAdapter() {
    }

    @sm.f
    @Nullable
    public final Number fromJson(@NotNull m mVar) {
        Object B = mVar.B();
        Number number = B instanceof Number ? (Number) B : null;
        if (number instanceof Double) {
            if (Double.compare(number.doubleValue(), (int) number.doubleValue()) == 0) {
                return Integer.valueOf((int) number.doubleValue());
            }
        } else if (!(number instanceof Integer)) {
            return null;
        }
        return number;
    }

    @z
    public final void toJson(@NotNull t tVar, @Nullable Number number) {
    }
}
