package l7;

import java.util.List;
import n7.q;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final List<q> f23264a;
    public final char b;

    /* renamed from: c, reason: collision with root package name */
    public final double f23265c;

    /* renamed from: d, reason: collision with root package name */
    public final double f23266d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23267e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23268f;

    public d(List<q> list, char c10, double d10, double d11, String str, String str2) {
        this.f23264a = list;
        this.b = c10;
        this.f23265c = d10;
        this.f23266d = d11;
        this.f23267e = str;
        this.f23268f = str2;
    }

    public static int c(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<q> a() {
        return this.f23264a;
    }

    public double b() {
        return this.f23266d;
    }

    public int hashCode() {
        return c(this.b, this.f23268f, this.f23267e);
    }
}
