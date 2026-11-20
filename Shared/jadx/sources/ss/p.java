package ss;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class p<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f31673a;

    public p(@NonNull String str) {
        this.f31673a = str;
    }

    @NonNull
    public static <T> p<T> b(@NonNull String str) {
        return new p<>(str);
    }

    public T a(@NonNull r rVar) {
        return (T) rVar.a(this);
    }

    @NonNull
    public T c(@NonNull r rVar) {
        T a10 = a(rVar);
        if (a10 != null) {
            return a10;
        }
        throw new NullPointerException(this.f31673a);
    }

    public void d(@NonNull r rVar, T t8) {
        rVar.b(this, t8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f31673a.equals(((p) obj).f31673a);
    }

    public int hashCode() {
        return this.f31673a.hashCode();
    }

    public String toString() {
        return "Prop{name='" + this.f31673a + "'}";
    }
}
