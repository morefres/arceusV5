package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class u4 {

    /* renamed from: a, reason: collision with root package name */
    public final u4 f6871a;
    public final y b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f6872c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Map f6873d = new HashMap();

    public u4(u4 u4Var, y yVar) {
        this.f6871a = u4Var;
        this.b = yVar;
    }

    public final q a(q qVar) {
        return this.b.b(this, qVar);
    }

    public final q b(f fVar) {
        q qVar = q.f6791yo;
        Iterator i10 = fVar.i();
        while (i10.hasNext()) {
            qVar = this.b.b(this, fVar.m(((Integer) i10.next()).intValue()));
            if (qVar instanceof h) {
                break;
            }
        }
        return qVar;
    }

    public final u4 c() {
        return new u4(this, this.b);
    }

    public final boolean d(String str) {
        if (this.f6872c.containsKey(str)) {
            return true;
        }
        u4 u4Var = this.f6871a;
        if (u4Var != null) {
            return u4Var.d(str);
        }
        return false;
    }

    public final void e(String str, q qVar) {
        u4 u4Var;
        Map map = this.f6872c;
        if (!map.containsKey(str) && (u4Var = this.f6871a) != null && u4Var.d(str)) {
            u4Var.e(str, qVar);
        } else {
            if (this.f6873d.containsKey(str)) {
                return;
            }
            if (qVar == null) {
                map.remove(str);
            } else {
                map.put(str, qVar);
            }
        }
    }

    public final void f(String str, q qVar) {
        if (this.f6873d.containsKey(str)) {
            return;
        }
        if (qVar == null) {
            this.f6872c.remove(str);
        } else {
            this.f6872c.put(str, qVar);
        }
    }

    public final void g(String str, q qVar) {
        f(str, qVar);
        this.f6873d.put(str, Boolean.TRUE);
    }

    public final q h(String str) {
        Map map = this.f6872c;
        if (map.containsKey(str)) {
            return (q) map.get(str);
        }
        u4 u4Var = this.f6871a;
        if (u4Var != null) {
            return u4Var.h(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }
}
