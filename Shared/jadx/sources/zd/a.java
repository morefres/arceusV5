package zd;

import ae.a1;
import ae.c0;
import ae.r0;
import ae.u0;
import ae.v0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import be.d0;
import be.q1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReference f37987e = new AtomicReference(null);

    /* renamed from: a, reason: collision with root package name */
    public final f f37988a;
    public final c0 b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f37989c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final b f37990d;

    public a(Context context) {
        try {
            f fVar = new f(context);
            this.f37988a = fVar;
            this.f37990d = new b(fVar);
            this.b = new c0(context);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new d0("Failed to initialize FileStorage", e10);
        }
    }

    public static boolean a(@NonNull Context context) {
        return k(context, false);
    }

    public static boolean b(@NonNull Context context) {
        if (l()) {
            return false;
        }
        a aVar = (a) f37987e.get();
        if (aVar != null) {
            return aVar.f37990d.b(context, aVar.h());
        }
        if (context.getApplicationContext() != null) {
            a(context.getApplicationContext());
        }
        return a(context);
    }

    public static boolean f(Context context) {
        return k(context, true);
    }

    public static boolean g() {
        return f37987e.get() != null;
    }

    public static boolean k(Context context, boolean z10) {
        boolean z11;
        final Context context2;
        if (l()) {
            return false;
        }
        AtomicReference atomicReference = f37987e;
        a aVar = new a(context);
        while (true) {
            if (p1.t.a(atomicReference, null, aVar)) {
                z11 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z11 = false;
                break;
            }
        }
        a aVar2 = (a) f37987e.get();
        if (z11) {
            context2 = context;
            r0.INSTANCE.a(new be.l(context2, e.a(), new be.n(context, aVar2.f37988a, new be.i()), aVar2.f37988a, new t()));
            u0.b(new q(aVar2));
            e.a().execute(new Runnable() { // from class: zd.p
                @Override // java.lang.Runnable
                public final void run() {
                    Context context3 = context2;
                    AtomicReference atomicReference2 = a.f37987e;
                    try {
                        a1.h(context3).c(true);
                    } catch (SecurityException unused) {
                        Log.e("SplitCompat", "Failed to set broadcast receiver to always on.");
                    }
                }
            });
        } else {
            context2 = context;
        }
        try {
            aVar2.j(context2, z10);
            return true;
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error installing additional splits", e10);
            return false;
        }
    }

    public static boolean l() {
        return false;
    }

    public final Set h() {
        HashSet hashSet;
        synchronized (this.f37989c) {
            hashSet = new HashSet(this.f37989c);
        }
        return hashSet;
    }

    public final void i(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f.l(this.f37988a.g((String) it.next()));
        }
        this.b.b();
    }

    public final synchronized void j(Context context, boolean z10) {
        ZipFile zipFile;
        try {
            if (z10) {
                this.f37988a.k();
            } else {
                e.a().execute(new r(this));
            }
            String packageName = context.getPackageName();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                Set<u> j10 = this.f37988a.j();
                Set a10 = this.b.a();
                HashSet hashSet = new HashSet();
                Iterator it = j10.iterator();
                while (it.hasNext()) {
                    String b = ((u) it.next()).b();
                    if (arrayList.contains(b) || a10.contains(v0.b(b))) {
                        hashSet.add(b);
                        it.remove();
                    }
                }
                if (z10) {
                    i(hashSet);
                } else if (!hashSet.isEmpty()) {
                    e.a().execute(new s(this, hashSet));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = j10.iterator();
                while (it2.hasNext()) {
                    String b10 = ((u) it2.next()).b();
                    if (!v0.e(b10)) {
                        hashSet2.add(b10);
                    }
                }
                for (String str : arrayList) {
                    if (!v0.e(str)) {
                        hashSet2.add(str);
                    }
                }
                HashSet<u> hashSet3 = new HashSet(j10.size());
                for (u uVar : j10) {
                    String b11 = uVar.b();
                    q1 q1Var = v0.f467c;
                    if (b11.startsWith("config.") || hashSet2.contains(v0.b(uVar.b()))) {
                        hashSet3.add(uVar);
                    }
                }
                o oVar = new o(this.f37988a);
                be.o a11 = be.p.a();
                ClassLoader classLoader = context.getClassLoader();
                if (z10) {
                    a11.b(classLoader, oVar.c());
                } else {
                    Iterator it3 = hashSet3.iterator();
                    while (it3.hasNext()) {
                        Set b12 = oVar.b((u) it3.next());
                        if (b12 == null) {
                            it3.remove();
                        } else {
                            a11.b(classLoader, b12);
                        }
                    }
                }
                HashSet hashSet4 = new HashSet();
                for (u uVar2 : hashSet3) {
                    try {
                        zipFile = new ZipFile(uVar2.a());
                    } catch (IOException e10) {
                        e = e10;
                        zipFile = null;
                    }
                    try {
                        ZipEntry entry = zipFile.getEntry("classes.dex");
                        zipFile.close();
                        if (entry != null && !a11.a(classLoader, this.f37988a.a(uVar2.b()), uVar2.a(), z10)) {
                            Log.w("SplitCompat", "split was not installed ".concat(uVar2.a().toString()));
                        }
                        hashSet4.add(uVar2.a());
                    } catch (IOException e11) {
                        e = e11;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException e12) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e12);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        throw e;
                    }
                }
                this.f37990d.a(context, hashSet4);
                HashSet hashSet5 = new HashSet();
                for (u uVar3 : hashSet3) {
                    if (hashSet4.contains(uVar3.a())) {
                        Log.d("SplitCompat", "Split '" + uVar3.b() + "' installation emulated");
                        hashSet5.add(uVar3.b());
                    } else {
                        Log.d("SplitCompat", "Split '" + uVar3.b() + "' installation not emulated.");
                    }
                }
                synchronized (this.f37989c) {
                    this.f37989c.addAll(hashSet5);
                }
            } catch (PackageManager.NameNotFoundException e13) {
                throw new IOException(String.format("Cannot load data for application '%s'", packageName), e13);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
