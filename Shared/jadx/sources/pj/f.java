package pj;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.roblox.engine.jni.NativeGLInterface;
import e.m0;
import e4.f0;
import e4.q;
import im.f;
import rh.h;

/* loaded from: classes2.dex */
public class f {

    public class a extends m0 {
        public final /* synthetic */ q X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, q qVar) {
            super(z10);
            this.X = qVar;
        }

        @Override // e.m0
        public void handleOnBackPressed() {
            ek.q.b("QrCodeScanner", "handleOnBackPressed (Dispatcher): Return 'Cancel' using an empty Url.");
            this.X.l1().a1();
            f.e("");
        }
    }

    public static /* synthetic */ void a(FragmentManager fragmentManager, String str, Bundle bundle) {
        boolean z10 = bundle.getBoolean("BundleKey_success");
        String string = bundle.getString("BundleKey_urlString");
        ek.q.b("QrCodeScanner", "... (callback): success = " + z10 + ", urlString = " + string);
        fragmentManager.a1();
        if (h.a().d1()) {
            im.f.F().h(string, "android_qr_scanner", false);
        } else {
            im.f.F().f(string, "android_qr_scanner", false);
        }
        e(string);
    }

    public static /* synthetic */ void b(String str, boolean z10) {
        if (z10) {
            im.f.F().k(str);
        } else {
            NativeGLInterface.nativeBroadcastEventWithNamespace("QrCodeScanResult", str, "InvalidQr");
        }
    }

    public static boolean d(@NonNull q qVar) {
        FragmentManager l12 = qVar.l1();
        if (!(l12.n0("CustomCaptureFragment") instanceof c)) {
            return false;
        }
        ek.q.b("QrCodeScanner", "handleOnBackPressed: Return 'Cancel' using an empty Url.");
        l12.a1();
        e("");
        return true;
    }

    public static void e(final String str) {
        ek.q.b("QrCodeScanner", "handleUrlString: " + str);
        if (TextUtils.isEmpty(str)) {
            NativeGLInterface.nativeBroadcastEventWithNamespace("QrCodeScanResult", str, "Cancelled");
        } else {
            im.f.F().r(str, new f.k() { // from class: pj.e
                @Override // im.f.k
                public final void a(boolean z10) {
                    f.b(str, z10);
                }
            });
        }
    }

    public static void f(@NonNull q qVar, int i10) {
        ek.q.h("QrCodeScanner", "showFragmentInActivity: containerViewId = " + i10);
        MlKitContext.initializeIfNeeded(qVar.getApplicationContext());
        c d22 = c.d2("content/fonts/BuilderSans-Medium.otf");
        if (h.a().M1()) {
            qVar.P().d(d22, new a(true, qVar));
        }
        final FragmentManager l12 = qVar.l1();
        l12.r().b(i10, d22, "CustomCaptureFragment").f(null).g();
        l12.t1("QrCode_requestKey", qVar, new f0() { // from class: pj.d
            @Override // e4.f0
            public final void a(String str, Bundle bundle) {
                f.a(FragmentManager.this, str, bundle);
            }
        });
    }
}
