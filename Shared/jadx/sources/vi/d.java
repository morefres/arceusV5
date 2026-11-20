package vi;

import android.R;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.view.InterfaceC0703r;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.roblox.client.NotificationStreamActivity;
import com.roblox.engine.jni.NativeGLInterface;
import e4.q;
import rg.a1;
import rg.e0;
import rg.e2;
import rg.g0;
import rg.j0;
import rg.k0;
import rg.l0;
import rg.m0;
import rg.o0;
import rg.q0;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f33427a;
    public q b;

    /* renamed from: c, reason: collision with root package name */
    public bk.c f33428c;

    /* renamed from: d, reason: collision with root package name */
    public int f33429d;

    /* renamed from: e, reason: collision with root package name */
    public int f33430e;

    /* renamed from: f, reason: collision with root package name */
    public MenuItem f33431f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f33432g;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.e();
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33434a;

        static {
            int[] iArr = new int[ml.a.values().length];
            f33434a = iArr;
            try {
                iArr[ml.a.f24590c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33434a[ml.a.f24591d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public d(androidx.fragment.app.c cVar) {
        this(cVar, new bk.f());
    }

    public final int a() {
        if (b.f33434a[this.f33428c.getTheme().ordinal()] != 1) {
            return this.f33430e;
        }
        return -1;
    }

    public final int b() {
        return b.f33434a[this.f33428c.getTheme().ordinal()] != 1 ? l0.f30336k : l0.f30337l;
    }

    public final int c() {
        return b.f33434a[this.f33428c.getTheme().ordinal()] != 1 ? l0.f30348w : l0.f30349x;
    }

    public MenuItem d(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(o0.f30436a, menu);
        MenuItem findItem = menu.findItem(m0.f30354a);
        this.f33431f = findItem;
        View actionView = findItem.getActionView();
        ImageView imageView = (ImageView) actionView.findViewById(m0.X);
        TextView textView = (TextView) actionView.findViewById(m0.Y);
        this.f33432g = textView;
        h(textView, this.f33429d);
        imageView.setOnClickListener(new a());
        imageView.setImageResource(c());
        this.f33432g.setBackgroundResource(b());
        this.f33432g.setTextColor(a());
        return this.f33431f;
    }

    public void e() {
        f(null);
    }

    public void f(InterfaceC0703r interfaceC0703r) {
        if (this.b == null) {
            return;
        }
        dk.c.c().s(0);
        this.f33429d = 0;
        TextView textView = this.f33432g;
        if (textView != null) {
            textView.setVisibility(8);
        }
        tk.g.d().f().c().F(new vk.a());
        if (!a1.p0()) {
            i(interfaceC0703r);
            return;
        }
        Intent intent = new Intent(this.b, (Class<?>) NotificationStreamActivity.class);
        if (interfaceC0703r != null) {
            intent.putExtra("SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA", true);
        }
        this.b.startActivityForResult(intent, 20110);
        if (NativeGLInterface.nativeUserGameSettingsGetReducedMotion()) {
            this.b.overridePendingTransition(0, 0);
        } else {
            this.b.overridePendingTransition(g0.b, R.anim.fade_out);
        }
    }

    public final void g(int i10) {
        this.f33429d = i10;
        h((TextView) this.f33431f.getActionView().findViewById(m0.Y), this.f33429d);
    }

    public final void h(TextView textView, int i10) {
        if (i10 <= 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        if (i10 > 99) {
            textView.setText(textView.getContext().getString(q0.Q));
        } else {
            textView.setText(oi.e.a(i10));
        }
    }

    public final void i(InterfaceC0703r interfaceC0703r) {
        Point j10 = cl.a.j(this.b);
        int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(k0.f30321c);
        int dimensionPixelSize2 = this.b.getResources().getDimensionPixelSize(k0.b);
        int e10 = (int) e2.e(this.b, 80);
        int e11 = (int) e2.e(this.b, 420);
        int i10 = ((j10.y - dimensionPixelSize2) - dimensionPixelSize) - e10;
        int e12 = (int) e2.e(this.b, 15);
        e0 e0Var = new e0();
        e0Var.r2(2, 0);
        Bundle bundle = new Bundle();
        bundle.putInt("dialogWidth", e11);
        bundle.putInt("dialogHeight", i10);
        bundle.putInt("dialogGravity", 53);
        bundle.putInt("dialogOffsetY", dimensionPixelSize);
        bundle.putInt("dialogOffsetX", e12);
        bundle.putString("DEFAULT_URL", a1.y0());
        e0Var.O1(bundle);
        if (interfaceC0703r != null) {
            e0Var.a().a(interfaceC0703r);
        }
        e0Var.t2(this.b.l1(), "NOTIFICATION_STREAM_TAG");
    }

    public void j() {
        androidx.fragment.app.c n02 = this.b.l1().n0("NOTIFICATION_STREAM_TAG");
        if (n02 != null && n02.x0()) {
            dk.c.c().s(0);
        }
        g(dk.c.c().e());
    }

    public d(androidx.fragment.app.c cVar, bk.c cVar2) {
        this.f33427a = "NOTIFICATION_STREAM_TAG";
        this.f33429d = -1;
        q p8 = cVar.p();
        this.b = p8;
        this.f33428c = cVar2;
        Resources resources = p8.getResources();
        this.f33430e = resources != null ? resources.getColor(j0.f30311i) : -12303292;
    }
}
