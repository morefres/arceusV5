package n0;

import java.util.List;
import n0.o3;

/* loaded from: classes.dex */
public final class q extends o3.f {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f25508a;
    public final List<u1> b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25509c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25510d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25511e;

    /* renamed from: f, reason: collision with root package name */
    public final g0.k0 f25512f;

    public static final class b extends o3.f.a {

        /* renamed from: a, reason: collision with root package name */
        public u1 f25513a;
        public List<u1> b;

        /* renamed from: c, reason: collision with root package name */
        public String f25514c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f25515d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f25516e;

        /* renamed from: f, reason: collision with root package name */
        public g0.k0 f25517f;

        @Override // n0.o3.f.a
        public o3.f a() {
            String str = "";
            if (this.f25513a == null) {
                str = " surface";
            }
            if (this.b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f25515d == null) {
                str = str + " mirrorMode";
            }
            if (this.f25516e == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f25517f == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new q(this.f25513a, this.b, this.f25514c, this.f25515d.intValue(), this.f25516e.intValue(), this.f25517f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // n0.o3.f.a
        public o3.f.a b(g0.k0 k0Var) {
            if (k0Var == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f25517f = k0Var;
            return this;
        }

        @Override // n0.o3.f.a
        public o3.f.a c(int i10) {
            this.f25515d = Integer.valueOf(i10);
            return this;
        }

        @Override // n0.o3.f.a
        public o3.f.a d(String str) {
            this.f25514c = str;
            return this;
        }

        @Override // n0.o3.f.a
        public o3.f.a e(List<u1> list) {
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.b = list;
            return this;
        }

        @Override // n0.o3.f.a
        public o3.f.a f(int i10) {
            this.f25516e = Integer.valueOf(i10);
            return this;
        }

        public o3.f.a g(u1 u1Var) {
            if (u1Var == null) {
                throw new NullPointerException("Null surface");
            }
            this.f25513a = u1Var;
            return this;
        }
    }

    @Override // n0.o3.f
    public g0.k0 b() {
        return this.f25512f;
    }

    @Override // n0.o3.f
    public int c() {
        return this.f25510d;
    }

    @Override // n0.o3.f
    public String d() {
        return this.f25509c;
    }

    @Override // n0.o3.f
    public List<u1> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o3.f) {
            o3.f fVar = (o3.f) obj;
            if (this.f25508a.equals(fVar.f()) && this.b.equals(fVar.e()) && ((str = this.f25509c) != null ? str.equals(fVar.d()) : fVar.d() == null) && this.f25510d == fVar.c() && this.f25511e == fVar.g() && this.f25512f.equals(fVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.o3.f
    public u1 f() {
        return this.f25508a;
    }

    @Override // n0.o3.f
    public int g() {
        return this.f25511e;
    }

    public int hashCode() {
        int hashCode = (((this.f25508a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.f25509c;
        return ((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f25510d) * 1000003) ^ this.f25511e) * 1000003) ^ this.f25512f.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f25508a + ", sharedSurfaces=" + this.b + ", physicalCameraId=" + this.f25509c + ", mirrorMode=" + this.f25510d + ", surfaceGroupId=" + this.f25511e + ", dynamicRange=" + this.f25512f + "}";
    }

    public q(u1 u1Var, List<u1> list, String str, int i10, int i11, g0.k0 k0Var) {
        this.f25508a = u1Var;
        this.b = list;
        this.f25509c = str;
        this.f25510d = i10;
        this.f25511e = i11;
        this.f25512f = k0Var;
    }
}
