package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import ca.i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eb.k2;
import eb.m2;
import eb.y2;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import n9.k;
import n9.m;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new i();

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f6089g = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f6090f;

    public zzak(byte[][] bArr) {
        m.a(bArr != null);
        m.a(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            m.a(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            m.a(bArr[i11] != null);
            int length = bArr[i11].length;
            m.a(length == 32 || length == 64);
            i10 += 2;
        }
        this.f6090f = bArr;
    }

    public static zzak a(JSONObject jSONObject, boolean z10) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z10) {
                    arrayList.add(x3(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(y3(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(u9.c.a(next));
                    if (z10) {
                        arrayList.add(x3(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(y3(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new zzak((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject v3(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", u9.c.b(bArr));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    public static byte[] w3(byte[] bArr) {
        k2 zza = m2.a().zza();
        zza.a(f6089g);
        zza.a(bArr);
        return zza.zzc().d();
    }

    public static byte[] x3(JSONObject jSONObject) {
        byte[] a10 = u9.c.a(jSONObject.getString("first"));
        if (a10.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return a10;
        }
        byte[] a11 = u9.c.a(jSONObject.getString("second"));
        if (a11.length == 32) {
            return y2.a(a10, a11);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] y3(JSONObject jSONObject) {
        byte[] w32 = w3(u9.c.a(jSONObject.getString("first")));
        return !jSONObject.has("second") ? w32 : y2.a(w32, w3(u9.c.a(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzak) {
            return Arrays.deepEquals(this.f6090f, ((zzak) obj).f6090f);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        for (byte[] bArr : this.f6090f) {
            if (bArr != null) {
                i10 ^= k.c(bArr);
            }
        }
        return i10;
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            int i10 = 0;
            JSONObject jSONObject2 = null;
            while (true) {
                byte[][] bArr = this.f6090f;
                if (i10 >= bArr.length) {
                    return "PrfExtension{" + jSONObject.toString() + "}";
                }
                if (bArr[i10] == null) {
                    jSONObject.put("eval", v3(bArr[i10 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(u9.c.b(this.f6090f[i10]), v3(this.f6090f[i10 + 1]));
                }
                i10 += 2;
            }
        } catch (JSONException e10) {
            return "PrfExtension{Exception:" + e10.getMessage() + "}";
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[][] bArr = this.f6090f;
        int a10 = o9.b.a(parcel);
        o9.b.h(parcel, 1, bArr, false);
        o9.b.b(parcel, a10);
    }
}
