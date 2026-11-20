package jg;

import java.util.Objects;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    public static final e f21691d = new e("", "", false);

    /* renamed from: e, reason: collision with root package name */
    public static final e f21692e = new e("\n", "  ", true);

    /* renamed from: a, reason: collision with root package name */
    public final String f21693a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21694c;

    public e(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f21693a = str;
        this.b = str2;
        this.f21694c = z10;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.f21693a;
    }

    public boolean c() {
        return this.f21694c;
    }

    public e d(String str) {
        return new e(this.f21693a, str, this.f21694c);
    }
}
