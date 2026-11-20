package ya;

import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Feature f36566a;
    public static final Feature b;

    /* renamed from: c, reason: collision with root package name */
    public static final Feature f36567c;

    /* renamed from: d, reason: collision with root package name */
    public static final Feature f36568d;

    /* renamed from: e, reason: collision with root package name */
    public static final Feature f36569e;

    /* renamed from: f, reason: collision with root package name */
    public static final Feature f36570f;

    /* renamed from: g, reason: collision with root package name */
    public static final Feature f36571g;

    /* renamed from: h, reason: collision with root package name */
    public static final Feature f36572h;

    /* renamed from: i, reason: collision with root package name */
    public static final Feature[] f36573i;

    static {
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", 9L);
        f36566a = feature;
        Feature feature2 = new Feature("auth_api_credentials_sign_out", 2L);
        b = feature2;
        Feature feature3 = new Feature("auth_api_credentials_authorize", 1L);
        f36567c = feature3;
        Feature feature4 = new Feature("auth_api_credentials_revoke_access", 1L);
        f36568d = feature4;
        Feature feature5 = new Feature("auth_api_credentials_save_password", 4L);
        f36569e = feature5;
        Feature feature6 = new Feature("auth_api_credentials_get_sign_in_intent", 6L);
        f36570f = feature6;
        Feature feature7 = new Feature("auth_api_credentials_save_account_linking_token", 3L);
        f36571g = feature7;
        Feature feature8 = new Feature("auth_api_credentials_get_phone_number_hint_intent", 3L);
        f36572h = feature8;
        f36573i = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8};
    }
}
