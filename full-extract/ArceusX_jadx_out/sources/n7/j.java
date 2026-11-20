package n7;

import f7.h0;
import f7.i0;

/* loaded from: classes3.dex */
public class j implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f25871a;
    public final a b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25872c;

    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a b(int i10) {
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public j(String str, a aVar, boolean z10) {
        this.f25871a = str;
        this.b = aVar;
        this.f25872c = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        if (h0Var.h0(i0.MergePathsApi19)) {
            return new h7.l(this);
        }
        s7.e.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public a b() {
        return this.b;
    }

    public String c() {
        return this.f25871a;
    }

    public boolean d() {
        return this.f25872c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.b + '}';
    }
}
