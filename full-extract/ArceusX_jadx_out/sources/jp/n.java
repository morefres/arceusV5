package jp;

import android.content.Context;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderConfig;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderOutput;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcStrings;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u00014Bw\b\u0007\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u00172\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Ljp/n;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;", "Ltr/h;", "Lg/c;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderConfig;", "jpMyNumberNfcReaderLauncher", "Landroid/content/Context;", "context", "Lup/c;", "sandboxFlags", "Ljp/k;", "validOperation", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings;", "strings", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;", "transitionComponents", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;", "componentStyles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "stepStyles", "", "theme", "", "preferVendorMocks", "<init>", "(Lg/c;Landroid/content/Context;Lup/c;Ljp/k;Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;Z)V", "otherWorker", "c", "(Lwm/o;)Z", "Lmu/h;", "run", "()Lmu/h;", j6.b.f21518e, "Lg/c;", "Landroid/content/Context;", rl.d.f30696a, "Lup/c;", "e", "Ljp/k;", "f", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings;", "g", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;", "h", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;", "i", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "j", "Ljava/lang/Integer;", "k", "Z", ve.a.f33391e, "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements wm.o<JpMyNumberNfcReaderOutput>, tr.h<JpMyNumberNfcReaderOutput> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g.c<JpMyNumberNfcReaderConfig> jpMyNumberNfcReaderLauncher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final up.c sandboxFlags;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final JpMyNumberNfcValidOperation validOperation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final JpMyNumberNfcStrings strings;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final JpMyNumberNfcScan.TransitionComponents transitionComponents;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final JpMyNumberNfcScan.JpMyNumberNfcScanStyles componentStyles;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final StepStyles.UiStepStyle stepStyles;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer theme;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final boolean preferVendorMocks;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JQ\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Ljp/n$a;", "", "Ljp/k;", "validOperation", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings;", "strings", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;", "transitionComponents", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;", "componentStyles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "stepStyles", "", "theme", "", "preferVendorMocks", "Ljp/n;", ve.a.f33391e, "(Ljp/k;Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;Z)Ljp/n;", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        n a(@NotNull JpMyNumberNfcValidOperation validOperation, @NotNull JpMyNumberNfcStrings strings, @Nullable JpMyNumberNfcScan.TransitionComponents transitionComponents, @Nullable JpMyNumberNfcScan.JpMyNumberNfcScanStyles componentStyles, @Nullable StepStyles.UiStepStyle stepStyles, @Nullable Integer theme, boolean preferVendorMocks);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.jpmynumber.ScanJpMyNumberNfcWorker$run$1", f = "ScanJpMyNumberNfcWorker.kt", l = {65, 69, 78}, m = "invokeSuspend")
    public static final class b extends ot.m implements Function2<mu.i<? super JpMyNumberNfcReaderOutput>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f22022t;

        /* renamed from: u, reason: collision with root package name */
        public Object f22023u;

        /* renamed from: v, reason: collision with root package name */
        public int f22024v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f22025w;

        public b(mt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            b bVar2 = n.this.new b(bVar);
            bVar2.f22025w = obj;
            return bVar2;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(1:(1:(1:(3:6|7|8)(2:10|11))(4:12|13|14|15))(1:20))(6:28|(1:30)(2:35|(1:37)(1:38))|31|32|(1:34)|17)|21|22|23|(1:(2:25|15))) */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0116, code lost:
        
            if (r0.emit(r2, r14) != r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00f9, code lost:
        
            if (ju.z0.b(r5, r14) == r1) goto L33;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 284
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: jp.n.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mu.i<? super JpMyNumberNfcReaderOutput> iVar, mt.b<? super Unit> bVar) {
            return ((b) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public n(@NotNull g.c<JpMyNumberNfcReaderConfig> jpMyNumberNfcReaderLauncher, @NotNull Context context, @NotNull up.c sandboxFlags, @NotNull JpMyNumberNfcValidOperation validOperation, @NotNull JpMyNumberNfcStrings strings, @Nullable JpMyNumberNfcScan.TransitionComponents transitionComponents, @Nullable JpMyNumberNfcScan.JpMyNumberNfcScanStyles jpMyNumberNfcScanStyles, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, boolean z10) {
        Intrinsics.checkNotNullParameter(jpMyNumberNfcReaderLauncher, "jpMyNumberNfcReaderLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        Intrinsics.checkNotNullParameter(validOperation, "validOperation");
        Intrinsics.checkNotNullParameter(strings, "strings");
        this.jpMyNumberNfcReaderLauncher = jpMyNumberNfcReaderLauncher;
        this.context = context;
        this.sandboxFlags = sandboxFlags;
        this.validOperation = validOperation;
        this.strings = strings;
        this.transitionComponents = transitionComponents;
        this.componentStyles = jpMyNumberNfcScanStyles;
        this.stepStyles = uiStepStyle;
        this.theme = num;
        this.preferVendorMocks = z10;
    }

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> hVar) {
        return super.a(hVar);
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull wm.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return otherWorker instanceof n;
    }

    @Override // wm.o, tr.h
    @NotNull
    public mu.h<JpMyNumberNfcReaderOutput> run() {
        return mu.j.w(new b(null));
    }
}
