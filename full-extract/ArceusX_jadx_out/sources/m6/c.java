package m6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m6.i;
import o6.SourceFetchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wu.b0;
import wu.r0;
import x6.Options;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00102\u00020\u0001:\u0003\u0015\u0019\rB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u0014*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Lm6/c;", "Lm6/i;", "Lm6/s;", Payload.SOURCE, "Lx6/p;", "options", "Ltu/h;", "parallelismLock", "Lm6/o;", "exifOrientationStrategy", "<init>", "(Lm6/s;Lx6/p;Ltu/h;Lm6/o;)V", "Lm6/g;", ve.a.f33391e, "(Lmt/b;)Ljava/lang/Object;", "Landroid/graphics/BitmapFactory$Options;", "e", "(Landroid/graphics/BitmapFactory$Options;)Lm6/g;", "Lm6/j;", "exifData", "", "c", "(Landroid/graphics/BitmapFactory$Options;Lm6/j;)V", rl.d.f30696a, "Lm6/s;", j6.b.f21518e, "Lx6/p;", "Ltu/h;", "Lm6/o;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s source;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final tu.h parallelismLock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o exifOrientationStrategy;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR4\u0010\u0012\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lm6/c$b;", "Lwu/p;", "Lwu/r0;", "delegate", "<init>", "(Lwu/r0;)V", "Lwu/e;", "sink", "", "byteCount", "read", "(Lwu/e;J)J", "Ljava/lang/Exception;", "Lkotlin/Exception;", "value", ve.a.f33391e, "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "exception", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends wu.p {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Exception exception;

        public b(@NotNull r0 r0Var) {
            super(r0Var);
        }

        @Nullable
        /* renamed from: a, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        @Override // wu.p, wu.r0
        public long read(@NotNull wu.e sink, long byteCount) {
            try {
                return super.read(sink, byteCount);
            } catch (Exception e10) {
                this.exception = e10;
                throw e10;
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lm6/c$c;", "Lm6/i$a;", "Ltu/h;", "parallelismLock", "Lm6/o;", "exifOrientationStrategy", "<init>", "(Ltu/h;Lm6/o;)V", "Lo6/o;", "result", "Lx6/p;", "options", "Lk6/s;", "imageLoader", "Lm6/i;", ve.a.f33391e, "(Lo6/o;Lx6/p;Lk6/s;)Lm6/i;", "Ltu/h;", j6.b.f21518e, "Lm6/o;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: m6.c$c, reason: collision with other inner class name */
    public static final class C0426c implements i.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final tu.h parallelismLock;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final o exifOrientationStrategy;

        public C0426c(@NotNull tu.h hVar, @NotNull o oVar) {
            this.parallelismLock = hVar;
            this.exifOrientationStrategy = oVar;
        }

        @Override // m6.i.a
        @NotNull
        public i a(@NotNull SourceFetchResult result, @NotNull Options options, @NotNull k6.s imageLoader) {
            return new c(result.getSource(), options, this.parallelismLock, this.exifOrientationStrategy);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "coil3.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {212, 40}, m = "decode")
    public static final class d extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f24329t;

        /* renamed from: u, reason: collision with root package name */
        public int f24330u;

        /* renamed from: v, reason: collision with root package name */
        public int f24331v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f24332w;

        /* renamed from: y, reason: collision with root package name */
        public int f24334y;

        public d(mt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24332w = obj;
            this.f24334y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return c.this.a(this);
        }
    }

    public c(@NotNull s sVar, @NotNull Options options, @NotNull tu.h hVar, @NotNull o oVar) {
        this.source = sVar;
        this.options = options;
        this.parallelismLock = hVar;
        this.exifOrientationStrategy = oVar;
    }

    public static final DecodeResult f(c cVar) {
        return cVar.e(new BitmapFactory.Options());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // m6.i
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull mt.b<? super m6.DecodeResult> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof m6.c.d
            if (r0 == 0) goto L13
            r0 = r9
            m6.c$d r0 = (m6.c.d) r0
            int r1 = r0.f24334y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24334y = r1
            goto L18
        L13:
            m6.c$d r0 = new m6.c$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f24332w
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f24334y
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r0 = r0.f24329t
            tu.h r0 = (tu.h) r0
            gt.o.b(r9)     // Catch: java.lang.Throwable -> L31
            goto L71
        L31:
            r9 = move-exception
            goto L7b
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            int r2 = r0.f24330u
            java.lang.Object r6 = r0.f24329t
            tu.h r6 = (tu.h) r6
            gt.o.b(r9)
            r9 = r6
            goto L59
        L46:
            gt.o.b(r9)
            tu.h r9 = r8.parallelismLock
            r0.f24329t = r9
            r0.f24330u = r3
            r0.f24334y = r5
            java.lang.Object r2 = r9.d(r0)
            if (r2 != r1) goto L58
            goto L6d
        L58:
            r2 = r3
        L59:
            m6.b r6 = new m6.b     // Catch: java.lang.Throwable -> L77
            r6.<init>()     // Catch: java.lang.Throwable -> L77
            r0.f24329t = r9     // Catch: java.lang.Throwable -> L77
            r0.f24330u = r2     // Catch: java.lang.Throwable -> L77
            r0.f24331v = r3     // Catch: java.lang.Throwable -> L77
            r0.f24334y = r4     // Catch: java.lang.Throwable -> L77
            r2 = 0
            java.lang.Object r0 = ju.a2.c(r2, r6, r0, r5, r2)     // Catch: java.lang.Throwable -> L77
            if (r0 != r1) goto L6e
        L6d:
            return r1
        L6e:
            r7 = r0
            r0 = r9
            r9 = r7
        L71:
            m6.g r9 = (m6.DecodeResult) r9     // Catch: java.lang.Throwable -> L31
            r0.a()
            return r9
        L77:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L7b:
            r0.a()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.c.a(mt.b):java.lang.Object");
    }

    public final void c(BitmapFactory.Options options, j jVar) {
        Bitmap.Config j10 = x6.j.j(this.options);
        if (jVar.getIsFlipped() || q.a(jVar)) {
            j10 = e7.b.e(j10);
        }
        if (x6.j.h(this.options) && j10 == Bitmap.Config.ARGB_8888 && Intrinsics.c(options.outMimeType, "image/jpeg")) {
            j10 = Bitmap.Config.RGB_565;
        }
        Bitmap.Config config = options.outConfig;
        Bitmap.Config config2 = Bitmap.Config.RGBA_F16;
        if (config == config2 && j10 != Bitmap.Config.HARDWARE) {
            j10 = config2;
        }
        options.inPreferredConfig = j10;
    }

    public final void d(BitmapFactory.Options options, j jVar) {
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i10 = q.b(jVar) ? options.outHeight : options.outWidth;
        int i11 = q.b(jVar) ? options.outWidth : options.outHeight;
        long b10 = h.b(i10, i11, this.options.getSize(), this.options.getScale(), x6.i.g(this.options));
        int c10 = e7.r.c(b10);
        int d10 = e7.r.d(b10);
        int a10 = h.a(i10, i11, c10, d10, this.options.getScale());
        options.inSampleSize = a10;
        double c11 = h.c(i10 / a10, i11 / a10, c10, d10, this.options.getScale());
        if (this.options.getPrecision() == y6.c.b) {
            c11 = kotlin.ranges.d.e(c11, 1.0d);
        }
        boolean z10 = c11 == 1.0d;
        options.inScaled = !z10;
        if (z10) {
            return;
        }
        if (c11 > 1.0d) {
            options.inDensity = bu.b.c(Integer.MAX_VALUE / c11);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = bu.b.c(Integer.MAX_VALUE * c11);
        }
    }

    public final DecodeResult e(BitmapFactory.Options options) {
        b bVar = new b(this.source.source());
        wu.g c10 = b0.c(bVar);
        boolean z10 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c10.peek().s3(), null, options);
        Exception exception = bVar.getException();
        if (exception != null) {
            throw exception;
        }
        options.inJustDecodeBounds = false;
        p pVar = p.f24353a;
        j a10 = pVar.a(options.outMimeType, c10, this.exifOrientationStrategy);
        Exception exception2 = bVar.getException();
        if (exception2 != null) {
            throw exception2;
        }
        options.inMutable = false;
        if (x6.j.l(this.options) != null) {
            options.inPreferredColorSpace = x6.j.l(this.options);
        }
        options.inPremultiplied = x6.j.n(this.options);
        c(options, a10);
        d(options, a10);
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(c10.s3(), null, options);
            tt.c.a(c10, null);
            Exception exception3 = bVar.getException();
            if (exception3 != null) {
                throw exception3;
            }
            if (decodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            decodeStream.setDensity(this.options.getContext().getResources().getDisplayMetrics().densityDpi);
            k6.n c11 = k6.v.c(new BitmapDrawable(this.options.getContext().getResources(), pVar.b(decodeStream, a10)));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z10 = false;
            }
            return new DecodeResult(c11, z10);
        } finally {
        }
    }
}
