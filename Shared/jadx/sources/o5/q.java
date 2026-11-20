package o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o5.q;
import y3.b;

/* loaded from: classes.dex */
public abstract class q implements Cloneable {
    public static final Animator[] M = new Animator[0];
    public static final int[] N = {2, 1, 3, 4};
    public static final k O = new a();
    public static ThreadLocal<w1.a<Animator, d>> P = new ThreadLocal<>();
    public z F;
    public e G;
    public w1.a<String, String> H;
    public long J;
    public g K;
    public long L;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList<d0> f27704t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList<d0> f27705u;

    /* renamed from: v, reason: collision with root package name */
    public h[] f27706v;

    /* renamed from: a, reason: collision with root package name */
    public String f27686a = getClass().getName();
    public long b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f27687c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f27688d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<Integer> f27689e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    public ArrayList<View> f27690f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList<String> f27691g = null;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<Class<?>> f27692h = null;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList<Integer> f27693i = null;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList<View> f27694j = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList<Class<?>> f27695k = null;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList<String> f27696l = null;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList<Integer> f27697m = null;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList<View> f27698n = null;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<Class<?>> f27699o = null;

    /* renamed from: p, reason: collision with root package name */
    public e0 f27700p = new e0();

    /* renamed from: q, reason: collision with root package name */
    public e0 f27701q = new e0();

    /* renamed from: r, reason: collision with root package name */
    public b0 f27702r = null;

    /* renamed from: s, reason: collision with root package name */
    public int[] f27703s = N;

    /* renamed from: w, reason: collision with root package name */
    public boolean f27707w = false;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList<Animator> f27708x = new ArrayList<>();

    /* renamed from: y, reason: collision with root package name */
    public Animator[] f27709y = M;

    /* renamed from: z, reason: collision with root package name */
    public int f27710z = 0;
    public boolean A = false;
    public boolean B = false;
    public q C = null;
    public ArrayList<h> D = null;
    public ArrayList<Animator> E = new ArrayList<>();
    public k I = O;

    public class a extends k {
        @Override // o5.k
        @NonNull
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w1.a f27711a;

        public b(w1.a aVar) {
            this.f27711a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f27711a.remove(animator);
            q.this.f27708x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            q.this.f27708x.add(animator);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            q.this.w();
            animator.removeListener(this);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public View f27713a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public d0 f27714c;

        /* renamed from: d, reason: collision with root package name */
        public WindowId f27715d;

        /* renamed from: e, reason: collision with root package name */
        public q f27716e;

        /* renamed from: f, reason: collision with root package name */
        public Animator f27717f;

        public d(View view, String str, q qVar, WindowId windowId, d0 d0Var, Animator animator) {
            this.f27713a = view;
            this.b = str;
            this.f27714c = d0Var;
            this.f27715d = windowId;
            this.f27716e = qVar;
            this.f27717f = animator;
        }
    }

    public static abstract class e {
        public abstract Rect a(@NonNull q qVar);
    }

    public static class f {
        public static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        public static void b(Animator animator, long j10) {
            ((AnimatorSet) animator).setCurrentPlayTime(j10);
        }
    }

    public class g extends x implements a0, b.r {

        /* renamed from: d, reason: collision with root package name */
        public boolean f27720d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f27721e;

        /* renamed from: f, reason: collision with root package name */
        public y3.e f27722f;

        /* renamed from: i, reason: collision with root package name */
        public Runnable f27725i;

        /* renamed from: a, reason: collision with root package name */
        public long f27718a = -1;
        public ArrayList<x2.a<a0>> b = null;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<x2.a<a0>> f27719c = null;

        /* renamed from: g, reason: collision with root package name */
        public x2.a<a0>[] f27723g = null;

        /* renamed from: h, reason: collision with root package name */
        public final g0 f27724h = new g0();

        public g() {
        }

        public static /* synthetic */ void m(g gVar, y3.b bVar, boolean z10, float f10, float f11) {
            if (z10) {
                gVar.getClass();
                return;
            }
            if (f10 >= 1.0f) {
                q.this.i0(i.b, false);
                return;
            }
            long f12 = gVar.f();
            q F0 = ((b0) q.this).F0(0);
            q qVar = F0.C;
            F0.C = null;
            q.this.s0(-1L, gVar.f27718a);
            q.this.s0(f12, -1L);
            gVar.f27718a = f12;
            Runnable runnable = gVar.f27725i;
            if (runnable != null) {
                runnable.run();
            }
            q.this.E.clear();
            if (qVar != null) {
                qVar.i0(i.b, true);
            }
        }

