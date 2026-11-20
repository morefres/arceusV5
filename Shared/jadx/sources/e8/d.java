package e8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f15758c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final String f15759a;
    public final List<c> b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f15760a = "";
        public List<c> b = new ArrayList();

        public d a() {
            return new d(this.f15760a, Collections.unmodifiableList(this.b));
        }

        public a b(List<c> list) {
            this.b = list;
            return this;
        }

        public a c(String str) {
            this.f15760a = str;
            return this;
        }
    }

    public d(String str, List<c> list) {
        this.f15759a = str;
        this.b = list;
    }

    public static a c() {
        return new a();
    }

    @uf.d(tag = 2)
    public List<c> a() {
        return this.b;
    }

    @uf.d(tag = 1)
    public String b() {
        return this.f15759a;
    }
}
