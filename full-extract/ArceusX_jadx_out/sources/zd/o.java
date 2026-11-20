package zd;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public final class o {
    public static final Pattern b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: a, reason: collision with root package name */
    public final f f38005a;

    public o(f fVar) {
        this.f38005a = fVar;
    }

    public static /* bridge */ /* synthetic */ Set a(o oVar, Set set, u uVar, ZipFile zipFile) {
        HashSet hashSet = new HashSet();
        oVar.f(uVar, set, new k(oVar, hashSet, uVar, zipFile));
        return hashSet;
    }

    public static void e(u uVar, l lVar) {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(uVar.a());
        } catch (IOException e10) {
            e = e10;
            zipFile = null;
        }
        try {
            String b10 = uVar.b();
            HashMap hashMap = new HashMap();
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                Matcher matcher = b.matcher(nextElement.getName());
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    Log.d("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", b10, group2, group));
                    Set set = (Set) hashMap.get(group);
                    if (set == null) {
                        set = new HashSet();
                        hashMap.put(group, set);
                    }
                    set.add(new n(nextElement, group2));
                }
            }
            HashMap hashMap2 = new HashMap();
            for (String str : Build.SUPPORTED_ABIS) {
                if (hashMap.containsKey(str)) {
                    Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", str));
                    for (n nVar : (Set) hashMap.get(str)) {
                        if (hashMap2.containsKey(nVar.f38004a)) {
                            Log.d("SplitCompat", String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", nVar.f38004a, str));
                        } else {
                            hashMap2.put(nVar.f38004a, nVar);
                            Log.d("SplitCompat", String.format("NativeLibraryExtractor: using library %s for ABI %s", nVar.f38004a, str));
                        }
                    }
                } else {
                    Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", str));
                }
            }
            lVar.a(zipFile, new HashSet(hashMap2.values()));
            zipFile.close();
        } catch (IOException e11) {
            e = e11;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e12) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e12);
                }
            }
            throw e;
        }
    }

    public final Set b(u uVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        e(uVar, new i(this, uVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }

    public final Set c() {
        Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
        Set<u> j10 = this.f38005a.j();
        for (String str : this.f38005a.h()) {
            Iterator it = j10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str));
                    this.f38005a.n(str);
                    break;
                }
                if (((u) it.next()).b().equals(str)) {
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (u uVar : j10) {
            HashSet hashSet2 = new HashSet();
            e(uVar, new j(this, hashSet2, uVar));
            for (File file : this.f38005a.i(uVar.b())) {
                if (!hashSet2.contains(file)) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file.getAbsolutePath(), uVar.b(), uVar.a().getAbsolutePath()));
                    this.f38005a.o(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    public final void f(u uVar, Set set, m mVar) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            File c10 = this.f38005a.c(uVar.b(), nVar.f38004a);
            boolean z10 = false;
            if (c10.exists() && c10.length() == nVar.b.getSize() && f.p(c10)) {
                z10 = true;
            }
            mVar.a(nVar, c10, z10);
        }
    }
}
