package dh;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Pair;
import android.widget.TextView;
import com.google.gson.stream.JsonReader;
import ek.n;
import ek.q;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import rg.s0;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static Map<Integer, Pair<String, Float>> f14749a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static Hashtable<String, Typeface> f14750a = new Hashtable<>();

        public static Typeface a(String str, Context context) {
            Typeface typeface = f14750a.get(str);
            if (typeface != null) {
                return typeface;
            }
            if (rh.h.a().e1()) {
                ek.d.a(str);
            }
            try {
                Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), str);
                f14750a.put(str, createFromAsset);
                return createFromAsset;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static Map<Integer, Pair<String, Float>> a(Context context) {
        try {
            HashMap hashMap = new HashMap();
            if (rh.h.a().e1()) {
                ek.d.a("android/fonts/font-mappings.json");
            }
            JsonReader r8 = n.b().r(new BufferedReader(new InputStreamReader(context.getAssets().open("android/fonts/font-mappings.json"))));
            r8.beginArray();
            while (r8.hasNext()) {
                String str = "";
                r8.beginObject();
                int i10 = -1;
                float f10 = 0.793f;
                while (r8.hasNext()) {
                    String nextName = r8.nextName();
                    if (nextName.equals("enum")) {
                        i10 = r8.nextInt();
                    } else if (nextName.equals("font")) {
                        str = r8.nextString();
                    } else if (nextName.equals("fromRbxFontRatio")) {
                        f10 = (float) r8.nextDouble();
                    } else {
                        r8.skipValue();
                    }
                }
                hashMap.put(Integer.valueOf(i10), Pair.create(str, Float.valueOf(f10)));
                r8.endObject();
            }
            r8.endArray();
            return hashMap;
        } catch (IOException e10) {
            q.f("rbx.glview.text", "Unable to parse mapping json", e10);
            return new HashMap();
        }
    }

    public static float b(int i10, Context context) {
        if (f14749a == null) {
            f14749a = a(context);
        }
        if (f14749a.containsKey(Integer.valueOf(i10))) {
            return ((Float) f14749a.get(Integer.valueOf(i10)).second).floatValue();
        }
        return 0.793f;
    }

    public static void c(TextView textView, Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s0.f30587z0);
        String string = obtainStyledAttributes.getString(s0.A0);
        if (string == null) {
            string = "SourceSansPro-Light.ttf";
        }
        d(textView, context, string);
        obtainStyledAttributes.recycle();
    }

    public static void d(TextView textView, Context context, String str) {
        if (str != null) {
            Typeface a10 = a.a("fonts/" + str, context);
            if (a10 != null) {
                textView.setTypeface(a10);
            }
        }
    }

    public static boolean e(TextView textView, Context context, int i10) {
        if (f14749a == null) {
            f14749a = a(context);
        }
        if (f14749a.containsKey(Integer.valueOf(i10))) {
            return f(textView, (String) f14749a.get(Integer.valueOf(i10)).first, context);
        }
        return false;
    }

    public static boolean f(TextView textView, String str, Context context) {
        if (str == null || !kk.c.p().j()) {
            return false;
        }
        Typeface a10 = a.a("content/fonts/" + str, context);
        if (a10 != null) {
            textView.setTypeface(a10);
            return true;
        }
        q.e("rbx.glview.text", String.format("Attempting to load non-existant font: %s.", str));
        return false;
    }
}
