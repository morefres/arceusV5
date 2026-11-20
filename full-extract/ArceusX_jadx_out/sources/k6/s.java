package k6;

import android.content.Context;
import ju.g1;
import ju.n2;
import k6.Extras;
import k6.j;
import k6.s;
import k6.w;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.d;
import x6.ImageRequest;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Lk6/s;", "", "Lx6/g;", "request", "Lx6/d;", "c", "(Lx6/g;)Lx6/d;", "Lx6/k;", rl.d.f30696a, "(Lx6/g;Lmt/b;)Ljava/lang/Object;", "", "shutdown", "()V", "Lx6/g$b;", ve.a.f33391e, "()Lx6/g$b;", "defaults", "Lk6/h;", "getComponents", "()Lk6/h;", "components", "Ls6/d;", "e", "()Ls6/d;", "memoryCache", "Ln6/a;", j6.b.f21518e, "()Ln6/a;", "diskCache", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface s {

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010 R \u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010 R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010-R\u0017\u00103\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lk6/s$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "<init>", "(Landroid/content/Context;)V", "Lk6/h;", "components", "h", "(Lk6/h;)Lk6/s$a;", "Ls6/d;", "memoryCache", "k", "(Ls6/d;)Lk6/s$a;", "Ln6/a;", "diskCache", "i", "(Ln6/a;)Lk6/s$a;", "Lk6/s;", rl.d.f30696a, "()Lk6/s;", ve.a.f33391e, "Landroid/content/Context;", "application", "Lx6/g$b;", j6.b.f21518e, "Lx6/g$b;", "defaults", "Lgt/h;", "Lkotlin/coroutines/CoroutineContext;", "c", "Lgt/h;", "mainCoroutineContextLazy", "memoryCacheLazy", "e", "diskCacheLazy", "Lk6/j$c;", "f", "Lk6/j$c;", "eventListenerFactory", "g", "Lk6/h;", "componentRegistry", "Le7/u;", "Le7/u;", "logger", "Lk6/l$a;", "Lk6/l$a;", "j", "()Lk6/l$a;", "extras", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Context application;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public ImageRequest.Defaults defaults = ImageRequest.Defaults.f35424p;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public gt.h<? extends CoroutineContext> mainCoroutineContextLazy = null;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public gt.h<? extends s6.d> memoryCacheLazy = null;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public gt.h<? extends n6.a> diskCacheLazy = null;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public j.c eventListenerFactory = null;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public h componentRegistry = null;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public e7.u logger = null;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Extras.a extras = new Extras.a();

        public a(@NotNull Context context) {
            this.application = e7.e.b(context);
        }

        public static final n2 e() {
            return g1.c().W();
        }

        public static final s6.d f(a aVar) {
            return d.a.d(new d.a(), aVar.application, 0.0d, 2, null).b();
        }

        public static final n6.a g() {
            return n6.h.d();
        }

        @NotNull
        public final s d() {
            ImageRequest.Defaults a10;
            Context context = this.application;
            a10 = r3.a((r29 & 1) != 0 ? r3.fileSystem : null, (r29 & 2) != 0 ? r3.interceptorCoroutineContext : null, (r29 & 4) != 0 ? r3.fetcherCoroutineContext : null, (r29 & 8) != 0 ? r3.decoderCoroutineContext : null, (r29 & 16) != 0 ? r3.memoryCachePolicy : null, (r29 & 32) != 0 ? r3.diskCachePolicy : null, (r29 & 64) != 0 ? r3.networkCachePolicy : null, (r29 & 128) != 0 ? r3.placeholderFactory : null, (r29 & 256) != 0 ? r3.errorFactory : null, (r29 & 512) != 0 ? r3.fallbackFactory : null, (r29 & 1024) != 0 ? r3.sizeResolver : null, (r29 & 2048) != 0 ? r3.scale : null, (r29 & 4096) != 0 ? r3.precision : null, (r29 & 8192) != 0 ? this.defaults.extras : this.extras.a());
            gt.h<? extends CoroutineContext> hVar = this.mainCoroutineContextLazy;
            if (hVar == null) {
                hVar = gt.i.b(new Function0() { // from class: k6.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        n2 e10;
                        e10 = s.a.e();
                        return e10;
                    }
                });
            }
            gt.h<? extends s6.d> hVar2 = this.memoryCacheLazy;
            if (hVar2 == null) {
                hVar2 = gt.i.b(new Function0() { // from class: k6.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        s6.d f10;
                        f10 = s.a.f(s.a.this);
                        return f10;
                    }
                });
            }
            gt.h<? extends n6.a> hVar3 = this.diskCacheLazy;
            if (hVar3 == null) {
                hVar3 = gt.i.b(new Function0() { // from class: k6.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        n6.a g10;
                        g10 = s.a.g();
                        return g10;
                    }
                });
            }
            j.c cVar = this.eventListenerFactory;
            if (cVar == null) {
                cVar = j.c.b;
            }
            h hVar4 = this.componentRegistry;
            if (hVar4 == null) {
                hVar4 = new h();
            }
            return new w(new w.Options(context, a10, hVar, hVar2, hVar3, cVar, hVar4, this.logger));
        }

        @NotNull
        public final a h(@NotNull h components) {
            this.componentRegistry = components;
            return this;
        }

        @NotNull
        public final a i(@Nullable n6.a diskCache) {
            this.diskCacheLazy = gt.j.c(diskCache);
            return this;
        }

        @NotNull
        /* renamed from: j, reason: from getter */
        public final Extras.a getExtras() {
            return this.extras;
        }

        @NotNull
        public final a k(@Nullable s6.d memoryCache) {
            this.memoryCacheLazy = gt.j.c(memoryCache);
            return this;
        }
    }

    @NotNull
    ImageRequest.Defaults a();

    @Nullable
    n6.a b();

    @NotNull
    x6.d c(@NotNull ImageRequest request);

    @Nullable
    Object d(@NotNull ImageRequest imageRequest, @NotNull mt.b<? super x6.k> bVar);

    @Nullable
    s6.d e();

    @NotNull
    h getComponents();

    void shutdown();
}
