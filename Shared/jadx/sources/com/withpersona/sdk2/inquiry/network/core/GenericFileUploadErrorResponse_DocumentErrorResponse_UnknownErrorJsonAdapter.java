package com.withpersona.sdk2.inquiry.network.core;

import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import java.lang.reflect.Constructor;
import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.h;
import sm.m;
import sm.t;
import sm.w;

/* loaded from: classes3.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_UnknownErrorJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> {

    @Nullable
    private volatile Constructor<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> constructorRef;

    @NotNull
    private final h<ErrorDetails> nullableErrorDetailsAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(Title.type, "code", "details");

    @NotNull
    private final h<String> stringAdapter;

    public GenericFileUploadErrorResponse_DocumentErrorResponse_UnknownErrorJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, q0.d(), Title.type);
        this.nullableStringAdapter = wVar.f(String.class, q0.d(), "code");
        this.nullableErrorDetailsAdapter = wVar.f(ErrorDetails.class, q0.d(), "details");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(87);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError fromJson(@NotNull m mVar) {
        mVar.b();
        String str = null;
        String str2 = null;
        ErrorDetails errorDetails = null;
        int i10 = -1;
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
                i10 &= -2;
            } else if (F == 1) {
                str2 = this.nullableStringAdapter.fromJson(mVar);
                i10 &= -3;
            } else if (F == 2) {
                errorDetails = this.nullableErrorDetailsAdapter.fromJson(mVar);
                i10 &= -5;
            }
        }
        mVar.d();
        if (i10 == -8) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(str, str2, errorDetails);
        }
        Constructor<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError.class.getDeclaredConstructor(String.class, String.class, ErrorDetails.class, Integer.TYPE, um.c.f33031c);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(str, str2, errorDetails, Integer.valueOf(i10), null);
    }

    @Override // sm.h
    public void toJson(@NotNull t tVar, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError unknownError) {
        if (unknownError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n(Title.type);
        this.stringAdapter.toJson(tVar, (t) unknownError.getTitle());
        tVar.n("code");
        this.nullableStringAdapter.toJson(tVar, (t) unknownError.getCode());
        tVar.n("details");
        this.nullableErrorDetailsAdapter.toJson(tVar, (t) unknownError.getDetails());
        tVar.g();
    }
}
