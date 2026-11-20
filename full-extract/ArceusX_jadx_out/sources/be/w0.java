package be;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class w0 implements w {

    /* renamed from: a, reason: collision with root package name */
    public final FileChannel f4006a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4007c;

    public w0(FileChannel fileChannel, long j10, long j11) {
        this.f4006a = fileChannel;
        this.b = j10;
        this.f4007c = j11;
    }

    @Override // be.w
    public final void a(MessageDigest[] messageDigestArr, long j10, int i10) {
        MappedByteBuffer map = this.f4006a.map(FileChannel.MapMode.READ_ONLY, this.b + j10, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // be.w
    public final long zza() {
        return this.f4007c;
    }
}
