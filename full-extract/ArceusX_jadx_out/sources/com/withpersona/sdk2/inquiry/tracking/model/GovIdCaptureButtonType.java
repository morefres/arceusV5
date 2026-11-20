package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sm.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "SHUTTER", "FLASH", "RETAKE_PHOTO", "CONTINUE", "CAPTURE_TIPS", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GovIdCaptureButtonType {
    private static final /* synthetic */ pt.a $ENTRIES;
    private static final /* synthetic */ GovIdCaptureButtonType[] $VALUES;

    @g(name = "shutter")
    public static final GovIdCaptureButtonType SHUTTER = new GovIdCaptureButtonType("SHUTTER", 0);

    @g(name = "flash")
    public static final GovIdCaptureButtonType FLASH = new GovIdCaptureButtonType("FLASH", 1);

    @g(name = "retake_photo")
    public static final GovIdCaptureButtonType RETAKE_PHOTO = new GovIdCaptureButtonType("RETAKE_PHOTO", 2);

    @g(name = "continue")
    public static final GovIdCaptureButtonType CONTINUE = new GovIdCaptureButtonType("CONTINUE", 3);

    @g(name = "capture_tips")
    public static final GovIdCaptureButtonType CAPTURE_TIPS = new GovIdCaptureButtonType("CAPTURE_TIPS", 4);

    private static final /* synthetic */ GovIdCaptureButtonType[] $values() {
        return new GovIdCaptureButtonType[]{SHUTTER, FLASH, RETAKE_PHOTO, CONTINUE, CAPTURE_TIPS};
    }

    static {
        GovIdCaptureButtonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = pt.b.a($values);
    }

    private GovIdCaptureButtonType(String str, int i10) {
    }

    @NotNull
    public static pt.a<GovIdCaptureButtonType> getEntries() {
        return $ENTRIES;
    }

    public static GovIdCaptureButtonType valueOf(String str) {
        return (GovIdCaptureButtonType) Enum.valueOf(GovIdCaptureButtonType.class, str);
    }

    public static GovIdCaptureButtonType[] values() {
        return (GovIdCaptureButtonType[]) $VALUES.clone();
    }
}
