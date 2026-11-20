package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* loaded from: classes.dex */
public final class a1 extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f7029c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f7030d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f7031e;

    public a1(Object[] objArr, int i10, int i11) {
        this.f7029c = objArr;
        this.f7030d = i10;
        this.f7031e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        x.a(i10, this.f7031e, "index");
        Object obj = this.f7029c[i10 + i10 + this.f7030d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7031e;
    }
}
