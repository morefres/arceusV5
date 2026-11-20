package com.withpersona.sdk2.inquiry.network.core;

import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
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
public final class ErrorResponseJsonAdapter extends h<ErrorResponse> {

    @NotNull
    private final h<List<ErrorResponse.Error>> nullableListOfErrorAdapter;

    @NotNull
    private final m.b options = m.b.a("errors");

    public ErrorResponseJsonAdapter(@NotNull w wVar) {
        this.nullableListOfErrorAdapter = wVar.f(a0.j(List.class, ErrorResponse.Error.class), q0.d(), "errors");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(ErrorResponse)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public ErrorResponse fromJson(@NotNull m mVar) {
        mVar.b();
        List<ErrorResponse.Error> list = null;
        while (mVar.f()) {
            int F = mVar.F(this.options);
            if (F == -1) {
                mVar.M();
                mVar.P();
            } else if (F == 0) {
                list = this.nullableListOfErrorAdapter.fromJson(mVar);
            }
        }
        mVar.d();
        return new ErrorResponse(list);
    }

    @Override // sm.h
    public void toJson(@NotNull t tVar, @Nullable ErrorResponse errorResponse) {
        if (errorResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n("errors");
        this.nullableListOfErrorAdapter.toJson(tVar, (t) errorResponse.getErrors());
        tVar.g();
    }
}
