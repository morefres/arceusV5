package m1;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Range;
import android.util.Rational;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import h1.c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import m1.i0;
import m1.l;
import n0.a3;
import n0.a4;
import y1.c;

/* loaded from: classes.dex */
public class i0 implements l {
    public static final Range<Long> H = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    public Future<?> G;

    /* renamed from: a, reason: collision with root package name */
    public final String f24111a;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24112c;

    /* renamed from: d, reason: collision with root package name */
    public final n f24113d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaFormat f24114e;

    /* renamed from: f, reason: collision with root package name */
    public final MediaCodec f24115f;

    /* renamed from: g, reason: collision with root package name */
    public final l.b f24116g;

    /* renamed from: h, reason: collision with root package name */
    public final f1 f24117h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f24118i;

    /* renamed from: j, reason: collision with root package name */
    public final ne.x<Void> f24119j;

    /* renamed from: k, reason: collision with root package name */
    public final c.a<Void> f24120k;

    /* renamed from: q, reason: collision with root package name */
    public final a4 f24126q;

    /* renamed from: r, reason: collision with root package name */
    public final o1 f24127r;

    /* renamed from: s, reason: collision with root package name */
    public final Rational f24128s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f24129t;

    /* renamed from: w, reason: collision with root package name */
    public f f24132w;
    public final Object b = new Object();

    /* renamed from: l, reason: collision with root package name */
    public final Queue<Integer> f24121l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    public final Queue<c.a<h1>> f24122m = new ArrayDeque();

    /* renamed from: n, reason: collision with root package name */
    public final Set<h1> f24123n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final Set<k> f24124o = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public final Deque<Range<Long>> f24125p = new ArrayDeque();

    /* renamed from: u, reason: collision with root package name */
    public m f24130u = m.f24188a;

    /* renamed from: v, reason: collision with root package name */
    public Executor f24131v = q0.c.b();

    /* renamed from: x, reason: collision with root package name */
    public Range<Long> f24133x = H;

    /* renamed from: y, reason: collision with root package name */
    public long f24134y = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f24135z = false;
    public Long A = null;
    public Future<?> B = null;
    public g C = null;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;

    public class a implements r0.c<h1> {

        /* renamed from: m1.i0$a$a, reason: collision with other inner class name */
        public class C0420a implements r0.c<Void> {
            public C0420a() {
            }

            @Override // r0.c
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r12) {
            }

            @Override // r0.c
            public void onFailure(Throwable th2) {
                if (th2 instanceof MediaCodec.CodecException) {
                    i0.this.L((MediaCodec.CodecException) th2);
                } else {
                    i0.this.K(0, th2.getMessage(), th2);
                }
            }
        }

        public a() {
        }

