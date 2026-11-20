package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* loaded from: classes.dex */
public final class w9 extends s9 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x9 f7387h;

    public w9(x9 x9Var) {
        Objects.requireNonNull(x9Var);
        this.f7387h = x9Var;
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final String c() {
        t9 t9Var = (t9) this.f7387h.f7392a.get();
        if (t9Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(t9Var.f7371a) + "]";
    }
}
