package b5;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u0015J\u001f\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010%R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010&R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u001a\u0010\u000e\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b#\u0010+R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lb5/l;", "Lg5/d;", "Lx4/d;", "Landroid/content/Context;", "context", "", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "", "databaseVersion", "delegate", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILg5/d;)V", "", "enabled", "", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "Lx4/c;", "databaseConfiguration", rl.d.f30696a, "(Lx4/c;)V", "writable", "e", "destinationFile", j6.b.f21518e, "(Ljava/io/File;Z)V", "databaseFile", "c", ve.a.f33391e, "Landroid/content/Context;", "Ljava/lang/String;", "Ljava/io/File;", "Ljava/util/concurrent/Callable;", "I", "f", "Lg5/d;", "()Lg5/d;", "g", "Lx4/c;", "h", "Z", "verified", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lg5/c;", "t2", "()Lg5/c;", "writableDatabase", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l implements g5.d, x4.d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String copyFromAssetPath;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final File copyFromFile;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Callable<InputStream> copyFromInputStream;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int databaseVersion;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g5.d delegate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public x4.c databaseConfiguration;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean verified;

    public l(@NotNull Context context, @Nullable String str, @Nullable File file, @Nullable Callable<InputStream> callable, int i10, @NotNull g5.d delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i10;
        this.delegate = delegate;
    }

    @Override // x4.d
    @NotNull
    /* renamed from: a, reason: from getter */
    public g5.d getDelegate() {
        return this.delegate;
    }

    public final void b(File destinationFile, boolean writable) {
        ReadableByteChannel newChannel;
        if (this.copyFromAssetPath != null) {
            newChannel = Channels.newChannel(this.context.getAssets().open(this.copyFromAssetPath));
            Intrinsics.checkNotNullExpressionValue(newChannel, "newChannel(...)");
        } else if (this.copyFromFile != null) {
            newChannel = new FileInputStream(this.copyFromFile).getChannel();
            Intrinsics.checkNotNullExpressionValue(newChannel, "getChannel(...)");
        } else {
            Callable<InputStream> callable = this.copyFromInputStream;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                newChannel = Channels.newChannel(callable.call());
                Intrinsics.checkNotNullExpressionValue(newChannel, "newChannel(...)");
            } catch (Exception e10) {
                throw new IOException("inputStreamCallable exception on call", e10);
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.context.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        Intrinsics.checkNotNull(channel);
        c5.d.a(newChannel, channel);
        File parentFile = destinationFile.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + destinationFile.getAbsolutePath());
        }
        Intrinsics.checkNotNull(createTempFile);
        c(createTempFile, writable);
        if (createTempFile.renameTo(destinationFile)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + destinationFile.getAbsolutePath() + ").");
    }

    public final void c(File databaseFile, boolean writable) {
        x4.c cVar = this.databaseConfiguration;
        if (cVar == null) {
            Intrinsics.u("databaseConfiguration");
            cVar = null;
        }
        cVar.getClass();
    }

    @Override // g5.d, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.verified = false;
    }

    public final void d(@NotNull x4.c databaseConfiguration) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "databaseConfiguration");
        this.databaseConfiguration = databaseConfiguration;
    }

    public final void e(boolean writable) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databasePath = this.context.getDatabasePath(databaseName);
        x4.c cVar = this.databaseConfiguration;
        x4.c cVar2 = null;
        if (cVar == null) {
            Intrinsics.u("databaseConfiguration");
            cVar = null;
        }
        j5.a aVar = new j5.a(databaseName, this.context.getFilesDir(), cVar.multiInstanceInvalidation);
        try {
            j5.a.c(aVar, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    Intrinsics.checkNotNull(databasePath);
                    b(databasePath, writable);
                    aVar.d();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                Intrinsics.checkNotNull(databasePath);
                int f10 = c5.a.f(databasePath);
                if (f10 == this.databaseVersion) {
                    aVar.d();
                    return;
                }
                x4.c cVar3 = this.databaseConfiguration;
                if (cVar3 == null) {
                    Intrinsics.u("databaseConfiguration");
                    cVar3 = null;
                }
                if (cVar3.migrationContainer.d(f10, this.databaseVersion) != null) {
                    aVar.d();
                    return;
                }
                x4.c cVar4 = this.databaseConfiguration;
                if (cVar4 == null) {
                    Intrinsics.u("databaseConfiguration");
                } else {
                    cVar2 = cVar4;
                }
                if (cVar2.f(f10, this.databaseVersion)) {
                    aVar.d();
                    return;
                }
                if (this.context.deleteDatabase(databaseName)) {
                    try {
                        b(databasePath, writable);
                        Unit unit = Unit.f22894a;
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar.d();
                return;
            } catch (IOException e12) {
                Log.w("ROOM", "Unable to read database version.", e12);
                aVar.d();
                return;
            }
        } catch (Throwable th2) {
            aVar.d();
            throw th2;
        }
        aVar.d();
        throw th2;
    }

    @Override // g5.d
    @Nullable
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // g5.d
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        getDelegate().setWriteAheadLoggingEnabled(enabled);
    }

    @Override // g5.d
    @NotNull
    public g5.c t2() {
        if (!this.verified) {
            e(true);
            this.verified = true;
        }
        return getDelegate().t2();
    }
}
