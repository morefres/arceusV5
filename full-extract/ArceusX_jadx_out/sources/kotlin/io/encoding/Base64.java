package kotlin.io.encoding;

import com.appsflyer.sdk_base.referrer.Payload;
import j6.b;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import rl.d;
import ve.a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0015\b\u0017\u0018\u0000 12\u00020\u0001:\u00022\"B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u001e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0000¢\u0006\u0004\b!\u0010\u001bJ'\u0010\"\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\"\u0010 J'\u0010$\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0000¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b)\u0010(R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010-\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010*¨\u00063"}, d2 = {"Lkotlin/io/encoding/Base64;", "", "", "isUrlSafe", "isMimeScheme", "", "mimeLineLength", "Lkotlin/io/encoding/Base64$PaddingOption;", "paddingOption", "<init>", "(ZZILkotlin/io/encoding/Base64$PaddingOption;)V", "", Payload.SOURCE, "destination", "destinationOffset", "startIndex", "endIndex", "h", "([B[BIII)I", "padIndex", "byteStart", "j", "([BIII)I", "", b.f21518e, "(I)V", "k", "([BII)I", "e", "([BII)[B", "", d.f30696a, "(Ljava/lang/CharSequence;II)[B", "i", a.f33391e, "sourceSize", "c", "(III)V", "Z", "isUrlSafe$kotlin_stdlib", "()Z", "isMimeScheme$kotlin_stdlib", "I", "getMimeLineLength$kotlin_stdlib", "()I", "Lkotlin/io/encoding/Base64$PaddingOption;", "getPaddingOption$kotlin_stdlib", "()Lkotlin/io/encoding/Base64$PaddingOption;", "mimeGroupsPerLine", "f", "PaddingOption", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class Base64 {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final byte[] f22941g = {13, 10};

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Base64 f22942h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Base64 f22943i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Base64 f22944j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isUrlSafe;

    /* renamed from: b, reason: from kotlin metadata */
    public final boolean isMimeScheme;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int mimeLineLength;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PaddingOption paddingOption;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int mimeGroupsPerLine;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlin/io/encoding/Base64$PaddingOption;", "", "<init>", "(Ljava/lang/String;I)V", a.f33391e, b.f21518e, "c", d.f30696a, "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaddingOption {

        /* renamed from: a, reason: collision with root package name */
        public static final PaddingOption f22949a = new PaddingOption("PRESENT", 0);
        public static final PaddingOption b = new PaddingOption("ABSENT", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final PaddingOption f22950c = new PaddingOption("PRESENT_OPTIONAL", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final PaddingOption f22951d = new PaddingOption("ABSENT_OPTIONAL", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ PaddingOption[] f22952e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ pt.a f22953f;

        static {
            PaddingOption[] a10 = a();
            f22952e = a10;
            f22953f = pt.b.a(a10);
        }

        public PaddingOption(String str, int i10) {
        }

        public static final /* synthetic */ PaddingOption[] a() {
            return new PaddingOption[]{f22949a, b, f22950c, f22951d};
        }

        public static PaddingOption valueOf(String str) {
            return (PaddingOption) Enum.valueOf(PaddingOption.class, str);
        }

        public static PaddingOption[] values() {
            return (PaddingOption[]) f22952e.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lkotlin/io/encoding/Base64$a;", "Lkotlin/io/encoding/Base64;", "<init>", "()V", "", "bitsPerByte", "I", "bitsPerSymbol", "bytesPerGroup", "symbolsPerGroup", "", "padSymbol", "B", "lineLengthMime", "lineLengthPem", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kotlin.io.encoding.Base64$a, reason: from kotlin metadata */
    public static final class Companion extends Base64 {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
            super(false, false, -1, PaddingOption.f22949a, null);
        }
    }

    static {
        PaddingOption paddingOption = PaddingOption.f22949a;
        f22942h = new Base64(true, false, -1, paddingOption);
        f22943i = new Base64(false, true, 76, paddingOption);
        f22944j = new Base64(false, true, 64, paddingOption);
    }

    public /* synthetic */ Base64(boolean z10, boolean z11, int i10, PaddingOption paddingOption, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, i10, paddingOption);
    }

    public static /* synthetic */ byte[] f(Base64 base64, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return base64.d(charSequence, i10, i11);
    }

    public static /* synthetic */ byte[] g(Base64 base64, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return base64.e(bArr, i10, i11);
    }

    @NotNull
    public final byte[] a(@NotNull CharSequence source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        c(source.length(), startIndex, endIndex);
        byte[] bArr = new byte[endIndex - startIndex];
        int i10 = 0;
        while (startIndex < endIndex) {
            char charAt = source.charAt(startIndex);
            if (charAt <= 255) {
                bArr[i10] = (byte) charAt;
                i10++;
            } else {
                bArr[i10] = 63;
                i10++;
            }
            startIndex++;
        }
        return bArr;
    }

    public final void b(int padIndex) {
        if (this.paddingOption != PaddingOption.b) {
            return;
        }
        throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + padIndex);
    }

    public final void c(int sourceSize, int startIndex, int endIndex) {
        kotlin.collections.d.INSTANCE.a(startIndex, endIndex, sourceSize);
    }

    @NotNull
    public final byte[] d(@NotNull CharSequence source, int startIndex, int endIndex) {
        byte[] a10;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof String) {
            String str = (String) source;
            c(str.length(), startIndex, endIndex);
            String substring = str.substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.d(substring, "null cannot be cast to non-null type java.lang.String");
            a10 = substring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(a10, "getBytes(...)");
        } else {
            a10 = a(source, startIndex, endIndex);
        }
        return g(this, a10, 0, 0, 6, null);
    }

    @NotNull
    public final byte[] e(@NotNull byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        c(source.length, startIndex, endIndex);
        int i10 = i(source, startIndex, endIndex);
        byte[] bArr = new byte[i10];
        if (h(source, bArr, 0, startIndex, endIndex) == i10) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int h(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        int i10;
        int i11;
        int i12;
        int[] iArr = this.isUrlSafe ? ut.a.f33142d : ut.a.b;
        int i13 = -8;
        int i14 = destinationOffset;
        int i15 = startIndex;
        int i16 = -8;
        int i17 = 0;
        while (true) {
            if (i15 >= endIndex) {
                i10 = 8;
                i11 = 0;
                break;
            }
            if (i16 != i13 || i15 + 3 >= endIndex) {
                i10 = 8;
                i12 = 1;
            } else {
                i10 = 8;
                i12 = 1;
                int i18 = i15 + 4;
                int i19 = (iArr[source[i15 + 1] & 255] << 12) | (iArr[source[i15] & 255] << 18) | (iArr[source[i15 + 2] & 255] << 6) | iArr[source[i15 + 3] & 255];
                if (i19 >= 0) {
                    destination[i14] = (byte) (i19 >> 16);
                    int i20 = i14 + 2;
                    destination[i14 + 1] = (byte) (i19 >> 8);
                    i14 += 3;
                    destination[i20] = (byte) i19;
                    i15 = i18;
                    i13 = -8;
                }
            }
            int i21 = source[i15] & 255;
            int i22 = iArr[i21];
            if (i22 >= 0) {
                i15++;
                i17 = (i17 << 6) | i22;
                int i23 = i16 + 6;
                if (i23 >= 0) {
                    destination[i14] = (byte) (i17 >>> i23);
                    i17 &= (i12 << i23) - 1;
                    i16 -= 2;
                    i14++;
                } else {
                    i16 = i23;
                }
            } else {
                if (i22 == -2) {
                    i15 = j(source, i15, endIndex, i16);
                    i11 = i12;
                    break;
                }
                if (!this.isMimeScheme) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid symbol '");
                    sb2.append((char) i21);
                    sb2.append("'(");
                    String num = Integer.toString(i21, CharsKt.checkRadix(i10));
                    Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
                    sb2.append(num);
                    sb2.append(") at index ");
                    sb2.append(i15);
                    throw new IllegalArgumentException(sb2.toString());
                }
                i15++;
            }
            i13 = -8;
        }
        if (i16 == -2) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i16 != -8 && i11 == 0 && this.paddingOption == PaddingOption.f22949a) {
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i17 != 0) {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        int k10 = k(source, i15, endIndex);
        if (k10 >= endIndex) {
            return i14 - destinationOffset;
        }
        int i24 = source[k10] & 255;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Symbol '");
        sb3.append((char) i24);
        sb3.append("'(");
        String num2 = Integer.toString(i24, CharsKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(num2, "toString(...)");
        sb3.append(num2);
        sb3.append(") at index ");
        sb3.append(k10 - 1);
        sb3.append(" is prohibited after the pad character");
        throw new IllegalArgumentException(sb3.toString());
    }

    public final int i(@NotNull byte[] source, int startIndex, int endIndex) {
        int[] iArr;
        Intrinsics.checkNotNullParameter(source, "source");
        int i10 = endIndex - startIndex;
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + startIndex + ", endIndex: " + endIndex);
        }
        if (this.isMimeScheme) {
            while (true) {
                if (startIndex >= endIndex) {
                    break;
                }
                int i11 = source[startIndex] & 255;
                iArr = ut.a.b;
                int i12 = iArr[i11];
                if (i12 < 0) {
                    if (i12 == -2) {
                        i10 -= endIndex - startIndex;
                        break;
                    }
                    i10--;
                }
                startIndex++;
            }
        } else if (source[endIndex - 1] == 61) {
            i10 = source[endIndex + (-2)] == 61 ? i10 - 2 : i10 - 1;
        }
        return (int) ((i10 * 6) / 8);
    }

    public final int j(byte[] source, int padIndex, int endIndex, int byteStart) {
        if (byteStart == -8) {
            throw new IllegalArgumentException("Redundant pad character at index " + padIndex);
        }
        if (byteStart == -6) {
            b(padIndex);
            return padIndex + 1;
        }
        if (byteStart != -4) {
            if (byteStart == -2) {
                return padIndex + 1;
            }
            throw new IllegalStateException("Unreachable");
        }
        b(padIndex);
        int k10 = k(source, padIndex + 1, endIndex);
        if (k10 != endIndex && source[k10] == 61) {
            return k10 + 1;
        }
        throw new IllegalArgumentException("Missing one pad character at index " + k10);
    }

    public final int k(byte[] source, int startIndex, int endIndex) {
        int[] iArr;
        if (!this.isMimeScheme) {
            return startIndex;
        }
        while (startIndex < endIndex) {
            int i10 = source[startIndex] & 255;
            iArr = ut.a.b;
            if (iArr[i10] != -1) {
                break;
            }
            startIndex++;
        }
        return startIndex;
    }

    public Base64(boolean z10, boolean z11, int i10, PaddingOption paddingOption) {
        this.isUrlSafe = z10;
        this.isMimeScheme = z11;
        this.mimeLineLength = i10;
        this.paddingOption = paddingOption;
        if (z10 && z11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.mimeGroupsPerLine = i10 / 4;
    }
}
