package qg;

import com.google.mlkit.common.MlKitException;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public pg.b f29830a;
    public pg.a b;

    /* renamed from: c, reason: collision with root package name */
    public pg.c f29831c;

    /* renamed from: d, reason: collision with root package name */
    public int f29832d = -1;

    /* renamed from: e, reason: collision with root package name */
    public b f29833e;

    public static boolean b(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public b a() {
        return this.f29833e;
    }

    public void c(pg.a aVar) {
        this.b = aVar;
    }

    public void d(int i10) {
        this.f29832d = i10;
    }

    public void e(b bVar) {
        this.f29833e = bVar;
    }

    public void f(pg.b bVar) {
        this.f29830a = bVar;
    }

    public void g(pg.c cVar) {
        this.f29831c = cVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(MlKitException.CODE_SCANNER_UNAVAILABLE);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f29830a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.b);
        sb2.append("\n version: ");
        sb2.append(this.f29831c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f29832d);
        if (this.f29833e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f29833e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
