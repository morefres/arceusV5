package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ch extends k {

    /* renamed from: c, reason: collision with root package name */
    public final Callable f6456c;

    public ch(String str, Callable callable) {
        super("internal.appMetadata");
        this.f6456c = callable;
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(u4 u4Var, List list) {
        try {
            return w6.a(this.f6456c.call());
        } catch (Exception unused) {
            return q.f6791yo;
        }
    }
}
