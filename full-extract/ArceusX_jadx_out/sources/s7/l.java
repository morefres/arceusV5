package s7;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;

/* loaded from: classes3.dex */
public class l {
    public static final Matrix B = new Matrix();
    public s7.b A;

    /* renamed from: a, reason: collision with root package name */
    public Canvas f30932a;
    public a b;

    /* renamed from: c, reason: collision with root package name */
    public b f30933c;

    /* renamed from: d, reason: collision with root package name */
    public RectF f30934d;

    /* renamed from: e, reason: collision with root package name */
    public RectF f30935e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f30936f;

    /* renamed from: g, reason: collision with root package name */
    public RectF f30937g;

    /* renamed from: h, reason: collision with root package name */
    public RectF f30938h;

    /* renamed from: i, reason: collision with root package name */
    public Rect f30939i;

    /* renamed from: j, reason: collision with root package name */
    public RectF f30940j;

    /* renamed from: k, reason: collision with root package name */
    public Paint f30941k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f30942l;

    /* renamed from: m, reason: collision with root package name */
    public Canvas f30943m;

    /* renamed from: n, reason: collision with root package name */
    public Rect f30944n;

    /* renamed from: o, reason: collision with root package name */
    public g7.a f30945o;

    /* renamed from: p, reason: collision with root package name */
    public Matrix f30946p;

    /* renamed from: q, reason: collision with root package name */
    public float[] f30947q;

    /* renamed from: r, reason: collision with root package name */
    public Bitmap f30948r;

    /* renamed from: s, reason: collision with root package name */
    public Bitmap f30949s;

    /* renamed from: t, reason: collision with root package name */
    public Canvas f30950t;

    /* renamed from: u, reason: collision with root package name */
    public Canvas f30951u;

    /* renamed from: v, reason: collision with root package name */
    public g7.a f30952v;

    /* renamed from: w, reason: collision with root package name */
    public BlurMaskFilter f30953w;

    /* renamed from: x, reason: collision with root package name */
    public float f30954x = 0.0f;

    /* renamed from: y, reason: collision with root package name */
    public RenderNode f30955y;

    /* renamed from: z, reason: collision with root package name */
    public RenderNode f30956z;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f30957a;
        public androidx.core.graphics.a b;

        /* renamed from: c, reason: collision with root package name */
        public ColorFilter f30958c;

        /* renamed from: d, reason: collision with root package name */
        public s7.b f30959d;

        public a() {
            f();
        }

        public boolean a() {
            androidx.core.graphics.a aVar = this.b;
            return (aVar == null || aVar == androidx.core.graphics.a.SRC_OVER) ? false : true;
        }

        public boolean b() {
            return this.f30958c != null;
        }

        public boolean c() {
            return this.f30959d != null;
        }

        public boolean d() {
            return (e() || a() || c() || b()) ? false : true;
        }

        public boolean e() {
            return this.f30957a < 255;
        }

