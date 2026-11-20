package y8;

import android.os.Bundle;
import androidx.annotation.NonNull;
import k9.a;
import n9.k;

/* loaded from: classes.dex */
public final class c implements a.d {

    @NonNull
    public static final c b = new c(new Bundle(), null);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f36540a;

    public /* synthetic */ c(Bundle bundle, i iVar) {
        this.f36540a = bundle;
    }

    @NonNull
    public final Bundle a() {
        return new Bundle(this.f36540a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return k.a(this.f36540a, ((c) obj).f36540a);
        }
        return false;
    }

    public final int hashCode() {
        return k.c(this.f36540a);
    }
}