        @Override // o5.x, o5.q.h
        public void a(@NonNull q qVar) {
            this.f27721e = true;
        }

        @Override // o5.a0
        public void c() {
            o();
            this.f27722f.s(f() + 1);
        }

        @Override // y3.b.r
        public void e(y3.b bVar, float f10, float f11) {
            long max = Math.max(-1L, Math.min(f() + 1, Math.round(f10)));
            q.this.s0(max, this.f27718a);
            this.f27718a = max;
            n();
        }

        @Override // o5.a0
        public long f() {
            return q.this.U();
        }

        @Override // o5.a0
        public void h(long j10) {
            if (this.f27722f != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j10 == this.f27718a || !isReady()) {
                return;
            }
            if (!this.f27721e) {
                if (j10 != 0 || this.f27718a <= 0) {
                    long f10 = f();
                    if (j10 == f10 && this.f27718a < f10) {
                        j10 = 1 + f10;
                    }
                } else {
                    j10 = -1;
                }
                long j11 = this.f27718a;
                if (j10 != j11) {
                    q.this.s0(j10, j11);
                    this.f27718a = j10;
                }
            }
            n();
            this.f27724h.a(AnimationUtils.currentAnimationTimeMillis(), j10);
        }

        @Override // o5.a0
        public boolean isReady() {
            return this.f27720d;
        }

        @Override // o5.a0
        public void j(@NonNull Runnable runnable) {
            this.f27725i = runnable;
            o();
            this.f27722f.s(0.0f);
        }

        public final void n() {
            ArrayList<x2.a<a0>> arrayList = this.f27719c;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f27719c.size();
            if (this.f27723g == null) {
                this.f27723g = new x2.a[size];
            }
            x2.a<a0>[] aVarArr = (x2.a[]) this.f27719c.toArray(this.f27723g);
            this.f27723g = null;
            for (int i10 = 0; i10 < size; i10++) {
                aVarArr[i10].accept(this);
                aVarArr[i10] = null;
            }
            this.f27723g = aVarArr;
        }

        public final void o() {
            if (this.f27722f != null) {
                return;
            }
            this.f27724h.a(AnimationUtils.currentAnimationTimeMillis(), this.f27718a);
            this.f27722f = new y3.e(new y3.d());
            y3.f fVar = new y3.f();
            fVar.d(1.0f);
            fVar.f(200.0f);
            this.f27722f.w(fVar);
            this.f27722f.m(this.f27718a);
            this.f27722f.c(this);
            this.f27722f.n(this.f27724h.b());
            this.f27722f.i(f() + 1);
            this.f27722f.j(-1.0f);
            this.f27722f.k(4.0f);
            this.f27722f.b(new b.q() { // from class: o5.r
                @Override // y3.b.q
                public final void a(y3.b bVar, boolean z10, float f10, float f11) {
                    q.g.m(q.g.this, bVar, z10, f10, f11);
                }
            });
        }

        public void p() {
            long j10 = f() == 0 ? 1L : 0L;
            q.this.s0(j10, this.f27718a);
            this.f27718a = j10;
        }

        public void q() {
            this.f27720d = true;
            ArrayList<x2.a<a0>> arrayList = this.b;
            if (arrayList != null) {
                this.b = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(this);
                }
            }
            n();
        }
    }

    public interface h {
        void a(@NonNull q qVar);

        void b(@NonNull q qVar);

        void d(@NonNull q qVar);

        void g(@NonNull q qVar);

        default void i(@NonNull q qVar, boolean z10) {
            g(qVar);
        }

        void k(@NonNull q qVar);

        default void l(@NonNull q qVar, boolean z10) {
            k(qVar);
        }
    }

    public interface i {

