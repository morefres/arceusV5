package w;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import w.a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f33589a;
    public final Bundle b;

    public static class a {
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    public static class b {
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public static class c {
        public static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setShareIdentityEnabled(z10);
        }
    }

    /* renamed from: w.d$d, reason: collision with other inner class name */
    public static class C0625d {
        public static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setAllowPassThroughOnTouchOutside(z10);
        }
    }

    public d(Intent intent, Bundle bundle) {
        this.f33589a = intent;
        this.b = bundle;
    }

    public static boolean a(Intent intent) {
        return !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false);
    }

    public void b(Context context, Uri uri) {
        this.f33589a.setData(uri);
        l2.b.p(context, this.f33589a, this.b);
    }

    public static final class e {

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<Bundle> f33591c;

        /* renamed from: d, reason: collision with root package name */
        public ActivityOptions f33592d;

        /* renamed from: e, reason: collision with root package name */
        public ArrayList<Bundle> f33593e;

        /* renamed from: f, reason: collision with root package name */
        public SparseArray<Bundle> f33594f;

        /* renamed from: g, reason: collision with root package name */
        public Bundle f33595g;

        /* renamed from: j, reason: collision with root package name */
        public boolean f33598j;

        /* renamed from: k, reason: collision with root package name */
        public ArrayList<Bundle> f33599k;

        /* renamed from: a, reason: collision with root package name */
        public final Intent f33590a = new Intent("android.intent.action.VIEW");
        public final a.C0622a b = new a.C0622a();

        /* renamed from: h, reason: collision with root package name */
        public int f33596h = 0;

        /* renamed from: i, reason: collision with root package name */
        public boolean f33597i = true;

        public e() {
        }

        public d a() {
            if (!this.f33590a.hasExtra("android.support.customtabs.extra.SESSION")) {
                h(null, null);
            }
            ArrayList<Bundle> arrayList = this.f33591c;
            if (arrayList != null) {
                this.f33590a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f33593e;
            if (arrayList2 != null) {
                this.f33590a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f33590a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f33597i);
            this.f33590a.putExtras(this.b.a().a());
            Bundle bundle = this.f33595g;
            if (bundle != null) {
                this.f33590a.putExtras(bundle);
            }
            if (this.f33594f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f33594f);
                this.f33590a.putExtras(bundle2);
            }
            this.f33590a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f33596h);
            ArrayList<Bundle> arrayList3 = this.f33599k;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f33590a.putParcelableArrayListExtra("androidx.browser.customtabs.extra.CUSTOM_CONTENT_ACTIONS", this.f33599k);
            }
            int i10 = Build.VERSION.SDK_INT;
            d();
            if (i10 >= 34) {
                i();
            }
            if (i10 >= 36) {
                b();
            }
            ActivityOptions activityOptions = this.f33592d;
            return new d(this.f33590a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public final void b() {
            if (this.f33592d == null) {
                this.f33592d = a.a();
            }
            C0625d.a(this.f33592d, d.a(this.f33590a));
        }

        public e c(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.f33590a.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i10);
            return this;
        }

        public final void d() {
            String a10 = b.a();
            if (TextUtils.isEmpty(a10)) {
                return;
            }
            Bundle bundleExtra = this.f33590a.hasExtra("com.android.browser.headers") ? this.f33590a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", a10);
            this.f33590a.putExtra("com.android.browser.headers", bundleExtra);
        }

        public e e(int i10) {
            return f(i10, 0);
        }

        public e f(int i10, int i11) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i11 < 0 || i11 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.f33590a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i10);
            this.f33590a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i11);
            return this;
        }

        public e g(f fVar) {
            this.f33590a.setPackage(fVar.e().getPackageName());
            h(fVar.d(), fVar.f());
            return this;
        }

        public final void h(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f33590a.putExtras(bundle);
        }

        public final void i() {
            if (this.f33592d == null) {
                this.f33592d = a.a();
            }
            c.a(this.f33592d, this.f33598j);
        }

        public e(f fVar) {
            if (fVar != null) {
                g(fVar);
            }
        }
    }
}
