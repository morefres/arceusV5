package kotlin.time;

import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.e;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0010\u001a\u00020\n*\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017\"\u0014\u0010\u001c\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017\"\u0014\u0010\u001e\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017¨\u0006\u001f"}, d2 = {"", "isoString", "Lkotlin/time/e;", "n", "(Ljava/lang/CharSequence;)Lkotlin/time/e;", "Lkotlin/time/c;", Payload.INSTANT, "", "j", "(Lkotlin/time/c;)Ljava/lang/String;", "", "year", "", "l", "(I)Z", "isLeapYear", "m", "(IZ)I", "maxLength", "x", "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "", ve.a.f33391e, "[I", "POWERS_OF_TEN", j6.b.f21518e, "asciiDigitPositionsInIsoStringAfterYear", "c", "colonsInIsoOffsetString", rl.d.f30696a, "asciiDigitsInIsoOffsetString", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final int[] f23098a = {1, 10, 100, 1000, BacktraceMetrics.defaultTimeBetweenRetriesMs, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    @NotNull
    public static final int[] b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final int[] f23099c = {3, 6};

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final int[] f23100d = {1, 2, 4, 5, 7, 8};

    public static final String j(c cVar) {
        int[] iArr;
        StringBuilder sb2 = new StringBuilder();
        f a10 = f.INSTANCE.a(cVar);
        int year = a10.getYear();
        int i10 = 0;
        if (Math.abs(year) < 1000) {
            StringBuilder sb3 = new StringBuilder();
            if (year >= 0) {
                sb3.append(year + BacktraceMetrics.defaultTimeBetweenRetriesMs);
                Intrinsics.checkNotNullExpressionValue(sb3.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb3.append(year - BacktraceMetrics.defaultTimeBetweenRetriesMs);
                Intrinsics.checkNotNullExpressionValue(sb3.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb2.append((CharSequence) sb3);
        } else {
            if (year >= 10000) {
                sb2.append('+');
            }
            sb2.append(year);
        }
        sb2.append('-');
        k(sb2, sb2, a10.getMonth());
        sb2.append('-');
        k(sb2, sb2, a10.getDay());
        sb2.append('T');
        k(sb2, sb2, a10.getHour());
        sb2.append(':');
        k(sb2, sb2, a10.getMinute());
        sb2.append(':');
        k(sb2, sb2, a10.getSecond());
        if (a10.getNanosecond() != 0) {
            sb2.append('.');
            while (true) {
                int nanosecond = a10.getNanosecond();
                iArr = f23098a;
                int i11 = i10 + 1;
                if (nanosecond % iArr[i11] != 0) {
                    break;
                }
                i10 = i11;
            }
            int i12 = i10 - (i10 % 3);
            String valueOf = String.valueOf((a10.getNanosecond() / iArr[i12]) + iArr[9 - i12]);
            Intrinsics.d(valueOf, "null cannot be cast to non-null type java.lang.String");
            String substring = valueOf.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            sb2.append(substring);
        }
        sb2.append('Z');
        return sb2.toString();
    }

    public static final void k(Appendable appendable, StringBuilder sb2, int i10) {
        if (i10 < 10) {
            appendable.append('0');
        }
        sb2.append(i10);
    }

    public static final boolean l(int i10) {
        if ((i10 & 3) == 0) {
            return i10 % 100 != 0 || i10 % 400 == 0;
        }
        return false;
    }

    public static final int m(int i10, boolean z10) {
        return i10 != 2 ? (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) ? 30 : 31 : z10 ? 29 : 28;
    }

    public static final e n(CharSequence charSequence) {
        int i10;
        int i11;
        int i12;
        int i13;
        char charAt;
        char charAt2;
        if (charSequence.length() == 0) {
            return new e.a("An empty string is not a valid Instant", charSequence);
        }
        char charAt3 = charSequence.charAt(0);
        if (charAt3 == '+' || charAt3 == '-') {
            i10 = 1;
        } else {
            i10 = 0;
            charAt3 = ' ';
        }
        int i14 = 0;
        int i15 = i10;
        while (i15 < charSequence.length() && '0' <= (charAt2 = charSequence.charAt(i15)) && charAt2 < ':') {
            i14 = (i14 * 10) + (charSequence.charAt(i15) - '0');
            i15++;
        }
        int i16 = i15 - i10;
        if (i16 > 10) {
            return v(charSequence, "Expected at most 10 digits for the year number, got " + i16 + " digits");
        }
        if (i16 == 10 && Intrinsics.f(charSequence.charAt(i10), 50) >= 0) {
            return v(charSequence, "Expected at most 9 digits for the year number or year 1000000000, got " + i16 + " digits");
        }
        if (i16 < 4) {
            return v(charSequence, "The year number must be padded to 4 digits, got " + i16 + " digits");
        }
        if (charAt3 == '+' && i16 == 4) {
            return v(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
        }
        if (charAt3 == ' ' && i16 != 4) {
            return v(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
        }
        if (charAt3 == '-') {
            i14 = -i14;
        }
        int i17 = i14;
        int i18 = i15 + 16;
        if (charSequence.length() < i18) {
            return v(charSequence, "The input string is too short");
        }
        e.a o8 = o(charSequence, "'-'", i15, new Function1() { // from class: iu.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean p8;
                p8 = kotlin.time.d.p(((Character) obj).charValue());
                return Boolean.valueOf(p8);
            }
        });
        if (o8 != null) {
            return o8;
        }
        e.a o10 = o(charSequence, "'-'", i15 + 3, new Function1() { // from class: iu.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean r8;
                r8 = kotlin.time.d.r(((Character) obj).charValue());
                return Boolean.valueOf(r8);
            }
        });
        if (o10 != null) {
            return o10;
        }
        e.a o11 = o(charSequence, "'T' or 't'", i15 + 6, new Function1() { // from class: iu.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean s8;
                s8 = kotlin.time.d.s(((Character) obj).charValue());
                return Boolean.valueOf(s8);
            }
        });
        if (o11 != null) {
            return o11;
        }
        e.a o12 = o(charSequence, "':'", i15 + 9, new Function1() { // from class: iu.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean t8;
                t8 = kotlin.time.d.t(((Character) obj).charValue());
                return Boolean.valueOf(t8);
            }
        });
        if (o12 != null) {
            return o12;
        }
        e.a o13 = o(charSequence, "':'", i15 + 12, new Function1() { // from class: iu.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean u8;
                u8 = kotlin.time.d.u(((Character) obj).charValue());
                return Boolean.valueOf(u8);
            }
        });
        if (o13 != null) {
            return o13;
        }
        for (int i19 : b) {
            e.a o14 = o(charSequence, "an ASCII digit", i19 + i15, new Function1() { // from class: iu.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean q10;
                    q10 = kotlin.time.d.q(((Character) obj).charValue());
                    return Boolean.valueOf(q10);
                }
            });
            if (o14 != null) {
                return o14;
            }
        }
        int w5 = w(charSequence, i15 + 1);
        int w10 = w(charSequence, i15 + 4);
        int w11 = w(charSequence, i15 + 7);
        int w12 = w(charSequence, i15 + 10);
        int w13 = w(charSequence, i15 + 13);
        int i20 = i15 + 15;
        if (charSequence.charAt(i20) == '.') {
            i20 = i18;
            int i21 = 0;
            while (i20 < charSequence.length() && '0' <= (charAt = charSequence.charAt(i20)) && charAt < ':') {
                i21 = (i21 * 10) + (charSequence.charAt(i20) - '0');
                i20++;
            }
            int i22 = i20 - i18;
            if (1 > i22 || i22 >= 10) {
                return v(charSequence, "1..9 digits are supported for the fraction of the second, got " + i22 + " digits");
            }
            i11 = i21 * f23098a[9 - i22];
        } else {
            i11 = 0;
        }
        if (i20 >= charSequence.length()) {
            return v(charSequence, "The UTC offset at the end of the string is missing");
        }
        char charAt4 = charSequence.charAt(i20);
        if (charAt4 == '+' || charAt4 == '-') {
            int length = charSequence.length() - i20;
            if (length > 9) {
                return v(charSequence, "The UTC offset string \"" + x(charSequence.subSequence(i20, charSequence.length()).toString(), 16) + "\" is too long");
            }
            if (length % 3 != 0) {
                return v(charSequence, "Invalid UTC offset string \"" + charSequence.subSequence(i20, charSequence.length()).toString() + '\"');
            }
            for (int i23 : f23099c) {
                int i24 = i20 + i23;
                if (i24 >= charSequence.length()) {
                    break;
                }
                if (charSequence.charAt(i24) != ':') {
                    return v(charSequence, "Expected ':' at index " + i24 + ", got '" + charSequence.charAt(i24) + '\'');
                }
            }
            int[] iArr = f23100d;
            int length2 = iArr.length;
            int i25 = 0;
            while (i25 < length2) {
                int i26 = iArr[i25] + i20;
                if (i26 >= charSequence.length()) {
                    break;
                }
                char charAt5 = charSequence.charAt(i26);
                int[] iArr2 = iArr;
                if ('0' > charAt5 || charAt5 >= ':') {
                    return v(charSequence, "Expected an ASCII digit at index " + i26 + ", got '" + charSequence.charAt(i26) + '\'');
                }
                i25++;
                iArr = iArr2;
            }
            int w14 = w(charSequence, i20 + 1);
            i12 = 3;
            int w15 = length > 3 ? w(charSequence, i20 + 4) : 0;
            int w16 = length > 6 ? w(charSequence, i20 + 7) : 0;
            if (w15 > 59) {
                return v(charSequence, "Expected offset-minute-of-hour in 0..59, got " + w15);
            }
            if (w16 > 59) {
                return v(charSequence, "Expected offset-second-of-minute in 0..59, got " + w16);
            }
            if (w14 > 17 && (w14 != 18 || w15 != 0 || w16 != 0)) {
                return v(charSequence, "Expected an offset in -18:00..+18:00, got " + charSequence.subSequence(i20, charSequence.length()).toString());
            }
            i13 = (charAt4 == '-' ? -1 : 1) * ((w14 * 3600) + (w15 * 60) + w16);
        } else {
            if (charAt4 != 'Z' && charAt4 != 'z') {
                return v(charSequence, "Expected the UTC offset at position " + i20 + ", got '" + charAt4 + '\'');
            }
            int i27 = i20 + 1;
            if (charSequence.length() != i27) {
                return v(charSequence, "Extra text after the instant at position " + i27);
            }
            i13 = 0;
            i12 = 3;
        }
        if (1 > w5 || w5 >= 13) {
            return v(charSequence, "Expected a month number in 1..12, got " + w5);
        }
        if (1 > w10 || w10 > m(w5, l(i17))) {
            return v(charSequence, "Expected a valid day-of-month for month " + w5 + " of year " + i17 + ", got " + w10);
        }
        if (w11 > 23) {
            return v(charSequence, "Expected hour in 0..23, got " + w11);
        }
        if (w12 > 59) {
            return v(charSequence, "Expected minute-of-hour in 0..59, got " + w12);
        }
        if (w13 > 59) {
            return v(charSequence, "Expected second-of-minute in 0..59, got " + w13);
        }
        f fVar = new f(i17, w5, w10, w11, w12, w13, i11);
        long year = fVar.getYear();
        long j10 = 365 * year;
        long month = (year >= 0 ? j10 + (((i12 + year) / 4) - ((99 + year) / 100)) + ((year + 399) / 400) : j10 - (((year / (-4)) - (year / (-100))) + (year / (-400)))) + (((fVar.getMonth() * 367) - 362) / 12) + (fVar.getDay() - 1);
        if (fVar.getMonth() > 2) {
            month = !l(fVar.getYear()) ? month - 2 : (-1) + month;
        }
        return new e.b((((month - 719528) * 86400) + (((fVar.getHour() * 3600) + (fVar.getMinute() * 60)) + fVar.getSecond())) - i13, fVar.getNanosecond());
    }

    public static final e.a o(CharSequence charSequence, String str, int i10, Function1<? super Character, Boolean> function1) {
        char charAt = charSequence.charAt(i10);
        if (function1.invoke(Character.valueOf(charAt)).booleanValue()) {
            return null;
        }
        return v(charSequence, "Expected " + str + ", but got '" + charAt + "' at position " + i10);
    }

    public static final boolean p(char c10) {
        return c10 == '-';
    }

    public static final boolean q(char c10) {
        return '0' <= c10 && c10 < ':';
    }

    public static final boolean r(char c10) {
        return c10 == '-';
    }

    public static final boolean s(char c10) {
        return c10 == 'T' || c10 == 't';
    }

    public static final boolean t(char c10) {
        return c10 == ':';
    }

    public static final boolean u(char c10) {
        return c10 == ':';
    }

    public static final e.a v(CharSequence charSequence, String str) {
        return new e.a(str + " when parsing an Instant from \"" + x(charSequence, 64) + '\"', charSequence);
    }

    public static final int w(CharSequence charSequence, int i10) {
        return ((charSequence.charAt(i10) - '0') * 10) + (charSequence.charAt(i10 + 1) - '0');
    }

    public static final String x(CharSequence charSequence, int i10) {
        if (charSequence.length() <= i10) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i10).toString() + "...";
    }
}
