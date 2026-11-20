package iv;

import java.util.Objects;

/* loaded from: classes2.dex */
public class m extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f21156a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final transient x<?> f21157c;

    public m(x<?> xVar) {
        super(b(xVar));
        this.f21156a = xVar.b();
        this.b = xVar.h();
        this.f21157c = xVar;
    }

    public static String b(x<?> xVar) {
        Objects.requireNonNull(xVar, "response == null");
        return "HTTP " + xVar.b() + " " + xVar.h();
    }

    public int a() {
        return this.f21156a;
    }

    public String c() {
        return this.b;
    }
}
