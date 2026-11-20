package com.withpersona.sdk2.inquiry.network.core;

import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import java.lang.reflect.Constructor;
import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.h;
import sm.m;
import sm.t;
import sm.w;

/* loaded from: classes3.dex */
public final class InternalErrorInfo_NetworkErrorInfoJsonAdapter extends h<InternalErrorInfo.NetworkErrorInfo> {

    @NotNull
    private final h<Boolean> booleanAdapter;

    @Nullable
    private volatile Constructor<InternalErrorInfo.NetworkErrorInfo> constructorRef;

    @NotNull
    private final h<Integer> intAdapter;

    @NotNull
    private final h<ErrorResponse.Error> nullableErrorAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a("code", "message", "isRecoverable", "responseError");

    public InternalErrorInfo_NetworkErrorInfoJsonAdapter(@NotNull w wVar) {
        this.intAdapter = wVar.f(Integer.TYPE, q0.d(), "code");
        this.nullableStringAdapter = wVar.f(String.class, q0.d(), "message");
        this.booleanAdapter = wVar.f(Boolean.TYPE, q0.d(), "isRecoverable");
        this.nullableErrorAdapter = wVar.f(ErrorResponse.Error.class, q0.d(), "responseError");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(56);
        sb2.append("GeneratedJsonAdapter(InternalErrorInfo.NetworkErrorInfo)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public InternalErrorInfo.NetworkErrorInfo fromJson(@NotNull m mVar) {
        mVar.b();
        Integer num = null;
        String str = null;
        Boolean bool = null;
        ErrorResponse.Error error = null;
        int i10 = -1;
        while (mVar.f()) {
            int F = mVar.F(this.options);
            if (F == -1) {
                mVar.M();
                mVar.P();
            } else if (F == 0) {
                num = this.intAdapter.fromJson(mVar);
                if (num == null) {
                    throw um.c.x("code", "code", mVar);
                }
            } else if (F == 1) {
                str = this.nullableStringAdapter.fromJson(mVar);
            } else if (F == 2) {
                bool = this.booleanAdapter.fromJson(mVar);
                if (bool == null) {
                    throw um.c.x("isRecoverable", "isRecoverable", mVar);
                }
            } else if (F == 3) {
                error = this.nullableErrorAdapter.fromJson(mVar);
                i10 = -9;
            }
        }
        mVar.d();
        if (i10 == -9) {
            if (num == null) {
                throw um.c.o("code", "code", mVar);
            }
            int intValue = num.intValue();
            if (bool != null) {
                return new InternalErrorInfo.NetworkErrorInfo(intValue, str, bool.booleanValue(), error);
            }
            throw um.c.o("isRecoverable", "isRecoverable", mVar);
        }
        Constructor<InternalErrorInfo.NetworkErrorInfo> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = um.c.f33031c;
            Class cls2 = Integer.TYPE;
            constructor = InternalErrorInfo.NetworkErrorInfo.class.getDeclaredConstructor(cls2, String.class, Boolean.TYPE, ErrorResponse.Error.class, cls2, cls);
            this.constructorRef = constructor;
        }
        if (num == null) {
            throw um.c.o("code", "code", mVar);
        }
        if (bool != null) {
            return constructor.newInstance(num, str, bool, error, Integer.valueOf(i10), null);
        }
        throw um.c.o("isRecoverable", "isRecoverable", mVar);
    }

    @Override // sm.h
    public void toJson(@NotNull t tVar, @Nullable InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
        if (networkErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n("code");
        this.intAdapter.toJson(tVar, (t) Integer.valueOf(networkErrorInfo.getCode()));
        tVar.n("message");
        this.nullableStringAdapter.toJson(tVar, (t) networkErrorInfo.getMessage());
        tVar.n("isRecoverable");
        this.booleanAdapter.toJson(tVar, (t) Boolean.valueOf(networkErrorInfo.isRecoverable()));
        tVar.n("responseError");
        this.nullableErrorAdapter.toJson(tVar, (t) networkErrorInfo.getResponseError());
        tVar.g();
    }
}
