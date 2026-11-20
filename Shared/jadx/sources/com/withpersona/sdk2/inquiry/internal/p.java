package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.o;
import xo.i0;

/* loaded from: classes3.dex */
public final class p implements o.a {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f12116a;

    public p(i0 i0Var) {
        this.f12116a = i0Var;
    }

    public static dt.i<o.a> b(i0 i0Var) {
        return dt.e.a(new p(i0Var));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.o.a
    public o a(String str, String str2, String str3) {
        return this.f12116a.b(str, str2, str3);
    }
}
