package nm;

import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.universalapp.messagebus.MessageBus;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final MessageBus f27204a;

    /* renamed from: nm.a$a, reason: collision with other inner class name */
    public static class C0463a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27205a = new a(null);
    }

    public a(MessageBus messageBus) {
        this.f27204a = messageBus == null ? MessageBus.f() : messageBus;
    }

    public static a c() {
        return C0463a.f27205a;
    }

    public void a() {
        Log.v("RealtimeProtocol", "App Resumed");
        this.f27204a.l(b.APP_RESUME_ID, new JSONObject());
    }

    public void b() {
        Log.v("RealtimeProtocol", "App Stopped");
        this.f27204a.l(b.APP_STOP_ID, new JSONObject());
    }
}
