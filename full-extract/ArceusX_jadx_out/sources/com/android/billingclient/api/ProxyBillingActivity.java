package com.android.billingclient.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.android.billingclient.api.d;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.e8;
import com.google.android.gms.internal.play_billing.h8;
import com.google.android.gms.internal.play_billing.m0;
import com.google.android.gms.internal.play_billing.s7;
import com.google.android.gms.internal.play_billing.z7;
import v7.h1;
import v7.i1;
import v7.m1;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public ResultReceiver f5089a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5090c;

    /* renamed from: d, reason: collision with root package name */
    public int f5091d;

    /* renamed from: e, reason: collision with root package name */
    public long f5092e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5093f;

    /* renamed from: g, reason: collision with root package name */
    public j f5094g;

    /* renamed from: h, reason: collision with root package name */
    public i1 f5095h;

    public final s7 a(int i10, Intent intent) {
        return intent == null ? i10 != -1 ? i10 != 0 ? i10 != 3 ? i10 != 4 ? s7.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : s7.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE : s7.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE : s7.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : s7.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : intent.getExtras() == null ? s7.NULL_BUNDLE_IN_ACTIVITY_RESULT : i10 == 5 ? s7.PLAY_STORE_ON_CREATE_RUNTIME_EXCEPTION : s7.REASON_UNSPECIFIED;
    }

    public final boolean b(Bundle bundle) {
        if (bundle != null) {
            return bundle.containsKey("in_app_message_result_receiver");
        }
        if (getIntent() == null) {
            return false;
        }
        return getIntent().hasExtra("IN_APP_MESSAGE_INTENT");
    }

    public final boolean c(int i10, Intent intent) {
        return !a(i10, intent).equals(s7.REASON_UNSPECIFIED);
    }

    public final boolean d() {
        return this.f5094g != null;
    }

    public final Intent e(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    public final Intent f(s7 s7Var, long j10, boolean z10) {
        Intent g10 = g();
        if (z10) {
            if (d() && this.f5094g.a() != null) {
                d a10 = this.f5094g.a();
                g10.putExtra("RESPONSE_CODE", a10.c());
                g10.putExtra("DEBUG_MESSAGE", a10.a());
            } else if (d() && !this.f5094g.c()) {
                g10.putExtra("RESPONSE_CODE", 3);
                g10.putExtra("DEBUG_MESSAGE", "Play Store is blocked.");
                d.a d10 = d.d();
                d10.d(3);
                d10.b("Play Store is blocked.");
                d a11 = d10.a();
                s7 s7Var2 = s7.PLAY_STORE_APP_BLOCKED;
                int i10 = h1.f33265a;
                g10.putExtra("FAILURE_LOGGING_PAYLOAD", h1.b(s7Var2, 2, a11, null, z7.BROADCAST_ACTION_UNSPECIFIED).b());
            }
            g10.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            g10.putExtra("billingClientTransactionId", j10);
            g10.putExtra("wasServiceAutoReconnected", this.f5093f);
            return g10;
        }
        g10.putExtra("RESPONSE_CODE", 6);
        g10.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        d.a d11 = d.d();
        d11.d(6);
        d11.b("An internal error occurred.");
        d a12 = d11.a();
        int i11 = h1.f33265a;
        g10.putExtra("FAILURE_LOGGING_PAYLOAD", h1.b(s7Var, 2, a12, null, z7.BROADCAST_ACTION_UNSPECIFIED).b());
        g10.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        g10.putExtra("billingClientTransactionId", j10);
        g10.putExtra("wasServiceAutoReconnected", this.f5093f);
        return g10;
    }

    public final Intent g() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:6:0x001d, B:23:0x0067, B:13:0x0031, B:15:0x0037, B:16:0x005e, B:19:0x004b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:6:0x001d, B:23:0x0067, B:13:0x0031, B:15:0x0037, B:16:0x005e, B:19:0x004b), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void h() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.android.billingclient.api.j r0 = new com.android.billingclient.api.j     // Catch: java.lang.Throwable -> L28 java.lang.NoSuchMethodError -> L2b java.lang.RuntimeException -> L2e
            v7.i1 r1 = r8.f5095h     // Catch: java.lang.Throwable -> L28 java.lang.NoSuchMethodError -> L2b java.lang.RuntimeException -> L2e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L28 java.lang.NoSuchMethodError -> L2b java.lang.RuntimeException -> L2e
            r8.f5094g = r0     // Catch: java.lang.Throwable -> L28 java.lang.NoSuchMethodError -> L2b java.lang.RuntimeException -> L2e
            android.content.IntentFilter r4 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L28 java.lang.NoSuchMethodError -> L2b java.lang.RuntimeException -> L2e
            java.lang.String r0 = "com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L28 java.lang.NoSuchMethodError -> L2b java.lang.RuntimeException -> L2e
            java.lang.String r0 = "com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION"
            r4.addAction(r0)     // Catch: java.lang.Throwable -> L28 java.lang.NoSuchMethodError -> L2b java.lang.RuntimeException -> L2e
            com.android.billingclient.api.j r3 = r8.f5094g     // Catch: java.lang.Throwable -> L28 java.lang.NoSuchMethodError -> L2b java.lang.RuntimeException -> L2e
            java.lang.String r5 = "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST"
            r6 = 0
            r7 = 2
            r2 = r8
            l2.b.n(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L22 java.lang.NoSuchMethodError -> L24 java.lang.RuntimeException -> L26
            monitor-exit(r8)
            return
        L22:
            r0 = move-exception
            goto L67
        L24:
            r0 = move-exception
            goto L30
        L26:
            r0 = move-exception
            goto L30
        L28:
            r0 = move-exception
            r2 = r8
            goto L67
        L2b:
            r0 = move-exception
        L2c:
            r2 = r8
            goto L30
        L2e:
            r0 = move-exception
            goto L2c
        L30:
            r1 = 0
            r2.f5094g = r1     // Catch: java.lang.Throwable -> L22
            boolean r1 = r0 instanceof java.lang.NoSuchMethodError     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L4b
            v7.i1 r1 = r2.f5095h     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.play_billing.b9 r3 = com.google.android.gms.internal.play_billing.e9.B()     // Catch: java.lang.Throwable -> L22
            r4 = 2
            r3.o(r4)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.play_billing.t4 r3 = r3.i()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.play_billing.e9 r3 = (com.google.android.gms.internal.play_billing.e9) r3     // Catch: java.lang.Throwable -> L22
            r1.d(r3)     // Catch: java.lang.Throwable -> L22
            goto L5e
        L4b:
            v7.i1 r1 = r2.f5095h     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.play_billing.b9 r3 = com.google.android.gms.internal.play_billing.e9.B()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r3.o(r4)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.play_billing.t4 r3 = r3.i()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.play_billing.e9 r3 = (com.google.android.gms.internal.play_billing.e9) r3     // Catch: java.lang.Throwable -> L22
            r1.d(r3)     // Catch: java.lang.Throwable -> L22
        L5e:
            java.lang.String r1 = "ProxyBillingActivity"
            java.lang.String r3 = "Failed to register receiver."
            com.google.android.gms.internal.play_billing.m0.n(r1, r3, r0)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r8)
            return
        L67:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L22
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.h():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0013, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0049, code lost:
    
        if (r11 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r11 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r9, int r10, android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int i10;
        PendingIntent pendingIntent;
        Bundle bundle2;
        Bundle bundle3;
        super.onCreate(bundle);
        if (!b(bundle)) {
            try {
                i10 = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e10) {
                m0.n("ProxyBillingActivity", "Failed to get package info for current package.", e10);
                i10 = -1;
            }
            if (this.f5095h == null) {
                Context applicationContext = getApplicationContext();
                e8 L = h8.L();
                L.v(getPackageName());
                L.E(u7.a.f32646a);
                L.p(i10);
                L.o(Build.VERSION.SDK_INT);
                L.t(912213584L);
                this.f5095h = new m1(applicationContext, (h8) L.i());
            }
            h();
        }
        if (bundle != null) {
            m0.l("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f5089a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f5090c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f5091d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f5092e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f5093f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        m0.l("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f5091d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f5090c = true;
                this.f5091d = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f5089a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f5091d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f5092e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f5093f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.b = true;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 36) {
                bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(3).toBundle();
            } else {
                if (i11 < 34) {
                    bundle2 = null;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), this.f5091d, new Intent(), 0, 0, 0, bundle2);
                }
                bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
            }
            bundle2 = bundle3;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f5091d, new Intent(), 0, 0, 0, bundle2);
        } catch (IntentSender.SendIntentException e11) {
            m0.n("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e11);
            ResultReceiver resultReceiver = this.f5089a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent f10 = f(s7.INTENT_SENDER_EXCEPTION, this.f5092e, false);
                if (this.f5090c) {
                    f10.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(f10);
            }
            this.b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        d dVar;
        super.onDestroy();
        if (d()) {
            dVar = this.f5094g.a();
            try {
                unregisterReceiver(this.f5094g);
            } catch (RuntimeException e10) {
                m0.n("ProxyBillingActivity", "Failed to unregister receiver.", e10);
            }
        } else {
            dVar = null;
        }
        if (isFinishing() && this.b) {
            Intent g10 = g();
            if (dVar != null) {
                g10.putExtra("RESPONSE_CODE", dVar.c());
                g10.putExtra("DEBUG_MESSAGE", dVar.a());
            } else {
                g10.putExtra("RESPONSE_CODE", 1);
                g10.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            }
            if (this.f5090c) {
                g10.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i10 = this.f5091d;
            if (i10 == 110 || i10 == 100) {
                g10.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                g10.putExtra("billingClientTransactionId", this.f5092e);
            }
            sendBroadcast(g10);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f5089a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f5090c);
        bundle.putInt("activity_code", this.f5091d);
        bundle.putLong("billingClientTransactionId", this.f5092e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f5093f);
    }
}
