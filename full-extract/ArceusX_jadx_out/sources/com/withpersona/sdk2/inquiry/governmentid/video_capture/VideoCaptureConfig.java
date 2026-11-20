package com.withpersona.sdk2.inquiry.governmentid.video_capture;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import j6.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;
import sm.g;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017JP\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J\u001a\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0011\u00102\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b1\u00100¨\u00063"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "Landroid/os/Parcelable;", "", "maxRecordingLengthMs", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "enabledCaptureFileTypes", "Lkn/a;", "videoCaptureMethods", "", "webRtcJwt", "", "recordAudio", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "copy", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Z)Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "J", "()J", b.f21518e, "Ljava/util/List;", "getEnabledCaptureFileTypes", "()Ljava/util/List;", "c", "g", d.f30696a, "Ljava/lang/String;", "i", "e", "Z", "f", "()Z", "j", "isVideoCaptureEnabled", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VideoCaptureConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<VideoCaptureConfig> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final long maxRecordingLengthMs;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<kn.a> videoCaptureMethods;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String webRtcJwt;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean recordAudio;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VideoCaptureConfig> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VideoCaptureConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(NextStep.GovernmentId.CaptureFileType.valueOf(parcel.readString()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                arrayList2.add(kn.a.valueOf(parcel.readString()));
            }
            return new VideoCaptureConfig(readLong, arrayList, arrayList2, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VideoCaptureConfig[] newArray(int i10) {
            return new VideoCaptureConfig[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoCaptureConfig(long j10, @NotNull List<? extends NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes, @NotNull List<? extends kn.a> videoCaptureMethods, @g(name = "webRTCJwt") @Nullable String str, boolean z10) {
        Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
        Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
        this.maxRecordingLengthMs = j10;
        this.enabledCaptureFileTypes = enabledCaptureFileTypes;
        this.videoCaptureMethods = videoCaptureMethods;
        this.webRtcJwt = str;
        this.recordAudio = z10;
    }

    /* renamed from: a, reason: from getter */
    public final long getMaxRecordingLengthMs() {
        return this.maxRecordingLengthMs;
    }

    @NotNull
    public final VideoCaptureConfig copy(long maxRecordingLengthMs, @NotNull List<? extends NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes, @NotNull List<? extends kn.a> videoCaptureMethods, @g(name = "webRTCJwt") @Nullable String webRtcJwt, boolean recordAudio) {
        Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
        Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
        return new VideoCaptureConfig(maxRecordingLengthMs, enabledCaptureFileTypes, videoCaptureMethods, webRtcJwt, recordAudio);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCaptureConfig)) {
            return false;
        }
        VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) other;
        return this.maxRecordingLengthMs == videoCaptureConfig.maxRecordingLengthMs && Intrinsics.c(this.enabledCaptureFileTypes, videoCaptureConfig.enabledCaptureFileTypes) && Intrinsics.c(this.videoCaptureMethods, videoCaptureConfig.videoCaptureMethods) && Intrinsics.c(this.webRtcJwt, videoCaptureConfig.webRtcJwt) && this.recordAudio == videoCaptureConfig.recordAudio;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getRecordAudio() {
        return this.recordAudio;
    }

    @NotNull
    public final List<kn.a> g() {
        return this.videoCaptureMethods;
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.maxRecordingLengthMs) * 31) + this.enabledCaptureFileTypes.hashCode()) * 31) + this.videoCaptureMethods.hashCode()) * 31;
        String str = this.webRtcJwt;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.recordAudio);
    }

    @Nullable
    /* renamed from: i, reason: from getter */
    public final String getWebRtcJwt() {
        return this.webRtcJwt;
    }

    public final boolean j() {
        return this.enabledCaptureFileTypes.contains(NextStep.GovernmentId.CaptureFileType.Video);
    }

    @NotNull
    public String toString() {
        return "VideoCaptureConfig(maxRecordingLengthMs=" + this.maxRecordingLengthMs + ", enabledCaptureFileTypes=" + this.enabledCaptureFileTypes + ", videoCaptureMethods=" + this.videoCaptureMethods + ", webRtcJwt=" + this.webRtcJwt + ", recordAudio=" + this.recordAudio + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.maxRecordingLengthMs);
        List<NextStep.GovernmentId.CaptureFileType> list = this.enabledCaptureFileTypes;
        dest.writeInt(list.size());
        Iterator<NextStep.GovernmentId.CaptureFileType> it = list.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next().name());
        }
        List<kn.a> list2 = this.videoCaptureMethods;
        dest.writeInt(list2.size());
        Iterator<kn.a> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeString(it2.next().name());
        }
        dest.writeString(this.webRtcJwt);
        dest.writeInt(this.recordAudio ? 1 : 0);
    }

    public /* synthetic */ VideoCaptureConfig(long j10, List list, List list2, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 120000L : j10, list, list2, str, z10);
    }
}
