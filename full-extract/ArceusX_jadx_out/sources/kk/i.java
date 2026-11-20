package kk;

import android.graphics.Point;
import android.view.MotionEvent;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: h, reason: collision with root package name */
    public a f22816h;

    /* renamed from: a, reason: collision with root package name */
    public Point f22810a = new Point();
    public Point b = new Point();

    /* renamed from: c, reason: collision with root package name */
    public Point f22811c = new Point();

    /* renamed from: f, reason: collision with root package name */
    public float f22814f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public int f22815g = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f22812d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f22813e = -1;

    public interface a {
        void b(i iVar);
    }

    public i(a aVar) {
        this.f22816h = aVar;
    }

    public final void a(float f10, float f11, float f12, float f13) {
        int i10 = (int) (f10 - f12);
        int i11 = (int) (f11 - f13);
        Point point = this.f22811c;
        Point point2 = this.b;
        int i12 = point2.x;
        Point point3 = this.f22810a;
        point.x = i12 - point3.x;
        point.y = point2.y - point3.y;
        double atan2 = Math.atan2((i10 * r3) - (i11 * r4), (r4 * i10) + (r3 * i11));
        Point point4 = this.b;
        point4.x = (int) f10;
        point4.y = (int) f11;
        Point point5 = this.f22810a;
        point5.x = (int) f12;
        point5.y = (int) f13;
        this.f22814f -= (float) atan2;
    }

    public float b() {
        return this.f22814f;
    }

    public Point c() {
        return this.f22812d != -1 ? this.f22810a : new Point();
    }

    public Point d() {
        return this.f22813e != -1 ? this.b : new Point();
    }

    public int e() {
        return this.f22815g;
    }

    public boolean f(MotionEvent motionEvent) {
        float f10;
        float f11;
        float f12;
        float f13;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f22815g = 2;
                if (this.f22812d != -1 && this.f22813e != -1) {
                    this.f22816h.b(this);
                }
                this.f22814f = 0.0f;
                this.f22812d = -1;
            } else if (actionMasked == 2) {
                int i10 = this.f22812d;
                if (i10 != -1 && this.f22813e != -1) {
                    this.f22815g = 1;
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.f22813e);
                    if (findPointerIndex == -1 || findPointerIndex >= motionEvent.getPointerCount()) {
                        f10 = -1.0f;
                        f11 = -1.0f;
                    } else {
                        f10 = motionEvent.getX(motionEvent.findPointerIndex(this.f22812d));
                        f11 = motionEvent.getY(motionEvent.findPointerIndex(this.f22812d));
                    }
                    if (findPointerIndex2 == -1 || findPointerIndex2 >= motionEvent.getPointerCount()) {
                        f12 = -1.0f;
                        f13 = -1.0f;
                    } else {
                        f13 = motionEvent.getX(motionEvent.findPointerIndex(this.f22813e));
                        f12 = motionEvent.getY(motionEvent.findPointerIndex(this.f22813e));
                    }
                    if (f13 != -1.0f && f12 != -1.0f && f10 != -1.0f && f11 != -1.0f) {
                        a(f13, f12, f10, f11);
                    }
                    a aVar = this.f22816h;
                    if (aVar != null) {
                        aVar.b(this);
                    }
                }
            } else if (actionMasked != 5) {
                if (actionMasked == 6) {
                    this.f22815g = 2;
                    if (this.f22812d != -1 && this.f22813e != -1) {
                        this.f22816h.b(this);
                    }
                    this.f22814f = 0.0f;
                    this.f22813e = -1;
                }
            } else if (this.f22813e == -1) {
                this.f22813e = motionEvent.getPointerId(motionEvent.getActionIndex());
                int findPointerIndex3 = motionEvent.findPointerIndex(this.f22812d);
                int findPointerIndex4 = motionEvent.findPointerIndex(this.f22813e);
                if (findPointerIndex3 != -1 && findPointerIndex3 < motionEvent.getPointerCount()) {
                    this.f22810a.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f22812d));
                    this.f22810a.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f22812d));
                }
                if (findPointerIndex4 != -1 && findPointerIndex4 < motionEvent.getPointerCount()) {
                    this.b.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f22813e));
                    this.b.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f22813e));
                }
                Point point = this.f22811c;
                Point point2 = this.b;
                int i11 = point2.x;
                Point point3 = this.f22810a;
                point.x = i11 - point3.x;
                point.y = point2.y - point3.y;
                if (this.f22812d != -1) {
                    this.f22816h.b(this);
                }
            }
        } else if (this.f22812d == -1) {
            this.f22812d = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f22813e = -1;
            this.f22815g = 0;
            this.f22814f = 0.0f;
        }
        return true;
    }
}
