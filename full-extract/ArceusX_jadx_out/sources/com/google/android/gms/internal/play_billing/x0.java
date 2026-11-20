package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x0 extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0 f7388c;

    public x0(y0 y0Var) {
        Objects.requireNonNull(y0Var);
        this.f7388c = y0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        int i11;
        Object[] objArr;
        Object[] objArr2;
        y0 y0Var = this.f7388c;
        i11 = y0Var.f7396e;
        x.a(i10, i11, "index");
        objArr = y0Var.f7395d;
        int i12 = i10 + i10;
        Object obj = objArr[i12];
        Objects.requireNonNull(obj);
        objArr2 = y0Var.f7395d;
        Object obj2 = objArr2[i12 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10;
        i10 = this.f7388c.f7396e;
        return i10;
    }
}
