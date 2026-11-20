package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m6 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f7230a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f7231c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p6 f7232d;

    public /* synthetic */ m6(p6 p6Var, o6 o6Var) {
        Objects.requireNonNull(p6Var);
        this.f7232d = p6Var;
        this.f7230a = -1;
    }

    public final Iterator b() {
        Map map;
        if (this.f7231c == null) {
            map = this.f7232d.f7253c;
            this.f7231c = map.entrySet().iterator();
        }
        return this.f7231c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        Map map;
        int i11 = this.f7230a + 1;
        p6 p6Var = this.f7232d;
        i10 = p6Var.b;
        if (i11 < i10) {
            return true;
        }
        map = p6Var.f7253c;
        return !map.isEmpty() && b().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i10;
        Object[] objArr;
        this.b = true;
        int i11 = this.f7230a + 1;
        this.f7230a = i11;
        p6 p6Var = this.f7232d;
        i10 = p6Var.b;
        if (i11 >= i10) {
            return (Map.Entry) b().next();
        }
        objArr = p6Var.f7252a;
        return (k6) objArr[i11];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        if (!this.b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.b = false;
        p6 p6Var = this.f7232d;
        p6Var.p();
        int i11 = this.f7230a;
        i10 = p6Var.b;
        if (i11 >= i10) {
            b().remove();
        } else {
            this.f7230a = i11 - 1;
            p6Var.n(i11);
        }
    }
}
