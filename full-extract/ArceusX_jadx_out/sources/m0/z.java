package m0;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import g0.f1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class z {
    public static Uri a(File file, File file2) {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new g0.h1(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    public static Uri b(File file, f1.h hVar) {
        Uri insert;
        ContentResolver a10 = hVar.a();
        Objects.requireNonNull(a10);
        ContentValues contentValues = hVar.b() != null ? new ContentValues(hVar.b()) : new ContentValues();
        k(contentValues, 1);
        Uri uri = null;
        try {
            try {
                insert = a10.insert(hVar.f(), contentValues);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e10) {
            e = e10;
        } catch (SecurityException e11) {
            e = e11;
        }
        try {
            if (insert == null) {
                throw new g0.h1(1, "Failed to insert a MediaStore URI.", null);
            }
            d(file, insert, a10);
            m(insert, a10, 0);
            return insert;
        } catch (IOException e12) {
            e = e12;
            uri = insert;
            throw new g0.h1(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (SecurityException e13) {
            e = e13;
            uri = insert;
            throw new g0.h1(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (Throwable th3) {
            th = th3;
            uri = insert;
            if (uri != null) {
                m(uri, a10, 0);
            }
            throw th;
        }
    }

    public static void c(File file, OutputStream outputStream) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void d(File file, Uri uri, ContentResolver contentResolver) {
        OutputStream openOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (openOutputStream != null) {
                c(file, openOutputStream);
                openOutputStream.close();
            } else {
                throw new FileNotFoundException(uri + " cannot be resolved.");
            }
        } catch (Throwable th2) {
            if (openOutputStream != null) {
                try {
                    openOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static File e(f1.h hVar) {
        try {
            File c10 = hVar.c();
            if (c10 == null) {
                return File.createTempFile("CameraX", ".tmp");
            }
            return new File(c10.getParent(), "CameraX" + UUID.randomUUID().toString() + f(c10));
        } catch (IOException e10) {
            throw new g0.h1(1, "Failed to create temp file.", e10);
        }
    }

    public static String f(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf >= 0 ? name.substring(lastIndexOf) : "";
    }

    public static boolean g(f1.h hVar) {
        return hVar.c() != null;
    }

    public static boolean h(f1.h hVar) {
        return (hVar.f() == null || hVar.a() == null || hVar.b() == null) ? false : true;
    }

    public static boolean i(f1.h hVar) {
        return hVar.e() != null;
    }

    public static Uri j(File file, f1.h hVar) {
        Uri uri = null;
        try {
            try {
                if (h(hVar)) {
                    uri = b(file, hVar);
                } else if (i(hVar)) {
                    OutputStream e10 = hVar.e();
                    Objects.requireNonNull(e10);
                    c(file, e10);
                } else if (g(hVar)) {
                    File c10 = hVar.c();
                    Objects.requireNonNull(c10);
                    uri = a(file, c10);
                }
                file.delete();
                return uri;
            } catch (IOException unused) {
                throw new g0.h1(1, "Failed to write to OutputStream.", null);
            }
        } catch (Throwable th2) {
            file.delete();
            throw th2;
        }
    }

    public static void k(ContentValues contentValues, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i10));
        }
    }

    public static void l(File file, p0.g gVar, f1.h hVar, int i10) {
        try {
            p0.g h10 = p0.g.h(file);
            gVar.g(h10);
            if (h10.s() == 0 && i10 != 0) {
                h10.z(i10);
            }
            f1.e d10 = hVar.d();
            if (d10.b()) {
                h10.l();
            }
            if (d10.c()) {
                h10.m();
            }
            if (d10.a() != null) {
                h10.b(d10.a());
            }
            h10.A();
        } catch (IOException e10) {
            throw new g0.h1(1, "Failed to update Exif data", e10);
        }
    }

    public static void m(Uri uri, ContentResolver contentResolver, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            k(contentValues, i10);
            contentResolver.update(uri, contentValues, null, null);
        }
    }
}
