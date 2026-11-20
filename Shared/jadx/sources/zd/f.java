package zd;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f37994a;
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public File f37995c;

    public f(Context context) {
        this.b = context;
        this.f37994a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public static void l(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                l(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", file.getAbsolutePath()));
        }
    }

    public static void m(File file) {
        file.setWritable(false, true);
        file.setWritable(false, false);
    }

    public static boolean p(File file) {
        return !file.canWrite();
    }

    public static File q(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    public static File u(File file) {
        if (!file.exists()) {
            file.mkdirs();
            if (!file.isDirectory()) {
                throw new IOException("Unable to create directory: ".concat(String.valueOf(file.getAbsolutePath())));
            }
        } else if (!file.isDirectory()) {
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
        return file;
    }

    public static String x(String str) {
        return String.valueOf(str).concat(".apk");
    }

    public final File a(String str) {
        File file = new File(w(), "dex");
        u(file);
        File q10 = q(file, str);
        u(q10);
        return q10;
    }

    public final File b() {
        File file = new File(w(), "unverified-splits");
        u(file);
        return file;
    }

    public final File c(String str, String str2) {
        return q(s(str), str2);
    }

    public final File d() {
        return new File(w(), "lock.tmp");
    }

    public final File e(String str) {
        return q(b(), x(str));
    }

    public final File f(File file) {
        return q(t(), file.getName());
    }

    public final File g(String str) {
        return q(t(), x(str));
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = r().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    public final Set i(String str) {
        HashSet hashSet = new HashSet();
        File[] listFiles = s(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    public final Set j() {
        File t8 = t();
        HashSet hashSet = new HashSet();
        File[] listFiles = t8.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk") && p(file)) {
                    hashSet.add(new c(file, file.getName().substring(0, r5.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public final void k() {
        File v5 = v();
        String[] list = v5.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f37994a))) {
                    File file = new File(v5, str);
                    Log.d("SplitCompat", "FileStorage: removing directory for different version code (directory = " + file.toString() + ", current version code = " + this.f37994a + ")");
                    l(file);
                }
            }
        }
    }

    public final void n(String str) {
        l(s(str));
    }

    public final void o(File file) {
        if (!file.getParentFile().getParentFile().equals(r())) {
            throw new IllegalStateException("File to remove is not a native library");
        }
        l(file);
    }

    public final File r() {
        File file = new File(w(), "native-libraries");
        u(file);
        return file;
    }

    public final File s(String str) {
        File q10 = q(r(), str);
        u(q10);
        return q10;
    }

    public final File t() {
        File file = new File(w(), "verified-splits");
        u(file);
        return file;
    }

    public final File v() {
        if (this.f37995c == null) {
            Context context = this.b;
            if (context == null) {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
            this.f37995c = context.getFilesDir();
        }
        File file = new File(this.f37995c, "splitcompat");
        u(file);
        return file;
    }

    public final File w() {
        File file = new File(v(), Long.toString(this.f37994a));
        u(file);
        return file;
    }
}
