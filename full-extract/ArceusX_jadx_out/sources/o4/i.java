package o4;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mu.c0;
import mu.p0;
import mu.r0;
import o4.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0010\u0010\tJ%\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J'\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020(0+8\u0006¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010)R\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002000+8\u0006¢\u0006\f\n\u0004\b\u001d\u0010,\u001a\u0004\b2\u0010.R\u001e\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00105R\u001e\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00105R\u001c\u00109\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00108R\u001c\u0010<\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0010\u0010:\u0012\u0004\b;\u0010\u0003R\u0018\u0010>\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010=R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00110?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00110?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00110?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010@R\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010GR\u0016\u0010L\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010G¨\u0006M"}, d2 = {"Lo4/i;", "", "<init>", "()V", "", "g", "Lo4/e;", "handler", "l", "(Lo4/e;)V", "Lo4/c;", "dispatcher", "", "priority", ve.a.f33391e, "(Lo4/c;Lo4/e;I)V", "h", "Lo4/h;", "input", j6.b.f21518e, "(Lo4/c;Lo4/h;I)V", "direction", "Lo4/b;", NotificationCompat.CATEGORY_EVENT, "f", "(Lo4/h;ILo4/b;)V", "e", "Lo4/l;", "onBackCompletedFallback", rl.d.f30696a, "(Lo4/h;ILo4/l;)V", "c", "(Lo4/h;I)V", "j", "(I)Lo4/e;", "", "Lo4/g;", "i", "()Ljava/util/List;", "Lmu/c0;", "Lo4/j;", "Lmu/c0;", "_transitionState", "Lmu/p0;", "Lmu/p0;", "getTransitionState", "()Lmu/p0;", "transitionState", "Lo4/f;", "_history", "getHistory", "history", "Lkotlin/collections/i;", "Lkotlin/collections/i;", "overlayHandlers", "defaultHandlers", "Lo4/e;", "inProgressHandler", "I", "getInProgressDirection$annotations", "inProgressDirection", "Lo4/h;", "inProgressInput", "", "Ljava/util/Set;", "unspecifiedInputs", "k", "defaultInputs", "overlayInputs", "", "m", "Z", "hasEnabledDefaultHandlers", "n", "hasEnabledOverlayHandlers", "o", "hasEnabledAnyHandlers", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<j> _transitionState;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final p0<j> transitionState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<NavigationEventHistory> _history;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0<NavigationEventHistory> history;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kotlin.collections.i<e<?>> overlayHandlers;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kotlin.collections.i<e<?>> defaultHandlers;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public e<?> inProgressHandler;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int inProgressDirection;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public h inProgressInput;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<h> unspecifiedInputs;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<h> defaultInputs;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<h> overlayInputs;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean hasEnabledDefaultHandlers;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean hasEnabledOverlayHandlers;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean hasEnabledAnyHandlers;

    public i() {
        c0<j> a10 = r0.a(j.b.b);
        this._transitionState = a10;
        this.transitionState = mu.j.a(a10);
        c0<NavigationEventHistory> a11 = r0.a(new NavigationEventHistory());
        this._history = a11;
        this.history = mu.j.a(a11);
        this.overlayHandlers = new kotlin.collections.i<>();
        this.defaultHandlers = new kotlin.collections.i<>();
        this.unspecifiedInputs = new LinkedHashSet();
        this.defaultInputs = new LinkedHashSet();
        this.overlayInputs = new LinkedHashSet();
    }

    public static /* synthetic */ e k(i iVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return iVar.j(i10);
    }

    public final void a(@NotNull c dispatcher, @NotNull e<?> handler, int priority) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler.getDispatcher() != null) {
            throw new IllegalArgumentException(("Handler '" + handler + "' is already registered with a dispatcher").toString());
        }
        if (priority == 0) {
            this.overlayHandlers.addFirst(handler);
        } else {
            if (priority != 1) {
                throw new IllegalArgumentException("Unsupported priority value: " + priority);
            }
            this.defaultHandlers.addFirst(handler);
        }
        handler.y(dispatcher);
        g();
    }

    public final void b(@NotNull c dispatcher, @NotNull h input, int priority) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.getDispatcher() == null) {
            (priority != 0 ? priority != 1 ? this.unspecifiedInputs : this.defaultInputs : this.overlayInputs).add(input);
            input.l(dispatcher);
            input.e(dispatcher);
            input.g(this.history.getValue());
            input.f(priority != 0 ? priority != 1 ? this.hasEnabledAnyHandlers : this.hasEnabledDefaultHandlers : this.hasEnabledOverlayHandlers);
            return;
        }
        throw new IllegalArgumentException(("Input '" + input + "' is already added to dispatcher " + input.getDispatcher() + '.').toString());
    }

    public final void c(@NotNull h input, int direction) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (Intrinsics.c(input, this.inProgressInput) && direction == this.inProgressDirection) {
            e<?> eVar = this.inProgressHandler;
            if (eVar == null) {
                eVar = j(direction);
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
            if (direction != -1) {
                if (direction == 1 && eVar != null) {
                    eVar.e();
                }
            } else if (eVar != null) {
                eVar.a();
            }
            this._transitionState.setValue(j.b.b);
        }
    }

    public final void d(@NotNull h input, int direction, @Nullable l onBackCompletedFallback) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (Intrinsics.c(input, this.inProgressInput) && direction == this.inProgressDirection) {
            e<?> eVar = this.inProgressHandler;
            if (eVar == null) {
                eVar = j(direction);
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
            if (direction != -1) {
                if (direction == 1 && eVar != null) {
                    eVar.f();
                }
            } else if (eVar != null) {
                eVar.b();
            } else if (onBackCompletedFallback != null) {
                onBackCompletedFallback.a();
            }
            this._transitionState.setValue(j.b.b);
        }
    }

    public final void e(@NotNull h input, int direction, @NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.c(input, this.inProgressInput) && direction == this.inProgressDirection) {
            e<?> eVar = this.inProgressHandler;
            if (eVar == null) {
                eVar = j(direction);
            }
            if (direction != -1) {
                if (direction == 1 && eVar != null) {
                    eVar.g(event);
                }
            } else if (eVar != null) {
                eVar.c(event);
            }
            this._transitionState.setValue(new j.InProgress(event, direction));
        }
    }

    public final void f(@NotNull h input, int direction, @Nullable NavigationEvent event) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (this.inProgressDirection != 0) {
            return;
        }
        e<?> j10 = j(direction);
        this.inProgressHandler = j10;
        this.inProgressDirection = direction;
        this.inProgressInput = input;
        if (event != null) {
            if (direction != -1) {
                if (direction == 1 && j10 != null) {
                    j10.h(event);
                }
            } else if (j10 != null) {
                j10.d(event);
            }
            this._transitionState.setValue(new j.InProgress(event, direction));
        }
    }

    public final void g() {
        boolean z10;
        boolean z11;
        kotlin.collections.i<e<?>> iVar = this.overlayHandlers;
        if (iVar == null || !iVar.isEmpty()) {
            for (e<?> eVar : iVar) {
                if (eVar.m() || eVar.n()) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        kotlin.collections.i<e<?>> iVar2 = this.defaultHandlers;
        if (iVar2 == null || !iVar2.isEmpty()) {
            for (e<?> eVar2 : iVar2) {
                if (eVar2.m() || eVar2.n()) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        boolean z12 = z10 || z11;
        boolean z13 = this.hasEnabledOverlayHandlers != z10;
        boolean z14 = this.hasEnabledDefaultHandlers != z11;
        boolean z15 = this.hasEnabledAnyHandlers != z12;
        if (z13) {
            Iterator<h> it = this.overlayInputs.iterator();
            while (it.hasNext()) {
                it.next().f(z10);
            }
        }
        if (z14) {
            Iterator<h> it2 = this.defaultInputs.iterator();
            while (it2.hasNext()) {
                it2.next().f(z11);
            }
        }
        if (z15) {
            Iterator<h> it3 = this.unspecifiedInputs.iterator();
            while (it3.hasNext()) {
                it3.next().f(z12);
            }
        }
        this.hasEnabledOverlayHandlers = z10;
        this.hasEnabledDefaultHandlers = z11;
        this.hasEnabledAnyHandlers = z12;
        e<?> eVar3 = this.inProgressHandler;
        if (eVar3 == null) {
            eVar3 = k(this, 0, 1, null);
        }
        l(eVar3);
    }

    public final void h(@NotNull e<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (Intrinsics.c(handler, this.inProgressHandler)) {
            int i10 = this.inProgressDirection;
            if (i10 == -1) {
                handler.a();
            } else if (i10 == 1) {
                handler.e();
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
        }
        this.overlayHandlers.remove(handler);
        this.defaultHandlers.remove(handler);
        handler.y(null);
        g();
    }

    public final List<g> i() {
        ArrayList arrayList = new ArrayList();
        Iterator<e<?>> it = this.overlayHandlers.iterator();
        while (it.hasNext()) {
            e<?> next = it.next();
            if (next.m() && !next.i().isEmpty()) {
                arrayList.addAll(next.i());
            }
        }
        Iterator<e<?>> it2 = this.defaultHandlers.iterator();
        while (it2.hasNext()) {
            e<?> next2 = it2.next();
            if (next2.m() && !next2.i().isEmpty()) {
                arrayList.addAll(next2.i());
            }
        }
        return arrayList;
    }

    public final e<?> j(int direction) {
        e<?> eVar;
        e<?> eVar2;
        e<?> eVar3;
        e<?> eVar4 = null;
        if (direction == -1) {
            Iterator<e<?>> it = this.overlayHandlers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    eVar = null;
                    break;
                }
                eVar = it.next();
                if (eVar.m()) {
                    break;
                }
            }
            e<?> eVar5 = eVar;
            if (eVar5 != null) {
                return eVar5;
            }
            Iterator<e<?>> it2 = this.defaultHandlers.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                e<?> next = it2.next();
                if (next.m()) {
                    eVar4 = next;
                    break;
                }
            }
            return eVar4;
        }
        if (direction == 0) {
            Iterator<e<?>> it3 = this.overlayHandlers.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    eVar2 = null;
                    break;
                }
                eVar2 = it3.next();
                e<?> eVar6 = eVar2;
                if (eVar6.m() || eVar6.n()) {
                    break;
                }
            }
            e<?> eVar7 = eVar2;
            if (eVar7 != null) {
                return eVar7;
            }
            for (e<?> eVar8 : this.defaultHandlers) {
                e<?> eVar9 = eVar8;
                if (eVar9.m() || eVar9.n()) {
                    eVar4 = eVar8;
                    break;
                }
            }
            return eVar4;
        }
        if (direction != 1) {
            throw new IllegalStateException(("Unsupported direction: '" + direction + "'.").toString());
        }
        Iterator<e<?>> it4 = this.overlayHandlers.iterator();
        while (true) {
            if (!it4.hasNext()) {
                eVar3 = null;
                break;
            }
            eVar3 = it4.next();
            if (eVar3.n()) {
                break;
            }
        }
        e<?> eVar10 = eVar3;
        if (eVar10 != null) {
            return eVar10;
        }
        Iterator<e<?>> it5 = this.defaultHandlers.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            e<?> next2 = it5.next();
            if (next2.n()) {
                eVar4 = next2;
                break;
            }
        }
        return eVar4;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [o4.g] */
    public final void l(@Nullable e<?> handler) {
        NavigationEventHistory navigationEventHistory;
        e<?> eVar = this.inProgressHandler;
        if (eVar == null) {
            eVar = k(this, 0, 1, null);
        }
        if (Intrinsics.c(eVar, handler)) {
            if (eVar == null) {
                navigationEventHistory = new NavigationEventHistory();
            } else {
                navigationEventHistory = new NavigationEventHistory(eVar.j(), i(), eVar.l());
            }
            if (Intrinsics.c(this._history.getValue(), navigationEventHistory)) {
                return;
            }
            this._history.setValue(navigationEventHistory);
            Iterator<h> it = this.overlayInputs.iterator();
            while (it.hasNext()) {
                it.next().g(navigationEventHistory);
            }
            Iterator<h> it2 = this.defaultInputs.iterator();
            while (it2.hasNext()) {
                it2.next().g(navigationEventHistory);
            }
            Iterator<h> it3 = this.unspecifiedInputs.iterator();
            while (it3.hasNext()) {
                it3.next().g(navigationEventHistory);
            }
        }
    }
}
