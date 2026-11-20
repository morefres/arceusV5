package m6;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import m6.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wu.h0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lwu/h0;", "file", "Lwu/l;", "fileSystem", "", "diskCacheKey", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Lm6/s$a;", "metadata", "Lm6/s;", j6.b.f21518e, "(Lwu/h0;Lwu/l;Ljava/lang/String;Ljava/lang/AutoCloseable;Lm6/s$a;)Lm6/s;", "Lwu/g;", Payload.SOURCE, ve.a.f33391e, "(Lwu/g;Lwu/l;Lm6/s$a;)Lm6/s;", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t {
    @NotNull
    public static final s a(@NotNull wu.g gVar, @NotNull wu.l lVar, @Nullable s.a aVar) {
        return new v(gVar, lVar, aVar);
    }

    @NotNull
    public static final s b(@NotNull h0 h0Var, @NotNull wu.l lVar, @Nullable String str, @Nullable AutoCloseable autoCloseable, @Nullable s.a aVar) {
        return new r(h0Var, lVar, str, autoCloseable, aVar);
    }

    public static /* synthetic */ s c(wu.g gVar, wu.l lVar, s.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        return a(gVar, lVar, aVar);
    }

    public static /* synthetic */ s d(h0 h0Var, wu.l lVar, String str, AutoCloseable autoCloseable, s.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            autoCloseable = null;
        }
        if ((i10 & 16) != 0) {
            aVar = null;
        }
        return b(h0Var, lVar, str, autoCloseable, aVar);
    }
}
