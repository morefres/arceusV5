package td;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* loaded from: classes2.dex */
public final class q extends IntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f32149a;
    public final Long b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f32150c = null;

    public /* synthetic */ q(String str, Long l10, Object obj, p pVar) {
        this.f32149a = str;
        this.b = l10;
    }

    public static boolean c() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long a() {
        return this.b;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String b() {
        return this.f32149a;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        Long l10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f32149a.equals(integrityTokenRequest.b()) && ((l10 = this.b) != null ? l10.equals(integrityTokenRequest.a()) : integrityTokenRequest.a() == null)) {
                z10 = true;
                return ((obj instanceof q) || !c()) ? z10 : z10;
            }
        }
        z10 = false;
        if (obj instanceof q) {
        }
    }

    public final int hashCode() {
        int hashCode = this.f32149a.hashCode() ^ 1000003;
        Long l10 = this.b;
        int hashCode2 = (hashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode());
        return c() ? hashCode2 * 1000003 : hashCode2;
    }

    public final String toString() {
        String str = "IntegrityTokenRequest{nonce=" + this.f32149a + ", cloudProjectNumber=" + this.b;
        if (c()) {
            str = str.concat(", network=null");
        }
        return str.concat("}");
    }
}
