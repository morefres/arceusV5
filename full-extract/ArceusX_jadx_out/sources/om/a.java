package om;

import android.util.Log;
import com.roblox.universalapp.messagebus.MessageBus;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    public static final String b = MessageBus.getMessageId("Screen", "safeAreaInsets");

    /* renamed from: a, reason: collision with root package name */
    public final MessageBus f27972a = MessageBus.f();

    /* renamed from: om.a$a, reason: collision with other inner class name */
    public static class C0491a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27973a = new a();
    }

    public static a b() {
        return C0491a.f27973a;
    }

    public void a(float f10, float f11, float f12, float f13) {
        Log.d("ScreenProtocol", String.format("Sending safe area insets: left: %f, top: %f, right: %f, bottom: %f", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13)));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("left", f10);
            jSONObject.put("top", f11);
            jSONObject.put("right", f12);
            jSONObject.put("bottom", f13);
            this.f27972a.l(b, jSONObject);
        } catch (JSONException e10) {
            Log.e("ScreenProtocol", "Sending safe area insets failed with error: " + e10.getMessage());
        }
    }
}
