package mc;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.d1;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class a extends d1.b {

    /* renamed from: c, reason: collision with root package name */
    public final View f24406c;

    /* renamed from: d, reason: collision with root package name */
    public int f24407d;

    /* renamed from: e, reason: collision with root package name */
    public int f24408e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f24409f;

    public a(View view) {
        super(0);
        this.f24409f = new int[2];
        this.f24406c = view;
    }

    @Override // androidx.core.view.d1.b
    public void b(@NonNull d1 d1Var) {
        this.f24406c.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.d1.b
    public void c(@NonNull d1 d1Var) {
        this.f24406c.getLocationOnScreen(this.f24409f);
        this.f24407d = this.f24409f[1];
    }

    @Override // androidx.core.view.d1.b
    @NonNull
    public WindowInsetsCompat d(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<d1> list) {
        Iterator<d1> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().d() & WindowInsetsCompat.Type.ime()) != 0) {
                this.f24406c.setTranslationY(jc.a.c(this.f24408e, 0, r0.c()));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.d1.b
    @NonNull
    public d1.a e(@NonNull d1 d1Var, @NonNull d1.a aVar) {
        this.f24406c.getLocationOnScreen(this.f24409f);
        int i10 = this.f24407d - this.f24409f[1];
        this.f24408e = i10;
        this.f24406c.setTranslationY(i10);
        return aVar;
    }
}
