package l9;

import android.os.Looper;
import androidx.annotation.NonNull;
import k9.a;

/* loaded from: classes.dex */
public final class o0 extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final k9.e f23354c;

    public o0(k9.e eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f23354c = eVar;
    }

    @Override // k9.f
    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends k9.n, A>> T a(@NonNull T t8) {
        return (T) this.f23354c.C(t8);
    }

    @Override // k9.f
    public final Looper c() {
        return this.f23354c.I();
    }
}
