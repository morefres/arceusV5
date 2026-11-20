package android.view;

import java.util.Iterator;
import java.util.Map;
import s.b;

/* loaded from: classes.dex */
public class b0<T> extends d0<T> {

    /* renamed from: l, reason: collision with root package name */
    public b<a0<?>, a<?>> f2569l = new b<>();

    public static class a<V> implements e0<V> {

        /* renamed from: a, reason: collision with root package name */
        public final a0<V> f2570a;
        public final e0<? super V> b;

        /* renamed from: c, reason: collision with root package name */
        public int f2571c = -1;

        public a(a0<V> a0Var, e0<? super V> e0Var) {
            this.f2570a = a0Var;
            this.b = e0Var;
        }

        @Override // android.view.e0
        public void a(V v5) {
            if (this.f2571c != this.f2570a.g()) {
                this.f2571c = this.f2570a.g();
                this.b.a(v5);
            }
        }

        public void b() {
            this.f2570a.j(this);
        }

        public void c() {
            this.f2570a.n(this);
        }
    }

    @Override // android.view.a0
    public void k() {
        Iterator<Map.Entry<a0<?>, a<?>>> it = this.f2569l.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    @Override // android.view.a0
    public void l() {
        Iterator<Map.Entry<a0<?>, a<?>>> it = this.f2569l.iterator();
        while (it.hasNext()) {
            it.next().getValue().c();
        }
    }

    public <S> void p(a0<S> a0Var, e0<? super S> e0Var) {
        if (a0Var == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(a0Var, e0Var);
        a<?> f10 = this.f2569l.f(a0Var, aVar);
        if (f10 != null && f10.b != e0Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (f10 == null && h()) {
            aVar.b();
        }
    }

    public <S> void q(a0<S> a0Var) {
        a<?> g10 = this.f2569l.g(a0Var);
        if (g10 != null) {
            g10.c();
        }
    }
}
