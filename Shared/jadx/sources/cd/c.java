package cd;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import e.BackEventCompat;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f4828a = a();

    @NonNull
    public final cd.b b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f4829c;

    public static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public OnBackInvokedCallback f4830a;

        public b() {
        }

        @Override // cd.c.d
        public void a(@NonNull View view) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (findOnBackInvokedDispatcher == null) {
                return;
            }
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f4830a);
            this.f4830a = null;
        }

        @Override // cd.c.d
        public void b(@NonNull cd.b bVar, @NonNull View view, boolean z10) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (this.f4830a == null && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback c10 = c(bVar);
                this.f4830a = c10;
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(z10 ? 1000000 : 0, c10);
            }
        }

        public OnBackInvokedCallback c(@NonNull final cd.b bVar) {
            Objects.requireNonNull(bVar);
            return new OnBackInvokedCallback() { // from class: cd.d
                public final void onBackInvoked() {
                    b.this.d();
                }
            };
        }

        public boolean d() {
            return this.f4830a != null;
        }
    }

    /* renamed from: cd.c$c, reason: collision with other inner class name */
    public static class C0104c extends b {

        /* renamed from: cd.c$c$a */
        public class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ cd.b f4831a;

            public a(cd.b bVar) {
                this.f4831a = bVar;
            }

            public void onBackCancelled() {
                if (C0104c.this.d()) {
                    this.f4831a.b();
                }
            }

            public void onBackInvoked() {
                this.f4831a.d();
            }

            public void onBackProgressed(@NonNull BackEvent backEvent) {
                if (C0104c.this.d()) {
                    this.f4831a.a(new BackEventCompat(backEvent));
                }
            }

            public void onBackStarted(@NonNull BackEvent backEvent) {
                if (C0104c.this.d()) {
                    this.f4831a.c(new BackEventCompat(backEvent));
                }
            }
        }

        public C0104c() {
            super();
        }

        @Override // cd.c.b
        public OnBackInvokedCallback c(@NonNull cd.b bVar) {
            return new a(bVar);
        }
    }

    public interface d {
        void a(@NonNull View view);

        void b(@NonNull cd.b bVar, @NonNull View view, boolean z10);
    }

    public c(@NonNull cd.b bVar, @NonNull View view) {
        this.b = bVar;
        this.f4829c = view;
    }

    public static d a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return new C0104c();
        }
        if (i10 >= 33) {
            return new b();
        }
        return null;
    }

    public void b() {
        c(false);
    }

    public final void c(boolean z10) {
        d dVar = this.f4828a;
        if (dVar != null) {
            dVar.b(this.b, this.f4829c, z10);
        }
    }

    public void d() {
        d dVar = this.f4828a;
        if (dVar != null) {
            dVar.a(this.f4829c);
        }
    }
}
