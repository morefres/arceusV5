package androidx.core.view;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f1697a;

    public static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final ScrollFeedbackProvider f1698a;

        public b(View view) {
            this.f1698a = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // androidx.core.view.f0.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
            this.f1698a.onScrollLimit(i10, i11, i12, z10);
        }

        @Override // androidx.core.view.f0.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
            this.f1698a.onScrollProgress(i10, i11, i12, i13);
        }
    }

    public static class c implements d {
        public c() {
        }

        @Override // androidx.core.view.f0.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        }

        @Override // androidx.core.view.f0.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
        }
    }

    public interface d {
        void onScrollLimit(int i10, int i11, int i12, boolean z10);

        void onScrollProgress(int i10, int i11, int i12, int i13);
    }

    public f0(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f1697a = new b(view);
        } else {
            this.f1697a = new c();
        }
    }

    public static f0 a(View view) {
        return new f0(view);
    }

    public void b(int i10, int i11, int i12, boolean z10) {
        this.f1697a.onScrollLimit(i10, i11, i12, z10);
    }

    public void c(int i10, int i11, int i12, int i13) {
        this.f1697a.onScrollProgress(i10, i11, i12, i13);
    }
}
