package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.g;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class d<T> {

    /* renamed from: h, reason: collision with root package name */
    public static final Executor f2950h = new c();

    /* renamed from: a, reason: collision with root package name */
    public final w4.b f2951a;
    public final androidx.recyclerview.widget.c<T> b;

    /* renamed from: c, reason: collision with root package name */
    public Executor f2952c;

    /* renamed from: d, reason: collision with root package name */
    public final List<b<T>> f2953d;

    /* renamed from: e, reason: collision with root package name */
    public List<T> f2954e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public List<T> f2955f;

    /* renamed from: g, reason: collision with root package name */
    public int f2956g;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f2957a;
        public final /* synthetic */ List b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f2958c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Runnable f2959d;

        /* renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        public class C0050a extends g.b {
            public C0050a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.g.b
            public boolean a(int i10, int i11) {
                Object obj = a.this.f2957a.get(i10);
                Object obj2 = a.this.b.get(i11);
                if (obj != null && obj2 != null) {
                    return d.this.b.b().a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.g.b
            public boolean b(int i10, int i11) {
                Object obj = a.this.f2957a.get(i10);
                Object obj2 = a.this.b.get(i11);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : d.this.b.b().b(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.g.b
            public Object c(int i10, int i11) {
                Object obj = a.this.f2957a.get(i10);
                Object obj2 = a.this.b.get(i11);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return d.this.b.b().c(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.g.b
            public int d() {
                return a.this.b.size();
            }

            @Override // androidx.recyclerview.widget.g.b
            public int e() {
                return a.this.f2957a.size();
            }
        }

        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g.e f2962a;

            public b(g.e eVar) {
                this.f2962a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f2956g == aVar.f2958c) {
                    dVar.b(aVar.b, this.f2962a, aVar.f2959d);
                }
            }
        }

        public a(List list, List list2, int i10, Runnable runnable) {
            this.f2957a = list;
            this.b = list2;
            this.f2958c = i10;
            this.f2959d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f2952c.execute(new b(g.b(new C0050a())));
        }
    }

    public interface b<T> {
        void a(@NonNull List<T> list, @NonNull List<T> list2);
    }

    public static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f2963a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.f2963a.post(runnable);
        }
    }

    public d(@NonNull RecyclerView.h hVar, @NonNull g.f<T> fVar) {
        this(new androidx.recyclerview.widget.b(hVar), new c.a(fVar).a());
    }

    @NonNull
    public List<T> a() {
        return this.f2955f;
    }

    public void b(@NonNull List<T> list, @NonNull g.e eVar, Runnable runnable) {
        List<T> list2 = this.f2955f;
        this.f2954e = list;
        this.f2955f = Collections.unmodifiableList(list);
        eVar.c(this.f2951a);
        c(list2, runnable);
    }

    public final void c(@NonNull List<T> list, Runnable runnable) {
        Iterator<b<T>> it = this.f2953d.iterator();
        while (it.hasNext()) {
            it.next().a(list, this.f2955f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d(List<T> list) {
        e(list, null);
    }

    public void e(List<T> list, Runnable runnable) {
        int i10 = this.f2956g + 1;
        this.f2956g = i10;
        List<T> list2 = this.f2954e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f2955f;
        if (list == null) {
            int size = list2.size();
            this.f2954e = null;
            this.f2955f = Collections.EMPTY_LIST;
            this.f2951a.b(0, size);
            c(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.b.a().execute(new a(list2, list, i10, runnable));
            return;
        }
        this.f2954e = list;
        this.f2955f = Collections.unmodifiableList(list);
        this.f2951a.a(0, list.size());
        c(list3, runnable);
    }

    public d(@NonNull w4.b bVar, @NonNull androidx.recyclerview.widget.c<T> cVar) {
        this.f2953d = new CopyOnWriteArrayList();
        this.f2955f = Collections.EMPTY_LIST;
        this.f2951a = bVar;
        this.b = cVar;
        if (cVar.c() != null) {
            this.f2952c = cVar.c();
        } else {
            this.f2952c = f2950h;
        }
    }
}
