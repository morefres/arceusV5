package nb;

import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26276a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26277c;

    /* renamed from: d, reason: collision with root package name */
    public long f26278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k6 f26279e;

    public h6(k6 k6Var, String str, long j10) {
        Objects.requireNonNull(k6Var);
        this.f26279e = k6Var;
        n9.m.f(str);
        this.f26276a = str;
        this.b = j10;
    }

    public final long a() {
        if (!this.f26277c) {
            this.f26277c = true;
            k6 k6Var = this.f26279e;
            this.f26278d = k6Var.p().getLong(this.f26276a, this.b);
        }
        return this.f26278d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor edit = this.f26279e.p().edit();
        edit.putLong(this.f26276a, j10);
        edit.apply();
        this.f26278d = j10;
    }
}
