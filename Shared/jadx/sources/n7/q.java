package n7;

import f7.h0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class q implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f25907a;
    public final List<c> b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25908c;

    public q(String str, List<c> list, boolean z10) {
        this.f25907a = str;
        this.b = list;
        this.f25908c = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.d(h0Var, bVar, this, iVar);
    }

    public List<c> b() {
        return this.b;
    }

    public String c() {
        return this.f25907a;
    }

    public boolean d() {
        return this.f25908c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f25907a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
