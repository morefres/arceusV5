package com.withpersona.sdk2.inquiry.network.core.dto;

import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import java.util.Map;
import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.a0;
import sm.h;
import sm.m;
import sm.t;
import sm.w;
import um.c;

/* loaded from: classes3.dex */
public final class UiComponentError_UiInputAddressComponentErrorJsonAdapter extends h<UiComponentError.UiInputAddressComponentError> {

    @NotNull
    private final h<Map<String, String>> mapOfStringStringAdapter;

    @NotNull
    private final m.b options = m.b.a("name", Payload.TYPE, "message");

    @NotNull
    private final h<String> stringAdapter;

    public UiComponentError_UiInputAddressComponentErrorJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, q0.d(), "name");
        this.mapOfStringStringAdapter = wVar.f(a0.j(Map.class, String.class, String.class), q0.d(), "message");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(67);
        sb2.append("GeneratedJsonAdapter(UiComponentError.UiInputAddressComponentError)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public UiComponentError.UiInputAddressComponentError fromJson(@NotNull m mVar) {
        mVar.b();
        String str = null;
        String str2 = null;
        Map<String, String> map = null;
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
            } else if (F == 2 && (map = this.mapOfStringStringAdapter.fromJson(mVar)) == null) {
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
        if (map != null) {
            return new UiComponentError.UiInputAddressComponentError(str, str2, map);
        }
        throw c.o("message", "message", mVar);
    }

    @Override // sm.h
    public void toJson(@NotNull t tVar, @Nullable UiComponentError.UiInputAddressComponentError uiInputAddressComponentError) {
        if (uiInputAddressComponentError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n("name");
        this.stringAdapter.toJson(tVar, (t) uiInputAddressComponentError.getName());
        tVar.n(Payload.TYPE);
        this.stringAdapter.toJson(tVar, (t) uiInputAddressComponentError.getType());
        tVar.n("message");
        this.mapOfStringStringAdapter.toJson(tVar, (t) uiInputAddressComponentError.getMessage());
        tVar.g();
    }
}
