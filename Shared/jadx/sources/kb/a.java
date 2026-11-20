package kb;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final Looper f22482a;

    public a(Looper looper) {
        super(looper);
        this.f22482a = Looper.getMainLooper();
    }
}
