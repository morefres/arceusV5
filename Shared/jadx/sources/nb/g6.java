package nb;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.vf;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26231a;
    public final Bundle b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f26232c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k6 f26233d;

    public g6(k6 k6Var, String str, Bundle bundle) {
        Objects.requireNonNull(k6Var);
        this.f26233d = k6Var;
        n9.m.f(str);
        this.f26231a = str;
        this.b = new Bundle();
    }

    public final Bundle a() {
        JSONObject jSONObject;
        String string;
        String string2;
        int hashCode;
        if (this.f26232c == null) {
            k6 k6Var = this.f26233d;
            String string3 = k6Var.p().getString(this.f26231a, null);
            if (string3 != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string3);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            jSONObject = jSONArray.getJSONObject(i10);
                            string = jSONObject.getString("n");
                            string2 = jSONObject.getString(zl.t.f38095d);
                            hashCode = string2.hashCode();
                        } catch (NumberFormatException | JSONException unused) {
                            this.f26233d.f26328a.a().o().a("Error reading value from SharedPreferences. Value dropped");
                        }
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode != 115) {
                                    if (hashCode != 3352) {
                                        if (hashCode == 3445 && string2.equals("la")) {
                                            vf.a();
                                            if (k6Var.f26328a.w().H(null, z4.R0)) {
                                                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                int length = jSONArray2.length();
                                                long[] jArr = new long[length];
                                                for (int i11 = 0; i11 < length; i11++) {
                                                    jArr[i11] = jSONArray2.optLong(i11);
                                                }
                                                bundle.putLongArray(string, jArr);
                                            }
                                        }
                                    } else if (string2.equals("ia")) {
                                        vf.a();
                                        if (k6Var.f26328a.w().H(null, z4.R0)) {
                                            JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                            int length2 = jSONArray3.length();
                                            int[] iArr = new int[length2];
                                            for (int i12 = 0; i12 < length2; i12++) {
                                                iArr[i12] = jSONArray3.optInt(i12);
                                            }
                                            bundle.putIntArray(string, iArr);
                                        }
                                    }
                                } else if (string2.equals("s")) {
                                    bundle.putString(string, jSONObject.getString("v"));
                                }
                            } else if (string2.equals("l")) {
                                bundle.putLong(string, Long.parseLong(jSONObject.getString("v")));
                            }
                        } else if (string2.equals(rl.d.f30696a)) {
                            bundle.putDouble(string, Double.parseDouble(jSONObject.getString("v")));
                        }
                        k6Var.f26328a.a().o().b("Unrecognized persisted bundle type. Type", string2);
                    }
                    this.f26232c = bundle;
                } catch (JSONException unused2) {
                    this.f26233d.f26328a.a().o().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f26232c == null) {
                this.f26232c = this.b;
            }
        }
        return new Bundle((Bundle) n9.m.l(this.f26232c));
    }

    public final void b(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        k6 k6Var = this.f26233d;
        SharedPreferences.Editor edit = k6Var.p().edit();
        if (bundle2.size() == 0) {
            edit.remove(this.f26231a);
        } else {
            String str = this.f26231a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        vf.a();
                        g7 g7Var = k6Var.f26328a;
                        if (!g7Var.w().H(null, z4.R0)) {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put(zl.t.f38095d, "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put(zl.t.f38095d, "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put(zl.t.f38095d, rl.d.f30696a);
                            } else {
                                g7Var.a().o().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                        } else if (obj instanceof String) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put(zl.t.f38095d, "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put(zl.t.f38095d, "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put(zl.t.f38095d, "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put(zl.t.f38095d, "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put(zl.t.f38095d, rl.d.f30696a);
                        } else {
                            g7Var.a().o().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        this.f26233d.f26328a.a().o().b("Cannot serialize bundle value to SharedPreferences", e10);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f26232c = bundle2;
    }
}
