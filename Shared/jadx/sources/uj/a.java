package uj;

import android.content.Context;
import android.text.TextUtils;
import ek.q;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public Context f32981a;

    public a(Context context) {
        this.f32981a = context;
    }

    public String a() {
        try {
            String h10 = h();
            if (h10 == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(h10);
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.put(next, jSONObject.getString(next));
            }
            return jSONObject2.toString();
        } catch (JSONException e10) {
            q.f("rbx.settings.local", "Failed to construct overridePayload", e10);
            return null;
        }
    }

    public void b() {
        File g10 = g();
        if (g10.exists()) {
            q.b("rbx.settings.local", "saveLocalSettings: file: " + g10.getName() + ", DeletedOK = " + g10.delete());
        }
    }

    public String c() {
        return e("FStringAuthCookie");
    }

    public final File d() {
        return new File("/data/local/tmp/ClientAppSettings.json");
    }

    public final String e(String str) {
        try {
            String h10 = h();
            if (h10 == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(h10);
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            q.k("rbx.settings.local", "getFlagValueFromSettings: '" + str + "' key not found in settings");
            return null;
        } catch (JSONException e10) {
            q.f("rbx.settings.local", "getFlagValueFromSettings: Failed to parse JSON", e10);
            return null;
        }
    }

    public final File f() {
        return this.f32981a.getApplicationContext().getFilesDir();
    }

    public final File g() {
        return new File(f(), "exe/ClientSettings/ClientAppSettings.json");
    }

    public String h() {
        try {
            return new JSONObject(i(d())).toString();
        } catch (JSONException unused) {
            q.e("rbx.settings.local", "Failed to read external JSON");
            return null;
        }
    }

    public final String i(File file) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
                sb2.append('\n');
            }
            bufferedReader.close();
        } catch (IOException e10) {
            q.e("rbx.settings.local", "Exception caught when readLocalSettings: file: " + file.getName() + ": " + e10);
        }
        return sb2.toString();
    }

    public String j() {
        File g10 = g();
        if (g10.exists()) {
            return i(g10);
        }
        return null;
    }

    public void k(String str) {
        if (TextUtils.isEmpty(str)) {
            b();
            q.d("Clear the existing settings.");
            return;
        }
        try {
            String jSONObject = new JSONObject(str).toString();
            File file = new File(f(), "exe/ClientSettings/");
            if (!file.exists() && !file.mkdirs()) {
                q.e("rbx.settings.local", "Failed to create the directory to hold Local settings.");
                return;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(g());
                fileOutputStream.write(jSONObject.getBytes());
                fileOutputStream.close();
            } catch (IOException e10) {
                q.e("rbx.settings.local", "File writing failed: " + e10.toString());
            }
        } catch (JSONException unused) {
            q.d("The input is not a valid JSON string");
        }
    }
}
