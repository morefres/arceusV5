package no;

import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import dt.i;
import no.c;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class e implements c.a {

    /* renamed from: a, reason: collision with root package name */
    public final d f27282a;

    public e(d dVar) {
        this.f27282a = dVar;
    }

    public static i<c.a> b(d dVar) {
        return dt.e.a(new e(dVar));
    }

    @Override // no.c.a
    public c a(String str, String str2, String str3, String str4, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, @Nullable String str5, CameraProperties cameraProperties) {
        return this.f27282a.b(str, str2, str4, str3, governmentIdRequestArguments, str5, cameraProperties);
    }
}
