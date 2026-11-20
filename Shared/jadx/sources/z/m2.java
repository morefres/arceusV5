package z;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n0.a2;

/* loaded from: classes.dex */
public class m2 implements n0.z1 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f37302c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37303d;

    /* renamed from: e, reason: collision with root package name */
    public final int f37304e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<Integer, n0.a2> f37305f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final n0.k3 f37306g;

    public static class a {
        public static EncoderProfiles a(String str, int i10) {
            return CamcorderProfile.getAll(str, i10);
        }
    }

    public m2(String str, n0.k3 k3Var) {
        boolean z10;
        int i10;
        this.f37303d = str;
        try {
            i10 = Integer.parseInt(str);
            z10 = true;
        } catch (NumberFormatException unused) {
            g0.r1.l("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z10 = false;
            i10 = -1;
        }
        this.f37302c = z10;
        this.f37304e = i10;
        this.f37306g = k3Var;
    }

    @Override // n0.z1
    public boolean a(int i10) {
        return this.f37302c && b(i10) != null;
    }

    @Override // n0.z1
    public n0.a2 b(int i10) {
        n0.a2 a2Var = null;
        if (!this.f37302c || !CamcorderProfile.hasProfile(this.f37304e, i10)) {
            return null;
        }
        if (this.f37305f.containsKey(Integer.valueOf(i10))) {
            return this.f37305f.get(Integer.valueOf(i10));
        }
        n0.a2 f10 = f(i10);
        if (f10 == null || g(f10)) {
            a2Var = f10;
        } else if (i10 == 1) {
            a2Var = d();
        } else if (i10 == 0) {
            a2Var = e();
        }
        this.f37305f.put(Integer.valueOf(i10), a2Var);
        return a2Var;
    }

    public final n0.a2 c(int i10) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.f37304e, i10);
        } catch (RuntimeException e10) {
            g0.r1.m("Camera2EncoderProfilesProvider", "Unable to get CamcorderProfile by quality: " + i10, e10);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return o0.a.a(camcorderProfile);
        }
        return null;
    }

    public final n0.a2 d() {
        Iterator<Integer> it = n0.z1.b.iterator();
        while (it.hasNext()) {
            n0.a2 b = b(it.next().intValue());
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    public final n0.a2 e() {
        for (int size = n0.z1.b.size() - 1; size >= 0; size--) {
            n0.a2 b = b(size);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    public final n0.a2 f(int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles a10 = a.a(this.f37303d, i10);
            if (a10 == null) {
                return null;
            }
            if (c0.e.b(InvalidVideoProfilesQuirk.class) != null) {
                g0.r1.a("Camera2EncoderProfilesProvider", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return o0.a.b(a10);
                } catch (NullPointerException e10) {
                    g0.r1.m("Camera2EncoderProfilesProvider", "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e10);
                }
            }
        }
        return c(i10);
    }

    public final boolean g(n0.a2 a2Var) {
        CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.f37306g.b(CamcorderProfileResolutionQuirk.class);
        if (camcorderProfileResolutionQuirk == null) {
            return true;
        }
        List<a2.c> b = a2Var.b();
        if (b.isEmpty()) {
            return true;
        }
        return camcorderProfileResolutionQuirk.g().contains(b.get(0).k());
    }
}
