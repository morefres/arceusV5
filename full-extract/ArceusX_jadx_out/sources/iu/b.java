package iu;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Liu/b;", "", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", ve.a.f33391e, "Ljava/util/concurrent/TimeUnit;", j6.b.f21518e, "()Ljava/util/concurrent/TimeUnit;", "c", rl.d.f30696a, "e", "f", "g", "h", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {
    public static final b b = new b("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* renamed from: c, reason: collision with root package name */
    public static final b f21119c = new b("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* renamed from: d, reason: collision with root package name */
    public static final b f21120d = new b("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* renamed from: e, reason: collision with root package name */
    public static final b f21121e = new b("SECONDS", 3, TimeUnit.SECONDS);

    /* renamed from: f, reason: collision with root package name */
    public static final b f21122f = new b("MINUTES", 4, TimeUnit.MINUTES);

    /* renamed from: g, reason: collision with root package name */
    public static final b f21123g = new b("HOURS", 5, TimeUnit.HOURS);

    /* renamed from: h, reason: collision with root package name */
    public static final b f21124h = new b("DAYS", 6, TimeUnit.DAYS);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b[] f21125i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ pt.a f21126j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TimeUnit timeUnit;

    static {
        b[] a10 = a();
        f21125i = a10;
        f21126j = pt.b.a(a10);
    }

    public b(String str, int i10, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{b, f21119c, f21120d, f21121e, f21122f, f21123g, f21124h};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f21125i.clone();
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final TimeUnit getTimeUnit() {
        return this.timeUnit;
    }
}
