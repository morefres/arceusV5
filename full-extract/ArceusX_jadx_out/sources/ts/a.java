package ts;

import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import on.a0;
import on.b0;
import on.c0;
import on.q;
import on.s;
import on.v;
import on.w;
import on.x;
import ss.k;
import ss.m;
import ss.r;
import ss.t;
import ts.b;

/* loaded from: classes3.dex */
public class a extends ss.a {

    /* renamed from: a, reason: collision with root package name */
    public final List<p> f32463a = new ArrayList(0);
    public boolean b;

    /* renamed from: ts.a$a, reason: collision with other inner class name */
    public class C0587a implements m.c<c0> {
        @Override // ss.m.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull c0 c0Var) {
            mVar.g(c0Var);
            int length = mVar.length();
            mVar.builder().append((char) 160);
            mVar.p(c0Var, length);
            mVar.s(c0Var);
        }
    }

    public class b implements m.c<on.j> {
        @Override // ss.m.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.j jVar) {
            mVar.g(jVar);
            int length = mVar.length();
            mVar.a(jVar);
            ts.b.f32467d.d(mVar.n(), Integer.valueOf(jVar.p()));
            mVar.p(jVar, length);
            mVar.s(jVar);
        }
    }

    public class c implements m.c<x> {
        @Override // ss.m.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull x xVar) {
            mVar.builder().append(' ');
        }
    }

    public class d implements m.c<on.i> {
        @Override // ss.m.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.i iVar) {
            mVar.z();
        }
    }

    public class e implements m.c<w> {
        @Override // ss.m.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull w wVar) {
            boolean y10 = a.y(wVar);
            if (!y10) {
                mVar.g(wVar);
            }
            int length = mVar.length();
            mVar.a(wVar);
            ts.b.f32469f.d(mVar.n(), Boolean.valueOf(y10));
            mVar.p(wVar, length);
            if (y10) {
                return;
            }
            mVar.s(wVar);
        }
    }

    public class f implements m.c<on.o> {
        @Override // ss.m.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.o oVar) {
            int length = mVar.length();
            mVar.a(oVar);
            ts.b.f32468e.d(mVar.n(), oVar.o());
            mVar.p(oVar, length);
        }
    }

    public class g implements m.c<b0> {
        public g() {
        }

        @Override // ss.m.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull b0 b0Var) {
            String o8 = b0Var.o();
            mVar.builder().d(o8);
            if (a.this.f32463a.isEmpty()) {
                return;
            }
            int length = mVar.length() - o8.length();
            Iterator it = a.this.f32463a.iterator();
            while (it.hasNext()) {
                ((p) it.next()).a(mVar, o8, length);
            }
        }
    }

    public class h implements m.c<a0> {
        @Override // ss.m.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull a0 a0Var) {
            int length = mVar.length();
            mVar.a(a0Var);
            mVar.p(a0Var, length);
        }
    }

    public class i implements m.c<on.g> {
        @Override // ss.m.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.g gVar) {
            int length = mVar.length();
            mVar.a(gVar);
            mVar.p(gVar, length);
        }
    }

    public class j implements m.c<on.b> {
        @Override // ss.m.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.b bVar) {
            mVar.g(bVar);
            int length = mVar.length();
            mVar.a(bVar);
            mVar.p(bVar, length);
            mVar.s(bVar);
        }
    }

    public class k implements m.c<on.d> {
        @Override // ss.m.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.d dVar) {
            int length = mVar.length();
            mVar.builder().append((char) 160).d(dVar.o()).append((char) 160);
            mVar.p(dVar, length);
        }
    }

    public class l implements m.c<on.h> {
        @Override // ss.m.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.h hVar) {
            a.I(mVar, hVar.r(), hVar.s(), hVar);
        }
    }

    public class m implements m.c<on.n> {
        @Override // ss.m.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.n nVar) {
            a.I(mVar, null, nVar.p(), nVar);
        }
    }

    public class n implements m.c<on.m> {
        @Override // ss.m.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.m mVar2) {
            t a10 = mVar.x().c().a(on.m.class);
            if (a10 == null) {
                mVar.a(mVar2);
                return;
            }
            int length = mVar.length();
            mVar.a(mVar2);
            if (length == mVar.length()) {
                mVar.builder().append((char) 65532);
            }
            ss.g x10 = mVar.x();
            boolean z10 = mVar2.g() instanceof on.o;
            String b = x10.a().b(mVar2.o());
            r n10 = mVar.n();
            ws.c.f34801a.d(n10, b);
            ws.c.b.d(n10, Boolean.valueOf(z10));
            ws.c.f34802c.d(n10, null);
            mVar.b(length, a10.a(x10, n10));
        }
    }

    public class o implements m.c<on.r> {
        @Override // ss.m.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.r rVar) {
            int length = mVar.length();
            mVar.a(rVar);
            on.a g10 = rVar.g();
            if (g10 instanceof v) {
                v vVar = (v) g10;
                int t8 = vVar.t();
                ts.b.f32465a.d(mVar.n(), b.a.ORDERED);
                ts.b.f32466c.d(mVar.n(), Integer.valueOf(t8));
                vVar.w(vVar.t() + 1);
            } else {
                ts.b.f32465a.d(mVar.n(), b.a.BULLET);
                ts.b.b.d(mVar.n(), Integer.valueOf(a.B(rVar)));
            }
            mVar.p(rVar, length);
            if (mVar.d(rVar)) {
                mVar.z();
            }
        }
    }

    public interface p {
        void a(@NonNull ss.m mVar, @NonNull String str, int i10);
    }

    public static void A(@NonNull m.b bVar) {
        bVar.b(on.r.class, new o());
    }

    public static int B(@NonNull s sVar) {
        int i10 = 0;
        for (s g10 = sVar.g(); g10 != null; g10 = g10.g()) {
            if (g10 instanceof on.r) {
                i10++;
            }
        }
        return i10;
    }

    public static void C(@NonNull m.b bVar) {
        bVar.b(v.class, new ts.d());
    }

    public static void D(@NonNull m.b bVar) {
        bVar.b(w.class, new e());
    }

    public static void E(@NonNull m.b bVar) {
        bVar.b(x.class, new c());
    }

    public static void F(@NonNull m.b bVar) {
        bVar.b(a0.class, new h());
    }

    public static void H(@NonNull m.b bVar) {
        bVar.b(c0.class, new C0587a());
    }

    public static void I(@NonNull ss.m mVar, String str, @NonNull String str2, @NonNull s sVar) {
        mVar.g(sVar);
        int length = mVar.length();
        mVar.builder().append((char) 160).append('\n').append(mVar.x().d().a(str, str2));
        mVar.z();
        mVar.builder().append((char) 160);
        ts.b.f32470g.d(mVar.n(), str);
        mVar.p(sVar, length);
        mVar.s(sVar);
    }

    public static void o(@NonNull m.b bVar) {
        bVar.b(on.b.class, new j());
    }

    public static void p(@NonNull m.b bVar) {
        bVar.b(on.c.class, new ts.d());
    }

    public static void q(@NonNull m.b bVar) {
        bVar.b(on.d.class, new k());
    }

    @NonNull
    public static a r() {
        return new a();
    }

    public static void s(@NonNull m.b bVar) {
        bVar.b(on.g.class, new i());
    }

    public static void t(@NonNull m.b bVar) {
        bVar.b(on.h.class, new l());
    }

    public static void u(@NonNull m.b bVar) {
        bVar.b(on.i.class, new d());
    }

    public static void v(@NonNull m.b bVar) {
        bVar.b(on.j.class, new b());
    }

    public static void w(m.b bVar) {
        bVar.b(on.m.class, new n());
    }

    public static void x(@NonNull m.b bVar) {
        bVar.b(on.n.class, new m());
    }

    public static boolean y(@NonNull w wVar) {
        on.a g10 = wVar.g();
        if (g10 == null) {
            return false;
        }
        s g11 = g10.g();
        if (g11 instanceof q) {
            return ((q) g11).p();
        }
        return false;
    }

    public static void z(@NonNull m.b bVar) {
        bVar.b(on.o.class, new f());
    }

    public final void G(@NonNull m.b bVar) {
        bVar.b(b0.class, new g());
    }

    @Override // ss.j
    public void a(@NonNull m.b bVar) {
        G(bVar);
        F(bVar);
        s(bVar);
        o(bVar);
        q(bVar);
        t(bVar);
        x(bVar);
        w(bVar);
        p(bVar);
        C(bVar);
        A(bVar);
        H(bVar);
        v(bVar);
        E(bVar);
        u(bVar);
        D(bVar);
        z(bVar);
    }

    @Override // ss.j
    public void c(@NonNull TextView textView) {
        if (this.b || textView.getMovementMethod() != null) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // ss.j
    public void f(@NonNull k.a aVar) {
        us.b bVar = new us.b();
        aVar.a(a0.class, new us.h()).a(on.g.class, new us.d()).a(on.b.class, new us.a()).a(on.d.class, new us.c()).a(on.h.class, bVar).a(on.n.class, bVar).a(on.r.class, new us.g()).a(on.j.class, new us.e()).a(on.o.class, new us.f()).a(c0.class, new us.i());
    }

    @Override // ss.j
    public void k(@NonNull TextView textView, @NonNull Spanned spanned) {
        vs.h.a(textView, spanned);
        if (spanned instanceof Spannable) {
            vs.j.a((Spannable) spanned, textView);
        }
    }
}
