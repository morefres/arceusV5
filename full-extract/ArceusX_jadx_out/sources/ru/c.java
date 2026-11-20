package ru;

import ju.l0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pu.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/c;", "Lru/f;", "<init>", "()V", "", "parallelism", "", "name", "Lju/l0;", "P", "(ILjava/lang/String;)Lju/l0;", "", "close", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c extends f {

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public static final c f30786i = new c();

    public c() {
        super(j.f30796c, j.f30797d, j.f30798e, j.f30795a);
    }

    @Override // ju.l0
    @NotNull
    public l0 P(int parallelism, @Nullable String name) {
        m.a(parallelism);
        return parallelism >= j.f30796c ? m.b(this, name) : super.P(parallelism, name);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // ju.l0
    @NotNull
    /* renamed from: toString */
    public String getName() {
        return "Dispatchers.Default";
    }
}
