package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.k;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import org.jetbrains.annotations.Nullable;
import xo.a0;
import xo.c0;

/* loaded from: classes3.dex */
public final class l implements k.b {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f11906a;

    public l(c0 c0Var) {
        this.f11906a = c0Var;
    }

    public static dt.i<k.b> b(c0 c0Var) {
        return dt.e.a(new l(c0Var));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.k.b
    public k a(String str, @Nullable String str2, String str3, a0 a0Var, InquirySessionConfig inquirySessionConfig, boolean z10) {
        return this.f11906a.b(str, str2, str3, a0Var, inquirySessionConfig, z10);
    }
}
