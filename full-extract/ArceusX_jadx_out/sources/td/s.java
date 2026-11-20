package td;

import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* loaded from: classes2.dex */
public final class s extends IntegrityTokenResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f32155a;
    public final r1 b;

    public s(String str, r1 r1Var) {
        this.f32155a = str;
        this.b = r1Var;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f32155a;
    }
}
