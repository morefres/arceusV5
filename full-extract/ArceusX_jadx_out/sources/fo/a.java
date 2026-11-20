package fo;

import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse;
import iv.x;
import kotlin.Metadata;
import lv.f;
import lv.i;
import lv.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lfo/a;", "", "", "sessionToken", "", "gateId", "Liv/x;", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", ve.a.f33391e, "(Ljava/lang/String;[Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "feature-flag_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {
    @f("/api/internal/verify/v1/feature-flags")
    @Nullable
    Object a(@i("Authorization") @NotNull String str, @t("gates[]") @NotNull String[] strArr, @NotNull mt.b<? super x<FeatureFlagResponse>> bVar);
}
