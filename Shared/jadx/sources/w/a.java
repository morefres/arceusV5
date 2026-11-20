package w;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f33556a;
    public final Integer b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f33557c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f33558d;

    /* renamed from: w.a$a, reason: collision with other inner class name */
    public static final class C0622a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f33559a;
        public Integer b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f33560c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f33561d;

        public a a() {
            return new a(this.f33559a, this.b, this.f33560c, this.f33561d);
        }
    }

    public a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f33556a = num;
        this.b = num2;
        this.f33557c = num3;
        this.f33558d = num4;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f33556a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f33557c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f33558d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
