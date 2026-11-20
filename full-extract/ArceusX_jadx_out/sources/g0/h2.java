package g0;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public final class h2 extends androidx.camera.core.b {

    /* renamed from: d, reason: collision with root package name */
    public final Object f17899d;

    /* renamed from: e, reason: collision with root package name */
    public final i1 f17900e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f17901f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17902g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17903h;

    public h2(androidx.camera.core.d dVar, i1 i1Var) {
        this(dVar, null, i1Var);
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public i1 I2() {
        return this.f17900e;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public void K0(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f17899d) {
            this.f17901f = rect;
        }
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public int getHeight() {
        return this.f17903h;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public int getWidth() {
        return this.f17902g;
    }

    public h2(androidx.camera.core.d dVar, Size size, i1 i1Var) {
        super(dVar);
        this.f17899d = new Object();
        if (size == null) {
            this.f17902g = super.getWidth();
            this.f17903h = super.getHeight();
        } else {
            this.f17902g = size.getWidth();
            this.f17903h = size.getHeight();
        }
        this.f17900e = i1Var;
    }
}
