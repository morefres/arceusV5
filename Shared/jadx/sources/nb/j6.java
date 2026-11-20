package nb;

import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26324a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public String f26325c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k6 f26326d;

    public j6(k6 k6Var, String str, String str2) {
        Objects.requireNonNull(k6Var);
        this.f26326d = k6Var;
        n9.m.f(str);
        this.f26324a = str;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            k6 k6Var = this.f26326d;
            this.f26325c = k6Var.p().getString(this.f26324a, null);
        }
        return this.f26325c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f26326d.p().edit();
        edit.putString(this.f26324a, str);
        edit.apply();
        this.f26325c = str;
    }
}
