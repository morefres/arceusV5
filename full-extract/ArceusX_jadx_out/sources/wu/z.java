package wu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wu.h0;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010 J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0016H\u0016¢\u0006\u0004\b(\u0010$J\u001f\u0010)\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010'J\u000f\u0010*\u001a\u00020\"H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\u00020/*\u00020\u0006H\u0002¢\u0006\u0004\b0\u00101J'\u00103\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0016H\u0002¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00105¨\u00066"}, d2 = {"Lwu/z;", "Lwu/a0;", "Ljava/nio/file/FileSystem;", "nioFileSystem", "<init>", "(Ljava/nio/file/FileSystem;)V", "Lwu/h0;", "path", "canonicalize", "(Lwu/h0;)Lwu/h0;", "Lwu/k;", "metadataOrNull", "(Lwu/h0;)Lwu/k;", "dir", "", "list", "(Lwu/h0;)Ljava/util/List;", "listOrNull", "file", "Lwu/j;", "openReadOnly", "(Lwu/h0;)Lwu/j;", "", "mustCreate", "mustExist", "openReadWrite", "(Lwu/h0;ZZ)Lwu/j;", "Lwu/r0;", Payload.SOURCE, "(Lwu/h0;)Lwu/r0;", "Lwu/p0;", "sink", "(Lwu/h0;Z)Lwu/p0;", "appendingSink", "", "createDirectory", "(Lwu/h0;Z)V", "target", "atomicMove", "(Lwu/h0;Lwu/h0;)V", "delete", "createSymlink", "close", "()V", "", "toString", "()Ljava/lang/String;", "Ljava/nio/file/Path;", "f", "(Lwu/h0;)Ljava/nio/file/Path;", "throwOnFailure", ve.a.f33391e, "(Lwu/h0;Z)Ljava/util/List;", "Ljava/nio/file/FileSystem;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class z extends a0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FileSystem nioFileSystem;

    public z(@NotNull FileSystem nioFileSystem) {
        Intrinsics.checkNotNullParameter(nioFileSystem, "nioFileSystem");
        this.nioFileSystem = nioFileSystem;
    }

    public final List<h0> a(h0 dir, boolean throwOnFailure) {
        Path f10 = f(dir);
        try {
            List b = vt.c.b(f10, null, 1, null);
            ArrayList arrayList = new ArrayList();
            Iterator it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(h0.Companion.f(h0.INSTANCE, (Path) it.next(), false, 1, null));
            }
            kotlin.collections.t.x(arrayList);
            return arrayList;
        } catch (Exception unused) {
            if (!throwOnFailure) {
                return null;
            }
            if (Files.exists(f10, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException("failed to list " + dir);
            }
            throw new FileNotFoundException("no such file: " + dir);
        }
    }

    @Override // wu.x, wu.l
    @NotNull
    public p0 appendingSink(@NotNull h0 file, boolean mustExist) {
        Intrinsics.checkNotNullParameter(file, "file");
        List c10 = kotlin.collections.o.c();
        c10.add(StandardOpenOption.APPEND);
        if (!mustExist) {
            c10.add(StandardOpenOption.CREATE);
        }
        List a10 = kotlin.collections.o.a(c10);
        Path f10 = f(file);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) a10.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        OutputStream newOutputStream = Files.newOutputStream(f10, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(newOutputStream, "newOutputStream(...)");
        return b0.f(newOutputStream);
    }

    @Override // wu.a0, wu.x, wu.l
    public void atomicMove(@NotNull h0 source, @NotNull h0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        try {
            Intrinsics.checkNotNullExpressionValue(Files.move(f(source), f(target), (CopyOption[]) Arrays.copyOf(new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING}, 2)), "move(...)");
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // wu.x, wu.l
    @NotNull
    public h0 canonicalize(@NotNull h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            h0.Companion companion = h0.INSTANCE;
            Path realPath = f(path).toRealPath(new LinkOption[0]);
            Intrinsics.checkNotNullExpressionValue(realPath, "toRealPath(...)");
            return h0.Companion.f(companion, realPath, false, 1, null);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // wu.l, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.nioFileSystem.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.getIsDirectory() == true) goto L8;
     */
    @Override // wu.x, wu.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void createDirectory(@org.jetbrains.annotations.NotNull wu.h0 r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            wu.k r0 = r3.metadataOrNull(r4)
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r0.getIsDirectory()
            r2 = 1
            if (r0 != r2) goto L14
            goto L15
        L14:
            r2 = r1
        L15:
            if (r2 == 0) goto L31
            if (r5 != 0) goto L1a
            goto L31
        L1a:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = " already exists."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L31:
            java.nio.file.Path r5 = r3.f(r4)     // Catch: java.io.IOException -> L47
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r1]     // Catch: java.io.IOException -> L47
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.io.IOException -> L47
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0     // Catch: java.io.IOException -> L47
            java.nio.file.Path r5 = java.nio.file.Files.createDirectory(r5, r0)     // Catch: java.io.IOException -> L47
            java.lang.String r0 = "createDirectory(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch: java.io.IOException -> L47
            return
        L47:
            r5 = move-exception
            if (r2 == 0) goto L4b
            return
        L4b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "failed to create directory: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wu.z.createDirectory(wu.h0, boolean):void");
    }

    @Override // wu.a0, wu.x, wu.l
    public void createSymlink(@NotNull h0 source, @NotNull h0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullExpressionValue(Files.createSymbolicLink(f(source), f(target), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)), "createSymbolicLink(...)");
    }

    @Override // wu.x, wu.l
    public void delete(@NotNull h0 path, boolean mustExist) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        Path f10 = f(path);
        try {
            Files.delete(f10);
        } catch (NoSuchFileException unused) {
            if (mustExist) {
                throw new FileNotFoundException("no such file: " + path);
            }
        } catch (IOException unused2) {
            if (Files.exists(f10, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException("failed to delete " + path);
            }
        }
    }

    public final Path f(h0 h0Var) {
        Path path = this.nioFileSystem.getPath(h0Var.toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return path;
    }

    @Override // wu.x, wu.l
    @NotNull
    public List<h0> list(@NotNull h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<h0> a10 = a(dir, true);
        Intrinsics.checkNotNull(a10);
        return a10;
    }

    @Override // wu.x, wu.l
    @Nullable
    public List<h0> listOrNull(@NotNull h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return a(dir, false);
    }

    @Override // wu.a0, wu.x, wu.l
    @Nullable
    public k metadataOrNull(@NotNull h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return d(f(path));
    }

    @Override // wu.x, wu.l
    @NotNull
    public j openReadOnly(@NotNull h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            FileChannel open = FileChannel.open(f(file), StandardOpenOption.READ);
            Intrinsics.checkNotNull(open);
            return new y(false, open);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // wu.x, wu.l
    @NotNull
    public j openReadWrite(@NotNull h0 file, boolean mustCreate, boolean mustExist) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (mustCreate && mustExist) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        List c10 = kotlin.collections.o.c();
        c10.add(StandardOpenOption.READ);
        c10.add(StandardOpenOption.WRITE);
        if (mustCreate) {
            c10.add(StandardOpenOption.CREATE_NEW);
        } else if (!mustExist) {
            c10.add(StandardOpenOption.CREATE);
        }
        List a10 = kotlin.collections.o.a(c10);
        try {
            Path f10 = f(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) a10.toArray(new StandardOpenOption[0]);
            FileChannel open = FileChannel.open(f10, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            Intrinsics.checkNotNull(open);
            return new y(true, open);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // wu.x, wu.l
    @NotNull
    public p0 sink(@NotNull h0 file, boolean mustCreate) {
        Intrinsics.checkNotNullParameter(file, "file");
        List c10 = kotlin.collections.o.c();
        if (mustCreate) {
            c10.add(StandardOpenOption.CREATE_NEW);
        }
        List a10 = kotlin.collections.o.a(c10);
        try {
            Path f10 = f(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) a10.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            OutputStream newOutputStream = Files.newOutputStream(f10, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            Intrinsics.checkNotNullExpressionValue(newOutputStream, "newOutputStream(...)");
            return b0.f(newOutputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // wu.x, wu.l
    @NotNull
    public r0 source(@NotNull h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            InputStream newInputStream = Files.newInputStream(f(file), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            Intrinsics.checkNotNullExpressionValue(newInputStream, "newInputStream(...)");
            return b0.j(newInputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // wu.a0, wu.x
    @NotNull
    public String toString() {
        String g10 = kotlin.jvm.internal.d0.b(this.nioFileSystem.getClass()).g();
        Intrinsics.checkNotNull(g10);
        return g10;
    }
}
