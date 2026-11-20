package c1;

import android.content.Context;
import android.hardware.camera2.CameraManager;

/* loaded from: classes.dex */
public class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final CameraManager f4448a;

    public c(Context context) {
        this.f4448a = (CameraManager) context.getSystemService(CameraManager.class);
    }

    @Override // c1.f
    public d a(String str) {
        return new b(this.f4448a, str);
    }
}
