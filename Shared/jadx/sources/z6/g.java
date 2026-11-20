package z6;

import android.content.Context;
import com.appsflyer.sdk_base.referrer.Payload;
import e7.r;
import ju.a2;
import k6.n;
import k6.v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m6.DecodeResult;
import m6.i;
import m6.s;
import o6.SourceFetchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.Options;
import z6.c;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 (2\u00020\u0001:\u0002\u0018\u0015BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011B7\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR'\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%¨\u0006)"}, d2 = {"Lz6/g;", "Lm6/i;", "Lm6/s;", Payload.SOURCE, "Lx6/p;", "options", "Lz6/c$a;", "parser", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "", "density", "", "useViewBoundsAsIntrinsicSize", "renderToBitmap", "<init>", "(Lm6/s;Lx6/p;Lz6/c$a;Lkotlin/jvm/functions/Function1;ZZ)V", "scaleToDensity", "(Lm6/s;Lx6/p;ZZZ)V", "Lm6/g;", ve.a.f33391e, "(Lmt/b;)Ljava/lang/Object;", "Lm6/s;", j6.b.f21518e, "Lx6/p;", "c", "Lz6/c$a;", "getParser", "()Lz6/c$a;", rl.d.f30696a, "Lkotlin/jvm/functions/Function1;", "getDensity", "()Lkotlin/jvm/functions/Function1;", "e", "Z", "getUseViewBoundsAsIntrinsicSize", "()Z", "f", "getRenderToBitmap", "g", "coil-svg_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g implements m6.i {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Function1<Context, Float> f37930h = new Function1() { // from class: z6.d
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            float e10;
            e10 = g.e((Context) obj);
            return Float.valueOf(e10);
        }
    };

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Function1<Context, Float> f37931i = new Function1() { // from class: z6.e
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            float f10;
            f10 = g.f((Context) obj);
            return Float.valueOf(f10);
        }
    };

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s source;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c.a parser;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<Context, Float> density;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean useViewBoundsAsIntrinsicSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean renderToBitmap;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull s sVar, @NotNull Options options, @NotNull c.a aVar, @NotNull Function1<? super Context, Float> function1, boolean z10, boolean z11) {
        this.source = sVar;
        this.options = options;
        this.parser = aVar;
        this.density = function1;
        this.useViewBoundsAsIntrinsicSize = z10;
        this.renderToBitmap = z11;
    }

    public static final float e(Context context) {
        return 1.0f;
    }

    public static final float f(Context context) {
        return a7.d.a(context);
    }

    public static final DecodeResult g(g gVar) {
        Throwable th2;
        c cVar;
        float width;
        float height;
        wu.g source = gVar.source.source();
        try {
            cVar = gVar.parser.a(source);
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th2 = null;
        } catch (Throwable th4) {
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th5) {
                    gt.a.a(th4, th5);
                }
            }
            th2 = th4;
            cVar = null;
        }
        if (th2 != null) {
            throw th2;
        }
        c.ViewBox e10 = cVar.e();
        if (!gVar.useViewBoundsAsIntrinsicSize || e10 == null) {
            width = cVar.getWidth();
            height = cVar.getHeight();
        } else {
            width = i.b(e10);
            height = i.a(e10);
        }
        if (y6.h.b(gVar.options.getSize())) {
            float floatValue = gVar.density.invoke(gVar.options.getContext()).floatValue();
            if (width > 0.0f) {
                width *= floatValue;
            }
            if (height > 0.0f) {
                height *= floatValue;
            }
        }
        long b10 = m6.h.b(width > 0.0f ? bu.b.d(width) : 512, height > 0.0f ? bu.b.d(height) : 512, gVar.options.getSize(), gVar.options.getScale(), x6.i.g(gVar.options));
        int c10 = r.c(b10);
        int d10 = r.d(b10);
        if (width > 0.0f && height > 0.0f) {
            float e11 = m6.h.e(width, height, c10, d10, gVar.options.getScale());
            c10 = (int) (e11 * width);
            d10 = (int) (e11 * height);
            if (e10 == null) {
                cVar.b(new c.ViewBox(0.0f, 0.0f, width, height));
            }
        }
        cVar.a("100%");
        cVar.d("100%");
        cVar.c(gVar.options);
        n f10 = cVar.f(c10, d10);
        if (gVar.renderToBitmap) {
            f10 = v.d(v.g(f10, 0, 0, 3, null), false, 1, null);
        }
        return new DecodeResult(f10, gVar.renderToBitmap);
    }

    @Override // m6.i
    @Nullable
    public Object a(@NotNull mt.b<? super DecodeResult> bVar) {
        return a2.b(kotlin.coroutines.e.f22936a, new Function0() { // from class: z6.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DecodeResult g10;
                g10 = g.g(g.this);
                return g10;
            }
        }, bVar);
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rB'\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000fJ)\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR'\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$¨\u0006'"}, d2 = {"Lz6/g$b;", "Lm6/i$a;", "Lz6/c$a;", "parser", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "", "density", "", "useViewBoundsAsIntrinsicSize", "renderToBitmap", "<init>", "(Lz6/c$a;Lkotlin/jvm/functions/Function1;ZZ)V", "scaleToDensity", "(ZZZ)V", "Lo6/o;", "result", "Lx6/p;", "options", "Lk6/s;", "imageLoader", "Lm6/i;", ve.a.f33391e, "(Lo6/o;Lx6/p;Lk6/s;)Lm6/i;", j6.b.f21518e, "(Lo6/o;)Z", "Lz6/c$a;", "getParser", "()Lz6/c$a;", "Lkotlin/jvm/functions/Function1;", "getDensity", "()Lkotlin/jvm/functions/Function1;", "c", "Z", "getUseViewBoundsAsIntrinsicSize", "()Z", rl.d.f30696a, "getRenderToBitmap", "coil-svg_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements i.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final c.a parser;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Function1<Context, Float> density;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final boolean useViewBoundsAsIntrinsicSize;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final boolean renderToBitmap;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull c.a aVar, @NotNull Function1<? super Context, Float> function1, boolean z10, boolean z11) {
            this.parser = aVar;
            this.density = function1;
            this.useViewBoundsAsIntrinsicSize = z10;
            this.renderToBitmap = z11;
        }

        @Override // m6.i.a
        @Nullable
        public m6.i a(@NotNull SourceFetchResult result, @NotNull Options options, @NotNull k6.s imageLoader) {
            if (b(result)) {
                return new g(result.getSource(), options, this.parser, this.density, this.useViewBoundsAsIntrinsicSize, this.renderToBitmap);
            }
            return null;
        }

        public final boolean b(SourceFetchResult result) {
            return Intrinsics.c(result.getMimeType(), "image/svg+xml") || a.a(m6.h.f24343a, result.getSource().source());
        }

        public /* synthetic */ b(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? false : z12);
        }

        public b(boolean z10, boolean z11, boolean z12) {
            this(c.a.b, z12 ? g.f37931i : g.f37930h, z10, z11);
        }
    }

    public /* synthetic */ g(s sVar, Options options, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(sVar, options, (i10 & 4) != 0 ? true : z10, (i10 & 8) != 0 ? true : z11, (i10 & 16) != 0 ? false : z12);
    }

    public g(@NotNull s sVar, @NotNull Options options, boolean z10, boolean z11, boolean z12) {
        this(sVar, options, c.a.b, z12 ? f37931i : f37930h, z10, z11);
    }
}
