package g0;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import java.util.concurrent.Executor;
import n0.j2;

/* loaded from: classes.dex */
public class c implements n0.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final ImageReader f17800a;
    public final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f17801c = true;

    public c(ImageReader imageReader) {
        this.f17800a = imageReader;
    }

    public static /* synthetic */ void a(final c cVar, Executor executor, final j2.a aVar, ImageReader imageReader) {
        synchronized (cVar.b) {
            try {
                if (!cVar.f17801c) {
                    executor.execute(new Runnable() { // from class: g0.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.h(c.this, aVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void h(c cVar, j2.a aVar) {
        cVar.getClass();
        aVar.a(cVar);
    }

    @Override // n0.j2
    public androidx.camera.core.d b() {
        Image image;
        synchronized (this.b) {
            try {
                image = this.f17800a.acquireLatestImage();
            } catch (RuntimeException e10) {
                if (!i(e10)) {
                    throw e10;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new androidx.camera.core.a(image);
        }
    }

    @Override // n0.j2
    public int c() {
        int imageFormat;
        synchronized (this.b) {
            imageFormat = this.f17800a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // n0.j2
    public void close() {
        synchronized (this.b) {
            this.f17800a.close();
        }
    }

    @Override // n0.j2
    public void d() {
        synchronized (this.b) {
            this.f17801c = true;
            this.f17800a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // n0.j2
    public int e() {
        int maxImages;
        synchronized (this.b) {
            maxImages = this.f17800a.getMaxImages();
        }
        return maxImages;
    }

    @Override // n0.j2
    public void f(final j2.a aVar, final Executor executor) {
        synchronized (this.b) {
            this.f17801c = false;
            this.f17800a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: g0.a
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    c.a(c.this, executor, aVar, imageReader);
                }
            }, p0.o.a());
        }
    }

    @Override // n0.j2
    public androidx.camera.core.d g() {
        Image image;
        synchronized (this.b) {
            try {
                image = this.f17800a.acquireNextImage();
            } catch (RuntimeException e10) {
                if (!i(e10)) {
                    throw e10;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new androidx.camera.core.a(image);
        }
    }

    @Override // n0.j2
    public int getHeight() {
        int height;
        synchronized (this.b) {
            height = this.f17800a.getHeight();
        }
        return height;
    }

    @Override // n0.j2
    public Surface getSurface() {
        Surface surface;
        synchronized (this.b) {
            surface = this.f17800a.getSurface();
        }
        return surface;
    }

    @Override // n0.j2
    public int getWidth() {
        int width;
        synchronized (this.b) {
            width = this.f17800a.getWidth();
        }
        return width;
    }

    public final boolean i(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }
}
