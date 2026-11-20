package nb;

import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26209a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26210c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k6 f26212e;

    public f6(k6 k6Var, String str, boolean z10) {
        Objects.requireNonNull(k6Var);
        this.f26212e = k6Var;
        n9.m.f(str);
        this.f26209a = str;
        this.b = z10;
    }

    public final boolean a() {
        if (!this.f26210c) {
            this.f26210c = true;
            k6 k6Var = this.f26212e;
            this.f26211d = k6Var.p().getBoolean(this.f26209a, this.b);
        }
        return this.f26211d;
    }

    public final void b(boolean z10) {
        SharedPreferences.Editor edit = this.f26212e.p().edit();
        edit.putBoolean(this.f26209a, z10);
        edit.apply();
        this.f26211d = z10;
    }
}
