package z;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import z.o3;

/* loaded from: classes.dex */
public class o3 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f37352a;
    public final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Set<h5> f37353c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public final Set<h5> f37354d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final Set<h5> f37355e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final CameraDevice.StateCallback f37356f = new a();

    public class a extends CameraDevice.StateCallback {
        public a() {
        }

        public static /* synthetic */ void a(LinkedHashSet linkedHashSet, int i10) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((h5) it.next()).d(i10);
            }
        }

        public final void c() {
            List<h5> f10;
            synchronized (o3.this.b) {
                f10 = o3.this.f();
                o3.this.f37355e.clear();
                o3.this.f37353c.clear();
                o3.this.f37354d.clear();
            }
            Iterator<h5> it = f10.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }

        public final void d(final int i10) {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (o3.this.b) {
                linkedHashSet.addAll(o3.this.f37355e);
                linkedHashSet.addAll(o3.this.f37353c);
            }
            o3.this.f37352a.execute(new Runnable() { // from class: z.n3
                @Override // java.lang.Runnable
                public final void run() {
                    o3.a.a(linkedHashSet, i10);
                }
            });
        }

        public final void e() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (o3.this.b) {
                linkedHashSet.addAll(o3.this.f37355e);
                linkedHashSet.addAll(o3.this.f37353c);
            }
            o3.this.f37352a.execute(new Runnable() { // from class: z.m3
                @Override // java.lang.Runnable
                public final void run() {
                    o3.b(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            e();
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            e();
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            e();
            d(i10);
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public o3(Executor executor) {
        this.f37352a = executor;
    }

    public static void b(Set<h5> set) {
        for (h5 h5Var : set) {
            h5Var.b().r(h5Var);
        }
    }

    public final void a(h5 h5Var) {
        h5 next;
        Iterator<h5> it = f().iterator();
        while (it.hasNext() && (next = it.next()) != h5Var) {
            next.c();
        }
    }

    public CameraDevice.StateCallback c() {
        return this.f37356f;
    }

    public List<h5> d() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.f37353c);
        }
        return arrayList;
    }

    public List<h5> e() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.f37355e);
        }
        return arrayList;
    }

    public List<h5> f() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList();
            arrayList.addAll(d());
            arrayList.addAll(e());
        }
        return arrayList;
    }

    public void g(h5 h5Var) {
        synchronized (this.b) {
            this.f37353c.remove(h5Var);
            this.f37354d.remove(h5Var);
        }
    }

    public void h(h5 h5Var) {
        synchronized (this.b) {
            this.f37354d.add(h5Var);
        }
    }

    public void i(h5 h5Var) {
        a(h5Var);
        synchronized (this.b) {
            this.f37355e.remove(h5Var);
        }
    }

    public void j(h5 h5Var) {
        synchronized (this.b) {
            this.f37353c.add(h5Var);
            this.f37355e.remove(h5Var);
        }
        a(h5Var);
    }

    public void k(h5 h5Var) {
        synchronized (this.b) {
            this.f37355e.add(h5Var);
        }
    }
}
