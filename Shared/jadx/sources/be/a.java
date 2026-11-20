package be;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class a implements w {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f3950a;

    public a(ByteBuffer byteBuffer) {
        this.f3950a = byteBuffer.slice();
    }

    @Override // be.w
    public final void a(MessageDigest[] messageDigestArr, long j10, int i10) {
        ByteBuffer slice;
        synchronized (this.f3950a) {
            int i11 = (int) j10;
            this.f3950a.position(i11);
            this.f3950a.limit(i11 + i10);
            slice = this.f3950a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // be.w
    public final long zza() {
        return this.f3950a.capacity();
    }
}
