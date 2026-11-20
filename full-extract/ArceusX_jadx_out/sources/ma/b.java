package ma;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.games.Player;
import m9.e;

/* loaded from: classes.dex */
public interface b extends e<b> {
    Player L();

    @NonNull
    String O2();

    @NonNull
    Uri X2();

    @NonNull
    String a0();

    @NonNull
    Uri e3();

    long f2();

    @NonNull
    @KeepName
    @Deprecated
    String getScoreHolderHiResImageUrl();

    @NonNull
    @KeepName
    @Deprecated
    String getScoreHolderIconImageUrl();

    @NonNull
    String h1();

    long j2();

    long k2();

    @NonNull
    String w1();
}
