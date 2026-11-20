package xs;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: xs.a$a, reason: collision with other inner class name */
    public static class C0665a extends a {
        @Override // xs.a
        @NonNull
        public String b(@NonNull String str) {
            return str;
        }

        public C0665a() {
        }
    }

    @NonNull
    public static a a() {
        return new C0665a();
    }

    @NonNull
    public abstract String b(@NonNull String str);
}
