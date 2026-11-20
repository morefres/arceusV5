package za;

import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Feature f37964a;
    public static final Feature b;

    /* renamed from: c, reason: collision with root package name */
    public static final Feature f37965c;

    /* renamed from: d, reason: collision with root package name */
    public static final Feature f37966d;

    /* renamed from: e, reason: collision with root package name */
    public static final Feature[] f37967e;

    static {
        Feature feature = new Feature("sms_code_autofill", 2L);
        f37964a = feature;
        Feature feature2 = new Feature("sms_code_browser", 2L);
        b = feature2;
        Feature feature3 = new Feature("sms_retrieve", 1L);
        f37965c = feature3;
        Feature feature4 = new Feature("user_consent", 3L);
        f37966d = feature4;
        f37967e = new Feature[]{feature, feature2, feature3, feature4};
    }
}
