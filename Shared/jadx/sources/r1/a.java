package r1;

import g0.f1;
import java.util.Objects;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0529a f30063a;
    public final f1.j b;

    /* renamed from: r1.a$a, reason: collision with other inner class name */
    public enum EnumC0529a {
        PREVIEW_VIEW,
        SCREEN_FLASH_VIEW
    }

    public a(EnumC0529a enumC0529a, f1.j jVar) {
        this.f30063a = enumC0529a;
        this.b = jVar;
    }

    public EnumC0529a a() {
        return this.f30063a;
    }

    public f1.j b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f30063a == aVar.f30063a && Objects.equals(this.b, aVar.b);
    }

    public int hashCode() {
        return Objects.hash(this.f30063a, this.b);
    }
}
