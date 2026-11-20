package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.util.JsonUtils;
import gt.n;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFa1zSDK;", "Lcom/appsflyer/internal/AFa1ySDK;", "<init>", "()V", "Landroid/content/Context;", "p0", "", "AFLogger", "(Landroid/content/Context;)V", "Lorg/json/JSONObject;", "AFKeystoreWrapper", "(Landroid/content/Context;)Lorg/json/JSONObject;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFa1zSDK implements AFa1ySDK {

    @NotNull
    public static final AFa1zSDK INSTANCE = new AFa1zSDK();

    private AFa1zSDK() {
    }

    private static JSONObject AFKeystoreWrapper(Context p02) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            InputStream open = p02.getAssets().open("af_init_config.json");
            Intrinsics.checkNotNullExpressionValue(open, "");
            try {
                String h10 = tt.n.h(new BufferedReader(new InputStreamReader(open, Charsets.UTF_8), 8192));
                tt.c.a(open, null);
                jSONObject = new JSONObject(h10);
            } finally {
            }
        } catch (FileNotFoundException unused) {
        } catch (IOException e10) {
            e = e10;
        } catch (JSONException e11) {
            e = e11;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Configuration file af_init_config.json loaded successfully", false, 4, null);
            return jSONObject;
        } catch (FileNotFoundException unused2) {
            jSONObject2 = jSONObject;
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Configuration file af_init_config.json not found, skipping", false, 4, null);
            return jSONObject2;
        } catch (IOException e12) {
            e = e12;
            jSONObject2 = jSONObject;
            IOException iOException = e;
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, String.valueOf(iOException.getMessage()), iOException, false, false, false, false, 120, null);
            return jSONObject2;
        } catch (JSONException e13) {
            e = e13;
            jSONObject2 = jSONObject;
            JSONException jSONException = e;
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, String.valueOf(jSONException.getMessage()), jSONException, false, false, false, false, 120, null);
            return jSONObject2;
        } catch (Throwable th3) {
            th = th3;
            jSONObject2 = jSONObject;
            Throwable th4 = th;
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, String.valueOf(th4.getMessage()), th4, false, false, false, false, 120, null);
            return jSONObject2;
        }
    }

    public final void AFLogger(@NotNull Context p02) {
        Object b;
        Object obj;
        Intrinsics.checkNotNullParameter(p02, "");
        JSONObject AFKeystoreWrapper = AFKeystoreWrapper(p02);
        try {
            n.Companion companion = gt.n.INSTANCE;
            b = gt.n.b(AFKeystoreWrapper != null ? JsonUtils.toMap(AFKeystoreWrapper) : null);
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b = gt.n.b(gt.o.a(th2));
        }
        Throwable e10 = gt.n.e(b);
        if (e10 != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Failed to parse config: " + e10.getMessage(), e10, false, false, false, false, 120, null);
        }
        if (gt.n.g(b)) {
            b = null;
        }
        Map map = (Map) b;
        if (map == null) {
            return;
        }
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Starting to apply configuration from af_init_config.json", false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                Iterator<E> it = AFa1mSDK.registerClient().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.c(((AFa1mSDK) obj).registerClient, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                AFa1mSDK aFa1mSDK = (AFa1mSDK) obj;
                if (aFa1mSDK == null) {
                    AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Unsupported values have been inserted to the config file", false, 4, null);
                } else {
                    Intrinsics.checkNotNullParameter(value, "");
                    try {
                        aFa1mSDK.unregisterClient.invoke(value);
                    } catch (Throwable th3) {
                        AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Wrong Argument type was passed in the initconfig.json file.", th3, false, false, false, false, 120, null);
                    }
                }
            }
        }
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Successfully applied configuration from af_init_config.json", false, 4, null);
    }
}
