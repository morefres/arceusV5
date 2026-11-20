package com.withpersona.sdk2.inquiry.nfc;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import eo.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.i;
import mu.j;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;
import rl.d;
import tr.h;
import wm.o;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001>B\u008b\u0001\b\u0007\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\u000e\b\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u00020!2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/b;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "Ltr/h;", "Lg/c;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "passportNfcReaderLauncher", "Landroid/content/Context;", "context", "Lup/c;", "sandboxFlags", "Loq/c;", "sdkFilesManager", "Leo/e;", "featureFlagManager", "", "cardAccessNumber", "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "mrzKey", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "passportNfcStrings", "", "Lop/b;", "enabledDataGroups", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "stepStyles", "", "theme", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "componentStyles", "<init>", "(Lg/c;Landroid/content/Context;Lup/c;Loq/c;Leo/e;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;)V", "otherWorker", "", "c", "(Lwm/o;)Z", "Lmu/h;", "run", "()Lmu/h;", j6.b.f21518e, "Lg/c;", "Landroid/content/Context;", d.f30696a, "Lup/c;", "e", "Loq/c;", "f", "Leo/e;", "g", "Ljava/lang/String;", "h", "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "i", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "j", "Ljava/util/List;", "k", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "l", "Ljava/lang/Integer;", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", ve.a.f33391e, "nfc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements o<PassportNfcReaderOutput>, h<PassportNfcReaderOutput> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g.c<PassportNfcReaderConfig> passportNfcReaderLauncher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final up.c sandboxFlags;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final oq.c sdkFilesManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e featureFlagManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String cardAccessNumber;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MrzKey mrzKey;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PassportNfcStrings passportNfcStrings;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<op.b> enabledDataGroups;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final StepStyles.UiStepStyle stepStyles;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer theme;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final GovernmentIdNfcScan.GovernmentIdNfcScanStyles componentStyles;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JU\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/b$a;", "", "", "cardAccessNumber", "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "mrzKey", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "passportNfcStrings", "", "Lop/b;", "enabledDataGroups", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "", "theme", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "componentStyles", "Lcom/withpersona/sdk2/inquiry/nfc/b;", ve.a.f33391e, "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;)Lcom/withpersona/sdk2/inquiry/nfc/b;", "nfc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        b a(@NotNull String cardAccessNumber, @NotNull MrzKey mrzKey, @NotNull PassportNfcStrings passportNfcStrings, @NotNull List<? extends op.b> enabledDataGroups, @Nullable StepStyles.UiStepStyle styles, @Nullable Integer theme, @Nullable GovernmentIdNfcScan.GovernmentIdNfcScanStyles componentStyles);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker$run$1", f = "ScanNfcWorker.kt", l = {68, 94, 98, HttpStatusCodesKt.HTTP_EARLY_HINTS}, m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.nfc.b$b, reason: collision with other inner class name */
    public static final class C0229b extends m implements Function2<i<? super PassportNfcReaderOutput>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f12291t;

        /* renamed from: u, reason: collision with root package name */
        public Object f12292u;

        /* renamed from: v, reason: collision with root package name */
        public Object f12293v;

        /* renamed from: w, reason: collision with root package name */
        public int f12294w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f12295x;

        public C0229b(mt.b<? super C0229b> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            C0229b c0229b = b.this.new C0229b(bVar);
            c0229b.f12295x = obj;
            return c0229b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0195, code lost:
        
            if (r0.emit(r3, r17) != r2) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0180, code lost:
        
            if (ju.z0.b(r6, r17) == r2) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
        
            if (r0.emit(r8, r17) == r2) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0160, code lost:
        
            if (r3 == r2) goto L56;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [int] */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v22 */
        /* JADX WARN: Type inference failed for: r3v23 */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 411
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.nfc.b.C0229b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super PassportNfcReaderOutput> iVar, mt.b<? super Unit> bVar) {
            return ((C0229b) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull g.c<PassportNfcReaderConfig> passportNfcReaderLauncher, @NotNull Context context, @NotNull up.c sandboxFlags, @NotNull oq.c sdkFilesManager, @NotNull e featureFlagManager, @NotNull String cardAccessNumber, @NotNull MrzKey mrzKey, @NotNull PassportNfcStrings passportNfcStrings, @NotNull List<? extends op.b> enabledDataGroups, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, @Nullable GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        Intrinsics.checkNotNullParameter(passportNfcReaderLauncher, "passportNfcReaderLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(cardAccessNumber, "cardAccessNumber");
        Intrinsics.checkNotNullParameter(mrzKey, "mrzKey");
        Intrinsics.checkNotNullParameter(passportNfcStrings, "passportNfcStrings");
        Intrinsics.checkNotNullParameter(enabledDataGroups, "enabledDataGroups");
        this.passportNfcReaderLauncher = passportNfcReaderLauncher;
        this.context = context;
        this.sandboxFlags = sandboxFlags;
        this.sdkFilesManager = sdkFilesManager;
        this.featureFlagManager = featureFlagManager;
        this.cardAccessNumber = cardAccessNumber;
        this.mrzKey = mrzKey;
        this.passportNfcStrings = passportNfcStrings;
        this.enabledDataGroups = enabledDataGroups;
        this.stepStyles = uiStepStyle;
        this.theme = num;
        this.componentStyles = governmentIdNfcScanStyles;
    }

    @Override // tr.h
    public boolean a(@NotNull h<?> hVar) {
        return super.a(hVar);
    }

    @Override // tr.h
    public boolean b(@NotNull h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return otherWorker instanceof b;
    }

    @Override // wm.o, tr.h
    @NotNull
    public mu.h<PassportNfcReaderOutput> run() {
        return j.w(new C0229b(null));
    }
}
