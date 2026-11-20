package ju;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0005¢\u0006\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lju/n2;", "Lju/l0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "parallelism", "name", "P", "(ILjava/lang/String;)Lju/l0;", "X", "W", "()Lju/n2;", "immediate", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class n2 extends l0 {
    @Override // ju.l0
    @NotNull
    public l0 P(int parallelism, @Nullable String name) {
        pu.m.a(parallelism);
        return pu.m.b(this, name);
    }

    @NotNull
    public abstract n2 W();

    @Nullable
    public final String X() {
        n2 n2Var;
        n2 c10 = g1.c();
        if (this == c10) {
            return "Dispatchers.Main";
        }
        try {
            n2Var = c10.W();
        } catch (UnsupportedOperationException unused) {
            n2Var = null;
        }
        if (this == n2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // ju.l0
    @NotNull
    public String toString() {
        String X = X();
        if (X != null) {
            return X;
        }
        return t0.a(this) + '@' + t0.b(this);
    }
}
