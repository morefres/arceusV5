package e3;

import android.os.Bundle;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u000f"}, d2 = {"Le3/w0;", "", "", ve.a.f33391e, "Ljava/lang/String;", "c", "()Ljava/lang/String;", Payload.TYPE, "Landroid/os/Bundle;", j6.b.f21518e, "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "requestData", "origin", rl.d.f30696a, "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String type;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Bundle requestData;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String origin;

    @Nullable
    /* renamed from: a, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final Bundle getRequestData() {
        return this.requestData;
    }

    @NotNull
    /* renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
