package v7;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public String f33255a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f33256a;

        public /* synthetic */ a(k1 k1Var) {
        }

        @NonNull
        public e a() {
            String str = this.f33256a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            e eVar = new e(null);
            eVar.f33255a = str;
            return eVar;
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f33256a = str;
            return this;
        }
    }

    public /* synthetic */ e(k1 k1Var) {
    }

    @NonNull
    public static a b() {
        return new a(null);
    }

    @NonNull
    public String a() {
        return this.f33255a;
    }
}
