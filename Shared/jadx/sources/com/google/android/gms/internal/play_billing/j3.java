package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j3 extends k3 {

    /* renamed from: a, reason: collision with root package name */
    public int f7159a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s3 f7160c;

    public j3(s3 s3Var) {
        Objects.requireNonNull(s3Var);
        this.f7160c = s3Var;
        this.f7159a = 0;
        this.b = s3Var.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7159a < this.b;
    }

    @Override // com.google.android.gms.internal.play_billing.n3
    public final byte zza() {
        int i10 = this.f7159a;
        if (i10 >= this.b) {
            throw new NoSuchElementException();
        }
        this.f7159a = i10 + 1;
        return this.f7160c.b(i10);
    }
}
