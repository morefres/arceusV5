package j9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
public final class n extends bb.j {
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f21628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c cVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f21628c = cVar;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        c cVar = this.f21628c;
        int g10 = cVar.g(this.b);
        if (cVar.j(g10)) {
            this.f21628c.q(this.b, g10);
        }
    }
}
