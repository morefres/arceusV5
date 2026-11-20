package b3;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.d1;
import androidx.core.view.o0;
import androidx.core.view.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final View f3743a;
    public final ArrayList<c> b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public Insets f3744c;

    /* renamed from: d, reason: collision with root package name */
    public Insets f3745d;

    /* renamed from: e, reason: collision with root package name */
    public int f3746e;

    public class a extends View {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3747a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ViewGroup viewGroup) {
            super(context);
            this.f3747a = viewGroup;
        }

        @Override // android.view.View
        public void onConfigurationChanged(Configuration configuration) {
            Drawable background = this.f3747a.getBackground();
            int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
            if (g.this.f3746e != color) {
                g.this.f3746e = color;
                for (int size = g.this.b.size() - 1; size >= 0; size--) {
                    ((c) g.this.b.get(size)).e(color);
                }
            }
        }
    }

    public class b extends d1.b {

        /* renamed from: c, reason: collision with root package name */
        public final HashMap<d1, Integer> f3748c;

        public b(int i10) {
            super(i10);
            this.f3748c = new HashMap<>();
        }

        @Override // androidx.core.view.d1.b
        public void b(d1 d1Var) {
            if (f(d1Var)) {
                this.f3748c.remove(d1Var);
                for (int size = g.this.b.size() - 1; size >= 0; size--) {
                    ((c) g.this.b.get(size)).d();
                }
            }
        }

        @Override // androidx.core.view.d1.b
        public void c(d1 d1Var) {
            if (f(d1Var)) {
                for (int size = g.this.b.size() - 1; size >= 0; size--) {
                    ((c) g.this.b.get(size)).c();
                }
            }
        }

        @Override // androidx.core.view.d1.b
        public WindowInsetsCompat d(WindowInsetsCompat windowInsetsCompat, List<d1> list) {
            RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
            int i10 = 0;
            for (int size = list.size() - 1; size >= 0; size--) {
                d1 d1Var = list.get(size);
                Integer num = this.f3748c.get(d1Var);
                if (num != null) {
                    int intValue = num.intValue();
                    float a10 = d1Var.a();
                    if ((intValue & 1) != 0) {
                        rectF.left = a10;
                    }
                    if ((intValue & 2) != 0) {
                        rectF.top = a10;
                    }
                    if ((intValue & 4) != 0) {
                        rectF.right = a10;
                    }
                    if ((intValue & 8) != 0) {
                        rectF.bottom = a10;
                    }
                    i10 |= intValue;
                }
            }
            Insets i11 = g.this.i(windowInsetsCompat);
            for (int size2 = g.this.b.size() - 1; size2 >= 0; size2--) {
                ((c) g.this.b.get(size2)).a(i10, i11, rectF);
            }
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.d1.b
        public d1.a e(d1 d1Var, d1.a aVar) {
            if (!f(d1Var)) {
                return aVar;
            }
            Insets b = aVar.b();
            Insets a10 = aVar.a();
            int i10 = b.left != a10.left ? 1 : 0;
            if (b.top != a10.top) {
                i10 |= 2;
            }
            if (b.right != a10.right) {
                i10 |= 4;
            }
            if (b.bottom != a10.bottom) {
                i10 |= 8;
            }
            this.f3748c.put(d1Var, Integer.valueOf(i10));
            return aVar;
        }

        public final boolean f(d1 d1Var) {
            return (d1Var.d() & WindowInsetsCompat.Type.systemBars()) != 0;
        }
    }

    public interface c {
        void a(int i10, Insets insets, RectF rectF);

        void b(Insets insets, Insets insets2);

        void c();

        void d();

        void e(int i10);
    }

    public g(ViewGroup viewGroup) {
        Insets insets = Insets.NONE;
        this.f3744c = insets;
        this.f3745d = insets;
        Drawable background = viewGroup.getBackground();
        this.f3746e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        a aVar = new a(viewGroup.getContext(), viewGroup);
        this.f3743a = aVar;
        aVar.setWillNotDraw(true);
        o0.A0(aVar, new y() { // from class: b3.e
            @Override // androidx.core.view.y
            public final WindowInsetsCompat J(View view, WindowInsetsCompat windowInsetsCompat) {
                return g.b(g.this, view, windowInsetsCompat);
            }
        });
        o0.H0(aVar, new b(0));
        viewGroup.addView(aVar, 0);
    }

    public static /* synthetic */ void a(g gVar) {
        ViewParent parent = gVar.f3743a.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(gVar.f3743a);
        }
    }

    public static /* synthetic */ WindowInsetsCompat b(g gVar, View view, WindowInsetsCompat windowInsetsCompat) {
        Insets i10 = gVar.i(windowInsetsCompat);
        Insets j10 = gVar.j(windowInsetsCompat);
        if (!i10.equals(gVar.f3744c) || !j10.equals(gVar.f3745d)) {
            gVar.f3744c = i10;
            gVar.f3745d = j10;
            for (int size = gVar.b.size() - 1; size >= 0; size--) {
                gVar.b.get(size).b(i10, j10);
            }
        }
        return windowInsetsCompat;
    }

    public void g(c cVar) {
        if (this.b.contains(cVar)) {
            return;
        }
        this.b.add(cVar);
        cVar.b(this.f3744c, this.f3745d);
        cVar.e(this.f3746e);
    }

    public void h() {
        this.f3743a.post(new Runnable() { // from class: b3.f
            @Override // java.lang.Runnable
            public final void run() {
                g.a(g.this);
            }
        });
    }

    public final Insets i(WindowInsetsCompat windowInsetsCompat) {
        return Insets.min(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.tappableElement()));
    }

    public final Insets j(WindowInsetsCompat windowInsetsCompat) {
        return Insets.min(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars()), windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.tappableElement()));
    }

    public boolean k() {
        return !this.b.isEmpty();
    }

    public void l(c cVar) {
        this.b.remove(cVar);
    }
}
