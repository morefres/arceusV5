package okhttp3.internal.idn;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import kotlin.ranges.d;
import kotlin.text.StringsKt;
import kotlin.text.b;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wu.e;
import wu.h;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010&R\u0018\u0010/\u001a\u00020\u0006*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lokhttp3/internal/idn/Punycode;", "", "<init>", "()V", "", InquiryField.StringField.TYPE, "", "pos", "limit", "Lwu/e;", "result", "", "encodeLabel", "(Ljava/lang/String;IILwu/e;)Z", "decodeLabel", "delta", "numpoints", "first", "adapt", "(IIZ)I", "requiresEncode", "(Ljava/lang/String;II)Z", "", "codePoints", "(Ljava/lang/String;II)Ljava/util/List;", "encode", "(Ljava/lang/String;)Ljava/lang/String;", "decode", "PREFIX_STRING", "Ljava/lang/String;", "getPREFIX_STRING", "()Ljava/lang/String;", "Lwu/h;", "PREFIX", "Lwu/h;", "getPREFIX", "()Lwu/h;", "BASE", "I", "TMIN", "TMAX", "SKEW", "DAMP", "INITIAL_BIAS", "INITIAL_N", "getPunycodeDigit", "(I)I", "punycodeDigit", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Punycode {
    private static final int BASE = 36;
    private static final int DAMP = 700;
    private static final int INITIAL_BIAS = 72;
    private static final int INITIAL_N = 128;
    private static final int SKEW = 38;
    private static final int TMAX = 26;
    private static final int TMIN = 1;

    @NotNull
    public static final Punycode INSTANCE = new Punycode();

    @NotNull
    private static final String PREFIX_STRING = "xn--";

    @NotNull
    private static final h PREFIX = h.INSTANCE.d("xn--");

    private Punycode() {
    }

    private final int adapt(int delta, int numpoints, boolean first) {
        int i10 = first ? delta / DAMP : delta / 2;
        int i11 = i10 + (i10 / numpoints);
        int i12 = 0;
        while (i11 > 455) {
            i11 /= 35;
            i12 += 36;
        }
        return i12 + ((i11 * 36) / (i11 + 38));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [char] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    private final List<Integer> codePoints(String str, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        while (i10 < i11) {
            int charAt = str.charAt(i10);
            if (b.e(charAt)) {
                int i12 = i10 + 1;
                char charAt2 = i12 < i11 ? str.charAt(i12) : (char) 0;
                if (Character.isLowSurrogate(charAt) || !Character.isLowSurrogate(charAt2)) {
                    charAt = 63;
                } else {
                    charAt = 65536 + (((charAt & 1023) << 10) | (charAt2 & 1023));
                    i10 = i12;
                }
            }
            arrayList.add(Integer.valueOf(charAt));
            i10++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.ArrayList, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [boolean] */
    private final boolean decodeLabel(String string, int pos, int limit, e result) {
        int i10;
        int i11;
        int i12 = 1;
        if (!x.H(string, pos, PREFIX_STRING, 0, 4, true)) {
            result.I0(string, pos, limit);
            return true;
        }
        int i13 = pos + 4;
        ?? arrayList = new ArrayList();
        int s02 = StringsKt.s0(string, '-', limit, false, 4, null);
        char c10 = '0';
        char c11 = '[';
        char c12 = '{';
        boolean z10 = false;
        if (s02 >= i13) {
            while (i13 < s02) {
                int i14 = i13 + 1;
                char charAt = string.charAt(i13);
                if (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && (('0' > charAt || charAt >= ':') && charAt != '-'))) {
                    return false;
                }
                arrayList.add(Integer.valueOf(charAt));
                i13 = i14;
            }
            i13++;
        }
        int i15 = 128;
        int i16 = INITIAL_BIAS;
        int i17 = 0;
        while (i13 < limit) {
            int i18 = i12;
            boolean z11 = z10;
            a p8 = d.p(d.q(36, Integer.MAX_VALUE), 36);
            int first = p8.getFirst();
            int last = p8.getLast();
            int step = p8.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                i10 = i17;
                int i19 = i18;
                while (i13 != limit) {
                    int i20 = i13 + 1;
                    char charAt2 = string.charAt(i13);
                    if ('a' <= charAt2 && charAt2 < c12) {
                        i11 = charAt2 - 'a';
                    } else if ('A' <= charAt2 && charAt2 < c11) {
                        i11 = charAt2 - 'A';
                    } else {
                        if (c10 > charAt2 || charAt2 >= ':') {
                            return z11;
                        }
                        i11 = charAt2 - 22;
                    }
                    int i21 = i19;
                    int i22 = i11 * i21;
                    int i23 = i10;
                    if (i23 > Integer.MAX_VALUE - i22) {
                        return z11;
                    }
                    i10 = i23 + i22;
                    int i24 = first <= i16 ? i18 : first >= i16 + 26 ? 26 : first - i16;
                    if (i11 >= i24) {
                        int i25 = 36 - i24;
                        if (i21 > Integer.MAX_VALUE / i25) {
                            return z11;
                        }
                        i19 = i21 * i25;
                        if (first != last) {
                            first += step;
                            i13 = i20;
                            c10 = '0';
                            c11 = '[';
                            c12 = '{';
                        }
                    }
                    i13 = i20;
                }
                return z11;
            }
            i10 = i17;
            i16 = adapt(i10 - i17, arrayList.size() + 1, i17 == 0 ? i18 : z11);
            int size = i10 / (arrayList.size() + 1);
            if (i15 > Integer.MAX_VALUE - size) {
                return z11;
            }
            i15 += size;
            int size2 = i10 % (arrayList.size() + 1);
            if (i15 > 1114111) {
                return z11;
            }
            arrayList.add(size2, Integer.valueOf(i15));
            i17 = size2 + 1;
            z10 = z11;
            i12 = i18;
            c10 = '0';
            c11 = '[';
            c12 = '{';
        }
        ?? r16 = i12;
        int size3 = arrayList.size();
        for (?? r13 = z10; r13 < size3; r13++) {
            result.T(((Number) arrayList.get(r13)).intValue());
        }
        return r16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean encodeLabel(String string, int pos, int limit, e result) {
        int i10;
        int i11;
        int i12;
        int i13 = 1;
        if (!requiresEncode(string, pos, limit)) {
            result.I0(string, pos, limit);
            return true;
        }
        result.s2(PREFIX);
        List<Integer> codePoints = codePoints(string, pos, limit);
        Iterator<Integer> it = codePoints.iterator();
        int i14 = 0;
        while (true) {
            i10 = 128;
            if (!it.hasNext()) {
                break;
            }
            int intValue = it.next().intValue();
            if (intValue < 128) {
                result.writeByte(intValue);
                i14++;
            }
        }
        if (i14 > 0) {
            result.writeByte(45);
        }
        int i15 = INITIAL_BIAS;
        int i16 = 0;
        int i17 = i14;
        while (i17 < codePoints.size()) {
            Iterator<T> it2 = codePoints.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it2.next();
            if (it2.hasNext()) {
                int intValue2 = ((Number) next).intValue();
                if (intValue2 < i10) {
                    intValue2 = Integer.MAX_VALUE;
                }
                do {
                    Object next2 = it2.next();
                    int intValue3 = ((Number) next2).intValue();
                    if (intValue3 < i10) {
                        intValue3 = Integer.MAX_VALUE;
                    }
                    if (intValue2 > intValue3) {
                        next = next2;
                        intValue2 = intValue3;
                    }
                } while (it2.hasNext());
            }
            int intValue4 = ((Number) next).intValue();
            int i18 = (intValue4 - i10) * (i17 + 1);
            if (i16 > Integer.MAX_VALUE - i18) {
                return false;
            }
            int i19 = i16 + i18;
            Iterator<Integer> it3 = codePoints.iterator();
            while (it3.hasNext()) {
                int intValue5 = it3.next().intValue();
                if (intValue5 < intValue4) {
                    if (i19 == Integer.MAX_VALUE) {
                        return false;
                    }
                    i19++;
                } else if (intValue5 == intValue4) {
                    a p8 = d.p(d.q(36, Integer.MAX_VALUE), 36);
                    int first = p8.getFirst();
                    int last = p8.getLast();
                    int step = p8.getStep();
                    if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                        i12 = i19;
                        while (true) {
                            if (first <= i15) {
                                i11 = i13;
                            } else {
                                i11 = i13;
                                i13 = first >= i15 + 26 ? 26 : first - i15;
                            }
                            if (i12 < i13) {
                                break;
                            }
                            int i20 = i12 - i13;
                            int i21 = 36 - i13;
                            result.writeByte(getPunycodeDigit(i13 + (i20 % i21)));
                            i12 = i20 / i21;
                            if (first == last) {
                                break;
                            }
                            first += step;
                            i13 = i11;
                        }
                    } else {
                        i11 = i13;
                        i12 = i19;
                    }
                    result.writeByte(getPunycodeDigit(i12));
                    int i22 = i17 + 1;
                    i15 = adapt(i19, i22, i17 == i14 ? i11 : false);
                    i17 = i22;
                    i19 = 0;
                    i13 = i11;
                }
            }
            i16 = i19 + 1;
            i10 = intValue4 + 1;
        }
        return i13;
    }

    private final int getPunycodeDigit(int i10) {
        if (i10 < 26) {
            return i10 + 97;
        }
        if (i10 < 36) {
            return i10 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i10).toString());
    }

    private final boolean requiresEncode(String str, int i10, int i11) {
        while (i10 < i11) {
            if (str.charAt(i10) >= 128) {
                return true;
            }
            i10++;
        }
        return false;
    }

    @Nullable
    public final String decode(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        int length = string.length();
        e eVar = new e();
        int i10 = 0;
        while (i10 < length) {
            String str = string;
            int m02 = StringsKt.m0(str, '.', i10, false, 4, null);
            if (m02 == -1) {
                m02 = length;
            }
            if (!decodeLabel(str, i10, m02, eVar)) {
                return null;
            }
            if (m02 >= length) {
                break;
            }
            eVar.writeByte(46);
            i10 = m02 + 1;
            string = str;
        }
        return eVar.S2();
    }

    @Nullable
    public final String encode(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        int length = string.length();
        e eVar = new e();
        int i10 = 0;
        while (i10 < length) {
            String str = string;
            int m02 = StringsKt.m0(str, '.', i10, false, 4, null);
            if (m02 == -1) {
                m02 = length;
            }
            if (!encodeLabel(str, i10, m02, eVar)) {
                return null;
            }
            if (m02 >= length) {
                break;
            }
            eVar.writeByte(46);
            i10 = m02 + 1;
            string = str;
        }
        return eVar.S2();
    }

    @NotNull
    public final h getPREFIX() {
        return PREFIX;
    }

    @NotNull
    public final String getPREFIX_STRING() {
        return PREFIX_STRING;
    }
}
