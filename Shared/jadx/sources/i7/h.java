package i7;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final List<a<n7.o, Path>> f20218a;
    public final List<a<Integer, Integer>> b;

    /* renamed from: c, reason: collision with root package name */
    public final List<n7.i> f20219c;

    public h(List<n7.i> list) {
        this.f20219c = list;
        this.f20218a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f20218a.add(list.get(i10).b().a());
            this.b.add(list.get(i10).c().a());
        }
    }

    public List<a<n7.o, Path>> a() {
        return this.f20218a;
    }

    public List<n7.i> b() {
        return this.f20219c;
    }

    public List<a<Integer, Integer>> c() {
        return this.b;
    }
}
