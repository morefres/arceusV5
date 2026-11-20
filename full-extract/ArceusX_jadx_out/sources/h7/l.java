package h7;

import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import n7.j;

@TargetApi(19)
/* loaded from: classes3.dex */
public class l implements m, j {

    /* renamed from: d, reason: collision with root package name */
    public final String f19092d;

    /* renamed from: f, reason: collision with root package name */
    public final n7.j f19094f;

    /* renamed from: a, reason: collision with root package name */
    public final Path f19090a = new Path();
    public final Path b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f19091c = new Path();

    /* renamed from: e, reason: collision with root package name */
    public final List<m> f19093e = new ArrayList();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19095a;

        static {
            int[] iArr = new int[j.a.values().length];
            f19095a = iArr;
            try {
                iArr[j.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19095a[j.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19095a[j.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19095a[j.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19095a[j.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(n7.j jVar) {
        this.f19092d = jVar.c();
        this.f19094f = jVar;
    }

    public final void a() {
        for (int i10 = 0; i10 < this.f19093e.size(); i10++) {
            this.f19091c.addPath(this.f19093e.get(i10).getPath());
        }
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < this.f19093e.size(); i10++) {
            this.f19093e.get(i10).b(list, list2);
        }
    }

    @TargetApi(19)
    public final void c(Path.Op op2) {
        this.b.reset();
        this.f19090a.reset();
        for (int size = this.f19093e.size() - 1; size >= 1; size--) {
            m mVar = this.f19093e.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List<m> l10 = dVar.l();
                for (int size2 = l10.size() - 1; size2 >= 0; size2--) {
                    Path path = l10.get(size2).getPath();
                    path.transform(dVar.m());
                    this.b.addPath(path);
                }
            } else {
                this.b.addPath(mVar.getPath());
            }
        }
        m mVar2 = this.f19093e.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List<m> l11 = dVar2.l();
            for (int i10 = 0; i10 < l11.size(); i10++) {
                Path path2 = l11.get(i10).getPath();
                path2.transform(dVar2.m());
                this.f19090a.addPath(path2);
            }
        } else {
            this.f19090a.set(mVar2.getPath());
        }
        this.f19091c.op(this.f19090a, this.b, op2);
    }

    @Override // h7.j
    public void f(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c previous = listIterator.previous();
            if (previous instanceof m) {
                this.f19093e.add((m) previous);
                listIterator.remove();
            }
        }
    }

    @Override // h7.m
    public Path getPath() {
        this.f19091c.reset();
        if (this.f19094f.d()) {
            return this.f19091c;
        }
        int i10 = a.f19095a[this.f19094f.b().ordinal()];
        if (i10 == 1) {
            a();
        } else if (i10 == 2) {
            c(Path.Op.UNION);
        } else if (i10 == 3) {
            c(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            c(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            c(Path.Op.XOR);
        }
        return this.f19091c;
    }
}
