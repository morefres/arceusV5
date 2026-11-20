package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.games.Player;
import m9.e;

/* loaded from: classes.dex */
public interface Event extends e<Event>, Parcelable {
    @NonNull
    Player M1();

    @NonNull
    String T0();

    @NonNull
    String getDescription();

    @NonNull
    @KeepName
    @Deprecated
    String getIconImageUrl();

    @NonNull
    String getName();

    long getValue();

    @NonNull
    Uri h();

    boolean isVisible();

    @NonNull
    String k3();
}
