package kk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.input.InputManager;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.core.view.InputDeviceCompat;
import com.roblox.engine.jni.NativeInputInterface;
import ek.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kk.i;
import kk.j;
import okhttp3.internal.http.HttpStatusCodesKt;
import rg.a1;

/* loaded from: classes2.dex */
public class f implements View.OnTouchListener, i.a, j.a, SensorEventListener {
    public static int[] F = {96, 97, 99, 100, 19, 20, 21, 22, HttpStatusCodesKt.HTTP_EARLY_HINTS, 102, 106, 107, 109, 108};
    public static int[] G = {19, 20, 21, 22, 23, 4, 183, 184, 185, 186};
    public final Activity A;
    public InterfaceC0401f B;
    public boolean D;
    public VelocityTracker E;

    /* renamed from: a, reason: collision with root package name */
    public SurfaceView f22765a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public GestureDetector f22766c;

    /* renamed from: d, reason: collision with root package name */
    public g f22767d;

    /* renamed from: e, reason: collision with root package name */
    public i f22768e;

    /* renamed from: f, reason: collision with root package name */
    public j f22769f;

    /* renamed from: h, reason: collision with root package name */
    public SensorManager f22771h;

    /* renamed from: i, reason: collision with root package name */
    public Sensor f22772i;

    /* renamed from: j, reason: collision with root package name */
    public Sensor f22773j;

    /* renamed from: k, reason: collision with root package name */
    public OrientationEventListener f22774k;

    /* renamed from: y, reason: collision with root package name */
    public InputManager f22788y;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray<h> f22770g = new SparseArray<>();

    /* renamed from: l, reason: collision with root package name */
    public boolean f22775l = false;

    /* renamed from: m, reason: collision with root package name */
    public float f22776m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f22777n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    public boolean f22778o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f22779p = false;

    /* renamed from: q, reason: collision with root package name */
    public float f22780q = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public final float[] f22781r = new float[4];

    /* renamed from: s, reason: collision with root package name */
    public final float[] f22782s = new float[9];

    /* renamed from: t, reason: collision with root package name */
    public final float[] f22783t = new float[3];

    /* renamed from: u, reason: collision with root package name */
    public final float[] f22784u = new float[3];

    /* renamed from: v, reason: collision with root package name */
    public final float[] f22785v = new float[3];

    /* renamed from: w, reason: collision with root package name */
    public final Set<Integer> f22786w = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final Set<Integer> f22787x = new HashSet();

    /* renamed from: z, reason: collision with root package name */
    public InputManager.InputDeviceListener f22789z = null;
    public final List<Integer> C = new ArrayList();

    public class a extends OrientationEventListener {
        public a(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            f.this.J();
        }
    }

