package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c1 extends s0 {

    /* renamed from: h, reason: collision with root package name */
    public static final Object[] f7063h;

    /* renamed from: i, reason: collision with root package name */
    public static final c1 f7064i;

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f7065c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f7066d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f7067e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f7068f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f7069g;

    static {
        Object[] objArr = new Object[0];
        f7063h = objArr;
        f7064i = new c1(objArr, 0, objArr, 0, 0);
    }

    public c1(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f7065c = objArr;
        this.f7066d = i10;
        this.f7067e = objArr2;
        this.f7068f = i11;
        this.f7069g = i12;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final int a(Object[] objArr, int i10) {
        Object[] objArr2 = this.f7065c;
        int i11 = this.f7069g;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final int b() {
        return this.f7069g;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final int c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.j0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f7067e;
            if (objArr.length != 0) {
                int a10 = g0.a(obj.hashCode());
                while (true) {
                    int i10 = a10 & this.f7068f;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    a10 = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final Object[] f() {
        return this.f7065c;
    }

    @Override // com.google.android.gms.internal.play_billing.s0
    public final n0 h() {
        return n0.h(this.f7065c, this.f7069g);
    }

    @Override // com.google.android.gms.internal.play_billing.s0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7066d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return d().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.s0
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7069g;
    }
}
