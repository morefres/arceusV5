package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import ar.h2;
import ar.o;
import ar.x;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanResult;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan;
import cr.j;
import java.util.ArrayList;
import java.util.List;
import jp.JpMyNumberNfcValidOperation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;
import sm.g;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BA\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJR\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b*\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R&\u0010D\u001a\b\u0012\u0004\u0012\u00020>0=8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b-\u0010?\u0012\u0004\bB\u0010C\u001a\u0004\b@\u0010AR(\u0010K\u001a\u00020&8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bE\u0010F\u0012\u0004\bJ\u0010C\u001a\u0004\bG\u0010H\"\u0004\b+\u0010IR\u001f\u0010Q\u001a\u0004\u0018\u00010L8\u0006¢\u0006\u0012\n\u0004\b@\u0010M\u0012\u0004\bP\u0010C\u001a\u0004\bN\u0010OR(\u0010Y\u001a\u00020R8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bS\u0010T\u0012\u0004\bX\u0010C\u001a\u0004\bS\u0010U\"\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lar/o;", "Lar/x;", "Lar/h2;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;", "scanResult", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;J)V", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;)V", "newValue", "m", "(Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;", "g", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", d.f30696a, "getDisabled", "e", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;", "getScanResult", "()Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;", "f", "J", "P0", "()J", "", "Lkr/a;", "Ljava/util/List;", "i", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "h", "Z", "W0", "()Z", "(Z)V", "getWasTapped$annotations", "wasTapped", "Ljp/k;", "Ljp/k;", "k", "()Ljp/k;", "getValidOperation$annotations", "validOperation", "Lcr/j;", "j", "Lcr/j;", "()Lcr/j;", "setScanResultController", "(Lcr/j;)V", "getScanResultController$annotations", "scanResultController", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class JpMyNumberNfcScanComponent implements UiComponent, o, x, h2 {

    @NotNull
    public static final Parcelable.Creator<JpMyNumberNfcScanComponent> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final JpMyNumberNfcScan config;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean disabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final JpMyNumberNfcScanResult scanResult;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<kr.a> associatedViews;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean wasTapped;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final JpMyNumberNfcValidOperation validOperation;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public j scanResultController;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JpMyNumberNfcScanComponent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JpMyNumberNfcScanComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JpMyNumberNfcScanComponent(parcel.readString(), (JpMyNumberNfcScan) parcel.readParcelable(JpMyNumberNfcScanComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(JpMyNumberNfcScanComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(JpMyNumberNfcScanComponent.class.getClassLoader()), (JpMyNumberNfcScanResult) parcel.readParcelable(JpMyNumberNfcScanComponent.class.getClassLoader()), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JpMyNumberNfcScanComponent[] newArray(int i10) {
            return new JpMyNumberNfcScanComponent[i10];
        }
    }

    public JpMyNumberNfcScanComponent(@NotNull String name, @NotNull JpMyNumberNfcScan config, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @Nullable JpMyNumberNfcScanResult jpMyNumberNfcScanResult, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(config, "config");
        this.name = name;
        this.config = config;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.scanResult = jpMyNumberNfcScanResult;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        this.validOperation = JpMyNumberNfcValidOperation.INSTANCE.a(config.getAttributes());
        this.scanResultController = new j(jpMyNumberNfcScanResult);
    }

    public static /* synthetic */ JpMyNumberNfcScanComponent f(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, String str, JpMyNumberNfcScan jpMyNumberNfcScan, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, JpMyNumberNfcScanResult jpMyNumberNfcScanResult, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = jpMyNumberNfcScanComponent.name;
        }
        if ((i10 & 2) != 0) {
            jpMyNumberNfcScan = jpMyNumberNfcScanComponent.config;
        }
        if ((i10 & 4) != 0) {
            jsonLogicBoolean = jpMyNumberNfcScanComponent.hidden;
        }
        if ((i10 & 8) != 0) {
            jsonLogicBoolean2 = jpMyNumberNfcScanComponent.disabled;
        }
        if ((i10 & 16) != 0) {
            jpMyNumberNfcScanResult = jpMyNumberNfcScanComponent.scanResult;
        }
        if ((i10 & 32) != 0) {
            j10 = jpMyNumberNfcScanComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        JpMyNumberNfcScanResult jpMyNumberNfcScanResult2 = jpMyNumberNfcScanResult;
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean;
        return jpMyNumberNfcScanComponent.a(str, jpMyNumberNfcScan, jsonLogicBoolean3, jsonLogicBoolean2, jpMyNumberNfcScanResult2, j11);
    }

    @g(ignore = true)
    public static /* synthetic */ void getScanResultController$annotations() {
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    /* renamed from: P0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    /* renamed from: W0, reason: from getter */
    public boolean getWasTapped() {
        return this.wasTapped;
    }

    @NotNull
    public final JpMyNumberNfcScanComponent a(@NotNull String name, @NotNull JpMyNumberNfcScan config, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, @Nullable JpMyNumberNfcScanResult scanResult, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(config, "config");
        return new JpMyNumberNfcScanComponent(name, config, hidden, disabled, scanResult, lastValueUpdateTs);
    }

    @Override // ar.h2
    public void b(boolean z10) {
        this.wasTapped = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JpMyNumberNfcScanComponent)) {
            return false;
        }
        JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent = (JpMyNumberNfcScanComponent) other;
        return Intrinsics.c(this.name, jpMyNumberNfcScanComponent.name) && Intrinsics.c(this.config, jpMyNumberNfcScanComponent.config) && Intrinsics.c(this.hidden, jpMyNumberNfcScanComponent.hidden) && Intrinsics.c(this.disabled, jpMyNumberNfcScanComponent.disabled) && Intrinsics.c(this.scanResult, jpMyNumberNfcScanComponent.scanResult) && this.lastValueUpdateTs == jpMyNumberNfcScanComponent.lastValueUpdateTs;
    }

    @NotNull
    /* renamed from: g, reason: from getter */
    public final JpMyNumberNfcScan getConfig() {
        return this.config;
    }

    @Override // ar.o
    @Nullable
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // ar.x
    @Nullable
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    @NotNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + this.config.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int hashCode2 = (hashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int hashCode3 = (hashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        JpMyNumberNfcScanResult jpMyNumberNfcScanResult = this.scanResult;
        return ((hashCode3 + (jpMyNumberNfcScanResult != null ? jpMyNumberNfcScanResult.hashCode() : 0)) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // ar.x
    @NotNull
    public List<kr.a> i() {
        return this.associatedViews;
    }

    @NotNull
    /* renamed from: j, reason: from getter */
    public final j getScanResultController() {
        return this.scanResultController;
    }

    @Nullable
    /* renamed from: k, reason: from getter */
    public final JpMyNumberNfcValidOperation getValidOperation() {
        return this.validOperation;
    }

    @NotNull
    public final JpMyNumberNfcScanComponent m(@Nullable JpMyNumberNfcScanResult newValue) {
        JpMyNumberNfcScanComponent f10 = f(this, null, null, null, null, newValue, 0L, 47, null);
        f10.scanResultController = this.scanResultController;
        f10.b(getWasTapped());
        return f10;
    }

    @NotNull
    public String toString() {
        return "JpMyNumberNfcScanComponent(name=" + this.name + ", config=" + this.config + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", scanResult=" + this.scanResult + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.config, flags);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeParcelable(this.scanResult, flags);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ JpMyNumberNfcScanComponent(java.lang.String r9, com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan r10, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean r11, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean r12, com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanResult r13, long r14, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 16
            if (r0 == 0) goto L5
            r13 = 0
        L5:
            r5 = r13
            r13 = r16 & 32
            if (r13 == 0) goto L13
            r0 = 0
            r6 = r0
            r2 = r10
            r3 = r11
            r4 = r12
            r0 = r8
            r1 = r9
            goto L19
        L13:
            r6 = r14
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
        L19:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanComponent.<init>(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanResult, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public JpMyNumberNfcScanComponent(@org.jetbrains.annotations.NotNull com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan r12) {
        /*
            r11 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r2 = r12.getName()
            com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan$Attributes r0 = r12.getAttributes()
            r1 = 0
            if (r0 == 0) goto L16
            com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean r0 = r0.getHidden()
            r4 = r0
            goto L17
        L16:
            r4 = r1
        L17:
            com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan$Attributes r0 = r12.getAttributes()
            if (r0 == 0) goto L21
            com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean r1 = r0.getDisabled()
        L21:
            r5 = r1
            r9 = 48
            r10 = 0
            r6 = 0
            r7 = 0
            r1 = r11
            r3 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanComponent.<init>(com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan):void");
    }
}
