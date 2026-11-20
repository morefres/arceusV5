package i1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import g0.r1;
import i1.p;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class s implements p {

    /* renamed from: m, reason: collision with root package name */
    public static final long f20132m = TimeUnit.MILLISECONDS.toNanos(500);

    /* renamed from: a, reason: collision with root package name */
    public AudioRecord f20133a;
    public final i1.a b;

    /* renamed from: f, reason: collision with root package name */
    public final int f20137f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20138g;

    /* renamed from: h, reason: collision with root package name */
    public p.a f20139h;

    /* renamed from: i, reason: collision with root package name */
    public Executor f20140i;

    /* renamed from: j, reason: collision with root package name */
    public long f20141j;

    /* renamed from: k, reason: collision with root package name */
    public AudioManager.AudioRecordingCallback f20142k;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f20134c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f20135d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference<Boolean> f20136e = new AtomicReference<>(null);

    /* renamed from: l, reason: collision with root package name */
    public boolean f20143l = false;

    public class a extends AudioManager.AudioRecordingCallback {
        public a() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
                if (j1.b.a(audioRecordingConfiguration) == s.this.f20133a.getAudioSessionId()) {
                    s.this.o(j1.d.b(audioRecordingConfiguration));
                    return;
                }
            }
        }
    }

    public s(i1.a aVar, Context context) {
        if (!n(aVar.e(), aVar.f(), aVar.b())) {
            throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(aVar.e()), Integer.valueOf(aVar.f()), Integer.valueOf(aVar.b())));
        }
        this.b = aVar;
        this.f20138g = aVar.d();
        int l10 = l(aVar.e(), aVar.f(), aVar.b());
        x2.g.i(l10 > 0);
        int i10 = l10 * 2;
        this.f20137f = i10;
        AudioRecord j10 = j(i10, aVar, context);
        this.f20133a = j10;
        e(j10);
    }

    public static void e(AudioRecord audioRecord) {
        if (audioRecord.getState() == 1) {
            return;
        }
        audioRecord.release();
        throw new p.b("Unable to initialize AudioRecord");
    }

    public static AudioFormat h(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(t.b(i11)).setEncoding(i12).build();
    }

    public static AudioFormat i(i1.a aVar) {
        return h(aVar.e(), aVar.f(), aVar.b());
    }

    public static AudioRecord j(int i10, i1.a aVar, Context context) {
        int i11 = Build.VERSION.SDK_INT;
        AudioFormat i12 = i(aVar);
        AudioRecord.Builder b = j1.a.b();
        if (i11 >= 31 && context != null) {
            j1.e.a(b, context);
        }
        j1.a.d(b, aVar.c());
        j1.a.c(b, i12);
        j1.a.e(b, i10);
        try {
            return j1.a.a(b);
        } catch (UnsupportedOperationException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int l(int i10, int i11, int i12) {
        return AudioRecord.getMinBufferSize(i10, t.a(i11), i12);
    }

    public static boolean m() {
        return k1.c.b(AudioTimestampFramePositionIncorrectQuirk.class) != null;
    }

    public static boolean n(int i10, int i11, int i12) {
        if (i10 <= 0 || i11 <= 0 || l(i10, i11, i12) <= 0) {
            return false;
        }
        try {
            h(i10, i11, i12);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // i1.p
    public void a() {
        AudioManager.AudioRecordingCallback audioRecordingCallback;
        if (this.f20134c.getAndSet(true)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (audioRecordingCallback = this.f20142k) != null) {
            j1.d.d(this.f20133a, audioRecordingCallback);
        }
        this.f20133a.release();
    }

    @Override // i1.p
    public void b(p.a aVar, Executor executor) {
        boolean z10 = true;
        x2.g.j(!this.f20135d.get(), "AudioStream can not be started when setCallback.");
        f();
        if (aVar != null && executor == null) {
            z10 = false;
        }
        x2.g.b(z10, "executor can't be null with non-null callback.");
        this.f20139h = aVar;
        this.f20140i = executor;
        if (Build.VERSION.SDK_INT >= 29) {
            AudioManager.AudioRecordingCallback audioRecordingCallback = this.f20142k;
            if (audioRecordingCallback != null) {
                j1.d.d(this.f20133a, audioRecordingCallback);
            }
            if (aVar == null) {
                return;
            }
            if (this.f20142k == null) {
                this.f20142k = new a();
            }
            j1.d.c(this.f20133a, executor, this.f20142k);
        }
    }

    public final void f() {
        x2.g.j(!this.f20134c.get(), "AudioStream has been released.");
    }

    public final void g() {
        x2.g.j(this.f20135d.get(), "AudioStream has not been started.");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long k() {
        /*
            r9 = this;
            boolean r0 = r9.f20143l
            r1 = -1
            if (r0 != 0) goto L3b
            android.media.AudioTimestamp r0 = new android.media.AudioTimestamp
            r0.<init>()
            android.media.AudioRecord r3 = r9.f20133a
            r4 = 0
            int r3 = j1.b.b(r3, r0, r4)
            if (r3 != 0) goto L34
            i1.a r3 = r9.b
            int r3 = r3.e()
            long r4 = r9.f20141j
            long r3 = i1.t.c(r3, r4, r0)
            long r5 = java.lang.System.nanoTime()
            long r5 = r3 - r5
            long r5 = java.lang.Math.abs(r5)
            long r7 = i1.s.f20132m
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L3c
            r0 = 1
            r9.f20143l = r0
            goto L3b
        L34:
            java.lang.String r0 = "AudioStreamImpl"
            java.lang.String r3 = "Unable to get audio timestamp"
            g0.r1.l(r0, r3)
        L3b:
            r3 = r1
        L3c:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L45
            long r0 = java.lang.System.nanoTime()
            return r0
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.s.k():long");
    }

    public void o(final boolean z10) {
        Executor executor = this.f20140i;
        final p.a aVar = this.f20139h;
        if (executor == null || aVar == null || Objects.equals(this.f20136e.getAndSet(Boolean.valueOf(z10)), Boolean.valueOf(z10))) {
            return;
        }
        executor.execute(new Runnable() { // from class: i1.r
            @Override // java.lang.Runnable
            public final void run() {
                p.a.this.a(z10);
            }
        });
    }

    @Override // i1.p
    public p.c read(ByteBuffer byteBuffer) {
        long j10;
        f();
        g();
        int read = this.f20133a.read(byteBuffer, this.f20137f);
        if (read > 0) {
            byteBuffer.limit(read);
            j10 = k();
            this.f20141j += t.g(read, this.f20138g);
        } else {
            j10 = 0;
        }
        return p.c.c(read, j10);
    }

    @Override // i1.p
    public void start() {
        f();
        if (this.f20135d.getAndSet(true)) {
            return;
        }
        if (m()) {
            e(this.f20133a);
        }
        this.f20133a.startRecording();
        boolean z10 = false;
        if (this.f20133a.getRecordingState() != 3) {
            this.f20135d.set(false);
            throw new p.b("Unable to start AudioRecord with state: " + this.f20133a.getRecordingState());
        }
        this.f20141j = 0L;
        this.f20143l = false;
        this.f20136e.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration a10 = j1.d.a(this.f20133a);
            z10 = a10 != null && j1.d.b(a10);
        }
        o(z10);
    }

    @Override // i1.p
    @SuppressLint({"MissingPermission"})
    public void stop() {
        f();
        if (this.f20135d.getAndSet(false)) {
            this.f20133a.stop();
            if (this.f20133a.getRecordingState() != 1) {
                r1.l("AudioStreamImpl", "Failed to stop AudioRecord with state: " + this.f20133a.getRecordingState());
            }
            if (m()) {
                this.f20133a.release();
                this.f20133a = j(this.f20137f, this.b, null);
            }
        }
    }
}
