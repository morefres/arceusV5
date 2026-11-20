package h7;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import f7.h0;
import i7.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class q implements s, a.b {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f19133a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final i7.a<Float, Float> f19134c;

    /* renamed from: d, reason: collision with root package name */
    public n7.o f19135d;

    public q(h0 h0Var, o7.b bVar, n7.n nVar) {
        this.f19133a = h0Var;
        this.b = nVar.c();
        i7.a<Float, Float> a10 = nVar.b().a();
        this.f19134c = a10;
        bVar.j(a10);
        a10.a(this);
    }

    public static int c(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    public static int f(int i10, int i11) {
        return i10 - (c(i10, i11) * i11);
    }

    @Override // i7.a.b
    public void a() {
        this.f19133a.invalidateSelf();
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        if (r7 != (r0.size() - 1)) goto L27;
     */
    @Override // h7.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n7.o d(n7.o r19) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.q.d(n7.o):n7.o");
    }

    @Override // h7.s
    public void g(a.b bVar) {
        this.f19134c.a(bVar);
    }

    public i7.a<Float, Float> h() {
        return this.f19134c;
    }

    @NonNull
    public final n7.o j(n7.o oVar) {
        List<l7.a> a10 = oVar.a();
        boolean d10 = oVar.d();
        int size = a10.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            l7.a aVar = a10.get(size);
            l7.a aVar2 = a10.get(f(size - 1, a10.size()));
            PointF c10 = (size != 0 || d10) ? aVar2.c() : oVar.b();
            i10 = (((size != 0 || d10) ? aVar2.b() : c10).equals(c10) && aVar.a().equals(c10) && !(!oVar.d() && (size == 0 || size == a10.size() - 1))) ? i10 + 2 : i10 + 1;
            size--;
        }
        n7.o oVar2 = this.f19135d;
        if (oVar2 == null || oVar2.a().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new l7.a());
            }
            this.f19135d = new n7.o(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f19135d.e(d10);
        return this.f19135d;
    }
}
