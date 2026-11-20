package j6;

import android.net.Uri;
import backtraceio.library.logger.BacktraceLogger;

/* loaded from: classes.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    public static final transient String f21518e = "b";

    /* renamed from: a, reason: collision with root package name */
    public final String f21519a = "json";
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f21520c;

    /* renamed from: d, reason: collision with root package name */
    public Uri f21521d;

    public b(String str, String str2) {
        this.b = str;
        this.f21520c = str2;
    }

    public final Uri a() {
        return this.f21521d;
    }

    public final String b() {
        return this.b;
    }

    public Uri c() {
        String replace;
        String uri = f().toString();
        if (uri.contains("format=json")) {
            replace = uri.replace("format=json", "format=minidump");
        } else {
            if (!uri.contains("/json")) {
                return null;
            }
            replace = uri.replace("/json", "/minidump");
        }
        return Uri.parse(replace);
    }

    public final Uri d() {
        String b = b();
        return Uri.parse(String.format("%s%spost?format=%s&token=%s", b, b.endsWith("/") ? "" : "/", "json", e()));
    }

    public String e() {
        String str = this.f21520c;
        if (str != null) {
            return str;
        }
        String uri = f().toString();
        int lastIndexOf = uri.lastIndexOf("/");
        if (uri.contains("submit.backtrace.io")) {
            int i10 = lastIndexOf - 64;
            if (i10 < 0) {
                return null;
            }
            return uri.substring(i10, lastIndexOf);
        }
        int indexOf = uri.indexOf("token=");
        if (indexOf == -1) {
            return null;
        }
        return uri.substring(indexOf + 6, indexOf + 70);
    }

    public Uri f() {
        Uri a10 = a();
        return a10 != null ? a10 : d();
    }

    public String g() {
        String uri = f().toString();
        if (uri.startsWith("https://submit.backtrace.io/")) {
            int indexOf = uri.indexOf(47, 28);
            if (indexOf != -1) {
                return uri.substring(28, indexOf);
            }
            BacktraceLogger.w(f21518e, "Missed universe in server URL: " + uri);
            return null;
        }
        if (uri.indexOf("backtrace.io") != -1) {
            Uri parse = Uri.parse(uri);
            return parse.getHost().substring(0, parse.getHost().indexOf("."));
        }
        BacktraceLogger.w(f21518e, "Missed universe in server URL: " + uri);
        return null;
    }
}
