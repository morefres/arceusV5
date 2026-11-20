package jp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ljp/m;", "", "<init>", "()V", "", "password", j6.b.f21518e, "(Ljava/lang/String;)Ljava/lang/String;", "", ve.a.f33391e, "(Ljava/lang/String;)Z", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f22012a = new m();

    public final boolean a(@Nullable String password) {
        return password != null && Intrinsics.c(b(password), "9010");
    }

    @Nullable
    public final String b(@NotNull String password) {
        Intrinsics.checkNotNullParameter(password, "password");
        StringBuilder sb2 = new StringBuilder();
        int length = password.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = password.charAt(i10);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        if (sb3.length() < 4) {
            return null;
        }
        return c0.C1(sb3, 4);
    }
}
