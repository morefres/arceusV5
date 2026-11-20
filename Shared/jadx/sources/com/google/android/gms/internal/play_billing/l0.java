package com.google.android.gms.internal.play_billing;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l0 extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f7193c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f7194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f7195e;

    public l0(n0 n0Var, int i10, int i11) {
        Objects.requireNonNull(n0Var);
        this.f7195e = n0Var;
        this.f7193c = i10;
        this.f7194d = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final int b() {
        return this.f7195e.c() + this.f7193c + this.f7194d;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final int c() {
        return this.f7195e.c() + this.f7193c;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final Object[] f() {
        return this.f7195e.f();
    }

    @Override // com.google.android.gms.internal.play_billing.n0
    /* renamed from: g */
    public final n0 subList(int i10, int i11) {
        x.d(i10, i11, this.f7194d);
        int i12 = this.f7193c;
        return this.f7195e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        x.a(i10, this.f7194d, "index");
        return this.f7195e.get(i10 + this.f7193c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7194d;
    }

    @Override // com.google.android.gms.internal.play_billing.n0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
