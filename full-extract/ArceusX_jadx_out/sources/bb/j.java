package bb;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class j extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final Looper f3948a;

    public j(Looper looper) {
        super(looper);
        this.f3948a = Looper.getMainLooper();
    }

    public j(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f3948a = Looper.getMainLooper();
    }
}
