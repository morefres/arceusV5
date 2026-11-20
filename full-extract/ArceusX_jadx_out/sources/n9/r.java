package n9;

import android.os.Bundle;
import androidx.annotation.NonNull;
import k9.a;

/* loaded from: classes.dex */
public class r implements a.d {

    @NonNull
    public static final r b = a().a();

    /* renamed from: a, reason: collision with root package name */
    public final String f25999a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f26000a;

        public /* synthetic */ a(u uVar) {
        }

        @NonNull
        public r a() {
            return new r(this.f26000a, null);
        }

        @NonNull
        public a b(String str) {
            this.f26000a = str;
            return this;
        }
    }

    public /* synthetic */ r(String str, v vVar) {
        this.f25999a = str;
    }

    @NonNull
    public static a a() {
        return new a(null);
    }

    @NonNull
    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f25999a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            return k.b(this.f25999a, ((r) obj).f25999a);
        }
        return false;
    }

    public final int hashCode() {
        return k.c(this.f25999a);
    }
}
