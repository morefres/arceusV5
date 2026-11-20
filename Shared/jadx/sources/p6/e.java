package p6;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.List;
import k6.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import p6.d;
import x6.ImageRequest;
import x6.m;
import y6.Size;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b*\u0010.¨\u0006/"}, d2 = {"Lp6/e;", "Lp6/d$a;", "Lx6/g;", "initialRequest", "", "Lp6/d;", "interceptors", "", "index", "request", "Ly6/g;", "size", "Lk6/j;", "eventListener", "", "isPlaceholderCached", "<init>", "(Lx6/g;Ljava/util/List;ILx6/g;Ly6/g;Lk6/j;Z)V", "Lx6/k;", "g", "(Lmt/b;)Ljava/lang/Object;", "interceptor", "", j6.b.f21518e, "(Lx6/g;Lp6/d;)V", "c", "(ILx6/g;Ly6/g;)Lp6/e;", ve.a.f33391e, "Lx6/g;", "getInitialRequest", "()Lx6/g;", "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", "I", "getIndex", "()I", rl.d.f30696a, "e", "Ly6/g;", "i", "()Ly6/g;", "f", "Lk6/j;", "()Lk6/j;", "Z", "()Z", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e implements d.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ImageRequest initialRequest;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<d> interceptors;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int index;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ImageRequest request;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Size size;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j eventListener;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean isPlaceholderCached;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "coil3.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", l = {31}, m = "proceed")
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f28509t;

        /* renamed from: u, reason: collision with root package name */
        public Object f28510u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f28511v;

        /* renamed from: x, reason: collision with root package name */
        public int f28513x;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f28511v = obj;
            this.f28513x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return e.this.g(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull ImageRequest imageRequest, @NotNull List<? extends d> list, int i10, @NotNull ImageRequest imageRequest2, @NotNull Size size, @NotNull j jVar, boolean z10) {
        this.initialRequest = imageRequest;
        this.interceptors = list;
        this.index = i10;
        this.request = imageRequest2;
        this.size = size;
        this.eventListener = jVar;
        this.isPlaceholderCached = z10;
    }

    public static /* synthetic */ e d(e eVar, int i10, ImageRequest imageRequest, Size size, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = eVar.index;
        }
        if ((i11 & 2) != 0) {
            imageRequest = eVar.getRequest();
        }
        if ((i11 & 4) != 0) {
            size = eVar.getSize();
        }
        return eVar.c(i10, imageRequest, size);
    }

    @Override // p6.d.a
    @NotNull
    /* renamed from: a, reason: from getter */
    public ImageRequest getRequest() {
        return this.request;
    }

    public final void b(ImageRequest request, d interceptor) {
        if (request.getContext() != this.initialRequest.getContext()) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's context.").toString());
        }
        if (request.getData() == m.f35461a) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot set the request's data to null.").toString());
        }
        if (request.getTarget() != this.initialRequest.getTarget()) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's target.").toString());
        }
        if (request.getSizeResolver() == this.initialRequest.getSizeResolver()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    public final e c(int index, ImageRequest request, Size size) {
        return new e(this.initialRequest, this.interceptors, index, request, size, this.eventListener, this.isPlaceholderCached);
    }

    @NotNull
    /* renamed from: e, reason: from getter */
    public final j getEventListener() {
        return this.eventListener;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsPlaceholderCached() {
        return this.isPlaceholderCached;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(@org.jetbrains.annotations.NotNull mt.b<? super x6.k> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof p6.e.a
            if (r0 == 0) goto L13
            r0 = r12
            p6.e$a r0 = (p6.e.a) r0
            int r1 = r0.f28513x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28513x = r1
            goto L18
        L13:
            p6.e$a r0 = new p6.e$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f28511v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f28513x
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f28510u
            p6.e r1 = (p6.e) r1
            java.lang.Object r0 = r0.f28509t
            p6.d r0 = (p6.d) r0
            gt.o.b(r12)
            r4 = r11
            goto L68
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3a:
            gt.o.b(r12)
            java.util.List<p6.d> r12 = r11.interceptors
            int r2 = r11.index
            java.lang.Object r12 = r12.get(r2)
            p6.d r12 = (p6.d) r12
            int r2 = r11.index
            int r5 = r2 + 1
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4 = r11
            p6.e r2 = d(r4, r5, r6, r7, r8, r9)
            r0.f28509t = r12
            java.lang.Object r5 = ot.l.a(r2)
            r0.f28510u = r5
            r0.f28513x = r3
            java.lang.Object r0 = r12.a(r2, r0)
            if (r0 != r1) goto L65
            return r1
        L65:
            r10 = r0
            r0 = r12
            r12 = r10
        L68:
            x6.k r12 = (x6.k) r12
            x6.g r1 = r12.getRequest()
            r11.b(r1, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.e.g(mt.b):java.lang.Object");
    }

    @Override // p6.d.a
    @NotNull
    /* renamed from: i, reason: from getter */
    public Size getSize() {
        return this.size;
    }
}
