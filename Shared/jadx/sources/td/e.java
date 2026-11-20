package td;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* loaded from: classes2.dex */
public final class e implements IntegrityManager {

    /* renamed from: a, reason: collision with root package name */
    public final m f32093a;

    public e(m mVar) {
        this.f32093a = mVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f32093a.b(integrityTokenRequest);
    }
}
