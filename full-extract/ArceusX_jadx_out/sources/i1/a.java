package i1;

import android.annotation.SuppressLint;
import i1.u;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List<Integer> f20066a = Collections.unmodifiableList(Arrays.asList(192000, 48000, 44100, 24000, 22050, 16000, 12000, 11025, 8000, 4800));

    /* renamed from: i1.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0354a {
        public abstract a a();

        public final a b() {
            a a10 = a();
            String str = "";
            if (a10.c() == -1) {
                str = " audioSource";
            }
            if (a10.e() <= 0) {
                str = str + " captureSampleRate";
            }
            if (a10.g() <= 0) {
                str = str + " encodeSampleRate";
            }
            if (a10.f() <= 0) {
                str = str + " channelCount";
            }
            if (a10.b() == -1) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return a10;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:" + str);
        }

        public abstract AbstractC0354a c(int i10);

        public abstract AbstractC0354a d(int i10);

        public abstract AbstractC0354a e(int i10);

        public abstract AbstractC0354a f(int i10);

        public abstract AbstractC0354a g(int i10);
    }

    @SuppressLint({"Range"})
    public static AbstractC0354a a() {
        return new u.b().d(-1).e(-1).g(-1).f(-1).c(-1);
    }

    public abstract int b();

    public abstract int c();

    public int d() {
        return t.f(b(), f());
    }

    public abstract int e();

    public abstract int f();

    public abstract int g();
}
