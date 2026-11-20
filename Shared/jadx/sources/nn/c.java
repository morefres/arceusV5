package nn;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f27208a = Pattern.compile("[\\\\&]");
    public static final Pattern b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f27209c = Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f27210d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f27211e = Pattern.compile("[ \t\r\n]+");

    /* renamed from: f, reason: collision with root package name */
    public static final a f27212f = new a() { // from class: nn.a
        @Override // nn.c.a
        public final void a(String str, StringBuilder sb2) {
            c.a(str, sb2);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public static final a f27213g = new a() { // from class: nn.b
        @Override // nn.c.a
        public final void a(String str, StringBuilder sb2) {
            c.b(str, sb2);
        }
    };

    public interface a {
        void a(String str, StringBuilder sb2);
    }

    public static /* synthetic */ void a(String str, StringBuilder sb2) {
        if (str.charAt(0) == '\\') {
            sb2.append((CharSequence) str, 1, str.length());
        } else {
            sb2.append(d.a(str));
        }
    }

    public static /* synthetic */ void b(String str, StringBuilder sb2) {
        if (str.startsWith("%")) {
            if (str.length() == 3) {
                sb2.append(str);
                return;
            } else {
                sb2.append("%25");
                sb2.append((CharSequence) str, 1, str.length());
                return;
            }
        }
        for (byte b10 : str.getBytes(StandardCharsets.UTF_8)) {
            sb2.append('%');
            char[] cArr = f27210d;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
    }

    public static String c(String str) {
        String trim = str.trim();
        Locale locale = Locale.ROOT;
        return f27211e.matcher(trim.toLowerCase(locale).toUpperCase(locale)).replaceAll(" ");
    }

    public static String d(Pattern pattern, String str, a aVar) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        int i10 = 0;
        do {
            sb2.append((CharSequence) str, i10, matcher.start());
            aVar.a(matcher.group(), sb2);
            i10 = matcher.end();
        } while (matcher.find());
        if (i10 != str.length()) {
            sb2.append((CharSequence) str, i10, str.length());
        }
        return sb2.toString();
    }

    public static String e(String str) {
        return f27208a.matcher(str).find() ? d(b, str, f27212f) : str;
    }
}
