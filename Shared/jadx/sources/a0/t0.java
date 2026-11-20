package a0;

import a0.d0;
import a0.p0;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class t0 implements p0.b {

    /* renamed from: a, reason: collision with root package name */
    public final CameraManager f57a;
    public final Object b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map<CameraManager.AvailabilityCallback, p0.a> f58a = new HashMap();
        public final Handler b;

        public a(Handler handler) {
            this.b = handler;
        }
    }

    public t0(Context context, Object obj) {
        this.f57a = (CameraManager) context.getSystemService("camera");
        this.b = obj;
    }

    public static t0 i(Context context, Handler handler) {
        return new t0(context, new a(handler));
    }

    @Override // a0.p0.b
    public CameraManager a() {
        return this.f57a;
    }

    @Override // a0.p0.b
    public void b(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        p0.a aVar;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        a aVar2 = (a) this.b;
        if (availabilityCallback != null) {
            synchronized (aVar2.f58a) {
                try {
                    aVar = aVar2.f58a.get(availabilityCallback);
                    if (aVar == null) {
                        aVar = new p0.a(executor, availabilityCallback);
                        aVar2.f58a.put(availabilityCallback, aVar);
                    }
                } finally {
                }
            }
        } else {
            aVar = null;
        }
        this.f57a.registerAvailabilityCallback(aVar, aVar2.b);
    }

    @Override // a0.p0.b
    public CameraCharacteristics c(String str) {
        try {
            return this.f57a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        }
    }

    @Override // a0.p0.b
    public Set<Set<String>> d() {
        return Collections.EMPTY_SET;
    }

    @Override // a0.p0.b
    public void e(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        x2.g.g(executor);
        x2.g.g(stateCallback);
        try {
            this.f57a.openCamera(str, new d0.b(executor, stateCallback), ((a) this.b).b);
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        }
    }

    @Override // a0.p0.b
    public String[] f() {
        try {
            return this.f57a.getCameraIdList();
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        }
    }

    @Override // a0.p0.b
    public void g(CameraManager.AvailabilityCallback availabilityCallback) {
        p0.a aVar;
        if (availabilityCallback != null) {
            a aVar2 = (a) this.b;
            synchronized (aVar2.f58a) {
                aVar = aVar2.f58a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.d();
        }
        this.f57a.unregisterAvailabilityCallback(aVar);
    }
}
