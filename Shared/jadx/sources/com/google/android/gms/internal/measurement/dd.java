package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class dd extends hd {
    public dd() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.hd
    public final void a() {
        if (!b()) {
            for (int i10 = 0; i10 < c(); i10++) {
                Map.Entry d10 = d(i10);
                if (((va) ((ed) d10).a()).zzd()) {
                    d10.setValue(Collections.unmodifiableList((List) d10.getValue()));
                }
            }
            for (Map.Entry entry : e()) {
                if (((va) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
