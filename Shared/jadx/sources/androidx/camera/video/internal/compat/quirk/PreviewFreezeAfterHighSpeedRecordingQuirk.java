package androidx.camera.video.internal.compat.quirk;

import android.annotation.SuppressLint;
import j6.b;
import kotlin.Metadata;
import n0.g3;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/camera/video/internal/compat/quirk/PreviewFreezeAfterHighSpeedRecordingQuirk;", "Ln0/g3;", "<init>", "()V", "", "g", "()Z", b.f21518e, "Z", "isPixelPhone", "camera-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
/* loaded from: classes.dex */
public final class PreviewFreezeAfterHighSpeedRecordingQuirk implements g3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final PreviewFreezeAfterHighSpeedRecordingQuirk f1250a = new PreviewFreezeAfterHighSpeedRecordingQuirk();

    /* renamed from: b, reason: from kotlin metadata */
    public static final boolean isPixelPhone;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (kotlin.text.x.R(r0, "Pixel", true) != false) goto L8;
     */
    static {
        /*
            androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk r0 = new androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk
            r0.<init>()
            androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk.f1250a = r0
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "google"
            r2 = 1
            boolean r0 = kotlin.text.x.E(r0, r1, r2)
            if (r0 == 0) goto L22
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "Pixel"
            boolean r0 = kotlin.text.x.R(r0, r1, r2)
            if (r0 == 0) goto L22
            goto L23
        L22:
            r2 = 0
        L23:
            androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk.isPixelPhone = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk.<clinit>():void");
    }

    private PreviewFreezeAfterHighSpeedRecordingQuirk() {
    }

    public static final boolean g() {
        return isPixelPhone;
    }
}
