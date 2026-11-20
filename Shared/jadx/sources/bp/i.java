package bp;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.inquiry.FallbackMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.w;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010%\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u001f\u0010$R\u0014\u0010(\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010'¨\u0006)"}, d2 = {"Lbp/i;", "Lco/a;", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "fallbackMode", "Lbp/a;", "apiController", "Lxo/h;", "environment", "Lsm/w;", "moshi", "<init>", "(Lcom/withpersona/sdk2/inquiry/FallbackMode;Lbp/a;Lxo/h;Lsm/w;)V", "Lep/e;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "c", "(Lep/e;Lmt/b;)Ljava/lang/Object;", "", "sessionToken", "", "body", "Liv/x;", ve.a.f33391e, "(Ljava/lang/String;Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "f", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "e", "()Lcom/withpersona/sdk2/inquiry/FallbackMode;", j6.b.f21518e, "Lbp/a;", "Lxo/h;", rl.d.f30696a, "Lsm/w;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "value", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "currentSession", "", "()Z", "isFallbackModeActive", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements co.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FallbackMode fallbackMode;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final bp.a apiController;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final xo.h environment;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final w moshi;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public com.withpersona.sdk2.inquiry.internal.fallbackmode.i currentSession;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", f = "RealFallbackModeManager.kt", l = {49}, m = "createFallbackSession")
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f4337t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f4338u;

        /* renamed from: w, reason: collision with root package name */
        public int f4340w;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4338u = obj;
            this.f4340w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return i.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", f = "RealFallbackModeManager.kt", l = {68, 89, 101}, m = "transition")
    public static final class b extends ot.d {
        public int A;

        /* renamed from: t, reason: collision with root package name */
        public Object f4341t;

        /* renamed from: u, reason: collision with root package name */
        public Object f4342u;

        /* renamed from: v, reason: collision with root package name */
        public Object f4343v;

        /* renamed from: w, reason: collision with root package name */
        public Object f4344w;

        /* renamed from: x, reason: collision with root package name */
        public Object f4345x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f4346y;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4346y = obj;
            this.A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return i.this.a(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", f = "RealFallbackModeManager.kt", l = {125, 137}, m = "transitionBack")
    public static final class c extends ot.d {
        public int A;

        /* renamed from: t, reason: collision with root package name */
        public Object f4348t;

        /* renamed from: u, reason: collision with root package name */
        public Object f4349u;

        /* renamed from: v, reason: collision with root package name */
        public Object f4350v;

        /* renamed from: w, reason: collision with root package name */
        public Object f4351w;

        /* renamed from: x, reason: collision with root package name */
        public Object f4352x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f4353y;

        public c(mt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4353y = obj;
            this.A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return i.this.f(null, null, this);
        }
    }

    public i(@NotNull FallbackMode fallbackMode, @NotNull bp.a apiController, @NotNull xo.h environment, @NotNull w moshi) {
        Intrinsics.checkNotNullParameter(fallbackMode, "fallbackMode");
        Intrinsics.checkNotNullParameter(apiController, "apiController");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.fallbackMode = fallbackMode;
        this.apiController = apiController;
        this.environment = environment;
        this.moshi = moshi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0166, code lost:
    
        if (r1 == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0093, code lost:
    
        if (c(r8, r2) == r3) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // co.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r24, @org.jetbrains.annotations.NotNull java.lang.Object r25, @org.jetbrains.annotations.NotNull mt.b<? super iv.x<?>> r26) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.i.a(java.lang.String, java.lang.Object, mt.b):java.lang.Object");
    }

    @Override // co.a
    public boolean b() {
        return getFallbackMode() == FallbackMode.ALWAYS;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull ep.InquiryAttributes r8, @org.jetbrains.annotations.NotNull mt.b<? super com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.NetworkErrorInfo> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof bp.i.a
            if (r0 == 0) goto L13
            r0 = r9
            bp.i$a r0 = (bp.i.a) r0
            int r1 = r0.f4340w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4340w = r1
            goto L18
        L13:
            bp.i$a r0 = new bp.i$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f4338u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f4340w
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f4337t
            ep.e r8 = (ep.InquiryAttributes) r8
            gt.o.b(r9)
            gt.n r9 = (gt.n) r9
            java.lang.Object r8 = r9.getValue()
            goto L4f
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            gt.o.b(r9)
            bp.a r9 = r7.apiController
            java.lang.Object r2 = ot.l.a(r8)
            r0.f4337t = r2
            r0.f4340w = r3
            java.lang.Object r8 = r9.c(r8, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            boolean r9 = gt.n.h(r8)
            if (r9 == 0) goto L5a
            r9 = r8
            com.withpersona.sdk2.inquiry.internal.fallbackmode.i r9 = (com.withpersona.sdk2.inquiry.internal.fallbackmode.i) r9
            r7.currentSession = r9
        L5a:
            java.lang.Throwable r8 = gt.n.e(r8)
            if (r8 == 0) goto L6e
            com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r0 = new com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo
            r5 = 8
            r6 = 0
            r1 = 0
            java.lang.String r2 = "Failed to create fallback session."
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L6e:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.i.c(ep.e, mt.b):java.lang.Object");
    }

    @Nullable
    /* renamed from: d, reason: from getter */
    public final com.withpersona.sdk2.inquiry.internal.fallbackmode.i getCurrentSession() {
        return this.currentSession;
    }

    @NotNull
    /* renamed from: e, reason: from getter */
    public FallbackMode getFallbackMode() {
        return this.fallbackMode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
    
        if (c(r9, r3) == r4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(@org.jetbrains.annotations.NotNull java.lang.String r25, @org.jetbrains.annotations.NotNull java.lang.Object r26, @org.jetbrains.annotations.NotNull mt.b<? super iv.x<?>> r27) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.i.f(java.lang.String, java.lang.Object, mt.b):java.lang.Object");
    }
}
