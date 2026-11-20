package androidx.fragment.app;

import android.view.ViewGroup;
import android.view.l;
import androidx.annotation.NonNull;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final e f2484a;
    public final ClassLoader b;

    /* renamed from: d, reason: collision with root package name */
    public int f2486d;

    /* renamed from: e, reason: collision with root package name */
    public int f2487e;

    /* renamed from: f, reason: collision with root package name */
    public int f2488f;

    /* renamed from: g, reason: collision with root package name */
    public int f2489g;

    /* renamed from: h, reason: collision with root package name */
    public int f2490h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2491i;

    /* renamed from: k, reason: collision with root package name */
    public String f2493k;

    /* renamed from: l, reason: collision with root package name */
    public int f2494l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f2495m;

    /* renamed from: n, reason: collision with root package name */
    public int f2496n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f2497o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList<String> f2498p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList<String> f2499q;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList<Runnable> f2501s;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<a> f2485c = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    public boolean f2492j = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2500r = false;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f2502a;
        public c b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2503c;

        /* renamed from: d, reason: collision with root package name */
        public int f2504d;

        /* renamed from: e, reason: collision with root package name */
        public int f2505e;

        /* renamed from: f, reason: collision with root package name */
        public int f2506f;

        /* renamed from: g, reason: collision with root package name */
        public int f2507g;

        /* renamed from: h, reason: collision with root package name */
        public l.b f2508h;

        /* renamed from: i, reason: collision with root package name */
        public l.b f2509i;

        public a() {
        }

        public a(int i10, c cVar) {
            this.f2502a = i10;
            this.b = cVar;
            this.f2503c = false;
            l.b bVar = l.b.f2630e;
            this.f2508h = bVar;
            this.f2509i = bVar;
        }

        public a(int i10, c cVar, boolean z10) {
            this.f2502a = i10;
            this.b = cVar;
            this.f2503c = z10;
            l.b bVar = l.b.f2630e;
            this.f2508h = bVar;
            this.f2509i = bVar;
        }
    }

    public h(@NonNull e eVar, ClassLoader classLoader) {
        this.f2484a = eVar;
        this.b = classLoader;
    }

    @NonNull
    public h b(int i10, @NonNull c cVar, String str) {
        l(i10, cVar, str, 1);
        return this;
    }

    @NonNull
    public final h c(@NonNull ViewGroup viewGroup, @NonNull c cVar, String str) {
        cVar.J = viewGroup;
        cVar.f2427r = true;
        return b(viewGroup.getId(), cVar, str);
    }

    @NonNull
    public h d(@NonNull c cVar, String str) {
        l(0, cVar, str, 1);
        return this;
    }

    public void e(a aVar) {
        this.f2485c.add(aVar);
        aVar.f2504d = this.f2486d;
        aVar.f2505e = this.f2487e;
        aVar.f2506f = this.f2488f;
        aVar.f2507g = this.f2489g;
    }

    @NonNull
    public h f(String str) {
        if (!this.f2492j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f2491i = true;
        this.f2493k = str;
        return this;
    }

    public abstract int g();

    public abstract int h();

    public abstract void i();

    public abstract void j();

    @NonNull
    public h k() {
        if (this.f2491i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f2492j = false;
        return this;
    }

    public void l(int i10, c cVar, String str, int i11) {
        String str2 = cVar.T;
        if (str2 != null) {
            f4.c.f(cVar, str2);
        }
        Class<?> cls = cVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = cVar.B;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + cVar + ": was " + cVar.B + " now " + str);
            }
            cVar.B = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + cVar + " with tag " + str + " to container view with no id");
            }
            int i12 = cVar.f2435z;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + cVar + ": was " + cVar.f2435z + " now " + i10);
            }
            cVar.f2435z = i10;
            cVar.A = i10;
        }
        e(new a(i11, cVar));
    }

    @NonNull
    public h m(@NonNull c cVar) {
        e(new a(3, cVar));
        return this;
    }

    @NonNull
    public h n(int i10, @NonNull c cVar) {
        return o(i10, cVar, null);
    }

    @NonNull
    public h o(int i10, @NonNull c cVar, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        l(i10, cVar, str, 2);
        return this;
    }

    @NonNull
    public h p(boolean z10, @NonNull Runnable runnable) {
        if (!z10) {
            k();
        }
        if (this.f2501s == null) {
            this.f2501s = new ArrayList<>();
        }
        this.f2501s.add(runnable);
        return this;
    }

    @NonNull
    public h q(int i10, int i11) {
        return r(i10, i11, 0, 0);
    }

    @NonNull
    public h r(int i10, int i11, int i12, int i13) {
        this.f2486d = i10;
        this.f2487e = i11;
        this.f2488f = i12;
        this.f2489g = i13;
        return this;
    }

    @NonNull
    public h s(boolean z10) {
        this.f2500r = z10;
        return this;
    }

    @NonNull
    public h t(@NonNull c cVar) {
        e(new a(5, cVar));
        return this;
    }
}
