package hq;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000@\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\f\u001a\u00020\u000b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000f\u001a\u00020\u000b*\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0012\u0010\r\u001a-\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001b\u001a\u00020\u0017*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a+\u0010\u001d\u001a\u00020\u000b*\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u001d\u0010\u0016\u001a\u001b\u0010 \u001a\u00020\u0017*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"", "json", "", "", "colorMap", "j", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "Lorg/json/JSONObject;", "", "Lhq/f;", "mappings", "", "h", "(Lorg/json/JSONObject;Ljava/util/List;)V", "Lorg/json/JSONArray;", "f", "(Lorg/json/JSONArray;Ljava/util/List;)V", "gradientJson", "i", "data", "colorStops", "g", "(Lorg/json/JSONArray;ILjava/util/List;)V", "", j6.b.f21518e, "(Lorg/json/JSONArray;)Z", "startIndex", "c", "(Lorg/json/JSONArray;I)Z", rl.d.f30696a, "", "other", ve.a.f33391e, "(DD)Z", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n {
    public static final boolean a(double d10, double d11) {
        return d10 < d11 + 0.01d && d10 > d11 - 0.01d;
    }

    public static final boolean b(JSONArray jSONArray) {
        if (jSONArray.length() != 3) {
            return false;
        }
        return c(jSONArray, 0);
    }

    public static final boolean c(JSONArray jSONArray, int i10) {
        int i11 = i10 + 3;
        if (i11 > jSONArray.length()) {
            return false;
        }
        while (i10 < i11) {
            double optDouble = jSONArray.optDouble(i10, Double.NaN);
            if (Double.isNaN(optDouble) || optDouble < 0.0d || optDouble > 1.0d) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static final void d(JSONArray jSONArray, int i10, List<f> list) {
        Object obj;
        if (i10 + 3 > jSONArray.length()) {
            return;
        }
        double d10 = jSONArray.getDouble(i10);
        int i11 = i10 + 1;
        double d11 = jSONArray.getDouble(i11);
        int i12 = i10 + 2;
        double d12 = jSONArray.getDouble(i12);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            f fVar = (f) obj;
            if (a(d10, fVar.getSrcR()) && a(d11, fVar.getSrcG()) && a(d12, fVar.getSrcB())) {
                break;
            }
        }
        f fVar2 = (f) obj;
        if (fVar2 == null) {
            return;
        }
        jSONArray.put(i10, fVar2.getDestR());
        jSONArray.put(i11, fVar2.getDestG());
        jSONArray.put(i12, fVar2.getDestB());
    }

    public static /* synthetic */ void e(JSONArray jSONArray, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        d(jSONArray, i10, list);
    }

    public static final void f(JSONArray jSONArray, List<f> list) {
        if (b(jSONArray)) {
            e(jSONArray, 0, list, 1, null);
            return;
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONObject) {
                h((JSONObject) obj, list);
            } else if (obj instanceof JSONArray) {
                f((JSONArray) obj, list);
            }
        }
    }

    public static final void g(JSONArray jSONArray, int i10, List<f> list) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = (i11 * 4) + 1;
            if (c(jSONArray, i12)) {
                d(jSONArray, i12, list);
            }
        }
    }

    public static final void h(JSONObject jSONObject, List<f> list) {
        if (Intrinsics.c(jSONObject.optString("ty"), "gf")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("g");
            if (optJSONObject == null) {
                return;
            }
            i(optJSONObject, list);
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            Object obj = jSONObject.get(keys.next());
            if (obj instanceof JSONObject) {
                h((JSONObject) obj, list);
            } else if (obj instanceof JSONArray) {
                f((JSONArray) obj, list);
            }
        }
    }

    public static final void i(JSONObject jSONObject, List<f> list) {
        int optInt = jSONObject.optInt("p", 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("k");
        if (optJSONObject == null) {
            return;
        }
        if (optJSONObject.optInt(ve.a.f33391e, 0) == 0) {
            JSONArray optJSONArray = optJSONObject.optJSONArray("k");
            if (optJSONArray == null) {
                return;
            }
            g(optJSONArray, optInt, list);
            return;
        }
        JSONArray optJSONArray2 = optJSONObject.optJSONArray("k");
        if (optJSONArray2 == null) {
            return;
        }
        int length = optJSONArray2.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i10);
            if (optJSONObject2 != null) {
                JSONArray optJSONArray3 = optJSONObject2.optJSONArray("s");
                if (optJSONArray3 != null) {
                    g(optJSONArray3, optInt, list);
                }
                JSONArray optJSONArray4 = optJSONObject2.optJSONArray("e");
                if (optJSONArray4 != null) {
                    g(optJSONArray4, optInt, list);
                }
            }
        }
    }

    @NotNull
    public static final String j(@NotNull String json, @NotNull Map<Integer, Integer> colorMap) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(colorMap, "colorMap");
        if (colorMap.isEmpty()) {
            return json;
        }
        ArrayList arrayList = new ArrayList(colorMap.size());
        for (Map.Entry<Integer, Integer> entry : colorMap.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            arrayList.add(new f(Color.red(intValue) / 255.0d, Color.green(intValue) / 255.0d, Color.blue(intValue) / 255.0d, Color.red(intValue2) / 255.0d, Color.green(intValue2) / 255.0d, Color.blue(intValue2) / 255.0d));
        }
        JSONObject jSONObject = new JSONObject(json);
        h(jSONObject, arrayList);
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
