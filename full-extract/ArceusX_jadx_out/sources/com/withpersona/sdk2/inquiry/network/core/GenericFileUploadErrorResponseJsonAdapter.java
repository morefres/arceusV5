package com.withpersona.sdk2.inquiry.network.core;

import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import java.util.List;
import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.a0;
import sm.h;
import sm.m;
import sm.t;
import sm.w;

/* loaded from: classes3.dex */
public final class GenericFileUploadErrorResponseJsonAdapter extends h<GenericFileUploadErrorResponse> {

    @NotNull
    private final h<List<GenericFileUploadErrorResponse.DocumentErrorResponse>> listOfDocumentErrorResponseAdapter;

    @NotNull
    private final m.b options = m.b.a("errors");

    public GenericFileUploadErrorResponseJsonAdapter(@NotNull w wVar) {
        this.listOfDocumentErrorResponseAdapter = wVar.f(a0.j(List.class, GenericFileUploadErrorResponse.DocumentErrorResponse.class), q0.d(), "errors");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public GenericFileUploadErrorResponse fromJson(@NotNull m mVar) {
        mVar.b();
        List<GenericFileUploadErrorResponse.DocumentErrorResponse> list = null;
        while (mVar.f()) {
            int F = mVar.F(this.options);
            if (F == -1) {
                mVar.M();
                mVar.P();
            } else if (F == 0 && (list = this.listOfDocumentErrorResponseAdapter.fromJson(mVar)) == null) {
                throw um.c.x("errors", "errors", mVar);
            }
        }
        mVar.d();
        if (list != null) {
            return new GenericFileUploadErrorResponse(list);
        }
        throw um.c.o("errors", "errors", mVar);
    }

    @Override // sm.h
    public void toJson(@NotNull t tVar, @Nullable GenericFileUploadErrorResponse genericFileUploadErrorResponse) {
        if (genericFileUploadErrorResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n("errors");
        this.listOfDocumentErrorResponseAdapter.toJson(tVar, (t) genericFileUploadErrorResponse.getErrors());
        tVar.g();
    }
}
