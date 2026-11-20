package ln;

import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class n extends rn.a {

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern[][] f23606e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* renamed from: a, reason: collision with root package name */
    public final on.k f23607a;
    public final Pattern b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23608c;

    /* renamed from: d, reason: collision with root package name */
    public ln.a f23609d;

    public static class a extends rn.b {
        @Override // rn.e
        public rn.f a(rn.h hVar, rn.g gVar) {
            int e10 = hVar.e();
            CharSequence a10 = hVar.b().a();
            if (hVar.d() < 4 && a10.charAt(e10) == '<') {
                for (int i10 = 1; i10 <= 7; i10++) {
                    if (i10 != 7 || (!(gVar.a().g() instanceof on.w) && !hVar.f().e())) {
                        Pattern pattern = n.f23606e[i10][0];
                        Pattern pattern2 = n.f23606e[i10][1];
                        if (pattern.matcher(a10.subSequence(e10, a10.length())).find()) {
                            return rn.f.d(new n(pattern2)).b(hVar.getIndex());
                        }
                    }
                }
            }
            return rn.f.c();
        }
    }

    @Override // rn.a, rn.d
    public void a(pn.i iVar) {
        this.f23609d.a(iVar.a());
        Pattern pattern = this.b;
        if (pattern == null || !pattern.matcher(iVar.a()).find()) {
            return;
        }
        this.f23608c = true;
    }

    @Override // rn.d
    public on.a g() {
        return this.f23607a;
    }

    @Override // rn.a, rn.d
    public void h() {
        this.f23607a.p(this.f23609d.b());
        this.f23609d = null;
    }

    @Override // rn.d
    public rn.c j(rn.h hVar) {
        return this.f23608c ? rn.c.d() : (hVar.a() && this.b == null) ? rn.c.d() : rn.c.b(hVar.getIndex());
    }

    public n(Pattern pattern) {
        this.f23607a = new on.k();
        this.f23608c = false;
        this.f23609d = new ln.a();
        this.b = pattern;
    }
}
