package eb;

/* loaded from: classes.dex */
public final class r4 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    public static final q f15890a;
    public static final q b;

    /* renamed from: c, reason: collision with root package name */
    public static final q f15891c;

    /* renamed from: d, reason: collision with root package name */
    public static final q f15892d;

    /* renamed from: e, reason: collision with root package name */
    public static final q f15893e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f15894f;

    /* renamed from: g, reason: collision with root package name */
    public static final q f15895g;

    /* renamed from: h, reason: collision with root package name */
    public static final q f15896h;

    /* renamed from: i, reason: collision with root package name */
    public static final q f15897i;

    /* renamed from: j, reason: collision with root package name */
    public static final q f15898j;

    /* renamed from: k, reason: collision with root package name */
    public static final q f15899k;

    /* renamed from: l, reason: collision with root package name */
    public static final q f15900l;

    /* renamed from: m, reason: collision with root package name */
    public static final q f15901m;

    /* renamed from: n, reason: collision with root package name */
    public static final q f15902n;

    /* renamed from: o, reason: collision with root package name */
    public static final q f15903o;

    /* renamed from: p, reason: collision with root package name */
    public static final q f15904p;

    /* renamed from: q, reason: collision with root package name */
    public static final q f15905q;

    /* renamed from: r, reason: collision with root package name */
    public static final q f15906r;

    /* renamed from: s, reason: collision with root package name */
    public static final q f15907s;

    static {
        y d10 = new y("com.google.android.gms.fido").e(h1.m("FIDO")).d();
        f15890a = d10.c("Passkeys__check_all_keys", false);
        b = d10.c("Passkeys__check_sync_status", true);
        f15891c = d10.c("Passkeys__client_data_hash_override_for_security_keys", false);
        f15892d = d10.c("Passkeys__direct_assetlinks", false);
        f15893e = d10.a("Passkeys__direct_assetlinks_cache_seconds", 604800L);
        f15894f = d10.b("Passkeys__direct_assetlinks_rpids", "*");
        f15895g = d10.c("Passkeys__dispatch_prf_via_credman", true);
        f15896h = d10.b("Passkeys__help_center_url", "https://support.google.com/accounts/answer/6208650");
        f15897i = d10.c("Passkeys__hide_consent_page_in_registration_enabled", false);
        f15898j = d10.c("Passkeys__ignore_stop_during_hybrid_request", false);
        f15899k = d10.c("Passkeys__json_for_parcelables", false);
        f15900l = d10.c("Passkeys__passkey_entries_use_gpm_icon", false);
        f15901m = d10.c("Passkeys__reencrypt_passkey", false);
        f15902n = d10.c("Passkeys__return_cryptauth_status", false);
        f15903o = d10.c("Passkeys__set_key_version", true);
        f15904p = d10.a("Passkeys__should_show_welcome_fragment", -1L);
        f15905q = d10.c("Passkeys__skip_consent_after_retrieval", false);
        f15906r = d10.c("Passkeys__skip_consent_screen", false);
        f15907s = d10.c("Passkeys__use_result_receiver", false);
    }

    @Override // eb.q4
    public final boolean zza() {
        return ((Boolean) f15899k.zza()).booleanValue();
    }
}
