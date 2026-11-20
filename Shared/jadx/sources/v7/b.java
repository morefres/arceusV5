package v7;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f33245a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f33246a;

        public /* synthetic */ a(r rVar) {
        }

        @NonNull
        public b a() {
            String str = this.f33246a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            b bVar = new b(null);
            bVar.f33245a = str;
            return bVar;
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f33246a = str;
            return this;
        }
    }

    public /* synthetic */ b(r rVar) {
    }

    @NonNull
    public static a b() {
        return new a(null);
    }

    @NonNull
    public String a() {
        return this.f33245a;
    }
}
