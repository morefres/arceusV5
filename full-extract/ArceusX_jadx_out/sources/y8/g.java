package y8;

import android.os.Bundle;
import k9.a;
import n9.k;

@Deprecated
/* loaded from: classes.dex */
public final class g implements a.d {

    /* renamed from: d, reason: collision with root package name */
    public static final g f36542d = new g(new f());

    /* renamed from: a, reason: collision with root package name */
    public final String f36543a = null;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final String f36544c;

    public g(f fVar) {
        this.b = fVar.f36541a.booleanValue();
        this.f36544c = fVar.b;
    }

    public static /* bridge */ /* synthetic */ String b(g gVar) {
        String str = gVar.f36543a;
        return null;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.b);
        bundle.putString("log_session_id", this.f36544c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k.b(null, null) && this.b == gVar.b && k.b(this.f36544c, gVar.f36544c);
    }

    public final int hashCode() {
        return k.c(null, Boolean.valueOf(this.b), this.f36544c);
    }
}
