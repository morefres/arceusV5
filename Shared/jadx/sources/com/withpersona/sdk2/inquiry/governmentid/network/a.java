package com.withpersona.sdk2.inquiry.governmentid.network;

import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import dt.d;
import dt.i;

/* loaded from: classes3.dex */
public final class a implements d<AutoClassifyWorker.b> {

    /* renamed from: a, reason: collision with root package name */
    public final i<b> f11031a;
    public final i<pq.a> b;

    public a(i<b> iVar, i<pq.a> iVar2) {
        this.f11031a = iVar;
        this.b = iVar2;
    }

    public static a a(i<b> iVar, i<pq.a> iVar2) {
        return new a(iVar, iVar2);
    }

    public static AutoClassifyWorker.b c(b bVar, pq.a aVar) {
        return new AutoClassifyWorker.b(bVar, aVar);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AutoClassifyWorker.b get() {
        return c(this.f11031a.get(), this.b.get());
    }
}
