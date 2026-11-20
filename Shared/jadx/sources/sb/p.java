package sb;

import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p<T> implements q<T> {

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f31015a = new CountDownLatch(1);

    public /* synthetic */ p(o oVar) {
    }

    @Override // sb.e
    public final void a() {
        this.f31015a.countDown();
    }

    public final void b() {
        this.f31015a.await();
    }

    public final boolean c(long j10, TimeUnit timeUnit) {
        return this.f31015a.await(j10, timeUnit);
    }

    @Override // sb.f
    public final void onFailure(@NonNull Exception exc) {
        this.f31015a.countDown();
    }

    @Override // sb.g
    public final void onSuccess(T t8) {
        this.f31015a.countDown();
    }
}
