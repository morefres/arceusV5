package zd;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f38002a;
    public final /* synthetic */ u b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ZipFile f38003c;

    public k(o oVar, Set set, u uVar, ZipFile zipFile) {
        this.f38002a = set;
        this.b = uVar;
        this.f38003c = zipFile;
    }

    @Override // zd.m
    public final void a(n nVar, File file, boolean z10) {
        this.f38002a.add(file);
        if (z10) {
            return;
        }
        Log.i("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", this.b.b(), nVar.f38004a, this.b.a().getAbsolutePath(), nVar.b.getName(), file.getAbsolutePath()));
        ZipFile zipFile = this.f38003c;
        ZipEntry zipEntry = nVar.b;
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                f.m(file);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                }
            }
            throw th2;
        }
    }
}