        /* renamed from: a, reason: collision with root package name */
        public static final i f27727a = new i() { // from class: o5.s
            @Override // o5.q.i
            public final void a(q.h hVar, q qVar, boolean z10) {
                hVar.i(qVar, z10);
            }
        };
        public static final i b = new i() { // from class: o5.t
            @Override // o5.q.i
            public final void a(q.h hVar, q qVar, boolean z10) {
                hVar.l(qVar, z10);
            }
        };

        /* renamed from: c, reason: collision with root package name */
        public static final i f27728c = new i() { // from class: o5.u
            @Override // o5.q.i
            public final void a(q.h hVar, q qVar, boolean z10) {
                hVar.a(qVar);
            }
        };

        /* renamed from: d, reason: collision with root package name */
        public static final i f27729d = new i() { // from class: o5.v
            @Override // o5.q.i
            public final void a(q.h hVar, q qVar, boolean z10) {
                hVar.d(qVar);
            }
        };

        /* renamed from: e, reason: collision with root package name */
        public static final i f27730e = new i() { // from class: o5.w
            @Override // o5.q.i
            public final void a(q.h hVar, q qVar, boolean z10) {
                hVar.b(qVar);
            }
        };

        void a(@NonNull h hVar, @NonNull q qVar, boolean z10);
    }

    public static w1.a<Animator, d> O() {
        w1.a<Animator, d> aVar = P.get();
        if (aVar != null) {
            return aVar;
        }
        w1.a<Animator, d> aVar2 = new w1.a<>();
        P.set(aVar2);
        return aVar2;
    }

