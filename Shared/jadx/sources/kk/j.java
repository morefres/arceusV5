package kk;

import android.graphics.Point;
import android.view.MotionEvent;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: i, reason: collision with root package name */
    public a f22824i;

    /* renamed from: a, reason: collision with root package name */
    public Point f22817a = new Point();
    public Point b = new Point();

    /* renamed from: c, reason: collision with root package name */
    public Point f22818c = new Point();

    /* renamed from: d, reason: collision with root package name */
    public Point f22819d = new Point();

    /* renamed from: g, reason: collision with root package name */
    public int f22822g = -1;

    /* renamed from: h, reason: collision with root package name */
    public float f22823h = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f22820e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f22821f = -1;

    public interface a {
        void a(j jVar);
    }

    public j(a aVar) {
        this.f22824i = aVar;
    }

    public Point a() {
        return this.f22820e != -1 ? this.f22818c : new Point();
    }

    public Point b() {
        return this.f22821f != -1 ? this.f22819d : new Point();
    }

    public float c() {
        return this.f22823h;
    }

    public int d() {
        return this.f22822g;
    }

    public boolean e(MotionEvent motionEvent) {
        try {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.f22822g = 2;
                    if (this.f22820e != -1 && this.f22821f != -1) {
                        this.f22824i.a(this);
                    }
                    this.f22823h = 1.0f;
                    this.f22820e = -1;
                } else if (actionMasked == 2) {
                    int i10 = this.f22820e;
                    if (i10 != -1 && this.f22821f != -1) {
                        this.f22822g = 1;
                        this.f22818c.x = (int) motionEvent.getX(motionEvent.findPointerIndex(i10));
                        this.f22818c.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f22820e));
                        this.f22819d.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f22821f));
                        this.f22819d.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f22821f));
                        f();
                        a aVar = this.f22824i;
                        if (aVar != null) {
                            aVar.a(this);
                        }
                    }
                } else if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        this.f22822g = 2;
                        if (this.f22820e != -1 && this.f22821f != -1) {
                            this.f22824i.a(this);
                        }
                        this.f22823h = 1.0f;
                        this.f22821f = -1;
                    }
                } else if (this.f22821f == -1) {
                    this.f22821f = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f22817a.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f22820e));
                    this.f22817a.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f22820e));
                    this.b.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f22821f));
                    this.b.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f22821f));
                    this.f22818c.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f22820e));
                    this.f22818c.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f22820e));
                    this.f22819d.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f22821f));
                    this.f22819d.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f22821f));
                    this.f22822g = 0;
                    if (this.f22820e != -1) {
                        this.f22824i.a(this);
                    }
                }
            } else if (this.f22820e == -1) {
                this.f22820e = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f22821f = -1;
                this.f22822g = 0;
            }
        } catch (IllegalArgumentException unused) {
        }
        return true;
    }

    public final void f() {
        int i10 = this.b.x;
        Point point = this.f22817a;
        double sqrt = Math.sqrt(Math.pow(i10 - point.x, 2.0d) + Math.pow(r0.y - point.y, 2.0d));
        int i11 = this.f22819d.x;
        Point point2 = this.f22818c;
        double sqrt2 = Math.sqrt(Math.pow(i11 - point2.x, 2.0d) + Math.pow(r2.y - point2.y, 2.0d));
        if (sqrt != 0.0d) {
            this.f22823h = (float) (sqrt2 / sqrt);
        } else {
            this.f22823h = 1.0f;
        }
    }
}
