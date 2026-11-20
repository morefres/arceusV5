package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j6 extends p6 {
    public j6() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.p6
    public final void a() {
        if (!k()) {
            for (int i10 = 0; i10 < c(); i10++) {
                Map.Entry g10 = g(i10);
                if (((j4) ((k6) g10).a()).zze()) {
                    g10.setValue(Collections.unmodifiableList((List) g10.getValue()));
                }
            }
            for (Map.Entry entry : d()) {
                if (((j4) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
