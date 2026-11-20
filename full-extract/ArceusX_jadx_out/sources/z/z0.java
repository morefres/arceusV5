package z;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import g0.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z0 implements n0.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f37578a;
    public final a0.c0 b;

    /* renamed from: c, reason: collision with root package name */
    public final f0.h f37579c;

    /* renamed from: e, reason: collision with root package name */
    public y f37581e;

    /* renamed from: j, reason: collision with root package name */
    public final p0.v<g0.w> f37586j;

    /* renamed from: l, reason: collision with root package name */
    public final n0.k3 f37588l;

    /* renamed from: m, reason: collision with root package name */
    public final n0.z1 f37589m;

    /* renamed from: n, reason: collision with root package name */
    public final a0.p0 f37590n;

    /* renamed from: o, reason: collision with root package name */
    public final s0.m f37591o;

    /* renamed from: d, reason: collision with root package name */
    public final Object f37580d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public p0.v<Integer> f37582f = null;

    /* renamed from: g, reason: collision with root package name */
    public p0.v<Integer> f37583g = null;

    /* renamed from: h, reason: collision with root package name */
    public p0.v<Integer> f37584h = null;

    /* renamed from: i, reason: collision with root package name */
    public p0.v<g0.z2> f37585i = null;

    /* renamed from: k, reason: collision with root package name */
    public List<Pair<n0.u, Executor>> f37587k = null;

    public z0(String str, a0.p0 p0Var, s0.m mVar) {
        String str2 = (String) x2.g.g(str);
        this.f37578a = str2;
        this.f37590n = p0Var;
        a0.c0 c10 = p0Var.c(str2);
        this.b = c10;
        this.f37579c = new f0.h(this);
        n0.k3 a10 = c0.a.a(str, c10);
        this.f37588l = a10;
        this.f37589m = new m2(str, a10);
        this.f37586j = new p0.v<>(g0.w.a(w.b.CLOSED));
        this.f37591o = mVar;
    }

    public f0.h B() {
        return this.f37579c;
    }

    public a0.c0 C() {
        return this.b;
    }

    public int D() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        x2.g.g(num);
        return num.intValue();
    }

    public int E() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        x2.g.g(num);
        return num.intValue();
    }

    public boolean F() {
        return q4.b(this.b);
    }

    public void G(y yVar) {
        synchronized (this.f37580d) {
            try {
                this.f37581e = yVar;
                p0.v<g0.z2> vVar = this.f37585i;
                if (vVar != null) {
                    vVar.u(yVar.W().j());
                }
                p0.v<Integer> vVar2 = this.f37582f;
                if (vVar2 != null) {
                    vVar2.u(this.f37581e.U().g());
                }
                p0.v<Integer> vVar3 = this.f37583g;
                if (vVar3 != null) {
                    vVar3.u(this.f37581e.U().h());
                }
                p0.v<Integer> vVar4 = this.f37584h;
                if (vVar4 != null) {
                    vVar4.u(this.f37581e.J().c());
                }
                List<Pair<n0.u, Executor>> list = this.f37587k;
                if (list != null) {
                    for (Pair<n0.u, Executor> pair : list) {
                        this.f37581e.C((Executor) pair.second, (n0.u) pair.first);
                    }
                    this.f37587k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        H();
    }

    public final void H() {
        I();
    }

    public final void I() {
        String str;
        int E = E();
        if (E == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (E == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (E == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (E == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (E != 4) {
            str = "Unknown value: " + E;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        g0.r1.e("Camera2CameraInfo", "Device Level: " + str);
    }

    public void J(android.view.a0<g0.w> a0Var) {
        this.f37586j.u(a0Var);
    }

    @Override // n0.o0
    public Set<Integer> a() {
        int[] e10 = this.b.e().e();
        if (e10 == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (int i10 : e10) {
            hashSet.add(Integer.valueOf(i10));
        }
        return hashSet;
    }

    @Override // g0.t
    public android.view.a0<g0.w> b() {
        return this.f37586j;
    }

    @Override // n0.o0
    public Set<g0.k0> c() {
        return b0.e.a(this.b).c();
    }

    @Override // g0.t
    public int d() {
        return w(0);
    }

    @Override // n0.o0
    public String e() {
        return this.f37578a;
    }

    @Override // n0.o0
    public void f(Executor executor, n0.u uVar) {
        synchronized (this.f37580d) {
            try {
                y yVar = this.f37581e;
                if (yVar != null) {
                    yVar.C(executor, uVar);
                    return;
                }
                if (this.f37587k == null) {
                    this.f37587k = new ArrayList();
                }
                this.f37587k.add(new Pair<>(uVar, executor));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n0.o0
    public Rect h() {
        Rect rect = (Rect) this.b.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, 4000, 3000) : (Rect) x2.g.g(rect);
    }

    @Override // g0.t
    public int i() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.LENS_FACING);
        x2.g.b(num != null, "Unable to get the lens facing of the camera.");
        return o4.a(num.intValue());
    }

    @Override // n0.o0
    public List<Size> j(int i10) {
        Size[] a10 = this.b.e().a(i10);
        return a10 != null ? Arrays.asList(a10) : Collections.EMPTY_LIST;
    }

    @Override // n0.o0
    public Object k() {
        return this.b.j();
    }

    @Override // n0.o0
    public n0.k3 l() {
        return this.f37588l;
    }

    @Override // n0.o0
    public List<Size> m(int i10) {
        Size[] g10 = this.b.e().g(i10);
        return g10 != null ? Arrays.asList(g10) : Collections.EMPTY_LIST;
    }

    @Override // n0.o0
    public Set<Integer> n() {
        HashSet hashSet = new HashSet();
        int[] iArr = (int[]) this.b.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i10 : iArr) {
                hashSet.add(Integer.valueOf(i10));
            }
        }
        return hashSet;
    }

    @Override // n0.o0
    public boolean o() {
        int[] iArr = (int[]) this.b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // g0.t
    public android.view.a0<Integer> p() {
        synchronized (this.f37580d) {
            try {
                y yVar = this.f37581e;
                if (yVar == null) {
                    if (this.f37582f == null) {
                        this.f37582f = new p0.v<>(0);
                    }
                    return this.f37582f;
                }
                p0.v<Integer> vVar = this.f37582f;
                if (vVar != null) {
                    return vVar;
                }
                return yVar.U().g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n0.o0
    public List<Size> r(Range<Integer> range) {
        Size[] sizeArr;
        try {
            sizeArr = this.b.e().d(range);
        } catch (IllegalArgumentException e10) {
            g0.r1.m("Camera2CameraInfo", "Can't get high speed resolutions for " + range, e10);
            sizeArr = null;
        }
        return sizeArr != null ? Arrays.asList(sizeArr) : Collections.EMPTY_LIST;
    }

    @Override // n0.o0
    public boolean s() {
        return o6.a(this.b, 9);
    }

    @Override // n0.o0
    public n0.a4 t() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        x2.g.g(num);
        return num.intValue() != 1 ? n0.a4.UPTIME : n0.a4.REALTIME;
    }

    @Override // g0.t
    public String u() {
        return E() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // n0.o0
    public void v(n0.u uVar) {
        synchronized (this.f37580d) {
            try {
                y yVar = this.f37581e;
                if (yVar != null) {
                    yVar.h0(uVar);
                    return;
                }
                List<Pair<n0.u, Executor>> list = this.f37587k;
                if (list == null) {
                    return;
                }
                Iterator<Pair<n0.u, Executor>> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().first == uVar) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.t
    public int w(int i10) {
        return p0.c.a(p0.c.b(i10), D(), 1 == i());
    }

    @Override // n0.o0
    public n0.z1 x() {
        return this.f37589m;
    }

    @Override // n0.o0
    public List<Size> y() {
        Size[] c10 = this.b.e().c();
        return c10 != null ? Arrays.asList(c10) : Collections.EMPTY_LIST;
    }

    @Override // g0.t
    public android.view.a0<g0.z2> z() {
        synchronized (this.f37580d) {
            try {
                y yVar = this.f37581e;
                if (yVar == null) {
                    if (this.f37585i == null) {
                        this.f37585i = new p0.v<>(g6.h(this.b));
                    }
                    return this.f37585i;
                }
                p0.v<g0.z2> vVar = this.f37585i;
                if (vVar != null) {
                    return vVar;
                }
                return yVar.W().j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
