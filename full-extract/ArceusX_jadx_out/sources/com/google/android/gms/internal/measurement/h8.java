package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h8 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j8 f6516a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(j8 j8Var, Handler handler) {
        super(null);
        Objects.requireNonNull(j8Var);
        this.f6516a = j8Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f6516a.b().set(true);
    }
}
