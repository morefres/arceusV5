package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import java.nio.MappedByteBuffer;

/* loaded from: classes2.dex */
public interface RemoteModelLoaderHelper {
    @NonNull
    MappedByteBuffer loadModelAtPath(@NonNull String str);
}
