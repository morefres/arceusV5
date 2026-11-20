package e1;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.Image;
import android.util.Size;
import androidx.camera.core.d;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.interfaces.Detector;
import e1.c;
import g0.r1;
import g0.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import n9.m;
import p0.a0;

/* loaded from: classes.dex */
public class c implements u0.a {

    /* renamed from: g, reason: collision with root package name */
    public static final Size f15499g = new Size(480, 360);

    /* renamed from: a, reason: collision with root package name */
    public final List<Detector<?>> f15500a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final x2.a<a> f15501c;

    /* renamed from: d, reason: collision with root package name */
    public final t1.a f15502d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f15503e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f15504f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map<Detector<?>, Object> f15505a;
        public final Map<Detector<?>, Throwable> b;

        /* renamed from: c, reason: collision with root package name */
        public final long f15506c;

        public a(Map<Detector<?>, Object> map, long j10, Map<Detector<?>, Throwable> map2) {
            this.f15505a = map;
            this.b = map2;
            this.f15506c = j10;
        }

        public final void a(Detector<?> detector) {
            m.b(this.f15505a.containsKey(detector) || this.b.containsKey(detector), "The detector does not exist");
        }

        public Throwable b(Detector<?> detector) {
            a(detector);
            return this.b.get(detector);
        }

        public <T> T c(Detector<T> detector) {
            a(detector);
            return (T) this.f15505a.get(detector);
        }
    }

    public c(List<Detector<?>> list, int i10, Executor executor, x2.a<a> aVar) {
        if (i10 != 0) {
            Iterator<Detector<?>> it = list.iterator();
            while (it.hasNext()) {
                m.b(it.next().getDetectorType() != 7, "Segmentation only works with COORDINATE_SYSTEM_ORIGINAL");
            }
        }
        this.f15500a = new ArrayList(list);
        this.b = i10;
        this.f15501c = aVar;
        this.f15503e = executor;
        t1.a aVar2 = new t1.a();
        this.f15502d = aVar2;
        aVar2.a(true);
    }

    public static /* synthetic */ void a(c cVar, Map map, Detector detector, Map map2, d dVar, int i10, Matrix matrix, Task task) {
        cVar.getClass();
        if (task.l()) {
            map.put(detector, new CancellationException("The task is canceled."));
        } else if (task.isSuccessful()) {
            map2.put(detector, task.getResult());
        } else {
            map.put(detector, task.getException());
        }
        cVar.f(dVar, i10 + 1, matrix, map2, map);
    }

    @Override // g0.u0.a
    public final Size c() {
        Size size = f15499g;
        Iterator<Detector<?>> it = this.f15500a.iterator();
        while (it.hasNext()) {
            Size g10 = g(it.next().getDetectorType());
            if (g10.getHeight() * g10.getWidth() > size.getWidth() * size.getHeight()) {
                size = g10;
            }
        }
        return size;
    }

    @Override // g0.u0.a
    public final int d() {
        return this.b;
    }

    @Override // g0.u0.a
    public final void e(Matrix matrix) {
        if (matrix == null) {
            this.f15504f = null;
        } else {
            this.f15504f = new Matrix(matrix);
        }
    }

    public final void f(final d dVar, final int i10, final Matrix matrix, final Map<Detector<?>, Object> map, final Map<Detector<?>, Throwable> map2) {
        Image p8 = dVar.p();
        if (p8 == null) {
            r1.c("MlKitAnalyzer", "Image is null.");
            dVar.close();
            return;
        }
        if (i10 > this.f15500a.size() - 1) {
            dVar.close();
            this.f15503e.execute(new Runnable() { // from class: e1.a
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.f15501c.accept(new c.a(map, dVar.I2().getTimestamp(), map2));
                }
            });
            return;
        }
        final Detector<?> detector = this.f15500a.get(i10);
        try {
            detector.process(p8, dVar.I2().d(), matrix).c(this.f15503e, new OnCompleteListener() { // from class: e1.b
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    c.a(c.this, map2, detector, map, dVar, i10, matrix, task);
                }
            });
        } catch (Exception e10) {
            map2.put(detector, new RuntimeException("Failed to process the image.", e10));
            f(dVar, i10 + 1, matrix, map, map2);
        }
    }

    public final Size g(int i10) {
        return (i10 == 1 || i10 == 4) ? new Size(1280, 720) : f15499g;
    }

    @Override // g0.u0.a
    public final void k(d dVar) {
        Matrix matrix = new Matrix();
        int i10 = this.b;
        if (i10 != 0) {
            Matrix matrix2 = this.f15504f;
            if (i10 != 2 && matrix2 == null) {
                r1.a("MlKitAnalyzer", "Sensor-to-target transformation is null.");
                dVar.close();
                return;
            }
            Matrix matrix3 = new Matrix(dVar.I2().e());
            RectF rectF = new RectF(0.0f, 0.0f, dVar.getWidth(), dVar.getHeight());
            matrix3.postConcat(a0.d(rectF, a0.p(rectF, dVar.I2().d()), dVar.I2().d()));
            matrix3.invert(matrix);
            if (this.b != 2) {
                matrix.postConcat(matrix2);
            }
        }
        f(dVar, 0, matrix, new HashMap(), new HashMap());
    }
}
