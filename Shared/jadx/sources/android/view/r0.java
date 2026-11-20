package android.view;

import android.os.Bundle;
import d5.c;
import d5.f;
import d5.j;
import gt.h;
import gt.i;
import gt.s;
import j6.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;
import ve.a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/lifecycle/r0;", "Ld5/f$b;", "Ld5/f;", "savedStateRegistry", "Landroidx/lifecycle/c1;", "viewModelStoreOwner", "<init>", "(Ld5/f;Landroidx/lifecycle/c1;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", a.f33391e, "()Landroid/os/Bundle;", "", "e", "()V", "", "key", "c", "(Ljava/lang/String;)Landroid/os/Bundle;", "Ld5/f;", "", b.f21518e, "Z", "restored", "Landroid/os/Bundle;", "restoredState", "Landroidx/lifecycle/s0;", d.f30696a, "Lgt/h;", "()Landroidx/lifecycle/s0;", "viewModel", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r0 implements f.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f savedStateRegistry;

    /* renamed from: b, reason: from kotlin metadata */
    public boolean restored;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Bundle restoredState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h viewModel;

    public r0(@NotNull f savedStateRegistry, @NotNull final c1 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = savedStateRegistry;
        this.viewModel = i.b(new Function0() { // from class: androidx.lifecycle.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                s0 f10;
                f10 = r0.f(c1.this);
                return f10;
            }
        });
    }

    public static final s0 f(c1 c1Var) {
        return o0.e(c1Var);
    }

    @Override // d5.f.b
    @NotNull
    public Bundle a() {
        Pair[] pairArr;
        Map j10 = k0.j();
        if (j10.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(j10.size());
            for (Map.Entry entry : j10.entrySet()) {
                arrayList.add(s.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle a10 = u2.d.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle a11 = j.a(a10);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            j.b(a11, bundle);
        }
        for (Map.Entry<String, l0> entry2 : d().e().entrySet()) {
            String key = entry2.getKey();
            Bundle a12 = entry2.getValue().h().a();
            if (!c.f(c.a(a12))) {
                j.c(a11, key, a12);
            }
        }
        this.restored = false;
        return a10;
    }

    @Nullable
    public final Bundle c(@NotNull String key) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(key, "key");
        e();
        Bundle bundle = this.restoredState;
        if (bundle == null || !c.b(c.a(bundle), key)) {
            return null;
        }
        Bundle d10 = c.d(c.a(bundle), key);
        if (d10 == null) {
            Map j10 = k0.j();
            if (j10.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(j10.size());
                for (Map.Entry entry : j10.entrySet()) {
                    arrayList.add(s.a((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            d10 = u2.d.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            j.a(d10);
        }
        j.e(j.a(bundle), key);
        if (c.f(c.a(bundle))) {
            this.restoredState = null;
        }
        return d10;
    }

    public final s0 d() {
        return (s0) this.viewModel.getValue();
    }

    public final void e() {
        Pair[] pairArr;
        if (this.restored) {
            return;
        }
        Bundle a10 = this.savedStateRegistry.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Map j10 = k0.j();
        if (j10.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(j10.size());
            for (Map.Entry entry : j10.entrySet()) {
                arrayList.add(s.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle a11 = u2.d.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle a12 = j.a(a11);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            j.b(a12, bundle);
        }
        if (a10 != null) {
            j.b(a12, a10);
        }
        this.restoredState = a11;
        this.restored = true;
        d();
    }
}
