package w;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import c.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final c.b f33562a;
    public final ComponentName b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f33563c;

    public class a extends a.AbstractBinderC0092a {

        /* renamed from: a, reason: collision with root package name */
        public Handler f33564a = new Handler(Looper.getMainLooper());
        public final /* synthetic */ w.b b;

        /* renamed from: w.c$a$a, reason: collision with other inner class name */
        public class RunnableC0623a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f33566a;

            public RunnableC0623a(Bundle bundle) {
                this.f33566a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onUnminimized(this.f33566a);
            }
        }

        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f33567a;
            public final /* synthetic */ Bundle b;

            public b(int i10, Bundle bundle) {
                this.f33567a = i10;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onNavigationEvent(this.f33567a, this.b);
            }
        }

        /* renamed from: w.c$a$c, reason: collision with other inner class name */
        public class RunnableC0624c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33569a;
            public final /* synthetic */ Bundle b;

            public RunnableC0624c(String str, Bundle bundle) {
                this.f33569a = str;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.extraCallback(this.f33569a, this.b);
            }
        }

        public class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f33571a;

            public d(Bundle bundle) {
                this.f33571a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onMessageChannelReady(this.f33571a);
            }
        }

        public class e implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33572a;
            public final /* synthetic */ Bundle b;

            public e(String str, Bundle bundle) {
                this.f33572a = str;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onPostMessage(this.f33572a, this.b);
            }
        }

        public class f implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f33574a;
            public final /* synthetic */ Uri b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f33575c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Bundle f33576d;

            public f(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f33574a = i10;
                this.b = uri;
                this.f33575c = z10;
                this.f33576d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onRelationshipValidationResult(this.f33574a, this.b, this.f33575c, this.f33576d);
            }
        }

        public class g implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f33578a;
            public final /* synthetic */ int b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f33579c;

            public g(int i10, int i11, Bundle bundle) {
                this.f33578a = i10;
                this.b = i11;
                this.f33579c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onActivityResized(this.f33578a, this.b, this.f33579c);
            }
        }

        public class h implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f33581a;

            public h(Bundle bundle) {
                this.f33581a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onWarmupCompleted(this.f33581a);
            }
        }

        public class i implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f33582a;
            public final /* synthetic */ int b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f33583c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f33584d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f33585e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Bundle f33586f;

            public i(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
                this.f33582a = i10;
                this.b = i11;
                this.f33583c = i12;
                this.f33584d = i13;
                this.f33585e = i14;
                this.f33586f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onActivityLayout(this.f33582a, this.b, this.f33583c, this.f33584d, this.f33585e, this.f33586f);
            }
        }

        public class j implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f33588a;

            public j(Bundle bundle) {
                this.f33588a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onMinimized(this.f33588a);
            }
        }

        public a(w.b bVar) {
            this.b = bVar;
        }

        @Override // c.a
        public void L1(int i10, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33564a.post(new b(i10, bundle));
        }

        @Override // c.a
        public Bundle M(String str, Bundle bundle) {
            w.b bVar = this.b;
            if (bVar == null) {
                return null;
            }
            return bVar.extraCallbackWithResult(str, bundle);
        }

        @Override // c.a
        public void c2(String str, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33564a.post(new e(str, bundle));
        }

        @Override // c.a
        public void g2(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33564a.post(new d(bundle));
        }

        @Override // c.a
        public void j2(int i10, Uri uri, boolean z10, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33564a.post(new f(i10, uri, z10, bundle));
        }

        @Override // c.a
        public void l1(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33564a.post(new j(bundle));
        }

        @Override // c.a
        public void m0(String str, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33564a.post(new RunnableC0624c(str, bundle));
        }

        @Override // c.a
        public void p0(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33564a.post(new h(bundle));
        }

        @Override // c.a
        public void q1(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33564a.post(new RunnableC0623a(bundle));
        }

        @Override // c.a
        public void w1(int i10, int i11, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33564a.post(new g(i10, i11, bundle));
        }

        @Override // c.a
        public void z(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.f33564a.post(new i(i10, i11, i12, i13, i14, bundle));
        }
    }

    public c(c.b bVar, ComponentName componentName, Context context) {
        this.f33562a = bVar;
        this.b = componentName;
        this.f33563c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Service Intents must be explicit");
        }
        intent.setPackage(str);
        return context.bindService(intent, eVar, 33);
    }

    public static String c(Context context, List<String> list) {
        return d(context, list, false);
    }

    public static String d(Context context, List<String> list, boolean z10) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z10 && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public static boolean e(Context context, String str) {
        return h(context, str, "androidx.browser.auth.category.AuthTab");
    }

    public static boolean h(Context context, String str, String str2) {
        IntentFilter intentFilter;
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 64)) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && str.equals(serviceInfo.packageName) && (intentFilter = resolveInfo.filter) != null && intentFilter.hasCategory(str2)) {
                return true;
            }
        }
        return false;
    }

    public final a.AbstractBinderC0092a b(b bVar) {
        return new a(bVar);
    }

    public f f(b bVar) {
        return g(bVar, null);
    }

    public final f g(b bVar, PendingIntent pendingIntent) {
        boolean J;
        a.AbstractBinderC0092a b = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                J = this.f33562a.m(b, bundle);
            } else {
                J = this.f33562a.J(b);
            }
            if (J) {
                return new f(this.f33562a, b, this.b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean i(long j10) {
        try {
            return this.f33562a.h1(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
