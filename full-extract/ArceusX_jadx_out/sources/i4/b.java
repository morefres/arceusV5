package i4;

import android.os.Bundle;
import d5.f;
import d5.j;
import gt.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mu.c0;
import mu.p0;
import mu.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0017\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0019\u0010\u0014R%\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR(\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001cR+\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r0\u001a8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010(\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Li4/b;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "T", "key", "initialValue", "Lmu/p0;", "g", "(Ljava/lang/String;Ljava/lang/Object;)Lmu/p0;", "Lmu/c0;", d.f30696a, "(Ljava/lang/String;Ljava/lang/Object;)Lmu/c0;", "", "h", "()Ljava/util/Set;", j6.b.f21518e, "(Ljava/lang/String;)Ljava/lang/Object;", "value", "", "k", "(Ljava/lang/String;Ljava/lang/Object;)V", "i", "", ve.a.f33391e, "Ljava/util/Map;", "e", "()Ljava/util/Map;", "regular", "Ld5/f$b;", "providers", "c", "flows", "mutableFlows", "Ld5/f$b;", "f", "()Ld5/f$b;", "savedStateProvider", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, Object> regular;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, f.b> providers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, c0<Object>> flows;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, c0<Object>> mutableFlows;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f.b savedStateProvider;

    public b(@NotNull Map<String, ? extends Object> initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.regular = k0.x(initialState);
        this.providers = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.mutableFlows = new LinkedHashMap();
        this.savedStateProvider = new f.b() { // from class: i4.a
            @Override // d5.f.b
            public final Bundle a() {
                Bundle j10;
                j10 = b.j(b.this);
                return j10;
            }
        };
    }

    public static final Bundle j(b bVar) {
        Pair[] pairArr;
        for (Map.Entry entry : k0.v(bVar.mutableFlows).entrySet()) {
            bVar.k((String) entry.getKey(), ((c0) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : k0.v(bVar.providers).entrySet()) {
            bVar.k((String) entry2.getKey(), ((f.b) entry2.getValue()).a());
        }
        Map<String, Object> map = bVar.regular;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Object> entry3 : map.entrySet()) {
                arrayList.add(s.a(entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle a10 = u2.d.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        j.a(a10);
        return a10;
    }

    @Nullable
    public final <T> T b(@NotNull String key) {
        T t8;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            c0<Object> c0Var = this.mutableFlows.get(key);
            if (c0Var != null && (t8 = (T) c0Var.getValue()) != null) {
                return t8;
            }
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            i(key);
            return null;
        }
    }

    @NotNull
    public final Map<String, c0<Object>> c() {
        return this.mutableFlows;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <T> c0<T> d(@NotNull String key, T initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, c0<Object>> map = this.mutableFlows;
        Object obj = map.get(key);
        if (obj == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, initialValue);
            }
            obj = r0.a(this.regular.get(key));
            map.put(key, obj);
        }
        c0<T> c0Var = (c0) obj;
        Intrinsics.d(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getMutableStateFlow>");
        return c0Var;
    }

    @NotNull
    public final Map<String, Object> e() {
        return this.regular;
    }

    @NotNull
    /* renamed from: f, reason: from getter */
    public final f.b getSavedStateProvider() {
        return this.savedStateProvider;
    }

    @NotNull
    public final <T> p0<T> g(@NotNull String key, T initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, c0<Object>> map = this.flows;
        c0<Object> c0Var = map.get(key);
        if (c0Var == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, initialValue);
            }
            c0Var = r0.a(this.regular.get(key));
            map.put(key, c0Var);
        }
        p0<T> a10 = mu.j.a(c0Var);
        Intrinsics.d(a10, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getStateFlow>");
        return a10;
    }

    @NotNull
    public final Set<String> h() {
        return kotlin.collections.r0.i(this.regular.keySet(), this.providers.keySet());
    }

    @Nullable
    public final <T> T i(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t8 = (T) this.regular.remove(key);
        this.flows.remove(key);
        this.mutableFlows.remove(key);
        return t8;
    }

    public final <T> void k(@NotNull String key, @Nullable T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.regular.put(key, value);
        c0<Object> c0Var = this.flows.get(key);
        if (c0Var != null) {
            c0Var.setValue(value);
        }
        c0<Object> c0Var2 = this.mutableFlows.get(key);
        if (c0Var2 != null) {
            c0Var2.setValue(value);
        }
    }

    public /* synthetic */ b(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? k0.j() : map);
    }
}
