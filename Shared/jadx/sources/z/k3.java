package z;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.utils.SurfaceUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import n0.l1;
import n0.o3;
import y1.c;
import z.h5;
import z.s5;
import z.u2;

/* loaded from: classes.dex */
public final class k3 implements l3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f37258a;
    public final List<n0.l1> b;

    /* renamed from: c, reason: collision with root package name */
    public final d f37259c;

    /* renamed from: d, reason: collision with root package name */
    public h5.a f37260d;

    /* renamed from: e, reason: collision with root package name */
    public h5 f37261e;

    /* renamed from: f, reason: collision with root package name */
    public n0.o3 f37262f;

    /* renamed from: g, reason: collision with root package name */
    public final Map<n0.u1, Surface> f37263g;

    /* renamed from: h, reason: collision with root package name */
    public List<n0.u1> f37264h;

    /* renamed from: i, reason: collision with root package name */
    public c f37265i;

    /* renamed from: j, reason: collision with root package name */
    public c f37266j;

    /* renamed from: k, reason: collision with root package name */
    public ne.x<Void> f37267k;

    /* renamed from: l, reason: collision with root package name */
    public c.a<Void> f37268l;

    /* renamed from: m, reason: collision with root package name */
    public Map<n0.u1, Long> f37269m;

    /* renamed from: n, reason: collision with root package name */
    public final d0.v f37270n;

    /* renamed from: o, reason: collision with root package name */
    public final d0.z f37271o;

    /* renamed from: p, reason: collision with root package name */
    public final d0.s f37272p;

    /* renamed from: q, reason: collision with root package name */
    public final b0.e f37273q;

    /* renamed from: r, reason: collision with root package name */
    public final d0.y f37274r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f37275s;

    /* renamed from: t, reason: collision with root package name */
    public final f0.i f37276t;

    public class a implements r0.c<Void> {
        public a() {
        }

        @Override // r0.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            synchronized (k3.this.f37258a) {
                try {
                    k3.this.f37260d.stop();
                    int ordinal = k3.this.f37266j.ordinal();
                    if ((ordinal == 4 || ordinal == 5 || ordinal == 6) && !(th2 instanceof CancellationException)) {
                        g0.r1.m("CaptureSession", "Opening session with fail " + k3.this.f37266j, th2);
                        k3.this.s();
                    }
                } finally {
                }
            }
        }
    }

    public class b extends CameraCaptureSession.CaptureCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            synchronized (k3.this.f37258a) {
                try {
                    n0.o3 o3Var = k3.this.f37262f;
                    if (o3Var == null) {
                        return;
                    }
                    n0.l1 l10 = o3Var.l();
                    g0.r1.a("CaptureSession", "Submit FLASH_MODE_OFF request");
                    k3 k3Var = k3.this;
                    k3Var.b(Collections.singletonList(k3Var.f37271o.a(l10)));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public enum c {
        UNINITIALIZED,
        RELEASED,
        INITIALIZED,
        GET_SURFACE,
        RELEASING,
        CLOSED,
        OPENING,
        OPENED
    }

    public final class d extends h5.c {
        public d() {
        }

        @Override // z.h5.c
        public void s(h5 h5Var) {
            synchronized (k3.this.f37258a) {
                try {
                    switch (k3.this.f37266j) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + k3.this.f37266j);
                        case RELEASED:
                            g0.r1.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                        case RELEASING:
                        case CLOSED:
                        case OPENING:
                            k3.this.s();
                            break;
                    }
                    g0.r1.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + k3.this.f37266j);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // z.h5.c
        public void t(h5 h5Var) {
            synchronized (k3.this.f37258a) {
                try {
                    switch (k3.this.f37266j) {
                        case UNINITIALIZED:
                        case RELEASED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + k3.this.f37266j);
                        case RELEASING:
                            h5Var.close();
                            break;
                        case CLOSED:
                            k3.this.f37261e = h5Var;
                            break;
                        case OPENING:
                            k3.this.A(c.OPENED);
                            k3.this.f37261e = h5Var;
                            g0.r1.a("CaptureSession", "Attempting to send capture request onConfigured");
                            k3 k3Var = k3.this;
                            k3Var.y(k3Var.f37262f);
                            k3.this.x();
                            break;
                    }
                    g0.r1.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + k3.this.f37266j);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // z.h5.c
        public void u(h5 h5Var) {
            synchronized (k3.this.f37258a) {
                try {
                    if (k3.this.f37266j.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + k3.this.f37266j);
                    }
                    g0.r1.a("CaptureSession", "CameraCaptureSession.onReady() " + k3.this.f37266j);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // z.h5.c
        public void v(h5 h5Var) {
            synchronized (k3.this.f37258a) {
                try {
                    if (k3.this.f37266j == c.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + k3.this.f37266j);
                    }
                    g0.r1.a("CaptureSession", "onSessionFinished()");
                    k3.this.s();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public k3(b0.e eVar) {
        this(eVar, false);
    }

    public static /* synthetic */ void j(k3 k3Var) {
        synchronized (k3Var.f37258a) {
            if (k3Var.b.isEmpty()) {
                return;
            }
            try {
                k3Var.w(k3Var.b);
            } finally {
                k3Var.b.clear();
            }
        }
    }

    public static /* synthetic */ Object k(k3 k3Var, c.a aVar) {
        String str;
        synchronized (k3Var.f37258a) {
            x2.g.j(k3Var.f37268l == null, "Release completer expected to be null");
            k3Var.f37268l = aVar;
            str = "Release[session=" + k3Var + "]";
        }
        return str;
    }

    public static /* synthetic */ void m(k3 k3Var, CameraCaptureSession cameraCaptureSession, int i10, boolean z10) {
        synchronized (k3Var.f37258a) {
            try {
                if (k3Var.f37266j == c.OPENED) {
                    k3Var.y(k3Var.f37262f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Map<o3.f, b0.i> r(Map<Integer, List<o3.f>> map, Map<n0.u1, Surface> map2) {
        HashMap hashMap = new HashMap();
        for (Integer num : map.keySet()) {
            num.intValue();
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (o3.f fVar : map.get(num)) {
                SurfaceUtil.a a10 = SurfaceUtil.a(map2.get(fVar.f()));
                if (i10 == 0) {
                    i10 = a10.f1234a;
                }
                f3.a();
                int i11 = a10.b;
                int i12 = a10.f1235c;
                String d10 = fVar.d();
                Objects.requireNonNull(d10);
                arrayList.add(e3.a(i11, i12, d10));
            }
            if (i10 == 0 || arrayList.isEmpty()) {
                g0.r1.c("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: " + i10 + ", streamInfos size: " + arrayList.size());
            } else {
                List createInstancesForMultiResolutionOutput = OutputConfiguration.createInstancesForMultiResolutionOutput(arrayList, i10);
                if (createInstancesForMultiResolutionOutput != null) {
                    for (o3.f fVar2 : map.get(num)) {
                        OutputConfiguration outputConfiguration = (OutputConfiguration) createInstancesForMultiResolutionOutput.remove(0);
                        outputConfiguration.addSurface(map2.get(fVar2.f()));
                        hashMap.put(fVar2, new b0.i(outputConfiguration));
                    }
                }
            }
        }
        return hashMap;
    }

    public static Map<Integer, List<o3.f>> v(Collection<o3.f> collection) {
        HashMap hashMap = new HashMap();
        for (o3.f fVar : collection) {
            if (fVar.g() > 0 && fVar.e().isEmpty()) {
                List list = (List) hashMap.get(Integer.valueOf(fVar.g()));
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(Integer.valueOf(fVar.g()), list);
                }
                list.add(fVar);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Integer num : hashMap.keySet()) {
            num.intValue();
            if (((List) hashMap.get(num)).size() >= 2) {
                hashMap2.put(num, (List) hashMap.get(num));
            }
        }
        return hashMap2;
    }

    public final void A(c cVar) {
        if (cVar.ordinal() > this.f37265i.ordinal()) {
            this.f37265i = cVar;
        }
        this.f37266j = cVar;
        if (!n5.a.h() || this.f37265i.ordinal() < c.GET_SURFACE.ordinal()) {
            return;
        }
        n5.a.j("CX:C2State[" + String.format("CaptureSession@%x", Integer.valueOf(hashCode())) + "]", cVar.ordinal());
    }

    @Override // z.l3
    public ne.x<Void> a(final n0.o3 o3Var, final CameraDevice cameraDevice, h5.a aVar) {
        synchronized (this.f37258a) {
            try {
                if (this.f37266j.ordinal() == 2) {
                    A(c.GET_SURFACE);
                    ArrayList arrayList = new ArrayList(o3Var.p());
                    this.f37264h = arrayList;
                    this.f37260d = aVar;
                    r0.d g10 = r0.d.c(aVar.j(arrayList, 5000L)).g(new r0.a() { // from class: z.i3
                        @Override // r0.a
                        public final ne.x apply(Object obj) {
                            ne.x z10;
                            z10 = k3.this.z((List) obj, o3Var, cameraDevice);
                            return z10;
                        }
                    }, this.f37260d.getExecutor());
                    r0.n.j(g10, new a(), this.f37260d.getExecutor());
                    return r0.n.s(g10);
                }
                g0.r1.c("CaptureSession", "Open not allowed in state: " + this.f37266j);
                return r0.n.n(new IllegalStateException("open() should not allow the state: " + this.f37266j));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z.l3
    public void b(List<n0.l1> list) {
        synchronized (this.f37258a) {
            try {
                switch (this.f37266j) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f37266j);
                    case RELEASED:
                    case RELEASING:
                    case CLOSED:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.b.addAll(list);
                        break;
                    case OPENED:
                        this.b.addAll(list);
                        x();
                        break;
                }
            } finally {
            }
        }
    }

    @Override // z.l3
    public boolean c() {
        boolean z10;
        synchronized (this.f37258a) {
            try {
                c cVar = this.f37266j;
                z10 = cVar == c.OPENED || cVar == c.OPENING;
            } finally {
            }
        }
        return z10;
    }

    @Override // z.l3
    public void close() {
        synchronized (this.f37258a) {
            try {
                int ordinal = this.f37266j.ordinal();
                if (ordinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f37266j);
                }
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        x2.g.h(this.f37260d, "The Opener shouldn't null in state:" + this.f37266j);
                        this.f37260d.stop();
                    } else if (ordinal == 6 || ordinal == 7) {
                        x2.g.h(this.f37260d, "The Opener shouldn't null in state:" + this.f37266j);
                        this.f37260d.stop();
                        A(c.CLOSED);
                        this.f37272p.g();
                        this.f37262f = null;
                    }
                }
                A(c.RELEASED);
            } finally {
            }
        }
    }

    @Override // z.l3
    public void d(n0.o3 o3Var) {
        synchronized (this.f37258a) {
            try {
                switch (this.f37266j) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f37266j);
                    case RELEASED:
                    case RELEASING:
                    case CLOSED:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f37262f = o3Var;
                        break;
                    case OPENED:
                        this.f37262f = o3Var;
                        if (o3Var != null) {
                            if (!this.f37263g.keySet().containsAll(o3Var.p())) {
                                g0.r1.c("CaptureSession", "Does not have the proper configured lists");
                                return;
                            } else {
                                g0.r1.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                                y(this.f37262f);
                                break;
                            }
                        } else {
                            return;
                        }
                }
            } finally {
            }
        }
    }

    @Override // z.l3
    public void e() {
        ArrayList arrayList;
        synchronized (this.f37258a) {
            try {
                if (this.b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.b);
                    this.b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                n0.l1 l1Var = (n0.l1) obj;
                Iterator<n0.u> it = l1Var.c().iterator();
                while (it.hasNext()) {
                    it.next().a(l1Var.f());
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x001a, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x008d, B:12:0x0010, B:17:0x0016, B:15:0x0025, B:20:0x001e, B:21:0x002a, B:23:0x0054, B:24:0x0058, B:26:0x005c, B:27:0x0067, B:28:0x0069, B:30:0x006b, B:31:0x0088, B:32:0x0094, B:33:0x00ac), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c A[Catch: all -> 0x001a, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x008d, B:12:0x0010, B:17:0x0016, B:15:0x0025, B:20:0x001e, B:21:0x002a, B:23:0x0054, B:24:0x0058, B:26:0x005c, B:27:0x0067, B:28:0x0069, B:30:0x006b, B:31:0x0088, B:32:0x0094, B:33:0x00ac), top: B:3:0x0003, inners: #0 }] */
    @Override // z.l3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ne.x<java.lang.Void> f(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f37258a
            monitor-enter(r0)
            z.k3$c r1 = r3.f37266j     // Catch: java.lang.Throwable -> L1a
            int r1 = r1.ordinal()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L94
            switch(r1) {
                case 2: goto L88;
                case 3: goto L6b;
                case 4: goto L58;
                case 5: goto L10;
                case 6: goto L2a;
                case 7: goto L10;
                default: goto Le;
            }     // Catch: java.lang.Throwable -> L1a
        Le:
            goto L8d
        L10:
            z.h5 r1 = r3.f37261e     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L2a
            if (r4 == 0) goto L25
            r1.e()     // Catch: java.lang.Throwable -> L1a android.hardware.camera2.CameraAccessException -> L1d
            goto L25
        L1a:
            r4 = move-exception
            goto Lad
        L1d:
            r4 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.String r2 = "Unable to abort captures."
            g0.r1.d(r1, r2, r4)     // Catch: java.lang.Throwable -> L1a
        L25:
            z.h5 r4 = r3.f37261e     // Catch: java.lang.Throwable -> L1a
            r4.close()     // Catch: java.lang.Throwable -> L1a
        L2a:
            z.k3$c r4 = z.k3.c.RELEASING     // Catch: java.lang.Throwable -> L1a
            r3.A(r4)     // Catch: java.lang.Throwable -> L1a
            d0.s r4 = r3.f37272p     // Catch: java.lang.Throwable -> L1a
            r4.g()     // Catch: java.lang.Throwable -> L1a
            z.h5$a r4 = r3.f37260d     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L1a
            z.k3$c r2 = r3.f37266j     // Catch: java.lang.Throwable -> L1a
            r1.append(r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1a
            x2.g.h(r4, r1)     // Catch: java.lang.Throwable -> L1a
            z.h5$a r4 = r3.f37260d     // Catch: java.lang.Throwable -> L1a
            boolean r4 = r4.stop()     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L58
            r3.s()     // Catch: java.lang.Throwable -> L1a
            goto L8d
        L58:
            ne.x<java.lang.Void> r4 = r3.f37267k     // Catch: java.lang.Throwable -> L1a
            if (r4 != 0) goto L67
            z.h3 r4 = new z.h3     // Catch: java.lang.Throwable -> L1a
            r4.<init>()     // Catch: java.lang.Throwable -> L1a
            ne.x r4 = y1.c.a(r4)     // Catch: java.lang.Throwable -> L1a
            r3.f37267k = r4     // Catch: java.lang.Throwable -> L1a
        L67:
            ne.x<java.lang.Void> r4 = r3.f37267k     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r4
        L6b:
            z.h5$a r4 = r3.f37260d     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L1a
            z.k3$c r2 = r3.f37266j     // Catch: java.lang.Throwable -> L1a
            r1.append(r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1a
            x2.g.h(r4, r1)     // Catch: java.lang.Throwable -> L1a
            z.h5$a r4 = r3.f37260d     // Catch: java.lang.Throwable -> L1a
            r4.stop()     // Catch: java.lang.Throwable -> L1a
        L88:
            z.k3$c r4 = z.k3.c.RELEASED     // Catch: java.lang.Throwable -> L1a
            r3.A(r4)     // Catch: java.lang.Throwable -> L1a
        L8d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            r4 = 0
            ne.x r4 = r0.n.p(r4)
            return r4
        L94:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "release() should not be possible in state: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1a
            z.k3$c r2 = r3.f37266j     // Catch: java.lang.Throwable -> L1a
            r1.append(r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1a
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            throw r4     // Catch: java.lang.Throwable -> L1a
        Lad:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z.k3.f(boolean):ne.x");
    }

    @Override // z.l3
    public List<n0.l1> g() {
        List<n0.l1> unmodifiableList;
        synchronized (this.f37258a) {
            unmodifiableList = Collections.unmodifiableList(this.b);
        }
        return unmodifiableList;
    }

    @Override // z.l3
    public n0.o3 h() {
        n0.o3 o3Var;
        synchronized (this.f37258a) {
            o3Var = this.f37262f;
        }
        return o3Var;
    }

    @Override // z.l3
    public void i(Map<n0.u1, Long> map) {
        synchronized (this.f37258a) {
            this.f37269m = map;
        }
    }

    public final int p(List<CaptureRequest> list, u2 u2Var) {
        u2 u2Var2 = new u2();
        int i10 = -1;
        for (CaptureRequest captureRequest : list) {
            h5 h5Var = this.f37261e;
            Objects.requireNonNull(h5Var);
            List<CaptureRequest> i11 = h5Var.i(captureRequest);
            Iterator<CaptureRequest> it = i11.iterator();
            while (it.hasNext()) {
                u2Var2.a(it.next(), Collections.singletonList(new a5(captureRequest, u2Var)));
            }
            i10 = this.f37261e.m(i11, u2Var2);
        }
        return i10;
    }

    public final CameraCaptureSession.CaptureCallback q(List<n0.u> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator<n0.u> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(d3.a(it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return a1.a(arrayList);
    }

    public void s() {
        c cVar = this.f37266j;
        c cVar2 = c.RELEASED;
        if (cVar == cVar2) {
            g0.r1.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        A(cVar2);
        this.f37261e = null;
        c.a<Void> aVar = this.f37268l;
        if (aVar != null) {
            aVar.c(null);
            this.f37268l = null;
        }
    }

    public final b0.i t(o3.f fVar, Map<n0.u1, Surface> map, String str) {
        long j10;
        DynamicRangeProfiles d10;
        Surface surface = map.get(fVar.f());
        x2.g.h(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        b0.i iVar = new b0.i(fVar.g(), surface);
        if (str != null) {
            iVar.g(str);
        } else {
            iVar.g(fVar.d());
        }
        if (fVar.c() == 0) {
            iVar.f(1);
        } else if (fVar.c() == 1) {
            iVar.f(2);
        }
        if (!fVar.e().isEmpty()) {
            iVar.b();
            Iterator<n0.u1> it = fVar.e().iterator();
            while (it.hasNext()) {
                Surface surface2 = map.get(it.next());
                x2.g.h(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                iVar.a(surface2);
            }
        }
        if (Build.VERSION.SDK_INT >= 33 && (d10 = this.f37273q.d()) != null) {
            g0.k0 b10 = fVar.b();
            Long a10 = b0.c.a(b10, d10);
            if (a10 != null) {
                j10 = a10.longValue();
                iVar.e(j10);
                return iVar;
            }
            g0.r1.c("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + b10);
        }
        j10 = 1;
        iVar.e(j10);
        return iVar;
    }

    public final List<b0.i> u(List<b0.i> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (b0.i iVar : list) {
            if (!arrayList.contains(iVar.d())) {
                arrayList.add(iVar.d());
                arrayList2.add(iVar);
            }
        }
        return arrayList2;
    }

    public int w(List<n0.l1> list) {
        u2 u2Var;
        ArrayList arrayList;
        int i10;
        boolean z10;
        synchronized (this.f37258a) {
            try {
                if (this.f37266j != c.OPENED) {
                    g0.r1.a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return -1;
                }
                if (list.isEmpty()) {
                    return -1;
                }
                try {
                    u2Var = new u2();
                    arrayList = new ArrayList();
                    g0.r1.a("CaptureSession", "Issuing capture request.");
                    i10 = 0;
                    z10 = false;
                    for (n0.l1 l1Var : list) {
                        if (l1Var.i().isEmpty()) {
                            g0.r1.a("CaptureSession", "Skipping issuing empty capture request.");
                        } else {
                            Iterator<n0.u1> it = l1Var.i().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    n0.u1 next = it.next();
                                    if (!this.f37263g.containsKey(next)) {
                                        g0.r1.a("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                        break;
                                    }
                                } else {
                                    if (l1Var.k() == 2) {
                                        z10 = true;
                                    }
                                    l1.a k10 = l1.a.k(l1Var);
                                    if (l1Var.k() == 5 && l1Var.d() != null) {
                                        k10.p(l1Var.d());
                                    }
                                    n0.o3 o3Var = this.f37262f;
                                    if (o3Var != null) {
                                        k10.e(o3Var.l().g());
                                    }
                                    k10.e(l1Var.g());
                                    CaptureRequest e10 = k2.e(k10.h(), this.f37261e.f(), this.f37263g, false, this.f37274r);
                                    if (e10 == null) {
                                        g0.r1.a("CaptureSession", "Skipping issuing request without surface.");
                                        return -1;
                                    }
                                    List<CameraCaptureSession.CaptureCallback> arrayList2 = new ArrayList<>();
                                    Iterator<n0.u> it2 = l1Var.c().iterator();
                                    while (it2.hasNext()) {
                                        d3.b(it2.next(), arrayList2);
                                    }
                                    u2Var.a(e10, arrayList2);
                                    arrayList.add(e10);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e11) {
                    g0.r1.c("CaptureSession", "Unable to access camera: " + e11.getMessage());
                    Thread.dumpStack();
                }
                if (arrayList.isEmpty()) {
                    g0.r1.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                    return -1;
                }
                if (this.f37270n.a(arrayList, z10)) {
                    this.f37261e.a();
                    u2Var.c(new u2.a() { // from class: z.g3
                        @Override // z.u2.a
                        public final void a(CameraCaptureSession cameraCaptureSession, int i11, boolean z11) {
                            k3.m(k3.this, cameraCaptureSession, i11, z11);
                        }
                    });
                }
                if (this.f37271o.b(arrayList, z10)) {
                    u2Var.a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new b()));
                }
                if (this.f37276t != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        this.f37276t.a((CaptureRequest) obj);
                    }
                }
                n0.o3 o3Var2 = this.f37262f;
                if (o3Var2 == null || o3Var2.n() != 1) {
                    return this.f37261e.m(arrayList, u2Var);
                }
                return p(arrayList, u2Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        this.f37272p.e().a(new Runnable() { // from class: z.j3
            @Override // java.lang.Runnable
            public final void run() {
                k3.j(k3.this);
            }
        }, q0.c.b());
    }

    public int y(n0.o3 o3Var) {
        synchronized (this.f37258a) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
            if (o3Var == null) {
                g0.r1.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            if (this.f37266j != c.OPENED) {
                g0.r1.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            }
            n0.l1 l10 = o3Var.l();
            if (l10.i().isEmpty()) {
                g0.r1.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f37261e.a();
                } catch (CameraAccessException e10) {
                    g0.r1.c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                g0.r1.a("CaptureSession", "Issuing request for session.");
                CaptureRequest e11 = k2.e(l10, this.f37261e.f(), this.f37263g, true, this.f37274r);
                if (e11 == null) {
                    g0.r1.a("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                CameraCaptureSession.CaptureCallback d10 = this.f37272p.d(q(l10.c(), new CameraCaptureSession.CaptureCallback[0]));
                f0.i iVar = this.f37276t;
                if (iVar != null) {
                    iVar.a(e11);
                }
                if (o3Var.n() != 1) {
                    return this.f37261e.g(e11, d10);
                }
                return this.f37261e.l(this.f37261e.i(e11), d10);
            } catch (CameraAccessException e12) {
                g0.r1.c("CaptureSession", "Unable to access camera: " + e12.getMessage());
                Thread.dumpStack();
                return -1;
            }
            throw th2;
        }
    }

    public final ne.x<Void> z(List<Surface> list, n0.o3 o3Var, CameraDevice cameraDevice) {
        synchronized (this.f37258a) {
            try {
                int ordinal = this.f37266j.ordinal();
                if (ordinal == 0 || ordinal == 7 || ordinal == 2) {
                    return r0.n.n(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f37266j));
                }
                if (ordinal != 3) {
                    return r0.n.n(new CancellationException("openCaptureSession() not execute in state: " + this.f37266j));
                }
                this.f37263g.clear();
                for (int i10 = 0; i10 < list.size(); i10++) {
                    this.f37263g.put(this.f37264h.get(i10), list.get(i10));
                }
                A(c.OPENING);
                g0.r1.a("CaptureSession", "Opening capture session.");
                h5.c x10 = s5.x(this.f37259c, new s5.a(o3Var.m()));
                y.a aVar = new y.a(o3Var.g());
                l1.a k10 = l1.a.k(o3Var.l());
                Map hashMap = new HashMap();
                if (this.f37275s && Build.VERSION.SDK_INT >= 35) {
                    hashMap = r(v(o3Var.i()), this.f37263g);
                }
                ArrayList arrayList = new ArrayList();
                String l02 = aVar.l0(null);
                for (o3.f fVar : o3Var.i()) {
                    b0.i iVar = (!this.f37275s || Build.VERSION.SDK_INT < 35) ? null : (b0.i) hashMap.get(fVar);
                    if (iVar == null) {
                        iVar = t(fVar, this.f37263g, l02);
                        if (this.f37269m.containsKey(fVar.f())) {
                            iVar.h(this.f37269m.get(fVar.f()).longValue());
                        }
                    }
                    arrayList.add(iVar);
                }
                b0.o k11 = this.f37260d.k(o3Var.n(), u(arrayList), x10);
                if (o3Var.q() == 5 && o3Var.h() != null) {
                    k11.f(b0.h.b(o3Var.h()));
                }
                try {
                    CaptureRequest f10 = k2.f(k10.h(), cameraDevice, this.f37274r);
                    if (f10 != null) {
                        f0.i iVar2 = this.f37276t;
                        if (iVar2 != null) {
                            iVar2.a(f10);
                        }
                        k11.g(f10);
                    }
                    return this.f37260d.h(cameraDevice, k11, this.f37264h);
                } catch (CameraAccessException e10) {
                    return r0.n.n(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k3(b0.e eVar, boolean z10) {
        this(eVar, new n0.k3(Collections.EMPTY_LIST), z10, null);
    }

    public k3(b0.e eVar, boolean z10, f0.i iVar) {
        this(eVar, new n0.k3(Collections.EMPTY_LIST), z10, iVar);
    }

    public k3(b0.e eVar, n0.k3 k3Var, f0.i iVar) {
        this(eVar, k3Var, false, iVar);
    }

    public k3(b0.e eVar, n0.k3 k3Var, boolean z10, f0.i iVar) {
        this.f37258a = new Object();
        this.b = new ArrayList();
        this.f37263g = new HashMap();
        this.f37264h = Collections.EMPTY_LIST;
        c cVar = c.UNINITIALIZED;
        this.f37265i = cVar;
        this.f37266j = cVar;
        this.f37269m = new HashMap();
        this.f37270n = new d0.v();
        this.f37271o = new d0.z();
        A(c.INITIALIZED);
        this.f37273q = eVar;
        this.f37259c = new d();
        this.f37272p = new d0.s(k3Var.a(CaptureNoResponseQuirk.class));
        this.f37274r = new d0.y(k3Var);
        this.f37275s = z10;
        this.f37276t = iVar;
    }
}
