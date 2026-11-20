package zf;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class p {
    public static final long b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f38041c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static p f38042d;

    /* renamed from: a, reason: collision with root package name */
    public final dg.a f38043a;

    public p(dg.a aVar) {
        this.f38043a = aVar;
    }

    public static p c() {
        return d(dg.b.b());
    }

    public static p d(dg.a aVar) {
        if (f38042d == null) {
            f38042d = new p(aVar);
        }
        return f38042d;
    }

    public static boolean g(String str) {
        return f38041c.matcher(str).matches();
    }

    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f38043a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(@NonNull bg.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + b;
    }
}
