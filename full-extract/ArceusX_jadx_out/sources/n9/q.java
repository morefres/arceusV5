package n9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", explanation = "Use canonical fakes instead.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public interface q extends k9.g<r> {
    @NonNull
    @ResultIgnorabilityUnspecified
    Task<Void> c(@NonNull TelemetryData telemetryData);
}
