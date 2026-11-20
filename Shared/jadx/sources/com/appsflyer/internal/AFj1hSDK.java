package com.appsflyer.internal;

import com.appsflyer.sdk_base.util.OptionalFeaturesValidator;
import com.appsflyer.sdk_base.util.SupportedOptionalFeatures;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFj1hSDK implements OptionalFeaturesValidator {

    @NotNull
    private final Map<SupportedOptionalFeatures, AFj1gSDK> registerClient = new LinkedHashMap();

    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] AFLogger;

        static {
            int[] iArr = new int[AFj1gSDK.values().length];
            try {
                iArr[AFj1gSDK.AFKeystoreWrapper.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1gSDK.AFLogger.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1gSDK.registerClient.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AFLogger = iArr;
        }
    }

    private static boolean AFLogger(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException | LinkageError unused) {
            return false;
        }
    }

    @Override // com.appsflyer.sdk_base.util.OptionalFeaturesValidator
    public final boolean isOptionalFeaturePresent(@NotNull SupportedOptionalFeatures supportedOptionalFeatures) {
        Intrinsics.checkNotNullParameter(supportedOptionalFeatures, "");
        AFj1gSDK aFj1gSDK = this.registerClient.get(supportedOptionalFeatures);
        if (aFj1gSDK == null) {
            aFj1gSDK = AFj1gSDK.AFKeystoreWrapper;
        }
        int i10 = AFa1tSDK.AFLogger[aFj1gSDK.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return true;
            }
            if (i10 == 3) {
                return false;
            }
            throw new gt.l();
        }
        if (!OptionalFeaturesValidator.INSTANCE.getRegisteredFeatures().contains(supportedOptionalFeatures)) {
            this.registerClient.put(supportedOptionalFeatures, AFj1gSDK.registerClient);
            return false;
        }
        boolean AFLogger = AFLogger(supportedOptionalFeatures.getClassName());
        this.registerClient.put(supportedOptionalFeatures, AFLogger ? AFj1gSDK.AFLogger : AFj1gSDK.registerClient);
        return AFLogger;
    }
}
