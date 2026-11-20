package com.withpersona.sdk2.inquiry.network.core.dto;

import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import java.lang.reflect.Constructor;
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
public final class UiComponentError_UiGovernmentIdNfcScanComponentErrorJsonAdapter extends h<UiComponentError.UiGovernmentIdNfcScanComponentError> {

    @Nullable
    private volatile Constructor<UiComponentError.UiGovernmentIdNfcScanComponentError> constructorRef;

    @NotNull
    private final h<Map<String, String>> mapOfStringStringAdapter;

    @NotNull
    private final m.b options = m.b.a("name", Payload.TYPE, "message");

    @NotNull
    private final h<String> stringAdapter;

    public UiComponentError_UiGovernmentIdNfcScanComponentErrorJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, q0.d(), "name");
        this.mapOfStringStringAdapter = wVar.f(a0.j(Map.class, String.class, String.class), q0.d(), "message");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(74);
        sb2.append("GeneratedJsonAdapter(UiComponentError.UiGovernmentIdNfcScanComponentError)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public UiComponentError.UiGovernmentIdNfcScanComponentError fromJson(@NotNull m mVar) {
        mVar.b();
        String str = null;
        Map<String, String> map = null;
        String str2 = null;
        int i10 = -1;
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
                i10 = -3;
            } else if (F == 2 && (map = this.mapOfStringStringAdapter.fromJson(mVar)) == null) {
                throw c.x("message", "message", mVar);
            }
        }
        mVar.d();
        if (i10 == -3) {
            if (str == null) {
                throw c.o("name", "name", mVar);
            }
            if (map != null) {
                return new UiComponentError.UiGovernmentIdNfcScanComponentError(str, str2, map);
            }
            throw c.o("message", "message", mVar);
        }
        Constructor<UiComponentError.UiGovernmentIdNfcScanComponentError> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = UiComponentError.UiGovernmentIdNfcScanComponentError.class.getDeclaredConstructor(String.class, String.class, Map.class, Integer.TYPE, c.f33031c);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw c.o("name", "name", mVar);
        }
        if (map != null) {
            return constructor.newInstance(str, str2, map, Integer.valueOf(i10), null);
        }
        throw c.o("message", "message", mVar);
    }

    @Override // sm.h
    public void toJson(@NotNull t tVar, @Nullable UiComponentError.UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError) {
        if (uiGovernmentIdNfcScanComponentError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n("name");
        this.stringAdapter.toJson(tVar, (t) uiGovernmentIdNfcScanComponentError.getName());
        tVar.n(Payload.TYPE);
        this.stringAdapter.toJson(tVar, (t) uiGovernmentIdNfcScanComponentError.getType());
        tVar.n("message");
        this.mapOfStringStringAdapter.toJson(tVar, (t) uiGovernmentIdNfcScanComponentError.getMessage());
        tVar.g();
    }
}
