package m9;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.data.DataHolder;
import n9.m;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final DataHolder f24402a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f24403c;

    public d(@NonNull DataHolder dataHolder, int i10) {
        this.f24402a = (DataHolder) m.l(dataHolder);
        o(i10);
    }

    public boolean a(@NonNull String str) {
        return this.f24402a.a(str, this.b, this.f24403c);
    }

    public float f(@NonNull String str) {
        return this.f24402a.D3(str, this.b, this.f24403c);
    }

    public int g(@NonNull String str) {
        return this.f24402a.v3(str, this.b, this.f24403c);
    }

    public long i(@NonNull String str) {
        return this.f24402a.w3(str, this.b, this.f24403c);
    }

    @NonNull
    public String j(@NonNull String str) {
        return this.f24402a.z3(str, this.b, this.f24403c);
    }

    public boolean k(@NonNull String str) {
        return this.f24402a.B3(str);
    }

    public boolean m(@NonNull String str) {
        return this.f24402a.C3(str, this.b, this.f24403c);
    }

    public Uri n(@NonNull String str) {
        String z32 = this.f24402a.z3(str, this.b, this.f24403c);
        if (z32 == null) {
            return null;
        }
        return Uri.parse(z32);
    }

    public final void o(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f24402a.getCount()) {
            z10 = true;
        }
        m.p(z10);
        this.b = i10;
        this.f24403c = this.f24402a.A3(i10);
    }
}
