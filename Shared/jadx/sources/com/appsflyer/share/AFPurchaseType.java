package com.appsflyer.share;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import pt.a;
import pt.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/appsflyer/share/AFPurchaseType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "SUBSCRIPTION", "ONE_TIME_PURCHASE"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFPurchaseType {
    private static final /* synthetic */ a AFKeystoreWrapper;
    public static final AFPurchaseType ONE_TIME_PURCHASE;
    public static final AFPurchaseType SUBSCRIPTION;
    private static final /* synthetic */ AFPurchaseType[] unregisterClient;

    @NotNull
    private final String value;

    static {
        AFPurchaseType aFPurchaseType = new AFPurchaseType("SUBSCRIPTION", 0, "subscription");
        SUBSCRIPTION = aFPurchaseType;
        AFPurchaseType aFPurchaseType2 = new AFPurchaseType("ONE_TIME_PURCHASE", 1, "one_time_purchase");
        ONE_TIME_PURCHASE = aFPurchaseType2;
        AFPurchaseType[] aFPurchaseTypeArr = {aFPurchaseType, aFPurchaseType2};
        unregisterClient = aFPurchaseTypeArr;
        AFKeystoreWrapper = b.a(aFPurchaseTypeArr);
    }

    private AFPurchaseType(String str, int i10, String str2) {
        this.value = str2;
    }

    @NotNull
    public static a<AFPurchaseType> getEntries() {
        return AFKeystoreWrapper;
    }

    public static AFPurchaseType valueOf(String str) {
        return (AFPurchaseType) Enum.valueOf(AFPurchaseType.class, str);
    }

    public static AFPurchaseType[] values() {
        return (AFPurchaseType[]) unregisterClient.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
