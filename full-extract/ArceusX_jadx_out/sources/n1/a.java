package n1;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import java.io.IOException;
import m1.k1;
import m1.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LruCache<String, MediaCodecInfo> f25680a = new LruCache<>(10);

    public static MediaCodec a(String str) {
        try {
            return MediaCodec.createEncoderByType(str);
        } catch (IOException | IllegalArgumentException e10) {
            throw new k1(e10);
        }
    }

    public static MediaCodec b(n nVar) {
        return a(nVar.b());
    }

    public static MediaCodecInfo c(String str) {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodec;
        LruCache<String, MediaCodecInfo> lruCache = f25680a;
        synchronized (lruCache) {
            mediaCodecInfo = lruCache.get(str);
        }
        if (mediaCodecInfo != null) {
            return mediaCodecInfo;
        }
        try {
            mediaCodec = a(str);
            try {
                MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
                synchronized (lruCache) {
                    lruCache.put(str, codecInfo);
                }
                mediaCodec.release();
                return codecInfo;
            } catch (Throwable th2) {
                th = th2;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            mediaCodec = null;
        }
    }
}
