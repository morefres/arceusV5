package i7;

import android.annotation.SuppressLint;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class a<K, A> {

    /* renamed from: c, reason: collision with root package name */
    public final d<K> f20198c;

    /* renamed from: e, reason: collision with root package name */
    public t7.c<A> f20200e;

    /* renamed from: a, reason: collision with root package name */
    public final List<b> f20197a = new ArrayList(1);
    public boolean b = false;

    /* renamed from: d, reason: collision with root package name */
    public float f20199d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public A f20201f = null;

    /* renamed from: g, reason: collision with root package name */
    public float f20202g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f20203h = -1.0f;

    public interface b {
        void a();
    }

    public static final class c<T> implements d<T> {
        public c() {
        }

        @Override // i7.a.d
        public boolean a(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // i7.a.d
        public t7.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // i7.a.d
        public boolean c(float f10) {
            return false;
        }

        @Override // i7.a.d
        public float d() {
            return 0.0f;
        }

        @Override // i7.a.d
        public float e() {
            return 1.0f;
        }

        @Override // i7.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    public interface d<T> {
        boolean a(float f10);

        t7.a<T> b();

        boolean c(float f10);

        float d();

        float e();

        boolean isEmpty();
    }

    public static final class e<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        public final List<? extends t7.a<T>> f20204a;

        /* renamed from: c, reason: collision with root package name */
        public t7.a<T> f20205c = null;

        /* renamed from: d, reason: collision with root package name */
        public float f20206d = -1.0f;

        @NonNull
        public t7.a<T> b = f(0.0f);

        public e(List<? extends t7.a<T>> list) {
            this.f20204a = list;
        }

        @Override // i7.a.d
        public boolean a(float f10) {
            t7.a<T> aVar = this.f20205c;
            t7.a<T> aVar2 = this.b;
            if (aVar == aVar2 && this.f20206d == f10) {
                return true;
            }
            this.f20205c = aVar2;
            this.f20206d = f10;
            return false;
        }

        @Override // i7.a.d
        @NonNull
        public t7.a<T> b() {
            return this.b;
        }

        @Override // i7.a.d
        public boolean c(float f10) {
            if (this.b.a(f10)) {
                return !this.b.i();
            }
            this.b = f(f10);
            return true;
        }

        @Override // i7.a.d
        public float d() {
            return this.f20204a.get(0).f();
        }

        @Override // i7.a.d
        public float e() {
            return this.f20204a.get(r0.size() - 1).c();
        }

        public final t7.a<T> f(float f10) {
            List<? extends t7.a<T>> list = this.f20204a;
            t7.a<T> aVar = list.get(list.size() - 1);
            if (f10 >= aVar.f()) {
                return aVar;
            }
            for (int size = this.f20204a.size() - 2; size >= 1; size--) {
                t7.a<T> aVar2 = this.f20204a.get(size);
                if (this.b != aVar2 && aVar2.a(f10)) {
                    return aVar2;
                }
            }
            return this.f20204a.get(0);
        }

        @Override // i7.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    public static final class f<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final t7.a<T> f20207a;
        public float b = -1.0f;

        public f(List<? extends t7.a<T>> list) {
            this.f20207a = list.get(0);
        }

        @Override // i7.a.d
        public boolean a(float f10) {
            if (this.b == f10) {
                return true;
            }
            this.b = f10;
            return false;
        }

        @Override // i7.a.d
        public t7.a<T> b() {
            return this.f20207a;
        }

        @Override // i7.a.d
        public boolean c(float f10) {
            return !this.f20207a.i();
        }

        @Override // i7.a.d
        public float d() {
            return this.f20207a.f();
        }

        @Override // i7.a.d
        public float e() {
            return this.f20207a.c();
        }

        @Override // i7.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends t7.a<K>> list) {
        this.f20198c = q(list);
    }

    public static <T> d<T> q(List<? extends t7.a<T>> list) {
        return list.isEmpty() ? new c() : list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f20197a.add(bVar);
    }

    public t7.a<K> b() {
        if (f7.e.h()) {
            f7.e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        t7.a<K> b10 = this.f20198c.b();
        if (f7.e.h()) {
            f7.e.c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return b10;
    }

    @SuppressLint({"Range"})
    public float c() {
        if (this.f20203h == -1.0f) {
            this.f20203h = this.f20198c.e();
        }
        return this.f20203h;
    }

    public float d() {
        Interpolator interpolator;
        t7.a<K> b10 = b();
        if (b10 == null || b10.i() || (interpolator = b10.f32053d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(e());
    }

    public float e() {
        if (this.b) {
            return 0.0f;
        }
        t7.a<K> b10 = b();
        if (b10.i()) {
            return 0.0f;
        }
        return (this.f20199d - b10.f()) / (b10.c() - b10.f());
    }

    public float f() {
        return this.f20199d;
    }

    @SuppressLint({"Range"})
    public final float g() {
        if (this.f20202g == -1.0f) {
            this.f20202g = this.f20198c.d();
        }
        return this.f20202g;
    }

    public A h() {
        float e10 = e();
        if (this.f20200e == null && this.f20198c.a(e10) && !p()) {
            return this.f20201f;
        }
        t7.a<K> b10 = b();
        Interpolator interpolator = b10.f32054e;
        A i10 = (interpolator == null || b10.f32055f == null) ? i(b10, d()) : j(b10, e10, interpolator.getInterpolation(e10), b10.f32055f.getInterpolation(e10));
        this.f20201f = i10;
        return i10;
    }

    public abstract A i(t7.a<K> aVar, float f10);

    public A j(t7.a<K> aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        return this.f20200e != null;
    }

    public void l() {
        if (f7.e.h()) {
            f7.e.b("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i10 = 0; i10 < this.f20197a.size(); i10++) {
            this.f20197a.get(i10).a();
        }
        if (f7.e.h()) {
            f7.e.c("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void m() {
        this.b = true;
    }

    public void n(float f10) {
        if (f7.e.h()) {
            f7.e.b("BaseKeyframeAnimation#setProgress");
        }
        if (this.f20198c.isEmpty()) {
            if (f7.e.h()) {
                f7.e.c("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f10 < g()) {
            f10 = g();
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f20199d) {
            if (f7.e.h()) {
                f7.e.c("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.f20199d = f10;
            if (this.f20198c.c(f10)) {
                l();
            }
            if (f7.e.h()) {
                f7.e.c("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public void o(t7.c<A> cVar) {
        t7.c<A> cVar2 = this.f20200e;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f20200e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public boolean p() {
        return false;
    }
}
