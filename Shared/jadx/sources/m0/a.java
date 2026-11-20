package m0;

import android.graphics.Bitmap;
import m0.k;

/* loaded from: classes.dex */
public final class a extends k.b {

    /* renamed from: a, reason: collision with root package name */
    public final x0.b0<Bitmap> f23923a;
    public final int b;

    public a(x0.b0<Bitmap> b0Var, int i10) {
        if (b0Var == null) {
            throw new NullPointerException("Null packet");
        }
        this.f23923a = b0Var;
        this.b = i10;
    }

    @Override // m0.k.b
    public int a() {
        return this.b;
    }

    @Override // m0.k.b
    public x0.b0<Bitmap> b() {
        return this.f23923a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k.b) {
            k.b bVar = (k.b) obj;
            if (this.f23923a.equals(bVar.b()) && this.b == bVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f23923a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        return "In{packet=" + this.f23923a + ", jpegQuality=" + this.b + "}";
    }
}
