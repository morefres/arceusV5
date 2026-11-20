package com.withpersona.sdk2.inquiry.network.core.dto;

import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.h;
import sm.m;
import sm.t;
import sm.w;
import um.c;

/* loaded from: classes3.dex */
public final class UiComponentError_UiInputComponentErrorJsonAdapter extends h<UiComponentError.UiInputComponentError> {

    @NotNull
    private final m.b options = m.b.a("name", Payload.TYPE, "message");

    @NotNull
    private final h<String> stringAdapter;

    public UiComponentError_UiInputComponentErrorJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, q0.d(), "name");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("GeneratedJsonAdapter(UiComponentError.UiInputComponentError)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public UiComponentError.UiInputComponentError fromJson(@NotNull m mVar) {
        mVar.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (mVar.f()) {
            int F = mVar.F(this.options);
            if (F == -1) {
                mVar.M();
                mVar.P();
            } else if (F == 0) {
                str = this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    throw c.x("name", "name", mVar);
                }
            } else if (F == 1) {
                str2 = this.stringAdapter.fromJson(mVar);
                if (str2 == null) {
                    throw c.x(Payload.TYPE, Payload.TYPE, mVar);
                }
            } else if (F == 2 && (str3 = this.stringAdapter.fromJson(mVar)) == null) {
                throw c.x("message", "message", mVar);
            }
        }
        mVar.d();
        if (str == null) {
            throw c.o("name", "name", mVar);
        }
        if (str2 == null) {
            throw c.o(Payload.TYPE, Payload.TYPE, mVar);
        }
        if (str3 != null) {
            return new UiComponentError.UiInputComponentError(str, str2, str3);
        }
        throw c.o("message", "message", mVar);
    }

    @Override // sm.h
    public void toJson(@NotNull t tVar, @Nullable UiComponentError.UiInputComponentError uiInputComponentError) {
        if (uiInputComponentError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n("name");
        this.stringAdapter.toJson(tVar, (t) uiInputComponentError.getName());
        tVar.n(Payload.TYPE);
        this.stringAdapter.toJson(tVar, (t) uiInputComponentError.getType());
        tVar.n("message");
        this.stringAdapter.toJson(tVar, (t) uiInputComponentError.getMessage());
        tVar.g();
    }
}
