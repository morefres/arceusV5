package k2;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f22309a;
    public IconCompat b;

    /* renamed from: c, reason: collision with root package name */
    public String f22310c;

    /* renamed from: d, reason: collision with root package name */
    public String f22311d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22312e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22313f;

    public static class a {
        public static r a(PersistableBundle persistableBundle) {
            return new c().e(persistableBundle.getString("name")).f(persistableBundle.getString("uri")).d(persistableBundle.getString("key")).b(persistableBundle.getBoolean("isBot")).c(persistableBundle.getBoolean("isImportant")).a();
        }

        public static PersistableBundle b(r rVar) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = rVar.f22309a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", rVar.f22310c);
            persistableBundle.putString("key", rVar.f22311d);
            persistableBundle.putBoolean("isBot", rVar.f22312e);
            persistableBundle.putBoolean("isImportant", rVar.f22313f);
            return persistableBundle;
        }
    }

    public static class b {
        public static Person a(r rVar) {
            return new Person.Builder().setName(rVar.d()).setIcon(rVar.b() != null ? rVar.b().o() : null).setUri(rVar.e()).setKey(rVar.c()).setBot(rVar.f()).setImportant(rVar.g()).build();
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f22314a;
        public IconCompat b;

        /* renamed from: c, reason: collision with root package name */
        public String f22315c;

        /* renamed from: d, reason: collision with root package name */
        public String f22316d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f22317e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f22318f;

        public r a() {
            return new r(this);
        }

        public c b(boolean z10) {
            this.f22317e = z10;
            return this;
        }

        public c c(boolean z10) {
            this.f22318f = z10;
            return this;
        }

        public c d(String str) {
            this.f22316d = str;
            return this;
        }

        public c e(CharSequence charSequence) {
            this.f22314a = charSequence;
            return this;
        }

        public c f(String str) {
            this.f22315c = str;
            return this;
        }
    }

    public r(c cVar) {
        this.f22309a = cVar.f22314a;
        this.b = cVar.b;
        this.f22310c = cVar.f22315c;
        this.f22311d = cVar.f22316d;
        this.f22312e = cVar.f22317e;
        this.f22313f = cVar.f22318f;
    }

    public static r a(PersistableBundle persistableBundle) {
        return a.a(persistableBundle);
    }

    public IconCompat b() {
        return this.b;
    }

    public String c() {
        return this.f22311d;
    }

    public CharSequence d() {
        return this.f22309a;
    }

    public String e() {
        return this.f22310c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        String c10 = c();
        String c11 = rVar.c();
        return (c10 == null && c11 == null) ? Objects.equals(Objects.toString(d()), Objects.toString(rVar.d())) && Objects.equals(e(), rVar.e()) && Boolean.valueOf(f()).equals(Boolean.valueOf(rVar.f())) && Boolean.valueOf(g()).equals(Boolean.valueOf(rVar.g())) : Objects.equals(c10, c11);
    }

    public boolean f() {
        return this.f22312e;
    }

    public boolean g() {
        return this.f22313f;
    }

    public String h() {
        String str = this.f22310c;
        if (str != null) {
            return str;
        }
        if (this.f22309a == null) {
            return "";
        }
        return "name:" + ((Object) this.f22309a);
    }

    public int hashCode() {
        String c10 = c();
        return c10 != null ? c10.hashCode() : Objects.hash(d(), e(), Boolean.valueOf(f()), Boolean.valueOf(g()));
    }

    public Person i() {
        return b.a(this);
    }

    public Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f22309a);
        IconCompat iconCompat = this.b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.n() : null);
        bundle.putString("uri", this.f22310c);
        bundle.putString("key", this.f22311d);
        bundle.putBoolean("isBot", this.f22312e);
        bundle.putBoolean("isImportant", this.f22313f);
        return bundle;
    }

    public PersistableBundle k() {
        return a.b(this);
    }
}
