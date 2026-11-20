package k9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class b extends Exception {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @Deprecated
    public final Status f22449a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r6) {
        /*
            r5 = this;
            int r0 = r6.x3()
            java.lang.String r1 = r6.y3()
            if (r1 == 0) goto Lf
            java.lang.String r1 = r6.y3()
            goto L11
        Lf:
            java.lang.String r1 = ""
        L11:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r2 = r2 + 2
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r0 = ": "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            r5.<init>(r0)
            r5.f22449a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.b.<init>(com.google.android.gms.common.api.Status):void");
    }

    @NonNull
    public Status a() {
        return this.f22449a;
    }

    public int b() {
        return this.f22449a.x3();
    }
}
