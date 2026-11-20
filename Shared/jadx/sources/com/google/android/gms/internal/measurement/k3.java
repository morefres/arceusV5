package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class k3 extends c2 {

    /* renamed from: a, reason: collision with root package name */
    public final nb.u8 f6621a;

    public k3(nb.u8 u8Var) {
        this.f6621a = u8Var;
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final void p(String str, String str2, Bundle bundle, long j10) {
        this.f6621a.a(str, str2, bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final int zzf() {
        return System.identityHashCode(this.f6621a);
    }
}
