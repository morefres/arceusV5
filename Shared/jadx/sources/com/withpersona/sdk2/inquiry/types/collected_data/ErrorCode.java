package com.withpersona.sdk2.inquiry.types.collected_data;

import android.os.Parcel;
import android.os.Parcelable;
import j6.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rl.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, b.f21518e, "c", d.f30696a, "e", "f", "g", "h", "i", "j", "k", "l", "inquiry-types_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ErrorCode implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ErrorCode> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public static final ErrorCode f13730a = new ErrorCode("NetworkError", 0);
    public static final ErrorCode b = new ErrorCode("CameraPermissionError", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final ErrorCode f13731c = new ErrorCode("SdkConfigurationError", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final ErrorCode f13732d = new ErrorCode("CameraCompatibilityError", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final ErrorCode f13733e = new ErrorCode("IntegrationError", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final ErrorCode f13734f = new ErrorCode("SessionTokenError", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final ErrorCode f13735g = new ErrorCode("RateLimitExceeded", 6);

    /* renamed from: h, reason: collision with root package name */
    public static final ErrorCode f13736h = new ErrorCode("UnexpectedError", 7);

    /* renamed from: i, reason: collision with root package name */
    public static final ErrorCode f13737i = new ErrorCode("NoDiskSpaceError", 8);

    /* renamed from: j, reason: collision with root package name */
    public static final ErrorCode f13738j = new ErrorCode("WebRtcIntegrationError", 9);

    /* renamed from: k, reason: collision with root package name */
    public static final ErrorCode f13739k = new ErrorCode("InvalidOneTimeLinkCode", 10);

    /* renamed from: l, reason: collision with root package name */
    public static final ErrorCode f13740l = new ErrorCode("ExceptionError", 11);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ ErrorCode[] f13741m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ pt.a f13742n;

    static {
        ErrorCode[] a10 = a();
        f13741m = a10;
        f13742n = pt.b.a(a10);
        CREATOR = new Parcelable.Creator<ErrorCode>() { // from class: com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode.a
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ErrorCode createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return ErrorCode.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ErrorCode[] newArray(int i10) {
                return new ErrorCode[i10];
            }
        };
    }

    public ErrorCode(String str, int i10) {
    }

    public static final /* synthetic */ ErrorCode[] a() {
        return new ErrorCode[]{f13730a, b, f13731c, f13732d, f13733e, f13734f, f13735g, f13736h, f13737i, f13738j, f13739k, f13740l};
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) f13741m.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
