package r9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import k9.a;

/* loaded from: classes.dex */
public interface c extends k9.g<a.d.c> {
    @NonNull
    @ResultIgnorabilityUnspecified
    Task<ModuleInstallResponse> a(@NonNull d dVar);

    @NonNull
    Task<ModuleAvailabilityResponse> n(@NonNull k9.h... hVarArr);
}
