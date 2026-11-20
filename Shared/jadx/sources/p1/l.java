package p1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import g0.x2;

/* loaded from: classes.dex */
public final class l extends i {
    public android.view.s R;

    public l(Context context) {
        super(context);
    }

    @Override // p1.i
    public g0.l K() {
        if (this.R == null) {
            Log.d("CamLifecycleController", "Lifecycle is not set.");
            return null;
        }
        if (this.f28301v == null) {
            Log.d("CamLifecycleController", "CameraProvider is not ready.");
            return null;
        }
        x2 j10 = j();
        if (j10 == null) {
            return null;
        }
        try {
            return this.f28301v.b(this.R, this.f28281a, j10);
        } catch (IllegalArgumentException e10) {
            throw new IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e10);
        }
    }

    @SuppressLint({"MissingPermission"})
    public void X(android.view.s sVar) {
        p0.z.b();
        this.R = sVar;
        L();
    }
}
