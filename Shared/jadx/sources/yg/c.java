package yg;

import android.content.Context;
import gv.e;
import org.webrtc.voiceengine.AppAudioManagerBase;

/* loaded from: classes2.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final AppAudioManagerBase f36598a;

    public c(Context context) {
        this.f36598a = e.g(context);
    }

    @Override // yg.a
    public void a() {
        this.f36598a.dispose();
    }

    @Override // yg.a
    public void b(j.b bVar) {
        this.f36598a.setActivityForPermissionRequest(bVar);
    }
}
