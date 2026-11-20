package k6;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u001aS\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001aA\u0010\n\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u0000*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u001a\u0010 \u001a\u00020\u001d*\u0004\u0018\u00010\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"", "scheme", "authority", "path", "query", "fragment", "separator", "Lk6/h0;", ve.a.f33391e, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lk6/h0;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "i", "(Ljava/lang/String;Ljava/lang/String;)Lk6/h0;", "data", "original", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lk6/h0;", "", "bytes", "h", "(Ljava/lang/String;[B)Ljava/lang/String;", "", "f", "(Lk6/h0;)Ljava/util/List;", "pathSegments", rl.d.f30696a, "(Lk6/h0;)Ljava/lang/String;", "filePath", "", "e", "(Ljava/lang/String;)I", "length", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i0 {
    @NotNull
    public static final h0 a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull String str6) {
        if (str == null && str2 == null && str3 == null && str4 == null && str5 == null) {
            throw new IllegalArgumentException("At least one of scheme, authority, path, query, or fragment must be non-null.");
        }
        return new h0(c(str, str2, str3, str4, str5), str6, str, str2, str3, str4, str5);
    }

    public static /* synthetic */ h0 b(String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            str4 = null;
        }
        if ((i10 & 16) != 0) {
            str5 = null;
        }
        if ((i10 & 32) != 0) {
            str6 = wu.h0.f34823c;
        }
        return a(str, str2, str3, str4, str5, str6);
    }

    public static final String c(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            sb2.append(str);
            sb2.append(':');
        }
        if (str2 != null) {
            sb2.append("//");
            sb2.append(str2);
        }
        if (str3 != null) {
            sb2.append(str3);
        }
        if (str4 != null) {
            sb2.append('?');
            sb2.append(str4);
        }
        if (str5 != null) {
            sb2.append('#');
            sb2.append(str5);
        }
        return sb2.toString();
    }

    @Nullable
    public static final String d(@NotNull h0 h0Var) {
        List<String> f10 = f(h0Var);
        if (f10.isEmpty()) {
            return null;
        }
        String path = h0Var.getPath();
        Intrinsics.checkNotNull(path);
        return CollectionsKt.m0(f10, h0Var.getSeparator(), kotlin.text.x.T(path, h0Var.getSeparator(), false, 2, null) ? h0Var.getSeparator() : "", null, 0, null, null, 60, null);
    }

    public static final int e(String str) {
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    @NotNull
    public static final List<String> f(@NotNull h0 h0Var) {
        String path = h0Var.getPath();
        if (path == null) {
            return kotlin.collections.p.k();
        }
        ArrayList arrayList = new ArrayList();
        int i10 = -1;
        while (i10 < path.length()) {
            int i11 = i10 + 1;
            i10 = StringsKt.m0(path, '/', i11, false, 4, null);
            if (i10 == -1) {
                i10 = path.length();
            }
            String substring = path.substring(i11, i10);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (substring.length() > 0) {
                arrayList.add(substring);
            }
        }
        return arrayList;
    }

    public static final h0 g(String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z10 = true;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = 0;
        while (i15 < str.length()) {
            char charAt = str.charAt(i15);
            if (charAt != '#') {
                if (charAt != '/') {
                    if (charAt != ':') {
                        if (charAt == '?' && i12 == -1 && i10 == -1) {
                            i12 = i15 + 1;
                        }
                    } else if (z10 && i12 == -1 && i10 == -1) {
                        int i16 = i15 + 2;
                        if (i16 < str2.length() && str2.charAt(i15 + 1) == '/' && str2.charAt(i16) == '/') {
                            i13 = i15 + 3;
                            z10 = false;
                            i14 = i15;
                            i15 = i16;
                        } else if (Intrinsics.c(str, str2)) {
                            i11 = i15 + 1;
                            i14 = i15;
                            i15 = i11;
                            i13 = i15;
                        }
                    }
                } else if (i11 == -1 && i12 == -1 && i10 == -1) {
                    i11 = i13 == -1 ? 0 : i15;
                    z10 = false;
                }
            } else if (i10 == -1) {
                i10 = i15 + 1;
            }
            i15++;
        }
        int min = Math.min(i10 == -1 ? Integer.MAX_VALUE : i10 - 1, str.length());
        int min2 = Math.min(i12 == -1 ? Integer.MAX_VALUE : i12 - 1, min);
        if (i13 != -1) {
            str5 = str.substring(0, i14);
            Intrinsics.checkNotNullExpressionValue(str5, "substring(...)");
            str4 = str.substring(i13, Math.min(i11 != -1 ? i11 : Integer.MAX_VALUE, min2));
            Intrinsics.checkNotNullExpressionValue(str4, "substring(...)");
        } else {
            str4 = null;
            str5 = null;
        }
        if (i11 != -1) {
            str6 = str.substring(i11, min2);
            Intrinsics.checkNotNullExpressionValue(str6, "substring(...)");
        } else {
            str6 = null;
        }
        if (i12 != -1) {
            str7 = str.substring(i12, min);
            Intrinsics.checkNotNullExpressionValue(str7, "substring(...)");
        } else {
            str7 = null;
        }
        if (i10 != -1) {
            str8 = str.substring(i10, str.length());
            Intrinsics.checkNotNullExpressionValue(str8, "substring(...)");
        } else {
            str8 = null;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(e(str5), Math.max(e(str4), Math.max(e(str6), Math.max(e(str7), e(str8))))) - 2)];
        return new h0(str, str3, str5 != null ? h(str5, bArr) : null, str4 != null ? h(str4, bArr) : null, str6 != null ? h(str6, bArr) : null, str7 != null ? h(str7, bArr) : null, str8 != null ? h(str8, bArr) : null);
    }

    public static final String h(String str, byte[] bArr) {
        byte[] bArr2;
        int length = str.length();
        int i10 = 0;
        int max = Math.max(0, length - 2);
        int i11 = 0;
        while (true) {
            if (i10 < max) {
                bArr2 = bArr;
                if (str.charAt(i10) == '%') {
                    int i12 = i10 + 3;
                    try {
                        String substring = str.substring(i10 + 1, i12);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        bArr2[i11] = (byte) Integer.parseInt(substring, CharsKt.checkRadix(16));
                        i11++;
                        bArr = bArr2;
                        i10 = i12;
                    } catch (NumberFormatException unused) {
                    }
                }
            } else {
                if (i10 == i11) {
                    return str;
                }
                if (i10 >= length) {
                    return kotlin.text.x.A(bArr, 0, i11, false, 5, null);
                }
                bArr2 = bArr;
            }
            bArr2[i11] = (byte) str.charAt(i10);
            i11++;
            i10++;
            bArr = bArr2;
        }
    }

    @NotNull
    public static final h0 i(@NotNull String str, @NotNull String str2) {
        String str3;
        String str4;
        if (Intrinsics.c(str2, "/")) {
            str3 = str;
            str4 = str2;
        } else {
            str3 = str;
            str4 = str2;
            str = kotlin.text.x.N(str3, str4, "/", false, 4, null);
        }
        return g(str, str3, str4);
    }

    public static /* synthetic */ h0 j(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = wu.h0.f34823c;
        }
        return i(str, str2);
    }
}
