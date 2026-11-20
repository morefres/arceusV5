package n0;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class h3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25376a;
    public final Set<Class<? extends g3>> b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<Class<? extends g3>> f25377c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f25378a = true;
        public Set<Class<? extends g3>> b;

        /* renamed from: c, reason: collision with root package name */
        public Set<Class<? extends g3>> f25379c;

        public h3 a() {
            return new h3(this.f25378a, this.b, this.f25379c);
        }

        public b b(Set<Class<? extends g3>> set) {
            this.f25379c = new HashSet(set);
            return this;
        }

        public b c(Set<Class<? extends g3>> set) {
            this.b = new HashSet(set);
            return this;
        }

        public b d(boolean z10) {
            this.f25378a = z10;
            return this;
        }
    }

    public static h3 b() {
        return new b().d(true).a();
    }

    public boolean a(Class<? extends g3> cls, boolean z10) {
        if (this.b.contains(cls)) {
            return true;
        }
        return !this.f25377c.contains(cls) && this.f25376a && z10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h3)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        h3 h3Var = (h3) obj;
        return this.f25376a == h3Var.f25376a && Objects.equals(this.b, h3Var.b) && Objects.equals(this.f25377c, h3Var.f25377c);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f25376a), this.b, this.f25377c);
    }

    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f25376a + ", forceEnabledQuirks=" + this.b + ", forceDisabledQuirks=" + this.f25377c + '}';
    }

    public h3(boolean z10, Set<Class<? extends g3>> set, Set<Class<? extends g3>> set2) {
        this.f25376a = z10;
        this.b = set == null ? Collections.EMPTY_SET : new HashSet<>(set);
        this.f25377c = set2 == null ? Collections.EMPTY_SET : new HashSet<>(set2);
    }
}
