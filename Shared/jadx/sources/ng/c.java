package ng;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a f27095a;
    public final List<b> b;

    public c(a aVar) {
        this.f27095a = aVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    public final b a(int i10) {
        if (i10 >= this.b.size()) {
            List<b> list = this.b;
            b bVar = list.get(list.size() - 1);
            for (int size = this.b.size(); size <= i10; size++) {
                a aVar = this.f27095a;
                bVar = bVar.g(new b(aVar, new int[]{1, aVar.c((size - 1) + aVar.d())}));
                this.b.add(bVar);
            }
        }
        return this.b.get(i10);
    }

    public void b(int[] iArr, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i10;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        b a10 = a(i10);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] d10 = new b(this.f27095a, iArr2).h(i10, 1).b(a10)[1].d();
        int length2 = i10 - d10.length;
        for (int i11 = 0; i11 < length2; i11++) {
            iArr[length + i11] = 0;
        }
        System.arraycopy(d10, 0, iArr, length + length2, d10.length);
    }
}
