package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class s extends RecyclerView.t {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f3100a;
    public Scroller b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView.v f3101c = new a();

    public class a extends RecyclerView.v {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3102a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0 && this.f3102a) {
                this.f3102a = false;
                s.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f3102a = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean a(int i10, int i11) {
        RecyclerView.q layoutManager = this.f3100a.getLayoutManager();
        if (layoutManager == null || this.f3100a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3100a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && i(layoutManager, i10, i11);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3100a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f3100a = recyclerView;
        if (recyclerView != null) {
            h();
            this.b = new Scroller(this.f3100a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(@NonNull RecyclerView.q qVar, @NonNull View view);

    public abstract RecyclerView.a0 d(@NonNull RecyclerView.q qVar);

    public final void e() {
        this.f3100a.k1(this.f3101c);
        this.f3100a.setOnFlingListener(null);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract View f(RecyclerView.q qVar);

    @SuppressLint({"UnknownNullness"})
    public abstract int g(RecyclerView.q qVar, int i10, int i11);

    public final void h() {
        if (this.f3100a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f3100a.n(this.f3101c);
        this.f3100a.setOnFlingListener(this);
    }

    public final boolean i(@NonNull RecyclerView.q qVar, int i10, int i11) {
        RecyclerView.a0 d10;
        int g10;
        if (!(qVar instanceof RecyclerView.a0.b) || (d10 = d(qVar)) == null || (g10 = g(qVar, i10, i11)) == -1) {
            return false;
        }
        d10.p(g10);
        qVar.O1(d10);
        return true;
    }

    public void j() {
        RecyclerView.q layoutManager;
        View f10;
        RecyclerView recyclerView = this.f3100a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (f10 = f(layoutManager)) == null) {
            return;
        }
        int[] c10 = c(layoutManager, f10);
        int i10 = c10[0];
        if (i10 == 0 && c10[1] == 0) {
            return;
        }
        this.f3100a.y1(i10, c10[1]);
    }
}
