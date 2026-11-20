package nb;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s9 implements ue {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qa f26652a;

    public s9(qa qaVar) {
        Objects.requireNonNull(qaVar);
        this.f26652a = qaVar;
    }

    @Override // nb.ue
    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f26652a.p("auto", "_err", bundle);
        } else {
            this.f26652a.w("auto", "_err", bundle, str);
        }
    }
}