        @Override // r0.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(h1 h1Var) {
            h1Var.c(i0.this.I());
            h1Var.a(true);
            h1Var.b();
            r0.n.j(h1Var.d(), new C0420a(), i0.this.f24118i);
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            i0.this.K(0, "Unable to acquire InputBuffer.", th2);
        }
    }

    public class b extends j1 {
        public b(MediaCodec mediaCodec, int i10) {
            super(mediaCodec, i10);
        }

        @Override // m1.j1, m1.h1
        public void c(long j10) {
            i0 i0Var = i0.this;
            if (!i0Var.f24112c) {
                j10 = i0Var.e0(j10);
            }
            super.c(j10);
        }
    }

    public class c implements o1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t.a f24139a;
        public final /* synthetic */ o1 b;

        public c(t.a aVar, o1 o1Var) {
            this.f24139a = aVar;
            this.b = o1Var;
        }

        @Override // m1.o1
        public long a() {
            return ((Long) this.f24139a.apply(Long.valueOf(this.b.a()))).longValue();
        }

        @Override // m1.o1
        public long b() {
            return ((Long) this.f24139a.apply(Long.valueOf(this.b.b()))).longValue();
        }
    }

    public static class d {
        public static Surface a() {
            return MediaCodec.createPersistentInputSurface();
        }

        public static void b(MediaCodec mediaCodec, Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    public class e implements l.a {

        /* renamed from: a, reason: collision with root package name */
        public final Map<a3.a<? super c.a>, Executor> f24140a = new LinkedHashMap();
        public c.a b = c.a.INACTIVE;

        /* renamed from: c, reason: collision with root package name */
        public final List<ne.x<h1>> f24141c = new ArrayList();

        public e() {
        }

        public static /* synthetic */ Object h(final e eVar, final c.a aVar) {
            i0.this.f24118i.execute(new Runnable() { // from class: m1.q0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c(i0.e.this.b);
                }
            });
            return "fetchData";
        }

        public static /* synthetic */ void i(e eVar, final a3.a aVar, Executor executor) {
            eVar.f24140a.put((a3.a) x2.g.g(aVar), (Executor) x2.g.g(executor));
            final c.a aVar2 = eVar.b;
            executor.execute(new Runnable() { // from class: m1.r0
                @Override // java.lang.Runnable
                public final void run() {
                    a3.a.this.a(aVar2);
                }
            });
        }

        public static /* synthetic */ Object m(final e eVar, final c.a aVar) {
            i0.this.f24118i.execute(new Runnable() { // from class: m1.s0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.e.n(i0.e.this, aVar);
                }
            });
            return "acquireBuffer";
        }

        public static /* synthetic */ void n(final e eVar, c.a aVar) {
            c.a aVar2 = eVar.b;
            if (aVar2 == c.a.ACTIVE) {
                final ne.x<h1> F = i0.this.F();
                r0.n.t(F, aVar);
                aVar.a(new Runnable() { // from class: m1.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        i0.e.this.p(F);
                    }
                }, q0.c.b());
                eVar.f24141c.add(F);
                F.a(new Runnable() { // from class: m1.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        i0.e.this.f24141c.remove(F);
                    }
                }, i0.this.f24118i);
                return;
            }
            if (aVar2 == c.a.INACTIVE) {
                aVar.f(new IllegalStateException("BufferProvider is not active."));
                return;
            }
            aVar.f(new IllegalStateException("Unknown state: " + eVar.b));
        }

        @Override // n0.a3
        public ne.x<c.a> b() {
            return y1.c.a(new c.InterfaceC0669c() { // from class: m1.m0
                @Override // y1.c.InterfaceC0669c
                public final Object a(c.a aVar) {
                    return i0.e.h(i0.e.this, aVar);
                }
            });
        }

        @Override // n0.a3
        public void c(final Executor executor, final a3.a<? super c.a> aVar) {
            i0.this.f24118i.execute(new Runnable() { // from class: m1.l0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.e.i(i0.e.this, aVar, executor);
                }
            });
        }

        @Override // n0.a3
        public void d(final a3.a<? super c.a> aVar) {
            i0.this.f24118i.execute(new Runnable() { // from class: m1.o0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.e.this.f24140a.remove(x2.g.g(aVar));
                }
            });
        }

        @Override // h1.c
        public ne.x<h1> e() {
            return y1.c.a(new c.InterfaceC0669c() { // from class: m1.p0
                @Override // y1.c.InterfaceC0669c
                public final Object a(c.a aVar) {
                    return i0.e.m(i0.e.this, aVar);
                }
            });
        }

        public final void p(ne.x<h1> xVar) {
            if (xVar.cancel(true)) {
                return;
            }
            x2.g.i(xVar.isDone());
            try {
                xVar.get().cancel();
            } catch (InterruptedException | CancellationException | ExecutionException e10) {
                g0.r1.l(i0.this.f24111a, "Unable to cancel the input buffer: " + e10);
            }
        }

        public void q(boolean z10) {
            final c.a aVar = z10 ? c.a.ACTIVE : c.a.INACTIVE;
            if (this.b == aVar) {
                return;
            }
            this.b = aVar;
            if (aVar == c.a.INACTIVE) {
                Iterator<ne.x<h1>> it = this.f24141c.iterator();
                while (it.hasNext()) {
                    it.next().cancel(true);
                }
                this.f24141c.clear();
            }
            for (final Map.Entry<a3.a<? super c.a>, Executor> entry : this.f24140a.entrySet()) {
                try {
                    entry.getValue().execute(new Runnable() { // from class: m1.n0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((a3.a) entry.getKey()).a(aVar);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    g0.r1.d(i0.this.f24111a, "Unable to post to the supplied executor.", e10);
                }
            }
        }
    }

    public enum f {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    public class g extends MediaCodec.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final o1.h f24152a;
        public boolean b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f24153c = false;

        /* renamed from: d, reason: collision with root package name */
        public boolean f24154d = false;

        /* renamed from: e, reason: collision with root package name */
        public boolean f24155e = false;

        /* renamed from: f, reason: collision with root package name */
        public long f24156f = 0;

        /* renamed from: g, reason: collision with root package name */
        public long f24157g = 0;

        /* renamed from: h, reason: collision with root package name */
        public boolean f24158h = false;

        /* renamed from: i, reason: collision with root package name */
        public boolean f24159i = false;

        /* renamed from: j, reason: collision with root package name */
        public boolean f24160j = false;

        /* renamed from: k, reason: collision with root package name */
        public boolean f24161k;

        public class a implements r0.c<Void> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k f24163a;

            public a(k kVar) {
                this.f24163a = kVar;
            }

            @Override // r0.c
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r22) {
                i0.this.f24124o.remove(this.f24163a);
            }

            @Override // r0.c
            public void onFailure(Throwable th2) {
                i0.this.f24124o.remove(this.f24163a);
                if (th2 instanceof MediaCodec.CodecException) {
                    i0.this.L((MediaCodec.CodecException) th2);
                } else {
                    i0.this.K(0, th2.getMessage(), th2);
                }
            }
        }

        public g() {
            this.b = true;
            boolean z10 = i0.this.f24112c;
            this.f24161k = z10;
            if (z10) {
                this.f24152a = new o1.h(i0.this.f24127r, i0.this.f24126q, (CameraUseInconsistentTimebaseQuirk) k1.c.b(CameraUseInconsistentTimebaseQuirk.class));
            } else {
                this.f24152a = null;
            }
            CodecStuckOnFlushQuirk codecStuckOnFlushQuirk = (CodecStuckOnFlushQuirk) k1.c.b(CodecStuckOnFlushQuirk.class);
            if (codecStuckOnFlushQuirk == null || !codecStuckOnFlushQuirk.h(i0.this.f24114e.getString("mime"))) {
                return;
            }
            this.b = false;
        }

        public static /* synthetic */ MediaFormat a(MediaFormat mediaFormat) {
            return mediaFormat;
        }

        public static /* synthetic */ void b(g gVar, Executor executor, final m mVar) {
            if (i0.this.f24132w == f.ERROR) {
                return;
            }
            try {
                Objects.requireNonNull(mVar);
                executor.execute(new Runnable() { // from class: m1.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.this.a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                g0.r1.d(i0.this.f24111a, "Unable to post to the supplied executor.", e10);
            }
        }

        public static /* synthetic */ void e(g gVar, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i10) {
            i0 i0Var;
            final m mVar;
            Executor executor;
            if (gVar.f24160j) {
                g0.r1.l(i0.this.f24111a, "Receives frame after codec is reset.");
                return;
            }
            switch (i0.this.f24132w) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    synchronized (i0.this.b) {
                        i0Var = i0.this;
                        mVar = i0Var.f24130u;
                        executor = i0Var.f24131v;
                    }
                    if (i0Var.f24112c && i0Var.S()) {
                        bufferInfo.presentationTimeUs = i0.this.e0(bufferInfo.presentationTimeUs);
                    }
                    if (!gVar.f24153c) {
                        gVar.f24153c = true;
                        try {
                            Objects.requireNonNull(mVar);
                            executor.execute(new Runnable() { // from class: m1.z0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    m.this.e();
                                }
                            });
                        } catch (RejectedExecutionException e10) {
                            g0.r1.d(i0.this.f24111a, "Unable to post to the supplied executor.", e10);
                        }
                    }
                    if (gVar.i(bufferInfo)) {
                        if (!gVar.f24154d) {
                            gVar.f24154d = true;
                            g0.r1.a(i0.this.f24111a, "data timestampUs = " + bufferInfo.presentationTimeUs + ", data timebase = " + i0.this.f24126q + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                        }
                        MediaCodec.BufferInfo m10 = gVar.m(bufferInfo);
                        gVar.f24157g = m10.presentationTimeUs;
                        try {
                            gVar.n(new k(mediaCodec, i10, m10), mVar, executor);
                        } catch (MediaCodec.CodecException e11) {
                            i0.this.L(e11);
                            return;
                        }
                    } else {
                        try {
                            i0.this.f24115f.releaseOutputBuffer(i10, false);
                        } catch (MediaCodec.CodecException e12) {
                            i0.this.L(e12);
                            return;
                        }
                    }
                    if (!gVar.f24155e && gVar.j(bufferInfo)) {
                        gVar.l();
                    }
                    if (gVar.f24161k) {
                        gVar.f24161k = false;
                        return;
                    }
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + i0.this.f24132w);
            }
        }

        public static /* synthetic */ void f(g gVar, final MediaFormat mediaFormat) {
            final m mVar;
            Executor executor;
            if (gVar.f24160j) {
                g0.r1.l(i0.this.f24111a, "Receives onOutputFormatChanged after codec is reset.");
                return;
            }
            switch (i0.this.f24132w) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    i0 i0Var = i0.this;
                    if (i0Var.f24112c && i0Var.S()) {
                        mediaFormat.setInteger("time-lapse-enable", 1);
                        mediaFormat.setInteger("time-lapse-fps", ((p1) i0.this.f24113d).f());
                    }
                    synchronized (i0.this.b) {
                        i0 i0Var2 = i0.this;
                        mVar = i0Var2.f24130u;
                        executor = i0Var2.f24131v;
                    }
                    try {
                        executor.execute(new Runnable() { // from class: m1.a1
                            @Override // java.lang.Runnable
                            public final void run() {
                                m.this.f(new l1() { // from class: m1.d1
                                    @Override // m1.l1
                                    public final MediaFormat a() {
                                        return i0.g.a(r1);
                                    }
                                });
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e10) {
                        g0.r1.d(i0.this.f24111a, "Unable to post to the supplied executor.", e10);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + i0.this.f24132w);
            }
        }

        public static /* synthetic */ void g(g gVar, int i10) {
            if (gVar.f24160j) {
                g0.r1.l(i0.this.f24111a, "Receives input frame after codec is reset.");
                return;
            }
            switch (i0.this.f24132w) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    i0.this.f24121l.offer(Integer.valueOf(i10));
                    i0.this.T();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + i0.this.f24132w);
            }
        }

        public static /* synthetic */ void h(g gVar, MediaCodec.CodecException codecException) {
            switch (i0.this.f24132w) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    i0.this.L(codecException);
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + i0.this.f24132w);
            }
        }

        public final boolean i(MediaCodec.BufferInfo bufferInfo) {
            if (this.f24155e) {
                g0.r1.a(i0.this.f24111a, "Drop buffer by already reach end of stream.");
                return false;
            }
            if (bufferInfo.size <= 0) {
                g0.r1.a(i0.this.f24111a, "Drop buffer by invalid buffer size.");
                return false;
            }
            if ((bufferInfo.flags & 2) != 0) {
                g0.r1.a(i0.this.f24111a, "Drop buffer by codec config.");
                return false;
            }
            o1.h hVar = this.f24152a;
            if (hVar != null) {
                bufferInfo.presentationTimeUs = hVar.b(bufferInfo.presentationTimeUs);
            }
            long j10 = bufferInfo.presentationTimeUs;
            if (j10 <= this.f24156f) {
                g0.r1.a(i0.this.f24111a, "Drop buffer by out of order buffer from MediaCodec.");
                return false;
            }
            this.f24156f = j10;
            if (!i0.this.f24133x.contains((Range<Long>) Long.valueOf(j10))) {
                g0.r1.a(i0.this.f24111a, "Drop buffer by not in start-stop range.");
                i0 i0Var = i0.this;
                if (i0Var.f24135z && bufferInfo.presentationTimeUs >= i0Var.f24133x.getUpper().longValue()) {
                    Future<?> future = i0.this.B;
                    if (future != null) {
                        future.cancel(true);
                    }
                    i0.this.A = Long.valueOf(bufferInfo.presentationTimeUs);
                    i0.this.a0();
                    i0.this.f24135z = false;
                }
                return false;
            }
            if (q(bufferInfo)) {
                g0.r1.a(i0.this.f24111a, "Drop buffer by pause.");
                return false;
            }
            if (i0.this.J(bufferInfo) <= this.f24157g) {
                g0.r1.a(i0.this.f24111a, "Drop buffer by adjusted time is less than the last sent time.");
                if (i0.this.f24112c && i0.Q(bufferInfo)) {
                    this.f24159i = true;
                }
                return false;
            }
            if (!this.f24154d && !this.f24159i && i0.this.f24112c) {
                this.f24159i = true;
            }
            if (this.f24159i) {
                if (!i0.Q(bufferInfo)) {
                    g0.r1.a(i0.this.f24111a, "Drop buffer by not a key frame.");
                    i0.this.W();
                    return false;
                }
                this.f24159i = false;
            }
            return true;
        }

        public final boolean j(MediaCodec.BufferInfo bufferInfo) {
            if (!i0.N(bufferInfo) || o()) {
                return this.b && k(bufferInfo);
            }
            return true;
        }

        public final boolean k(MediaCodec.BufferInfo bufferInfo) {
            i0 i0Var = i0.this;
            return i0Var.F && bufferInfo.presentationTimeUs > i0Var.f24133x.getUpper().longValue();
        }

        public void l() {
            i0 i0Var;
            final m mVar;
            final Executor executor;
            g0.r1.a(i0.this.f24111a, "reachEndData");
            if (this.f24155e) {
                return;
            }
            this.f24155e = true;
            if (i0.this.G != null) {
                i0.this.G.cancel(false);
                i0.this.G = null;
            }
            synchronized (i0.this.b) {
                i0Var = i0.this;
                mVar = i0Var.f24130u;
                executor = i0Var.f24131v;
            }
            i0Var.d0(new Runnable() { // from class: m1.b1
                @Override // java.lang.Runnable
                public final void run() {
                    i0.g.b(i0.g.this, executor, mVar);
                }
            });
        }

        public final MediaCodec.BufferInfo m(MediaCodec.BufferInfo bufferInfo) {
            long J = i0.this.J(bufferInfo);
            if (bufferInfo.presentationTimeUs == J) {
                return bufferInfo;
            }
            x2.g.i(J > this.f24157g);
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, J, bufferInfo.flags);
            return bufferInfo2;
        }

        public final void n(final k kVar, final m mVar, Executor executor) {
            i0.this.f24124o.add(kVar);
            r0.n.j(kVar.b(), new a(kVar), i0.this.f24118i);
            try {
                executor.execute(new Runnable() { // from class: m1.c1
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.this.b(kVar);
                    }
                });
            } catch (RejectedExecutionException e10) {
                g0.r1.d(i0.this.f24111a, "Unable to post to the supplied executor.", e10);
                kVar.close();
            }
        }

        public final boolean o() {
            return this.f24161k && k1.c.b(PrematureEndOfStreamVideoQuirk.class) != null;
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, final MediaCodec.CodecException codecException) {
            i0.this.f24118i.execute(new Runnable() { // from class: m1.x0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.g.h(i0.g.this, codecException);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, final int i10) {
            i0.this.f24118i.execute(new Runnable() { // from class: m1.v0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.g.g(i0.g.this, i10);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i10, final MediaCodec.BufferInfo bufferInfo) {
            i0.this.f24118i.execute(new Runnable() { // from class: m1.w0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.g.e(i0.g.this, bufferInfo, mediaCodec, i10);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, final MediaFormat mediaFormat) {
            g0.r1.a(i0.this.f24111a, "onOutputFormatChanged: mediaFormat = " + mediaFormat + ", CSD data = " + h1.d.d(mediaFormat));
            i0.this.f24118i.execute(new Runnable() { // from class: m1.y0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.g.f(i0.g.this, mediaFormat);
                }
            });
        }

        public void p() {
            this.f24160j = true;
        }

        public final boolean q(MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            final m mVar;
            i0.this.g0(bufferInfo.presentationTimeUs);
            boolean P = i0.this.P(bufferInfo.presentationTimeUs);
            boolean z10 = this.f24158h;
            if (!z10 && P) {
                g0.r1.a(i0.this.f24111a, "Switch to pause state");
                this.f24158h = true;
                synchronized (i0.this.b) {
                    i0 i0Var = i0.this;
                    executor = i0Var.f24131v;
                    mVar = i0Var.f24130u;
                }
                Objects.requireNonNull(mVar);
                executor.execute(new Runnable() { // from class: m1.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.this.d();
                    }
                });
                i0 i0Var2 = i0.this;
                if (i0Var2.f24132w == f.PAUSED && ((i0Var2.f24112c || k1.c.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!i0.this.f24112c || k1.c.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                    l.b bVar = i0.this.f24116g;
                    if (bVar instanceof e) {
                        ((e) bVar).q(false);
                    }
                    i0.this.Y(true);
                }
                i0.this.A = Long.valueOf(bufferInfo.presentationTimeUs);
                i0 i0Var3 = i0.this;
                if (i0Var3.f24135z) {
                    Future<?> future = i0Var3.B;
                    if (future != null) {
                        future.cancel(true);
                    }
                    i0.this.a0();
                    i0.this.f24135z = false;
                }
            } else if (z10 && !P) {
                g0.r1.a(i0.this.f24111a, "Switch to resume state");
                this.f24158h = false;
                if (i0.this.f24112c && !i0.Q(bufferInfo)) {
                    this.f24159i = true;
                }
            }
            return this.f24158h;
        }
    }

    public class h implements l.c {
        public Surface b;

        /* renamed from: d, reason: collision with root package name */
        public l.c.a f24166d;

        /* renamed from: e, reason: collision with root package name */
        public Executor f24167e;

        /* renamed from: a, reason: collision with root package name */
        public final Object f24164a = new Object();

        /* renamed from: c, reason: collision with root package name */
        public final Set<Surface> f24165c = new HashSet();

        public h() {
        }

        @Override // m1.l.c
        public void a(Executor executor, l.c.a aVar) {
            Surface surface;
            synchronized (this.f24164a) {
                this.f24166d = (l.c.a) x2.g.g(aVar);
                this.f24167e = (Executor) x2.g.g(executor);
                surface = this.b;
            }
            if (surface != null) {
                c(executor, aVar, surface);
            }
        }

        public final void c(Executor executor, final l.c.a aVar, final Surface surface) {
            try {
                executor.execute(new Runnable() { // from class: m1.e1
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.c.a.this.a(surface);
                    }
                });
            } catch (RejectedExecutionException e10) {
                g0.r1.d(i0.this.f24111a, "Unable to post to the supplied executor.", e10);
            }
        }

        public void d() {
            Surface surface;
            HashSet hashSet;
            synchronized (this.f24164a) {
                surface = this.b;
                this.b = null;
                hashSet = new HashSet(this.f24165c);
                this.f24165c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }

        @SuppressLint({"NewApi"})
        public void e() {
            Surface createInputSurface;
            l.c.a aVar;
            Executor executor;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) k1.c.b(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (this.f24164a) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (this.b == null) {
                            createInputSurface = d.a();
                            this.b = createInputSurface;
                        } else {
                            createInputSurface = null;
                        }
                        d.b(i0.this.f24115f, this.b);
                    } else {
                        Surface surface = this.b;
                        if (surface != null) {
                            this.f24165c.add(surface);
                        }
                        createInputSurface = i0.this.f24115f.createInputSurface();
                        this.b = createInputSurface;
                    }
                    aVar = this.f24166d;
                    executor = this.f24167e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (createInputSurface == null || aVar == null || executor == null) {
                return;
            }
            c(executor, aVar, createInputSurface);
        }
    }

    public i0(Executor executor, n nVar, int i10) {
        boolean z10 = false;
        x2.g.g(executor);
        this.f24113d = (n) x2.g.g(nVar);
        MediaCodec b10 = n1.a.b(nVar);
        this.f24115f = b10;
        MediaCodecInfo codecInfo = b10.getCodecInfo();
        this.f24118i = q0.c.g(executor);
        MediaFormat a10 = nVar.a();
        this.f24114e = a10;
        a4 c10 = nVar.c();
        this.f24126q = c10;
        this.f24127r = f0(new n1(), new t.a() { // from class: m1.d0
            @Override // t.a
            public final Object apply(Object obj) {
                long e02;
                e02 = i0.this.e0(((Long) obj).longValue());
                return Long.valueOf(e02);
            }
        });
        if (nVar instanceof m1.a) {
            m1.a aVar = (m1.a) nVar;
            this.f24111a = "AudioEncoder";
            this.f24112c = false;
            this.f24116g = new e();
            this.f24117h = new m1.b(codecInfo, nVar.b());
            this.f24128s = new Rational(aVar.f(), aVar.h());
        } else {
            if (!(nVar instanceof p1)) {
                throw new k1("Unknown encoder config type");
            }
            p1 p1Var = (p1) nVar;
            this.f24111a = "VideoEncoder";
            this.f24112c = true;
            this.f24116g = new h();
            t1 t1Var = new t1(codecInfo, nVar.b());
            H(t1Var, a10);
            this.f24117h = t1Var;
            this.f24128s = new Rational(p1Var.f(), p1Var.i());
        }
        g0.r1.a(this.f24111a, "mInputTimebase = " + c10);
        g0.r1.a(this.f24111a, "mMediaFormat = " + a10);
        g0.r1.a(this.f24111a, "mCaptureToEncodeFrameRateRatio = " + this.f24128s);
        try {
            X();
            final AtomicReference atomicReference = new AtomicReference();
            this.f24119j = r0.n.s(y1.c.a(new c.InterfaceC0669c() { // from class: m1.e0
                @Override // y1.c.InterfaceC0669c
                public final Object a(c.a aVar2) {
                    return i0.v(atomicReference, aVar2);
                }
            }));
            this.f24120k = (c.a) x2.g.g((c.a) atomicReference.get());
            if (this.f24112c && i10 == 1 && k1.c.b(PreviewFreezeAfterHighSpeedRecordingQuirk.class) != null) {
                z10 = true;
            }
            this.f24129t = z10;
            Z(f.CONFIGURED);
        } catch (MediaCodec.CodecException e10) {
            throw new k1(e10);
        }
    }

    public static boolean N(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 4) != 0;
    }

    public static boolean Q(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    public static boolean R(Rational rational) {
        return rational != null && rational.getDenominator() == rational.getNumerator();
    }

    public static o1 f0(o1 o1Var, t.a<Long, Long> aVar) {
        return new c(aVar, o1Var);
    }

    public static /* synthetic */ void i(i0 i0Var) {
        if (i0Var.f24135z) {
            g0.r1.l(i0Var.f24111a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
            i0Var.A = null;
            i0Var.a0();
            i0Var.f24135z = false;
        }
    }

    public static /* synthetic */ void k(i0 i0Var) {
        int ordinal = i0Var.f24132w.ordinal();
        if (ordinal == 1) {
            i0Var.W();
        } else if (ordinal == 6 || ordinal == 8) {
            throw new IllegalStateException("Encoder is released");
        }
    }

    public static /* synthetic */ void m(i0 i0Var, long j10) {
        switch (i0Var.f24132w) {
            case CONFIGURED:
            case PAUSED:
            case STOPPING:
            case PENDING_START_PAUSED:
            case ERROR:
                return;
            case STARTED:
                g0.r1.a(i0Var.f24111a, "Pause on " + h1.d.f(j10));
                i0Var.f24125p.addLast(Range.create(Long.valueOf(j10), Long.MAX_VALUE));
                i0Var.Z(f.PAUSED);
                return;
            case PENDING_START:
                i0Var.Z(f.PENDING_START_PAUSED);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + i0Var.f24132w);
        }
    }

    public static /* synthetic */ void n(Executor executor, final g gVar) {
        Objects.requireNonNull(gVar);
        executor.execute(new Runnable() { // from class: m1.c0
            @Override // java.lang.Runnable
            public final void run() {
                i0.g.this.l();
            }
        });
    }

    public static /* synthetic */ void q(i0 i0Var) {
        i0Var.E = true;
        if (i0Var.D) {
            if (!i0Var.f24129t) {
                g0.r1.a(i0Var.f24111a, "mMediaCodec.stop()");
                i0Var.f24115f.stop();
            }
            i0Var.X();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void s(final m1.i0 r6, long r7, long r9) {
        /*
            m1.i0$f r0 = r6.f24132w
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto Lba;
                case 1: goto L30;
                case 2: goto L30;
                case 3: goto Lba;
                case 4: goto L2a;
                case 5: goto L2a;
                case 6: goto L22;
                case 7: goto Lba;
                case 8: goto L22;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unknown state: "
            r8.append(r9)
            m1.i0$f r6 = r6.f24132w
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        L22:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Encoder is released"
            r6.<init>(r7)
            throw r6
        L2a:
            m1.i0$f r7 = m1.i0.f.CONFIGURED
            r6.Z(r7)
            return
        L30:
            m1.i0$f r0 = r6.f24132w
            m1.i0$f r1 = m1.i0.f.STOPPING
            r6.Z(r1)
            android.util.Range<java.lang.Long> r1 = r6.f24133x
            java.lang.Comparable r1 = r1.getLower()
            java.lang.Long r1 = (java.lang.Long) r1
            long r2 = r1.longValue()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto Lb2
            r4 = -1
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L53
            goto L5e
        L53:
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 >= 0) goto L5f
            java.lang.String r7 = r6.f24111a
            java.lang.String r8 = "The expected stop time is less than the start time. Use current time as stop time."
            g0.r1.l(r7, r8)
        L5e:
            r7 = r9
        L5f:
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 < 0) goto Laa
            java.lang.Long r9 = java.lang.Long.valueOf(r7)
            android.util.Range r9 = android.util.Range.create(r1, r9)
            r6.f24133x = r9
            java.lang.String r9 = r6.f24111a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "Stop on "
            r10.append(r1)
            java.lang.String r7 = h1.d.f(r7)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            g0.r1.a(r9, r7)
            m1.i0$f r7 = m1.i0.f.PAUSED
            if (r0 != r7) goto L93
            java.lang.Long r7 = r6.A
            if (r7 == 0) goto L93
            r6.a0()
            return
        L93:
            r7 = 1
            r6.f24135z = r7
            java.util.concurrent.ScheduledExecutorService r7 = q0.c.e()
            m1.v r8 = new m1.v
            r8.<init>()
            r9 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r7 = r7.schedule(r8, r9, r0)
            r6.B = r7
            return
        Laa:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r7 = "The start time should be before the stop time."
            r6.<init>(r7)
            throw r6
        Lb2:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r7 = "There should be a \"start\" before \"stop\""
            r6.<init>(r7)
            throw r6
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.i0.s(m1.i0, long, long):void");
    }

    public static /* synthetic */ void t(i0 i0Var, long j10) {
        switch (i0Var.f24132w) {
            case CONFIGURED:
                i0Var.A = null;
                g0.r1.a(i0Var.f24111a, "Start on " + h1.d.f(j10));
                try {
                    if (i0Var.D) {
                        i0Var.X();
                    }
                    i0Var.f24133x = Range.create(Long.valueOf(j10), Long.MAX_VALUE);
                    g0.r1.a(i0Var.f24111a, "mMediaCodec.start()");
                    i0Var.f24115f.start();
                    l.b bVar = i0Var.f24116g;
                    if (bVar instanceof e) {
                        ((e) bVar).q(true);
                    }
                    i0Var.Z(f.STARTED);
                    return;
                } catch (MediaCodec.CodecException e10) {
                    i0Var.L(e10);
                    return;
                }
            case STARTED:
            case PENDING_START:
            case ERROR:
                return;
            case PAUSED:
                i0Var.A = null;
                Range<Long> removeLast = i0Var.f24125p.removeLast();
                x2.g.j(removeLast != null && removeLast.getUpper().longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                Long lower = removeLast.getLower();
                long longValue = lower.longValue();
                i0Var.f24125p.addLast(Range.create(lower, Long.valueOf(j10)));
                g0.r1.a(i0Var.f24111a, "Resume on " + h1.d.f(j10) + "\nPaused duration = " + h1.d.f(j10 - longValue));
                if ((i0Var.f24112c || k1.c.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!i0Var.f24112c || k1.c.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                    i0Var.Y(false);
                    l.b bVar2 = i0Var.f24116g;
                    if (bVar2 instanceof e) {
                        ((e) bVar2).q(true);
                    }
                }
                if (i0Var.f24112c) {
                    i0Var.W();
                }
                i0Var.Z(f.STARTED);
                return;
            case STOPPING:
            case PENDING_START_PAUSED:
                i0Var.Z(f.PENDING_START);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + i0Var.f24132w);
        }
    }

    public static /* synthetic */ Object v(AtomicReference atomicReference, c.a aVar) {
        atomicReference.set(aVar);
        return "mReleasedFuture";
    }

    public static /* synthetic */ void x(i0 i0Var, List list, Runnable runnable) {
        if (i0Var.f24132w != f.ERROR) {
            if (!list.isEmpty()) {
                g0.r1.a(i0Var.f24111a, "encoded data and input buffers are returned");
            }
            if (!(i0Var.f24116g instanceof h) || i0Var.E || i0Var.O()) {
                g0.r1.a(i0Var.f24111a, "mMediaCodec.stop()");
                i0Var.f24115f.stop();
            } else {
                if (i0Var.f24129t) {
                    g0.r1.a(i0Var.f24111a, "mMediaCodec.stop()");
                    i0Var.f24115f.stop();
                } else {
                    g0.r1.a(i0Var.f24111a, "mMediaCodec.flush()");
                    i0Var.f24115f.flush();
                }
                i0Var.D = true;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        i0Var.M();
    }

    public static /* synthetic */ void y(i0 i0Var) {
        switch (i0Var.f24132w) {
            case CONFIGURED:
            case STARTED:
            case PAUSED:
            case ERROR:
                i0Var.V();
                return;
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
                i0Var.Z(f.PENDING_RELEASE);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + i0Var.f24132w);
        }
    }

    public static /* synthetic */ Object z(AtomicReference atomicReference, c.a aVar) {
        atomicReference.set(aVar);
        return "acquireInputBuffer";
    }

    public ne.x<h1> F() {
        switch (this.f24132w) {
            case CONFIGURED:
                return r0.n.n(new IllegalStateException("Encoder is not started yet."));
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                final AtomicReference atomicReference = new AtomicReference();
                ne.x<h1> a10 = y1.c.a(new c.InterfaceC0669c() { // from class: m1.a0
                    @Override // y1.c.InterfaceC0669c
                    public final Object a(c.a aVar) {
                        return i0.z(atomicReference, aVar);
                    }
                });
                final c.a<h1> aVar = (c.a) x2.g.g((c.a) atomicReference.get());
                this.f24122m.offer(aVar);
                aVar.a(new Runnable() { // from class: m1.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        i0.this.f24122m.remove(aVar);
                    }
                }, this.f24118i);
                T();
                return a10;
            case ERROR:
                return r0.n.n(new IllegalStateException("Encoder is in error state."));
            case RELEASED:
                return r0.n.n(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.f24132w);
        }
    }

    public final void G() {
        if (k1.c.b(SignalEosOutputBufferNotComeQuirk.class) != null) {
            final g gVar = this.C;
            final Executor executor = this.f24118i;
            Future<?> future = this.G;
            if (future != null) {
                future.cancel(false);
            }
            this.G = q0.c.e().schedule(new Runnable() { // from class: m1.z
                @Override // java.lang.Runnable
                public final void run() {
                    i0.n(executor, gVar);
                }
            }, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void H(r1 r1Var, MediaFormat mediaFormat) {
        x2.g.i(this.f24112c);
        if (mediaFormat.containsKey("bitrate")) {
            int integer = mediaFormat.getInteger("bitrate");
            int intValue = r1Var.g().clamp(Integer.valueOf(integer)).intValue();
            if (integer != intValue) {
                mediaFormat.setInteger("bitrate", intValue);
                g0.r1.a(this.f24111a, "updated bitrate from " + integer + " to " + intValue);
            }
        }
    }

    public long I() {
        return this.f24127r.b();
    }

    public long J(MediaCodec.BufferInfo bufferInfo) {
        long j10 = this.f24134y;
        return j10 > 0 ? bufferInfo.presentationTimeUs - j10 : bufferInfo.presentationTimeUs;
    }

    public void K(final int i10, final String str, final Throwable th2) {
        switch (this.f24132w) {
            case CONFIGURED:
                U(i10, str, th2);
                X();
                break;
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                Z(f.ERROR);
                d0(new Runnable() { // from class: m1.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        i0.this.U(i10, str, th2);
                    }
                });
                break;
            case ERROR:
                g0.r1.m(this.f24111a, "Get more than one error: " + str + "(" + i10 + ")", th2);
                break;
        }
    }

    public void L(MediaCodec.CodecException codecException) {
        K(1, codecException.getMessage(), codecException);
    }

    public void M() {
        f fVar = this.f24132w;
        if (fVar == f.PENDING_RELEASE) {
            V();
            return;
        }
        if (!this.D) {
            X();
        }
        Z(f.CONFIGURED);
        if (fVar == f.PENDING_START || fVar == f.PENDING_START_PAUSED) {
            start();
            if (fVar == f.PENDING_START_PAUSED) {
                pause();
            }
        }
    }

    public final boolean O() {
        return k1.c.b(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) != null;
    }

    public boolean P(long j10) {
        for (Range<Long> range : this.f24125p) {
            if (range.contains((Range<Long>) Long.valueOf(j10))) {
                return true;
            }
            if (j10 < range.getLower().longValue()) {
                break;
            }
        }
        return false;
    }

    public final boolean S() {
        return !R(this.f24128s);
    }

    public void T() {
        while (!this.f24122m.isEmpty() && !this.f24121l.isEmpty()) {
            c.a poll = this.f24122m.poll();
            Objects.requireNonNull(poll);
            Integer poll2 = this.f24121l.poll();
            Objects.requireNonNull(poll2);
            try {
                final b bVar = new b(this.f24115f, poll2.intValue());
                if (poll.c(bVar)) {
                    this.f24123n.add(bVar);
                    bVar.d().a(new Runnable() { // from class: m1.w
                        @Override // java.lang.Runnable
                        public final void run() {
                            i0.this.f24123n.remove(bVar);
                        }
                    }, this.f24118i);
                } else {
                    bVar.cancel();
                }
            } catch (MediaCodec.CodecException e10) {
                L(e10);
                return;
            }
        }
    }

    public void U(final int i10, final String str, final Throwable th2) {
        final m mVar;
        Executor executor;
        synchronized (this.b) {
            mVar = this.f24130u;
            executor = this.f24131v;
        }
        try {
            executor.execute(new Runnable() { // from class: m1.t
                @Override // java.lang.Runnable
                public final void run() {
                    m.this.c(new h(i10, str, th2));
                }
            });
        } catch (RejectedExecutionException e10) {
            g0.r1.d(this.f24111a, "Unable to post to the supplied executor.", e10);
        }
    }

    public final void V() {
        g0.r1.a(this.f24111a, "releaseInternal");
        if (this.D) {
            if (!this.f24129t) {
                g0.r1.a(this.f24111a, "mMediaCodec.stop()");
                this.f24115f.stop();
            }
            this.D = false;
        }
        g0.r1.a(this.f24111a, "mMediaCodec.release()");
        this.f24115f.release();
        l.b bVar = this.f24116g;
        if (bVar instanceof h) {
            ((h) bVar).d();
        }
        Z(f.RELEASED);
        this.f24120k.c(null);
    }

    public void W() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        g0.r1.a(this.f24111a, "mMediaCodec.setParameters - requestKeyFrameToMediaCodec");
        this.f24115f.setParameters(bundle);
    }

    public final void X() {
        this.f24133x = H;
        this.f24134y = 0L;
        this.f24125p.clear();
        this.f24121l.clear();
        Iterator<c.a<h1>> it = this.f24122m.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        this.f24122m.clear();
        g0.r1.a(this.f24111a, "mMediaCodec.reset()");
        this.f24115f.reset();
        this.D = false;
        this.E = false;
        this.F = false;
        this.f24135z = false;
        Future<?> future = this.B;
        if (future != null) {
            future.cancel(true);
            this.B = null;
        }
        Future<?> future2 = this.G;
        if (future2 != null) {
            future2.cancel(false);
            this.G = null;
        }
        g gVar = this.C;
        if (gVar != null) {
            gVar.p();
        }
        this.C = new g();
        g0.r1.a(this.f24111a, "mMediaCodec.setCallback()");
        this.f24115f.setCallback(this.C);
        g0.r1.a(this.f24111a, "mMediaCodec.configure()");
        this.f24115f.configure(this.f24114e, (Surface) null, (MediaCrypto) null, 1);
        l.b bVar = this.f24116g;
        if (bVar instanceof h) {
            ((h) bVar).e();
        }
    }

    public void Y(boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z10 ? 1 : 0);
        g0.r1.a(this.f24111a, "mMediaCodec.setParameters - setMediaCodecPaused: " + z10);
        this.f24115f.setParameters(bundle);
    }

    public final void Z(f fVar) {
        if (this.f24132w == fVar) {
            return;
        }
        g0.r1.a(this.f24111a, "Transitioning encoder internal state: " + this.f24132w + " --> " + fVar);
        this.f24132w = fVar;
    }

    @Override // m1.l
    public void a() {
        this.f24118i.execute(new Runnable() { // from class: m1.g0
            @Override // java.lang.Runnable
            public final void run() {
                i0.y(i0.this);
            }
        });
    }

    public void a0() {
        g0.r1.a(this.f24111a, "signalCodecStop");
        l.b bVar = this.f24116g;
        if (bVar instanceof e) {
            ((e) bVar).q(false);
            ArrayList arrayList = new ArrayList();
            Iterator<h1> it = this.f24123n.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().d());
            }
            r0.n.w(arrayList).a(new Runnable() { // from class: m1.y
                @Override // java.lang.Runnable
                public final void run() {
                    i0.this.b0();
                }
            }, this.f24118i);
            return;
        }
        if (bVar instanceof h) {
            try {
                G();
                g0.r1.a(this.f24111a, "mMediaCodec.signalEndOfInputStream()");
                this.f24115f.signalEndOfInputStream();
                this.F = true;
            } catch (MediaCodec.CodecException e10) {
                L(e10);
            }
        }
    }

    @Override // m1.l
    public l.b b() {
        return this.f24116g;
    }

    public final void b0() {
        g0.r1.a(this.f24111a, "signalEndOfInputStream");
        r0.n.j(F(), new a(), this.f24118i);
    }

    @Override // m1.l
    public void c(m mVar, Executor executor) {
        synchronized (this.b) {
            this.f24130u = mVar;
            this.f24131v = executor;
        }
    }

    public void c0() {
        g0.r1.a(this.f24111a, "signalSourceStopped");
        this.f24118i.execute(new Runnable() { // from class: m1.h0
            @Override // java.lang.Runnable
            public final void run() {
                i0.q(i0.this);
            }
        });
    }

    @Override // m1.l
    public void d(final long j10) {
        final long I = I();
        this.f24118i.execute(new Runnable() { // from class: m1.s
            @Override // java.lang.Runnable
            public final void run() {
                i0.s(i0.this, j10, I);
            }
        });
    }

    public void d0(final Runnable runnable) {
        g0.r1.a(this.f24111a, "stopMediaCodec");
        final ArrayList arrayList = new ArrayList();
        Iterator<k> it = this.f24124o.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        Iterator<h1> it2 = this.f24123n.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().d());
        }
        if (!arrayList.isEmpty()) {
            g0.r1.a(this.f24111a, "Waiting for resources to return. encoded data = " + this.f24124o.size() + ", input buffers = " + this.f24123n.size());
        }
        r0.n.w(arrayList).a(new Runnable() { // from class: m1.u
            @Override // java.lang.Runnable
            public final void run() {
                i0.x(i0.this, arrayList, runnable);
            }
        }, this.f24118i);
    }

    @Override // m1.l
    public f1 e() {
        return this.f24117h;
    }

    public final long e0(long j10) {
        return S() ? Math.round(j10 * this.f24128s.doubleValue()) : j10;
    }

    @Override // m1.l
    public ne.x<Void> f() {
        return this.f24119j;
    }

    @Override // m1.l
    public void g() {
        this.f24118i.execute(new Runnable() { // from class: m1.p
            @Override // java.lang.Runnable
            public final void run() {
                i0.k(i0.this);
            }
        });
    }

    public void g0(long j10) {
        while (!this.f24125p.isEmpty()) {
            Range<Long> first = this.f24125p.getFirst();
            if (j10 <= first.getUpper().longValue()) {
                return;
            }
            this.f24125p.removeFirst();
            this.f24134y += first.getUpper().longValue() - first.getLower().longValue();
            g0.r1.a(this.f24111a, "Total paused duration = " + h1.d.f(this.f24134y));
        }
    }

    @Override // m1.l
    public int h() {
        if (this.f24114e.containsKey("bitrate")) {
            return this.f24114e.getInteger("bitrate");
        }
        return 0;
    }

    @Override // m1.l
    public void pause() {
        final long I = I();
        this.f24118i.execute(new Runnable() { // from class: m1.f0
            @Override // java.lang.Runnable
            public final void run() {
                i0.m(i0.this, I);
            }
        });
    }

    @Override // m1.l
    public void start() {
        final long I = I();
        this.f24118i.execute(new Runnable() { // from class: m1.q
            @Override // java.lang.Runnable
            public final void run() {
                i0.t(i0.this, I);
            }
        });
    }
}
