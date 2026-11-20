package e8;

import b8.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f15738e = new C0296a().b();

    /* renamed from: a, reason: collision with root package name */
    public final f f15739a;
    public final List<d> b;

    /* renamed from: c, reason: collision with root package name */
    public final b f15740c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15741d;

    /* renamed from: e8.a$a, reason: collision with other inner class name */
    public static final class C0296a {

        /* renamed from: a, reason: collision with root package name */
        public f f15742a = null;
        public List<d> b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public b f15743c = null;

        /* renamed from: d, reason: collision with root package name */
        public String f15744d = "";

        public C0296a a(d dVar) {
            this.b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f15742a, Collections.unmodifiableList(this.b), this.f15743c, this.f15744d);
        }

        public C0296a c(String str) {
            this.f15744d = str;
            return this;
        }

        public C0296a d(b bVar) {
            this.f15743c = bVar;
            return this;
        }

        public C0296a e(f fVar) {
            this.f15742a = fVar;
            return this;
        }
    }

    public a(f fVar, List<d> list, b bVar, String str) {
        this.f15739a = fVar;
        this.b = list;
        this.f15740c = bVar;
        this.f15741d = str;
    }

    public static C0296a e() {
        return new C0296a();
    }

    @uf.d(tag = 4)
    public String a() {
        return this.f15741d;
    }

    @uf.d(tag = 3)
    public b b() {
        return this.f15740c;
    }

    @uf.d(tag = 2)
    public List<d> c() {
        return this.b;
    }

    @uf.d(tag = 1)
    public f d() {
        return this.f15739a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
