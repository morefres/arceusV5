package d6;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x5.w;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH&¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR0\u0010 \u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u001dj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001bR$\u0010&\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0010\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Ld6/h;", "T", "", "Landroid/content/Context;", "context", "Lh6/b;", "taskExecutor", "<init>", "(Landroid/content/Context;Lh6/b;)V", "Lb6/a;", "listener", "", "c", "(Lb6/a;)V", "g", "f", "()Ljava/lang/Object;", "i", "()V", "j", ve.a.f33391e, "Lh6/b;", j6.b.f21518e, "Landroid/content/Context;", rl.d.f30696a, "()Landroid/content/Context;", "appContext", "Ljava/lang/Object;", "lock", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "listeners", "e", "currentState", "newState", "h", "(Ljava/lang/Object;)V", "state", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class h<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h6.b taskExecutor;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context appContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object lock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LinkedHashSet<b6.a<T>> listeners;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public T currentState;

    public h(@NotNull Context context, @NotNull h6.b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.taskExecutor = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.appContext = applicationContext;
        this.lock = new Object();
        this.listeners = new LinkedHashSet<>();
    }

    public static final void b(List list, h hVar) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((b6.a) it.next()).a(hVar.currentState);
        }
    }

    public final void c(@NotNull b6.a<T> listener) {
        String str;
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.lock) {
            try {
                if (this.listeners.add(listener)) {
                    if (this.listeners.size() == 1) {
                        this.currentState = f();
                        w e10 = w.e();
                        str = i.f14403a;
                        e10.a(str, getClass().getSimpleName() + ": initial state = " + this.currentState);
                        i();
                    }
                    listener.a(this.currentState);
                }
                Unit unit = Unit.f22894a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    /* renamed from: d, reason: from getter */
    public final Context getAppContext() {
        return this.appContext;
    }

    public final T e() {
        T t8 = this.currentState;
        return t8 == null ? f() : t8;
    }

    public abstract T f();

    public final void g(@NotNull b6.a<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.lock) {
            try {
                if (this.listeners.remove(listener) && this.listeners.isEmpty()) {
                    j();
                }
                Unit unit = Unit.f22894a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(T t8) {
        synchronized (this.lock) {
            T t10 = this.currentState;
            if (t10 == null || !Intrinsics.c(t10, t8)) {
                this.currentState = t8;
                final List M0 = CollectionsKt.M0(this.listeners);
                this.taskExecutor.a().execute(new Runnable() { // from class: d6.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b(M0, this);
                    }
                });
                Unit unit = Unit.f22894a;
            }
        }
    }

    public abstract void i();

    public abstract void j();
}
