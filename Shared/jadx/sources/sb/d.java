package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class d extends IllegalStateException {
    public d(String str, Throwable th2) {
        super(str, th2);
    }

    @NonNull
    public static IllegalStateException a(@NonNull Task<?> task) {
        if (!task.m()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception exception = task.getException();
        return new d("Complete with: ".concat(exception != null ? "failure" : task.isSuccessful() ? "result ".concat(String.valueOf(task.getResult())) : task.l() ? "cancellation" : "unknown issue"), exception);
    }
}
