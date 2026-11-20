package wg;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.roblox.client.components.RbxTextView;
import e4.k;
import ek.q;
import rg.m0;
import rg.q0;
import rh.h;

/* loaded from: classes2.dex */
public class b extends k implements View.OnClickListener, DialogInterface.OnCancelListener {

    /* renamed from: v0, reason: collision with root package name */
    public a f34338v0;

    /* renamed from: w0, reason: collision with root package name */
    public hh.a f34339w0;

    public interface a {
        void a(Activity activity);

        void b(Context context);

        void c(Activity activity);

        void d(boolean z10);
    }

    @Override // e4.k, androidx.fragment.app.c
    public void F0(Bundle bundle) {
        super.F0(bundle);
        V1(true);
        r2(1, j2());
    }

    @Override // androidx.fragment.app.c
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34339w0 = hh.a.c(layoutInflater, viewGroup, false);
        u2();
        return this.f34339w0.getRoot();
    }

    @Override // e4.k, androidx.fragment.app.c
    public void M0() {
        Dialog h22 = h2();
        if (h22 != null && U()) {
            h22.setDismissMessage(null);
        }
        super.M0();
        this.f34339w0 = null;
    }

    @Override // androidx.fragment.app.c
    public void a1() {
        w2();
        super.a1();
    }

    @Override // e4.k, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        a aVar = this.f34338v0;
        if (aVar != null) {
            aVar.c(p());
        } else {
            q.e("RateMeMaybeFragment", "onCancel - mInterface is null");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f34338v0 == null) {
            q.e("RateMeMaybeFragment", "onClick - mInterface is null");
            return;
        }
        if (view.getId() == m0.f30377m) {
            this.f34338v0.c(p());
        } else if (view.getId() == m0.f30381o) {
            this.f34338v0.a(p());
        } else if (view.getId() == m0.f30383p) {
            this.f34338v0.b(w());
        } else if (view.getId() == m0.f30385q) {
            this.f34338v0.d(false);
        }
        v2();
    }

    public final void u2() {
        if (h.a().W4()) {
            this.f34339w0.f19416d.setTypeface(Typeface.DEFAULT);
            this.f34339w0.f19416d.setText(q0.f30444a);
            this.f34339w0.f19419g.setVisibility(8);
            if (h.a().o5()) {
                RbxTextView rbxTextView = this.f34339w0.f19416d;
                rbxTextView.setPadding(rbxTextView.getPaddingLeft(), this.f34339w0.f19416d.getPaddingTop(), this.f34339w0.f19416d.getPaddingRight(), 16);
                this.f34339w0.f19420h.setVisibility(8);
                this.f34339w0.b.setVisibility(8);
            }
            this.f34339w0.f19418f.setTextSize(2, 16.0f);
            this.f34339w0.f19417e.setText(q0.b);
        }
        this.f34339w0.f19418f.setOnClickListener(this);
        this.f34339w0.f19417e.setOnClickListener(this);
        this.f34339w0.f19419g.setOnClickListener(this);
        this.f34339w0.f19415c.setOnClickListener(this);
    }

    public final void v2() {
        e2();
    }

    public final void w2() {
        Window window = h2().getWindow();
        Point point = new Point();
        if (window != null) {
            window.getWindowManager().getDefaultDisplay().getSize(point);
            window.setLayout(Math.min(Math.min(point.x, point.y), 950), -2);
            window.setGravity(17);
        }
    }

    public void x2(a aVar) {
        this.f34338v0 = aVar;
    }
}
