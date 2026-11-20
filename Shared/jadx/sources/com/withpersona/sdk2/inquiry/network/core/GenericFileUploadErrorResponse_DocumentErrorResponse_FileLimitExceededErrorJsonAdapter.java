package com.withpersona.sdk2.inquiry.network.core;

import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.h;
import sm.m;
import sm.t;
import sm.w;

/* loaded from: classes3.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_FileLimitExceededErrorJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError> {

    @NotNull
    private final h<GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError.Details> detailsAdapter;

    @NotNull
    private final m.b options = m.b.a(Title.type, "code", "details");

    @NotNull
    private final h<String> stringAdapter;

    public GenericFileUploadErrorResponse_DocumentErrorResponse_FileLimitExceededErrorJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, q0.d(), Title.type);
        this.detailsAdapter = wVar.f(GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError.Details.class, q0.d(), "details");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(97);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError fromJson(@NotNull m mVar) {
        mVar.b();
        String str = null;
        String str2 = null;
        GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError.Details details = null;
        while (mVar.f()) {
            int F = mVar.F(this.options);
            if (F == -1) {
                mVar.M();
                mVar.P();
            } else if (F == 0) {
                str = this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    throw um.c.x(Title.type, Title.type, mVar);
                }
            } else if (F == 1) {
                str2 = this.stringAdapter.fromJson(mVar);
                if (str2 == null) {
                    throw um.c.x("code", "code", mVar);
                }
            } else if (F == 2 && (details = this.detailsAdapter.fromJson(mVar)) == null) {
                throw um.c.x("details", "details", mVar);
            }
        }
        mVar.d();
        if (str == null) {
            throw um.c.o(Title.type, Title.type, mVar);
        }
        if (str2 == null) {
            throw um.c.o("code", "code", mVar);
        }
        if (details != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError(str, str2, details);
        }
        throw um.c.o("details", "details", mVar);
    }

    @Override // sm.h
    public void toJson(@NotNull t tVar, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError fileLimitExceededError) {
        if (fileLimitExceededError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n(Title.type);
        this.stringAdapter.toJson(tVar, (t) fileLimitExceededError.getTitle());
        tVar.n("code");
        this.stringAdapter.toJson(tVar, (t) fileLimitExceededError.getCode());
        tVar.n("details");
        this.detailsAdapter.toJson(tVar, (t) fileLimitExceededError.getDetails());
        tVar.g();
    }
}
