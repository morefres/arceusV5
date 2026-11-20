package m1;

import android.media.MediaCodecInfo;
import java.util.Objects;

/* loaded from: classes.dex */
public class b extends g1 implements f1 {

    /* renamed from: c, reason: collision with root package name */
    public final MediaCodecInfo.AudioCapabilities f24059c;

    public b(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.b.getAudioCapabilities();
        Objects.requireNonNull(audioCapabilities);
        this.f24059c = audioCapabilities;
    }
}
