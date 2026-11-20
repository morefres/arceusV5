package cr;

import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanResult;
import kotlin.Metadata;
import mu.c0;
import mu.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\rR(\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcr/j;", "", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;", "initialValue", "<init>", "(Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;)V", "Lmu/c0;", ve.a.f33391e, "Lmu/c0;", "_scanResult", "Lmu/h;", j6.b.f21518e, "Lmu/h;", "()Lmu/h;", "onChanged", "value", "()Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;", "c", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<JpMyNumberNfcScanResult> _scanResult;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final mu.h<JpMyNumberNfcScanResult> onChanged;

    public j(@Nullable JpMyNumberNfcScanResult jpMyNumberNfcScanResult) {
        c0<JpMyNumberNfcScanResult> a10 = r0.a(jpMyNumberNfcScanResult);
        this._scanResult = a10;
        this.onChanged = mu.j.n(a10, 1);
    }

    @NotNull
    public final mu.h<JpMyNumberNfcScanResult> a() {
        return this.onChanged;
    }

    @Nullable
    public final JpMyNumberNfcScanResult b() {
        return this._scanResult.getValue();
    }

    public final void c(@Nullable JpMyNumberNfcScanResult jpMyNumberNfcScanResult) {
        this._scanResult.setValue(jpMyNumberNfcScanResult);
    }
}
