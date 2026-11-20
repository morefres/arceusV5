package nb;

import android.content.pm.PackageManager;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import q8.a;

/* loaded from: classes.dex */
public final class vc extends xd {

    /* renamed from: d, reason: collision with root package name */
    public final Map f26736d;

    /* renamed from: e, reason: collision with root package name */
    public final h6 f26737e;

    /* renamed from: f, reason: collision with root package name */
    public final h6 f26738f;

    /* renamed from: g, reason: collision with root package name */
    public final h6 f26739g;

    /* renamed from: h, reason: collision with root package name */
    public final h6 f26740h;

    /* renamed from: i, reason: collision with root package name */
    public final h6 f26741i;

    /* renamed from: j, reason: collision with root package name */
    public final h6 f26742j;

    public vc(me meVar) {
        super(meVar);
        this.f26736d = new HashMap();
        k6 x10 = this.f26328a.x();
        Objects.requireNonNull(x10);
        this.f26737e = new h6(x10, "last_delete_stale", 0L);
        k6 x11 = this.f26328a.x();
        Objects.requireNonNull(x11);
        this.f26738f = new h6(x11, "last_delete_stale_batch", 0L);
        k6 x12 = this.f26328a.x();
        Objects.requireNonNull(x12);
        this.f26739g = new h6(x12, "backoff", 0L);
        k6 x13 = this.f26328a.x();
        Objects.requireNonNull(x13);
        this.f26740h = new h6(x13, "last_upload", 0L);
        k6 x14 = this.f26328a.x();
        Objects.requireNonNull(x14);
        this.f26741i = new h6(x14, "last_upload_attempt", 0L);
        k6 x15 = this.f26328a.x();
        Objects.requireNonNull(x15);
        this.f26742j = new h6(x15, "midnight_offset", 0L);
    }

    @Override // nb.xd
    public final boolean l() {
        return false;
    }

    public final Pair m(String str, q8 q8Var) {
        return q8Var.o(p8.AD_STORAGE) ? n(str) : new Pair("", Boolean.FALSE);
    }

    @Deprecated
    public final Pair n(String str) {
        uc ucVar;
        a.C0516a c0516a;
        h();
        g7 g7Var = this.f26328a;
        long b = g7Var.e().b();
        uc ucVar2 = (uc) this.f26736d.get(str);
        if (ucVar2 != null && b < ucVar2.f26720c) {
            return new Pair(ucVar2.f26719a, Boolean.valueOf(ucVar2.b));
        }
        q8.a.b(true);
        long D = g7Var.w().D(str, z4.b) + b;
        try {
            try {
                c0516a = q8.a.a(g7Var.d());
            } catch (PackageManager.NameNotFoundException unused) {
                c0516a = null;
                if (ucVar2 != null && b < ucVar2.f26720c + this.f26328a.w().D(str, z4.f26857c)) {
                    return new Pair(ucVar2.f26719a, Boolean.valueOf(ucVar2.b));
                }
            }
        } catch (Exception e10) {
            this.f26328a.a().v().b("Unable to get advertising id", e10);
            ucVar = new uc("", false, D);
        }
        if (c0516a == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String a10 = c0516a.a();
        ucVar = a10 != null ? new uc(a10, c0516a.b(), D) : new uc("", c0516a.b(), D);
        this.f26736d.put(str, ucVar);
        q8.a.b(false);
        return new Pair(ucVar.f26719a, Boolean.valueOf(ucVar.b));
    }

    @Deprecated
    public final String o(String str, boolean z10) {
        h();
        String str2 = z10 ? (String) n(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest C = ve.C();
        if (C == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, C.digest(str2.getBytes())));
    }
}
