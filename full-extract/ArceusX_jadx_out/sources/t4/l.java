package t4;

import android.adservices.topics.GetTopicsRequest;
import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lt4/l;", "Lt4/s;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lt4/b;", "request", "Landroid/adservices/topics/GetTopicsRequest;", "c", "(Lt4/b;)Landroid/adservices/topics/GetTopicsRequest;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class l extends s {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(@org.jetbrains.annotations.NotNull android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.adservices.topics.TopicsManager r2 = android.adservices.topics.TopicsManager.get(r2)
            java.lang.String r0 = "get(context)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.l.<init>(android.content.Context):void");
    }

    @Override // t4.s
    @NotNull
    public GetTopicsRequest c(@NotNull b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return d.f31973a.a(request);
    }
}
