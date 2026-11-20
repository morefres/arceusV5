package com.roblox.client.startup;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.a;
import e4.k;
import ek.q;
import rg.q0;

/* loaded from: classes2.dex */
public class c extends k {

    /* renamed from: v0, reason: collision with root package name */
    public b f9544v0;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            q.h("FragmentRetry", "... Dialog::onClick:");
            if (c.this.f9544v0 != null) {
                c.this.f9544v0.M();
            }
        }
    }

    public interface b {
        void M();

        void i();
    }

    public static void v2(@NonNull j.b bVar) {
        c w22 = w2(bVar);
        if (w22 != null) {
            q.h("FragmentRetry", "Dismiss the existing Retry UI...");
            w22.f2();
        }
    }

    public static c w2(@NonNull j.b bVar) {
        androidx.fragment.app.c n02 = bVar.l1().n0("FragmentRetry");
        if (n02 instanceof c) {
            return (c) n02;
        }
        return null;
    }

    public static void y2(@NonNull j.b bVar, int i10) {
        q.h("FragmentRetry", "showRetryFragment: ");
        FlagCacheUtils.recordRetryDialogShown();
        c w22 = w2(bVar);
        if (w22 != null) {
            q.h("FragmentRetry", "showRetryFragment: Found an existing Retry fragment.");
            w22.x2(bVar.getString(i10));
            return;
        }
        q.h("FragmentRetry", "showRetryFragment: Create a new FragmentRetry...");
        c cVar = new c();
        Bundle bundle = new Bundle();
        bundle.putInt("message", i10);
        cVar.O1(bundle);
        cVar.t2(bVar.l1(), "FragmentRetry");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e4.k, androidx.fragment.app.c
    public void C0(Context context) {
        super.C0(context);
        if (context instanceof b) {
            this.f9544v0 = (b) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener.");
    }

    @Override // e4.k, androidx.fragment.app.c
    public void N0() {
        super.N0();
        this.f9544v0 = null;
    }

    @Override // e4.k
    @NonNull
    public Dialog k2(Bundle bundle) {
        q.h("FragmentRetry", "onCreateDialog:");
        a.C0009a m10 = new a.C0009a(p()).p(q0.B).g(t().getInt("message")).m(q0.f30500t, new a());
        m10.d(true);
        return m10.a();
    }

    @Override // e4.k, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        q.h("FragmentRetry", "onCancel:");
        b bVar = this.f9544v0;
        if (bVar != null) {
            bVar.i();
        }
    }

    @Override // e4.k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        q.h("FragmentRetry", "onDismiss: Do nothing.");
    }

    public void x2(CharSequence charSequence) {
        Dialog h22 = h2();
        if (h22 instanceof androidx.appcompat.app.a) {
            ((androidx.appcompat.app.a) h22).u(charSequence);
        }
    }
}
