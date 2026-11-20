package m0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.d;
import java.nio.ByteBuffer;
import java.util.Objects;
import n0.z3;
import p0.i;

/* loaded from: classes.dex */
public final class z0 implements androidx.camera.core.d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24048a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24049c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f24050d;

    /* renamed from: e, reason: collision with root package name */
    public d.a[] f24051e;

    /* renamed from: f, reason: collision with root package name */
    public final g0.i1 f24052f;

    public class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f24053a;
        public final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f24054c;

        public a(int i10, int i11, ByteBuffer byteBuffer) {
            this.f24053a = i10;
            this.b = i11;
            this.f24054c = byteBuffer;
        }

        @Override // androidx.camera.core.d.a
        public ByteBuffer k() {
            return this.f24054c;
        }

        @Override // androidx.camera.core.d.a
        public int l() {
            return this.f24053a;
        }

        @Override // androidx.camera.core.d.a
        public int m() {
            return this.b;
        }
    }

    public class b implements g0.i1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f24055a;
        public final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Matrix f24056c;

        public b(long j10, int i10, Matrix matrix) {
            this.f24055a = j10;
            this.b = i10;
            this.f24056c = matrix;
        }

        @Override // g0.i1
        public void a(i.b bVar) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }

        @Override // g0.i1
        public z3 c() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        @Override // g0.i1
        public int d() {
            return this.b;
        }

        @Override // g0.i1
        public Matrix e() {
            return new Matrix(this.f24056c);
        }

        @Override // g0.i1
        public long getTimestamp() {
            return this.f24055a;
        }
    }

    public z0(x0.b0<Bitmap> b0Var) {
        this(b0Var.c(), b0Var.b(), b0Var.f(), b0Var.g(), b0Var.a().getTimestamp());
    }

    public static g0.i1 b(long j10, int i10, Matrix matrix) {
        return new b(j10, i10, matrix);
    }

    public static d.a c(ByteBuffer byteBuffer, int i10, int i11) {
        return new a(i10, i11, byteBuffer);
    }

    @Override // androidx.camera.core.d
    public d.a[] F1() {
        d.a[] aVarArr;
        synchronized (this.f24048a) {
            a();
            d.a[] aVarArr2 = this.f24051e;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }

    @Override // androidx.camera.core.d
    public g0.i1 I2() {
        g0.i1 i1Var;
        synchronized (this.f24048a) {
            a();
            i1Var = this.f24052f;
        }
        return i1Var;
    }

    @Override // androidx.camera.core.d
    public void K0(Rect rect) {
        synchronized (this.f24048a) {
            try {
                a();
                if (rect != null) {
                    this.f24050d.set(rect);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        synchronized (this.f24048a) {
            x2.g.j(this.f24051e != null, "The image is closed.");
        }
    }

    @Override // androidx.camera.core.d, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f24048a) {
            a();
            this.f24051e = null;
        }
    }

    @Override // androidx.camera.core.d
    public int getFormat() {
        synchronized (this.f24048a) {
            a();
        }
        return 1;
    }

    @Override // androidx.camera.core.d
    public int getHeight() {
        int i10;
        synchronized (this.f24048a) {
            a();
            i10 = this.f24049c;
        }
        return i10;
    }

    @Override // androidx.camera.core.d
    public int getWidth() {
        int i10;
        synchronized (this.f24048a) {
            a();
            i10 = this.b;
        }
        return i10;
    }

    @Override // androidx.camera.core.d
    public Image p() {
        synchronized (this.f24048a) {
            a();
        }
        return null;
    }

    public z0(Bitmap bitmap, Rect rect, int i10, Matrix matrix, long j10) {
        this(w0.b.f(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i10, matrix, j10);
    }

    public z0(ByteBuffer byteBuffer, int i10, int i11, int i12, Rect rect, int i13, Matrix matrix, long j10) {
        this.f24048a = new Object();
        this.b = i11;
        this.f24049c = i12;
        this.f24050d = rect;
        this.f24052f = b(j10, i13, matrix);
        byteBuffer.rewind();
        this.f24051e = new d.a[]{c(byteBuffer, i11 * i10, i10)};
    }
}
