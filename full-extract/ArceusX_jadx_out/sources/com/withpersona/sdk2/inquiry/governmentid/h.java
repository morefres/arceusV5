package com.withpersona.sdk2.inquiry.governmentid;

import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;

/* loaded from: classes3.dex */
public final class h implements GovernmentIdAnalyzeWorker.a {

    /* renamed from: a, reason: collision with root package name */
    public final g f10967a;

    public h(g gVar) {
        this.f10967a = gVar;
    }

    public static dt.i<GovernmentIdAnalyzeWorker.a> b(g gVar) {
        return dt.e.a(new h(gVar));
    }

    @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker.a
    public GovernmentIdAnalyzeWorker a(IdConfig.b bVar, String str) {
        return this.f10967a.b(bVar, str);
    }
}
