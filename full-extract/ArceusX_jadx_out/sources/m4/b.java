package m4;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.a1;
import android.view.b1;
import android.view.d0;
import android.view.e0;
import android.view.s;
import android.view.x0;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import m4.a;
import n4.b;
import w1.k;

/* loaded from: classes.dex */
public class b extends m4.a {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f24274c;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final s f24275a;

    @NonNull
    public final c b;

    public static class a<D> extends d0<D> implements b.a<D> {

        /* renamed from: l, reason: collision with root package name */
        public final int f24276l;

        /* renamed from: m, reason: collision with root package name */
        public final Bundle f24277m;

        /* renamed from: n, reason: collision with root package name */
        @NonNull
        public final n4.b<D> f24278n;

        /* renamed from: o, reason: collision with root package name */
        public s f24279o;

        /* renamed from: p, reason: collision with root package name */
        public C0423b<D> f24280p;

        /* renamed from: q, reason: collision with root package name */
        public n4.b<D> f24281q;

        public a(int i10, Bundle bundle, @NonNull n4.b<D> bVar, n4.b<D> bVar2) {
            this.f24276l = i10;
            this.f24277m = bundle;
            this.f24278n = bVar;
            this.f24281q = bVar2;
            bVar.r(i10, this);
        }

        @Override // n4.b.a
        public void a(@NonNull n4.b<D> bVar, D d10) {
            if (b.f24274c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                o(d10);
                return;
            }
            if (b.f24274c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            m(d10);
        }

        @Override // android.view.a0
        public void k() {
            if (b.f24274c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f24278n.u();
        }

        @Override // android.view.a0
        public void l() {
            if (b.f24274c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f24278n.v();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.a0
        public void n(@NonNull e0<? super D> e0Var) {
            super.n(e0Var);
            this.f24279o = null;
            this.f24280p = null;
        }

        @Override // android.view.d0, android.view.a0
        public void o(D d10) {
            super.o(d10);
            n4.b<D> bVar = this.f24281q;
            if (bVar != null) {
                bVar.s();
                this.f24281q = null;
            }
        }

        public n4.b<D> p(boolean z10) {
            if (b.f24274c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f24278n.b();
            this.f24278n.a();
            C0423b<D> c0423b = this.f24280p;
            if (c0423b != null) {
                n(c0423b);
                if (z10) {
                    c0423b.d();
                }
            }
            this.f24278n.w(this);
            if ((c0423b == null || c0423b.c()) && !z10) {
                return this.f24278n;
            }
            this.f24278n.s();
            return this.f24281q;
        }

        public void q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f24276l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f24277m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f24278n);
            this.f24278n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f24280p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f24280p);
                this.f24280p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(r().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        @NonNull
        public n4.b<D> r() {
            return this.f24278n;
        }

        public void s() {
            s sVar = this.f24279o;
            C0423b<D> c0423b = this.f24280p;
            if (sVar == null || c0423b == null) {
                return;
            }
            super.n(c0423b);
            i(sVar, c0423b);
        }

        @NonNull
        public n4.b<D> t(@NonNull s sVar, @NonNull a.InterfaceC0422a<D> interfaceC0422a) {
            C0423b<D> c0423b = new C0423b<>(this.f24278n, interfaceC0422a);
            i(sVar, c0423b);
            C0423b<D> c0423b2 = this.f24280p;
            if (c0423b2 != null) {
                n(c0423b2);
            }
            this.f24279o = sVar;
            this.f24280p = c0423b;
            return this.f24278n;
        }

        @NonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f24276l);
            sb2.append(" : ");
            Class<?> cls = this.f24278n.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* renamed from: m4.b$b, reason: collision with other inner class name */
    public static class C0423b<D> implements e0<D> {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final n4.b<D> f24282a;

        @NonNull
        public final a.InterfaceC0422a<D> b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f24283c = false;

        public C0423b(@NonNull n4.b<D> bVar, @NonNull a.InterfaceC0422a<D> interfaceC0422a) {
            this.f24282a = bVar;
            this.b = interfaceC0422a;
        }

        @Override // android.view.e0
        public void a(D d10) {
            if (b.f24274c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f24282a + ": " + this.f24282a.d(d10));
            }
            this.f24283c = true;
            this.b.a(this.f24282a, d10);
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f24283c);
        }

        public boolean c() {
            return this.f24283c;
        }

        public void d() {
            if (this.f24283c) {
                if (b.f24274c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f24282a);
                }
                this.b.c(this.f24282a);
            }
        }

        @NonNull
        public String toString() {
            return this.b.toString();
        }
    }

    public static class c extends x0 {

        /* renamed from: d, reason: collision with root package name */
        public static final a1.c f24284d = new a();
        public k<a> b = new k<>();

        /* renamed from: c, reason: collision with root package name */
        public boolean f24285c = false;

        public static class a implements a1.c {
            @Override // androidx.lifecycle.a1.c
            @NonNull
            public <T extends x0> T c(@NonNull Class<T> cls) {
                return new c();
            }
        }

        @NonNull
        public static c g(b1 b1Var) {
            return (c) new a1(b1Var, f24284d).b(c.class);
        }

        @Override // android.view.x0
        public void d() {
            super.d();
            int j10 = this.b.j();
            for (int i10 = 0; i10 < j10; i10++) {
                this.b.k(i10).p(true);
            }
            this.b.b();
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.b.j() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.b.j(); i10++) {
                    a k10 = this.b.k(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.b.h(i10));
                    printWriter.print(": ");
                    printWriter.println(k10.toString());
                    k10.q(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void f() {
            this.f24285c = false;
        }

        public <D> a<D> h(int i10) {
            return this.b.e(i10);
        }

        public boolean i() {
            return this.f24285c;
        }

        public void j() {
            int j10 = this.b.j();
            for (int i10 = 0; i10 < j10; i10++) {
                this.b.k(i10).s();
            }
        }

        public void k(int i10, @NonNull a aVar) {
            this.b.i(i10, aVar);
        }

        public void l() {
            this.f24285c = true;
        }
    }

    public b(@NonNull s sVar, @NonNull b1 b1Var) {
        this.f24275a = sVar;
        this.b = c.g(b1Var);
    }

    @Override // m4.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // m4.a
    @NonNull
    public <D> n4.b<D> c(int i10, Bundle bundle, @NonNull a.InterfaceC0422a<D> interfaceC0422a) {
        if (this.b.i()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> h10 = this.b.h(i10);
        if (f24274c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (h10 == null) {
            return e(i10, bundle, interfaceC0422a, null);
        }
        if (f24274c) {
            Log.v("LoaderManager", "  Re-using existing loader " + h10);
        }
        return h10.t(this.f24275a, interfaceC0422a);
    }

    @Override // m4.a
    public void d() {
        this.b.j();
    }

    @NonNull
    public final <D> n4.b<D> e(int i10, Bundle bundle, @NonNull a.InterfaceC0422a<D> interfaceC0422a, n4.b<D> bVar) {
        try {
            this.b.l();
            n4.b<D> b = interfaceC0422a.b(i10, bundle);
            if (b == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (b.getClass().isMemberClass() && !Modifier.isStatic(b.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + b);
            }
            a aVar = new a(i10, bundle, b, bVar);
            if (f24274c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.b.k(i10, aVar);
            this.b.f();
            return aVar.t(this.f24275a, interfaceC0422a);
        } catch (Throwable th2) {
            this.b.f();
            throw th2;
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f24275a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
