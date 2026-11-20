package f1;

import android.content.ContentValues;
import android.content.Context;
import android.location.Location;
import android.media.MediaMuxer;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import f1.a2;
import f1.b2;
import f1.c2;
import f1.g1;
import f1.r0;
import f1.s;
import g0.v2;
import h1.f;
import i1.n;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m1.l;
import n0.a3;
import n0.a4;
import n0.s3;
import n0.y2;
import y1.c;

/* loaded from: classes.dex */
public final class r0 implements a2 {
    public static long A0;

    /* renamed from: q0, reason: collision with root package name */
    public static final Set<l> f16496q0 = Collections.unmodifiableSet(EnumSet.of(l.PENDING_RECORDING, l.PENDING_PAUSED));

    /* renamed from: r0, reason: collision with root package name */
    public static final Set<l> f16497r0 = Collections.unmodifiableSet(EnumSet.of(l.CONFIGURING, l.IDLING, l.RESETTING, l.STOPPING, l.ERROR));

    /* renamed from: s0, reason: collision with root package name */
    public static final a0 f16498s0;

    /* renamed from: t0, reason: collision with root package name */
    public static final c2 f16499t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final s f16500u0;

    /* renamed from: v0, reason: collision with root package name */
    public static final Exception f16501v0;

    /* renamed from: w0, reason: collision with root package name */
    public static final m1.o f16502w0;

    /* renamed from: x0, reason: collision with root package name */
    public static final f.a f16503x0;

    /* renamed from: y0, reason: collision with root package name */
    public static final Executor f16504y0;

    /* renamed from: z0, reason: collision with root package name */
    public static int f16505z0;
    public Integer A;
    public v2 B;
    public a4 C;
    public Surface D;
    public Surface E;
    public MediaMuxer F;
    public final y2<s> G;
    public i1.n H;
    public m1.l I;
    public m1.l1 J;
    public m1.l K;
    public m1.l1 L;
    public h M;
    public Uri N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public int S;
    public long T;
    public long U;
    public long V;
    public long W;
    public long X;
    public int Y;
    public Throwable Z;

    /* renamed from: a, reason: collision with root package name */
    public final y2<g1> f16506a;

    /* renamed from: a0, reason: collision with root package name */
    public m1.i f16507a0;
    public final y2<Boolean> b;

    /* renamed from: b0, reason: collision with root package name */
    public final w0.c<m1.i> f16508b0;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f16509c;

    /* renamed from: c0, reason: collision with root package name */
    public Throwable f16510c0;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f16511d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f16512d0;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f16513e;

    /* renamed from: e0, reason: collision with root package name */
    public a2.a f16514e0;

    /* renamed from: f, reason: collision with root package name */
    public final m1.o f16515f;

    /* renamed from: f0, reason: collision with root package name */
    public ScheduledFuture<?> f16516f0;

    /* renamed from: g, reason: collision with root package name */
    public final m1.o f16517g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f16518g0;

    /* renamed from: h, reason: collision with root package name */
    public final f.a f16519h;

    /* renamed from: h0, reason: collision with root package name */
    public z1 f16520h0;

    /* renamed from: i, reason: collision with root package name */
    public final Object f16521i = new Object();

    /* renamed from: i0, reason: collision with root package name */
    public m1.p1 f16522i0;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f16523j;

    /* renamed from: j0, reason: collision with root package name */
    public z1 f16524j0;

    /* renamed from: k, reason: collision with root package name */
    public final int f16525k;

    /* renamed from: k0, reason: collision with root package name */
    public double f16526k0;

    /* renamed from: l, reason: collision with root package name */
    public final long f16527l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f16528l0;

    /* renamed from: m, reason: collision with root package name */
    public final y2<Range<Integer>> f16529m;

    /* renamed from: m0, reason: collision with root package name */
    public k f16530m0;

    /* renamed from: n, reason: collision with root package name */
    public l f16531n;

    /* renamed from: n0, reason: collision with root package name */
    public h1.f f16532n0;

    /* renamed from: o, reason: collision with root package name */
    public l f16533o;

    /* renamed from: o0, reason: collision with root package name */
    public long f16534o0;

    /* renamed from: p, reason: collision with root package name */
    public int f16535p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f16536p0;

    /* renamed from: q, reason: collision with root package name */
    public j f16537q;

    /* renamed from: r, reason: collision with root package name */
    public j f16538r;

    /* renamed from: s, reason: collision with root package name */
    public long f16539s;

    /* renamed from: t, reason: collision with root package name */
    public j f16540t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16541u;

    /* renamed from: v, reason: collision with root package name */
    public v2.h f16542v;

    /* renamed from: w, reason: collision with root package name */
    public v2.h f16543w;

    /* renamed from: x, reason: collision with root package name */
    public h1.i f16544x;

    /* renamed from: y, reason: collision with root package name */
    public final List<ne.x<Void>> f16545y;

    /* renamed from: z, reason: collision with root package name */
    public Integer f16546z;

    public class a implements r0.c<m1.l> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z1 f16547a;

        public a(z1 z1Var) {
            this.f16547a = z1Var;
        }

