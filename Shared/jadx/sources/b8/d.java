package b8;

import b8.o;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: a, reason: collision with root package name */
    public final String f3884a;
    public final byte[] b;

    /* renamed from: c, reason: collision with root package name */
    public final y7.e f3885c;

    public static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        public String f3886a;
        public byte[] b;

        /* renamed from: c, reason: collision with root package name */
        public y7.e f3887c;

        @Override // b8.o.a
        public o a() {
            String str = "";
            if (this.f3886a == null) {
                str = " backendName";
            }
            if (this.f3887c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f3886a, this.b, this.f3887c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b8.o.a
        public o.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f3886a = str;
            return this;
        }

        @Override // b8.o.a
        public o.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        @Override // b8.o.a
        public o.a d(y7.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f3887c = eVar;
            return this;
        }
    }

    @Override // b8.o
    public String b() {
        return this.f3884a;
    }

    @Override // b8.o
    public byte[] c() {
        return this.b;
    }

    @Override // b8.o
    public y7.e d() {
        return this.f3885c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f3884a.equals(oVar.b())) {
                if (Arrays.equals(this.b, oVar instanceof d ? ((d) oVar).b : oVar.c()) && this.f3885c.equals(oVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f3884a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.f3885c.hashCode();
    }

    public d(String str, byte[] bArr, y7.e eVar) {
        this.f3884a = str;
        this.b = bArr;
        this.f3885c = eVar;
    }
}
