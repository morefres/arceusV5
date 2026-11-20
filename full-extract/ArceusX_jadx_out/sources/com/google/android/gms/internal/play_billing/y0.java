package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class y0 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient q0 f7394c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f7395d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f7396e;

    public y0(q0 q0Var, Object[] objArr, int i10, int i11) {
        this.f7394c = q0Var;
        this.f7395d = objArr;
        this.f7396e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final int a(Object[] objArr, int i10) {
        return d().a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.j0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f7394c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.s0
    public final n0 h() {
        return new x0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return d().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7396e;
    }
}
