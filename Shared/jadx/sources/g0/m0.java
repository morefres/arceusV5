package g0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final List<u1> f17932a;
    public final List<u1> b;

    /* renamed from: c, reason: collision with root package name */
    public final List<u1> f17933c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17934d;

    public m0(a aVar) {
        this.f17932a = Collections.unmodifiableList(aVar.f17935a);
        this.b = Collections.unmodifiableList(aVar.b);
        this.f17933c = Collections.unmodifiableList(aVar.f17936c);
        this.f17934d = aVar.f17937d;
    }

    public long a() {
        return this.f17934d;
    }

    public List<u1> b() {
        return this.b;
    }

    public List<u1> c() {
        return this.f17932a;
    }

    public List<u1> d() {
        return this.f17933c;
    }

    public boolean e() {
        return this.f17934d > 0;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final List<u1> f17935a;
        public final List<u1> b;

        /* renamed from: c, reason: collision with root package name */
        public final List<u1> f17936c;

        /* renamed from: d, reason: collision with root package name */
        public long f17937d;

        public a(u1 u1Var, int i10) {
            this.f17935a = new ArrayList();
            this.b = new ArrayList();
            this.f17936c = new ArrayList();
            this.f17937d = 5000L;
            a(u1Var, i10);
        }

        public a a(u1 u1Var, int i10) {
            boolean z10 = false;
            x2.g.b(u1Var != null, "Point cannot be null.");
            if (i10 >= 1 && i10 <= 7) {
                z10 = true;
            }
            x2.g.b(z10, "Invalid metering mode " + i10);
            if ((i10 & 1) != 0) {
                this.f17935a.add(u1Var);
            }
            if ((i10 & 2) != 0) {
                this.b.add(u1Var);
            }
            if ((i10 & 4) != 0) {
                this.f17936c.add(u1Var);
            }
            return this;
        }

        public m0 b() {
            return new m0(this);
        }

        public a c() {
            this.f17937d = 0L;
            return this;
        }

        public a d(int i10) {
            if ((i10 & 1) != 0) {
                this.f17935a.clear();
            }
            if ((i10 & 2) != 0) {
                this.b.clear();
            }
            if ((i10 & 4) != 0) {
                this.f17936c.clear();
            }
            return this;
        }

        public a e(long j10, TimeUnit timeUnit) {
            x2.g.b(j10 >= 1, "autoCancelDuration must be at least 1");
            this.f17937d = timeUnit.toMillis(j10);
            return this;
        }

        public a(m0 m0Var) {
            ArrayList arrayList = new ArrayList();
            this.f17935a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.f17936c = arrayList3;
            this.f17937d = 5000L;
            arrayList.addAll(m0Var.c());
            arrayList2.addAll(m0Var.b());
            arrayList3.addAll(m0Var.d());
            this.f17937d = m0Var.a();
        }
    }
}
