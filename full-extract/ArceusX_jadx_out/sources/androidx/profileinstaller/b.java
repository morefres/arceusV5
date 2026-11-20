package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.core.view.MotionEventCompat;
import androidx.profileinstaller.c;
import backtraceio.library.services.BacktraceMetrics;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;
import u4.i;
import u4.j;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final AssetManager f2681a;

    @NonNull
    public final Executor b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final c.InterfaceC0048c f2682c;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final File f2684e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final String f2685f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final String f2686g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final String f2687h;

    /* renamed from: j, reason: collision with root package name */
    public u4.b[] f2689j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f2690k;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2688i = false;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2683d = d();

    public b(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull c.InterfaceC0048c interfaceC0048c, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull File file) {
        this.f2681a = assetManager;
        this.b = executor;
        this.f2682c = interfaceC0048c;
        this.f2685f = str;
        this.f2686g = str2;
        this.f2687h = str3;
        this.f2684e = file;
    }

    public static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return j.f32624a;
        }
        switch (i10) {
            case MotionEventCompat.AXIS_SCROLL /* 26 */:
                return j.f32626d;
            case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                return j.f32625c;
            case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
            case 29:
            case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                return j.b;
            default:
                return null;
        }
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public final b b(u4.b[] bVarArr, byte[] bArr) {
        InputStream g10;
        try {
            g10 = g(this.f2681a, this.f2687h);
        } catch (FileNotFoundException e10) {
            this.f2682c.a(9, e10);
        } catch (IOException e11) {
            this.f2682c.a(7, e11);
        } catch (IllegalStateException e12) {
            this.f2689j = null;
            this.f2682c.a(8, e12);
        }
        if (g10 == null) {
            if (g10 != null) {
                g10.close();
            }
            return null;
        }
        try {
            this.f2689j = i.r(g10, i.p(g10, i.b), bArr, bVarArr);
            g10.close();
            return this;
        } catch (Throwable th2) {
            try {
                g10.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void c() {
        if (!this.f2688i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public boolean e() {
        if (this.f2683d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f2684e.exists()) {
            try {
                if (!this.f2684e.createNewFile()) {
                    k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f2684e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f2688i = true;
        return true;
    }

    public final InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f2686g);
        } catch (FileNotFoundException e10) {
            this.f2682c.a(6, e10);
            return null;
        } catch (IOException e11) {
            this.f2682c.a(7, e11);
            return null;
        }
    }

    public final InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f2682c.b(5, null);
            }
            return null;
        }
    }

    @NonNull
    public b h() {
        b b;
        c();
        if (this.f2683d != null) {
            InputStream f10 = f(this.f2681a);
            if (f10 != null) {
                this.f2689j = i(f10);
            }
            u4.b[] bVarArr = this.f2689j;
            if (bVarArr != null && j() && (b = b(bVarArr, this.f2683d)) != null) {
                return b;
            }
        }
        return this;
    }

    public final u4.b[] i(InputStream inputStream) {
        try {
            try {
                try {
                    u4.b[] x10 = i.x(inputStream, i.p(inputStream, i.f32623a), this.f2685f);
                    try {
                        inputStream.close();
                        return x10;
                    } catch (IOException e10) {
                        this.f2682c.a(7, e10);
                        return x10;
                    }
                } catch (IllegalStateException e11) {
                    this.f2682c.a(8, e11);
                    return null;
                }
            } catch (IOException e12) {
                this.f2682c.a(7, e12);
                return null;
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e13) {
                this.f2682c.a(7, e13);
            }
        }
    }

    public final void k(final int i10, final Object obj) {
        this.b.execute(new Runnable() { // from class: u4.a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.b.this.f2682c.a(i10, obj);
            }
        });
    }

    @NonNull
    public b l() {
        ByteArrayOutputStream byteArrayOutputStream;
        u4.b[] bVarArr = this.f2689j;
        byte[] bArr = this.f2683d;
        if (bVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    i.F(byteArrayOutputStream, bArr);
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                this.f2682c.a(7, e10);
            } catch (IllegalStateException e11) {
                this.f2682c.a(8, e11);
            }
            if (!i.C(byteArrayOutputStream, bArr, bVarArr)) {
                this.f2682c.a(5, null);
                this.f2689j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f2690k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f2689j = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean m() {
        byte[] bArr = this.f2690k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f2684e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock tryLock = channel.tryLock();
                            try {
                                u4.c.l(byteArrayInputStream, fileOutputStream, tryLock);
                                k(1, null);
                                if (tryLock != null) {
                                    tryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                return true;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e10) {
                k(6, e10);
                return false;
            } catch (IOException e11) {
                k(7, e11);
                return false;
            }
        } finally {
            this.f2690k = null;
            this.f2689j = null;
        }
    }
}
