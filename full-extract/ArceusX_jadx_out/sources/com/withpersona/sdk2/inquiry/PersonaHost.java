package com.withpersona.sdk2.inquiry;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import pt.a;
import pt.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/PersonaHost;", "", "<init>", "(Ljava/lang/String;I)V", "Default", "FedRamp", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PersonaHost {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PersonaHost[] $VALUES;
    public static final PersonaHost Default = new PersonaHost("Default", 0);
    public static final PersonaHost FedRamp = new PersonaHost("FedRamp", 1);

    private static final /* synthetic */ PersonaHost[] $values() {
        return new PersonaHost[]{Default, FedRamp};
    }

    static {
        PersonaHost[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private PersonaHost(String str, int i10) {
    }

    @NotNull
    public static a<PersonaHost> getEntries() {
        return $ENTRIES;
    }

    public static PersonaHost valueOf(String str) {
        return (PersonaHost) Enum.valueOf(PersonaHost.class, str);
    }

    public static PersonaHost[] values() {
        return (PersonaHost[]) $VALUES.clone();
    }
}
