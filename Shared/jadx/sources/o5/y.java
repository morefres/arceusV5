package o5;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public static q f27732a = new o5.a();
    public static ThreadLocal<WeakReference<w1.a<ViewGroup, ArrayList<q>>>> b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    public static ArrayList<ViewGroup> f27733c = new ArrayList<>();

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public q f27734a;
        public ViewGroup b;

        /* renamed from: o5.y$a$a, reason: collision with other inner class name */
        public class C0483a extends x {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ w1.a f27735a;

            public C0483a(w1.a aVar) {
                this.f27735a = aVar;
            }

            @Override // o5.x, o5.q.h
            public void k(@NonNull q qVar) {
                ((ArrayList) this.f27735a.get(a.this.b)).remove(qVar);
                qVar.m0(this);
            }
        }

        public a(q qVar, ViewGroup viewGroup) {
            this.f27734a = qVar;
            this.b = viewGroup;
        }

        public final void a() {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!y.f27733c.remove(this.b)) {
                return true;
            }
            w1.a<ViewGroup, ArrayList<q>> e10 = y.e();
            ArrayList<q> arrayList = e10.get(this.b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                e10.put(this.b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f27734a);
            this.f27734a.c(new C0483a(e10));
            int i10 = 0;
            this.f27734a.p(this.b, false);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((q) obj).o0(this.b);
                }
            }
            this.f27734a.k0(this.b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            y.f27733c.remove(this.b);
            ArrayList<q> arrayList = y.e().get(this.b);
            if (arrayList != null && arrayList.size() > 0) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    q qVar = arrayList.get(i10);
                    i10++;
                    qVar.o0(this.b);
                }
            }
            this.f27734a.q(true);
        }
    }

    public static void a(@NonNull ViewGroup viewGroup, q qVar) {
        if (f27733c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f27733c.add(viewGroup);
        if (qVar == null) {
            qVar = f27732a;
        }
        q clone = qVar.clone();
        h(viewGroup, clone);
        n.f(viewGroup, null);
        g(viewGroup, clone);
    }

    public static void b(n nVar, q qVar) {
        ViewGroup d10 = nVar.d();
        if (f27733c.contains(d10)) {
            return;
        }
        n c10 = n.c(d10);
        if (qVar == null) {
            if (c10 != null) {
                c10.b();
            }
            nVar.a();
            return;
        }
        f27733c.add(d10);
        q clone = qVar.clone();
        if (c10 != null && c10.e()) {
            clone.r0(true);
        }
        h(d10, clone);
        nVar.a();
        g(d10, clone);
    }

    public static a0 c(@NonNull ViewGroup viewGroup, @NonNull q qVar) {
        if (f27733c.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!qVar.Y()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f27733c.add(viewGroup);
        q clone = qVar.clone();
        b0 b0Var = new b0();
        b0Var.D0(clone);
        h(viewGroup, b0Var);
        n.f(viewGroup, null);
        g(viewGroup, b0Var);
        viewGroup.invalidate();
        return b0Var.v();
    }

    public static void d(ViewGroup viewGroup) {
        f27733c.remove(viewGroup);
        ArrayList<q> arrayList = e().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((q) arrayList2.get(size)).x(viewGroup);
        }
    }

    public static w1.a<ViewGroup, ArrayList<q>> e() {
        w1.a<ViewGroup, ArrayList<q>> aVar;
        WeakReference<w1.a<ViewGroup, ArrayList<q>>> weakReference = b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        w1.a<ViewGroup, ArrayList<q>> aVar2 = new w1.a<>();
        b.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    public static void f(@NonNull n nVar, q qVar) {
        b(nVar, qVar);
    }

    public static void g(ViewGroup viewGroup, q qVar) {
        if (qVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(qVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void h(ViewGroup viewGroup, q qVar) {
        ArrayList<q> arrayList = e().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                q qVar2 = arrayList.get(i10);
                i10++;
                qVar2.j0(viewGroup);
            }
        }
        if (qVar != null) {
            qVar.p(viewGroup, true);
        }
        n c10 = n.c(viewGroup);
        if (c10 != null) {
            c10.b();
        }
    }
}
