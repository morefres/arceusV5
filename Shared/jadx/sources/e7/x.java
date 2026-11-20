package e7;

import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Le7/x;", "", "<init>", "()V", "", "url", j6.b.f21518e, "(Ljava/lang/String;)Ljava/lang/String;", "extension", ve.a.f33391e, "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x f15736a = new x();

    @Nullable
    public final String a(@NotNull String extension) {
        Map map;
        if (StringsKt.p0(extension)) {
            return null;
        }
        String lowerCase = extension.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        map = y.f15737a;
        String str = (String) map.get(lowerCase);
        return str == null ? z.a(lowerCase) : str;
    }

    @Nullable
    public final String b(@NotNull String url) {
        if (StringsKt.p0(url)) {
            return null;
        }
        return a(StringsKt.c1(StringsKt.e1(StringsKt.m1(StringsKt.m1(url, '#', null, 2, null), '?', null, 2, null), '/', null, 2, null), '.', ""));
    }
}
