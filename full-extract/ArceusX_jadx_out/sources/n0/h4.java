package n0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n0.h4;
import n0.j4;
import n0.o3;

/* loaded from: classes.dex */
public final class h4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f25380a;
    public final Map<String, b> b = new LinkedHashMap();

    public interface a {
        boolean a(b bVar);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final o3 f25381a;
        public final i4<?> b;

        /* renamed from: c, reason: collision with root package name */
        public final t3 f25382c;

        /* renamed from: d, reason: collision with root package name */
        public final List<j4.b> f25383d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f25384e = false;

        /* renamed from: f, reason: collision with root package name */
        public boolean f25385f = false;

        public b(o3 o3Var, i4<?> i4Var, t3 t3Var, List<j4.b> list) {
            this.f25381a = o3Var;
            this.b = i4Var;
            this.f25382c = t3Var;
            this.f25383d = list;
        }

        public boolean a() {
            return this.f25385f;
        }

        public boolean b() {
            return this.f25384e;
        }

        public List<j4.b> c() {
            return this.f25383d;
        }

        public o3 d() {
            return this.f25381a;
        }

        public t3 e() {
            return this.f25382c;
        }

        public i4<?> f() {
            return this.b;
        }

        public void g(boolean z10) {
            this.f25385f = z10;
        }

        public void h(boolean z10) {
            this.f25384e = z10;
        }

        public String toString() {
            return "UseCaseAttachInfo{mSessionConfig=" + this.f25381a + ", mUseCaseConfig=" + this.b + ", mStreamSpec=" + this.f25382c + ", mCaptureTypes=" + this.f25383d + ", mAttached=" + this.f25384e + ", mActive=" + this.f25385f + '}';
        }
    }

    public h4(String str) {
        this.f25380a = str;
    }

    public static /* synthetic */ boolean a(b bVar) {
        return bVar.a() && bVar.b();
    }

    public o3.h e() {
        o3.h hVar = new o3.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.b.entrySet()) {
            b value = entry.getValue();
            if (value.a() && value.b()) {
                String key = entry.getKey();
                hVar.b(value.d());
                arrayList.add(key);
            }
        }
        g0.r1.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f25380a);
        return hVar;
    }

    public Collection<o3> f() {
        return Collections.unmodifiableCollection(l(new a() { // from class: n0.d4
            @Override // n0.h4.a
            public final boolean a(h4.b bVar) {
                return h4.a(bVar);
            }
        }));
    }

    public o3.h g() {
        o3.h hVar = new o3.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.b.entrySet()) {
            b value = entry.getValue();
            if (value.b()) {
                hVar.b(value.d());
                arrayList.add(entry.getKey());
            }
        }
        g0.r1.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f25380a);
        return hVar;
    }

    public Collection<o3> h() {
        return Collections.unmodifiableCollection(l(new a() { // from class: n0.f4
            @Override // n0.h4.a
            public final boolean a(h4.b bVar) {
                boolean b10;
                b10 = bVar.b();
                return b10;
            }
        }));
    }

    public Collection<i4<?>> i() {
        return Collections.unmodifiableCollection(m(new a() { // from class: n0.g4
            @Override // n0.h4.a
            public final boolean a(h4.b bVar) {
                boolean b10;
                b10 = bVar.b();
                return b10;
            }
        }));
    }

    public Collection<b> j() {
        return Collections.unmodifiableCollection(n(new a() { // from class: n0.e4
            @Override // n0.h4.a
            public final boolean a(h4.b bVar) {
                boolean b10;
                b10 = bVar.b();
                return b10;
            }
        }));
    }

    public final b k(String str, o3 o3Var, i4<?> i4Var, t3 t3Var, List<j4.b> list) {
        b bVar = this.b.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(o3Var, i4Var, t3Var, list);
        this.b.put(str, bVar2);
        return bVar2;
    }

    public final Collection<o3> l(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().d());
            }
        }
        return arrayList;
    }

    public final Collection<i4<?>> m(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().f());
            }
        }
        return arrayList;
    }

    public final Collection<b> n(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    public boolean o(String str) {
        if (this.b.containsKey(str)) {
            return this.b.get(str).b();
        }
        return false;
    }

    public void p(String str) {
        this.b.remove(str);
    }

    public void q(String str, o3 o3Var, i4<?> i4Var, t3 t3Var, List<j4.b> list) {
        k(str, o3Var, i4Var, t3Var, list).g(true);
    }

    public void r(String str, o3 o3Var, i4<?> i4Var, t3 t3Var, List<j4.b> list) {
        k(str, o3Var, i4Var, t3Var, list).h(true);
        u(str, o3Var, i4Var, t3Var, list);
    }

    public void s(String str) {
        if (this.b.containsKey(str)) {
            b bVar = this.b.get(str);
            bVar.h(false);
            if (bVar.a()) {
                return;
            }
            this.b.remove(str);
        }
    }

    public void t(String str) {
        if (this.b.containsKey(str)) {
            b bVar = this.b.get(str);
            bVar.g(false);
            if (bVar.b()) {
                return;
            }
            this.b.remove(str);
        }
    }

    public void u(String str, o3 o3Var, i4<?> i4Var, t3 t3Var, List<j4.b> list) {
        if (this.b.containsKey(str)) {
            b bVar = new b(o3Var, i4Var, t3Var, list);
            b bVar2 = this.b.get(str);
            bVar.h(bVar2.b());
            bVar.g(bVar2.a());
            this.b.put(str, bVar);
        }
    }
}
