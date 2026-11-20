package android.view;

import androidx.annotation.NonNull;

@Deprecated
/* loaded from: classes4.dex */
public interface LifecycleRegistryOwner extends LifecycleOwner {
    @Override // android.view.LifecycleOwner
    @NonNull
    LifecycleRegistry getLifecycle();
}
