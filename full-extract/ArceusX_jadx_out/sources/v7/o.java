package v7;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f33291a;
    public final boolean b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f33292a;
        public boolean b = false;

        public /* synthetic */ a(z1 z1Var) {
        }

        @NonNull
        public o a() {
            String str = this.f33292a;
            if (str == null) {
                throw new IllegalArgumentException("Product type must be set");
            }
            if (!this.b || str.equals("subs")) {
                return new o(this, null);
            }
            throw new IllegalArgumentException("includeSuspendedSubscriptions is only supported for subscription purchases");
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f33292a = str;
            return this;
        }
    }

    public /* synthetic */ o(a aVar, z1 z1Var) {
        this.f33291a = aVar.f33292a;
        this.b = aVar.b;
    }

    @NonNull
    public static a b() {
        return new a(null);
    }

    public boolean a() {
        return this.b;
    }

    @NonNull
    public final String c() {
        return this.f33291a;
    }
}
