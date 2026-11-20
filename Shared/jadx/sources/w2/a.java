package w2;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final f f33655d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f33656e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f33657f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f33658g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f33659h;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33660a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final f f33661c;

    /* renamed from: w2.a$a, reason: collision with other inner class name */
    public static final class C0628a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f33662a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public f f33663c;

        public C0628a() {
            c(a.e(Locale.getDefault()));
        }

        public static a b(boolean z10) {
            return z10 ? a.f33659h : a.f33658g;
        }

        public a a() {
            return (this.b == 2 && this.f33663c == a.f33655d) ? b(this.f33662a) : new a(this.f33662a, this.b, this.f33663c);
        }

        public final void c(boolean z10) {
            this.f33662a = z10;
            this.f33663c = a.f33655d;
            this.b = 2;
        }
    }

    public static class b {

        /* renamed from: f, reason: collision with root package name */
        public static final byte[] f33664f = new byte[1792];

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f33665a;
        public final boolean b;

        /* renamed from: c, reason: collision with root package name */
        public final int f33666c;

        /* renamed from: d, reason: collision with root package name */
        public int f33667d;

        /* renamed from: e, reason: collision with root package name */
        public char f33668e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f33664f[i10] = Character.getDirectionality(i10);
            }
        }

        public b(CharSequence charSequence, boolean z10) {
            this.f33665a = charSequence;
            this.b = z10;
            this.f33666c = charSequence.length();
        }

        public static byte c(char c10) {
            return c10 < 1792 ? f33664f[c10] : Character.getDirectionality(c10);
        }

        public byte a() {
            char charAt = this.f33665a.charAt(this.f33667d - 1);
            this.f33668e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f33665a, this.f33667d);
                this.f33667d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f33667d--;
            byte c10 = c(this.f33668e);
            if (!this.b) {
                return c10;
            }
            char c11 = this.f33668e;
            return c11 == '>' ? h() : c11 == ';' ? f() : c10;
        }

        public byte b() {
            char charAt = this.f33665a.charAt(this.f33667d);
            this.f33668e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f33665a, this.f33667d);
                this.f33667d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f33667d++;
            byte c10 = c(this.f33668e);
            if (!this.b) {
                return c10;
            }
            char c11 = this.f33668e;
            return c11 == '<' ? i() : c11 == '&' ? g() : c10;
        }

        public int d() {
            this.f33667d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f33667d < this.f33666c && i10 == 0) {
                byte b = b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f33667d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        public int e() {
            this.f33667d = this.f33666c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f33667d > 0) {
                    byte a10 = a();
                    if (a10 != 0) {
                        if (a10 == 1 || a10 == 2) {
                            if (i10 == 0) {
                                return 1;
                            }
                            if (i11 == 0) {
                                break;
                            }
                        } else if (a10 != 9) {
                            switch (a10) {
                                case 14:
                                case 15:
                                    if (i11 == i10) {
                                        return -1;
                                    }
                                    i10--;
                                    break;
                                case 16:
                                case 17:
                                    if (i11 == i10) {
                                        return 1;
                                    }
                                    i10--;
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }

        public final byte f() {
            char charAt;
            int i10 = this.f33667d;
            do {
                int i11 = this.f33667d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f33665a;
                int i12 = i11 - 1;
                this.f33667d = i12;
                charAt = charSequence.charAt(i12);
                this.f33668e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f33667d = i10;
            this.f33668e = ';';
            return (byte) 13;
        }

        public final byte g() {
            char charAt;
            do {
                int i10 = this.f33667d;
                if (i10 >= this.f33666c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f33665a;
                this.f33667d = i10 + 1;
                charAt = charSequence.charAt(i10);
                this.f33668e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        public final byte h() {
            char charAt;
            int i10 = this.f33667d;
            while (true) {
                int i11 = this.f33667d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f33665a;
                int i12 = i11 - 1;
                this.f33667d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f33668e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f33667d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f33665a;
                            int i14 = i13 - 1;
                            this.f33667d = i14;
                            charAt = charSequence2.charAt(i14);
                            this.f33668e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f33667d = i10;
            this.f33668e = '>';
            return (byte) 13;
        }

        public final byte i() {
            char charAt;
            int i10 = this.f33667d;
            while (true) {
                int i11 = this.f33667d;
                if (i11 >= this.f33666c) {
                    this.f33667d = i10;
                    this.f33668e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f33665a;
                this.f33667d = i11 + 1;
                char charAt2 = charSequence.charAt(i11);
                this.f33668e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i12 = this.f33667d;
                        if (i12 < this.f33666c) {
                            CharSequence charSequence2 = this.f33665a;
                            this.f33667d = i12 + 1;
                            charAt = charSequence2.charAt(i12);
                            this.f33668e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }
    }

    static {
        f fVar = g.f33680c;
        f33655d = fVar;
        f33656e = Character.toString((char) 8206);
        f33657f = Character.toString((char) 8207);
        f33658g = new a(false, 2, fVar);
        f33659h = new a(true, 2, fVar);
    }

    public a(boolean z10, int i10, f fVar) {
        this.f33660a = z10;
        this.b = i10;
        this.f33661c = fVar;
    }

    public static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0628a().a();
    }

    public static boolean e(Locale locale) {
        return h.a(locale) == 1;
    }

    public boolean d() {
        return (this.b & 2) != 0;
    }

    public final String f(CharSequence charSequence, f fVar) {
        boolean isRtl = fVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f33660a || !(isRtl || b(charSequence) == 1)) ? this.f33660a ? (!isRtl || b(charSequence) == -1) ? f33657f : "" : "" : f33656e;
    }

    public final String g(CharSequence charSequence, f fVar) {
        boolean isRtl = fVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f33660a || !(isRtl || a(charSequence) == 1)) ? this.f33660a ? (!isRtl || a(charSequence) == -1) ? f33657f : "" : "" : f33656e;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f33661c, true);
    }

    public CharSequence i(CharSequence charSequence, f fVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean isRtl = fVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, isRtl ? g.b : g.f33679a));
        }
        if (isRtl != this.f33660a) {
            spannableStringBuilder.append(isRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, isRtl ? g.b : g.f33679a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f33661c, true);
    }

    public String k(String str, f fVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, fVar, z10).toString();
    }
}
