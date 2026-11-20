package v9;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import db.p;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f33354a;

    public a(@NonNull Looper looper) {
        this.f33354a = new p(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f33354a.post(runnable);
    }
}
