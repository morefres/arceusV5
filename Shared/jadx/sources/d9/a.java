package d9;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f14438a = 1;

    @NonNull
    public a a(Object obj) {
        this.f14438a = (this.f14438a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.f14438a;
    }

    @NonNull
    public final a c(boolean z10) {
        this.f14438a = (this.f14438a * 31) + (z10 ? 1 : 0);
        return this;
    }
}
