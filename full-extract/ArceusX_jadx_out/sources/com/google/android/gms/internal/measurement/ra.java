package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ra {
    public static volatile ra b;

    /* renamed from: c, reason: collision with root package name */
    public static final ra f6811c = new ra(true);

    /* renamed from: a, reason: collision with root package name */
    public final Map f6812a;

    public ra() {
        this.f6812a = new HashMap();
    }

    public static ra a() {
        ra raVar = b;
        if (raVar != null) {
            return raVar;
        }
        synchronized (ra.class) {
            try {
                ra raVar2 = b;
                if (raVar2 != null) {
                    return raVar2;
                }
                wc wcVar = wc.f6918c;
                ra b10 = za.b(ra.class);
                b = b10;
                return b10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final fb b(oc ocVar, int i10) {
        return (fb) this.f6812a.get(new qa(ocVar, i10));
    }

    public ra(boolean z10) {
        this.f6812a = Collections.EMPTY_MAP;
    }
}
