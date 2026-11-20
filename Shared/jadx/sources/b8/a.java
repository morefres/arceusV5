package b8;

/* loaded from: classes.dex */
public final class a implements sf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final sf.a f3851a = new a();

    /* renamed from: b8.a$a, reason: collision with other inner class name */
    public static final class C0077a implements rf.e<e8.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0077a f3852a = new C0077a();
        public static final rf.d b = rf.d.a("window").b(uf.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        public static final rf.d f3853c = rf.d.a("logSourceMetrics").b(uf.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        public static final rf.d f3854d = rf.d.a("globalMetrics").b(uf.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        public static final rf.d f3855e = rf.d.a("appNamespace").b(uf.a.b().c(4).a()).a();

        @Override // rf.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(e8.a aVar, rf.f fVar) {
            fVar.add(b, aVar.d());
            fVar.add(f3853c, aVar.c());
            fVar.add(f3854d, aVar.b());
            fVar.add(f3855e, aVar.a());
        }
    }

    public static final class b implements rf.e<e8.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f3856a = new b();
        public static final rf.d b = rf.d.a("storageMetrics").b(uf.a.b().c(1).a()).a();

        @Override // rf.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(e8.b bVar, rf.f fVar) {
            fVar.add(b, bVar.a());
        }
    }

    public static final class c implements rf.e<e8.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f3857a = new c();
        public static final rf.d b = rf.d.a("eventsDroppedCount").b(uf.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        public static final rf.d f3858c = rf.d.a("reason").b(uf.a.b().c(3).a()).a();

        @Override // rf.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(e8.c cVar, rf.f fVar) {
            fVar.add(b, cVar.a());
            fVar.add(f3858c, cVar.b());
        }
    }

    public static final class d implements rf.e<e8.d> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f3859a = new d();
        public static final rf.d b = rf.d.a("logSource").b(uf.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        public static final rf.d f3860c = rf.d.a("logEventDropped").b(uf.a.b().c(2).a()).a();

        @Override // rf.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(e8.d dVar, rf.f fVar) {
            fVar.add(b, dVar.b());
            fVar.add(f3860c, dVar.a());
        }
    }

    public static final class e implements rf.e<l> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f3861a = new e();
        public static final rf.d b = rf.d.d("clientMetrics");

        @Override // rf.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(l lVar, rf.f fVar) {
            fVar.add(b, lVar.b());
        }
    }

    public static final class f implements rf.e<e8.e> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f3862a = new f();
        public static final rf.d b = rf.d.a("currentCacheSizeBytes").b(uf.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        public static final rf.d f3863c = rf.d.a("maxCacheSizeBytes").b(uf.a.b().c(2).a()).a();

        @Override // rf.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(e8.e eVar, rf.f fVar) {
            fVar.add(b, eVar.a());
            fVar.add(f3863c, eVar.b());
        }
    }

    public static final class g implements rf.e<e8.f> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f3864a = new g();
        public static final rf.d b = rf.d.a("startMs").b(uf.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        public static final rf.d f3865c = rf.d.a("endMs").b(uf.a.b().c(2).a()).a();

        @Override // rf.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(e8.f fVar, rf.f fVar2) {
            fVar2.add(b, fVar.b());
            fVar2.add(f3865c, fVar.a());
        }
    }

    @Override // sf.a
    public void configure(sf.b<?> bVar) {
        bVar.registerEncoder(l.class, e.f3861a);
        bVar.registerEncoder(e8.a.class, C0077a.f3852a);
        bVar.registerEncoder(e8.f.class, g.f3864a);
        bVar.registerEncoder(e8.d.class, d.f3859a);
        bVar.registerEncoder(e8.c.class, c.f3857a);
        bVar.registerEncoder(e8.b.class, b.f3856a);
        bVar.registerEncoder(e8.e.class, f.f3862a);
    }
}
