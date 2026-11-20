package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.network.AutocaptureState;
import dn.j0;
import dn.x;
import go.q2;
import gt.n;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0004:\u0001\u0015B5\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00104¨\u00066"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/f;", "Lwm/o;", "Lgt/n;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "Ltr/h;", "Landroid/content/Context;", "context", "Ldn/x;", "governmentIdFeed", "Loq/c;", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "", "idClassKey", "<init>", "(Landroid/content/Context;Ldn/x;Loq/c;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)V", "otherWorker", "", "c", "(Lwm/o;)Z", ve.a.f33391e, "(Ltr/h;)Z", "Lmu/h;", "run", "()Lmu/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ldn/j0$b;", "parsedIdSide", "g", "(Ldn/j0$b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "h", "(Ldn/j0$b;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", j6.b.f21518e, "Landroid/content/Context;", "Ldn/x;", rl.d.f30696a, "Loq/c;", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "f", "Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;", "autocaptureState", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.f, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class GovernmentIdAnalyzeWorker implements wm.o<gt.n<? extends GovernmentId.GovernmentIdImage>>, tr.h<gt.n<? extends GovernmentId.GovernmentIdImage>> {

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final x governmentIdFeed;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final oq.c sdkFilesManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final IdConfig.b side;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String idClassKey;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public AutocaptureState autocaptureState;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/f$a;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "", "idClassKey", "Lcom/withpersona/sdk2/inquiry/governmentid/f;", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/f;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.f$a */
    public interface a {
        @NotNull
        GovernmentIdAnalyzeWorker a(@NotNull IdConfig.b side, @NotNull String idClassKey);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.f$b */
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10955a;

        static {
            int[] iArr = new int[j0.c.values().length];
            try {
                iArr[j0.c.f15098a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j0.c.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10955a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.f$c */
    public static final class c implements mu.h<gt.n<? extends GovernmentId.GovernmentIdImage>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ mu.h f10956a;
        public final /* synthetic */ GovernmentIdAnalyzeWorker b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.f$c$a */
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ mu.i f10957a;
            public final /* synthetic */ GovernmentIdAnalyzeWorker b;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2", f = "GovernmentIdAnalyzeWorker.kt", l = {72}, m = "emit")
            /* renamed from: com.withpersona.sdk2.inquiry.governmentid.f$c$a$a, reason: collision with other inner class name */
            public static final class C0202a extends ot.d {
                public Object A;
                public int B;

                /* renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f10958t;

                /* renamed from: u, reason: collision with root package name */
                public int f10959u;

                /* renamed from: v, reason: collision with root package name */
                public Object f10960v;

                /* renamed from: x, reason: collision with root package name */
                public Object f10962x;

                /* renamed from: y, reason: collision with root package name */
                public Object f10963y;

                /* renamed from: z, reason: collision with root package name */
                public Object f10964z;

                public C0202a(mt.b bVar) {
                    super(bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    this.f10958t = obj;
                    this.f10959u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return a.this.emit(null, this);
                }
            }

            public a(mu.i iVar, GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker) {
                this.f10957a = iVar;
                this.b = governmentIdAnalyzeWorker;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // mu.i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, mt.b r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker.c.a.C0202a
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.withpersona.sdk2.inquiry.governmentid.f$c$a$a r0 = (com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker.c.a.C0202a) r0
                    int r1 = r0.f10959u
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f10959u = r1
                    goto L18
                L13:
                    com.withpersona.sdk2.inquiry.governmentid.f$c$a$a r0 = new com.withpersona.sdk2.inquiry.governmentid.f$c$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f10958t
                    java.lang.Object r1 = nt.c.e()
                    int r2 = r0.f10959u
                    r3 = 1
                    if (r2 == 0) goto L3e
                    if (r2 != r3) goto L36
                    java.lang.Object r8 = r0.A
                    gt.n r8 = (gt.n) r8
                    java.lang.Object r8 = r0.f10964z
                    mu.i r8 = (mu.i) r8
                    java.lang.Object r8 = r0.f10962x
                    com.withpersona.sdk2.inquiry.governmentid.f$c$a$a r8 = (com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker.c.a.C0202a) r8
                    gt.o.b(r9)
                    goto Lc7
                L36:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3e:
                    gt.o.b(r9)
                    mu.i r9 = r7.f10957a
                    r2 = r8
                    gt.n r2 = (gt.n) r2
                    java.lang.Object r2 = r2.getValue()
                    java.lang.Throwable r4 = gt.n.e(r2)
                    if (r4 != 0) goto L8f
                    dn.j0 r2 = (dn.j0) r2
                    boolean r4 = r2 instanceof dn.j0.ParsedIdSide
                    if (r4 == 0) goto L8d
                    dn.j0$b r2 = (dn.j0.ParsedIdSide) r2
                    com.withpersona.sdk2.camera.ImageIdMetadata r4 = r2.getMetadata()
                    if (r4 == 0) goto L82
                    com.withpersona.sdk2.inquiry.governmentid.f r5 = r7.b
                    com.withpersona.sdk2.inquiry.governmentid.network.AutocaptureState r6 = com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker.e(r5)
                    com.withpersona.sdk2.inquiry.governmentid.network.AutocaptureState r4 = no.a.b(r6, r4)
                    com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker.f(r5, r4)
                    com.withpersona.sdk2.inquiry.governmentid.f r4 = r7.b
                    com.withpersona.sdk2.inquiry.governmentid.network.AutocaptureState r4 = com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker.e(r4)
                    boolean r4 = no.a.a(r4)
                    if (r4 == 0) goto L8d
                    com.withpersona.sdk2.inquiry.governmentid.f r4 = r7.b
                    java.lang.Object r2 = com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker.d(r4, r2)
                    gt.n r2 = gt.n.a(r2)
                    goto L9b
                L82:
                    com.withpersona.sdk2.inquiry.governmentid.f r4 = r7.b
                    java.lang.Object r2 = com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker.d(r4, r2)
                    gt.n r2 = gt.n.a(r2)
                    goto L9b
                L8d:
                    r2 = 0
                    goto L9b
                L8f:
                    java.lang.Object r2 = gt.o.a(r4)
                    java.lang.Object r2 = gt.n.b(r2)
                    gt.n r2 = gt.n.a(r2)
                L9b:
                    if (r2 == 0) goto Lc7
                    java.lang.Object r4 = ot.l.a(r8)
                    r0.f10960v = r4
                    java.lang.Object r4 = ot.l.a(r0)
                    r0.f10962x = r4
                    java.lang.Object r8 = ot.l.a(r8)
                    r0.f10963y = r8
                    java.lang.Object r8 = ot.l.a(r9)
                    r0.f10964z = r8
                    java.lang.Object r8 = ot.l.a(r2)
                    r0.A = r8
                    r8 = 0
                    r0.B = r8
                    r0.f10959u = r3
                    java.lang.Object r8 = r9.emit(r2, r0)
                    if (r8 != r1) goto Lc7
                    return r1
                Lc7:
                    kotlin.Unit r8 = kotlin.Unit.f22894a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker.c.a.emit(java.lang.Object, mt.b):java.lang.Object");
            }
        }

        public c(mu.h hVar, GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker) {
            this.f10956a = hVar;
            this.b = governmentIdAnalyzeWorker;
        }

        @Override // mu.h
        public Object collect(mu.i<? super gt.n<? extends GovernmentId.GovernmentIdImage>> iVar, mt.b bVar) {
            Object collect = this.f10956a.collect(new a(iVar, this.b), bVar);
            return collect == nt.c.e() ? collect : Unit.f22894a;
        }
    }

    public GovernmentIdAnalyzeWorker(@NotNull Context context, @NotNull x governmentIdFeed, @NotNull oq.c sdkFilesManager, @NotNull IdConfig.b side, @NotNull String idClassKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(idClassKey, "idClassKey");
        this.context = context;
        this.governmentIdFeed = governmentIdFeed;
        this.sdkFilesManager = sdkFilesManager;
        this.side = side;
        this.idClassKey = idClassKey;
        this.autocaptureState = new AutocaptureState(null, 1, null);
    }

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof GovernmentIdAnalyzeWorker) && ((GovernmentIdAnalyzeWorker) otherWorker).side == this.side;
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull wm.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof GovernmentIdAnalyzeWorker) && ((GovernmentIdAnalyzeWorker) otherWorker).side == this.side;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdAnalyzeWorker)) {
            return false;
        }
        GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker = (GovernmentIdAnalyzeWorker) other;
        return Intrinsics.c(this.context, governmentIdAnalyzeWorker.context) && Intrinsics.c(this.governmentIdFeed, governmentIdAnalyzeWorker.governmentIdFeed) && Intrinsics.c(this.sdkFilesManager, governmentIdAnalyzeWorker.sdkFilesManager) && this.side == governmentIdAnalyzeWorker.side && Intrinsics.c(this.idClassKey, governmentIdAnalyzeWorker.idClassKey);
    }

    public final Object g(j0.ParsedIdSide parsedIdSide) {
        GovernmentId.b bVar;
        try {
            String absolutePath = j.a(parsedIdSide.getBitmap(), this.sdkFilesManager).getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            List d10 = kotlin.collections.o.d(new Frame(absolutePath, null, 2, null));
            int i10 = b.f10955a[parsedIdSide.getSide().ordinal()];
            if (i10 == 1) {
                bVar = GovernmentId.b.f10506a;
            } else {
                if (i10 != 2) {
                    throw new gt.l();
                }
                bVar = GovernmentId.b.b;
            }
            String str = this.idClassKey;
            RawExtraction rawExtraction = null;
            GovernmentId.a aVar = GovernmentId.a.f10502a;
            dn.e extractedBarcode = parsedIdSide.getExtractedBarcode();
            if (extractedBarcode != null) {
                rawExtraction = q2.a(extractedBarcode);
            }
            return gt.n.b(new GovernmentId.GovernmentIdImage(d10, bVar, str, aVar, rawExtraction, h(parsedIdSide)));
        } catch (IOException e10) {
            n.Companion companion = gt.n.INSTANCE;
            return gt.n.b(gt.o.a(e10));
        }
    }

    public final GovernmentIdDetails h(j0.ParsedIdSide parsedIdSide) {
        GovernmentIdDetails m10;
        dn.e extractedBarcode = parsedIdSide.getExtractedBarcode();
        if (extractedBarcode != null && (m10 = d.m(extractedBarcode)) != null) {
            return m10;
        }
        ExtractedTexts extractedTexts = parsedIdSide.getExtractedTexts();
        if (extractedTexts != null) {
            return d.l(extractedTexts);
        }
        return null;
    }

    public int hashCode() {
        return (((((((this.context.hashCode() * 31) + this.governmentIdFeed.hashCode()) * 31) + this.sdkFilesManager.hashCode()) * 31) + this.side.hashCode()) * 31) + this.idClassKey.hashCode();
    }

    @Override // wm.o, tr.h
    @NotNull
    public mu.h<gt.n<GovernmentId.GovernmentIdImage>> run() {
        return new c(this.governmentIdFeed, this);
    }

    @NotNull
    public String toString() {
        return "GovernmentIdAnalyzeWorker(context=" + this.context + ", governmentIdFeed=" + this.governmentIdFeed + ", sdkFilesManager=" + this.sdkFilesManager + ", side=" + this.side + ", idClassKey=" + this.idClassKey + ")";
    }
}
