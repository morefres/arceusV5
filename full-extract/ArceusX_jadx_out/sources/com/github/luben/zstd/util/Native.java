package com.github.luben.zstd.util;

import java.io.File;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public enum Native {
    ;

    private static final String nativePathOverride = "ZstdNativePath";
    private static final String tempFolderOverride = "ZstdTempFolder";
    private static final String libnameShort = "zstd-jni-1.5.7-6";
    private static final String libname = "libzstd-jni-1.5.7-6";
    private static final String errorMsg = "Unsupported OS/arch, cannot find " + resourceName() + " or load " + libnameShort + " from system libraries. Please try building from source the jar or providing " + libname + " in your system.";
    private static AtomicBoolean loaded = new AtomicBoolean(false);

    public static synchronized void assumeLoaded() {
        synchronized (Native.class) {
            loaded.set(true);
        }
    }

    public static synchronized boolean isLoaded() {
        boolean z10;
        synchronized (Native.class) {
            z10 = loaded.get();
        }
        return z10;
    }

    private static String libExtension() {
        return (osName().contains("os_x") || osName().contains("darwin")) ? "dylib" : osName().contains("win") ? "dll" : "so";
    }

    public static synchronized void load() {
        synchronized (Native.class) {
            try {
                String property = System.getProperty(tempFolderOverride);
                if (property == null) {
                    load(null);
                } else {
                    load(new File(property));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void loadLibrary(final String str) {
        AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: com.github.luben.zstd.util.Native.1
            @Override // java.security.PrivilegedAction
            public Void run() {
                System.loadLibrary(str);
                return null;
            }
        });
    }

    private static void loadLibraryFile(final String str) {
        AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: com.github.luben.zstd.util.Native.2
            @Override // java.security.PrivilegedAction
            public Void run() {
                System.load(str);
                return null;
            }
        });
    }

    private static String osName() {
        String replace = System.getProperty("os.name").toLowerCase().replace(' ', '_');
        return replace.startsWith("win") ? "win" : replace.startsWith("mac") ? "darwin" : replace;
    }

    private static String resourceName() {
        String osName = osName();
        String property = System.getProperty("os.arch");
        if (osName.equals("darwin") && property.equals("amd64")) {
            property = "x86_64";
        }
        return "/" + osName + "/" + property + "/" + libname + "." + libExtension();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf A[Catch: all -> 0x0024, IOException -> 0x00db, TryCatch #2 {, blocks: (B:4:0x0003, B:9:0x000d, B:11:0x001a, B:19:0x0038, B:92:0x0040, B:41:0x00ca, B:43:0x00cf, B:44:0x00d2, B:46:0x00d8, B:71:0x0145, B:73:0x014a, B:75:0x014f, B:77:0x0155, B:79:0x0158, B:96:0x004d, B:97:0x0073, B:15:0x0027), top: B:3:0x0003, inners: #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8 A[Catch: all -> 0x0024, IOException -> 0x00db, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:9:0x000d, B:11:0x001a, B:19:0x0038, B:92:0x0040, B:41:0x00ca, B:43:0x00cf, B:44:0x00d2, B:46:0x00d8, B:71:0x0145, B:73:0x014a, B:75:0x014f, B:77:0x0155, B:79:0x0158, B:96:0x004d, B:97:0x0073, B:15:0x0027), top: B:3:0x0003, inners: #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014a A[Catch: all -> 0x0024, IOException -> 0x0158, TryCatch #1 {IOException -> 0x0158, blocks: (B:71:0x0145, B:73:0x014a, B:75:0x014f, B:77:0x0155), top: B:70:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014f A[Catch: all -> 0x0024, IOException -> 0x0158, TryCatch #1 {IOException -> 0x0158, blocks: (B:71:0x0145, B:73:0x014a, B:75:0x014f, B:77:0x0155), top: B:70:0x0145 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void load(java.io.File r9) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.luben.zstd.util.Native.load(java.io.File):void");
    }
}
