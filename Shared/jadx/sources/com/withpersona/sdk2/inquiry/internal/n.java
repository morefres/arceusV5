package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.m;
import xo.h0;

/* loaded from: classes3.dex */
public final class n implements m.a {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f11912a;

    public n(h0 h0Var) {
        this.f11912a = h0Var;
    }

    public static dt.i<m.a> a(h0 h0Var) {
        return dt.e.a(new n(h0Var));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.m.a
    public m create(String str) {
        return this.f11912a.b(str);
    }
}
