package b0;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes.dex */
public class l extends k {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f3632a;
        public long b = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f3632a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f3632a, aVar.f3632a) && this.b == aVar.b;
        }

        public int hashCode() {
            int hashCode = this.f3632a.hashCode() ^ 31;
            return Long.hashCode(this.b) ^ ((hashCode << 5) - hashCode);
        }
    }

    public l(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    public static l j(OutputConfiguration outputConfiguration) {
        return new l(new a(outputConfiguration));
    }

    @Override // b0.k, b0.i.a
    public void c(long j10) {
        ((a) this.f3633a).b = j10;
    }

    @Override // b0.k, b0.i.a
    public void d(String str) {
        ((OutputConfiguration) h()).setPhysicalCameraId(str);
    }

    @Override // b0.k, b0.i.a
    public String e() {
        return null;
    }

    @Override // b0.k, b0.j, b0.i.a
    public Object h() {
        x2.g.a(this.f3633a instanceof a);
        return ((a) this.f3633a).f3632a;
    }

    public l(Object obj) {
        super(obj);
    }
}
