package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sm.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "SHUTTER", "FLASH", "SWITCH_CAMERA", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelfieCaptureButtonType {
    private static final /* synthetic */ pt.a $ENTRIES;
    private static final /* synthetic */ SelfieCaptureButtonType[] $VALUES;

    @g(name = "shutter")
    public static final SelfieCaptureButtonType SHUTTER = new SelfieCaptureButtonType("SHUTTER", 0);

    @g(name = "flash")
    public static final SelfieCaptureButtonType FLASH = new SelfieCaptureButtonType("FLASH", 1);

    @g(name = "switch_camera")
    public static final SelfieCaptureButtonType SWITCH_CAMERA = new SelfieCaptureButtonType("SWITCH_CAMERA", 2);

    private static final /* synthetic */ SelfieCaptureButtonType[] $values() {
        return new SelfieCaptureButtonType[]{SHUTTER, FLASH, SWITCH_CAMERA};
    }

    static {
        SelfieCaptureButtonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = pt.b.a($values);
    }

    private SelfieCaptureButtonType(String str, int i10) {
    }

    @NotNull
    public static pt.a<SelfieCaptureButtonType> getEntries() {
        return $ENTRIES;
    }

    public static SelfieCaptureButtonType valueOf(String str) {
        return (SelfieCaptureButtonType) Enum.valueOf(SelfieCaptureButtonType.class, str);
    }

    public static SelfieCaptureButtonType[] values() {
        return (SelfieCaptureButtonType[]) $VALUES.clone();
    }
}
