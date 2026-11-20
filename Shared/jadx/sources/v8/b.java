package v8;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import n9.m;
import va.n0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static WeakReference f33350a;

    @NonNull
    public static synchronized b a(@NonNull Context context) {
        synchronized (b.class) {
            m.l(context);
            WeakReference weakReference = f33350a;
            b bVar = weakReference == null ? null : (b) weakReference.get();
            if (bVar != null) {
                return bVar;
            }
            n0 n0Var = new n0(context.getApplicationContext());
            f33350a = new WeakReference(n0Var);
            return n0Var;
        }
    }

    @NonNull
    public abstract Task<Void> b();

    @NonNull
    public abstract Task<Void> c(@NonNull g... gVarArr);
}
