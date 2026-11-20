package sm;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sm.h;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: e, reason: collision with root package name */
    public static final List<h.e> f31541e;

    /* renamed from: a, reason: collision with root package name */
    public final List<h.e> f31542a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final ThreadLocal<d> f31543c = new ThreadLocal<>();

    /* renamed from: d, reason: collision with root package name */
    public final Map<Object, h<?>> f31544d = new LinkedHashMap();

    public class a implements h.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f31545a;
        public final /* synthetic */ h b;

        public a(Type type, h hVar) {
            this.f31545a = type;
            this.b = hVar;
        }

        @Override // sm.h.e
        public h<?> create(Type type, Set<? extends Annotation> set, w wVar) {
            if (set.isEmpty() && um.c.w(this.f31545a, type)) {
                return this.b;
            }
            return null;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final List<h.e> f31546a = new ArrayList();
        public int b = 0;

        public b a(Object obj) {
            if (obj != null) {
                return c(sm.a.c(obj));
            }
            throw new IllegalArgumentException("adapter == null");
        }

        public <T> b b(Type type, h<T> hVar) {
            return c(w.h(type, hVar));
        }

        public b c(h.e eVar) {
            if (eVar == null) {
                throw new IllegalArgumentException("factory == null");
            }
            List<h.e> list = this.f31546a;
            int i10 = this.b;
            this.b = i10 + 1;
            list.add(i10, eVar);
            return this;
        }

        public w d() {
            return new w(this);
        }
    }

    public static final class c<T> extends h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Type f31547a;
        public final String b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f31548c;

        /* renamed from: d, reason: collision with root package name */
        public h<T> f31549d;

        public c(Type type, String str, Object obj) {
            this.f31547a = type;
            this.b = str;
            this.f31548c = obj;
        }

        @Override // sm.h
        public T fromJson(m mVar) {
            h<T> hVar = this.f31549d;
            if (hVar != null) {
                return hVar.fromJson(mVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // sm.h
        public void toJson(t tVar, T t8) {
            h<T> hVar = this.f31549d;
            if (hVar == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            hVar.toJson(tVar, (t) t8);
        }

        public String toString() {
            h<T> hVar = this.f31549d;
            return hVar != null ? hVar.toString() : super.toString();
        }
    }

    public final class d {

        /* renamed from: a, reason: collision with root package name */
        public final List<c<?>> f31550a = new ArrayList();
        public final Deque<c<?>> b = new ArrayDeque();

        /* renamed from: c, reason: collision with root package name */
        public boolean f31551c;

        public d() {
        }

        public <T> void a(h<T> hVar) {
            this.b.getLast().f31549d = hVar;
        }

        public IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
            if (!this.f31551c) {
                this.f31551c = true;
                if (this.b.size() != 1 || this.b.getFirst().b != null) {
                    StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
                    Iterator<c<?>> descendingIterator = this.b.descendingIterator();
                    while (descendingIterator.hasNext()) {
                        c<?> next = descendingIterator.next();
                        sb2.append("\nfor ");
                        sb2.append(next.f31547a);
                        if (next.b != null) {
                            sb2.append(' ');
                            sb2.append(next.b);
                        }
                    }
                    return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
                }
            }
            return illegalArgumentException;
        }

        public void c(boolean z10) {
            this.b.removeLast();
            if (this.b.isEmpty()) {
                w.this.f31543c.remove();
                if (z10) {
                    synchronized (w.this.f31544d) {
                        try {
                            int size = this.f31550a.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                c<?> cVar = this.f31550a.get(i10);
                                h<T> hVar = (h) w.this.f31544d.put(cVar.f31548c, cVar.f31549d);
                                if (hVar != 0) {
                                    cVar.f31549d = hVar;
                                    w.this.f31544d.put(cVar.f31548c, hVar);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }

        public <T> h<T> d(Type type, String str, Object obj) {
            int size = this.f31550a.size();
            for (int i10 = 0; i10 < size; i10++) {
                c<?> cVar = this.f31550a.get(i10);
                if (cVar.f31548c.equals(obj)) {
                    this.b.add(cVar);
                    h<T> hVar = (h<T>) cVar.f31549d;
                    return hVar != null ? hVar : cVar;
                }
            }
            c<?> cVar2 = new c<>(type, str, obj);
            this.f31550a.add(cVar2);
            this.b.add(cVar2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f31541e = arrayList;
        arrayList.add(y.f31554a);
        arrayList.add(e.b);
        arrayList.add(v.f31539c);
        arrayList.add(sm.b.f31432c);
        arrayList.add(x.f31553a);
        arrayList.add(sm.d.f31440d);
    }

    public w(b bVar) {
        int size = bVar.f31546a.size();
        List<h.e> list = f31541e;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(bVar.f31546a);
        arrayList.addAll(list);
        this.f31542a = Collections.unmodifiableList(arrayList);
        this.b = bVar.b;
    }

    public static <T> h.e h(Type type, h<T> hVar) {
        if (type == null) {
            throw new IllegalArgumentException("type == null");
        }
        if (hVar != null) {
            return new a(type, hVar);
        }
        throw new IllegalArgumentException("jsonAdapter == null");
    }

    public <T> h<T> c(Class<T> cls) {
        return e(cls, um.c.f33030a);
    }

    public <T> h<T> d(Type type) {
        return e(type, um.c.f33030a);
    }

    public <T> h<T> e(Type type, Set<? extends Annotation> set) {
        return f(type, set, null);
    }

    public <T> h<T> f(Type type, Set<? extends Annotation> set, String str) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type p8 = um.c.p(um.c.a(type));
        Object g10 = g(p8, set);
        synchronized (this.f31544d) {
            try {
                h<T> hVar = (h) this.f31544d.get(g10);
                if (hVar != null) {
                    return hVar;
                }
                d dVar = this.f31543c.get();
                if (dVar == null) {
                    dVar = new d();
                    this.f31543c.set(dVar);
                }
                h<T> d10 = dVar.d(p8, str, g10);
                try {
                    if (d10 != null) {
                        return d10;
                    }
                    try {
                        int size = this.f31542a.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            h<T> hVar2 = (h<T>) this.f31542a.get(i10).create(p8, set, this);
                            if (hVar2 != null) {
                                dVar.a(hVar2);
                                dVar.c(true);
                                return hVar2;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + um.c.u(p8, set));
                    } catch (IllegalArgumentException e10) {
                        throw dVar.b(e10);
                    }
                } finally {
                    dVar.c(false);
                }
            } finally {
            }
        }
    }

    public final Object g(Type type, Set<? extends Annotation> set) {
        return set.isEmpty() ? type : Arrays.asList(type, set);
    }

    public <T> h<T> i(h.e eVar, Type type, Set<? extends Annotation> set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type p8 = um.c.p(um.c.a(type));
        int indexOf = this.f31542a.indexOf(eVar);
        if (indexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + eVar);
        }
        int size = this.f31542a.size();
        for (int i10 = indexOf + 1; i10 < size; i10++) {
            h<T> hVar = (h<T>) this.f31542a.get(i10).create(p8, set, this);
            if (hVar != null) {
                return hVar;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + um.c.u(p8, set));
    }
}
