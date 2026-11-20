package d0;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import java.util.Iterator;
import java.util.List;
import n0.l1;
import n0.u1;
import y.a;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14221a;

    public z() {
        this.f14221a = c0.e.b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public l1 a(l1 l1Var) {
        l1.a aVar = new l1.a();
        aVar.v(l1Var.k());
        Iterator<u1> it = l1Var.i().iterator();
        while (it.hasNext()) {
            aVar.f(it.next());
        }
        aVar.e(l1Var.g());
        a.C0666a c0666a = new a.C0666a();
        c0666a.f(CaptureRequest.FLASH_MODE, 0);
        aVar.e(c0666a.b());
        return aVar.h();
    }

    public boolean b(List<CaptureRequest> list, boolean z10) {
        if (!this.f14221a || !z10) {
            return false;
        }
        Iterator<CaptureRequest> it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next().get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
