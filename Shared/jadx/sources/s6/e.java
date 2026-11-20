package s6;

import e7.h0;
import e7.u;
import gt.l;
import java.util.LinkedHashMap;
import java.util.Map;
import k6.BitmapImage;
import k6.s;
import kotlin.Metadata;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p6.a;
import p6.d;
import s6.d;
import x6.ImageRequest;
import x6.Options;
import x6.SuccessResult;
import x6.r;
import y6.Size;
import y6.a;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001\u001aB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J-\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(J7\u0010)\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b)\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u0018\u00100\u001a\u00020\u001d*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00103\u001a\u0004\u0018\u000101*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u00102¨\u00064"}, d2 = {"Ls6/e;", "", "Lk6/s;", "imageLoader", "Lx6/r;", "requestService", "Le7/u;", "logger", "<init>", "(Lk6/s;Lx6/r;Le7/u;)V", "Lx6/g;", "request", "mappedData", "Lx6/p;", "options", "Lk6/j;", "eventListener", "Ls6/d$b;", "f", "(Lx6/g;Ljava/lang/Object;Lx6/p;Lk6/j;)Ls6/d$b;", "cacheKey", "Ly6/g;", "size", "Ly6/f;", "scale", "Ls6/d$c;", ve.a.f33391e, "(Lx6/g;Ls6/d$b;Ly6/g;Ly6/f;)Ls6/d$c;", "cacheValue", "", "c", "(Lx6/g;Ls6/d$b;Ls6/d$c;Ly6/g;Ly6/f;)Z", "Lp6/a$b;", "result", "h", "(Ls6/d$b;Lx6/g;Lp6/a$b;)Z", "Lp6/d$a;", "chain", "Lx6/t;", "g", "(Lp6/d$a;Lx6/g;Ls6/d$b;Ls6/d$c;)Lx6/t;", rl.d.f30696a, "Lk6/s;", j6.b.f21518e, "Lx6/r;", "Le7/u;", "e", "(Ls6/d$c;)Z", "isSampled", "", "(Ls6/d$c;)Ljava/lang/String;", "diskCacheKey", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s imageLoader;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final r requestService;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final u logger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30893a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[y6.f.values().length];
            try {
                iArr[y6.f.f36507a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y6.f.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30893a = iArr;
            int[] iArr2 = new int[y6.c.values().length];
            try {
                iArr2[y6.c.f36501a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[y6.c.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
        }
    }

    public e(@NotNull s sVar, @NotNull r rVar, @Nullable u uVar) {
        this.imageLoader = sVar;
        this.requestService = rVar;
        this.logger = uVar;
    }

    @Nullable
    public final d.Value a(@NotNull ImageRequest request, @NotNull d.Key cacheKey, @NotNull Size size, @NotNull y6.f scale) {
        if (!request.getMemoryCachePolicy().getReadEnabled()) {
            return null;
        }
        d e10 = this.imageLoader.e();
        d.Value a10 = e10 != null ? e10.a(cacheKey) : null;
        if (a10 == null || !c(request, cacheKey, a10, size, scale)) {
            return null;
        }
        return a10;
    }

    public final String b(d.Value value) {
        Object obj = value.a().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean c(@NotNull ImageRequest request, @NotNull d.Key cacheKey, @NotNull d.Value cacheValue, @NotNull Size size, @NotNull y6.f scale) {
        if (this.requestService.b(request, cacheValue)) {
            return d(request, cacheKey, cacheValue, size, scale);
        }
        u uVar = this.logger;
        if (uVar == null) {
            return false;
        }
        u.a aVar = u.a.b;
        if (uVar.a().compareTo(aVar) > 0) {
            return false;
        }
        uVar.b("MemoryCacheService", aVar, request.getData() + ": Cached bitmap is hardware-backed, which is incompatible with the request.", null);
        return false;
    }

    public final boolean d(ImageRequest request, d.Key cacheKey, d.Value cacheValue, Size size, y6.f scale) {
        int abs;
        String str = cacheKey.a().get("coil#size");
        if (str != null) {
            if (Intrinsics.c(str, size.toString())) {
                return true;
            }
            u uVar = this.logger;
            if (uVar != null) {
                u.a aVar = u.a.b;
                if (uVar.a().compareTo(aVar) <= 0) {
                    uVar.b("MemoryCacheService", aVar, request.getData() + ": Memory cached image's size (" + str + ") does not exactly match the target size (" + size + ").", null);
                }
            }
            return false;
        }
        if (!e(cacheValue) && (y6.h.b(size) || request.getPrecision() == y6.c.b)) {
            return true;
        }
        int width = cacheValue.getImage().getWidth();
        int height = cacheValue.getImage().getHeight();
        Size f10 = cacheValue.getImage() instanceof BitmapImage ? x6.i.f(request) : Size.f36511d;
        y6.a d10 = size.d();
        int px = d10 instanceof a.C0674a ? ((a.C0674a) d10).getPx() : Integer.MAX_VALUE;
        y6.a d11 = f10.d();
        int min = Math.min(px, d11 instanceof a.C0674a ? ((a.C0674a) d11).getPx() : Integer.MAX_VALUE);
        y6.a c10 = size.c();
        int px2 = c10 instanceof a.C0674a ? ((a.C0674a) c10).getPx() : Integer.MAX_VALUE;
        y6.a c11 = f10.c();
        int min2 = Math.min(px2, c11 instanceof a.C0674a ? ((a.C0674a) c11).getPx() : Integer.MAX_VALUE);
        double d12 = min / width;
        double d13 = min2 / height;
        int i10 = b.f30893a[((min == Integer.MAX_VALUE || min2 == Integer.MAX_VALUE) ? y6.f.b : scale).ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new l();
            }
            if (d12 < d13) {
                abs = Math.abs(min - width);
            } else {
                abs = Math.abs(min2 - height);
                d12 = d13;
            }
        } else if (d12 > d13) {
            abs = Math.abs(min - width);
        } else {
            abs = Math.abs(min2 - height);
            d12 = d13;
        }
        if (abs <= 1) {
            return true;
        }
        int i11 = b.b[request.getPrecision().ordinal()];
        if (i11 == 1) {
            if (d12 == 1.0d) {
                return true;
            }
            u uVar2 = this.logger;
            if (uVar2 != null) {
                u.a aVar2 = u.a.b;
                if (uVar2.a().compareTo(aVar2) <= 0) {
                    uVar2.b("MemoryCacheService", aVar2, request.getData() + ": Memory cached image's size (" + width + ", " + height + ") does not exactly match the target size (" + min + ", " + min2 + ").", null);
                }
            }
            return false;
        }
        if (i11 != 2) {
            throw new l();
        }
        if (d12 <= 1.0d) {
            return true;
        }
        u uVar3 = this.logger;
        if (uVar3 != null) {
            u.a aVar3 = u.a.b;
            if (uVar3.a().compareTo(aVar3) <= 0) {
                uVar3.b("MemoryCacheService", aVar3, request.getData() + ": Memory cached image's size (" + width + ", " + height + ") is smaller than the target size (" + min + ", " + min2 + ").", null);
            }
        }
        return false;
    }

    public final boolean e(d.Value value) {
        Object obj = value.a().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Nullable
    public final d.Key f(@NotNull ImageRequest request, @NotNull Object mappedData, @NotNull Options options, @NotNull k6.j eventListener) {
        if (request.getMemoryCachePolicy() == x6.c.f35366f) {
            return null;
        }
        if (request.getMemoryCacheKey() != null) {
            return new d.Key(request.getMemoryCacheKey(), request.r());
        }
        eventListener.j(request, mappedData);
        String q10 = h0.q(this.imageLoader.getComponents(), mappedData, options, this.logger, "MemoryCacheService");
        eventListener.i(request, q10);
        if (q10 == null) {
            return null;
        }
        if (x6.i.h(request).isEmpty()) {
            return new d.Key(q10, request.r());
        }
        Map x10 = k0.x(request.r());
        x10.put("coil#size", options.getSize().toString());
        return new d.Key(q10, x10);
    }

    @NotNull
    public final SuccessResult g(@NotNull d.a chain, @NotNull ImageRequest request, @NotNull d.Key cacheKey, @NotNull d.Value cacheValue) {
        return new SuccessResult(cacheValue.getImage(), request, m6.f.f24337a, cacheKey, b(cacheValue), e(cacheValue), h0.p(chain));
    }

    public final boolean h(@Nullable d.Key cacheKey, @NotNull ImageRequest request, @NotNull a.ExecuteResult result) {
        d e10;
        if (cacheKey == null || !request.getMemoryCachePolicy().getWriteEnabled() || !result.getImage().getShareable() || (e10 = this.imageLoader.e()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(result.getIsSampled()));
        String diskCacheKey = result.getDiskCacheKey();
        if (diskCacheKey != null) {
            linkedHashMap.put("coil#disk_cache_key", diskCacheKey);
        }
        e10.h(cacheKey, new d.Value(result.getImage(), linkedHashMap));
        return true;
    }
}
