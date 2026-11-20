package i7;

import java.util.List;

/* loaded from: classes3.dex */
public class e extends g<n7.d> {

    /* renamed from: i, reason: collision with root package name */
    public final n7.d f20217i;

    public e(List<t7.a<n7.d>> list) {
        super(list);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            n7.d dVar = list.get(i11).b;
            if (dVar != null) {
                i10 = Math.max(i10, dVar.f());
            }
        }
        this.f20217i = new n7.d(new float[i10], new int[i10]);
    }

    @Override // i7.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public n7.d i(t7.a<n7.d> aVar, float f10) {
        this.f20217i.g(aVar.b, aVar.f32052c, f10);
        return this.f20217i;
    }
}
