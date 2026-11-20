package q7;

import r7.c;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29585a = c.a.a("fFamily", "fName", "fStyle", "ascent");

    public static l7.c a(r7.c cVar) {
        cVar.c();
        String str = null;
        String str2 = null;
        float f10 = 0.0f;
        String str3 = null;
        while (cVar.f()) {
            int r8 = cVar.r(f29585a);
            if (r8 == 0) {
                str = cVar.m();
            } else if (r8 == 1) {
                str3 = cVar.m();
            } else if (r8 == 2) {
                str2 = cVar.m();
            } else if (r8 != 3) {
                cVar.s();
                cVar.u();
            } else {
                f10 = (float) cVar.h();
            }
        }
        cVar.e();
        return new l7.c(str, str3, str2, f10);
    }
}
