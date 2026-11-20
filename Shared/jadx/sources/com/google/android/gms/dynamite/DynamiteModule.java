package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import n9.k;
import n9.m;

/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f5916h = null;

    /* renamed from: i, reason: collision with root package name */
    public static String f5917i = null;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f5918j = false;

    /* renamed from: k, reason: collision with root package name */
    public static int f5919k = -1;

    /* renamed from: l, reason: collision with root package name */
    public static Boolean f5920l;

    /* renamed from: r, reason: collision with root package name */
    public static z9.h f5926r;

    /* renamed from: s, reason: collision with root package name */
    public static z9.i f5927s;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5928a;

    /* renamed from: m, reason: collision with root package name */
    public static final ThreadLocal f5921m = new ThreadLocal();

    /* renamed from: n, reason: collision with root package name */
    public static final ThreadLocal f5922n = new z9.f();

    /* renamed from: o, reason: collision with root package name */
    public static final b.a f5923o = new com.google.android.gms.dynamite.b();

    @NonNull
    public static final b b = new c();

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public static final b f5911c = new d();

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public static final b f5912d = new e();

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public static final b f5913e = new f();

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public static final b f5914f = new g();

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public static final b f5915g = new h();

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public static final b f5924p = new i();

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public static final b f5925q = new com.google.android.gms.dynamite.a();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @NonNull
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        public /* synthetic */ a(String str, Throwable th2, byte[] bArr) {
            super(str, th2);
        }

        public /* synthetic */ a(String str, byte[] bArr) {
            super(str);
        }
    }

    public interface b {

        public interface a {
            int a(@NonNull Context context, @NonNull String str, boolean z10);

            int b(@NonNull Context context, @NonNull String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0121b {

            /* renamed from: a, reason: collision with root package name */
            public int f5929a = 0;
            public int b = 0;

            /* renamed from: c, reason: collision with root package name */
            public int f5930c = 0;
        }

        @NonNull
        C0121b a(@NonNull Context context, @NonNull String str, @NonNull a aVar);
    }

    public DynamiteModule(Context context) {
        m.l(context);
        this.f5928a = context;
    }

    public static int a(@NonNull Context context, @NonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (k.b(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb3.append("Module descriptor id '");
            sb3.append(valueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static int c(@NonNull Context context, @NonNull String str) {
        return f(context, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02d7 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02e6 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02dd A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.dynamite.DynamiteModule e(@androidx.annotation.NonNull android.content.Context r30, @androidx.annotation.NonNull com.google.android.gms.dynamite.DynamiteModule.b r31, @androidx.annotation.NonNull java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    public static int f(@NonNull Context context, @NonNull String str, boolean z10) {
        Field declaredField;
        Throwable th2;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f5916h;
                int i10 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
                        String obj = e10.toString();
                        StringBuilder sb2 = new StringBuilder(obj.length() + 30);
                        sb2.append("Failed to load module via V2: ");
                        sb2.append(obj);
                        Log.w("DynamiteModule", sb2.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                k(classLoader);
                            } catch (a unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!g(context)) {
                                return 0;
                            }
                            if (!f5918j) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int h10 = h(context, str, z10, true);
                                        String str2 = f5917i;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader a10 = z9.d.a();
                                            if (a10 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    z9.b.a();
                                                    String str3 = f5917i;
                                                    m.l(str3);
                                                    a10 = z9.a.a(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f5917i;
                                                    m.l(str4);
                                                    a10 = new z9.e(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            k(a10);
                                            declaredField.set(null, a10);
                                            f5916h = bool2;
                                            return h10;
                                        }
                                        return h10;
                                    } catch (a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f5916h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return h(context, str, z10, false);
                    } catch (a e11) {
                        String message = e11.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb3.append("Failed to retrieve remote module version: ");
                        sb3.append(message);
                        Log.w("DynamiteModule", sb3.toString());
                        return 0;
                    }
                }
                z9.h l10 = l(context);
                if (l10 != null) {
                    try {
                        try {
                            int x22 = l10.x2();
                            if (x22 >= 3) {
                                z9.g gVar = (z9.g) f5921m.get();
                                if (gVar == null || (cursor = gVar.f37962a) == null) {
                                    Cursor cursor2 = (Cursor) y9.b.t2(l10.y2(y9.b.u2(context), str, z10, ((Long) f5922n.get()).longValue()));
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                int i11 = cursor2.getInt(0);
                                                r4 = (i11 <= 0 || !i(cursor2)) ? cursor2 : null;
                                                if (r4 != null) {
                                                    r4.close();
                                                }
                                                i10 = i11;
                                            }
                                        } catch (RemoteException e12) {
                                            remoteException = e12;
                                            r4 = cursor2;
                                            String message2 = remoteException.getMessage();
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + 42);
                                            sb4.append("Failed to retrieve remote module version: ");
                                            sb4.append(message2);
                                            Log.w("DynamiteModule", sb4.toString());
                                            if (r4 != null) {
                                                r4.close();
                                            }
                                            return i10;
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            r4 = cursor2;
                                            if (r4 == null) {
                                                throw th2;
                                            }
                                            r4.close();
                                            throw th2;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                } else {
                                    i10 = cursor.getInt(0);
                                }
                            } else if (x22 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i10 = l10.w2(y9.b.u2(context), str, z10);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i10 = l10.u2(y9.b.u2(context), str, z10);
                            }
                        } catch (RemoteException e13) {
                            remoteException = e13;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                return i10;
            }
        } catch (Throwable th5) {
            u9.g.a(context, th5);
            throw th5;
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f5920l)) {
            return true;
        }
        boolean z10 = false;
        if (f5920l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != u9.m.i() ? 0 : 268435456);
            if (j9.d.f().h(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            f5920l = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f5918j = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x014b, code lost:
    
        r8.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0147: MOVE (r2 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:114:0x0147 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0163 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:15:0x00ef, B:17:0x00f5, B:20:0x00fd, B:33:0x012a, B:40:0x0133, B:44:0x0139, B:45:0x0140, B:11:0x014f, B:12:0x015d, B:51:0x015f, B:53:0x0163, B:54:0x0185, B:55:0x0186), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0186 A[Catch: all -> 0x0141, TRY_LEAVE, TryCatch #0 {all -> 0x0141, blocks: (B:15:0x00ef, B:17:0x00f5, B:20:0x00fd, B:33:0x012a, B:40:0x0133, B:44:0x0139, B:45:0x0140, B:11:0x014f, B:12:0x015d, B:51:0x015f, B:53:0x0163, B:54:0x0185, B:55:0x0186), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int h(android.content.Context r14, java.lang.String r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.h(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static boolean i(Cursor cursor) {
        z9.g gVar = (z9.g) f5921m.get();
        if (gVar == null || gVar.f37962a != null) {
            return false;
        }
        gVar.f37962a = cursor;
        return true;
    }

    public static DynamiteModule j(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    public static void k(ClassLoader classLoader) {
        z9.i iVar;
        byte[] bArr = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                iVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                iVar = queryLocalInterface instanceof z9.i ? (z9.i) queryLocalInterface : new z9.i(iBinder);
            }
            f5927s = iVar;
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (InstantiationException e12) {
            e = e12;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (NoSuchMethodException e13) {
            e = e13;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (InvocationTargetException e14) {
            e = e14;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        }
    }

    public static z9.h l(Context context) {
        z9.h hVar;
        synchronized (DynamiteModule.class) {
            z9.h hVar2 = f5926r;
            if (hVar2 != null) {
                return hVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    hVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    hVar = queryLocalInterface instanceof z9.h ? (z9.h) queryLocalInterface : new z9.h(iBinder);
                }
                if (hVar != null) {
                    f5926r = hVar;
                    return hVar;
                }
            } catch (Exception e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                Log.e("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }

    @NonNull
    public Context b() {
        return this.f5928a;
    }

    @NonNull
    public IBinder d(@NonNull String str) {
        try {
            return (IBinder) this.f5928a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, null);
        }
    }
}
