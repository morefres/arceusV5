package f0;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import g0.t;
import java.util.List;
import n0.o0;
import n0.q3;
import z.n2;
import z.z0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public z0 f16357a;
    public n2 b;

    /* renamed from: c, reason: collision with root package name */
    public List<Pair<CameraCharacteristics.Key, Object>> f16358c;

    public h(z0 z0Var) {
        this.f16357a = z0Var;
    }

    public static h a(t tVar) {
        q3 E;
        if (tVar instanceof n2) {
            return ((n2) tVar).B();
        }
        o0 q10 = ((o0) tVar).q();
        x2.g.b(q10 instanceof z0, "CameraInfo doesn't contain Camera2 implementation.");
        h B = ((z0) q10).B();
        return (!(tVar instanceof n0.e) || (E = ((n0.e) tVar).E()) == null) ? B : new h(B.f16357a, E.h());
    }

    public <T> T b(CameraCharacteristics.Key<T> key) {
        List<Pair<CameraCharacteristics.Key, Object>> list = this.f16358c;
        if (list != null) {
            for (Pair<CameraCharacteristics.Key, Object> pair : list) {
                if (((CameraCharacteristics.Key) pair.first).equals(key)) {
                    return (T) pair.second;
                }
            }
        }
        return (T) this.f16357a.C().a(key);
    }

    public String c() {
        return this.f16357a.e();
    }

    public h(z0 z0Var, List<Pair<CameraCharacteristics.Key, Object>> list) {
        this.f16357a = z0Var;
        this.f16358c = list;
    }
}
