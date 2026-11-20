package v;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f33146a;
    public final Integer b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f33147c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f33148a;
        public Integer b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f33149c;

        public a a() {
            return new a(this.f33148a, this.b, this.f33149c);
        }
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f33146a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.b;
        if (num2 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f33147c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num3.intValue());
        }
        return bundle;
    }

    public a(Integer num, Integer num2, Integer num3) {
        this.f33146a = num;
        this.b = num2;
        this.f33147c = num3;
    }
}
