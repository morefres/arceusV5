package n7;

import android.graphics.Path;
import f7.h0;

/* loaded from: classes3.dex */
public class p implements c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25902a;
    public final Path.FillType b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25903c;

    /* renamed from: d, reason: collision with root package name */
    public final m7.a f25904d;

    /* renamed from: e, reason: collision with root package name */
    public final m7.d f25905e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f25906f;

    public p(String str, boolean z10, Path.FillType fillType, m7.a aVar, m7.d dVar, boolean z11) {
        this.f25903c = str;
        this.f25902a = z10;
        this.b = fillType;
        this.f25904d = aVar;
        this.f25905e = dVar;
        this.f25906f = z11;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.g(h0Var, bVar, this);
    }

    public m7.a b() {
        return this.f25904d;
    }

    public Path.FillType c() {
        return this.b;
    }

    public String d() {
        return this.f25903c;
    }

    public m7.d e() {
        return this.f25905e;
    }

    public boolean f() {
        return this.f25906f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f25902a + '}';
    }
}
