package ke;

import he.n;
import ie.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final je.a<File> f22616a = new a();

    public class a implements je.a<File> {
    }

    public static final class b extends ke.b {

        /* renamed from: a, reason: collision with root package name */
        public final File f22617a;
        public final w<g> b;

        public /* synthetic */ b(File file, g[] gVarArr, h hVar) {
            this(file, gVarArr);
        }

        @Override // ke.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public FileOutputStream a() {
            return new FileOutputStream(this.f22617a, this.b.contains(g.APPEND));
        }

        public String toString() {
            String valueOf = String.valueOf(this.f22617a);
            String valueOf2 = String.valueOf(this.b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 20 + valueOf2.length());
            sb2.append("Files.asByteSink(");
            sb2.append(valueOf);
            sb2.append(", ");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }

        public b(File file, g... gVarArr) {
            this.f22617a = (File) n.l(file);
            this.b = w.l(gVarArr);
        }
    }

    public static final class c extends ke.c {

        /* renamed from: a, reason: collision with root package name */
        public final File f22618a;

        public /* synthetic */ c(File file, h hVar) {
            this(file);
        }

        @Override // ke.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public FileInputStream b() {
            return new FileInputStream(this.f22618a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f22618a);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
            sb2.append("Files.asByteSource(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }

        public c(File file) {
            this.f22618a = (File) n.l(file);
        }
    }

    public static ke.b a(File file, g... gVarArr) {
        return new b(file, gVarArr, null);
    }

    public static ke.c b(File file) {
        return new c(file, null);
    }

    public static void c(File file, File file2) {
        n.i(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        b(file).a(a(file2, new g[0]));
    }

    public static void d(File file) {
        n.l(file);
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        String valueOf = String.valueOf(file);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 39);
        sb2.append("Unable to create parent directories of ");
        sb2.append(valueOf);
        throw new IOException(sb2.toString());
    }

    public static void e(File file, File file2) {
        n.l(file);
        n.l(file2);
        n.i(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        c(file, file2);
        if (file.delete()) {
            return;
        }
        if (file2.delete()) {
            String valueOf = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 17);
            sb2.append("Unable to delete ");
            sb2.append(valueOf);
            throw new IOException(sb2.toString());
        }
        String valueOf2 = String.valueOf(file2);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 17);
        sb3.append("Unable to delete ");
        sb3.append(valueOf2);
        throw new IOException(sb3.toString());
    }

    public static void f(byte[] bArr, File file) {
        a(file, new g[0]).b(bArr);
    }
}
