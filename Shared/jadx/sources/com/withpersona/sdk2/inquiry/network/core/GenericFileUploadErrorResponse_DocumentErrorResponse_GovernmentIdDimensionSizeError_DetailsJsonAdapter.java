package com.withpersona.sdk2.inquiry.network.core;

import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.h;
import sm.m;
import sm.t;
import sm.w;

/* loaded from: classes3.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details> {

    @NotNull
    private final h<Integer> intAdapter;

    @NotNull
    private final m.b options = m.b.a("min_dimension_size", "max_dimension_size");

    public GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter(@NotNull w wVar) {
        this.intAdapter = wVar.f(Integer.TYPE, q0.d(), "minDimensionSize");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(113);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details fromJson(@NotNull m mVar) {
        mVar.b();
        Integer num = null;
        Integer num2 = null;
        while (mVar.f()) {
            int F = mVar.F(this.options);
            if (F == -1) {
                mVar.M();
                mVar.P();
            } else if (F == 0) {
                num = this.intAdapter.fromJson(mVar);
                if (num == null) {
                    throw um.c.x("minDimensionSize", "min_dimension_size", mVar);
                }
            } else if (F == 1 && (num2 = this.intAdapter.fromJson(mVar)) == null) {
                throw um.c.x("maxDimensionSize", "max_dimension_size", mVar);
            }
        }
        mVar.d();
        if (num == null) {
            throw um.c.o("minDimensionSize", "min_dimension_size", mVar);
        }
        int intValue = num.intValue();
        if (num2 != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details(intValue, num2.intValue());
        }
        throw um.c.o("maxDimensionSize", "max_dimension_size", mVar);
    }

    @Override // sm.h
    public void toJson(@NotNull t tVar, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n("min_dimension_size");
        this.intAdapter.toJson(tVar, (t) Integer.valueOf(details.getMinDimensionSize()));
        tVar.n("max_dimension_size");
        this.intAdapter.toJson(tVar, (t) Integer.valueOf(details.getMaxDimensionSize()));
        tVar.g();
    }
}
