package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sm.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;", "", "<init>", "(Ljava/lang/String;I)V", "Complete", "Cancel", "Error", "Fallback", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InquiryEndReason {
    private static final /* synthetic */ pt.a $ENTRIES;
    private static final /* synthetic */ InquiryEndReason[] $VALUES;

    @g(name = "complete")
    public static final InquiryEndReason Complete = new InquiryEndReason("Complete", 0);

    @g(name = "cancel")
    public static final InquiryEndReason Cancel = new InquiryEndReason("Cancel", 1);

    @g(name = "error")
    public static final InquiryEndReason Error = new InquiryEndReason("Error", 2);

    @g(name = "fallback")
    public static final InquiryEndReason Fallback = new InquiryEndReason("Fallback", 3);

    private static final /* synthetic */ InquiryEndReason[] $values() {
        return new InquiryEndReason[]{Complete, Cancel, Error, Fallback};
    }

    static {
        InquiryEndReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = pt.b.a($values);
    }

    private InquiryEndReason(String str, int i10) {
    }

    @NotNull
    public static pt.a<InquiryEndReason> getEntries() {
        return $ENTRIES;
    }

    public static InquiryEndReason valueOf(String str) {
        return (InquiryEndReason) Enum.valueOf(InquiryEndReason.class, str);
    }

    public static InquiryEndReason[] values() {
        return (InquiryEndReason[]) $VALUES.clone();
    }
}
