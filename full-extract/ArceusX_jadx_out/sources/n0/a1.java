package n0;

import g0.c2;
import n0.j1;

/* loaded from: classes.dex */
public final class a1 implements n3 {

    /* renamed from: d, reason: collision with root package name */
    public final g0.c2 f25292d;

    public class a implements g0.c2 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f25293d;

        public a(long j10) {
            this.f25293d = j10;
        }

        @Override // g0.c2
        public long a() {
            return this.f25293d;
        }

        @Override // g0.c2
        public c2.c e(c2.b bVar) {
            return bVar.m() == 1 ? c2.c.f17806d : c2.c.f17807e;
        }
    }

    public static final class b implements n3 {

        /* renamed from: d, reason: collision with root package name */
        public final g0.c2 f25295d;

        public b(long j10) {
            this.f25295d = new a1(j10);
        }

        @Override // g0.c2
        public long a() {
            return this.f25295d.a();
        }

        @Override // n0.n3
        public g0.c2 b(long j10) {
            return new b(j10);
        }

        @Override // g0.c2
        public c2.c e(c2.b bVar) {
            if (this.f25295d.e(bVar).d()) {
                return c2.c.f17807e;
            }
            Throwable n10 = bVar.n();
            if (n10 instanceof j1.b) {
                g0.r1.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((j1.b) n10).a() > 0) {
                    return c2.c.f17809g;
                }
            }
            return c2.c.f17806d;
        }
    }

    public a1(long j10) {
        this.f25292d = new b4(j10, new a(j10));
    }

    @Override // g0.c2
    public long a() {
        return this.f25292d.a();
    }

    @Override // n0.n3
    public g0.c2 b(long j10) {
        return new a1(j10);
    }

    @Override // g0.c2
    public c2.c e(c2.b bVar) {
        return this.f25292d.e(bVar);
    }
}
