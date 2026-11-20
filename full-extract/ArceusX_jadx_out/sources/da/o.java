package da;

import android.text.TextUtils;
import java.util.ArrayList;
import k9.a;

/* loaded from: classes.dex */
public final class o implements a.d {

    /* renamed from: e, reason: collision with root package name */
    public final int f14473e;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f14475g;

    /* renamed from: n, reason: collision with root package name */
    public final String f14482n;

    /* renamed from: o, reason: collision with root package name */
    public final ga.q f14483o;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14470a = false;
    public final boolean b = true;

    /* renamed from: c, reason: collision with root package name */
    public final int f14471c = 17;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14472d = false;

    /* renamed from: f, reason: collision with root package name */
    public final String f14474f = null;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14476h = false;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f14477i = false;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f14478j = false;

    /* renamed from: k, reason: collision with root package name */
    public final String f14479k = null;

    /* renamed from: l, reason: collision with root package name */
    public final int f14480l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f14481m = 9;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f14484p = false;

    public /* synthetic */ o(boolean z10, boolean z11, int i10, boolean z12, int i11, String str, ArrayList arrayList, boolean z13, boolean z14, boolean z15, String str2, int i12, int i13, String str3, ga.q qVar, boolean z16, byte[] bArr) {
        this.f14473e = i11;
        this.f14475g = arrayList;
        this.f14482n = str3;
        this.f14483o = qVar;
    }

    public static n a() {
        return new n(null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f14473e == oVar.f14473e && this.f14475g.equals(oVar.f14475g) && TextUtils.equals(null, null) && n9.k.b(this.f14482n, oVar.f14482n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.f14473e + 486741695) * 961) + this.f14475g.hashCode();
        String str = this.f14482n;
        return ((((hashCode * 887503681) + 9) * 31) + (str == null ? 0 : str.hashCode())) * 31;
    }
}
