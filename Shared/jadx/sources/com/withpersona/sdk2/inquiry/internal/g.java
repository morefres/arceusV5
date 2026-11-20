package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.f;

/* loaded from: classes3.dex */
public final class g implements f.a {

    /* renamed from: a, reason: collision with root package name */
    public final xo.k f11863a;

    public g(xo.k kVar) {
        this.f11863a = kVar;
    }

    public static dt.i<f.a> a(xo.k kVar) {
        return dt.e.a(new g(kVar));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.f.a
    public f create(String str) {
        return this.f11863a.b(str);
    }
}
