package fb;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n9.g f17138a = new n9.g("Games");

    public static void a(String str, String str2) {
        f17138a.b(h(str), str2);
    }

    public static void b(String str, String str2, Throwable th2) {
        f17138a.c(h("GamesApiManager"), "Authentication task failed", th2);
    }

    public static void c(String str, String str2) {
        f17138a.g(h(str), str2);
    }

    public static void d(String str, String str2) {
        f17138a.h(h(str), str2);
    }

    public static void e(String str, String str2, Throwable th2) {
        f17138a.i(h(str), str2, th2);
    }

    public static void f(String str, String str2) {
        f17138a.d(h(str), str2);
    }

    public static void g(String str, String str2, Throwable th2) {
        f17138a.e(h(str), str2, th2);
    }

    public static String h(String str) {
        return String.format("%s[%s]", "PlayGamesServices", str);
    }
}
