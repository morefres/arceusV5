package la;

import android.content.Intent;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23404a;
    public final Intent b;

    public a(boolean z10, Intent intent) {
        this.f23404a = z10;
        this.b = intent;
    }

    public static a a(Intent intent) {
        return new a(true, intent);
    }

    public static a b(Intent intent) {
        return new a(false, intent);
    }

    public final boolean c() {
        return this.f23404a;
    }

    public final Intent d() {
        return this.b;
    }
}