        public void f() {
            this.f30957a = 255;
            this.b = null;
            this.f30958c = null;
            this.f30959d = null;
        }
    }

    public enum b {
        DIRECT,
        SAVE_LAYER,
        BITMAP,
        RENDER_NODE
    }

    public final Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(rectF.width() * 1.05d), 1), Math.max((int) Math.ceil(rectF.height() * 1.05d), 1), config);
    }

    public final RectF b(RectF rectF, s7.b bVar) {
        if (this.f30935e == null) {
            this.f30935e = new RectF();
        }
        if (this.f30937g == null) {
            this.f30937g = new RectF();
        }
        this.f30935e.set(rectF);
        this.f30935e.offsetTo(rectF.left + bVar.f(), rectF.top + bVar.g());
        this.f30935e.inset(-bVar.h(), -bVar.h());
        this.f30937g.set(rectF);
        this.f30935e.union(this.f30937g);
        return this.f30935e;
    }

    public final b c(Canvas canvas, a aVar) {
        if (aVar.d()) {
            return b.DIRECT;
        }
        if (!aVar.c()) {
            return b.SAVE_LAYER;
        }
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 29 || !canvas.isHardwareAccelerated()) ? b.BITMAP : i10 <= 31 ? b.BITMAP : b.RENDER_NODE;
    }

    public final void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    public void e() {
        if (this.f30932a == null || this.b == null || this.f30947q == null || this.f30934d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int ordinal = this.f30933c.ordinal();
        if (ordinal == 0) {
            this.f30932a.restore();
        } else if (ordinal == 1) {
            this.f30932a.restore();
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                if (this.f30955y == null) {
                    throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                }
                if (Build.VERSION.SDK_INT < 29) {
                    throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                }
                this.f30932a.save();
                Canvas canvas = this.f30932a;
                float[] fArr = this.f30947q;
                canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                this.f30955y.endRecording();
                if (this.b.c()) {
                    i(this.f30932a, this.b.f30959d);
                }
                this.f30932a.drawRenderNode(this.f30955y);
                this.f30932a.restore();
            }
        } else {
            if (this.f30942l == null) {
                throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
            }
            if (this.b.c()) {
                h(this.f30932a, this.b.f30959d);
            }
            if (this.f30944n == null) {
                this.f30944n = new Rect();
            }
            this.f30944n.set(0, 0, (int) (this.f30934d.width() * this.f30947q[0]), (int) (this.f30934d.height() * this.f30947q[4]));
            this.f30932a.drawBitmap(this.f30942l, this.f30944n, this.f30934d, this.f30941k);
        }
        this.f30932a = null;
    }

    public boolean f() {
        return this.f30933c == b.RENDER_NODE;
    }

    public final boolean g(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final void h(Canvas canvas, s7.b bVar) {
        g7.a aVar;
        RectF rectF = this.f30934d;
        if (rectF == null || this.f30942l == null) {
            throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
        }
        RectF b10 = b(rectF, bVar);
        if (this.f30936f == null) {
            this.f30936f = new Rect();
        }
        this.f30936f.set((int) Math.floor(b10.left), (int) Math.floor(b10.top), (int) Math.ceil(b10.right), (int) Math.ceil(b10.bottom));
        float[] fArr = this.f30947q;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        if (this.f30938h == null) {
            this.f30938h = new RectF();
        }
        this.f30938h.set(b10.left * f10, b10.top * f11, b10.right * f10, b10.bottom * f11);
        if (this.f30939i == null) {
            this.f30939i = new Rect();
        }
        this.f30939i.set(0, 0, Math.round(this.f30938h.width()), Math.round(this.f30938h.height()));
        if (g(this.f30948r, this.f30938h)) {
            Bitmap bitmap = this.f30948r;
            if (bitmap != null) {
                d(bitmap);
            }
            Bitmap bitmap2 = this.f30949s;
            if (bitmap2 != null) {
                d(bitmap2);
            }
            this.f30948r = a(this.f30938h, Bitmap.Config.ARGB_8888);
            this.f30949s = a(this.f30938h, Bitmap.Config.ALPHA_8);
            this.f30950t = new Canvas(this.f30948r);
            this.f30951u = new Canvas(this.f30949s);
        } else {
            Canvas canvas2 = this.f30950t;
            if (canvas2 == null || this.f30951u == null || (aVar = this.f30945o) == null) {
                throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
            }
            canvas2.drawRect(this.f30939i, aVar);
            this.f30951u.drawRect(this.f30939i, this.f30945o);
        }
        if (this.f30949s == null) {
            throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
        }
        if (this.f30952v == null) {
            this.f30952v = new g7.a(1);
        }
        RectF rectF2 = this.f30934d;
        this.f30951u.drawBitmap(this.f30942l, Math.round((rectF2.left - b10.left) * f10), Math.round((rectF2.top - b10.top) * f11), (Paint) null);
        if (this.f30953w == null || this.f30954x != bVar.h()) {
            float h10 = (bVar.h() * (f10 + f11)) / 2.0f;
            if (h10 > 0.0f) {
                this.f30953w = new BlurMaskFilter(h10, BlurMaskFilter.Blur.NORMAL);
            } else {
                this.f30953w = null;
            }
            this.f30954x = bVar.h();
        }
        this.f30952v.setColor(bVar.e());
        if (bVar.h() > 0.0f) {
            this.f30952v.setMaskFilter(this.f30953w);
        } else {
            this.f30952v.setMaskFilter(null);
        }
        this.f30952v.setFilterBitmap(true);
        this.f30950t.drawBitmap(this.f30949s, Math.round(bVar.f() * f10), Math.round(bVar.g() * f11), this.f30952v);
        canvas.drawBitmap(this.f30948r, this.f30939i, this.f30936f, this.f30941k);
    }

    public final void i(Canvas canvas, s7.b bVar) {
        if (this.f30955y == null || this.f30956z == null) {
            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new RuntimeException("RenderEffect is not supported on API level <31");
        }
        float[] fArr = this.f30947q;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        s7.b bVar2 = this.A;
        if (bVar2 == null || !bVar.j(bVar2)) {
            RenderEffect createColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(bVar.e(), PorterDuff.Mode.SRC_IN));
            if (bVar.h() > 0.0f) {
                float h10 = (bVar.h() * (f10 + f11)) / 2.0f;
                createColorFilterEffect = RenderEffect.createBlurEffect(h10, h10, createColorFilterEffect, Shader.TileMode.CLAMP);
            }
            this.f30956z.setRenderEffect(createColorFilterEffect);
            this.A = bVar;
        }
        RectF b10 = b(this.f30934d, bVar);
        RectF rectF = new RectF(b10.left * f10, b10.top * f11, b10.right * f10, b10.bottom * f11);
        this.f30956z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
        RecordingCanvas beginRecording = this.f30956z.beginRecording((int) rectF.width(), (int) rectF.height());
        beginRecording.translate((-rectF.left) + (bVar.f() * f10), (-rectF.top) + (bVar.g() * f11));
        beginRecording.drawRenderNode(this.f30955y);
        this.f30956z.endRecording();
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.drawRenderNode(this.f30956z);
        canvas.restore();
    }

    public Canvas j(Canvas canvas, RectF rectF, a aVar) {
        if (this.f30932a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f30947q == null) {
            this.f30947q = new float[9];
        }
        if (this.f30946p == null) {
            this.f30946p = new Matrix();
        }
        canvas.getMatrix(this.f30946p);
        this.f30946p.getValues(this.f30947q);
        float[] fArr = this.f30947q;
        float f10 = fArr[0];
        float f11 = fArr[4];
        if (this.f30940j == null) {
            this.f30940j = new RectF();
        }
        this.f30940j.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
        this.f30932a = canvas;
        this.b = aVar;
        this.f30933c = c(canvas, aVar);
        if (this.f30934d == null) {
            this.f30934d = new RectF();
        }
        this.f30934d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f30941k == null) {
            this.f30941k = new g7.a();
        }
        this.f30941k.reset();
        int ordinal = this.f30933c.ordinal();
        if (ordinal == 0) {
            canvas.save();
            return canvas;
        }
        if (ordinal == 1) {
            this.f30941k.setAlpha(aVar.f30957a);
            this.f30941k.setColorFilter(aVar.f30958c);
            if (aVar.a()) {
                androidx.core.graphics.d.b(this.f30941k, aVar.b);
            }
            m.n(canvas, rectF, this.f30941k);
            return canvas;
        }
        if (ordinal == 2) {
            if (this.f30945o == null) {
                g7.a aVar2 = new g7.a();
                this.f30945o = aVar2;
                aVar2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (g(this.f30942l, this.f30940j)) {
                Bitmap bitmap = this.f30942l;
                if (bitmap != null) {
                    d(bitmap);
                }
                this.f30942l = a(this.f30940j, Bitmap.Config.ARGB_8888);
                this.f30943m = new Canvas(this.f30942l);
            } else {
                Canvas canvas2 = this.f30943m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(B);
                this.f30943m.drawRect(-1.0f, -1.0f, this.f30940j.width() + 1.0f, this.f30940j.height() + 1.0f, this.f30945o);
            }
            androidx.core.graphics.d.b(this.f30941k, aVar.b);
            this.f30941k.setColorFilter(aVar.f30958c);
            this.f30941k.setAlpha(aVar.f30957a);
            Canvas canvas3 = this.f30943m;
            canvas3.scale(f10, f11);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (ordinal != 3) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f30955y == null) {
            this.f30955y = k.a("OffscreenLayer.main");
        }
        if (aVar.c() && this.f30956z == null) {
            this.f30956z = k.a("OffscreenLayer.shadow");
            this.A = null;
        }
        if (aVar.a() || aVar.b()) {
            if (this.f30941k == null) {
                this.f30941k = new g7.a();
            }
            this.f30941k.reset();
            androidx.core.graphics.d.b(this.f30941k, aVar.b);
            this.f30941k.setColorFilter(aVar.f30958c);
            this.f30955y.setUseCompositingLayer(true, this.f30941k);
            if (aVar.c()) {
                RenderNode renderNode = this.f30956z;
                if (renderNode == null) {
                    throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                }
                renderNode.setUseCompositingLayer(true, this.f30941k);
            }
        }
        this.f30955y.setAlpha(aVar.f30957a / 255.0f);
        if (aVar.c()) {
            RenderNode renderNode2 = this.f30956z;
            if (renderNode2 == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode2.setAlpha(aVar.f30957a / 255.0f);
        }
        this.f30955y.setHasOverlappingRendering(true);
        RenderNode renderNode3 = this.f30955y;
        RectF rectF2 = this.f30940j;
        renderNode3.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas beginRecording = this.f30955y.beginRecording((int) this.f30940j.width(), (int) this.f30940j.height());
        beginRecording.setMatrix(B);
        beginRecording.scale(f10, f11);
        beginRecording.translate(-rectF.left, -rectF.top);
        return beginRecording;
    }
}
