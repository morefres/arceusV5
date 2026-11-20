package m1;

import android.media.MediaFormat;
import java.util.Objects;
import m1.c;
import n0.a4;

/* loaded from: classes.dex */
public abstract class a implements n {

    /* renamed from: m1.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0419a {
        public abstract a a();

        public a b() {
            a a10 = a();
            if (Objects.equals(a10.b(), "audio/mp4a-latm") && a10.i() == -1) {
                throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
            }
            return a10;
        }

        public abstract AbstractC0419a c(int i10);

        public abstract AbstractC0419a d(int i10);

        public abstract AbstractC0419a e(int i10);

        public abstract AbstractC0419a f(int i10);

        public abstract AbstractC0419a g(a4 a4Var);

        public abstract AbstractC0419a h(String str);

        public abstract AbstractC0419a i(int i10);
    }

    public static AbstractC0419a d() {
        return new c.b().i(-1);
    }

    @Override // m1.n
    public MediaFormat a() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(b(), h(), g());
        createAudioFormat.setInteger("bitrate", e());
        if (i() != -1) {
            if (b().equals("audio/mp4a-latm")) {
                createAudioFormat.setInteger("aac-profile", i());
                return createAudioFormat;
            }
            createAudioFormat.setInteger("profile", i());
        }
        return createAudioFormat;
    }

    @Override // m1.n
    public abstract String b();

    @Override // m1.n
    public abstract a4 c();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();
}
