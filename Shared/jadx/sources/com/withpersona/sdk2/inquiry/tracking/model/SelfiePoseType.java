package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sm.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "CENTER", "UP", "DOWN", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelfiePoseType {
    private static final /* synthetic */ pt.a $ENTRIES;
    private static final /* synthetic */ SelfiePoseType[] $VALUES;

    @g(name = "left")
    public static final SelfiePoseType LEFT = new SelfiePoseType("LEFT", 0);

    @g(name = "right")
    public static final SelfiePoseType RIGHT = new SelfiePoseType("RIGHT", 1);

    @g(name = "center")
    public static final SelfiePoseType CENTER = new SelfiePoseType("CENTER", 2);

    @g(name = "up")
    public static final SelfiePoseType UP = new SelfiePoseType("UP", 3);

    @g(name = "down")
    public static final SelfiePoseType DOWN = new SelfiePoseType("DOWN", 4);

    private static final /* synthetic */ SelfiePoseType[] $values() {
        return new SelfiePoseType[]{LEFT, RIGHT, CENTER, UP, DOWN};
    }

    static {
        SelfiePoseType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = pt.b.a($values);
    }

    private SelfiePoseType(String str, int i10) {
    }

    @NotNull
    public static pt.a<SelfiePoseType> getEntries() {
        return $ENTRIES;
    }

    public static SelfiePoseType valueOf(String str) {
        return (SelfiePoseType) Enum.valueOf(SelfiePoseType.class, str);
    }

    public static SelfiePoseType[] values() {
        return (SelfiePoseType[]) $VALUES.clone();
    }
}
