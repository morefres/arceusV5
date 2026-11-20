package c1;

import android.hardware.camera2.params.SessionConfiguration;

/* loaded from: classes.dex */
public interface d {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f4449a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final long f4450c;

        public a(int i10, int i11, long j10) {
            this.f4449a = i10;
            this.b = i11;
            this.f4450c = j10;
        }

        public int a() {
            return this.f4449a;
        }
    }

    a a(SessionConfiguration sessionConfiguration);
}
