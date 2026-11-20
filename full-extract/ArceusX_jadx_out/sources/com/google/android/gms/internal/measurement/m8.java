package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m8 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p8 f6670a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(p8 p8Var, Handler handler) {
        super(null);
        Objects.requireNonNull(p8Var);
        this.f6670a = p8Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f6670a.e();
    }
}
