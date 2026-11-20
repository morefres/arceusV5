package eb;

/* loaded from: classes.dex */
public final class l4 implements k4 {

    /* renamed from: a, reason: collision with root package name */
    public static final q f15815a;
    public static final q b;

    /* renamed from: c, reason: collision with root package name */
    public static final q f15816c;

    /* renamed from: d, reason: collision with root package name */
    public static final q f15817d;

    /* renamed from: e, reason: collision with root package name */
    public static final q f15818e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f15819f;

    /* renamed from: g, reason: collision with root package name */
    public static final q f15820g;

    /* renamed from: h, reason: collision with root package name */
    public static final q f15821h;

    static {
        y d10 = new y("com.google.android.gms.fido").e(h1.m("FIDO")).d();
        f15815a = d10.c("Fido2Ctap2Support__disable_transport_comparator", true);
        b = d10.c("Fido2Ctap2Support__enable_cancelling_requests", true);
        f15816c = d10.c("Fido2Ctap2Support__enable_flow_separation_refactor", false);
        f15817d = d10.c("Fido2Ctap2Support__nfc_activity_destroyed_check", true);
        f15818e = d10.c("Fido2Ctap2Support__remove_this_device_for_assertions", false);
        f15819f = d10.c("Fido2Ctap2Support__skip_usb_permission_dialog", false);
        f15820g = d10.c("Fido2Ctap2Support__transport_controller_refactor", false);
        f15821h = d10.c("Fido2Ctap2Support__update_user_cancel_response", false);
    }

    @Override // eb.k4
    public final boolean zza() {
        return ((Boolean) f15816c.zza()).booleanValue();
    }
}
