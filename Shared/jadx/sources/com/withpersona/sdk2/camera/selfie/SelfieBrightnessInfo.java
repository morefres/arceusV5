package com.withpersona.sdk2.camera.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "Landroid/os/Parcelable;", "", "", "averageBrightness3x3", "<init>", "([Ljava/lang/Float;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, "[Ljava/lang/Float;", "getAverageBrightness3x3", "()[Ljava/lang/Float;", "i", "()F", "topBrightness", "bottomBrightness", "f", "leftBrightness", "g", "rightBrightness", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelfieBrightnessInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SelfieBrightnessInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Float[] averageBrightness3x3;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelfieBrightnessInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SelfieBrightnessInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            Float[] fArr = new Float[readInt];
            for (int i10 = 0; i10 != readInt; i10++) {
                fArr[i10] = Float.valueOf(parcel.readFloat());
            }
            return new SelfieBrightnessInfo(fArr);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SelfieBrightnessInfo[] newArray(int i10) {
            return new SelfieBrightnessInfo[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelfieBrightnessInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final float a() {
        return ((this.averageBrightness3x3[7].floatValue() * 2.0f) + ((this.averageBrightness3x3[6].floatValue() + this.averageBrightness3x3[8].floatValue()) * 0.5f)) / 3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float f() {
        return ((this.averageBrightness3x3[3].floatValue() * 2.0f) + ((this.averageBrightness3x3[0].floatValue() + this.averageBrightness3x3[6].floatValue()) * 0.5f)) / 3;
    }

    public final float g() {
        return ((this.averageBrightness3x3[5].floatValue() * 2.0f) + ((this.averageBrightness3x3[2].floatValue() + this.averageBrightness3x3[8].floatValue()) * 0.5f)) / 3;
    }

    public final float i() {
        return ((this.averageBrightness3x3[1].floatValue() * 2.0f) + ((this.averageBrightness3x3[0].floatValue() + this.averageBrightness3x3[2].floatValue()) * 0.5f)) / 3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Float[] fArr = this.averageBrightness3x3;
        int length = fArr.length;
        dest.writeInt(length);
        for (int i10 = 0; i10 != length; i10++) {
            dest.writeFloat(fArr[i10].floatValue());
        }
    }

    public SelfieBrightnessInfo(@NotNull Float[] averageBrightness3x3) {
        Intrinsics.checkNotNullParameter(averageBrightness3x3, "averageBrightness3x3");
        this.averageBrightness3x3 = averageBrightness3x3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ SelfieBrightnessInfo(java.lang.Float[] r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r1 = this;
            r3 = r3 & 1
            if (r3 == 0) goto L16
            r2 = 9
            java.lang.Float[] r3 = new java.lang.Float[r2]
            r4 = 0
        L9:
            if (r4 >= r2) goto L15
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3[r4] = r0
            int r4 = r4 + 1
            goto L9
        L15:
            r2 = r3
        L16:
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo.<init>(java.lang.Float[], int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
