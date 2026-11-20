package al;

import ek.q;
import iv.x;
import java.io.IOException;

/* loaded from: classes2.dex */
public class b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f590a;
    public final T b;

    /* renamed from: c, reason: collision with root package name */
    public final a f591c;

    public b() {
        this.f590a = 0;
        this.b = null;
        this.f591c = null;
    }

    public int a() {
        a aVar = this.f591c;
        if (aVar != null) {
            return aVar.f586a;
        }
        return -1;
    }

    public boolean b() {
        int i10 = this.f590a;
        return i10 >= 200 && i10 < 300;
    }

    public b(x<T> xVar) {
        String str;
        this.f590a = xVar.b();
        if (xVar.g()) {
            this.b = xVar.a();
            this.f591c = null;
            return;
        }
        if (xVar.e() != null) {
            try {
                str = xVar.e().string();
                try {
                    q.b("ApiResponse", "Error message: " + str);
                } catch (IOException unused) {
                    q.e("ApiResponse", "error while parsing response");
                    this.f591c = new a((str != null || str.trim().length() == 0) ? xVar.h() : str);
                    this.b = null;
                }
            } catch (IOException unused2) {
                str = null;
            }
        } else {
            str = null;
        }
        this.f591c = new a((str != null || str.trim().length() == 0) ? xVar.h() : str);
        this.b = null;
    }
}
