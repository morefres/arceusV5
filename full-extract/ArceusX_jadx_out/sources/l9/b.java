package l9;

import androidx.annotation.NonNull;
import k9.a;
import k9.a.d;

/* loaded from: classes.dex */
public final class b<O extends a.d> {

    /* renamed from: a, reason: collision with root package name */
    public final int f23281a;
    public final k9.a b;

    /* renamed from: c, reason: collision with root package name */
    public final a.d f23282c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23283d;

    public b(k9.a aVar, a.d dVar, String str) {
        this.b = aVar;
        this.f23282c = dVar;
        this.f23283d = str;
        this.f23281a = n9.k.c(aVar, dVar, str);
    }

    @NonNull
    public static <O extends a.d> b<O> a(@NonNull k9.a<O> aVar, O o8, String str) {
        return new b<>(aVar, o8, str);
    }

    @NonNull
    public final String b() {
        return this.b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return n9.k.b(this.b, bVar.b) && n9.k.b(this.f23282c, bVar.f23282c) && n9.k.b(this.f23283d, bVar.f23283d);
    }

    public final int hashCode() {
        return this.f23281a;
    }
}
