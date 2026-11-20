package wf;

import android.content.Context;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import nb.qe;
import x3.f;

/* loaded from: classes2.dex */
public class p {
    public static final f.a<Long> b = x3.i.f("fire-global");

    /* renamed from: c, reason: collision with root package name */
    public static final f.a<Long> f34325c = x3.i.f("fire-count");

    /* renamed from: d, reason: collision with root package name */
    public static final f.a<String> f34326d = x3.i.g("last-used-date");

    /* renamed from: a, reason: collision with root package name */
    public final of.c f34327a;

    public p(Context context, String str) {
        this.f34327a = new of.c(context, "FirebaseHeartBeat" + str);
    }

    public static /* synthetic */ Unit a(long j10, x3.c cVar) {
        cVar.i(b, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ Unit b(p pVar, String str, String str2, f.a aVar, x3.c cVar) {
        pVar.getClass();
        f.a<String> aVar2 = f34326d;
        if (((String) of.d.a(cVar, aVar2, "")).equals(str)) {
            f.a<Set<String>> i10 = pVar.i(cVar, str);
            if (i10 == null || i10.getName().equals(str2)) {
                return null;
            }
            pVar.q(cVar, aVar, str);
            return null;
        }
        f.a<Long> aVar3 = f34325c;
        long longValue = ((Long) of.d.a(cVar, aVar3, 0L)).longValue();
        if (longValue + 1 == 30) {
            longValue = pVar.e(cVar);
        }
        HashSet hashSet = new HashSet((Collection) of.d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.i(aVar, hashSet);
        cVar.i(aVar3, Long.valueOf(longValue + 1));
        cVar.i(aVar2, str);
        return null;
    }

    public static /* synthetic */ Unit c(p pVar, x3.c cVar) {
        Set a10;
        pVar.getClass();
        long j10 = 0;
        for (Map.Entry<f.a<?>, Object> entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                f.a<?> key = entry.getKey();
                Set set = (Set) entry.getValue();
                String h10 = pVar.h(System.currentTimeMillis());
                if (set.contains(h10)) {
                    a10 = qe.a(new Object[]{h10});
                    cVar.i(key, a10);
                    j10++;
                } else {
                    cVar.h(key);
                }
            }
        }
        if (j10 == 0) {
            cVar.h(f34325c);
            return null;
        }
        cVar.i(f34325c, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ Unit d(p pVar, String str, x3.c cVar) {
        pVar.getClass();
        cVar.i(f34326d, str);
        pVar.l(cVar, str);
        return null;
    }

    public final synchronized long e(x3.c cVar) {
        long j10;
        try {
            long longValue = ((Long) of.d.a(cVar, f34325c, 0L)).longValue();
            String str = "";
            Set hashSet = new HashSet();
            String str2 = null;
            for (Map.Entry<f.a<?>, Object> entry : cVar.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str3 : set) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey().getName();
                        hashSet = set;
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str2);
            cVar.i(x3.i.h(str), hashSet2);
            j10 = longValue - 1;
            cVar.i(f34325c, Long.valueOf(j10));
        } catch (Throwable th2) {
            throw th2;
        }
        return j10;
    }

    public synchronized void f() {
        this.f34327a.g(new Function1() { // from class: wf.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.c(p.this, (x3.c) obj);
            }
        });
    }

    public synchronized List<q> g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String h10 = h(System.currentTimeMillis());
            for (Map.Entry<f.a<?>, Object> entry : this.f34327a.h().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(h10);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(q.a(entry.getKey().getName(), new ArrayList(hashSet)));
                    }
                }
            }
            p(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized String h(long j10) {
        return new Date(j10).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized f.a<Set<String>> i(x3.c cVar, String str) {
        for (Map.Entry<f.a<?>, Object> entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return x3.i.h(entry.getKey().getName());
                    }
                }
            }
        }
        return null;
    }

    public synchronized boolean j(long j10, long j11) {
        return h(j10).equals(h(j11));
    }

    public synchronized void k() {
        final String h10 = h(System.currentTimeMillis());
        this.f34327a.g(new Function1() { // from class: wf.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.d(p.this, h10, (x3.c) obj);
            }
        });
    }

    public final synchronized void l(x3.c cVar, String str) {
        try {
            f.a<Set<String>> i10 = i(cVar, str);
            if (i10 == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) of.d.a(cVar, i10, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                cVar.h(i10);
            } else {
                cVar.i(i10, hashSet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean m(long j10) {
        return n(b, j10);
    }

    public synchronized boolean n(f.a<Long> aVar, long j10) {
        if (j(((Long) this.f34327a.j(aVar, -1L)).longValue(), j10)) {
            return false;
        }
        this.f34327a.k(aVar, Long.valueOf(j10));
        return true;
    }

    public synchronized void o(long j10, final String str) {
        final String h10 = h(j10);
        final f.a<Set<String>> h11 = x3.i.h(str);
        this.f34327a.g(new Function1() { // from class: wf.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.b(p.this, h10, str, h11, (x3.c) obj);
            }
        });
    }

    public synchronized void p(final long j10) {
        this.f34327a.g(new Function1() { // from class: wf.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.a(j10, (x3.c) obj);
            }
        });
    }

    public final synchronized void q(x3.c cVar, f.a<Set<String>> aVar, String str) {
        l(cVar, str);
        HashSet hashSet = new HashSet((Collection) of.d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.i(aVar, hashSet);
    }
}
