package tk;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f32270a;
    public final Executor b;

    public static class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public Handler f32271a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.f32271a.post(runnable);
        }
    }

    public e(Executor executor, Executor executor2) {
        this.f32270a = executor;
        this.b = executor2;
    }

    @Override // tk.c
    public Executor a() {
        return this.b;
    }

    @Override // tk.c
    public Executor b() {
        return this.f32270a;
    }
}
