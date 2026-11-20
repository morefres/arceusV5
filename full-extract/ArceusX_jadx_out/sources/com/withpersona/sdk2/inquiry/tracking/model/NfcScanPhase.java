package com.withpersona.sdk2.inquiry.tracking.model;

import androidx.core.os.EnvironmentCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sm.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;", "", "<init>", "(Ljava/lang/String;I)V", "ServiceOpen", "Authentication", "ChipAuthentication", "Dg1Read", "Dg2Read", "SodRead", "Copy", "Complete", "Unknown", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NfcScanPhase {
    private static final /* synthetic */ pt.a $ENTRIES;
    private static final /* synthetic */ NfcScanPhase[] $VALUES;

    @g(name = "service_open")
    public static final NfcScanPhase ServiceOpen = new NfcScanPhase("ServiceOpen", 0);

    @g(name = "authentication")
    public static final NfcScanPhase Authentication = new NfcScanPhase("Authentication", 1);

    @g(name = "chip_authentication")
    public static final NfcScanPhase ChipAuthentication = new NfcScanPhase("ChipAuthentication", 2);

    @g(name = "dg1_read")
    public static final NfcScanPhase Dg1Read = new NfcScanPhase("Dg1Read", 3);

    @g(name = "dg2_read")
    public static final NfcScanPhase Dg2Read = new NfcScanPhase("Dg2Read", 4);

    @g(name = "sod_read")
    public static final NfcScanPhase SodRead = new NfcScanPhase("SodRead", 5);

    @g(name = "copy")
    public static final NfcScanPhase Copy = new NfcScanPhase("Copy", 6);

    @g(name = "complete")
    public static final NfcScanPhase Complete = new NfcScanPhase("Complete", 7);

    @g(name = EnvironmentCompat.MEDIA_UNKNOWN)
    public static final NfcScanPhase Unknown = new NfcScanPhase("Unknown", 8);

    private static final /* synthetic */ NfcScanPhase[] $values() {
        return new NfcScanPhase[]{ServiceOpen, Authentication, ChipAuthentication, Dg1Read, Dg2Read, SodRead, Copy, Complete, Unknown};
    }

    static {
        NfcScanPhase[] $values = $values();
        $VALUES = $values;
        $ENTRIES = pt.b.a($values);
    }

    private NfcScanPhase(String str, int i10) {
    }

    @NotNull
    public static pt.a<NfcScanPhase> getEntries() {
        return $ENTRIES;
    }

    public static NfcScanPhase valueOf(String str) {
        return (NfcScanPhase) Enum.valueOf(NfcScanPhase.class, str);
    }

    public static NfcScanPhase[] values() {
        return (NfcScanPhase[]) $VALUES.clone();
    }
}
