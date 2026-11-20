package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.IntegrityTokenRequest;
import td.p;
import td.q;

/* loaded from: classes2.dex */
public final class a extends IntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    public String f8426a;
    public Long b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f8426a;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: nonce");
        }
        p pVar = null;
        return new q(str, this.b, pVar, pVar);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.b = Long.valueOf(j10);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f8426a = str;
        return this;
    }
}
