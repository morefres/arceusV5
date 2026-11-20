package ae;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public final class h implements b {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f425a;
    public final a1 b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f426c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f427d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f428e = new Handler(Looper.getMainLooper());

    public h(a0 a0Var, a1 a1Var, v0 v0Var, c0 c0Var) {
        this.f425a = a0Var;
        this.b = a1Var;
        this.f426c = v0Var;
        this.f427d = c0Var;
    }

    public static List i(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (r2.containsAll(r3) != false) goto L13;
     */
    @Override // ae.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.tasks.Task<java.lang.Integer> a(ae.d r6) {
        /*
            r5 = this;
            be.j1 r0 = new be.j1
            r0.<init>()
            r1 = 1
            r0.b(r1)
            java.util.List r1 = r6.a()
            r1.isEmpty()
            java.util.List r1 = r6.a()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L1b
            goto L46
        L1b:
            ae.v0 r2 = r5.f426c
            java.util.Set r2 = r2.d()
            if (r2 == 0) goto L46
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L40
            java.lang.Object r4 = r1.next()
            java.util.Locale r4 = (java.util.Locale) r4
            java.lang.String r4 = r4.getLanguage()
            r3.add(r4)
            goto L2c
        L40:
            boolean r1 = r2.containsAll(r3)
            if (r1 == 0) goto L7b
        L46:
            java.util.List r1 = r6.b()
            ae.v0 r2 = r5.f426c
            java.util.Set r2 = r2.c()
            boolean r1 = r2.containsAll(r1)
            if (r1 == 0) goto L7b
            java.util.List r1 = r6.b()
            ae.c0 r2 = r5.f427d
            java.util.Set r2 = r2.a()
            boolean r1 = java.util.Collections.disjoint(r1, r2)
            if (r1 != 0) goto L67
            goto L7b
        L67:
            android.os.Handler r0 = r5.f428e
            ae.b1 r1 = new ae.b1
            r1.<init>(r5, r6)
            r0.post(r1)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.gms.tasks.Task r6 = sb.m.f(r6)
            return r6
        L7b:
            ae.c0 r1 = r5.f427d
            java.util.List r2 = r6.b()
            r1.d(r2)
            ae.a0 r1 = r5.f425a
            java.util.List r2 = r6.b()
            java.util.List r6 = r6.a()
            java.util.List r6 = i(r6)
            com.google.android.gms.tasks.Task r6 = r1.e(r2, r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.h.a(ae.d):com.google.android.gms.tasks.Task");
    }

    @Override // ae.b
    public final synchronized void b(f fVar) {
        this.b.d(fVar);
    }

    @Override // ae.b
    public final synchronized void c(f fVar) {
        this.b.b(fVar);
    }

    @Override // ae.b
    public final Task<Void> d(List<String> list) {
        this.f427d.c(list);
        return this.f425a.d(list);
    }

    @Override // ae.b
    public final Set<String> e() {
        return this.f426c.c();
    }

    @Override // ae.b
    public final Task<Void> f(List<String> list) {
        return this.f425a.c(list);
    }
}
