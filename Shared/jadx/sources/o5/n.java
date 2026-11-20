package o5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public Context f27663a;
    public int b = -1;

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f27664c;

    /* renamed from: d, reason: collision with root package name */
    public View f27665d;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f27666e;

    /* renamed from: f, reason: collision with root package name */
    public Runnable f27667f;

    public n(@NonNull ViewGroup viewGroup, @NonNull View view) {
        this.f27664c = viewGroup;
        this.f27665d = view;
    }

    public static n c(@NonNull ViewGroup viewGroup) {
        return (n) viewGroup.getTag(l.f27656c);
    }

    public static void f(@NonNull ViewGroup viewGroup, n nVar) {
        viewGroup.setTag(l.f27656c, nVar);
    }

    public void a() {
        if (this.b > 0 || this.f27665d != null) {
            d().removeAllViews();
            if (this.b > 0) {
                LayoutInflater.from(this.f27663a).inflate(this.b, this.f27664c);
            } else {
                this.f27664c.addView(this.f27665d);
            }
        }
        Runnable runnable = this.f27666e;
        if (runnable != null) {
            runnable.run();
        }
        f(this.f27664c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.f27664c) != this || (runnable = this.f27667f) == null) {
            return;
        }
        runnable.run();
    }

    @NonNull
    public ViewGroup d() {
        return this.f27664c;
    }

    public boolean e() {
        return this.b > 0;
    }
}
