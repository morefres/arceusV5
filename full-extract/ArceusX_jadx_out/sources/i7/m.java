package i7;

import android.graphics.Path;
import h7.s;
import java.util.List;

/* loaded from: classes3.dex */
public class m extends a<n7.o, Path> {

    /* renamed from: i, reason: collision with root package name */
    public final n7.o f20229i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f20230j;

    /* renamed from: k, reason: collision with root package name */
    public Path f20231k;

    /* renamed from: l, reason: collision with root package name */
    public Path f20232l;

    /* renamed from: m, reason: collision with root package name */
    public List<s> f20233m;

    public m(List<t7.a<n7.o>> list) {
        super(list);
        this.f20229i = new n7.o();
        this.f20230j = new Path();
    }

    @Override // i7.a
    public boolean p() {
        List<s> list = this.f20233m;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // i7.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Path i(t7.a<n7.o> aVar, float f10) {
        n7.o oVar = aVar.b;
        n7.o oVar2 = aVar.f32052c;
        this.f20229i.c(oVar, oVar2 == null ? oVar : oVar2, f10);
        n7.o oVar3 = this.f20229i;
        List<s> list = this.f20233m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                oVar3 = this.f20233m.get(size).d(oVar3);
            }
        }
        s7.j.h(oVar3, this.f20230j);
        if (this.f20200e == null) {
            return this.f20230j;
        }
        if (this.f20231k == null) {
            this.f20231k = new Path();
            this.f20232l = new Path();
        }
        s7.j.h(oVar, this.f20231k);
        if (oVar2 != null) {
            s7.j.h(oVar2, this.f20232l);
        }
        t7.c<A> cVar = this.f20200e;
        float f11 = aVar.f32056g;
        float floatValue = aVar.f32057h.floatValue();
        Path path = this.f20231k;
        return (Path) cVar.b(f11, floatValue, path, oVar2 == null ? path : this.f20232l, f10, e(), f());
    }

    public void s(List<s> list) {
        this.f20233m = list;
    }
}
