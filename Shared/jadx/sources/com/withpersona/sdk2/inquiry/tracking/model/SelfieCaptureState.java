package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sm.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureState;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "IDLE", "COUNTDOWN_STARTED", "TAKING_PHOTO", "CAPTURED_PHOTO", "SUBMITTING", "RECORDING_TIMED_OUT", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelfieCaptureState {
    private static final /* synthetic */ pt.a $ENTRIES;
    private static final /* synthetic */ SelfieCaptureState[] $VALUES;

    @g(name = "loading")
    public static final SelfieCaptureState LOADING = new SelfieCaptureState("LOADING", 0);

    @g(name = "idle")
    public static final SelfieCaptureState IDLE = new SelfieCaptureState("IDLE", 1);

    @g(name = "countdown_started")
    public static final SelfieCaptureState COUNTDOWN_STARTED = new SelfieCaptureState("COUNTDOWN_STARTED", 2);

    @g(name = "taking_photo")
    public static final SelfieCaptureState TAKING_PHOTO = new SelfieCaptureState("TAKING_PHOTO", 3);

    @g(name = "captured_photo")
    public static final SelfieCaptureState CAPTURED_PHOTO = new SelfieCaptureState("CAPTURED_PHOTO", 4);

    @g(name = "submitting")
    public static final SelfieCaptureState SUBMITTING = new SelfieCaptureState("SUBMITTING", 5);

    @g(name = "recording_timed_out")
    public static final SelfieCaptureState RECORDING_TIMED_OUT = new SelfieCaptureState("RECORDING_TIMED_OUT", 6);

    private static final /* synthetic */ SelfieCaptureState[] $values() {
        return new SelfieCaptureState[]{LOADING, IDLE, COUNTDOWN_STARTED, TAKING_PHOTO, CAPTURED_PHOTO, SUBMITTING, RECORDING_TIMED_OUT};
    }

    static {
        SelfieCaptureState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = pt.b.a($values);
    }

    private SelfieCaptureState(String str, int i10) {
    }

    @NotNull
    public static pt.a<SelfieCaptureState> getEntries() {
        return $ENTRIES;
    }

    public static SelfieCaptureState valueOf(String str) {
        return (SelfieCaptureState) Enum.valueOf(SelfieCaptureState.class, str);
    }

    public static SelfieCaptureState[] values() {
        return (SelfieCaptureState[]) $VALUES.clone();
    }
}
