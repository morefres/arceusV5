package com.withpersona.sdk2.inquiry.network.core;

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
public final class InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter extends h<InternalErrorInfo.NoDiskSpaceErrorInfo> {

    @Nullable
    private volatile Constructor<InternalErrorInfo.NoDiskSpaceErrorInfo> constructorRef;

    @NotNull
    private final m.b options = m.b.a("message");

    @NotNull
    private final h<String> stringAdapter;

    public InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, q0.d(), "message");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("GeneratedJsonAdapter(InternalErrorInfo.NoDiskSpaceErrorInfo)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public InternalErrorInfo.NoDiskSpaceErrorInfo fromJson(@NotNull m mVar) {
        mVar.b();
        String str = null;
        int i10 = -1;
        while (mVar.f()) {
            int F = mVar.F(this.options);
            if (F == -1) {
                mVar.M();
                mVar.P();
            } else if (F == 0) {
                str = this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    throw um.c.x("message", "message", mVar);
                }
                i10 = -2;
            } else {
                continue;
            }
        }
        mVar.d();
        if (i10 == -2) {
            return new InternalErrorInfo.NoDiskSpaceErrorInfo(str);
        }
        Constructor<InternalErrorInfo.NoDiskSpaceErrorInfo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = InternalErrorInfo.NoDiskSpaceErrorInfo.class.getDeclaredConstructor(String.class, Integer.TYPE, um.c.f33031c);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(str, Integer.valueOf(i10), null);
    }

    @Override // sm.h
    public void toJson(@NotNull t tVar, @Nullable InternalErrorInfo.NoDiskSpaceErrorInfo noDiskSpaceErrorInfo) {
        if (noDiskSpaceErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n("message");
        this.stringAdapter.toJson(tVar, (t) noDiskSpaceErrorInfo.getMessage());
        tVar.g();
    }
}
