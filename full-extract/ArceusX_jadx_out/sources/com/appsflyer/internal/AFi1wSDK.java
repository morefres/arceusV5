package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.core.os.EnvironmentCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class AFi1wSDK extends AFi1ySDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1wSDK(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkInfo J_(AFi1wSDK aFi1wSDK, Network network) {
        ConnectivityManager unregisterClient = aFi1wSDK.getUnregisterClient();
        Intrinsics.checkNotNull(unregisterClient);
        return unregisterClient.getNetworkInfo(network);
    }

    @Override // com.appsflyer.internal.AFi1ySDK
    @NotNull
    public final String AFLogger() {
        Network[] allNetworks;
        Sequence B;
        Sequence y10;
        Object obj;
        ConnectivityManager unregisterClient = getUnregisterClient();
        if (unregisterClient != null && (allNetworks = unregisterClient.getAllNetworks()) != null && (B = kotlin.collections.m.B(allNetworks)) != null && (y10 = hu.p.y(B, new Function1() { // from class: com.appsflyer.internal.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                NetworkInfo J_;
                J_ = AFi1wSDK.J_(AFi1wSDK.this, (Network) obj2);
                return J_;
            }
        })) != null) {
            Iterator it = y10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                NetworkInfo networkInfo = (NetworkInfo) obj;
                if (networkInfo != null ? networkInfo.isConnectedOrConnecting() : false) {
                    break;
                }
            }
            NetworkInfo networkInfo2 = (NetworkInfo) obj;
            if (networkInfo2 != null) {
                int type = networkInfo2.getType();
                return type != 0 ? type != 1 ? EnvironmentCompat.MEDIA_UNKNOWN : "WIFI" : "MOBILE";
            }
        }
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    @Override // com.appsflyer.internal.AFi1ySDK
    @Nullable
    public final Network K_() {
        Network[] allNetworks;
        Sequence B;
        ConnectivityManager unregisterClient = getUnregisterClient();
        Object obj = null;
        if (unregisterClient == null || (allNetworks = unregisterClient.getAllNetworks()) == null || (B = kotlin.collections.m.B(allNetworks)) == null) {
            return null;
        }
        Iterator it = B.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ConnectivityManager unregisterClient2 = getUnregisterClient();
            Intrinsics.checkNotNull(unregisterClient2);
            NetworkInfo networkInfo = unregisterClient2.getNetworkInfo((Network) next);
            if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                obj = next;
                break;
            }
        }
        return (Network) obj;
    }

    @Override // com.appsflyer.internal.AFi1ySDK
    @Nullable
    public final NetworkCapabilities L_() {
        Network K_ = K_();
        if (K_ == null) {
            return null;
        }
        ConnectivityManager unregisterClient = getUnregisterClient();
        Intrinsics.checkNotNull(unregisterClient);
        return unregisterClient.getNetworkCapabilities(K_);
    }

    @Override // com.appsflyer.internal.AFi1ySDK
    public final boolean registerClient() {
        Network[] allNetworks;
        try {
            ConnectivityManager unregisterClient = getUnregisterClient();
            if (unregisterClient != null && (allNetworks = unregisterClient.getAllNetworks()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Network network : allNetworks) {
                    ConnectivityManager unregisterClient2 = getUnregisterClient();
                    Intrinsics.checkNotNull(unregisterClient2);
                    NetworkCapabilities networkCapabilities = unregisterClient2.getNetworkCapabilities(network);
                    if (networkCapabilities != null) {
                        arrayList.add(networkCapabilities);
                    }
                }
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        NetworkCapabilities networkCapabilities2 = (NetworkCapabilities) obj;
                        if (networkCapabilities2 != null && networkCapabilities2.hasTransport(4) && !networkCapabilities2.hasCapability(15)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Exception e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed collecting VPN capability data", e10, false, false, false, false, 120, null);
            return false;
        }
    }
}
