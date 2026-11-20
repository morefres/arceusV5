package com.withpersona.sdk2.camera;

import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.tracking.model.CameraInfoEventData;
import com.withpersona.sdk2.inquiry.tracking.model.CameraSize;
import gt.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/camera/CameraProperties;", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", ve.a.f33391e, "(Lcom/withpersona/sdk2/camera/CameraProperties;)Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "camera_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9989a;

        static {
            int[] iArr = new int[CameraProperties.b.values().length];
            try {
                iArr[CameraProperties.b.f9961a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraProperties.b.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CameraProperties.b.f9962c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9989a = iArr;
        }
    }

    @NotNull
    public static final CameraInfoEventData a(@NotNull CameraProperties cameraProperties) {
        String str;
        Intrinsics.checkNotNullParameter(cameraProperties, "<this>");
        int i10 = a.f9989a[cameraProperties.getFacingMode().ordinal()];
        if (i10 == 1) {
            str = "Front";
        } else if (i10 == 2) {
            str = "Back";
        } else {
            if (i10 != 3) {
                throw new l();
            }
            str = "Unspecified";
        }
        return new CameraInfoEventData(cameraProperties.getLabel(), str, new CameraSize(Integer.valueOf(cameraProperties.getSize().getWidth()), Integer.valueOf(cameraProperties.getSize().getHeight())), Double.valueOf(cameraProperties.getFrameRate()), Double.valueOf(cameraProperties.a()), null, null, 96, null);
    }
}
