package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import dn.x;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f10965a;
    public final dt.i<x> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<oq.c> f10966c;

    public g(dt.i<Context> iVar, dt.i<x> iVar2, dt.i<oq.c> iVar3) {
        this.f10965a = iVar;
        this.b = iVar2;
        this.f10966c = iVar3;
    }

    public static g a(dt.i<Context> iVar, dt.i<x> iVar2, dt.i<oq.c> iVar3) {
        return new g(iVar, iVar2, iVar3);
    }

    public static GovernmentIdAnalyzeWorker c(Context context, x xVar, oq.c cVar, IdConfig.b bVar, String str) {
        return new GovernmentIdAnalyzeWorker(context, xVar, cVar, bVar, str);
    }

    public GovernmentIdAnalyzeWorker b(IdConfig.b bVar, String str) {
        return c(this.f10965a.get(), this.b.get(), this.f10966c.get(), bVar, str);
    }
}
