package com.google.firebase.messaging;

import androidx.core.app.NotificationCompat;

/* loaded from: classes2.dex */
public final class a implements sf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final sf.a f8768a = new a();

    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    public static final class C0135a implements rf.e<fg.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0135a f8769a = new C0135a();
        public static final rf.d b = rf.d.a("projectNumber").b(uf.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        public static final rf.d f8770c = rf.d.a("messageId").b(uf.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        public static final rf.d f8771d = rf.d.a("instanceId").b(uf.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        public static final rf.d f8772e = rf.d.a("messageType").b(uf.a.b().c(4).a()).a();

        /* renamed from: f, reason: collision with root package name */
        public static final rf.d f8773f = rf.d.a("sdkPlatform").b(uf.a.b().c(5).a()).a();

        /* renamed from: g, reason: collision with root package name */
        public static final rf.d f8774g = rf.d.a("packageName").b(uf.a.b().c(6).a()).a();

        /* renamed from: h, reason: collision with root package name */
        public static final rf.d f8775h = rf.d.a("collapseKey").b(uf.a.b().c(7).a()).a();

        /* renamed from: i, reason: collision with root package name */
        public static final rf.d f8776i = rf.d.a("priority").b(uf.a.b().c(8).a()).a();

        /* renamed from: j, reason: collision with root package name */
        public static final rf.d f8777j = rf.d.a("ttl").b(uf.a.b().c(9).a()).a();

        /* renamed from: k, reason: collision with root package name */
        public static final rf.d f8778k = rf.d.a("topic").b(uf.a.b().c(10).a()).a();

        /* renamed from: l, reason: collision with root package name */
        public static final rf.d f8779l = rf.d.a("bulkId").b(uf.a.b().c(11).a()).a();

        /* renamed from: m, reason: collision with root package name */
        public static final rf.d f8780m = rf.d.a(NotificationCompat.CATEGORY_EVENT).b(uf.a.b().c(12).a()).a();

        /* renamed from: n, reason: collision with root package name */
        public static final rf.d f8781n = rf.d.a("analyticsLabel").b(uf.a.b().c(13).a()).a();

        /* renamed from: o, reason: collision with root package name */
        public static final rf.d f8782o = rf.d.a("campaignId").b(uf.a.b().c(14).a()).a();

        /* renamed from: p, reason: collision with root package name */
        public static final rf.d f8783p = rf.d.a("composerLabel").b(uf.a.b().c(15).a()).a();

        @Override // rf.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(fg.a aVar, rf.f fVar) {
            fVar.add(b, aVar.l());
            fVar.add(f8770c, aVar.h());
            fVar.add(f8771d, aVar.g());
            fVar.add(f8772e, aVar.i());
            fVar.add(f8773f, aVar.m());
            fVar.add(f8774g, aVar.j());
            fVar.add(f8775h, aVar.d());
            fVar.add(f8776i, aVar.k());
            fVar.add(f8777j, aVar.o());
            fVar.add(f8778k, aVar.n());
            fVar.add(f8779l, aVar.b());
            fVar.add(f8780m, aVar.f());
            fVar.add(f8781n, aVar.a());
            fVar.add(f8782o, aVar.c());
            fVar.add(f8783p, aVar.e());
        }
    }

    public static final class b implements rf.e<fg.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f8784a = new b();
        public static final rf.d b = rf.d.a("messagingClientEvent").b(uf.a.b().c(1).a()).a();

        @Override // rf.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(fg.b bVar, rf.f fVar) {
            fVar.add(b, bVar.a());
        }
    }

    public static final class c implements rf.e<i0> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f8785a = new c();
        public static final rf.d b = rf.d.d("messagingClientEventExtension");

        @Override // rf.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(i0 i0Var, rf.f fVar) {
            fVar.add(b, i0Var.b());
        }
    }

    @Override // sf.a
    public void configure(sf.b<?> bVar) {
        bVar.registerEncoder(i0.class, c.f8785a);
        bVar.registerEncoder(fg.b.class, b.f8784a);
        bVar.registerEncoder(fg.a.class, C0135a.f8769a);
    }
}
