package f7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.google.mlkit.common.sdkinternal.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes3.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, s0<i>> f17011a = new HashMap();
    public static final Set<t0> b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f17012c = {80, 75, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f17013d = {31, -117, 8};

    public static s0<i> A(final Context context, final String str, final String str2) {
        return h(str2, new Callable() { // from class: f7.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.b(context, str, str2);
            }
        }, null);
    }

    public static p0<i> B(Context context, ZipInputStream zipInputStream, String str) {
        return C(context, zipInputStream, str, true);
    }

    public static p0<i> C(Context context, ZipInputStream zipInputStream, String str, boolean z10) {
        try {
            return D(context, zipInputStream, str);
        } finally {
            if (z10) {
                s7.m.c(zipInputStream);
            }
        }
    }

    public static p0<i> D(Context context, ZipInputStream zipInputStream, String str) {
        i a10;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            a10 = null;
        } else {
            try {
                a10 = l7.g.b().a(str);
            } catch (IOException e10) {
                return new p0<>((Throwable) e10);
            }
        }
        if (a10 != null) {
            return new p0<>(a10);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        i iVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase(Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME)) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                iVar = t(r7.c.n(wu.b0.c(wu.b0.j(zipInputStream))), null, false).b();
            } else {
                if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
                    String[] split = name.split("/");
                    String str2 = split[split.length - 1];
                    String str3 = str2.split("\\.")[0];
                    if (context == null) {
                        return new p0<>((Throwable) new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                    }
                    File file = new File(context.getCacheDir(), str2);
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            fileOutputStream2 = new FileOutputStream(file);
                        } finally {
                        }
                    } catch (Throwable th2) {
                        s7.e.d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th2);
                    }
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        }
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        fileOutputStream.close();
                        Typeface createFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            s7.e.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                        }
                        hashMap2.put(str3, createFromFile);
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream2.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                String[] split2 = name.split("/");
                hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (iVar == null) {
            return new p0<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            k0 i10 = i(iVar, (String) entry.getKey());
            if (i10 != null) {
                i10.g(s7.m.m((Bitmap) entry.getValue(), i10.f(), i10.d()));
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z10 = false;
            for (l7.c cVar : iVar.g().values()) {
                if (cVar.a().equals(entry2.getKey())) {
                    cVar.e((Typeface) entry2.getValue());
                    z10 = true;
                }
            }
            if (!z10) {
                s7.e.c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            Iterator<Map.Entry<String, k0>> it = iVar.j().entrySet().iterator();
            while (it.hasNext()) {
                k0 value = it.next().getValue();
                if (value == null) {
                    return null;
                }
                String c10 = value.c();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (c10.startsWith("data:") && c10.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(c10.substring(c10.indexOf(44) + 1), 0);
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                        if (decodeByteArray != null) {
                            value.g(s7.m.m(decodeByteArray, value.f(), value.d()));
                        }
                    } catch (IllegalArgumentException e11) {
                        s7.e.d("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            l7.g.b().c(str, iVar);
        }
        return new p0<>(iVar);
    }

    public static Boolean E(wu.g gVar) {
        return H(gVar, f17013d);
    }

    public static boolean F(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static Boolean G(wu.g gVar) {
        return H(gVar, f17012c);
    }

    public static Boolean H(wu.g gVar, byte[] bArr) {
        try {
            wu.g peek = gVar.peek();
            for (byte b10 : bArr) {
                if (peek.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e10) {
            s7.e.b("Failed to check zip file header", e10);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static void I(boolean z10) {
        ArrayList arrayList = new ArrayList(b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((t0) arrayList.get(i10)).a(z10);
        }
    }

    public static String J(Context context, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(F(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    public static /* synthetic */ void a(String str, AtomicBoolean atomicBoolean, Throwable th2) {
        Map<String, s0<i>> map = f17011a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            I(true);
        }
    }

    public static /* synthetic */ p0 b(Context context, String str, String str2) {
        p0<i> c10 = e.j(context).c(context, str, str2);
        if (str2 != null && c10.b() != null) {
            l7.g.b().c(str2, c10.b());
        }
        return c10;
    }

    public static /* synthetic */ p0 c(WeakReference weakReference, Context context, int i10, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return y(context, i10, str);
    }

    public static /* synthetic */ void g(String str, AtomicBoolean atomicBoolean, i iVar) {
        Map<String, s0<i>> map = f17011a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            I(true);
        }
    }

    public static s0<i> h(final String str, Callable<p0<i>> callable, Runnable runnable) {
        i a10 = str == null ? null : l7.g.b().a(str);
        s0<i> s0Var = a10 != null ? new s0<>(a10) : null;
        if (str != null) {
            Map<String, s0<i>> map = f17011a;
            if (map.containsKey(str)) {
                s0Var = map.get(str);
            }
        }
        if (s0Var != null) {
            if (runnable != null) {
                runnable.run();
            }
            return s0Var;
        }
        s0<i> s0Var2 = new s0<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            s0Var2.d(new l0() { // from class: f7.n
                @Override // f7.l0
                public final void onResult(Object obj) {
                    q.g(str, atomicBoolean, (i) obj);
                }
            });
            s0Var2.c(new l0() { // from class: f7.o
                @Override // f7.l0
                public final void onResult(Object obj) {
                    q.a(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, s0<i>> map2 = f17011a;
                map2.put(str, s0Var2);
                if (map2.size() == 1) {
                    I(false);
                }
            }
        }
        return s0Var2;
    }

    public static k0 i(i iVar, String str) {
        for (k0 k0Var : iVar.j().values()) {
            if (k0Var.c().equals(str)) {
                return k0Var;
            }
        }
        return null;
    }

    public static s0<i> j(Context context, String str) {
        return k(context, str, "asset_" + str);
    }

    public static s0<i> k(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return h(str2, new Callable() { // from class: f7.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                p0 m10;
                m10 = q.m(applicationContext, str, str2);
                return m10;
            }
        }, null);
    }

    public static p0<i> l(Context context, String str) {
        return m(context, str, "asset_" + str);
    }

    public static p0<i> m(Context context, String str, String str2) {
        i a10 = str2 == null ? null : l7.g.b().a(str2);
        if (a10 != null) {
            return new p0<>(a10);
        }
        try {
            return n(context, context.getAssets().open(str), str2);
        } catch (IOException e10) {
            return new p0<>((Throwable) e10);
        }
    }

    public static p0<i> n(Context context, InputStream inputStream, String str) {
        i a10 = str == null ? null : l7.g.b().a(str);
        if (a10 != null) {
            return new p0<>(a10);
        }
        try {
            wu.g c10 = wu.b0.c(wu.b0.j(inputStream));
            return G(c10).booleanValue() ? B(context, new ZipInputStream(c10.s3()), str) : E(c10).booleanValue() ? p(new GZIPInputStream(c10.s3()), str) : r(r7.c.n(c10), str);
        } catch (IOException e10) {
            return new p0<>((Throwable) e10);
        }
    }

    public static s0<i> o(final InputStream inputStream, final String str) {
        return h(str, new Callable() { // from class: f7.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                p0 p8;
                p8 = q.p(inputStream, str);
                return p8;
            }
        }, new Runnable() { // from class: f7.l
            @Override // java.lang.Runnable
            public final void run() {
                s7.m.c(inputStream);
            }
        });
    }

    public static p0<i> p(InputStream inputStream, String str) {
        return q(inputStream, str, true);
    }

    public static p0<i> q(InputStream inputStream, String str, boolean z10) {
        return u(wu.b0.j(inputStream), str, z10);
    }

    public static p0<i> r(r7.c cVar, String str) {
        return s(cVar, str, true);
    }

    public static p0<i> s(r7.c cVar, String str, boolean z10) {
        return t(cVar, str, z10);
    }

    public static p0<i> t(r7.c cVar, String str, boolean z10) {
        i a10;
        try {
            if (str == null) {
                a10 = null;
            } else {
                try {
                    a10 = l7.g.b().a(str);
                } catch (Exception e10) {
                    p0<i> p0Var = new p0<>(e10);
                    if (z10) {
                        s7.m.c(cVar);
                    }
                    return p0Var;
                }
            }
            if (a10 != null) {
                p0<i> p0Var2 = new p0<>(a10);
                if (z10) {
                    s7.m.c(cVar);
                }
                return p0Var2;
            }
            i a11 = q7.w.a(cVar);
            if (str != null) {
                l7.g.b().c(str, a11);
            }
            p0<i> p0Var3 = new p0<>(a11);
            if (z10) {
                s7.m.c(cVar);
            }
            return p0Var3;
        } catch (Throwable th2) {
            if (z10) {
                s7.m.c(cVar);
            }
            throw th2;
        }
    }

    public static p0<i> u(wu.r0 r0Var, String str, boolean z10) {
        return t(r7.c.n(wu.b0.c(r0Var)), str, z10);
    }

    public static s0<i> v(Context context, int i10) {
        return w(context, i10, J(context, i10));
    }

    public static s0<i> w(Context context, final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return h(str, new Callable() { // from class: f7.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.c(weakReference, applicationContext, i10, str);
            }
        }, null);
    }

    public static p0<i> x(Context context, int i10) {
        return y(context, i10, J(context, i10));
    }

    public static p0<i> y(Context context, int i10, String str) {
        i a10 = str == null ? null : l7.g.b().a(str);
        if (a10 != null) {
            return new p0<>(a10);
        }
        try {
            wu.g c10 = wu.b0.c(wu.b0.j(context.getResources().openRawResource(i10)));
            if (G(c10).booleanValue()) {
                return B(context, new ZipInputStream(c10.s3()), str);
            }
            if (!E(c10).booleanValue()) {
                return r(r7.c.n(c10), str);
            }
            try {
                return p(new GZIPInputStream(c10.s3()), str);
            } catch (IOException e10) {
                return new p0<>((Throwable) e10);
            }
        } catch (Resources.NotFoundException e11) {
            return new p0<>((Throwable) e11);
        }
    }

    public static s0<i> z(Context context, String str) {
        return A(context, str, "url_" + str);
    }
}
