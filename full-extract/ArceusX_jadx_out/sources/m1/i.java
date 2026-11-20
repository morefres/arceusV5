package m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface i extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    long d1();

    MediaCodec.BufferInfo k0();

    long size();

    ByteBuffer t();

    boolean t0();
}
