package c9;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import k9.n;

@Deprecated
/* loaded from: classes.dex */
public class c implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Status f4801a;
    public final GoogleSignInAccount b;

    public GoogleSignInAccount a() {
        return this.b;
    }

    @Override // k9.n
    @NonNull
    public Status m() {
        return this.f4801a;
    }
}
