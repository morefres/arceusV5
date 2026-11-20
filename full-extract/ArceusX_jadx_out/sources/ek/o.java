package ek;

import android.util.Log;
import com.appsflyer.sdk_base.referrer.Payload;
import gt.n;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/json/JSONObject;", Payload.SOURCE, "", ve.a.f33391e, "(Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "utils_googleRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class o {
    public static final void a(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        Object b;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (jSONObject2 == null) {
            return;
        }
        try {
            n.Companion companion = gt.n.INSTANCE;
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, jSONObject2.get(next));
            }
            b = gt.n.b(Unit.f22894a);
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b = gt.n.b(gt.o.a(th2));
        }
        Throwable e10 = gt.n.e(b);
        if (e10 != null) {
            Log.e("JSONObjectUtils", "merge: ", e10);
        }
    }
}
