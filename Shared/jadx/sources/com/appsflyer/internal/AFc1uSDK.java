package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFc1uSDK implements AFc1vSDK {

    @NotNull
    private final AFc1qSDK AFKeystoreWrapper;

    @NotNull
    private final Map<String, Integer> AFLogger;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFc1kSDK f5304d;

    @NotNull
    private final AFd1zSDK registerClient;

    public AFc1uSDK(@NotNull AFd1zSDK aFd1zSDK, @NotNull AFc1kSDK aFc1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        this.registerClient = aFd1zSDK;
        this.f5304d = aFc1kSDK;
        this.AFKeystoreWrapper = new AFc1qSDK(kotlin.collections.p.n(new AFc1pSDK("ConversionsCache", kotlin.collections.o.d(AFd1bSDK.registerClient), 1), new AFc1pSDK("AttrCache", kotlin.collections.o.d(AFd1bSDK.f5310w), 1), new AFc1pSDK("OtherCache", kotlin.collections.p.n(AFd1bSDK.afErrorLog, AFd1bSDK.AFLoggerLogLevel, AFd1bSDK.valueOf, AFd1bSDK.getLevel, AFd1bSDK.values, AFd1bSDK.afWarnLog), 40)));
        this.AFLogger = kotlin.collections.k0.n(gt.s.a("ConversionsCache", 0), gt.s.a("AttrCache", 0), gt.s.a("OtherCache", 0));
    }

    private final void registerClient() {
        for (AFc1pSDK aFc1pSDK : this.AFKeystoreWrapper.f5300d) {
            String str = aFc1pSDK.f5299d;
            Context context = this.registerClient.f5343d;
            Intrinsics.checkNotNull(context);
            File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
            if (file.exists()) {
                Map<String, Integer> map = this.AFLogger;
                String str2 = aFc1pSDK.f5299d;
                File[] listFiles = file.listFiles();
                map.put(str2, Integer.valueOf(listFiles != null ? listFiles.length : 0));
            } else {
                file.mkdirs();
                this.AFLogger.put(aFc1pSDK.f5299d, 0);
            }
        }
    }

    private static AFc1sSDK unregisterClient(File file) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                char[] cArr = new char[(int) file.length()];
                inputStreamReader.read(cArr);
                AFc1sSDK aFc1sSDK = new AFc1sSDK(cArr);
                aFc1sSDK.registerClient = file.getName();
                tt.c.a(inputStreamReader, null);
                return aFc1sSDK;
            } finally {
            }
        } catch (Exception e10) {
            AFLogger.INSTANCE.e(LogTag.CACHE, "Error while loading request from cache", e10, false, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    @NotNull
    public final List<AFc1sSDK> AFKeystoreWrapper() {
        int i10;
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, "Get Cached Requests", false, 4, null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            Context context = this.registerClient.f5343d;
            Intrinsics.checkNotNull(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.registerClient.f5343d;
                Intrinsics.checkNotNull(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            }
            Iterator<T> it = this.AFKeystoreWrapper.f5300d.iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String str = ((AFc1pSDK) it.next()).f5299d;
                Context context3 = this.registerClient.f5343d;
                Intrinsics.checkNotNull(context3);
                File file = new File(new File(context3.getFilesDir(), "AFRequestCache"), str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    listFiles = new File[0];
                }
                kotlin.collections.u.A(arrayList2, listFiles);
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                File file2 = (File) obj;
                AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, "Found cached request: " + file2.getName(), false, 4, null);
                AFc1sSDK unregisterClient = unregisterClient(file2);
                if (unregisterClient != null) {
                    arrayList.add(unregisterClient);
                }
            }
        } catch (Exception e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Could not get cached requests", e10, false, false, false, false, 120, null);
        }
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, "Found " + arrayList.size() + " Cached Requests", false, 4, null);
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final boolean AFLogger(@Nullable String str) {
        if (str == null) {
            return false;
        }
        Context context = this.registerClient.f5343d;
        Intrinsics.checkNotNull(context);
        if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
            Context context2 = this.registerClient.f5343d;
            Intrinsics.checkNotNull(context2);
            new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            return true;
        }
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, "Deleting " + str + " from cache", false, 4, null);
        Iterator<T> it = this.AFKeystoreWrapper.f5300d.iterator();
        while (it.hasNext()) {
            String str2 = ((AFc1pSDK) it.next()).f5299d;
            Context context3 = this.registerClient.f5343d;
            Intrinsics.checkNotNull(context3);
            File file = new File(new File(new File(context3.getFilesDir(), "AFRequestCache"), str2), str);
            if (file.exists()) {
                return registerClient(file);
            }
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void d() {
        try {
            if (this.f5304d.AFLogger("AF_CACHE_VERSION", -1) == 3) {
                Context context = this.registerClient.f5343d;
                Intrinsics.checkNotNull(context);
                if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                    Context context2 = this.registerClient.f5343d;
                    Intrinsics.checkNotNull(context2);
                    new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                }
            } else {
                this.f5304d.d("AF_CACHE_VERSION", 3);
                Context context3 = this.registerClient.f5343d;
                Intrinsics.checkNotNull(context3);
                if (new File(context3.getFilesDir(), "AFRequestCache").exists()) {
                    Context context4 = this.registerClient.f5343d;
                    Intrinsics.checkNotNull(context4);
                    tt.k.o(new File(context4.getFilesDir(), "AFRequestCache"));
                    Context context5 = this.registerClient.f5343d;
                    Intrinsics.checkNotNull(context5);
                    new File(context5.getFilesDir(), "AFRequestCache").mkdir();
                }
            }
            registerClient();
        } catch (Exception e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Could not init cache", e10, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void unregisterClient() {
        try {
            Context context = this.registerClient.f5343d;
            Intrinsics.checkNotNull(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.registerClient.f5343d;
                Intrinsics.checkNotNull(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                return;
            }
            Iterator<T> it = this.AFKeystoreWrapper.f5300d.iterator();
            while (it.hasNext()) {
                String str = ((AFc1pSDK) it.next()).f5299d;
                Context context3 = this.registerClient.f5343d;
                Intrinsics.checkNotNull(context3);
                File[] listFiles = new File(new File(context3.getFilesDir(), "AFRequestCache"), str).listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        LogTag logTag = LogTag.CACHE;
                        AFLoggerBase.i$default(aFLogger, logTag, "ClearCache : Found cached request " + file.getName(), false, 4, null);
                        AFLoggerBase.i$default(aFLogger, logTag, "Deleting " + file.getName() + " from cache", false, 4, null);
                        file.delete();
                    }
                }
            }
            Context context4 = this.registerClient.f5343d;
            Intrinsics.checkNotNull(context4);
            tt.k.o(new File(context4.getFilesDir(), "AFRequestCache"));
            registerClient();
        } catch (Exception e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Could not clearCache request", e10, false, false, false, false, 120, null);
        }
    }

    private final boolean registerClient(File file) {
        try {
            file.delete();
            registerClient();
            return true;
        } catch (Exception e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Could not delete " + file.getName() + " from cache", e10, false, false, false, false, 120, null);
            return false;
        }
    }

    private final AFc1pSDK registerClient(AFe1zSDK aFe1zSDK) {
        Object obj;
        Iterator<T> it = this.AFKeystoreWrapper.f5300d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AFc1pSDK) obj).unregisterClient.contains(aFe1zSDK)) {
                break;
            }
        }
        return (AFc1pSDK) obj;
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.appsflyer.internal.AFc1vSDK
    @Nullable
    public final String registerClient(@NotNull AFc1sSDK aFc1sSDK) {
        Exception exc;
        File file;
        AFLogger aFLogger;
        LogTag logTag;
        String valueOf;
        String str;
        List f02;
        List<File> H0;
        Intrinsics.checkNotNullParameter(aFc1sSDK, "");
        try {
            AFe1zSDK aFe1zSDK = aFc1sSDK.AFLogger;
            Intrinsics.checkNotNullExpressionValue(aFe1zSDK, "");
            Context context = this.registerClient.f5343d;
            Intrinsics.checkNotNull(context);
            File file2 = new File(new File(context.getFilesDir(), "AFRequestCache"), unregisterClient(aFe1zSDK));
            if (!file2.exists()) {
                file2.mkdirs();
            }
            aFLogger = AFLogger.INSTANCE;
            logTag = LogTag.CACHE;
            AFLoggerBase.i$default(aFLogger, logTag, "Caching request with URL: " + aFc1sSDK.unregisterClient, false, 4, null);
            valueOf = String.valueOf(System.currentTimeMillis());
            file = new File(file2, valueOf);
        } catch (Exception e10) {
            exc = e10;
            file = null;
        }
        try {
            file.createNewFile();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file.getPath(), true), Charset.defaultCharset());
            try {
                outputStreamWriter.write("version=");
                outputStreamWriter.write(aFc1sSDK.AFKeystoreWrapper);
                outputStreamWriter.write(10);
                outputStreamWriter.write("url=");
                outputStreamWriter.write(aFc1sSDK.unregisterClient);
                outputStreamWriter.write(10);
                outputStreamWriter.write("data=");
                outputStreamWriter.write(Base64.encodeToString(aFc1sSDK.f5301d, 2));
                outputStreamWriter.write(10);
                AFe1zSDK aFe1zSDK2 = aFc1sSDK.AFLogger;
                outputStreamWriter.write("type=");
                outputStreamWriter.write(aFe1zSDK2.unregisterClient());
                outputStreamWriter.write(10);
                Map<String, String> map = aFc1sSDK.f5302e;
                if (map != null && !map.isEmpty()) {
                    outputStreamWriter.write("headers=");
                    Map<String, String> map2 = aFc1sSDK.f5302e;
                    Intrinsics.d(map2, "");
                    String jSONObject = new JSONObject(map2).toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                    byte[] bytes = jSONObject.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    outputStreamWriter.write(Base64.encodeToString(bytes, 2));
                    outputStreamWriter.write(10);
                }
                outputStreamWriter.flush();
                Unit unit = Unit.f22894a;
                tt.c.a(outputStreamWriter, null);
                AFLoggerBase.i$default(aFLogger, logTag, "Cache request: done, cacheKey: " + valueOf, false, 4, null);
                AFe1zSDK aFe1zSDK3 = aFc1sSDK.AFLogger;
                Intrinsics.checkNotNullExpressionValue(aFe1zSDK3, "");
                AFc1pSDK registerClient = registerClient(aFe1zSDK3);
                Integer valueOf2 = registerClient != null ? Integer.valueOf(registerClient.AFKeystoreWrapper) : null;
                if (valueOf2 == null) {
                    return valueOf;
                }
                int intValue = valueOf2.intValue();
                Map<String, Integer> map3 = this.AFLogger;
                AFc1pSDK registerClient2 = registerClient(aFe1zSDK3);
                if (registerClient2 != null && (str = registerClient2.f5299d) != null) {
                    Integer num = map3.get(str);
                    int intValue2 = num != null ? num.intValue() : 0;
                    if (intValue2 >= intValue) {
                        int i10 = (intValue2 + 1) - intValue;
                        AFLoggerBase.i$default(aFLogger, logTag, "Cache overflown for type " + aFe1zSDK3 + ", removing " + i10 + " item(s)", false, 4, null);
                        Context context2 = this.registerClient.f5343d;
                        Intrinsics.checkNotNull(context2);
                        File file3 = new File(new File(context2.getFilesDir(), "AFRequestCache"), unregisterClient(aFe1zSDK3));
                        if (!file3.exists()) {
                            file3.mkdirs();
                        }
                        File[] listFiles = file3.listFiles();
                        if (listFiles != null && (f02 = kotlin.collections.m.f0(listFiles, new Comparator() { // from class: com.appsflyer.internal.AFc1uSDK.2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t8, T t10) {
                                return kt.a.a(((File) t8).getName(), ((File) t10).getName());
                            }
                        })) != null && (H0 = CollectionsKt.H0(f02, i10)) != null) {
                            for (File file4 : H0) {
                                file4.delete();
                                AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, "Cache entry " + file4.getName() + " removed", false, 4, null);
                            }
                        }
                    }
                    registerClient();
                    return valueOf;
                }
                throw new UnsupportedOperationException("Cache do not support this type of events");
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    tt.c.a(outputStreamWriter, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            exc = e11;
            if (file != null) {
                file.delete();
            }
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
            return null;
        }
    }

    private final String unregisterClient(AFe1zSDK aFe1zSDK) {
        String str;
        AFc1pSDK registerClient = registerClient(aFe1zSDK);
        if (registerClient == null || (str = registerClient.f5299d) == null) {
            throw new UnsupportedOperationException("Cache do not support this type of events");
        }
        return str;
    }
}
