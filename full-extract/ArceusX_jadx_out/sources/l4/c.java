package l4;

import gt.m;
import ju.g1;
import ju.z2;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ll4/b;", ve.a.f33391e, "()Ll4/b;", "lifecycle-viewmodel"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {
    @NotNull
    public static final b a() {
        CoroutineContext coroutineContext;
        try {
            coroutineContext = g1.c().W();
        } catch (m unused) {
            coroutineContext = kotlin.coroutines.e.f22936a;
        } catch (IllegalStateException unused2) {
            coroutineContext = kotlin.coroutines.e.f22936a;
        }
        return new b(coroutineContext.plus(z2.b(null, 1, null)));
    }
}