    public static boolean b0(d0 d0Var, d0 d0Var2, String str) {
        Object obj = d0Var.f27618a.get(str);
        Object obj2 = d0Var2.f27618a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void h(e0 e0Var, View view, d0 d0Var) {
        e0Var.f27621a.put(view, d0Var);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (e0Var.b.indexOfKey(id2) >= 0) {
                e0Var.b.put(id2, null);
            } else {
                e0Var.b.put(id2, view);
            }
        }
        String H = androidx.core.view.o0.H(view);
        if (H != null) {
            if (e0Var.f27623d.containsKey(H)) {
                e0Var.f27623d.put(H, null);
            } else {
                e0Var.f27623d.put(H, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (e0Var.f27622c.f(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    e0Var.f27622c.i(itemIdAtPosition, view);
                    return;
                }
                View e10 = e0Var.f27622c.e(itemIdAtPosition);
                if (e10 != null) {
                    e10.setHasTransientState(false);
                    e0Var.f27622c.i(itemIdAtPosition, null);
                }
            }
        }
    }

    public Rect A() {
        e eVar = this.G;
        if (eVar == null) {
            return null;
        }
        return eVar.a(this);
    }

    public String A0(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f27687c != -1) {
            sb2.append("dur(");
            sb2.append(this.f27687c);
            sb2.append(") ");
        }
        if (this.b != -1) {
            sb2.append("dly(");
            sb2.append(this.b);
            sb2.append(") ");
        }
        if (this.f27688d != null) {
            sb2.append("interp(");
            sb2.append(this.f27688d);
            sb2.append(") ");
        }
        if (this.f27689e.size() > 0 || this.f27690f.size() > 0) {
            sb2.append("tgts(");
            if (this.f27689e.size() > 0) {
                for (int i10 = 0; i10 < this.f27689e.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f27689e.get(i10));
                }
            }
            if (this.f27690f.size() > 0) {
                for (int i11 = 0; i11 < this.f27690f.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f27690f.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public e C() {
        return this.G;
    }

    public TimeInterpolator D() {
        return this.f27688d;
    }

    public d0 E(View view, boolean z10) {
        b0 b0Var = this.f27702r;
        if (b0Var != null) {
            return b0Var.E(view, z10);
        }
        ArrayList<d0> arrayList = z10 ? this.f27704t : this.f27705u;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            d0 d0Var = arrayList.get(i10);
            if (d0Var == null) {
                return null;
            }
            if (d0Var.b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (z10 ? this.f27705u : this.f27704t).get(i10);
        }
        return null;
    }

    @NonNull
    public String G() {
        return this.f27686a;
    }

    @NonNull
    public k J() {
        return this.I;
    }

    public z K() {
        return this.F;
    }

    @NonNull
    public final q N() {
        b0 b0Var = this.f27702r;
        return b0Var != null ? b0Var.N() : this;
    }

    public long P() {
        return this.b;
    }

    @NonNull
    public List<Integer> Q() {
        return this.f27689e;
    }

    public List<String> R() {
        return this.f27691g;
    }

    public List<Class<?>> S() {
        return this.f27692h;
    }

    @NonNull
    public List<View> T() {
        return this.f27690f;
    }

    public final long U() {
        return this.J;
    }

    public String[] V() {
        return null;
    }

    public d0 W(@NonNull View view, boolean z10) {
        b0 b0Var = this.f27702r;
        if (b0Var != null) {
            return b0Var.W(view, z10);
        }
        return (z10 ? this.f27700p : this.f27701q).f27621a.get(view);
    }

    public boolean X() {
        return !this.f27708x.isEmpty();
    }

    public boolean Y() {
        return false;
    }

    public boolean Z(d0 d0Var, d0 d0Var2) {
        if (d0Var != null && d0Var2 != null) {
            String[] V = V();
            if (V != null) {
                for (String str : V) {
                    if (b0(d0Var, d0Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator<String> it = d0Var.f27618a.keySet().iterator();
                while (it.hasNext()) {
                    if (b0(d0Var, d0Var2, it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean a0(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f27693i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f27694j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f27695k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f27695k.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f27696l != null && androidx.core.view.o0.H(view) != null && this.f27696l.contains(androidx.core.view.o0.H(view))) {
            return false;
        }
        if ((this.f27689e.size() == 0 && this.f27690f.size() == 0 && (((arrayList = this.f27692h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f27691g) == null || arrayList2.isEmpty()))) || this.f27689e.contains(Integer.valueOf(id2)) || this.f27690f.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f27691g;
        if (arrayList6 != null && arrayList6.contains(androidx.core.view.o0.H(view))) {
            return true;
        }
        if (this.f27692h != null) {
            for (int i11 = 0; i11 < this.f27692h.size(); i11++) {
                if (this.f27692h.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    @NonNull
    public q c(@NonNull h hVar) {
        if (this.D == null) {
            this.D = new ArrayList<>();
        }
        this.D.add(hVar);
        return this;
    }

    public final void c0(w1.a<View, d0> aVar, w1.a<View, d0> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View valueAt = sparseArray.valueAt(i10);
            if (valueAt != null && a0(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && a0(view)) {
                d0 d0Var = aVar.get(valueAt);
                d0 d0Var2 = aVar2.get(view);
                if (d0Var != null && d0Var2 != null) {
                    this.f27704t.add(d0Var);
                    this.f27705u.add(d0Var2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    public void cancel() {
        int size = this.f27708x.size();
        Animator[] animatorArr = (Animator[]) this.f27708x.toArray(this.f27709y);
        this.f27709y = M;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.f27709y = animatorArr;
        i0(i.f27728c, false);
    }

    public final void d0(w1.a<View, d0> aVar, w1.a<View, d0> aVar2) {
        d0 remove;
        for (int size = aVar.getSize() - 1; size >= 0; size--) {
            View f10 = aVar.f(size);
            if (f10 != null && a0(f10) && (remove = aVar2.remove(f10)) != null && a0(remove.b)) {
                this.f27704t.add(aVar.i(size));
                this.f27705u.add(remove);
            }
        }
    }

    @NonNull
    public q e(@NonNull View view) {
        this.f27690f.add(view);
        return this;
    }

    public final void e0(w1.a<View, d0> aVar, w1.a<View, d0> aVar2, w1.g<View> gVar, w1.g<View> gVar2) {
        View e10;
        int n10 = gVar.n();
        for (int i10 = 0; i10 < n10; i10++) {
            View o8 = gVar.o(i10);
            if (o8 != null && a0(o8) && (e10 = gVar2.e(gVar.h(i10))) != null && a0(e10)) {
                d0 d0Var = aVar.get(o8);
                d0 d0Var2 = aVar2.get(e10);
                if (d0Var != null && d0Var2 != null) {
                    this.f27704t.add(d0Var);
                    this.f27705u.add(d0Var2);
                    aVar.remove(o8);
                    aVar2.remove(e10);
                }
            }
        }
    }

    public final void f(w1.a<View, d0> aVar, w1.a<View, d0> aVar2) {
        for (int i10 = 0; i10 < aVar.getSize(); i10++) {
            d0 k10 = aVar.k(i10);
            if (a0(k10.b)) {
                this.f27704t.add(k10);
                this.f27705u.add(null);
            }
        }
        for (int i11 = 0; i11 < aVar2.getSize(); i11++) {
            d0 k11 = aVar2.k(i11);
            if (a0(k11.b)) {
                this.f27705u.add(k11);
                this.f27704t.add(null);
            }
        }
    }

    public final void f0(w1.a<View, d0> aVar, w1.a<View, d0> aVar2, w1.a<String, View> aVar3, w1.a<String, View> aVar4) {
        View view;
        int size = aVar3.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            View k10 = aVar3.k(i10);
            if (k10 != null && a0(k10) && (view = aVar4.get(aVar3.f(i10))) != null && a0(view)) {
                d0 d0Var = aVar.get(k10);
                d0 d0Var2 = aVar2.get(view);
                if (d0Var != null && d0Var2 != null) {
                    this.f27704t.add(d0Var);
                    this.f27705u.add(d0Var2);
                    aVar.remove(k10);
                    aVar2.remove(view);
                }
            }
        }
    }

    public final void g0(e0 e0Var, e0 e0Var2) {
        w1.a<View, d0> aVar = new w1.a<>(e0Var.f27621a);
        w1.a<View, d0> aVar2 = new w1.a<>(e0Var2.f27621a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f27703s;
            if (i10 >= iArr.length) {
                f(aVar, aVar2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                d0(aVar, aVar2);
            } else if (i11 == 2) {
                f0(aVar, aVar2, e0Var.f27623d, e0Var2.f27623d);
            } else if (i11 == 3) {
                c0(aVar, aVar2, e0Var.b, e0Var2.b);
            } else if (i11 == 4) {
                e0(aVar, aVar2, e0Var.f27622c, e0Var2.f27622c);
            }
            i10++;
        }
    }

    public final void h0(q qVar, i iVar, boolean z10) {
        q qVar2 = this.C;
        if (qVar2 != null) {
            qVar2.h0(qVar, iVar, z10);
        }
        ArrayList<h> arrayList = this.D;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.D.size();
        h[] hVarArr = this.f27706v;
        if (hVarArr == null) {
            hVarArr = new h[size];
        }
        this.f27706v = null;
        h[] hVarArr2 = (h[]) this.D.toArray(hVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            iVar.a(hVarArr2[i10], qVar, z10);
            hVarArr2[i10] = null;
        }
        this.f27706v = hVarArr2;
    }

    public void i(Animator animator) {
        if (animator == null) {
            w();
            return;
        }
        if (z() >= 0) {
            animator.setDuration(z());
        }
        if (P() >= 0) {
            animator.setStartDelay(P() + animator.getStartDelay());
        }
        if (D() != null) {
            animator.setInterpolator(D());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void i0(i iVar, boolean z10) {
        h0(this, iVar, z10);
    }

    public abstract void j(@NonNull d0 d0Var);

    public void j0(View view) {
        if (this.B) {
            return;
        }
        int size = this.f27708x.size();
        Animator[] animatorArr = (Animator[]) this.f27708x.toArray(this.f27709y);
        this.f27709y = M;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.f27709y = animatorArr;
        i0(i.f27729d, false);
        this.A = true;
    }

    public final void k(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f27693i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.f27694j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f27695k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f27695k.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    d0 d0Var = new d0(view);
                    if (z10) {
                        o(d0Var);
                    } else {
                        j(d0Var);
                    }
                    d0Var.f27619c.add(this);
                    n(d0Var);
                    if (z10) {
                        h(this.f27700p, view, d0Var);
                    } else {
                        h(this.f27701q, view, d0Var);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f27697m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.f27698n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f27699o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.f27699o.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                k(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    public void k0(@NonNull ViewGroup viewGroup) {
        d dVar;
        this.f27704t = new ArrayList<>();
        this.f27705u = new ArrayList<>();
        g0(this.f27700p, this.f27701q);
        w1.a<Animator, d> O2 = O();
        int size = O2.getSize();
        WindowId windowId = viewGroup.getWindowId();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator f10 = O2.f(i10);
            if (f10 != null && (dVar = O2.get(f10)) != null && dVar.f27713a != null && windowId.equals(dVar.f27715d)) {
                d0 d0Var = dVar.f27714c;
                View view = dVar.f27713a;
                d0 W = W(view, true);
                d0 E = E(view, true);
                if (W == null && E == null) {
                    E = this.f27701q.f27621a.get(view);
                }
                if ((W != null || E != null) && dVar.f27716e.Z(d0Var, E)) {
                    q qVar = dVar.f27716e;
                    if (qVar.N().K != null) {
                        f10.cancel();
                        qVar.f27708x.remove(f10);
                        O2.remove(f10);
                        if (qVar.f27708x.size() == 0) {
                            qVar.i0(i.f27728c, false);
                            if (!qVar.B) {
                                qVar.B = true;
                                qVar.i0(i.b, false);
                            }
                        }
                    } else if (f10.isRunning() || f10.isStarted()) {
                        f10.cancel();
                    } else {
                        O2.remove(f10);
                    }
                }
            }
        }
        t(viewGroup, this.f27700p, this.f27701q, this.f27704t, this.f27705u);
        if (this.K == null) {
            q0();
        } else if (Build.VERSION.SDK_INT >= 34) {
            l0();
            this.K.p();
            this.K.q();
        }
    }

    public void l0() {
        w1.a<Animator, d> O2 = O();
        this.J = 0L;
        for (int i10 = 0; i10 < this.E.size(); i10++) {
            Animator animator = this.E.get(i10);
            d dVar = O2.get(animator);
            if (animator != null && dVar != null) {
                if (z() >= 0) {
                    dVar.f27717f.setDuration(z());
                }
                if (P() >= 0) {
                    dVar.f27717f.setStartDelay(P() + dVar.f27717f.getStartDelay());
                }
                if (D() != null) {
                    dVar.f27717f.setInterpolator(D());
                }
                this.f27708x.add(animator);
                this.J = Math.max(this.J, f.a(animator));
            }
        }
        this.E.clear();
    }

    @NonNull
    public q m0(@NonNull h hVar) {
        q qVar;
        ArrayList<h> arrayList = this.D;
        if (arrayList != null) {
            if (!arrayList.remove(hVar) && (qVar = this.C) != null) {
                qVar.m0(hVar);
            }
            if (this.D.size() == 0) {
                this.D = null;
            }
        }
        return this;
    }

    public void n(d0 d0Var) {
        String[] b10;
        if (this.F == null || d0Var.f27618a.isEmpty() || (b10 = this.F.b()) == null) {
            return;
        }
        for (String str : b10) {
            if (!d0Var.f27618a.containsKey(str)) {
                this.F.a(d0Var);
                return;
            }
        }
    }

    @NonNull
    public q n0(@NonNull View view) {
        this.f27690f.remove(view);
        return this;
    }

    public abstract void o(@NonNull d0 d0Var);

    public void o0(View view) {
        if (this.A) {
            if (!this.B) {
                int size = this.f27708x.size();
                Animator[] animatorArr = (Animator[]) this.f27708x.toArray(this.f27709y);
                this.f27709y = M;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.f27709y = animatorArr;
                i0(i.f27730e, false);
            }
            this.A = false;
        }
    }

    public void p(@NonNull ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        w1.a<String, String> aVar;
        q(z10);
        if ((this.f27689e.size() > 0 || this.f27690f.size() > 0) && (((arrayList = this.f27691g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f27692h) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f27689e.size(); i10++) {
                View findViewById = viewGroup.findViewById(this.f27689e.get(i10).intValue());
                if (findViewById != null) {
                    d0 d0Var = new d0(findViewById);
                    if (z10) {
                        o(d0Var);
                    } else {
                        j(d0Var);
                    }
                    d0Var.f27619c.add(this);
                    n(d0Var);
                    if (z10) {
                        h(this.f27700p, findViewById, d0Var);
                    } else {
                        h(this.f27701q, findViewById, d0Var);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f27690f.size(); i11++) {
                View view = this.f27690f.get(i11);
                d0 d0Var2 = new d0(view);
                if (z10) {
                    o(d0Var2);
                } else {
                    j(d0Var2);
                }
                d0Var2.f27619c.add(this);
                n(d0Var2);
                if (z10) {
                    h(this.f27700p, view, d0Var2);
                } else {
                    h(this.f27701q, view, d0Var2);
                }
            }
        } else {
            k(viewGroup, z10);
        }
        if (z10 || (aVar = this.H) == null) {
            return;
        }
        int size = aVar.getSize();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add(this.f27700p.f27623d.remove(this.H.f(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f27700p.f27623d.put(this.H.k(i13), view2);
            }
        }
    }

    public final void p0(Animator animator, w1.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            i(animator);
        }
    }

    public void q(boolean z10) {
        if (z10) {
            this.f27700p.f27621a.clear();
            this.f27700p.b.clear();
            this.f27700p.f27622c.a();
        } else {
            this.f27701q.f27621a.clear();
            this.f27701q.b.clear();
            this.f27701q.f27622c.a();
        }
    }

    public void q0() {
        z0();
        w1.a<Animator, d> O2 = O();
        ArrayList<Animator> arrayList = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Animator animator = arrayList.get(i10);
            i10++;
            Animator animator2 = animator;
            if (O2.containsKey(animator2)) {
                z0();
                p0(animator2, O2);
            }
        }
        this.E.clear();
        w();
    }

    @Override // 
    @NonNull
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public q clone() {
        try {
            q qVar = (q) super.clone();
            qVar.E = new ArrayList<>();
            qVar.f27700p = new e0();
            qVar.f27701q = new e0();
            qVar.f27704t = null;
            qVar.f27705u = null;
            qVar.K = null;
            qVar.C = this;
            qVar.D = null;
            return qVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void r0(boolean z10) {
        this.f27707w = z10;
    }

    public Animator s(@NonNull ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        return null;
    }

    public void s0(long j10, long j11) {
        long U = U();
        int i10 = 0;
        boolean z10 = j10 < j11;
        if ((j11 < 0 && j10 >= 0) || (j11 > U && j10 <= U)) {
            this.B = false;
            i0(i.f27727a, z10);
        }
        int size = this.f27708x.size();
        Animator[] animatorArr = (Animator[]) this.f27708x.toArray(this.f27709y);
        this.f27709y = M;
        while (i10 < size) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            f.b(animator, Math.min(Math.max(0L, j10), f.a(animator)));
            i10++;
            U = U;
        }
        long j12 = U;
        this.f27709y = animatorArr;
        if ((j10 <= j12 || j11 > j12) && (j10 >= 0 || j11 < 0)) {
            return;
        }
        if (j10 > j12) {
            this.B = true;
        }
        i0(i.b, z10);
    }

    public void t(@NonNull ViewGroup viewGroup, @NonNull e0 e0Var, @NonNull e0 e0Var2, @NonNull ArrayList<d0> arrayList, @NonNull ArrayList<d0> arrayList2) {
        Animator s8;
        Animator animator;
        int i10;
        boolean z10;
        int i11;
        View view;
        d0 d0Var;
        Animator animator2;
        View view2;
        Animator animator3;
        w1.a<Animator, d> O2 = O();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z11 = N().K != null;
        long j10 = Long.MAX_VALUE;
        int i12 = 0;
        while (i12 < size) {
            d0 d0Var2 = arrayList.get(i12);
            d0 d0Var3 = arrayList2.get(i12);
            if (d0Var2 != null && !d0Var2.f27619c.contains(this)) {
                d0Var2 = null;
            }
            if (d0Var3 != null && !d0Var3.f27619c.contains(this)) {
                d0Var3 = null;
            }
            if (!(d0Var2 == null && d0Var3 == null) && ((d0Var2 == null || d0Var3 == null || Z(d0Var2, d0Var3)) && (s8 = s(viewGroup, d0Var2, d0Var3)) != null)) {
                if (d0Var3 != null) {
                    View view3 = d0Var3.b;
                    String[] V = V();
                    if (V != null && V.length > 0) {
                        d0Var = new d0(view3);
                        i10 = size;
                        z10 = z11;
                        d0 d0Var4 = e0Var2.f27621a.get(view3);
                        i11 = i12;
                        if (d0Var4 != null) {
                            int i13 = 0;
                            while (i13 < V.length) {
                                Map<String, Object> map = d0Var.f27618a;
                                int i14 = i13;
                                String str = V[i14];
                                map.put(str, d0Var4.f27618a.get(str));
                                i13 = i14 + 1;
                                V = V;
                            }
                        }
                        int size2 = O2.getSize();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                view2 = view3;
                                animator3 = s8;
                                break;
                            }
                            d dVar = O2.get(O2.f(i15));
                            if (dVar.f27714c != null && dVar.f27713a == view3) {
                                view2 = view3;
                                if (dVar.b.equals(G()) && dVar.f27714c.equals(d0Var)) {
                                    animator3 = null;
                                    break;
                                }
                            } else {
                                view2 = view3;
                            }
                            i15++;
                            view3 = view2;
                        }
                    } else {
                        view2 = view3;
                        i10 = size;
                        z10 = z11;
                        i11 = i12;
                        animator3 = s8;
                        d0Var = null;
                    }
                    animator = animator3;
                    view = view2;
                } else {
                    animator = s8;
                    i10 = size;
                    z10 = z11;
                    i11 = i12;
                    view = d0Var2.b;
                    d0Var = null;
                }
                if (animator != null) {
                    z zVar = this.F;
                    if (zVar != null) {
                        long c10 = zVar.c(viewGroup, this, d0Var2, d0Var3);
                        sparseIntArray.put(this.E.size(), (int) c10);
                        j10 = Math.min(c10, j10);
                    }
                    long j11 = j10;
                    View view4 = view;
                    d0 d0Var5 = d0Var;
                    Animator animator4 = animator;
                    d dVar2 = new d(view4, G(), this, viewGroup.getWindowId(), d0Var5, animator4);
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator4);
                        animator2 = animatorSet;
                    } else {
                        animator2 = animator4;
                    }
                    O2.put(animator2, dVar2);
                    this.E.add(animator2);
                    j10 = j11;
                }
            } else {
                i10 = size;
                z10 = z11;
                i11 = i12;
            }
            i12 = i11 + 1;
            size = i10;
            z11 = z10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                d dVar3 = O2.get(this.E.get(sparseIntArray.keyAt(i16)));
                dVar3.f27717f.setStartDelay((sparseIntArray.valueAt(i16) - j10) + dVar3.f27717f.getStartDelay());
            }
        }
    }

    @NonNull
    public q t0(long j10) {
        this.f27687c = j10;
        return this;
    }

    @NonNull
    public String toString() {
        return A0("");
    }

    public void u0(e eVar) {
        this.G = eVar;
    }

    @NonNull
    public a0 v() {
        g gVar = new g();
        this.K = gVar;
        c(gVar);
        return this.K;
    }

    @NonNull
    public q v0(TimeInterpolator timeInterpolator) {
        this.f27688d = timeInterpolator;
        return this;
    }

    public void w() {
        int i10 = this.f27710z - 1;
        this.f27710z = i10;
        if (i10 == 0) {
            i0(i.b, false);
            for (int i11 = 0; i11 < this.f27700p.f27622c.n(); i11++) {
                View o8 = this.f27700p.f27622c.o(i11);
                if (o8 != null) {
                    o8.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.f27701q.f27622c.n(); i12++) {
                View o10 = this.f27701q.f27622c.o(i12);
                if (o10 != null) {
                    o10.setHasTransientState(false);
                }
            }
            this.B = true;
        }
    }

    public void w0(k kVar) {
        if (kVar == null) {
            this.I = O;
        } else {
            this.I = kVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void x(ViewGroup viewGroup) {
        w1.a<Animator, d> O2 = O();
        int size = O2.getSize();
        if (viewGroup == null || size == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        w1.a aVar = new w1.a(O2);
        O2.clear();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            d dVar = (d) aVar.k(i10);
            if (dVar.f27713a != null && windowId.equals(dVar.f27715d)) {
                ((Animator) aVar.f(i10)).end();
            }
        }
    }

    public void x0(z zVar) {
        this.F = zVar;
    }

    @NonNull
    public q y0(long j10) {
        this.b = j10;
        return this;
    }

    public long z() {
        return this.f27687c;
    }

    public void z0() {
        if (this.f27710z == 0) {
            i0(i.f27727a, false);
            this.B = false;
        }
        this.f27710z++;
    }
}
