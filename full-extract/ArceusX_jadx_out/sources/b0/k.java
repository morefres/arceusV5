package b0;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes.dex */
public class k extends j {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f3630a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public long f3631c = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f3630a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f3630a, aVar.f3630a) && this.f3631c == aVar.f3631c && Objects.equals(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.f3630a.hashCode() ^ 31;
            int i10 = (hashCode << 5) - hashCode;
            String str = this.b;
            int hashCode2 = (str == null ? 0 : str.hashCode()) ^ i10;
            return Long.hashCode(this.f3631c) ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    public k(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    public static k i(OutputConfiguration outputConfiguration) {
        return new k(new a(outputConfiguration));
    }

    @Override // b0.i.a
    public void b(Surface surface) {
        ((OutputConfiguration) h()).addSurface(surface);
    }

    @Override // b0.i.a
    public void c(long j10) {
        ((a) this.f3633a).f3631c = j10;
    }

    @Override // b0.i.a
    public void d(String str) {
        ((a) this.f3633a).b = str;
    }

    @Override // b0.i.a
    public String e() {
        return ((a) this.f3633a).b;
    }

    @Override // b0.i.a
    public void f() {
        ((OutputConfiguration) h()).enableSurfaceSharing();
    }

    @Override // b0.j, b0.i.a
    public Object h() {
        x2.g.a(this.f3633a instanceof a);
        return ((a) this.f3633a).f3630a;
    }

    public k(Object obj) {
        super(obj);
    }
}
