package ru;

import java.util.concurrent.Executor;
import ju.l0;
import ju.t1;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pu.f0;
import pu.h0;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0005j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0005j\u0002`\u0013H\u0017¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/b;", "Lju/t1;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "", "parallelism", "", "name", "Lju/l0;", "P", "(ILjava/lang/String;)Lju/l0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/Runnable;", "block", "y", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "I", "close", "toString", "()Ljava/lang/String;", "e", "Lju/l0;", "default", "W", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends t1 implements Executor {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final b f30784d = new b();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final l0 default;

    static {
        int e10;
        k kVar = k.f30800c;
        e10 = h0.e("kotlinx.coroutines.io.parallelism", kotlin.ranges.d.c(64, f0.a()), 0, 0, 12, null);
        default = l0.U(kVar, e10, null, 2, null);
    }

    @Override // ju.l0
    public void I(@NotNull CoroutineContext context, @NotNull Runnable block) {
        default.I(context, block);
    }

    @Override // ju.l0
    @NotNull
    public l0 P(int parallelism, @Nullable String name) {
        return k.f30800c.P(parallelism, name);
    }

    @Override // ju.t1
    @NotNull
    /* renamed from: W */
    public Executor getExecutor() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable command) {
        y(kotlin.coroutines.e.f22936a, command);
    }

    @Override // ju.l0
    @NotNull
    /* renamed from: toString */
    public String getName() {
        return "Dispatchers.IO";
    }

    @Override // ju.l0
    public void y(@NotNull CoroutineContext context, @NotNull Runnable block) {
        default.y(context, block);
    }
}
