package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sm.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;", "", "<init>", "(Ljava/lang/String;I)V", "MANUAL", "AUTO", "VIDEO_UPLOAD", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GovIdCaptureMethod {
    private static final /* synthetic */ pt.a $ENTRIES;
    private static final /* synthetic */ GovIdCaptureMethod[] $VALUES;

    @g(name = "manual")
    public static final GovIdCaptureMethod MANUAL = new GovIdCaptureMethod("MANUAL", 0);

    @g(name = "auto")
    public static final GovIdCaptureMethod AUTO = new GovIdCaptureMethod("AUTO", 1);

    @g(name = "video_upload")
    public static final GovIdCaptureMethod VIDEO_UPLOAD = new GovIdCaptureMethod("VIDEO_UPLOAD", 2);

    private static final /* synthetic */ GovIdCaptureMethod[] $values() {
        return new GovIdCaptureMethod[]{MANUAL, AUTO, VIDEO_UPLOAD};
    }

    static {
        GovIdCaptureMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = pt.b.a($values);
    }

    private GovIdCaptureMethod(String str, int i10) {
    }

    @NotNull
    public static pt.a<GovIdCaptureMethod> getEntries() {
        return $ENTRIES;
    }

    public static GovIdCaptureMethod valueOf(String str) {
        return (GovIdCaptureMethod) Enum.valueOf(GovIdCaptureMethod.class, str);
    }

    public static GovIdCaptureMethod[] values() {
        return (GovIdCaptureMethod[]) $VALUES.clone();
    }
}