    public class b implements InputManager.InputDeviceListener {
        public b() {
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceAdded(int i10) {
            f.this.s(i10);
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceChanged(int i10) {
            f.this.t(i10);
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceRemoved(int i10) {
            f.this.u(i10);
        }
    }

    public class c implements View.OnKeyListener {
        public c() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
        
            if (r7 == 82) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x005b A[FALL_THROUGH, PHI: r7
  0x005b: PHI (r7v1 int) = (r7v0 int), (r7v2 int), (r7v0 int), (r7v0 int), (r7v0 int), (r7v0 int), (r7v0 int), (r7v0 int), (r7v0 int) binds: [B:7:0x001f, B:27:0x0058, B:11:0x0027, B:13:0x002b, B:15:0x002f, B:17:0x0033, B:18:0x0035, B:19:0x0038, B:20:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0068  */
        @Override // android.view.View.OnKeyListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onKey(android.view.View r6, int r7, android.view.KeyEvent r8) {
            /*
                r5 = this;
                android.view.InputDevice r6 = r8.getDevice()
                r0 = 0
                if (r6 != 0) goto L1e
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r8 = "Key event is from a disconnected device for keyCode: "
                r6.append(r8)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r7 = "rbx.input"
                ek.q.b(r7, r6)
                return r0
            L1e:
                r1 = 4
                if (r7 == r1) goto L5b
                r1 = 82
                if (r7 == r1) goto L3f
                r6 = 96
                if (r7 == r6) goto L5b
                r6 = 97
                if (r7 == r6) goto L5b
                r6 = 99
                if (r7 == r6) goto L5b
                r6 = 100
                if (r7 == r6) goto L5b
                switch(r7) {
                    case 19: goto L5b;
                    case 20: goto L5b;
                    case 21: goto L5b;
                    case 22: goto L5b;
                    case 23: goto L5b;
                    default: goto L38;
                }
            L38:
                switch(r7) {
                    case 102: goto L5b;
                    case 103: goto L5b;
                    case 104: goto L5b;
                    case 105: goto L5b;
                    case 106: goto L5b;
                    case 107: goto L5b;
                    case 108: goto L5b;
                    case 109: goto L5b;
                    default: goto L3b;
                }
            L3b:
                switch(r7) {
                    case 183: goto L5b;
                    case 184: goto L5b;
                    case 185: goto L5b;
                    case 186: goto L5b;
                    default: goto L3e;
                }
            L3e:
                goto L5a
            L3f:
                int r2 = r6.getSources()
                r3 = 50332689(0x3000411, float:3.7620487E-37)
                r2 = r2 & r3
                if (r2 != r3) goto L58
                r2 = 108(0x6c, float:1.51E-43)
                int[] r3 = new int[]{r2}
                boolean[] r6 = r6.hasKeys(r3)
                boolean r6 = r6[r0]
                if (r6 != 0) goto L58
                r7 = r2
            L58:
                if (r7 != r1) goto L5b
            L5a:
                return r0
            L5b:
                int r6 = r8.getSource()
                r1 = 16778240(0x1000400, float:2.3512757E-38)
                r1 = r1 & r6
                r2 = 1
                if (r1 == 0) goto L68
                r1 = r2
                goto L69
            L68:
                r1 = r0
            L69:
                boolean r3 = rg.a1.t0()
                if (r3 == 0) goto L77
                r3 = 33554944(0x2000200, float:9.404529E-38)
                r6 = r6 & r3
                if (r6 == 0) goto L77
                r6 = r2
                goto L78
            L77:
                r6 = r0
            L78:
                if (r1 != 0) goto L7f
                if (r6 == 0) goto L7d
                goto L7f
            L7d:
                r3 = r0
                goto L80
            L7f:
                r3 = r2
            L80:
                int r4 = r8.getAction()
                if (r4 != 0) goto L87
                r0 = r2
            L87:
                int r8 = r8.getDeviceId()
                if (r1 == 0) goto L96
                kk.f r6 = kk.f.this
                kk.f.f(r6, r8)
                com.roblox.engine.jni.NativeInputInterface.nativeGamepadButtonEvent(r8, r7, r0)
                return r3
            L96:
                if (r6 == 0) goto La0
                kk.f r6 = kk.f.this
                kk.f.g(r6, r8)
                com.roblox.engine.jni.NativeInputInterface.nativeTVRemoteButtonEvent(r8, r7, r0)
            La0:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kk.f.c.onKey(android.view.View, int, android.view.KeyEvent):boolean");
        }
    }

    public class d implements View.OnCapturedPointerListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SurfaceView f22793a;

        public d(SurfaceView surfaceView) {
            this.f22793a = surfaceView;
        }

        @Override // android.view.View.OnCapturedPointerListener
        public boolean onCapturedPointer(View view, MotionEvent motionEvent) {
            if (NativeInputInterface.nativeGetMainWindowIsMouseLockedCenter() || !this.f22793a.hasPointerCapture()) {
                return f.this.z(motionEvent);
            }
            this.f22793a.releasePointerCapture();
            return false;
        }
    }

    public class e implements View.OnGenericMotionListener {

        /* renamed from: a, reason: collision with root package name */
        public float[] f22794a = new float[8];
        public final /* synthetic */ SurfaceView b;

        public e(SurfaceView surfaceView) {
            this.b = surfaceView;
        }

        public final float a(MotionEvent motionEvent, InputDevice inputDevice, int i10, int i11) {
            InputDevice.MotionRange motionRange = inputDevice.getMotionRange(i10, motionEvent.getSource());
            if (motionRange == null) {
                return 0.0f;
            }
            float flat = motionRange.getFlat();
            float axisValue = i11 < 0 ? motionEvent.getAxisValue(i10) : motionEvent.getHistoricalAxisValue(i10, i11);
            if (Math.abs(axisValue) > flat) {
                return axisValue;
            }
            return 0.0f;
        }

        public final void b(MotionEvent motionEvent, int i10) {
            InputDevice device = motionEvent.getDevice();
            if (device == null) {
                return;
            }
            this.f22794a[0] = a(motionEvent, device, 0, i10);
            this.f22794a[1] = a(motionEvent, device, 1, i10);
            this.f22794a[2] = a(motionEvent, device, 11, i10);
            this.f22794a[3] = a(motionEvent, device, 14, i10);
            this.f22794a[4] = Math.max(a(motionEvent, device, 17, i10), a(motionEvent, device, 23, i10));
            this.f22794a[5] = Math.max(a(motionEvent, device, 18, i10), a(motionEvent, device, 22, i10));
            this.f22794a[6] = a(motionEvent, device, 15, i10);
            this.f22794a[7] = a(motionEvent, device, 16, i10);
        }

        @Override // android.view.View.OnGenericMotionListener
        public boolean onGenericMotion(View view, MotionEvent motionEvent) {
            if ((motionEvent.getSource() & InputDeviceCompat.SOURCE_MOUSE) == 8194 || (motionEvent.getSource() & InputDeviceCompat.SOURCE_TOUCHPAD) == 1048584) {
                if (!NativeInputInterface.nativeGetMainWindowIsMouseLockedCenter() || this.b.hasPointerCapture()) {
                    return f.this.y(motionEvent);
                }
                this.b.requestPointerCapture();
                return false;
            }
            if ((motionEvent.getSource() & InputDeviceCompat.SOURCE_GAMEPAD) != 1025 && (motionEvent.getSource() & InputDeviceCompat.SOURCE_JOYSTICK) != 16777232) {
                return false;
            }
            if (motionEvent.getDevice() == null) {
                q.b("rbx.input", "Motion event is from a disconnected device");
                return false;
            }
            int historySize = motionEvent.getHistorySize();
            for (int i10 = 0; i10 < historySize; i10++) {
                b(motionEvent, i10);
            }
            b(motionEvent, -1);
            int deviceId = motionEvent.getDeviceId();
            f.this.o(deviceId);
            int i11 = 0;
            while (true) {
                float[] fArr = this.f22794a;
                if (i11 >= fArr.length) {
                    return true;
                }
                switch (i11) {
                    case 0:
                        NativeInputInterface.nativeGamepadAxisEvent(deviceId, 0, fArr[0], -fArr[1], 0.0f);
                        break;
                    case 1:
                        NativeInputInterface.nativeGamepadAxisEvent(deviceId, 1, fArr[0], -fArr[1], 0.0f);
                        break;
                    case 2:
                        NativeInputInterface.nativeGamepadAxisEvent(deviceId, 11, fArr[2], -fArr[3], 0.0f);
                        break;
                    case 3:
                        NativeInputInterface.nativeGamepadAxisEvent(deviceId, 14, fArr[2], -fArr[3], 0.0f);
                        break;
                    case 4:
                        NativeInputInterface.nativeGamepadAxisEvent(deviceId, 17, 0.0f, 0.0f, fArr[4]);
                        break;
                    case 5:
                        NativeInputInterface.nativeGamepadAxisEvent(deviceId, 18, 0.0f, 0.0f, fArr[5]);
                        break;
                    case 6:
                        NativeInputInterface.nativeGamepadAxisEvent(deviceId, 15, 0.0f, 0.0f, fArr[6]);
                        break;
                    case 7:
                        NativeInputInterface.nativeGamepadAxisEvent(deviceId, 16, 0.0f, 0.0f, -fArr[7]);
                        break;
                }
                i11++;
            }
        }
    }

    /* renamed from: kk.f$f, reason: collision with other inner class name */
    public interface InterfaceC0401f {
        boolean b();
    }

    public final class g implements GestureDetector.OnGestureListener {

        /* renamed from: a, reason: collision with root package name */
        public int f22796a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f22797c;

        /* renamed from: d, reason: collision with root package name */
        public int f22798d;

        /* renamed from: e, reason: collision with root package name */
        public int f22799e;

        /* renamed from: f, reason: collision with root package name */
        public int f22800f;

        /* renamed from: g, reason: collision with root package name */
        public VelocityTracker f22801g;

        public void a() {
            this.b = -1;
            VelocityTracker velocityTracker = this.f22801g;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f22801g = null;
            }
            f.this.f22779p = false;
            NativeInputInterface.nativePassPanGestureWithVelocity(2, this.f22797c, this.f22798d, this.f22799e, this.f22800f, 0.0f, 0.0f);
        }

        public void b(MotionEvent motionEvent) {
            if (rh.h.a().f0()) {
                this.b = -1;
                VelocityTracker velocityTracker = this.f22801g;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f22801g = null;
                }
                f.this.f22779p = false;
                NativeInputInterface.nativePassPanGestureMultitouch(2, f.r(motionEvent, f.this.q()), this.f22799e, this.f22800f, 0.0f, 0.0f);
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (motionEvent == null || motionEvent2 == null || (motionEvent.getSource() & InputDeviceCompat.SOURCE_MOUSE) == 8194) {
                return false;
            }
            try {
                float q10 = f.this.q();
                int x10 = (int) (motionEvent2.getX() / q10);
                int y10 = (int) (motionEvent2.getY() / q10);
                int x11 = (int) (motionEvent.getX() / q10);
                int y11 = (int) (motionEvent.getY() / q10);
                float f12 = y10 - y11;
                float f13 = x10 - x11;
                if (Math.abs(f13) > Math.abs(f12)) {
                    if (Math.abs(f13) > 50.0f && Math.abs(f10) > 50.0f) {
                        if (f13 > 0.0f) {
                            f.this.C(x11, y11);
                        } else {
                            f.this.B(x11, y11);
                        }
                    }
                } else if (Math.abs(f12) > 50.0f && Math.abs(f11) > 50.0f) {
                    if (f12 > 0.0f) {
                        f.this.A(x11, y11);
                    } else {
                        f.this.D(x11, y11);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if ((motionEvent.getSource() & InputDeviceCompat.SOURCE_MOUSE) == 8194) {
                return;
            }
            this.f22796a = motionEvent.getPointerId(motionEvent.getActionIndex());
            float q10 = f.this.q();
            NativeInputInterface.nativePassLongPressGesture(0, motionEvent.getX() / q10, motionEvent.getY() / q10);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            boolean z10;
            float f12;
            float f13;
            if (motionEvent != null && motionEvent2 != null) {
                if (this.b == -1) {
                    z10 = true;
                    f.this.f22779p = true;
                } else {
                    z10 = false;
                }
                this.b = motionEvent2.getPointerId(motionEvent2.getActionIndex());
                float q10 = f.this.q();
                int i10 = this.f22797c;
                int i11 = this.f22798d;
                this.f22797c = (int) (motionEvent2.getX() / q10);
                this.f22798d = (int) (motionEvent2.getY() / q10);
                int x10 = (int) (motionEvent.getX() / q10);
                int y10 = (int) (motionEvent.getY() / q10);
                this.f22799e = this.f22797c - x10;
                this.f22800f = this.f22798d - y10;
                if ((motionEvent.getSource() & InputDeviceCompat.SOURCE_MOUSE) == 8194) {
                    if (z10) {
                        i10 = this.f22797c;
                        i11 = this.f22798d;
                    }
                    NativeInputInterface.nativePassMousePan(x10, y10, ((this.f22797c - i10) * 7.0f) / (f.this.f22765a.getWidth() / q10), ((this.f22798d - i11) * 7.0f) / (f.this.f22765a.getHeight() / q10));
                    return false;
                }
                if (z10) {
                    if (rh.h.a().f0()) {
                        NativeInputInterface.nativePassPanGestureMultitouch(0, f.r(motionEvent2, q10), this.f22799e, this.f22800f, 0.0f, 0.0f);
                    } else {
                        NativeInputInterface.nativePassPanGestureWithVelocity(0, this.f22797c, this.f22798d, this.f22799e, this.f22800f, 0.0f, 0.0f);
                    }
                    if (this.f22801g == null) {
                        this.f22801g = VelocityTracker.obtain();
                    }
                    this.f22801g.addMovement(motionEvent2);
                } else {
                    VelocityTracker velocityTracker = this.f22801g;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent2);
                        this.f22801g.computeCurrentVelocity(1000);
                        f12 = this.f22801g.getXVelocity() / q10;
                        f13 = this.f22801g.getYVelocity() / q10;
                    } else {
                        f12 = 0.0f;
                        f13 = 0.0f;
                    }
                    if (rh.h.a().f0()) {
                        NativeInputInterface.nativePassPanGestureMultitouch(1, f.r(motionEvent2, q10), this.f22799e, this.f22800f, f12, f13);
                    } else {
                        NativeInputInterface.nativePassPanGestureWithVelocity(1, this.f22797c, this.f22798d, this.f22799e, this.f22800f, f12, f13);
                    }
                }
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if ((motionEvent.getSource() & InputDeviceCompat.SOURCE_MOUSE) == 8194) {
                return false;
            }
            float q10 = f.this.q();
            NativeInputInterface.nativePassTapGesture((int) (motionEvent.getX() / q10), (int) (motionEvent.getY() / q10));
            return false;
        }

        public g() {
            this.f22796a = -1;
            this.b = -1;
            this.f22797c = 0;
            this.f22798d = 0;
            this.f22799e = 0;
            this.f22800f = 0;
        }
    }

    public class h {

        /* renamed from: a, reason: collision with root package name */
        public float f22803a;
        public float b;

        /* renamed from: c, reason: collision with root package name */
        public int f22804c;

        /* renamed from: d, reason: collision with root package name */
        public float f22805d;

        /* renamed from: e, reason: collision with root package name */
        public float f22806e;

        /* renamed from: f, reason: collision with root package name */
        public int f22807f;

        public h() {
        }

        public int a() {
            return this.f22804c;
        }

        public float b() {
            return this.f22803a;
        }

        public float c() {
            return this.b;
        }

        public void d(int i10) {
            this.f22807f = this.f22804c;
            this.f22804c = i10;
        }

        public void e(float f10) {
            this.f22805d = this.f22803a;
            this.f22803a = f10;
        }

        public void f(float f10) {
            this.f22806e = this.b;
            this.b = f10;
        }
    }

    public f(@NonNull Activity activity, SurfaceView surfaceView, InterfaceC0401f interfaceC0401f) {
        this.f22765a = null;
        this.b = true;
        this.f22766c = null;
        this.f22767d = null;
        this.f22768e = null;
        this.f22769f = null;
        this.f22771h = null;
        this.f22772i = null;
        this.f22773j = null;
        this.f22774k = null;
        this.f22765a = surfaceView;
        this.A = activity;
        boolean hasSystemFeature = activity.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        this.b = hasSystemFeature;
        this.B = interfaceC0401f;
        if (hasSystemFeature || !a1.q0()) {
            this.f22767d = new g();
            this.f22766c = new GestureDetector(activity, this.f22767d);
            this.f22768e = new i(this);
            this.f22769f = new j(this);
        }
        G(surfaceView);
        this.f22771h = (SensorManager) activity.getBaseContext().getSystemService("sensor");
        this.f22788y = (InputManager) activity.getBaseContext().getSystemService("input");
        v();
        this.f22772i = this.f22771h.getDefaultSensor(1);
        Sensor defaultSensor = this.f22771h.getDefaultSensor(11);
        this.f22773j = defaultSensor;
        if (defaultSensor != null) {
            NativeInputInterface.nativeSetGyroscopeEnabled(true);
        }
        if (this.f22772i != null) {
            NativeInputInterface.nativeSetAccelerometerEnabled(true);
        }
        a aVar = new a(activity, 3);
        this.f22774k = aVar;
        if (aVar.canDetectOrientation()) {
            this.f22774k.enable();
        }
        this.D = rh.h.a().q5();
    }

    public static float[] n(int i10, float[] fArr) {
        int[] iArr = new int[][]{new int[]{1, -1, 0, 1}, new int[]{-1, -1, 1, 0}, new int[]{-1, 1, 0, 1}, new int[]{1, 1, 1, 0}}[i10];
        return new float[]{iArr[0] * fArr[iArr[2]], iArr[1] * fArr[iArr[3]], fArr[2]};
    }

    public static float[] r(MotionEvent motionEvent, float f10) {
        int pointerCount = motionEvent.getPointerCount();
        float[] fArr = new float[pointerCount * 2];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int i11 = i10 * 2;
            fArr[i11] = motionEvent.getX(i10) / f10;
            fArr[i11 + 1] = motionEvent.getY(i10) / f10;
        }
        return fArr;
    }

    public static int x(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        if (upperCase.contains("XBOX")) {
            return 3;
        }
        if (upperCase.contains("DUALSENSE") || upperCase.contains("PS5")) {
            return 2;
        }
        return (upperCase.contains("DUALSHOCK") || upperCase.contains("PS4") || upperCase.contains("PLAYSTATION")) ? 1 : 0;
    }

    public void A(int i10, int i11) {
        NativeInputInterface.nativePassSwipeGesture(1, i10, i11);
    }

    public void B(int i10, int i11) {
        NativeInputInterface.nativePassSwipeGesture(2, i10, i11);
    }

    public void C(int i10, int i11) {
        NativeInputInterface.nativePassSwipeGesture(0, i10, i11);
    }

    public void D(int i10, int i11) {
        NativeInputInterface.nativePassSwipeGesture(3, i10, i11);
    }

    public final void E(int i10, int i11) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        boolean[] zArr = new boolean[F.length];
        InputDevice inputDevice = this.f22788y.getInputDevice(i10);
        if (inputDevice != null) {
            zArr = inputDevice.hasKeys(F);
        }
        for (int i12 = 0; i12 < zArr.length; i12++) {
            hashMap.put(Integer.valueOf(F[i12]), Boolean.valueOf(zArr[i12]));
        }
        Boolean bool = Boolean.FALSE;
        hashMap2.put(0, bool);
        hashMap2.put(1, bool);
        hashMap2.put(11, bool);
        hashMap2.put(14, bool);
        hashMap2.put(23, bool);
        hashMap2.put(22, bool);
        hashMap2.put(17, bool);
        hashMap2.put(18, bool);
        hashMap2.put(15, bool);
        hashMap2.put(16, bool);
        InputDevice device = InputDevice.getDevice(i10);
        if (device != null) {
            Iterator<InputDevice.MotionRange> it = device.getMotionRanges().iterator();
            while (it.hasNext()) {
                hashMap2.put(Integer.valueOf(it.next().getAxis()), Boolean.TRUE);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            NativeInputInterface.nativeSetGamepadSupportedKeyWithGamepadType(i10, ((Integer) entry.getKey()).intValue(), ((Boolean) entry.getValue()).booleanValue(), i11);
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            Integer num = (Integer) entry2.getKey();
            Boolean bool2 = (Boolean) entry2.getValue();
            NativeInputInterface.nativeSetGamepadSupportedMotionWithGamepadType(i10, num.intValue(), -1, bool2.booleanValue(), i11);
            if (num.intValue() == 15 || num.intValue() == 16) {
                NativeInputInterface.nativeSetGamepadSupportedMotionWithGamepadType(i10, num.intValue(), 1, bool2.booleanValue(), i11);
            }
        }
    }

    public final void F(int i10) {
        boolean[] zArr = new boolean[G.length];
        InputDevice inputDevice = this.f22788y.getInputDevice(i10);
        if (inputDevice != null) {
            zArr = inputDevice.hasKeys(G);
        }
        for (int i11 = 0; i11 < zArr.length; i11++) {
            NativeInputInterface.nativeSetTVRemoteSupportedKey(i10, G[i11], zArr[i11]);
        }
    }

    public final void G(final SurfaceView surfaceView) {
        surfaceView.setOnKeyListener(new c());
        surfaceView.setOnCapturedPointerListener(new d(surfaceView));
        this.A.getWindow().getDecorView().getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: kk.e
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                f.this.w(surfaceView, z10);
            }
        });
        surfaceView.setOnGenericMotionListener(new e(surfaceView));
    }

    public void H(boolean z10) {
        if (!this.f22775l) {
            this.f22775l = z10;
        }
        if (this.f22775l) {
            this.f22771h.registerListener(this, this.f22773j, 1);
            this.f22771h.registerListener(this, this.f22772i, 1);
        }
    }

    public void I() {
        this.f22771h.unregisterListener(this);
    }

    public final void J() {
        Activity activity = this.A;
        if (activity == null) {
            return;
        }
        WindowManager windowManager = activity.getWindowManager();
        int rotation = windowManager.getDefaultDisplay().getRotation();
        int i10 = 0;
        Point point = new Point(0, 0);
        windowManager.getDefaultDisplay().getSize(point);
        if (point.x < point.y) {
            i10 = 3;
        } else if (rotation == 0 || rotation == 2 ? rotation != 2 : rotation != 3) {
            i10 = 1;
        }
        NativeInputInterface.nativeUpdateScreenOrientation(i10);
    }

    @Override // kk.j.a
    public void a(j jVar) {
        Point a10 = jVar.a();
        Point b10 = jVar.b();
        float c10 = jVar.c();
        int d10 = jVar.d();
        float q10 = q();
        this.f22779p = true;
        if (d10 == 0) {
            this.f22780q = 1.0f;
        }
        if (this.f22778o) {
            NativeInputInterface.nativePassMousePinch(a10.x / q10, a10.y / q10, (c10 - this.f22780q) * 3.5f);
        } else {
            NativeInputInterface.nativePassPinchGesture(d10, c10, 0.0f, (int) (a10.x / q10), (int) (a10.y / q10), (int) (b10.x / q10), (int) (b10.y / q10));
        }
        this.f22780q = c10;
    }

    @Override // kk.i.a
    public void b(i iVar) {
        float b10 = iVar.b();
        int e10 = iVar.e();
        Point c10 = iVar.c();
        Point d10 = iVar.d();
        NativeInputInterface.nativePassRotateGesture(e10, b10, 0.0f, c10.x, c10.y, d10.x, d10.y);
    }

    public final void o(int i10) {
        if (this.f22788y.getInputDevice(i10) == null) {
            q.b("rbx.input", "inputDevice is null for device ID: " + i10);
            return;
        }
        if (this.f22786w.add(Integer.valueOf(i10))) {
            InputDevice inputDevice = this.f22788y.getInputDevice(i10);
            int x10 = x(inputDevice != null ? inputDevice.getName() : "");
            E(i10, x10);
            NativeInputInterface.nativeGamepadConnectEventWithGamepadType(i10, x10);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int rotation = ((WindowManager) this.A.getBaseContext().getSystemService("window")).getDefaultDisplay().getRotation();
        if (sensorEvent.sensor.getType() == 11) {
            SensorManager.getQuaternionFromVector(this.f22781r, n(rotation, sensorEvent.values));
            SensorManager.getRotationMatrixFromVector(this.f22782s, this.f22781r);
            SensorManager.getOrientation(this.f22782s, this.f22783t);
            float[] fArr = this.f22783t;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float[] fArr2 = this.f22781r;
            NativeInputInterface.nativePassGyroscopeChange(f10, f11, f12, fArr2[0], fArr2[2], fArr2[3], fArr2[1]);
            return;
        }
        if (sensorEvent.sensor.getType() == 1) {
            float[] fArr3 = this.f22784u;
            float f13 = fArr3[0] * 0.8f;
            float[] fArr4 = sensorEvent.values;
            float f14 = f13 + (fArr4[0] * 0.19999999f);
            fArr3[0] = f14;
            float f15 = (fArr3[1] * 0.8f) + (fArr4[1] * 0.19999999f);
            fArr3[1] = f15;
            float f16 = (fArr3[2] * 0.8f) + (fArr4[2] * 0.19999999f);
            fArr3[2] = f16;
            float[] fArr5 = this.f22785v;
            fArr5[0] = fArr4[0] - f14;
            fArr5[1] = fArr4[1] - f15;
            fArr5[2] = fArr4[2] - f16;
            float[] n10 = n(rotation, fArr5);
            float[] n11 = n(rotation, this.f22784u);
            NativeInputInterface.nativePassAccelerometerChange(-n10[1], n10[2], n10[0]);
            NativeInputInterface.nativePassGravityChange(-n11[1], -n11[2], n11[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030f A[LOOP:1: B:82:0x0309->B:84:0x030f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0330  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r18, android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.f.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void p(int i10) {
        if (this.f22788y.getInputDevice(i10) == null) {
            q.b("rbx.input", "inputDevice is null for device ID: " + i10);
            return;
        }
        if (this.f22787x.add(Integer.valueOf(i10))) {
            F(i10);
            NativeInputInterface.nativeTVRemoteConnectEvent(i10);
        }
    }

    public final float q() {
        return cl.a.e(this.A);
    }

    public final void s(int i10) {
    }

    public final void t(int i10) {
    }

    public final void u(int i10) {
        if (this.f22786w.remove(Integer.valueOf(i10))) {
            E(i10, 0);
            NativeInputInterface.nativeGamepadDisconnectEvent(i10);
        }
        if (this.f22787x.remove(Integer.valueOf(i10))) {
            F(i10);
            NativeInputInterface.nativeTVRemoteDisconnectEvent(i10);
        }
    }

    public final void v() {
        b bVar = new b();
        this.f22789z = bVar;
        this.f22788y.registerInputDeviceListener(bVar, null);
    }

    public final /* synthetic */ void w(SurfaceView surfaceView, boolean z10) {
        if (z10) {
            if (!rh.h.a().U1()) {
                surfaceView.requestFocus();
                return;
            }
            Activity activity = this.A;
            if ((activity instanceof e4.q) && ((e4.q) activity).l1().u0() == 0) {
                surfaceView.requestFocus();
            }
        }
    }

    public boolean y(MotionEvent motionEvent) {
        if (this.f22779p) {
            return true;
        }
        if (motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 2) {
            float x10 = motionEvent.getX() / q();
            float y10 = motionEvent.getY() / q();
            float f10 = x10 - this.f22776m;
            float f11 = y10 - this.f22777n;
            this.f22776m = x10;
            this.f22777n = y10;
            NativeInputInterface.nativePassMouseMove(x10, y10, f10, f11);
            return true;
        }
        if (motionEvent.getActionMasked() == 11) {
            NativeInputInterface.nativePassMouseButton(this.f22776m, this.f22777n, true, motionEvent.getActionButton() - 1);
            return true;
        }
        if (motionEvent.getActionMasked() == 12) {
            NativeInputInterface.nativePassMouseButton(this.f22776m, this.f22777n, false, motionEvent.getActionButton() - 1);
            return true;
        }
        if (motionEvent.getActionMasked() != 8) {
            return motionEvent.getActionMasked() == 0;
        }
        float f12 = this.f22776m;
        if (f12 <= 0.0f) {
            f12 = 0.0f;
        }
        float f13 = this.f22777n;
        NativeInputInterface.nativePassMouseWheel(f12, f13 > 0.0f ? f13 : 0.0f, motionEvent.getAxisValue(9));
        return true;
    }

    public boolean z(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 7 && motionEvent.getActionMasked() != 2) {
            return y(motionEvent);
        }
        float axisValue = motionEvent.getAxisValue(27) / q();
        float axisValue2 = motionEvent.getAxisValue(28) / q();
        if (!rh.h.a().J()) {
            this.f22776m += axisValue;
            this.f22777n += axisValue2;
        }
        NativeInputInterface.nativePassMouseMove(this.f22776m, this.f22777n, axisValue, axisValue2);
        return true;
    }
}
