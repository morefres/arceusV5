package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f extends r {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f2969s;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f2970h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f2971i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList<j> f2972j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList<i> f2973k = new ArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.f0>> f2974l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    public ArrayList<ArrayList<j>> f2975m = new ArrayList<>();

    /* renamed from: n, reason: collision with root package name */
    public ArrayList<ArrayList<i>> f2976n = new ArrayList<>();

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f2977o = new ArrayList<>();

    /* renamed from: p, reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f2978p = new ArrayList<>();

    /* renamed from: q, reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f2979q = new ArrayList<>();

    /* renamed from: r, reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f2980r = new ArrayList<>();

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2981a;

        public a(ArrayList arrayList) {
            this.f2981a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f2981a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                j jVar = (j) obj;
                f.this.S(jVar.f3006a, jVar.b, jVar.f3007c, jVar.f3008d, jVar.f3009e);
            }
            this.f2981a.clear();
            f.this.f2975m.remove(this.f2981a);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2982a;

        public b(ArrayList arrayList) {
            this.f2982a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f2982a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                f.this.R((i) obj);
            }
            this.f2982a.clear();
            f.this.f2976n.remove(this.f2982a);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2983a;

        public c(ArrayList arrayList) {
            this.f2983a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f2983a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                f.this.Q((RecyclerView.f0) obj);
            }
            this.f2983a.clear();
            f.this.f2974l.remove(this.f2983a);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.f0 f2984a;
        public final /* synthetic */ ViewPropertyAnimator b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f2985c;

        public d(RecyclerView.f0 f0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2984a = f0Var;
            this.b = viewPropertyAnimator;
            this.f2985c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.f2985c.setAlpha(1.0f);
            f.this.G(this.f2984a);
            f.this.f2979q.remove(this.f2984a);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.H(this.f2984a);
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.f0 f2987a;
        public final /* synthetic */ View b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f2988c;

        public e(RecyclerView.f0 f0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2987a = f0Var;
            this.b = view;
            this.f2988c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2988c.setListener(null);
            f.this.A(this.f2987a);
            f.this.f2977o.remove(this.f2987a);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.B(this.f2987a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$f, reason: collision with other inner class name */
    public class C0051f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.f0 f2990a;
        public final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f2991c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f2992d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f2993e;

        public C0051f(RecyclerView.f0 f0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2990a = f0Var;
            this.b = i10;
            this.f2991c = view;
            this.f2992d = i11;
            this.f2993e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.b != 0) {
                this.f2991c.setTranslationX(0.0f);
            }
            if (this.f2992d != 0) {
                this.f2991c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2993e.setListener(null);
            f.this.E(this.f2990a);
            f.this.f2978p.remove(this.f2990a);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.F(this.f2990a);
        }
    }

    public class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f2995a;
        public final /* synthetic */ ViewPropertyAnimator b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f2996c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2995a = iVar;
            this.b = viewPropertyAnimator;
            this.f2996c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.f2996c.setAlpha(1.0f);
            this.f2996c.setTranslationX(0.0f);
            this.f2996c.setTranslationY(0.0f);
            f.this.C(this.f2995a.f3001a, true);
            f.this.f2980r.remove(this.f2995a.f3001a);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.D(this.f2995a.f3001a, true);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f2998a;
        public final /* synthetic */ ViewPropertyAnimator b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f2999c;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2998a = iVar;
            this.b = viewPropertyAnimator;
            this.f2999c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.f2999c.setAlpha(1.0f);
            this.f2999c.setTranslationX(0.0f);
            this.f2999c.setTranslationY(0.0f);
            f.this.C(this.f2998a.b, false);
            f.this.f2980r.remove(this.f2998a.b);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.D(this.f2998a.b, false);
        }
    }

    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.f0 f3006a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f3007c;

        /* renamed from: d, reason: collision with root package name */
        public int f3008d;

        /* renamed from: e, reason: collision with root package name */
        public int f3009e;

        public j(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
            this.f3006a = f0Var;
            this.b = i10;
            this.f3007c = i11;
            this.f3008d = i12;
            this.f3009e = i13;
        }
    }

    public void Q(RecyclerView.f0 f0Var) {
        View view = f0Var.f2827a;
        ViewPropertyAnimator animate = view.animate();
        this.f2977o.add(f0Var);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(f0Var, view, animate)).start();
    }

    public void R(i iVar) {
        RecyclerView.f0 f0Var = iVar.f3001a;
        View view = f0Var == null ? null : f0Var.f2827a;
        RecyclerView.f0 f0Var2 = iVar.b;
        View view2 = f0Var2 != null ? f0Var2.f2827a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f2980r.add(iVar.f3001a);
            duration.translationX(iVar.f3004e - iVar.f3002c);
            duration.translationY(iVar.f3005f - iVar.f3003d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f2980r.add(iVar.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    public void S(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
        View view = f0Var.f2827a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f2978p.add(f0Var);
        animate.setDuration(n()).setListener(new C0051f(f0Var, i14, view, i15, animate)).start();
    }

    public final void T(RecyclerView.f0 f0Var) {
        View view = f0Var.f2827a;
        ViewPropertyAnimator animate = view.animate();
        this.f2979q.add(f0Var);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(f0Var, animate, view)).start();
    }

    public void U(List<RecyclerView.f0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f2827a.animate().cancel();
        }
    }

    public void V() {
        if (p()) {
            return;
        }
        i();
    }

    public final void W(List<i> list, RecyclerView.f0 f0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Y(iVar, f0Var) && iVar.f3001a == null && iVar.b == null) {
                list.remove(iVar);
            }
        }
    }

    public final void X(i iVar) {
        RecyclerView.f0 f0Var = iVar.f3001a;
        if (f0Var != null) {
            Y(iVar, f0Var);
        }
        RecyclerView.f0 f0Var2 = iVar.b;
        if (f0Var2 != null) {
            Y(iVar, f0Var2);
        }
    }

    public final boolean Y(i iVar, RecyclerView.f0 f0Var) {
        boolean z10 = false;
        if (iVar.b == f0Var) {
            iVar.b = null;
        } else {
            if (iVar.f3001a != f0Var) {
                return false;
            }
            iVar.f3001a = null;
            z10 = true;
        }
        f0Var.f2827a.setAlpha(1.0f);
        f0Var.f2827a.setTranslationX(0.0f);
        f0Var.f2827a.setTranslationY(0.0f);
        C(f0Var, z10);
        return true;
    }

    public final void Z(RecyclerView.f0 f0Var) {
        if (f2969s == null) {
            f2969s = new ValueAnimator().getInterpolator();
        }
        f0Var.f2827a.animate().setInterpolator(f2969s);
        j(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean g(@NonNull RecyclerView.f0 f0Var, @NonNull List<Object> list) {
        return !list.isEmpty() || super.g(f0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void j(RecyclerView.f0 f0Var) {
        View view = f0Var.f2827a;
        view.animate().cancel();
        int size = this.f2972j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f2972j.get(size).f3006a == f0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(f0Var);
                this.f2972j.remove(size);
            }
        }
        W(this.f2973k, f0Var);
        if (this.f2970h.remove(f0Var)) {
            view.setAlpha(1.0f);
            G(f0Var);
        }
        if (this.f2971i.remove(f0Var)) {
            view.setAlpha(1.0f);
            A(f0Var);
        }
        for (int size2 = this.f2976n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f2976n.get(size2);
            W(arrayList, f0Var);
            if (arrayList.isEmpty()) {
                this.f2976n.remove(size2);
            }
        }
        for (int size3 = this.f2975m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f2975m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f3006a == f0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(f0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2975m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f2974l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.f0> arrayList3 = this.f2974l.get(size5);
            if (arrayList3.remove(f0Var)) {
                view.setAlpha(1.0f);
                A(f0Var);
                if (arrayList3.isEmpty()) {
                    this.f2974l.remove(size5);
                }
            }
        }
        this.f2979q.remove(f0Var);
        this.f2977o.remove(f0Var);
        this.f2980r.remove(f0Var);
        this.f2978p.remove(f0Var);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k() {
        int size = this.f2972j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f2972j.get(size);
            View view = jVar.f3006a.f2827a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f3006a);
            this.f2972j.remove(size);
        }
        for (int size2 = this.f2970h.size() - 1; size2 >= 0; size2--) {
            G(this.f2970h.get(size2));
            this.f2970h.remove(size2);
        }
        int size3 = this.f2971i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.f0 f0Var = this.f2971i.get(size3);
            f0Var.f2827a.setAlpha(1.0f);
            A(f0Var);
            this.f2971i.remove(size3);
        }
        for (int size4 = this.f2973k.size() - 1; size4 >= 0; size4--) {
            X(this.f2973k.get(size4));
        }
        this.f2973k.clear();
        if (p()) {
            for (int size5 = this.f2975m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f2975m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f3006a.f2827a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f3006a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f2975m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f2974l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.f0> arrayList2 = this.f2974l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.f0 f0Var2 = arrayList2.get(size8);
                    f0Var2.f2827a.setAlpha(1.0f);
                    A(f0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f2974l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f2976n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f2976n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f2976n.remove(arrayList3);
                    }
                }
            }
            U(this.f2979q);
            U(this.f2978p);
            U(this.f2977o);
            U(this.f2980r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean p() {
        return (this.f2971i.isEmpty() && this.f2973k.isEmpty() && this.f2972j.isEmpty() && this.f2970h.isEmpty() && this.f2978p.isEmpty() && this.f2979q.isEmpty() && this.f2977o.isEmpty() && this.f2980r.isEmpty() && this.f2975m.isEmpty() && this.f2974l.isEmpty() && this.f2976n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void u() {
        boolean isEmpty = this.f2970h.isEmpty();
        boolean isEmpty2 = this.f2972j.isEmpty();
        boolean isEmpty3 = this.f2973k.isEmpty();
        boolean isEmpty4 = this.f2971i.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        ArrayList<RecyclerView.f0> arrayList = this.f2970h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            RecyclerView.f0 f0Var = arrayList.get(i10);
            i10++;
            T(f0Var);
        }
        this.f2970h.clear();
        if (!isEmpty2) {
            ArrayList<j> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f2972j);
            this.f2975m.add(arrayList2);
            this.f2972j.clear();
            a aVar = new a(arrayList2);
            if (isEmpty) {
                aVar.run();
            } else {
                o0.f0(arrayList2.get(0).f3006a.f2827a, aVar, o());
            }
        }
        if (!isEmpty3) {
            ArrayList<i> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.f2973k);
            this.f2976n.add(arrayList3);
            this.f2973k.clear();
            b bVar = new b(arrayList3);
            if (isEmpty) {
                bVar.run();
            } else {
                o0.f0(arrayList3.get(0).f3001a.f2827a, bVar, o());
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList<RecyclerView.f0> arrayList4 = new ArrayList<>();
        arrayList4.addAll(this.f2971i);
        this.f2974l.add(arrayList4);
        this.f2971i.clear();
        c cVar = new c(arrayList4);
        if (isEmpty && isEmpty2 && isEmpty3) {
            cVar.run();
        } else {
            o0.f0(arrayList4.get(0).f2827a, cVar, (!isEmpty ? o() : 0L) + Math.max(!isEmpty2 ? n() : 0L, isEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public boolean w(RecyclerView.f0 f0Var) {
        Z(f0Var);
        f0Var.f2827a.setAlpha(0.0f);
        this.f2971i.add(f0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public boolean x(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i10, int i11, int i12, int i13) {
        if (f0Var == f0Var2) {
            return y(f0Var, i10, i11, i12, i13);
        }
        float translationX = f0Var.f2827a.getTranslationX();
        float translationY = f0Var.f2827a.getTranslationY();
        float alpha = f0Var.f2827a.getAlpha();
        Z(f0Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        f0Var.f2827a.setTranslationX(translationX);
        f0Var.f2827a.setTranslationY(translationY);
        f0Var.f2827a.setAlpha(alpha);
        if (f0Var2 != null) {
            Z(f0Var2);
            f0Var2.f2827a.setTranslationX(-i14);
            f0Var2.f2827a.setTranslationY(-i15);
            f0Var2.f2827a.setAlpha(0.0f);
        }
        this.f2973k.add(new i(f0Var, f0Var2, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public boolean y(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
        View view = f0Var.f2827a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) f0Var.f2827a.getTranslationY());
        Z(f0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(f0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f2972j.add(new j(f0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public boolean z(RecyclerView.f0 f0Var) {
        Z(f0Var);
        this.f2970h.add(f0Var);
        return true;
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.f0 f3001a;
        public RecyclerView.f0 b;

        /* renamed from: c, reason: collision with root package name */
        public int f3002c;

        /* renamed from: d, reason: collision with root package name */
        public int f3003d;

        /* renamed from: e, reason: collision with root package name */
        public int f3004e;

        /* renamed from: f, reason: collision with root package name */
        public int f3005f;

        public i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
            this.f3001a = f0Var;
            this.b = f0Var2;
        }

        @SuppressLint({"UnknownNullness"})
        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3001a + ", newHolder=" + this.b + ", fromX=" + this.f3002c + ", fromY=" + this.f3003d + ", toX=" + this.f3004e + ", toY=" + this.f3005f + '}';
        }

        public i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i10, int i11, int i12, int i13) {
            this(f0Var, f0Var2);
            this.f3002c = i10;
            this.f3003d = i11;
            this.f3004e = i12;
            this.f3005f = i13;
        }
    }
}
