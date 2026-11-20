package l1;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecDefaultDataSpaceQuirk;
import f1.c2;
import f1.s;
import g0.k0;
import g0.r1;
import g0.v2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import l1.p;
import m1.p1;
import m1.q1;
import n0.a2;
import n0.a4;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, Map<Integer, q1>> f23202a;

    static {
        HashMap hashMap = new HashMap();
        f23202a = hashMap;
        HashMap hashMap2 = new HashMap();
        q1 q1Var = q1.f24197a;
        hashMap2.put(1, q1Var);
        q1 q1Var2 = q1.f24199d;
        hashMap2.put(2, q1Var2);
        q1 q1Var3 = q1.f24200e;
        hashMap2.put(4096, q1Var3);
        hashMap2.put(8192, q1Var3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(1, q1Var);
        hashMap3.put(2, q1Var2);
        hashMap3.put(4096, q1Var3);
        hashMap3.put(8192, q1Var3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(1, q1Var);
        hashMap4.put(4, q1Var2);
        hashMap4.put(4096, q1Var3);
        hashMap4.put(16384, q1Var3);
        hashMap4.put(2, q1Var);
        hashMap4.put(8, q1Var2);
        hashMap4.put(8192, q1Var3);
        hashMap4.put(32768, q1Var3);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(256, q1Var2);
        hashMap5.put(512, q1.b);
        hashMap.put("video/hevc", hashMap2);
        hashMap.put("video/av01", hashMap3);
        hashMap.put("video/x-vnd.on2.vp9", hashMap4);
        hashMap.put("video/dolby-vision", hashMap5);
    }

    public static String a(k0 k0Var) {
        int b = k0Var.b();
        if (b == 1) {
            return "video/avc";
        }
        if (b == 3 || b == 4 || b == 5) {
            return "video/hevc";
        }
        if (b == 6) {
            return "video/dolby-vision";
        }
        throw new UnsupportedOperationException("Unsupported dynamic range: " + k0Var + "\nNo supported default mime type available.");
    }

    public static q1 b(String str, int i10) {
        q1 q1Var;
        Map<Integer, q1> map = f23202a.get(str);
        if (map != null && (q1Var = map.get(Integer.valueOf(i10))) != null) {
            return q1Var;
        }
        r1.l("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i10)));
        return q1.f24197a;
    }

    public static CaptureEncodeRates c(c2 c2Var, Range<Integer> range) {
        Range<Integer> range2 = v2.f17996q;
        int intValue = range2.equals(range) ? 30 : range.getUpper().intValue();
        int d10 = c2Var.d() != 0 ? c2Var.d() : intValue;
        Locale locale = Locale.ENGLISH;
        Integer valueOf = Integer.valueOf(intValue);
        Integer valueOf2 = Integer.valueOf(d10);
        boolean equals = range2.equals(range);
        Object obj = range;
        if (equals) {
            obj = "<UNSPECIFIED>";
        }
        r1.a("VideoConfigUtil", String.format(locale, "Resolved capture/encode frame rate %dfps/%dfps, [Expected operating range: %s]", valueOf, valueOf2, obj));
        return new CaptureEncodeRates(intValue, d10);
    }

    public static p1 d(p pVar, a4 a4Var, c2 c2Var, Size size, k0 k0Var, Range<Integer> range) {
        a2.c d10 = pVar.d();
        return (p1) (d10 != null ? new o(pVar.a(), a4Var, c2Var, size, d10, k0Var, range) : new n(pVar.a(), a4Var, c2Var, size, k0Var, range)).get();
    }

    public static p e(s sVar, k0 k0Var, h1.i iVar) {
        a2.c cVar;
        x2.g.j(k0Var.e(), "Dynamic range must be a fully specified dynamic range [provided dynamic range: " + k0Var + "]");
        String h10 = s.h(sVar.c());
        if (iVar != null) {
            Set<Integer> c10 = n1.b.c(k0Var);
            Set<Integer> b = n1.b.b(k0Var);
            Iterator<a2.c> it = iVar.b().iterator();
            while (it.hasNext()) {
                cVar = it.next();
                if (c10.contains(Integer.valueOf(cVar.g())) && b.contains(Integer.valueOf(cVar.b()))) {
                    String i10 = cVar.i();
                    if (Objects.equals(h10, i10)) {
                        r1.a("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + h10 + "]");
                    } else if (sVar.c() == -1) {
                        r1.a("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + h10 + ", dynamic range: " + k0Var + "]");
                    }
                    h10 = i10;
                    break;
                }
            }
        }
        cVar = null;
        if (cVar == null) {
            if (sVar.c() == -1) {
                h10 = a(k0Var);
            }
            if (iVar == null) {
                r1.a("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + h10 + ", dynamic range: " + k0Var + "]");
            } else {
                r1.a("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + h10 + ", dynamic range: " + k0Var + "]");
            }
        }
        p.a c11 = p.c(h10);
        if (cVar != null) {
            c11.c(cVar);
        }
        return c11.b();
    }

    public static int f(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Range<Integer> range) {
        int doubleValue = (int) (i10 * new Rational(i11, i12).doubleValue() * new Rational(i13, i14).doubleValue() * new Rational(i15, i16).doubleValue() * new Rational(i17, i18).doubleValue());
        String format = r1.f("VideoConfigUtil") ? String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18), Integer.valueOf(doubleValue)) : "";
        if (!c2.f16390a.equals(range)) {
            Integer clamp = range.clamp(Integer.valueOf(doubleValue));
            int intValue = clamp.intValue();
            if (r1.f("VideoConfigUtil")) {
                format = format + String.format("\nClamped to range %s -> %dbps", range, clamp);
            }
            doubleValue = intValue;
        }
        r1.a("VideoConfigUtil", format);
        return doubleValue;
    }

    public static p1 g(p1 p1Var, boolean z10) {
        if (p1Var.h() != q1.f24197a) {
            return p1Var;
        }
        MediaCodecDefaultDataSpaceQuirk mediaCodecDefaultDataSpaceQuirk = (MediaCodecDefaultDataSpaceQuirk) k1.c.b(MediaCodecDefaultDataSpaceQuirk.class);
        if (!z10 || mediaCodecDefaultDataSpaceQuirk == null) {
            return p1Var;
        }
        return p1Var.m().e(mediaCodecDefaultDataSpaceQuirk.g()).a();
    }
}