        @Override // r0.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(m1.l lVar) {
            m1.l lVar2;
            g0.r1.a("Recorder", "VideoEncoder can be released: " + lVar);
            if (lVar == null) {
                return;
            }
            ScheduledFuture<?> scheduledFuture = r0.this.f16516f0;
            if (scheduledFuture != null && scheduledFuture.cancel(false) && (lVar2 = r0.this.I) != null && lVar2 == lVar) {
                r0.T(lVar2);
            }
            r0 r0Var = r0.this;
            r0Var.f16524j0 = this.f16547a;
            r0Var.o0(null);
            r0 r0Var2 = r0.this;
            r0Var2.g0(4, null, r0Var2.Q());
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            g0.r1.a("Recorder", "Error in ReadyToReleaseFuture: " + th2);
        }
    }

    public class b implements r0.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i1.n f16548a;

        public b(i1.n nVar) {
            this.f16548a = nVar;
        }

        @Override // r0.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            g0.r1.a("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.f16548a.hashCode())));
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            g0.r1.a("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.f16548a.hashCode())));
        }
    }

    public class c implements m1.m {
        public final /* synthetic */ c.a b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f16549c;

        public c(c.a aVar, j jVar) {
            this.b = aVar;
            this.f16549c = jVar;
        }

        @Override // m1.m
        public void a() {
            this.b.c(null);
        }

        @Override // m1.m
        public void b(m1.i iVar) {
            boolean z10;
            r0 r0Var = r0.this;
            if (r0Var.F != null) {
                try {
                    r0Var.G0(iVar, this.f16549c);
                    if (iVar != null) {
                        iVar.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (iVar != null) {
                        try {
                            iVar.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            if (r0Var.f16541u) {
                g0.r1.a("Recorder", "Drop video data since recording is stopping.");
                iVar.close();
                return;
            }
            m1.i iVar2 = r0Var.f16507a0;
            if (iVar2 != null) {
                iVar2.close();
                r0.this.f16507a0 = null;
                z10 = true;
            } else {
                z10 = false;
            }
            if (!iVar.t0()) {
                if (z10) {
                    g0.r1.a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                }
                g0.r1.a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                r0.this.I.g();
                iVar.close();
                return;
            }
            r0 r0Var2 = r0.this;
            r0Var2.f16507a0 = iVar;
            if (!r0Var2.O() || !r0.this.f16508b0.isEmpty()) {
                g0.r1.a("Recorder", "Received video keyframe. Starting muxer...");
                r0.this.r0(this.f16549c);
            } else if (z10) {
                g0.r1.a("Recorder", "Replaced cached video keyframe with newer keyframe.");
            } else {
                g0.r1.a("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
            }
        }

        @Override // m1.m
        public void c(m1.h hVar) {
            this.b.f(hVar);
        }

        @Override // m1.m
        public void e() {
        }

        @Override // m1.m
        public void f(m1.l1 l1Var) {
            r0.this.J = l1Var;
        }
    }

    public class d implements n.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x2.a f16551a;

        public d(x2.a aVar) {
            this.f16551a = aVar;
        }

        @Override // i1.n.c
        public void a(boolean z10) {
            r0 r0Var = r0.this;
            if (r0Var.f16512d0 != z10) {
                r0Var.f16512d0 = z10;
                r0Var.D0(true);
            } else {
                g0.r1.l("Recorder", "Audio source silenced transitions to the same state " + z10);
            }
        }

        @Override // i1.n.c
        public void b(double d10) {
            r0.this.f16526k0 = d10;
        }

        @Override // i1.n.c
        public void onError(Throwable th2) {
            g0.r1.d("Recorder", "Error occurred after audio source started.", th2);
            if (th2 instanceof i1.o) {
                this.f16551a.accept(th2);
            }
        }
    }

    public class e implements m1.m {
        public final /* synthetic */ c.a b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x2.a f16552c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j f16553d;

        public e(c.a aVar, x2.a aVar2, j jVar) {
            this.b = aVar;
            this.f16552c = aVar2;
            this.f16553d = jVar;
        }

        @Override // m1.m
        public void a() {
            this.b.c(null);
        }

        @Override // m1.m
        public void b(m1.i iVar) {
            r0 r0Var = r0.this;
            if (r0Var.M == h.DISABLED) {
                iVar.close();
                throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
            }
            if (r0Var.F == null) {
                if (r0Var.f16541u) {
                    g0.r1.a("Recorder", "Drop audio data since recording is stopping.");
                } else {
                    r0Var.f16508b0.b(new m1.g(iVar));
                    if (r0.this.f16507a0 != null) {
                        g0.r1.a("Recorder", "Received audio data. Starting muxer...");
                        r0.this.r0(this.f16553d);
                    } else {
                        g0.r1.a("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
                    }
                }
                iVar.close();
                return;
            }
            try {
                r0Var.F0(iVar, this.f16553d);
                if (iVar != null) {
                    iVar.close();
                }
            } catch (Throwable th2) {
                if (iVar != null) {
                    try {
                        iVar.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        @Override // m1.m
        public void c(m1.h hVar) {
            if (r0.this.f16510c0 == null) {
                this.f16552c.accept(hVar);
            }
        }

        @Override // m1.m
        public void e() {
        }

        @Override // m1.m
        public void f(m1.l1 l1Var) {
            r0.this.L = l1Var;
        }
    }

    public class f implements r0.c<List<Void>> {
        public f() {
        }

        @Override // r0.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Void> list) {
            g0.r1.a("Recorder", "Encodings end successfully.");
            r0 r0Var = r0.this;
            r0Var.G(r0Var.Y, r0Var.Z);
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            x2.g.j(r0.this.f16540t != null, "In-progress recording shouldn't be null");
            if (r0.this.f16540t.x()) {
                return;
            }
            g0.r1.a("Recorder", "Encodings end with error: " + th2);
            r0 r0Var = r0.this;
            r0Var.G(r0Var.F == null ? 8 : 6, th2);
        }
    }

    public class g implements a3.a<Boolean> {
        public g() {
        }

        @Override // n0.a3.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            r0.this.b.k(bool);
        }

        @Override // n0.a3.a
        public void onError(Throwable th2) {
            r0.this.b.j(th2);
        }
    }

    public enum h {
        INITIALIZING,
        IDLING,
        DISABLED,
        ENABLED,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    public static final class i {

        /* renamed from: a, reason: collision with root package name */
        public final s.a f16563a;
        public int b = 0;

        /* renamed from: c, reason: collision with root package name */
        public Executor f16564c = null;

        /* renamed from: d, reason: collision with root package name */
        public m1.o f16565d;

        /* renamed from: e, reason: collision with root package name */
        public m1.o f16566e;

        /* renamed from: f, reason: collision with root package name */
        public f.a f16567f;

        /* renamed from: g, reason: collision with root package name */
        public long f16568g;

        public i() {
            m1.o oVar = r0.f16502w0;
            this.f16565d = oVar;
            this.f16566e = oVar;
            this.f16567f = r0.f16503x0;
            this.f16568g = -1L;
            this.f16563a = s.a();
        }

        public r0 c() {
            return new r0(this.f16564c, this.f16563a.a(), this.b, this.f16565d, this.f16566e, this.f16567f, this.f16568g);
        }

        public i d(final int i10) {
            this.f16563a.b(new x2.a() { // from class: f1.s0
                @Override // x2.a
                public final void accept(Object obj) {
                    ((c2.a) obj).b(i10);
                }
            });
            return this;
        }

        public i e(Executor executor) {
            x2.g.h(executor, "The specified executor can't be null.");
            this.f16564c = executor;
            return this;
        }

        public i f(final a0 a0Var) {
            x2.g.h(a0Var, "The specified quality selector can't be null.");
            this.f16563a.b(new x2.a() { // from class: f1.t0
                @Override // x2.a
                public final void accept(Object obj) {
                    ((c2.a) obj).e(a0.this);
                }
            });
            return this;
        }
    }

    public static abstract class j implements AutoCloseable {

        /* renamed from: a, reason: collision with root package name */
        public final p0.d f16569a = p0.d.b();
        public final AtomicBoolean b = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<d> f16570c = new AtomicReference<>(null);

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<c> f16571d = new AtomicReference<>(null);

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<x2.a<Uri>> f16572e = new AtomicReference<>(new x2.a() { // from class: f1.z0
            @Override // x2.a
            public final void accept(Object obj) {
                r0.j.b((Uri) obj);
            }
        });

        /* renamed from: f, reason: collision with root package name */
        public final AtomicBoolean f16573f = new AtomicBoolean(false);

        /* renamed from: g, reason: collision with root package name */
        public final y2<Boolean> f16574g = y2.l(Boolean.FALSE);

        public class a implements c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f16575a;

            public a(Context context) {
                this.f16575a = context;
            }

            @Override // f1.r0.j.c
            public i1.n a(i1.a aVar, Executor executor) {
                return new i1.n(aVar, executor, this.f16575a);
            }
        }

        public class b implements c {
            public b() {
            }

            @Override // f1.r0.j.c
            public i1.n a(i1.a aVar, Executor executor) {
                return new i1.n(aVar, executor, null);
            }
        }

        public interface c {
            i1.n a(i1.a aVar, Executor executor);
        }

        public interface d {
            MediaMuxer a(int i10, x2.a<Uri> aVar);
        }

        public static /* synthetic */ void a(String str, Uri uri) {
            if (uri == null) {
                g0.r1.c("Recorder", String.format("File scanning operation failed [path: %s]", str));
            } else {
                g0.r1.a("Recorder", String.format("File scan completed successfully [path: %s, URI: %s]", str, uri));
            }
        }

        public static /* synthetic */ void b(Uri uri) {
        }

        public static /* synthetic */ void c(t tVar, Context context, Uri uri) {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            String b10 = n1.d.b(tVar.e(), uri, "_data");
            if (b10 != null) {
                MediaScannerConnection.scanFile(context, new String[]{b10}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: f1.a1
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public final void onScanCompleted(String str, Uri uri2) {
                        r0.j.a(str, uri2);
                    }
                });
                return;
            }
            g0.r1.a("Recorder", "Skipping media scanner scan. Unable to retrieve file path from URI: " + uri);
        }

        public static /* synthetic */ void d(t tVar, Uri uri) {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_pending", (Integer) 0);
            tVar.e().update(uri, contentValues, null, null);
        }

        public static /* synthetic */ MediaMuxer f(u uVar, ParcelFileDescriptor parcelFileDescriptor, int i10, x2.a aVar) {
            MediaMuxer a10;
            Uri uri = Uri.EMPTY;
            if (uVar instanceof r) {
                File d10 = ((r) uVar).d();
                if (!n1.d.a(d10)) {
                    g0.r1.l("Recorder", "Failed to create folder for " + d10.getAbsolutePath());
                }
                a10 = new MediaMuxer(d10.getAbsolutePath(), i10);
                uri = Uri.fromFile(d10);
            } else if (uVar instanceof q) {
                a10 = j1.c.a(parcelFileDescriptor.getFileDescriptor(), i10);
            } else {
                if (!(uVar instanceof t)) {
                    throw new AssertionError("Invalid output options type: " + uVar.getClass().getSimpleName());
                }
                t tVar = (t) uVar;
                ContentValues contentValues = new ContentValues(tVar.f());
                if (Build.VERSION.SDK_INT >= 29) {
                    contentValues.put("is_pending", (Integer) 1);
                }
                try {
                    uri = tVar.e().insert(tVar.d(), contentValues);
                    if (uri == null) {
                        throw new IOException("Unable to create MediaStore entry.");
                    }
                    ParcelFileDescriptor openFileDescriptor = tVar.e().openFileDescriptor(uri, "rw");
                    a10 = j1.c.a(openFileDescriptor.getFileDescriptor(), i10);
                    openFileDescriptor.close();
                } catch (RuntimeException e10) {
                    throw new IOException("Unable to create MediaStore entry by " + e10, e10);
                }
            }
            aVar.accept(uri);
            return a10;
        }

        public static /* synthetic */ void g(ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e10) {
                g0.r1.d("Recorder", "Failed to close dup'd ParcelFileDescriptor", e10);
            }
        }

        public static j l(w wVar, long j10) {
            f1.k kVar = new f1.k(wVar.getOutputOptions(), wVar.getListenerExecutor(), wVar.b(), wVar.getIsAudioEnabled(), wVar.getIsPersistent(), j10);
            kVar.y(wVar.getIsAudioInitialMuted());
            return kVar;
        }

        public i1.n B(i1.a aVar, Executor executor) {
            if (!s()) {
                throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + this);
            }
            c andSet = this.f16571d.getAndSet(null);
            if (andSet != null) {
                return andSet.a(aVar, executor);
            }
            throw new AssertionError("One-time audio source creation has already occurred for recording " + this);
        }

        public MediaMuxer F(int i10, x2.a<Uri> aVar) {
            if (!this.b.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            d andSet = this.f16570c.getAndSet(null);
            if (andSet == null) {
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            try {
                return andSet.a(i10, aVar);
            } catch (RuntimeException e10) {
                throw new IOException("Failed to create MediaMuxer by " + e10, e10);
            }
        }

        public final void H(b2 b2Var) {
            if ((b2Var instanceof b2.d) || (b2Var instanceof b2.c)) {
                this.f16574g.k(Boolean.TRUE);
            } else if ((b2Var instanceof b2.b) || (b2Var instanceof b2.a)) {
                this.f16574g.k(Boolean.FALSE);
            }
        }

        public void I(b2 b2Var) {
            L(b2Var, true);
        }

        public void L(final b2 b2Var, boolean z10) {
            if (!Objects.equals(b2Var.c(), o())) {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + b2Var.c() + ", Expected: " + o() + "]");
            }
            if (z10) {
                String str = "Sending VideoRecordEvent " + b2Var.getClass().getSimpleName();
                if (b2Var instanceof b2.a) {
                    b2.a aVar = (b2.a) b2Var;
                    if (aVar.k()) {
                        str = str + String.format(" [error: %s]", b2.a.h(aVar.j()));
                    }
                }
                g0.r1.a("Recorder", str);
            }
            H(b2Var);
            if (m() == null || n() == null) {
                return;
            }
            try {
                m().execute(new Runnable() { // from class: f1.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        r0.j.this.n().accept(b2Var);
                    }
                });
            } catch (RejectedExecutionException e10) {
                g0.r1.d("Recorder", "The callback executor is invalid.", e10);
            }
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            h(Uri.EMPTY);
        }

        public void finalize() {
            try {
                this.f16569a.d();
                x2.a<Uri> andSet = this.f16572e.getAndSet(null);
                if (andSet != null) {
                    j(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        public void h(Uri uri) {
            if (this.b.get()) {
                j(this.f16572e.getAndSet(null), uri);
            }
        }

        public final void j(x2.a<Uri> aVar, Uri uri) {
            if (aVar != null) {
                this.f16569a.a();
                aVar.accept(uri);
            } else {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
        }

        public abstract Executor m();

        public abstract x2.a<b2> n();

        public abstract u o();

        public abstract long q();

        public s3<Boolean> r() {
            return this.f16574g;
        }

        public abstract boolean s();

        public void u(final Context context) {
            if (this.b.getAndSet(true)) {
                throw new AssertionError("Recording " + this + " has already been initialized");
            }
            final u o8 = o();
            boolean z10 = o8 instanceof q;
            x2.a<Uri> aVar = null;
            final ParcelFileDescriptor dup = z10 ? ((q) o8).d().dup() : null;
            this.f16569a.c("finalizeRecording");
            this.f16570c.set(new d() { // from class: f1.u0
                @Override // f1.r0.j.d
                public final MediaMuxer a(int i10, x2.a aVar2) {
                    return r0.j.f(u.this, dup, i10, aVar2);
                }
            });
            if (s()) {
                if (Build.VERSION.SDK_INT >= 31) {
                    this.f16571d.set(new a(context));
                } else {
                    this.f16571d.set(new b());
                }
            }
            if (o8 instanceof t) {
                final t tVar = (t) o8;
                aVar = Build.VERSION.SDK_INT >= 29 ? new x2.a() { // from class: f1.v0
                    @Override // x2.a
                    public final void accept(Object obj) {
                        r0.j.d(t.this, (Uri) obj);
                    }
                } : new x2.a() { // from class: f1.w0
                    @Override // x2.a
                    public final void accept(Object obj) {
                        r0.j.c(t.this, context, (Uri) obj);
                    }
                };
            } else if (z10) {
                aVar = new x2.a() { // from class: f1.x0
                    @Override // x2.a
                    public final void accept(Object obj) {
                        r0.j.g(dup, (Uri) obj);
                    }
                };
            }
            if (aVar != null) {
                this.f16572e.set(aVar);
            }
        }

        public boolean w() {
            return this.f16573f.get();
        }

        public abstract boolean x();

        public void y(boolean z10) {
            this.f16573f.set(z10);
        }
    }

    public class k {

        /* renamed from: a, reason: collision with root package name */
        public final v2 f16577a;
        public final a4 b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16578c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f16579d = false;

        /* renamed from: e, reason: collision with root package name */
        public int f16580e = 0;

        /* renamed from: f, reason: collision with root package name */
        public ScheduledFuture<?> f16581f = null;

        public class a implements r0.c<m1.l> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ z1 f16583a;

            public a(z1 z1Var) {
                this.f16583a = z1Var;
            }

            public static /* synthetic */ void a(a aVar) {
                if (k.this.f16579d) {
                    return;
                }
                g0.r1.a("Recorder", "Retry setupVideo #" + k.this.f16580e);
                k kVar = k.this;
                kVar.k(kVar.f16577a, k.this.b);
            }

            @Override // r0.c
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(m1.l lVar) {
                g0.r1.a("Recorder", "VideoEncoder is created. " + lVar);
                if (lVar == null) {
                    return;
                }
                x2.g.i(r0.this.f16520h0 == this.f16583a);
                x2.g.i(r0.this.I == null);
                r0.this.b0(this.f16583a);
                r0.this.U();
            }

            @Override // r0.c
            public void onFailure(Throwable th2) {
                g0.r1.m("Recorder", "VideoEncoder Setup error: " + th2, th2);
                if (k.this.f16580e >= k.this.f16578c) {
                    r0.this.V(th2);
                    return;
                }
                k.g(k.this);
                k.this.f16581f = r0.l0(new Runnable() { // from class: f1.c1
                    @Override // java.lang.Runnable
                    public final void run() {
                        r0.k.a.a(r0.k.a.this);
                    }
                }, r0.this.f16513e, r0.A0, TimeUnit.MILLISECONDS);
            }
        }

        public k(v2 v2Var, a4 a4Var, boolean z10, int i10) {
            this.f16577a = v2Var;
            this.b = a4Var;
            r0.this.f16536p0 = z10;
            this.f16578c = i10;
        }

        public static /* synthetic */ void a(k kVar, v2 v2Var, a4 a4Var) {
            kVar.getClass();
            if (v2Var.v() || (r0.this.f16520h0.n(v2Var) && !r0.this.Q())) {
                g0.r1.l("Recorder", "Ignore the SurfaceRequest " + v2Var + " isServiced: " + v2Var.v() + " VideoEncoderSession: " + r0.this.f16520h0 + " has been configured with a persistent in-progress recording.");
                return;
            }
            m1.o oVar = r0.this.f16515f;
            r0 r0Var = r0.this;
            z1 z1Var = new z1(oVar, r0Var.f16513e, r0Var.f16511d);
            r0 r0Var2 = r0.this;
            s sVar = (s) r0Var2.K(r0Var2.G);
            g0.k0 o8 = v2Var.o();
            m1.p1 g10 = l1.m.g(l1.m.d(l1.m.e(sVar, o8, r0.this.f16544x), a4Var, sVar.d(), v2Var.q(), o8, v2Var.p()), r0.this.f16536p0);
            r0.this.f16522i0 = g10;
            ne.x<m1.l> i10 = z1Var.i(v2Var, g10);
            r0.this.f16520h0 = z1Var;
            r0.n.j(i10, kVar.new a(z1Var), r0.this.f16513e);
        }

        public static /* synthetic */ int g(k kVar) {
            int i10 = kVar.f16580e;
            kVar.f16580e = i10 + 1;
            return i10;
        }

        public void j() {
            if (this.f16579d) {
                return;
            }
            this.f16579d = true;
            ScheduledFuture<?> scheduledFuture = this.f16581f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f16581f = null;
            }
        }

        public final void k(final v2 v2Var, final a4 a4Var) {
            r0.this.k0().a(new Runnable() { // from class: f1.b1
                @Override // java.lang.Runnable
                public final void run() {
                    r0.k.a(r0.k.this, v2Var, a4Var);
                }
            }, r0.this.f16513e);
        }

        public void l() {
            k(this.f16577a, this.b);
        }
    }

    public enum l {
        CONFIGURING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        a0 a0Var = c2.b;
        f16498s0 = a0Var;
        c2 a10 = c2.a().e(a0Var).b(-1).a();
        f16499t0 = a10;
        f16500u0 = s.a().e(-1).f(a10).a();
        f16501v0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        f16502w0 = new m1.o() { // from class: f1.j0
            @Override // m1.o
            public final m1.l a(Executor executor, m1.n nVar, int i10) {
                return new m1.i0(executor, nVar, i10);
            }
        };
        f16503x0 = new f.a() { // from class: f1.k0
            @Override // h1.f.a
            public final h1.f a(u uVar) {
                return new h1.g(uVar);
            }
        };
        f16504y0 = q0.c.g(q0.c.d());
        f16505z0 = 3;
        A0 = 1000L;
    }

    public r0(Executor executor, s sVar, int i10, m1.o oVar, m1.o oVar2, f.a aVar, long j10) {
        this.f16523j = k1.c.b(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.f16529m = y2.l(null);
        this.f16531n = l.CONFIGURING;
        this.f16533o = null;
        this.f16535p = 0;
        this.f16537q = null;
        this.f16538r = null;
        this.f16539s = 0L;
        this.f16540t = null;
        this.f16541u = false;
        this.f16542v = null;
        this.f16543w = null;
        this.f16544x = null;
        this.f16545y = new ArrayList();
        this.f16546z = null;
        this.A = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = h.INITIALIZING;
        this.N = Uri.EMPTY;
        this.O = 0L;
        this.P = 0L;
        this.Q = 0L;
        this.R = Long.MAX_VALUE;
        this.S = 0;
        this.T = Long.MAX_VALUE;
        this.U = Long.MAX_VALUE;
        this.V = Long.MAX_VALUE;
        this.W = 0L;
        this.X = 0L;
        this.Y = 1;
        this.Z = null;
        this.f16507a0 = null;
        this.f16508b0 = new w0.a(60);
        this.f16510c0 = null;
        this.f16512d0 = false;
        this.f16514e0 = a2.a.INACTIVE;
        this.f16516f0 = null;
        this.f16518g0 = false;
        this.f16522i0 = null;
        this.f16524j0 = null;
        this.f16526k0 = 0.0d;
        this.f16528l0 = false;
        this.f16530m0 = null;
        this.f16532n0 = null;
        this.f16534o0 = Long.MAX_VALUE;
        this.f16536p0 = false;
        this.f16509c = executor;
        executor = executor == null ? q0.c.d() : executor;
        this.f16511d = executor;
        Executor g10 = q0.c.g(executor);
        this.f16513e = g10;
        this.G = y2.l(E(sVar));
        this.f16525k = i10;
        this.f16506a = y2.l(g1.d(this.f16535p, N(this.f16531n)));
        this.b = y2.l(Boolean.FALSE);
        this.f16515f = oVar;
        this.f16517g = oVar2;
        this.f16519h = aVar;
        this.f16520h0 = new z1(oVar, g10, executor);
        j10 = j10 == -1 ? 52428800L : j10;
        this.f16527l = j10;
        g0.r1.a("Recorder", "mRequiredFreeStorageBytes = " + n1.e.a(j10));
    }

    public static h1 L(int i10, g0.t tVar, int i11) {
        return new d1(i11, (n0.o0) tVar, i10, m1.t1.f24212d);
    }

    public static boolean R(e1 e1Var, j jVar) {
        return jVar != null && e1Var.d() == jVar.q();
    }

    public static void T(m1.l lVar) {
        if (lVar instanceof m1.i0) {
            ((m1.i0) lVar).c0();
        }
    }

    public static /* synthetic */ void i(m1.l lVar) {
        g0.r1.a("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
        if (k1.c.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
            T(lVar);
        }
    }

    public static /* synthetic */ void j(r0 r0Var, c.a aVar, Throwable th2) {
        if (r0Var.f16510c0 == null) {
            if (th2 instanceof m1.h) {
                r0Var.m0(h.ERROR_ENCODER);
            } else {
                r0Var.m0(h.ERROR_SOURCE);
            }
            r0Var.f16510c0 = th2;
            r0Var.D0(true);
            aVar.c(null);
        }
    }

    public static /* synthetic */ void l(r0 r0Var) {
        v2 v2Var = r0Var.B;
        if (v2Var == null) {
            throw new AssertionError("surface request is required to retry initialization.");
        }
        r0Var.F(v2Var, r0Var.C, false);
    }

    public static ScheduledFuture<?> l0(final Runnable runnable, final Executor executor, long j10, TimeUnit timeUnit) {
        return q0.c.e().schedule(new Runnable() { // from class: f1.f0
            @Override // java.lang.Runnable
            public final void run() {
                executor.execute(runnable);
            }
        }, j10, timeUnit);
    }

    public static /* synthetic */ Object p(r0 r0Var, j jVar, c.a aVar) {
        r0Var.I.c(r0Var.new c(aVar, jVar), r0Var.f16513e);
        return "videoEncodingFuture";
    }

    public static /* synthetic */ Object q(final r0 r0Var, j jVar, final c.a aVar) {
        r0Var.getClass();
        x2.a aVar2 = new x2.a() { // from class: f1.g0
            @Override // x2.a
            public final void accept(Object obj) {
                r0.j(r0.this, aVar, (Throwable) obj);
            }
        };
        r0Var.H.A(r0Var.f16513e, r0Var.new d(aVar2));
        r0Var.K.c(r0Var.new e(aVar, aVar2, jVar), r0Var.f16513e);
        return "audioEncodingFuture";
    }

    public static int z0(h1.i iVar, int i10) {
        if (iVar != null) {
            int e10 = iVar.e();
            if (e10 == 1) {
                return 2;
            }
            if (e10 == 2) {
                return 0;
            }
            if (e10 == 9) {
                return 1;
            }
        }
        return i10;
    }

    public final void A0() {
        z1 z1Var = this.f16524j0;
        if (z1Var == null) {
            k0();
            return;
        }
        x2.g.i(z1Var.m() == this.I);
        g0.r1.a("Recorder", "Releasing video encoder: " + this.I);
        this.f16524j0.r();
        this.f16524j0 = null;
        this.I = null;
        this.J = null;
        o0(null);
    }

    public void B0() {
        boolean z10;
        j jVar;
        int i10;
        j jVar2;
        Throwable th2;
        synchronized (this.f16521i) {
            try {
                g0.r1.a("Recorder", "tryServicePendingRecording on state: " + this.f16531n);
                int ordinal = this.f16531n.ordinal();
                boolean z11 = true;
                z10 = false;
                jVar = null;
                if (ordinal == 1) {
                    z11 = false;
                } else if (ordinal != 2) {
                    i10 = 0;
                    jVar2 = null;
                    th2 = jVar2;
                }
                if (this.f16514e0 == a2.a.INACTIVE) {
                    jVar2 = this.f16538r;
                    this.f16538r = null;
                    j0();
                    i10 = 4;
                    z10 = z11;
                    th2 = f16501v0;
                } else {
                    if (this.f16537q == null && !this.f16518g0) {
                        if (this.I != null) {
                            i10 = 0;
                            z10 = z11;
                            th2 = null;
                            jVar = S(this.f16531n);
                            jVar2 = null;
                        }
                        i10 = 0;
                        jVar2 = null;
                        z10 = z11;
                        th2 = jVar2;
                    }
                    g0.r1.l("Recorder", "PendingRecording is not handled, active recording = " + this.f16537q + ", need reset flag = " + this.f16518g0);
                    i10 = 0;
                    jVar2 = null;
                    z10 = z11;
                    th2 = jVar2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (jVar != null) {
            w0(jVar, z10);
        } else if (jVar2 != null) {
            H(jVar2, i10, th2);
        }
    }

    public final void C0(final j jVar, boolean z10) {
        if (!this.f16545y.isEmpty()) {
            ne.x k10 = r0.n.k(this.f16545y);
            if (!k10.isDone()) {
                k10.cancel(true);
            }
            this.f16545y.clear();
        }
        this.f16545y.add(y1.c.a(new c.InterfaceC0669c() { // from class: f1.d0
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return r0.p(r0.this, jVar, aVar);
            }
        }));
        if (O() && !z10) {
            this.f16545y.add(y1.c.a(new c.InterfaceC0669c() { // from class: f1.e0
                @Override // y1.c.InterfaceC0669c
                public final Object a(c.a aVar) {
                    return r0.q(r0.this, jVar, aVar);
                }
            }));
        }
        r0.n.j(r0.n.k(this.f16545y), new f(), q0.c.b());
    }

    public final void D() {
        while (!this.f16508b0.isEmpty()) {
            this.f16508b0.a();
        }
    }

    public void D0(boolean z10) {
        j jVar = this.f16540t;
        if (jVar != null) {
            jVar.L(b2.g(jVar.o(), J()), z10);
        }
    }

    public final s E(s sVar) {
        s.a i10 = sVar.i();
        if (sVar.d().b() == -1) {
            i10.b(new x2.a() { // from class: f1.i0
                @Override // x2.a
                public final void accept(Object obj) {
                    ((c2.a) obj).b(r0.f16499t0.b());
                }
            });
        }
        return i10.a();
    }

    public final void E0(l lVar) {
        if (!f16496q0.contains(this.f16531n)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f16531n);
        }
        if (!f16497r0.contains(lVar)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + lVar);
        }
        if (this.f16533o != lVar) {
            this.f16533o = lVar;
            this.f16506a.k(g1.e(this.f16535p, N(lVar), this.f16542v));
        }
    }

    public final void F(v2 v2Var, a4 a4Var, boolean z10) {
        if (v2Var.v()) {
            g0.r1.l("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        v2Var.x(this.f16513e, new v2.i() { // from class: f1.o0
            @Override // g0.v2.i
            public final void a(v2.h hVar) {
                r0.this.f16543w = hVar;
            }
        });
        Size q10 = v2Var.q();
        g0.k0 o8 = v2Var.o();
        h1 f10 = f(v2Var.m().d(), v2Var.r());
        x a10 = f10.a(q10, o8);
        g0.r1.a("Recorder", "Using supported quality of " + a10 + " for surface size " + q10);
        if (a10 != x.f16617g) {
            h1.i d10 = f10.d(a10, o8);
            this.f16544x = d10;
            if (d10 == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        g0.r1.a("Recorder", "mResolvedEncoderProfiles = " + this.f16544x);
        k kVar = this.f16530m0;
        if (kVar != null) {
            kVar.j();
        }
        k kVar2 = new k(v2Var, a4Var, this.f16536p0, z10 ? f16505z0 : 0);
        this.f16530m0 = kVar2;
        kVar2.l();
    }

    public void F0(m1.i iVar, j jVar) {
        long size = this.O + iVar.size();
        long j10 = this.W;
        if (j10 != 0 && size > j10) {
            g0.r1.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.W)));
            W(jVar, 2, null);
            return;
        }
        long d12 = iVar.d1();
        long j11 = this.T;
        if (j11 == Long.MAX_VALUE) {
            this.T = d12;
            g0.r1.a("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(d12), h1.d.f(this.T)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(d12 - Math.min(this.R, j11));
            x2.g.j(this.V != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = nanos + timeUnit.toNanos(d12 - this.V);
            long j12 = this.X;
            if (j12 != 0 && nanos2 > j12) {
                g0.r1.a("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.X)));
                W(jVar, 9, null);
                return;
            }
        }
        try {
            this.F.writeSampleData(this.f16546z.intValue(), iVar.t(), iVar.k0());
            this.O = size;
            this.P += iVar.size();
            this.V = d12;
        } catch (IllegalStateException e10) {
            W(jVar, ((h1.f) x2.g.g(this.f16532n0)).a() < this.f16527l ? 3 : 1, e10);
        }
    }

    public void G(int i10, Throwable th2) {
        if (this.f16540t == null) {
            throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
        }
        MediaMuxer mediaMuxer = this.F;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.F.release();
            } catch (IllegalStateException e10) {
                g0.r1.d("Recorder", "MediaMuxer failed to stop or release with error: " + e10.getMessage(), e10);
                if (i10 == 0) {
                    i10 = ((h1.f) x2.g.g(this.f16532n0)).a() < this.f16527l ? 3 : this.P == 0 ? 8 : 1;
                }
            }
            this.F = null;
        } else if (i10 == 0) {
            i10 = 8;
        }
        this.f16540t.h(this.N);
        u o8 = this.f16540t.o();
        f1 J = J();
        v b10 = v.b(this.N);
        this.f16540t.I(i10 == 0 ? b2.a(o8, J, b10) : b2.b(o8, J, b10, i10, th2));
        j jVar = this.f16540t;
        this.f16540t = null;
        this.f16541u = false;
        this.f16546z = null;
        this.A = null;
        this.f16545y.clear();
        this.N = Uri.EMPTY;
        this.O = 0L;
        this.P = 0L;
        this.Q = 0L;
        this.R = Long.MAX_VALUE;
        this.T = Long.MAX_VALUE;
        this.U = Long.MAX_VALUE;
        this.V = Long.MAX_VALUE;
        this.Y = 1;
        this.Z = null;
        this.f16510c0 = null;
        this.f16526k0 = 0.0d;
        this.f16532n0 = null;
        this.f16534o0 = Long.MAX_VALUE;
        D();
        n0(null);
        int ordinal = this.M.ordinal();
        if (ordinal == 2 || ordinal == 3) {
            m0(h.IDLING);
            this.H.F();
        } else if (ordinal == 4 || ordinal == 5) {
            m0(h.INITIALIZING);
        }
        X(jVar);
    }

    public void G0(m1.i iVar, j jVar) {
        if (this.A == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = this.O + iVar.size();
        long j10 = this.W;
        long j11 = 0;
        if (j10 != 0 && size > j10) {
            g0.r1.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.W)));
            W(jVar, 2, null);
            return;
        }
        long d12 = iVar.d1();
        long j12 = this.R;
        if (j12 == Long.MAX_VALUE) {
            this.R = d12;
            g0.r1.a("Recorder", String.format("First video time: %d (%s)", Long.valueOf(d12), h1.d.f(this.R)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            j11 = timeUnit.toNanos(d12 - Math.min(j12, this.T));
            x2.g.j(this.U != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos = timeUnit.toNanos(d12 - this.U) + j11;
            long j13 = this.X;
            if (j13 != 0 && nanos > j13) {
                g0.r1.a("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos), Long.valueOf(this.X)));
                W(jVar, 9, null);
                return;
            }
        }
        try {
            this.F.writeSampleData(this.A.intValue(), iVar.t(), iVar.k0());
            this.O = size;
            this.Q = j11;
            this.U = d12;
            D0(iVar.t0());
            if (size > this.f16534o0) {
                long a10 = ((h1.f) x2.g.g(this.f16532n0)).a();
                g0.r1.a("Recorder", "availableBytes = " + n1.e.a(a10));
                long j14 = this.f16527l;
                if (a10 < j14) {
                    W(jVar, 3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(a10), Long.valueOf(this.f16527l))));
                } else {
                    this.f16534o0 = a10 - j14;
                }
            }
        } catch (IllegalStateException e10) {
            W(jVar, ((h1.f) x2.g.g(this.f16532n0)).a() < this.f16527l ? 3 : 1, e10);
        }
    }

    public final void H(j jVar, int i10, Throwable th2) {
        Uri uri = Uri.EMPTY;
        jVar.h(uri);
        jVar.I(b2.b(jVar.o(), f1.d(0L, 0L, f1.b.e(1, this.f16510c0, 0.0d, 0L)), v.b(uri), i10, th2));
    }

    public final List<m1.i> I(long j10) {
        ArrayList arrayList = new ArrayList();
        while (!this.f16508b0.isEmpty()) {
            m1.i a10 = this.f16508b0.a();
            if (a10.d1() >= j10) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    public f1 J() {
        return f1.d(this.Q, this.O, f1.b.e(M(this.M), this.f16510c0, this.f16526k0, this.P));
    }

    public <T> T K(s3<T> s3Var) {
        try {
            return s3Var.b().get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public final int M(h hVar) {
        int ordinal = hVar.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return 1;
        }
        if (ordinal == 3) {
            j jVar = this.f16540t;
            if (jVar == null || !jVar.w()) {
                return this.f16512d0 ? 2 : 0;
            }
            return 5;
        }
        if (ordinal == 4) {
            return 3;
        }
        if (ordinal == 5) {
            return 4;
        }
        throw new AssertionError("Invalid internal audio state: " + hVar);
    }

    public final g1.a N(l lVar) {
        return (lVar == l.RECORDING || (lVar == l.STOPPING && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) k1.c.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? g1.a.ACTIVE : g1.a.INACTIVE;
    }

    public boolean O() {
        return this.M == h.ENABLED;
    }

    public boolean P() {
        return ((s) K(this.G)).b().c() != 0;
    }

    public boolean Q() {
        j jVar = this.f16540t;
        return jVar != null && jVar.x();
    }

    public final j S(l lVar) {
        boolean z10;
        if (lVar == l.PENDING_PAUSED) {
            z10 = true;
        } else {
            if (lVar != l.PENDING_RECORDING) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z10 = false;
        }
        if (this.f16537q != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        j jVar = this.f16538r;
        if (jVar == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.f16537q = jVar;
        jVar.r().c(q0.c.b(), new g());
        this.f16538r = null;
        if (z10) {
            p0(l.PAUSED);
            return jVar;
        }
        p0(l.RECORDING);
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0061 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0003, B:5:0x000c, B:9:0x0089, B:26:0x0011, B:27:0x001d, B:30:0x0023, B:31:0x002a, B:33:0x002e, B:35:0x003c, B:36:0x0054, B:38:0x0058, B:41:0x0061, B:43:0x0067, B:44:0x0073, B:46:0x007f), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.r0.U():void");
    }

    public void V(Throwable th2) {
        j jVar;
        synchronized (this.f16521i) {
            try {
                jVar = null;
                switch (this.f16531n) {
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        j jVar2 = this.f16538r;
                        this.f16538r = null;
                        jVar = jVar2;
                    case CONFIGURING:
                        q0(-1);
                        p0(l.ERROR);
                        break;
                    case IDLING:
                    case RECORDING:
                    case PAUSED:
                    case STOPPING:
                    case RESETTING:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.f16531n + ": " + th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (jVar != null) {
            H(jVar, 7, th2);
        }
    }

    public void W(j jVar, int i10, Throwable th2) {
        Throwable th3;
        if (jVar != this.f16540t) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.f16521i) {
            try {
                try {
                    boolean z10 = false;
                    switch (this.f16531n) {
                        case CONFIGURING:
                        case IDLING:
                        case ERROR:
                            throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f16531n);
                        case RECORDING:
                        case PAUSED:
                            try {
                                p0(l.STOPPING);
                                z10 = true;
                            } catch (Throwable th4) {
                                th3 = th4;
                                throw th3;
                            }
                        case PENDING_RECORDING:
                        case PENDING_PAUSED:
                        case STOPPING:
                        case RESETTING:
                            if (jVar != this.f16537q) {
                                throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                            }
                        default:
                            if (z10) {
                                y0(jVar, -1L, i10, th2);
                                return;
                            }
                            return;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th3 = th;
                    throw th3;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0074 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:11:0x00b4, B:32:0x0025, B:34:0x0029, B:36:0x002f, B:39:0x003a, B:42:0x0045, B:43:0x0052, B:44:0x006a, B:46:0x006e, B:48:0x0074, B:49:0x0084, B:51:0x0088, B:53:0x008e, B:56:0x0096, B:58:0x009f, B:60:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:11:0x00b4, B:32:0x0025, B:34:0x0029, B:36:0x002f, B:39:0x003a, B:42:0x0045, B:43:0x0052, B:44:0x006a, B:46:0x006e, B:48:0x0074, B:49:0x0084, B:51:0x0088, B:53:0x008e, B:56:0x0096, B:58:0x009f, B:60:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X(f1.r0.j r9) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.r0.X(f1.r0$j):void");
    }

    public final void Y() {
        boolean z10;
        v2 v2Var;
        synchronized (this.f16521i) {
            try {
                switch (this.f16531n.ordinal()) {
                    case 1:
                    case 2:
                        E0(l.CONFIGURING);
                        z10 = true;
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (Q()) {
                            z10 = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        p0(l.CONFIGURING);
                        z10 = true;
                        break;
                    default:
                        z10 = true;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f16518g0 = false;
        if (!z10 || (v2Var = this.B) == null || v2Var.v()) {
            return;
        }
        F(this.B, this.C, false);
    }

    public void Z(a2.a aVar) {
        ScheduledFuture<?> scheduledFuture;
        m1.l lVar;
        a2.a aVar2 = this.f16514e0;
        this.f16514e0 = aVar;
        if (aVar2 == aVar) {
            g0.r1.a("Recorder", "Video source transitions to the same state: " + aVar);
            return;
        }
        g0.r1.a("Recorder", "Video source has transitioned to state: " + aVar);
        if (aVar != a2.a.INACTIVE) {
            if (aVar != a2.a.ACTIVE_NON_STREAMING || (scheduledFuture = this.f16516f0) == null || !scheduledFuture.cancel(false) || (lVar = this.I) == null) {
                return;
            }
            T(lVar);
            return;
        }
        if (this.E == null) {
            k kVar = this.f16530m0;
            if (kVar != null) {
                kVar.j();
                this.f16530m0 = null;
            }
            g0(4, null, false);
            return;
        }
        this.f16518g0 = true;
        j jVar = this.f16540t;
        if (jVar == null || jVar.x()) {
            return;
        }
        W(this.f16540t, 4, null);
    }

    @Override // f1.a2
    public void a(v2 v2Var) {
        b(v2Var, a4.UPTIME, false);
    }

    public final void a0(v2 v2Var, a4 a4Var, boolean z10) {
        v2 v2Var2 = this.B;
        if (v2Var2 != null && !v2Var2.v()) {
            this.B.z();
        }
        this.f16536p0 = z10;
        this.B = v2Var;
        this.C = a4Var;
        F(v2Var, a4Var, true);
    }

    @Override // f1.a2
    public void b(final v2 v2Var, final a4 a4Var, final boolean z10) {
        synchronized (this.f16521i) {
            try {
                g0.r1.a("Recorder", "Surface is requested in state: " + this.f16531n + ", Current surface: " + this.f16535p);
                if (this.f16531n == l.ERROR) {
                    p0(l.CONFIGURING);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f16513e.execute(new Runnable() { // from class: f1.p0
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.a0(v2Var, a4Var, z10);
            }
        });
    }

    public void b0(z1 z1Var) {
        m1.l lVar = (m1.l) x2.g.g(z1Var.m());
        this.I = lVar;
        this.f16529m.k(((m1.r1) lVar.e()).g());
        this.S = this.I.h();
        Surface k10 = z1Var.k();
        this.E = k10;
        o0(k10);
        z1Var.p(this.f16513e, new l.c.a() { // from class: f1.h0
            @Override // m1.l.c.a
            public final void a(Surface surface) {
                r0.this.o0(surface);
            }
        });
        r0.n.j(z1Var.l(), new a(z1Var), this.f16513e);
    }

    @Override // f1.a2
    public a3<s> c() {
        return this.G;
    }

    public final void c0(j jVar) {
        if (this.f16540t != jVar || this.f16541u) {
            return;
        }
        if (O()) {
            this.K.pause();
        }
        this.I.pause();
        j jVar2 = this.f16540t;
        jVar2.I(b2.d(jVar2.o(), J()));
    }

    @Override // f1.a2
    public void d(final a2.a aVar) {
        this.f16513e.execute(new Runnable() { // from class: f1.n0
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.Z(aVar);
            }
        });
    }

    public w d0(Context context, r rVar) {
        return e0(context, rVar);
    }

    @Override // f1.a2
    public a3<g1> e() {
        return this.f16506a;
    }

    public final w e0(Context context, u uVar) {
        x2.g.h(uVar, "The OutputOptions cannot be null.");
        return new w(context, this, uVar);
    }

    @Override // f1.a2
    public h1 f(g0.t tVar, int i10) {
        return L(i10 == 1 ? 2 : 1, tVar, this.f16525k);
    }

    public final void f0() {
        i1.n nVar = this.H;
        if (nVar == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.H = null;
        g0.r1.a("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(nVar.hashCode())));
        r0.n.j(nVar.w(), new b(nVar), q0.c.b());
    }

    @Override // f1.a2
    public a3<Boolean> g() {
        return this.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void g0(int i10, Throwable th2, boolean z10) {
        boolean z11;
        boolean z12;
        synchronized (this.f16521i) {
            try {
                z11 = true;
                z12 = false;
                switch (this.f16531n) {
                    case CONFIGURING:
                    case IDLING:
                    case ERROR:
                        break;
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        E0(l.RESETTING);
                        break;
                    case RECORDING:
                    case PAUSED:
                        x2.g.j(this.f16540t != null, "In-progress recording shouldn't be null when in state " + this.f16531n);
                        if (this.f16537q != this.f16540t) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!Q()) {
                            p0(l.RESETTING);
                            z12 = true;
                            z11 = false;
                        }
                        break;
                    case STOPPING:
                        p0(l.RESETTING);
                        z11 = false;
                        break;
                    case RESETTING:
                    default:
                        z11 = false;
                        break;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (!z11) {
            if (z12) {
                y0(this.f16540t, -1L, i10, th2);
            }
        } else if (z10) {
            i0();
        } else {
            h0();
        }
    }

    public final void h0() {
        if (this.K != null) {
            g0.r1.a("Recorder", "Releasing audio encoder.");
            this.K.a();
            this.K = null;
            this.L = null;
        }
        if (this.H != null) {
            f0();
        }
        m0(h.INITIALIZING);
        i0();
    }

    public final void i0() {
        if (this.I != null) {
            g0.r1.a("Recorder", "Releasing video encoder.");
            A0();
        }
        Y();
    }

    public final void j0() {
        if (f16496q0.contains(this.f16531n)) {
            p0(this.f16533o);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.f16531n);
    }

    public final ne.x<Void> k0() {
        g0.r1.a("Recorder", "Try to safely release video encoder: " + this.I);
        return this.f16520h0.q();
    }

    public void m0(h hVar) {
        g0.r1.a("Recorder", "Transitioning audio state: " + this.M + " --> " + hVar);
        this.M = hVar;
    }

    public void n0(v2.h hVar) {
        g0.r1.a("Recorder", "Update stream transformation info: " + hVar);
        this.f16542v = hVar;
        synchronized (this.f16521i) {
            this.f16506a.k(g1.e(this.f16535p, N(this.f16531n), hVar));
        }
    }

    public void o0(Surface surface) {
        int hashCode;
        if (this.D == surface) {
            return;
        }
        this.D = surface;
        synchronized (this.f16521i) {
            if (surface != null) {
                try {
                    hashCode = surface.hashCode();
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                hashCode = 0;
            }
            q0(hashCode);
        }
    }

    public void p0(l lVar) {
        if (this.f16531n == lVar) {
            throw new AssertionError("Attempted to transition to state " + lVar + ", but Recorder is already in state " + lVar);
        }
        g0.r1.a("Recorder", "Transitioning Recorder internal state: " + this.f16531n + " --> " + lVar);
        Set<l> set = f16496q0;
        g1.a aVar = null;
        if (set.contains(lVar)) {
            if (!set.contains(this.f16531n)) {
                if (!f16497r0.contains(this.f16531n)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f16531n);
                }
                l lVar2 = this.f16531n;
                this.f16533o = lVar2;
                aVar = N(lVar2);
            }
        } else if (this.f16533o != null) {
            this.f16533o = null;
        }
        this.f16531n = lVar;
        if (aVar == null) {
            aVar = N(lVar);
        }
        this.f16506a.k(g1.e(this.f16535p, aVar, this.f16542v));
    }

    public final void q0(int i10) {
        if (this.f16535p == i10) {
            return;
        }
        g0.r1.a("Recorder", "Transitioning streamId: " + this.f16535p + " --> " + i10);
        this.f16535p = i10;
        this.f16506a.k(g1.e(i10, N(this.f16531n), this.f16542v));
    }

    public void r0(j jVar) {
        if (this.F != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        if (O() && this.f16508b0.isEmpty()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        m1.i iVar = this.f16507a0;
        if (iVar == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.f16507a0 = null;
            List<m1.i> I = I(iVar.d1());
            long size = iVar.size();
            Iterator<m1.i> it = I.iterator();
            while (it.hasNext()) {
                size += it.next().size();
            }
            long j10 = this.W;
            if (j10 != 0 && size > j10) {
                g0.r1.a("Recorder", String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.W)));
                W(jVar, 2, null);
                iVar.close();
                return;
            }
            int i10 = 3;
            try {
                s sVar = (s) K(this.G);
                MediaMuxer F = jVar.F(sVar.c() == -1 ? z0(this.f16544x, s.g(f16500u0.c())) : s.g(sVar.c()), new x2.a() { // from class: f1.b0
                    @Override // x2.a
                    public final void accept(Object obj) {
                        r0.this.N = (Uri) obj;
                    }
                });
                v2.h hVar = this.f16543w;
                if (hVar != null) {
                    n0(hVar);
                    F.setOrientationHint(hVar.b());
                }
                Location c10 = jVar.o().c();
                if (c10 != null) {
                    try {
                        Pair<Double, Double> a10 = o1.a.a(c10.getLatitude(), c10.getLongitude());
                        F.setLocation((float) ((Double) a10.first).doubleValue(), (float) ((Double) a10.second).doubleValue());
                    } catch (IllegalArgumentException e10) {
                        F.release();
                        W(jVar, 5, e10);
                        iVar.close();
                        return;
                    }
                }
                this.A = Integer.valueOf(F.addTrack(this.J.a()));
                if (O()) {
                    this.f16546z = Integer.valueOf(F.addTrack(this.L.a()));
                }
                try {
                    F.start();
                    this.F = F;
                    G0(iVar, jVar);
                    Iterator<m1.i> it2 = I.iterator();
                    while (it2.hasNext()) {
                        F0(it2.next(), jVar);
                    }
                    iVar.close();
                } catch (IllegalStateException e11) {
                    if (((h1.f) x2.g.g(this.f16532n0)).a() >= this.f16527l) {
                        i10 = 1;
                    }
                    W(jVar, i10, e11);
                    iVar.close();
                }
            } catch (IOException e12) {
                if (!n1.e.e(e12)) {
                    i10 = 5;
                }
                W(jVar, i10, e12);
                iVar.close();
            }
        } catch (Throwable th2) {
            if (iVar != null) {
                try {
                    iVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public final void s0(j jVar) {
        s sVar = (s) K(this.G);
        l1.e c10 = l1.b.c(sVar, this.f16544x);
        a4 a4Var = a4.UPTIME;
        m1.p1 p1Var = (m1.p1) x2.g.g(this.f16522i0);
        i1.a d10 = l1.b.d(c10, sVar.b(), p1Var.f() != p1Var.i() ? new Rational(p1Var.f(), p1Var.i()) : null);
        if (this.H != null) {
            f0();
        }
        i1.n t02 = t0(jVar, d10);
        this.H = t02;
        g0.r1.a("Recorder", String.format("Set up new audio source: 0x%x", Integer.valueOf(t02.hashCode())));
        m1.l a10 = this.f16517g.a(this.f16511d, l1.b.b(c10, a4Var, d10, sVar.b()), ((v2) x2.g.g(this.B)).r());
        this.K = a10;
        l.b b10 = a10.b();
        if (!(b10 instanceof l.a)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        this.H.B((l.a) b10);
    }

    public final i1.n t0(j jVar, i1.a aVar) {
        return jVar.B(aVar, f16504y0);
    }

    public e1 u0(w wVar) {
        long j10;
        j jVar;
        int i10;
        j jVar2;
        x2.g.h(wVar, "The given PendingRecording cannot be null.");
        synchronized (this.f16521i) {
            try {
                j10 = this.f16539s + 1;
                this.f16539s = j10;
                jVar = null;
                i10 = 0;
                switch (this.f16531n) {
                    case CONFIGURING:
                    case IDLING:
                    case STOPPING:
                    case RESETTING:
                    case ERROR:
                        l lVar = this.f16531n;
                        l lVar2 = l.IDLING;
                        if (lVar == lVar2) {
                            x2.g.j(this.f16537q == null && this.f16538r == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                        }
                        try {
                            j l10 = j.l(wVar, j10);
                            l10.u(wVar.getApplicationContext());
                            this.f16538r = l10;
                            l lVar3 = this.f16531n;
                            if (lVar3 == lVar2) {
                                p0(l.PENDING_RECORDING);
                                this.f16513e.execute(new Runnable() { // from class: f1.l0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        r0.this.B0();
                                    }
                                });
                            } else if (lVar3 == l.ERROR) {
                                p0(l.PENDING_RECORDING);
                                this.f16513e.execute(new Runnable() { // from class: f1.m0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        r0.l(r0.this);
                                    }
                                });
                            } else {
                                p0(l.PENDING_RECORDING);
                            }
                            e = null;
                            break;
                        } catch (IOException e10) {
                            e = e10;
                            i10 = 5;
                            break;
                        }
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        jVar2 = (j) x2.g.g(this.f16538r);
                        jVar = jVar2;
                        e = null;
                        break;
                    case RECORDING:
                    case PAUSED:
                        jVar2 = this.f16537q;
                        jVar = jVar2;
                        e = null;
                        break;
                    default:
                        e = null;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (jVar != null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (i10 == 0) {
            return e1.b(wVar, j10);
        }
        g0.r1.c("Recorder", "Recording was started when the Recorder had encountered error " + e);
        H(j.l(wVar, j10), i10, e);
        return e1.a(wVar, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v0(f1.r0.j r10) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.r0.v0(f1.r0$j):void");
    }

    public final void w0(j jVar, boolean z10) {
        v0(jVar);
        if (z10) {
            c0(jVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x0(f1.e1 r13, int r14, java.lang.Throwable r15) {
        /*
            r12 = this;
            java.lang.Object r1 = r12.f16521i
            monitor-enter(r1)
            f1.r0$j r0 = r12.f16538r     // Catch: java.lang.Throwable -> L6e
            boolean r0 = R(r13, r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L34
            f1.r0$j r0 = r12.f16537q     // Catch: java.lang.Throwable -> L2f
            boolean r0 = R(r13, r0)     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L34
            java.lang.String r14 = "Recorder"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r15.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "stop() called on a recording that is no longer active: "
            r15.append(r0)     // Catch: java.lang.Throwable -> L2f
            f1.u r13 = r13.c()     // Catch: java.lang.Throwable -> L2f
            r15.append(r13)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r13 = r15.toString()     // Catch: java.lang.Throwable -> L2f
            g0.r1.a(r14, r13)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r0 = move-exception
            r13 = r0
            r6 = r12
            goto La9
        L34:
            f1.r0$l r0 = r12.f16531n     // Catch: java.lang.Throwable -> L6e
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L6e
            r2 = 0
            switch(r0) {
                case 0: goto La0;
                case 1: goto L71;
                case 2: goto L71;
                case 3: goto La0;
                case 4: goto L4c;
                case 5: goto L4c;
                case 6: goto L42;
                case 7: goto L42;
                default: goto L3e;
            }
        L3e:
            r6 = r12
            r10 = r14
            r11 = r15
            goto L85
        L42:
            f1.r0$j r0 = r12.f16537q     // Catch: java.lang.Throwable -> L2f
            boolean r13 = R(r13, r0)     // Catch: java.lang.Throwable -> L2f
            x2.g.i(r13)     // Catch: java.lang.Throwable -> L2f
            goto L3e
        L4c:
            f1.r0$l r13 = f1.r0.l.STOPPING     // Catch: java.lang.Throwable -> L6e
            r12.p0(r13)     // Catch: java.lang.Throwable -> L6e
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L6e
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L6e
            long r8 = r13.toMicros(r3)     // Catch: java.lang.Throwable -> L6e
            f1.r0$j r7 = r12.f16537q     // Catch: java.lang.Throwable -> L6e
            java.util.concurrent.Executor r13 = r12.f16513e     // Catch: java.lang.Throwable -> L6e
            f1.c0 r5 = new f1.c0     // Catch: java.lang.Throwable -> L6e
            r6 = r12
            r10 = r14
            r11 = r15
            r5.<init>()     // Catch: java.lang.Throwable -> L6b
            r13.execute(r5)     // Catch: java.lang.Throwable -> L6b
            goto L85
        L6b:
            r0 = move-exception
        L6c:
            r13 = r0
            goto La9
        L6e:
            r0 = move-exception
            r6 = r12
            goto L6c
        L71:
            r6 = r12
            r10 = r14
            r11 = r15
            f1.r0$j r14 = r6.f16538r     // Catch: java.lang.Throwable -> L6b
            boolean r13 = R(r13, r14)     // Catch: java.lang.Throwable -> L6b
            x2.g.i(r13)     // Catch: java.lang.Throwable -> L6b
            f1.r0$j r13 = r6.f16538r     // Catch: java.lang.Throwable -> L6b
            r6.f16538r = r2     // Catch: java.lang.Throwable -> L6b
            r12.j0()     // Catch: java.lang.Throwable -> L6b
            r2 = r13
        L85:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L9f
            r13 = 10
            if (r10 != r13) goto L93
            java.lang.String r13 = "Recorder"
            java.lang.String r14 = "Recording was stopped due to recording being garbage collected before any valid data has been produced."
            g0.r1.c(r13, r14)
        L93:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Recording was stopped before any data could be produced."
            r13.<init>(r14, r11)
            r14 = 8
            r12.H(r2, r14, r13)
        L9f:
            return
        La0:
            r6 = r12
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6b
            java.lang.String r14 = "Calling stop() while idling or initializing is invalid."
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L6b
            throw r13     // Catch: java.lang.Throwable -> L6b
        La9:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.r0.x0(f1.e1, int, java.lang.Throwable):void");
    }

    public void y0(j jVar, long j10, int i10, Throwable th2) {
        if (this.f16540t != jVar || this.f16541u) {
            return;
        }
        this.f16541u = true;
        this.Y = i10;
        this.Z = th2;
        if (O()) {
            D();
            this.K.d(j10);
        }
        m1.i iVar = this.f16507a0;
        if (iVar != null) {
            iVar.close();
            this.f16507a0 = null;
        }
        if (this.f16514e0 != a2.a.ACTIVE_NON_STREAMING) {
            final m1.l lVar = this.I;
            this.f16516f0 = l0(new Runnable() { // from class: f1.q0
                @Override // java.lang.Runnable
                public final void run() {
                    r0.i(m1.l.this);
                }
            }, this.f16513e, 1000L, TimeUnit.MILLISECONDS);
        } else {
            T(this.I);
        }
        this.I.d(j10);
    }
}
