package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.games.Player;
import m9.e;

/* loaded from: classes.dex */
public interface Achievement extends e<Achievement>, Parcelable {
    Uri D2();

    @NonNull
    String F0();

    Uri H();

    String H1();

    int J2();

    String U1();

    long g1();

    @NonNull
    String getDescription();

    @NonNull
    String getName();

    @KeepName
    @Deprecated
    String getRevealedImageUrl();

    int getState();

    int getType();

    @KeepName
    @Deprecated
    String getUnlockedImageUrl();

    long m2();

    int o1();

    @NonNull
    String zza();

    Player zzb();

    float zzc();
}
