package v8;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.appindex.zzk;
import n9.m;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: v8.a$a, reason: collision with other inner class name */
    public static class C0612a {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f33345a = new Bundle();
        public final String b;

        /* renamed from: c, reason: collision with root package name */
        public String f33346c;

        /* renamed from: d, reason: collision with root package name */
        public String f33347d;

        /* renamed from: e, reason: collision with root package name */
        public String f33348e;

        /* renamed from: f, reason: collision with root package name */
        public String f33349f;

        public C0612a(@NonNull String str) {
            this.b = str;
        }

        @NonNull
        public a a() {
            m.m(this.f33346c, "setObject is required before calling build().");
            m.m(this.f33347d, "setObject is required before calling build().");
            return new zzk(this.b, this.f33346c, this.f33347d, this.f33348e, this.f33349f, this.f33345a);
        }

        @NonNull
        public C0612a b(@NonNull String str, @NonNull String str2) {
            m.l(str);
            m.l(str2);
            this.f33346c = str;
            this.f33347d = str2;
            return this;
        }
    }
}
