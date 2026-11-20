package dh;

import android.view.MotionEvent;
import ek.q;

/* loaded from: classes2.dex */
public class j {
    public static int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f14783c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static int f14784d = 2;

    /* renamed from: a, reason: collision with root package name */
    public int f14785a = b;

    public void a(int i10) {
        this.f14785a = i10;
    }

    public boolean b(MotionEvent motionEvent) {
        int i10 = this.f14785a;
        if (i10 > b) {
            if (i10 == f14783c && (motionEvent.getFlags() & 1) == 1) {
                q.b("rbx.input", "WINDOW_IS_OBSCURED");
                return false;
            }
            if (this.f14785a == f14784d && (motionEvent.getFlags() & 2) == 2) {
                q.b("rbx.input", "WINDOW_IS_PARTIALLY_OBSCURED");
                return false;
            }
        }
        return true;
    }
}
