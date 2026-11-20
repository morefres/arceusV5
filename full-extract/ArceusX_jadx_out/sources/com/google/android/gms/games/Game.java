package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import m9.e;

/* loaded from: classes.dex */
public interface Game extends e<Game>, Parcelable {
    @NonNull
    Uri B();

    @NonNull
    String B0();

    @NonNull
    Uri C1();

    boolean D0();

    int N0();

    @NonNull
    String O0();

    @NonNull
    String O1();

    @NonNull
    String Y();

    @Deprecated
    boolean c();

    int d2();

    @NonNull
    String g0();

    @NonNull
    String getDescription();

    @NonNull
    @KeepName
    @Deprecated
    String getFeaturedImageUrl();

    @NonNull
    @KeepName
    @Deprecated
    String getHiResImageUrl();

    @NonNull
    @KeepName
    @Deprecated
    String getIconImageUrl();

    @NonNull
    Uri h();

    @NonNull
    String l();

    boolean s1();

    boolean zza();

    boolean zzb();

    boolean zzc();

    boolean zzd();

    boolean zze();

    @NonNull
    String zzf();

    @Deprecated
    boolean zzh();
}
