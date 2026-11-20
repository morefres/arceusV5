package wf;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public interface j {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* renamed from: a, reason: collision with root package name */
        public final int f34318a;

        a(int i10) {
            this.f34318a = i10;
        }

        public int b() {
            return this.f34318a;
        }
    }

    @NonNull
    a b(@NonNull String str);
}
