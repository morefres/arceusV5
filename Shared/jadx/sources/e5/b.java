package e5;

import android.os.Bundle;
import android.view.l;
import android.view.p;
import android.view.s;
import d5.f;
import d5.i;
import d5.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00052\u000e\u0010\u0019\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u00052\n\u0010\u001c\u001a\u00060\u000bj\u0002`\fH\u0001¢\u0006\u0004\b\u001d\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u0010/\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010.R$\u00102\u001a\u00020*2\u0006\u00100\u001a\u00020*8G@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u00103R\"\u00106\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010,\u001a\u0004\b+\u00103\"\u0004\b4\u00105¨\u00067"}, d2 = {"Le5/b;", "", "Ld5/i;", "owner", "Lkotlin/Function0;", "", "onAttach", "<init>", "(Ld5/i;Lkotlin/jvm/functions/Function0;)V", "", "key", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "c", "(Ljava/lang/String;)Landroid/os/Bundle;", "Ld5/f$b;", "provider", "j", "(Ljava/lang/String;Ld5/f$b;)V", d.f30696a, "(Ljava/lang/String;)Ld5/f$b;", "k", "(Ljava/lang/String;)V", "f", "()V", "savedState", "h", "(Landroid/os/Bundle;)V", "outBundle", "i", ve.a.f33391e, "Ld5/i;", j6.b.f21518e, "Lkotlin/jvm/functions/Function0;", "getOnAttach$savedstate", "()Lkotlin/jvm/functions/Function0;", "Le5/c;", "Le5/c;", "lock", "", "Ljava/util/Map;", "keyToProviders", "", "e", "Z", "attached", "Landroid/os/Bundle;", "restoredState", "value", "g", "isRestored", "()Z", "setAllowingSavingState$savedstate", "(Z)V", "isAllowingSavingState", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i owner;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> onAttach;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c lock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, f.b> keyToProviders;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean attached;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Bundle restoredState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isRestored;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isAllowingSavingState;

    public b(@NotNull i owner, @NotNull Function0<Unit> onAttach) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onAttach, "onAttach");
        this.owner = owner;
        this.onAttach = onAttach;
        this.lock = new c();
        this.keyToProviders = new LinkedHashMap();
        this.isAllowingSavingState = true;
    }

    public static final void g(b bVar, s sVar, l.a event) {
        Intrinsics.checkNotNullParameter(sVar, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == l.a.ON_START) {
            bVar.isAllowingSavingState = true;
        } else if (event == l.a.ON_STOP) {
            bVar.isAllowingSavingState = false;
        }
    }

    @Nullable
    public final Bundle c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.isRestored) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.restoredState;
        if (bundle == null) {
            return null;
        }
        Bundle a10 = d5.c.a(bundle);
        Bundle c10 = d5.c.b(a10, key) ? d5.c.c(a10, key) : null;
        j.e(j.a(bundle), key);
        if (d5.c.f(d5.c.a(bundle))) {
            this.restoredState = null;
        }
        return c10;
    }

    @Nullable
    public final f.b d(@NotNull String key) {
        f.b bVar;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            Iterator it = this.keyToProviders.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                f.b bVar2 = (f.b) entry.getValue();
                if (Intrinsics.c(str, key)) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsAllowingSavingState() {
        return this.isAllowingSavingState;
    }

    public final void f() {
        if (this.owner.a().getState() != l.b.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.attached) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.onAttach.invoke();
        this.owner.a().a(new p() { // from class: e5.a
            @Override // android.view.p
            public final void f(s sVar, l.a aVar) {
                b.g(b.this, sVar, aVar);
            }
        });
        this.attached = true;
    }

    public final void h(@Nullable Bundle savedState) {
        if (!this.attached) {
            f();
        }
        if (this.owner.a().getState().b(l.b.f2629d)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + this.owner.a().getState()).toString());
        }
        if (this.isRestored) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundle = null;
        if (savedState != null) {
            Bundle a10 = d5.c.a(savedState);
            if (d5.c.b(a10, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundle = d5.c.c(a10, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        this.restoredState = bundle;
        this.isRestored = true;
    }

    public final void i(@NotNull Bundle outBundle) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Map j10 = k0.j();
        if (j10.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(j10.size());
            for (Map.Entry entry : j10.entrySet()) {
                arrayList.add(gt.s.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle a10 = u2.d.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle a11 = j.a(a10);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            j.b(a11, bundle);
        }
        synchronized (this.lock) {
            try {
                for (Map.Entry entry2 : this.keyToProviders.entrySet()) {
                    j.c(a11, (String) entry2.getKey(), ((f.b) entry2.getValue()).a());
                }
                Unit unit = Unit.f22894a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (d5.c.f(d5.c.a(a10))) {
            return;
        }
        j.c(j.a(outBundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", a10);
    }

    public final void j(@NotNull String key, @NotNull f.b provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        synchronized (this.lock) {
            if (this.keyToProviders.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.keyToProviders.put(key, provider);
            Unit unit = Unit.f22894a;
        }
    }

    public final void k(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
        }
    }
}
