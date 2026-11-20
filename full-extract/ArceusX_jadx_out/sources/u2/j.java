package u2;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class j {
    public static final j b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    public final k f32594a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final Locale[] f32595a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    public j(k kVar) {
        this.f32594a = kVar;
    }

    public static j a(Locale... localeArr) {
        return h(b.a(localeArr));
    }

    public static j b(String str) {
        if (str == null || str.isEmpty()) {
            return d();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(split[i10]);
        }
        return a(localeArr);
    }

    public static j d() {
        return b;
    }

    public static j h(LocaleList localeList) {
        return new j(new l(localeList));
    }

    public Locale c(int i10) {
        return this.f32594a.get(i10);
    }

    public boolean e() {
        return this.f32594a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) && this.f32594a.equals(((j) obj).f32594a);
    }

    public int f() {
        return this.f32594a.size();
    }

    public String g() {
        return this.f32594a.a();
    }

    public int hashCode() {
        return this.f32594a.hashCode();
    }

    public String toString() {
        return this.f32594a.toString();
    }
}
