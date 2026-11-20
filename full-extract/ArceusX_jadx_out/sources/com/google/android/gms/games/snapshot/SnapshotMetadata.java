package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import m9.e;

/* loaded from: classes.dex */
public interface SnapshotMetadata extends e<SnapshotMetadata>, Parcelable {
    @NonNull
    String B1();

    String C2();

    Uri Q0();

    boolean Q2();

    long T1();

    @NonNull
    Player X0();

    long e0();

    @KeepName
    @Deprecated
    String getCoverImageUrl();

    @NonNull
    String getDescription();

    float j3();

    @NonNull
    String q3();

    @NonNull
    Game u3();

    long x0();

    @NonNull
    String zza();
}
