package zf;

import androidx.annotation.NonNull;
import zf.m;

/* loaded from: classes2.dex */
public final class a extends m {

    /* renamed from: a, reason: collision with root package name */
    public final String f38010a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final long f38011c;

    public static final class b extends m.a {

        /* renamed from: a, reason: collision with root package name */
        public String f38012a;
        public Long b;

        /* renamed from: c, reason: collision with root package name */
        public Long f38013c;

        @Override // zf.m.a
        public m a() {
            String str = "";
            if (this.f38012a == null) {
                str = " token";
            }
            if (this.b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f38013c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f38012a, this.b.longValue(), this.f38013c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // zf.m.a
        public m.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f38012a = str;
            return this;
        }

        @Override // zf.m.a
        public m.a c(long j10) {
            this.f38013c = Long.valueOf(j10);
            return this;
        }

        @Override // zf.m.a
        public m.a d(long j10) {
            this.b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // zf.m
    @NonNull
    public String b() {
        return this.f38010a;
    }

    @Override // zf.m
    @NonNull
    public long c() {
        return this.f38011c;
    }

    @Override // zf.m
    @NonNull
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f38010a.equals(mVar.b()) && this.b == mVar.d() && this.f38011c == mVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f38010a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.b;
        long j11 = this.f38011c;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f38010a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.f38011c + "}";
    }

    public a(String str, long j10, long j11) {
        this.f38010a = str;
        this.b = j10;
        this.f38011c = j11;
    }
}
