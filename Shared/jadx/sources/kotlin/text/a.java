package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b+\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.¨\u0006/"}, d2 = {"Lkotlin/text/a;", "", "", "value", "", "code", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", ve.a.f33391e, "I", "getValue", "()I", j6.b.f21518e, "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "c", rl.d.f30696a, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", zl.t.f38095d, "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {
    public static final /* synthetic */ a[] H;
    public static final /* synthetic */ pt.a I;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int value;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String code;

    /* renamed from: d, reason: collision with root package name */
    public static final a f23007d = new a("UNASSIGNED", 0, 0, "Cn");

    /* renamed from: e, reason: collision with root package name */
    public static final a f23008e = new a("UPPERCASE_LETTER", 1, 1, "Lu");

    /* renamed from: f, reason: collision with root package name */
    public static final a f23009f = new a("LOWERCASE_LETTER", 2, 2, "Ll");

    /* renamed from: g, reason: collision with root package name */
    public static final a f23010g = new a("TITLECASE_LETTER", 3, 3, "Lt");

    /* renamed from: h, reason: collision with root package name */
    public static final a f23011h = new a("MODIFIER_LETTER", 4, 4, "Lm");

    /* renamed from: i, reason: collision with root package name */
    public static final a f23012i = new a("OTHER_LETTER", 5, 5, "Lo");

    /* renamed from: j, reason: collision with root package name */
    public static final a f23013j = new a("NON_SPACING_MARK", 6, 6, "Mn");

    /* renamed from: k, reason: collision with root package name */
    public static final a f23014k = new a("ENCLOSING_MARK", 7, 7, "Me");

    /* renamed from: l, reason: collision with root package name */
    public static final a f23015l = new a("COMBINING_SPACING_MARK", 8, 8, "Mc");

    /* renamed from: m, reason: collision with root package name */
    public static final a f23016m = new a("DECIMAL_DIGIT_NUMBER", 9, 9, "Nd");

    /* renamed from: n, reason: collision with root package name */
    public static final a f23017n = new a("LETTER_NUMBER", 10, 10, "Nl");

    /* renamed from: o, reason: collision with root package name */
    public static final a f23018o = new a("OTHER_NUMBER", 11, 11, "No");

    /* renamed from: p, reason: collision with root package name */
    public static final a f23019p = new a("SPACE_SEPARATOR", 12, 12, "Zs");

    /* renamed from: q, reason: collision with root package name */
    public static final a f23020q = new a("LINE_SEPARATOR", 13, 13, "Zl");

    /* renamed from: r, reason: collision with root package name */
    public static final a f23021r = new a("PARAGRAPH_SEPARATOR", 14, 14, "Zp");

    /* renamed from: s, reason: collision with root package name */
    public static final a f23022s = new a("CONTROL", 15, 15, "Cc");

    /* renamed from: t, reason: collision with root package name */
    public static final a f23023t = new a("FORMAT", 16, 16, "Cf");

    /* renamed from: u, reason: collision with root package name */
    public static final a f23024u = new a("PRIVATE_USE", 17, 18, "Co");

    /* renamed from: v, reason: collision with root package name */
    public static final a f23025v = new a("SURROGATE", 18, 19, "Cs");

    /* renamed from: w, reason: collision with root package name */
    public static final a f23026w = new a("DASH_PUNCTUATION", 19, 20, "Pd");

    /* renamed from: x, reason: collision with root package name */
    public static final a f23027x = new a("START_PUNCTUATION", 20, 21, "Ps");

    /* renamed from: y, reason: collision with root package name */
    public static final a f23028y = new a("END_PUNCTUATION", 21, 22, "Pe");

    /* renamed from: z, reason: collision with root package name */
    public static final a f23029z = new a("CONNECTOR_PUNCTUATION", 22, 23, "Pc");
    public static final a A = new a("OTHER_PUNCTUATION", 23, 24, "Po");
    public static final a B = new a("MATH_SYMBOL", 24, 25, "Sm");
    public static final a C = new a("CURRENCY_SYMBOL", 25, 26, "Sc");
    public static final a D = new a("MODIFIER_SYMBOL", 26, 27, "Sk");
    public static final a E = new a("OTHER_SYMBOL", 27, 28, "So");
    public static final a F = new a("INITIAL_QUOTE_PUNCTUATION", 28, 29, "Pi");
    public static final a G = new a("FINAL_QUOTE_PUNCTUATION", 29, 30, "Pf");

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/text/a$a;", "", "<init>", "()V", "", "category", "Lkotlin/text/a;", ve.a.f33391e, "(I)Lkotlin/text/a;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kotlin.text.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final a a(int category) {
            if (category >= 0 && category < 17) {
                return (a) a.b().get(category);
            }
            if (18 <= category && category < 31) {
                return (a) a.b().get(category - 1);
            }
            throw new IllegalArgumentException("Category #" + category + " is not defined.");
        }

        public Companion() {
        }
    }

    static {
        a[] a10 = a();
        H = a10;
        I = pt.b.a(a10);
        INSTANCE = new Companion(null);
    }

    public a(String str, int i10, int i11, String str2) {
        this.value = i11;
        this.code = str2;
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f23007d, f23008e, f23009f, f23010g, f23011h, f23012i, f23013j, f23014k, f23015l, f23016m, f23017n, f23018o, f23019p, f23020q, f23021r, f23022s, f23023t, f23024u, f23025v, f23026w, f23027x, f23028y, f23029z, A, B, C, D, E, F, G};
    }

    @NotNull
    public static pt.a<a> b() {
        return I;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) H.clone();
    }
}
