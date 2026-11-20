package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1699a;
    public final i b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1700c;

    /* renamed from: d, reason: collision with root package name */
    public final a f1701d;

    /* renamed from: e, reason: collision with root package name */
    public VelocityTracker f1702e;

    /* renamed from: f, reason: collision with root package name */
    public float f1703f;

    /* renamed from: g, reason: collision with root package name */
    public int f1704g;

    /* renamed from: h, reason: collision with root package name */
    public int f1705h;

    /* renamed from: i, reason: collision with root package name */
    public int f1706i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f1707j;

    public interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    public interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public h(Context context, i iVar) {
        this(context, iVar, new b() { // from class: androidx.core.view.f
            @Override // androidx.core.view.h.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                h.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: androidx.core.view.g
            @Override // androidx.core.view.h.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                float f10;
                f10 = h.f(velocityTracker, motionEvent, i10);
                return f10;
            }
        });
    }

    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = r0.g(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = r0.f(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        l0.a(velocityTracker, motionEvent);
        l0.b(velocityTracker, 1000);
        return l0.d(velocityTracker, i10);
    }

    public final boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f1705h == source && this.f1706i == deviceId && this.f1704g == i10) {
            return false;
        }
        this.f1700c.a(this.f1699a, this.f1707j, motionEvent, i10);
        this.f1705h = source;
        this.f1706i = deviceId;
        this.f1704g = i10;
        return true;
    }

    public final float e(MotionEvent motionEvent, int i10) {
        if (this.f1702e == null) {
            this.f1702e = VelocityTracker.obtain();
        }
        return this.f1701d.a(this.f1702e, motionEvent, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean d10 = d(motionEvent, i10);
        if (this.f1707j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f1702e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1702e = null;
                return;
            }
            return;
        }
        float e10 = e(motionEvent, i10) * this.b.b();
        float signum = Math.signum(e10);
        if (d10 || (signum != Math.signum(this.f1703f) && signum != 0.0f)) {
            this.b.c();
        }
        float abs = Math.abs(e10);
        int[] iArr = this.f1707j;
        if (abs < iArr[0]) {
            return;
        }
        float max = Math.max(-r6, Math.min(e10, iArr[1]));
        this.f1703f = this.b.a(max) ? max : 0.0f;
    }

    public h(Context context, i iVar, b bVar, a aVar) {
        this.f1704g = -1;
        this.f1705h = -1;
        this.f1706i = -1;
        this.f1707j = new int[]{Integer.MAX_VALUE, 0};
        this.f1699a = context;
        this.b = iVar;
        this.f1700c = bVar;
        this.f1701d = aVar;
    }
}
