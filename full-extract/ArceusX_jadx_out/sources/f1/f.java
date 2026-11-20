package f1;

import android.location.Location;
import f1.r;
import java.io.File;

/* loaded from: classes.dex */
public final class f extends r.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f16406a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final Location f16407c;

    /* renamed from: d, reason: collision with root package name */
    public final File f16408d;

    public static final class b extends r.b.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f16409a;
        public Long b;

        /* renamed from: c, reason: collision with root package name */
        public Location f16410c;

        /* renamed from: d, reason: collision with root package name */
        public File f16411d;

        @Override // f1.r.b.a
        public r.b c() {
            String str = "";
            if (this.f16409a == null) {
                str = " fileSizeLimit";
            }
            if (this.b == null) {
                str = str + " durationLimitMillis";
            }
            if (this.f16411d == null) {
                str = str + " file";
            }
            if (str.isEmpty()) {
                return new f(this.f16409a.longValue(), this.b.longValue(), this.f16410c, this.f16411d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f1.r.b.a
        public r.b.a d(File file) {
            if (file == null) {
                throw new NullPointerException("Null file");
            }
            this.f16411d = file;
            return this;
        }

        @Override // f1.u.b.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public r.b.a a(long j10) {
            this.b = Long.valueOf(j10);
            return this;
        }

        @Override // f1.u.b.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public r.b.a b(long j10) {
            this.f16409a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // f1.u.b
    public long a() {
        return this.b;
    }

    @Override // f1.u.b
    public long b() {
        return this.f16406a;
    }

    @Override // f1.u.b
    public Location c() {
        return this.f16407c;
    }

    @Override // f1.r.b
    public File d() {
        return this.f16408d;
    }

    public boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r.b) {
            r.b bVar = (r.b) obj;
            if (this.f16406a == bVar.b() && this.b == bVar.a() && ((location = this.f16407c) != null ? location.equals(bVar.c()) : bVar.c() == null) && this.f16408d.equals(bVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f16406a;
        long j11 = this.b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        Location location = this.f16407c;
        return ((i10 ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.f16408d.hashCode();
    }

    public String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.f16406a + ", durationLimitMillis=" + this.b + ", location=" + this.f16407c + ", file=" + this.f16408d + "}";
    }

    public f(long j10, long j11, Location location, File file) {
        this.f16406a = j10;
        this.b = j11;
        this.f16407c = location;
        this.f16408d = file;
    }
}
