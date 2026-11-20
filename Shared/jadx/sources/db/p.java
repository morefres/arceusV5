package db;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class p extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final Looper f14498a;

    public p(Looper looper) {
        super(looper);
        this.f14498a = Looper.getMainLooper();
    }

    public p(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f14498a = Looper.getMainLooper();
    }
}
