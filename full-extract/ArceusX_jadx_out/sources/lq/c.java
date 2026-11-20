package lq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import hq.t;
import hq.u;

/* loaded from: classes3.dex */
public final class c implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f23827a;

    @NonNull
    public final ImageView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f23828c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f23829d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f23830e;

    public c(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView) {
        this.f23827a = view;
        this.b = imageView;
        this.f23828c = imageView2;
        this.f23829d = imageView3;
        this.f23830e = textView;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = t.f19623m;
        ImageView imageView = (ImageView) r5.b.a(view, i10);
        if (imageView != null) {
            i10 = t.f19624n;
            ImageView imageView2 = (ImageView) r5.b.a(view, i10);
            if (imageView2 != null) {
                i10 = t.f19625o;
                ImageView imageView3 = (ImageView) r5.b.a(view, i10);
                if (imageView3 != null) {
                    i10 = t.f19626p;
                    TextView textView = (TextView) r5.b.a(view, i10);
                    if (textView != null) {
                        return new c(view, imageView, imageView2, imageView3, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static c b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(u.f19638c, viewGroup);
        return a(viewGroup);
    }

    @Override // r5.a
    @NonNull
    public View getRoot() {
        return this.f23827a;
    }
}
