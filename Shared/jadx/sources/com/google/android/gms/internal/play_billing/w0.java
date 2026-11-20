package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* loaded from: classes.dex */
public final class w0 extends n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final n0 f7383e = new w0(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f7384c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f7385d;

    public w0(Object[] objArr, int i10) {
        this.f7384c = objArr;
        this.f7385d = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.n0, com.google.android.gms.internal.play_billing.j0
    public final int a(Object[] objArr, int i10) {
        Object[] objArr2 = this.f7384c;
        int i11 = this.f7385d;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final int b() {
        return this.f7385d;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final int c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final Object[] f() {
        return this.f7384c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        x.a(i10, this.f7385d, "index");
        Object obj = this.f7384c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7385d;
    }
}
