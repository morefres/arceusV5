package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class aa extends ba {

    /* renamed from: a, reason: collision with root package name */
    public int f6422a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ha f6423c;

    public aa(ha haVar) {
        Objects.requireNonNull(haVar);
        this.f6423c = haVar;
        this.f6422a = 0;
        this.b = haVar.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6422a < this.b;
    }

    @Override // com.google.android.gms.internal.measurement.da
    public final byte zza() {
        int i10 = this.f6422a;
        if (i10 >= this.b) {
            throw new NoSuchElementException();
        }
        this.f6422a = i10 + 1;
        return this.f6423c.c(i10);
    }
}
