package m6;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import m6.i;
import o6.SourceFetchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.Options;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lm6/x;", "Lm6/i;", "Landroid/graphics/ImageDecoder$Source;", Payload.SOURCE, "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Lx6/p;", "options", "Ltu/h;", "parallelismLock", "<init>", "(Landroid/graphics/ImageDecoder$Source;Ljava/lang/AutoCloseable;Lx6/p;Ltu/h;)V", "Lm6/g;", ve.a.f33391e, "(Lmt/b;)Ljava/lang/Object;", "Landroid/graphics/ImageDecoder;", "", "e", "(Landroid/graphics/ImageDecoder;)V", "Landroid/graphics/ImageDecoder$Source;", j6.b.f21518e, "Ljava/lang/AutoCloseable;", "c", "Lx6/p;", rl.d.f30696a, "Ltu/h;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x implements i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ImageDecoder.Source source;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AutoCloseable closeable;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Options options;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final tu.h parallelismLock;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Lm6/x$a;", "Lm6/i$a;", "Ltu/h;", "parallelismLock", "<init>", "(Ltu/h;)V", "Lo6/o;", "result", "Lx6/p;", "options", "Lk6/s;", "imageLoader", "Lm6/i;", ve.a.f33391e, "(Lo6/o;Lx6/p;Lk6/s;)Lm6/i;", "", j6.b.f21518e, "(Lx6/p;)Z", "Ltu/h;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements i.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final tu.h parallelismLock;

        public a(@NotNull tu.h hVar) {
            this.parallelismLock = hVar;
        }

        @Override // m6.i.a
        @Nullable
        public i a(@NotNull SourceFetchResult result, @NotNull Options options, @NotNull k6.s imageLoader) {
            ImageDecoder.Source b;
            if (b(options) && (b = z.b(result.getSource(), options, false)) != null) {
                return new x(b, result.getSource(), options, this.parallelismLock);
            }
            return null;
        }

        public final boolean b(Options options) {
            Bitmap.Config j10 = x6.j.j(options);
            return j10 == Bitmap.Config.ARGB_8888 || j10 == Bitmap.Config.HARDWARE;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "coil3.decode.StaticImageDecoder", f = "StaticImageDecoder.kt", l = {168}, m = "decode")
    public static final class b extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f24372t;

        /* renamed from: u, reason: collision with root package name */
        public int f24373u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f24374v;

        /* renamed from: x, reason: collision with root package name */
        public int f24376x;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24374v = obj;
            this.f24376x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return x.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/graphics/ImageDecoder;", "decoder", "Landroid/graphics/ImageDecoder$ImageInfo;", "info", "Landroid/graphics/ImageDecoder$Source;", Payload.SOURCE, "", "onHeaderDecoded", "(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V", "<anonymous>"}, k = 3, mv = {2, 2, 0})
    public static final class c implements ImageDecoder$OnHeaderDecodedListener {
        public final /* synthetic */ kotlin.jvm.internal.y b;

        public c(kotlin.jvm.internal.y yVar) {
            this.b = yVar;
        }

        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            Size size = imageInfo.getSize();
            int width = size.getWidth();
            int height = size.getHeight();
            long b = h.b(width, height, x.this.options.getSize(), x.this.options.getScale(), x6.i.g(x.this.options));
            int c10 = e7.r.c(b);
            int d10 = e7.r.d(b);
            if (width > 0 && height > 0 && (width != c10 || height != d10)) {
                double d11 = h.d(width, height, c10, d10, x.this.options.getScale());
                kotlin.jvm.internal.y yVar = this.b;
                boolean z10 = d11 < 1.0d;
                yVar.f22979a = z10;
                if (z10 || x.this.options.getPrecision() == y6.c.f36501a) {
                    imageDecoder.setTargetSize(bu.b.c(width * d11), bu.b.c(d11 * height));
                }
            }
            x.this.e(imageDecoder);
        }
    }

    public x(@NotNull ImageDecoder.Source source, @NotNull AutoCloseable autoCloseable, @NotNull Options options, @NotNull tu.h hVar) {
        this.source = source;
        this.closeable = autoCloseable;
        this.options = options;
        this.parallelismLock = hVar;
    }

    public static final boolean f(ImageDecoder.DecodeException decodeException) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // m6.i
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull mt.b<? super m6.DecodeResult> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof m6.x.b
            if (r0 == 0) goto L13
            r0 = r8
            m6.x$b r0 = (m6.x.b) r0
            int r1 = r0.f24376x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24376x = r1
            goto L18
        L13:
            m6.x$b r0 = new m6.x$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f24374v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f24376x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.f24372t
            tu.h r0 = (tu.h) r0
            gt.o.b(r8)
            goto L49
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            gt.o.b(r8)
            tu.h r8 = r7.parallelismLock
            r0.f24372t = r8
            r0.f24373u = r3
            r0.f24376x = r4
            java.lang.Object r0 = r8.d(r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r8
        L49:
            java.lang.AutoCloseable r8 = r7.closeable     // Catch: java.lang.Throwable -> L6e
            kotlin.jvm.internal.y r1 = new kotlin.jvm.internal.y     // Catch: java.lang.Throwable -> L70
            r1.<init>()     // Catch: java.lang.Throwable -> L70
            android.graphics.ImageDecoder$Source r2 = r7.source     // Catch: java.lang.Throwable -> L70
            m6.x$c r5 = new m6.x$c     // Catch: java.lang.Throwable -> L70
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L70
            android.graphics.Bitmap r2 = android.graphics.ImageDecoder.decodeBitmap(r2, r5)     // Catch: java.lang.Throwable -> L70
            m6.g r5 = new m6.g     // Catch: java.lang.Throwable -> L70
            r6 = 0
            k6.a r2 = k6.v.d(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L70
            boolean r1 = r1.f22979a     // Catch: java.lang.Throwable -> L70
            r5.<init>(r2, r1)     // Catch: java.lang.Throwable -> L70
            wt.a.a(r8, r6)     // Catch: java.lang.Throwable -> L6e
            r0.a()
            return r5
        L6e:
            r8 = move-exception
            goto L77
        L70:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L72
        L72:
            r2 = move-exception
            wt.a.a(r8, r1)     // Catch: java.lang.Throwable -> L6e
            throw r2     // Catch: java.lang.Throwable -> L6e
        L77:
            r0.a()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.x.a(mt.b):java.lang.Object");
    }

    public final void e(ImageDecoder imageDecoder) {
        imageDecoder.setOnPartialImageListener(new ImageDecoder.OnPartialImageListener() { // from class: m6.w
            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                boolean f10;
                f10 = x.f(decodeException);
                return f10;
            }
        });
        imageDecoder.setAllocator(e7.b.d(x6.j.j(this.options)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!x6.j.h(this.options) ? 1 : 0);
        if (x6.j.l(this.options) != null) {
            imageDecoder.setTargetColorSpace(x6.j.l(this.options));
        }
        imageDecoder.setUnpremultipliedRequired(!x6.j.n(this.options));
    }
}
