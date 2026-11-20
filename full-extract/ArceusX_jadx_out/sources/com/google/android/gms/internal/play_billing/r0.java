package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r0 extends h0 {
    public r0() {
        super(4);
    }

    public final r0 b(Object obj) {
        obj.getClass();
        int length = this.f7135a.length;
        int a10 = i0.a(length, this.b + 1);
        if (a10 > length || this.f7136c) {
            this.f7135a = Arrays.copyOf(this.f7135a, a10);
            this.f7136c = false;
        }
        Object[] objArr = this.f7135a;
        int i10 = this.b;
        this.b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    public final s0 c() {
        s0 m10;
        int i10 = this.b;
        if (i10 == 0) {
            return c1.f7064i;
        }
        if (i10 == 1) {
            Object obj = this.f7135a[0];
            Objects.requireNonNull(obj);
            return new e1(obj);
        }
        m10 = s0.m(i10, this.f7135a);
        this.b = m10.size();
        this.f7136c = true;
        return m10;
    }
}
