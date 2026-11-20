package com.withpersona.sdk2.inquiry.governmentid.digitalId;

import android.os.Parcel;
import android.os.Parcelable;
import j6.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rl.d;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "Landroid/os/Parcelable;", "", "merchantId", "nonce", "fieldKeyMobileDriversLicense", "", "Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdRequest;", "digitalIdRequests", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, "Ljava/lang/String;", "getMerchantId", "()Ljava/lang/String;", b.f21518e, "getNonce", "c", "getFieldKeyMobileDriversLicense", d.f30696a, "Ljava/util/List;", "getDigitalIdRequests", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DigitalIdConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DigitalIdConfig> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String merchantId;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String nonce;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fieldKeyMobileDriversLicense;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<DigitalIdRequest> digitalIdRequests;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DigitalIdConfig> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DigitalIdConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(DigitalIdRequest.CREATOR.createFromParcel(parcel));
            }
            return new DigitalIdConfig(readString, readString2, readString3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DigitalIdConfig[] newArray(int i10) {
            return new DigitalIdConfig[i10];
        }
    }

    public DigitalIdConfig(@NotNull String merchantId, @NotNull String nonce, @NotNull String fieldKeyMobileDriversLicense, @NotNull List<DigitalIdRequest> digitalIdRequests) {
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(fieldKeyMobileDriversLicense, "fieldKeyMobileDriversLicense");
        Intrinsics.checkNotNullParameter(digitalIdRequests, "digitalIdRequests");
        this.merchantId = merchantId;
        this.nonce = nonce;
        this.fieldKeyMobileDriversLicense = fieldKeyMobileDriversLicense;
        this.digitalIdRequests = digitalIdRequests;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.merchantId);
        dest.writeString(this.nonce);
        dest.writeString(this.fieldKeyMobileDriversLicense);
        List<DigitalIdRequest> list = this.digitalIdRequests;
        dest.writeInt(list.size());
        Iterator<DigitalIdRequest> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
