package hh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.roblox.client.components.RbxButton;
import com.roblox.client.components.RbxTextView;
import r5.b;
import rg.m0;
import rg.n0;

/* loaded from: classes2.dex */
public final class a implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f19414a;

    @NonNull
    public final TextView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f19415c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RbxTextView f19416d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final RbxButton f19417e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final RbxButton f19418f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final RbxButton f19419g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final RbxTextView f19420h;

    public a(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RbxTextView rbxTextView, @NonNull RbxButton rbxButton, @NonNull RbxButton rbxButton2, @NonNull RbxButton rbxButton3, @NonNull RbxTextView rbxTextView2) {
        this.f19414a = linearLayout;
        this.b = textView;
        this.f19415c = textView2;
        this.f19416d = rbxTextView;
        this.f19417e = rbxButton;
        this.f19418f = rbxButton2;
        this.f19419g = rbxButton3;
        this.f19420h = rbxTextView2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i10 = m0.f30375l;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = m0.f30377m;
            TextView textView2 = (TextView) b.a(view, i10);
            if (textView2 != null) {
                i10 = m0.f30379n;
                RbxTextView rbxTextView = (RbxTextView) b.a(view, i10);
                if (rbxTextView != null) {
                    i10 = m0.f30381o;
                    RbxButton rbxButton = (RbxButton) b.a(view, i10);
                    if (rbxButton != null) {
                        i10 = m0.f30383p;
                        RbxButton rbxButton2 = (RbxButton) b.a(view, i10);
                        if (rbxButton2 != null) {
                            i10 = m0.f30385q;
                            RbxButton rbxButton3 = (RbxButton) b.a(view, i10);
                            if (rbxButton3 != null) {
                                i10 = m0.f30358c0;
                                RbxTextView rbxTextView2 = (RbxTextView) b.a(view, i10);
                                if (rbxTextView2 != null) {
                                    return new a((LinearLayout) view, textView, textView2, rbxTextView, rbxButton, rbxButton2, rbxButton3, rbxTextView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(n0.f30412g, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f19414a;
    }
}
