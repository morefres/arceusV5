package wu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wu.h0;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010!J\u001f\u0010$\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010%J\u001f\u0010*\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010(J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020#*\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020#*\u00020\u0004H\u0002¢\u0006\u0004\b0\u0010/¨\u00061"}, d2 = {"Lwu/x;", "Lwu/l;", "<init>", "()V", "Lwu/h0;", "dir", "", "throwOnFailure", "", ve.a.f33391e, "(Lwu/h0;Z)Ljava/util/List;", "path", "canonicalize", "(Lwu/h0;)Lwu/h0;", "Lwu/k;", "metadataOrNull", "(Lwu/h0;)Lwu/k;", "list", "(Lwu/h0;)Ljava/util/List;", "listOrNull", "file", "Lwu/j;", "openReadOnly", "(Lwu/h0;)Lwu/j;", "mustCreate", "mustExist", "openReadWrite", "(Lwu/h0;ZZ)Lwu/j;", "Lwu/r0;", Payload.SOURCE, "(Lwu/h0;)Lwu/r0;", "Lwu/p0;", "sink", "(Lwu/h0;Z)Lwu/p0;", "appendingSink", "", "createDirectory", "(Lwu/h0;Z)V", "target", "atomicMove", "(Lwu/h0;Lwu/h0;)V", "delete", "createSymlink", "", "toString", "()Ljava/lang/String;", "c", "(Lwu/h0;)V", j6.b.f21518e, "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class x extends l {
    private final List<h0> a(h0 dir, boolean throwOnFailure) {
        File file = dir.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                Intrinsics.checkNotNull(str);
                arrayList.add(dir.n(str));
            }
            kotlin.collections.t.x(arrayList);
            return arrayList;
        }
        if (!throwOnFailure) {
            return null;
        }
        if (file.exists()) {
            throw new IOException("failed to list " + dir);
        }
        throw new FileNotFoundException("no such file: " + dir);
    }

    @Override // wu.l
    @NotNull
    public p0 appendingSink(@NotNull h0 file, boolean mustExist) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (mustExist) {
            c(file);
        }
        return b0.e(file.toFile(), true);
    }

    @Override // wu.l
    public void atomicMove(@NotNull h0 source, @NotNull h0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    public final void b(h0 h0Var) {
        if (exists(h0Var)) {
            throw new IOException(h0Var + " already exists.");
        }
    }

    public final void c(h0 h0Var) {
        if (exists(h0Var)) {
            return;
        }
        throw new IOException(h0Var + " doesn't exist.");
    }

    @Override // wu.l
    @NotNull
    public h0 canonicalize(@NotNull h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File canonicalFile = path.toFile().getCanonicalFile();
        if (!canonicalFile.exists()) {
            throw new FileNotFoundException("no such file");
        }
        h0.Companion companion = h0.INSTANCE;
        Intrinsics.checkNotNull(canonicalFile);
        return h0.Companion.d(companion, canonicalFile, false, 1, null);
    }

    @Override // wu.l
    public void createDirectory(@NotNull h0 dir, boolean mustCreate) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        k metadataOrNull = metadataOrNull(dir);
        if (metadataOrNull == null || !metadataOrNull.getIsDirectory()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (mustCreate) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // wu.l
    public void createSymlink(@NotNull h0 source, @NotNull h0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("unsupported");
    }

    @Override // wu.l
    public void delete(@NotNull h0 path, boolean mustExist) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (mustExist) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // wu.l
    @NotNull
    public List<h0> list(@NotNull h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<h0> a10 = a(dir, true);
        Intrinsics.checkNotNull(a10);
        return a10;
    }

    @Override // wu.l
    @Nullable
    public List<h0> listOrNull(@NotNull h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return a(dir, false);
    }

    @Override // wu.l
    @Nullable
    public k metadataOrNull(@NotNull h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = path.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new k(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null, null, 128, null);
    }

    @Override // wu.l
    @NotNull
    public j openReadOnly(@NotNull h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new w(false, new RandomAccessFile(file.toFile(), "r"));
    }

    @Override // wu.l
    @NotNull
    public j openReadWrite(@NotNull h0 file, boolean mustCreate, boolean mustExist) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (mustCreate && mustExist) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        if (mustCreate) {
            b(file);
        }
        if (mustExist) {
            c(file);
        }
        return new w(true, new RandomAccessFile(file.toFile(), "rw"));
    }

    @Override // wu.l
    @NotNull
    public p0 sink(@NotNull h0 file, boolean mustCreate) {
        p0 c10;
        Intrinsics.checkNotNullParameter(file, "file");
        if (mustCreate) {
            b(file);
        }
        c10 = c0.c(file.toFile(), false, 1, null);
        return c10;
    }

    @Override // wu.l
    @NotNull
    public r0 source(@NotNull h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return b0.i(file.toFile());
    }

    @NotNull
    public String toString() {
        return "JvmSystemFileSystem";
    }
}
