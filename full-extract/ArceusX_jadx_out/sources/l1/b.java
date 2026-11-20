package l1;

import android.util.Range;
import android.util.Rational;
import g0.r1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import n0.a2;
import n0.a4;

/* loaded from: classes.dex */
public final class b {
    public static /* synthetic */ int a(int i10, Integer num, Integer num2) {
        int abs = Math.abs(num.intValue() - i10) - Math.abs(num2.intValue() - i10);
        return (int) (abs == 0 ? Math.signum(num.intValue() - num2.intValue()) : Math.signum(abs));
    }

    public static m1.a b(e eVar, a4 a4Var, i1.a aVar, f1.a aVar2) {
        a2.a d10 = eVar.d();
        return (m1.a) (d10 != null ? new c(eVar.a(), eVar.b(), a4Var, aVar2, aVar, d10) : new d(eVar.a(), eVar.b(), a4Var, aVar2, aVar)).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l1.e c(f1.s r8, h1.i r9) {
        /*
            int r0 = r8.c()
            java.lang.String r0 = f1.s.e(r0)
            int r1 = r8.c()
            int r1 = f1.s.f(r1)
            if (r9 == 0) goto Lca
            n0.a2$a r2 = r9.j()
            if (r2 == 0) goto Lca
            n0.a2$a r9 = r9.j()
            java.lang.String r2 = r9.e()
            int r3 = r9.f()
            java.lang.String r4 = "audio/none"
            boolean r4 = java.util.Objects.equals(r2, r4)
            java.lang.String r5 = ")]"
            java.lang.String r6 = "AudioConfigUtil"
            java.lang.String r7 = "(profile: "
            if (r4 == 0) goto L51
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: "
            r8.append(r9)
            r8.append(r0)
            r8.append(r7)
            r8.append(r1)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            g0.r1.a(r6, r8)
            goto Lca
        L51:
            int r8 = r8.c()
            r4 = -1
            if (r8 != r4) goto L78
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: "
            r8.append(r0)
            r8.append(r2)
            r8.append(r7)
            r8.append(r3)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            g0.r1.a(r6, r8)
            r0 = r2
            r1 = r3
            goto Lcb
        L78:
            boolean r8 = java.util.Objects.equals(r0, r2)
            if (r8 == 0) goto L9f
            if (r1 != r3) goto L9f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: "
            r8.append(r0)
            r8.append(r2)
            r8.append(r7)
            r8.append(r1)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            g0.r1.a(r6, r8)
            r0 = r2
            goto Lcb
        L9f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: "
            r8.append(r9)
            r8.append(r2)
            r8.append(r7)
            r8.append(r3)
            java.lang.String r9 = "), chosen mime type: "
            r8.append(r9)
            r8.append(r0)
            r8.append(r7)
            r8.append(r1)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            g0.r1.a(r6, r8)
        Lca:
            r9 = 0
        Lcb:
            l1.e$a r8 = l1.e.c(r0)
            java.lang.Object r8 = r8.a(r1)
            l1.e$a r8 = (l1.e.a) r8
            if (r9 == 0) goto Lda
            r8.c(r9)
        Lda:
            l1.e r8 = r8.b()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.b.c(f1.s, h1.i):l1.e");
    }

    public static i1.a d(e eVar, f1.a aVar, Rational rational) {
        a2.a d10 = eVar.d();
        return (i1.a) (d10 != null ? new f(aVar, d10, rational) : new g(aVar, rational)).get();
    }

    public static int e(f1.a aVar) {
        int e10 = aVar.e();
        if (e10 == -1) {
            r1.a("AudioConfigUtil", "Using default AUDIO source: 5");
            return 5;
        }
        r1.a("AudioConfigUtil", "Using provided AUDIO source: " + e10);
        return e10;
    }

    public static int f(f1.a aVar) {
        int f10 = aVar.f();
        if (f10 == -1) {
            r1.a("AudioConfigUtil", "Using default AUDIO source format: 2");
            return 2;
        }
        r1.a("AudioConfigUtil", "Using provided AUDIO source format: " + f10);
        return f10;
    }

    public static CaptureEncodeRates g(Range<Integer> range, int i10, int i11, int i12, Rational rational) {
        int i13;
        int c10;
        if (rational == null) {
            i13 = i(range, i11, i12, i10);
            c10 = i13;
        } else {
            Range<Integer> range2 = f1.a.b;
            if (!range.equals(range2)) {
                range2 = Range.create(Integer.valueOf(k.b(range.getLower().intValue(), rational)), Integer.valueOf(k.b(range.getUpper().intValue(), rational)));
            }
            i13 = i(range2, i11, i12, k.b(i10, rational));
            c10 = k.c(i13, rational);
        }
        r1.a("AudioConfigUtil", String.format(Locale.ENGLISH, "Resolved capture/encode sample rate %dHz/%dHz, [target sample rate range: %s, target sample rate: %d, channel count: %d, source format: %d, capture to encode sample rate ratio: %s]", Integer.valueOf(i13), Integer.valueOf(c10), range, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), rational));
        return new CaptureEncodeRates(i13, c10);
    }

    public static int h(int i10, int i11, int i12, int i13, int i14, Range<Integer> range) {
        int doubleValue = (int) (i10 * new Rational(i11, i12).doubleValue() * new Rational(i13, i14).doubleValue());
        String format = r1.f("AudioConfigUtil") ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(doubleValue)) : "";
        if (!f1.a.f16362a.equals(range)) {
            Integer clamp = range.clamp(Integer.valueOf(doubleValue));
            doubleValue = clamp.intValue();
            if (r1.f("AudioConfigUtil")) {
                format = format + String.format("\nClamped to range %s -> %dbps", range, clamp);
            }
        }
        r1.a("AudioConfigUtil", format);
        return doubleValue;
    }

    public static int i(Range<Integer> range, int i10, int i11, final int i12) {
        ArrayList arrayList = null;
        int i13 = 0;
        int i14 = i12;
        while (true) {
            if (!range.contains((Range<Integer>) Integer.valueOf(i14))) {
                r1.a("AudioConfigUtil", "Sample rate " + i14 + "Hz is not in target range " + range);
            } else {
                if (i1.n.o(i14, i10, i11)) {
                    return i14;
                }
                r1.a("AudioConfigUtil", "Sample rate " + i14 + "Hz is not supported by audio source with channel count " + i10 + " and source format " + i11);
            }
            if (arrayList == null) {
                r1.a("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i12 + "Hz");
                arrayList = new ArrayList(i1.a.f20066a);
                Collections.sort(arrayList, new Comparator() { // from class: l1.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return b.a(i12, (Integer) obj, (Integer) obj2);
                    }
                });
            }
            if (i13 >= arrayList.size()) {
                r1.a("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
            i14 = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }
}
