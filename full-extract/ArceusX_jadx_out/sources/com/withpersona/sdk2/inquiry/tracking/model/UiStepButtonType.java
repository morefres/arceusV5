package com.withpersona.sdk2.inquiry.tracking.model;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sm.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "Action", "Complete", "Submit", "Cancel", "ClickableStack", "ReusablePersona", "Nfc", "Mdoc", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UiStepButtonType {
    private static final /* synthetic */ pt.a $ENTRIES;
    private static final /* synthetic */ UiStepButtonType[] $VALUES;

    @g(name = "action")
    public static final UiStepButtonType Action = new UiStepButtonType("Action", 0);

    @g(name = "complete")
    public static final UiStepButtonType Complete = new UiStepButtonType("Complete", 1);

    @g(name = "submit")
    public static final UiStepButtonType Submit = new UiStepButtonType("Submit", 2);

    @g(name = "cancel")
    public static final UiStepButtonType Cancel = new UiStepButtonType("Cancel", 3);

    @g(name = ClickableStack.TYPE)
    public static final UiStepButtonType ClickableStack = new UiStepButtonType("ClickableStack", 4);

    @g(name = "reusable_persona")
    public static final UiStepButtonType ReusablePersona = new UiStepButtonType("ReusablePersona", 5);

    @g(name = "nfc")
    public static final UiStepButtonType Nfc = new UiStepButtonType("Nfc", 6);

    @g(name = Mdoc.type)
    public static final UiStepButtonType Mdoc = new UiStepButtonType("Mdoc", 7);

    private static final /* synthetic */ UiStepButtonType[] $values() {
        return new UiStepButtonType[]{Action, Complete, Submit, Cancel, ClickableStack, ReusablePersona, Nfc, Mdoc};
    }

    static {
        UiStepButtonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = pt.b.a($values);
    }

    private UiStepButtonType(String str, int i10) {
    }

    @NotNull
    public static pt.a<UiStepButtonType> getEntries() {
        return $ENTRIES;
    }

    public static UiStepButtonType valueOf(String str) {
        return (UiStepButtonType) Enum.valueOf(UiStepButtonType.class, str);
    }

    public static UiStepButtonType[] values() {
        return (UiStepButtonType[]) $VALUES.clone();
    }
}
