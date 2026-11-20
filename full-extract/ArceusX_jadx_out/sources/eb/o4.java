package eb;

/* loaded from: classes.dex */
public final class o4 implements n4 {

    /* renamed from: a, reason: collision with root package name */
    public static final q f15837a;
    public static final q b;

    /* renamed from: c, reason: collision with root package name */
    public static final q f15838c;

    /* renamed from: d, reason: collision with root package name */
    public static final q f15839d;

    /* renamed from: e, reason: collision with root package name */
    public static final q f15840e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f15841f;

    /* renamed from: g, reason: collision with root package name */
    public static final q f15842g;

    static {
        y d10 = new y("com.google.android.gms.fido").e(h1.m("FIDO")).d();
        f15837a = d10.c("Hybrid__client_enabled", false);
        b = d10.c("Hybrid__disavow_location_permissions", true);
        f15838c = d10.a("Hybrid__number_of_seconds_to_wait_for_bt_scanning_radio_to_be_ready", 3L);
        f15839d = d10.a("Hybrid__number_of_seconds_to_wait_for_bt_scanning_turning_on", 3L);
        f15840e = d10.c("Hybrid__prf_eval_during_create", true);
        f15841f = d10.c("Hybrid__use_hybrid_for_server_link", false);
        f15842g = d10.c("Hybrid__websocket_close_socket", true);
    }

    @Override // eb.n4
    public final boolean zza() {
        return ((Boolean) f15837a.zza()).booleanValue();
    }
}
