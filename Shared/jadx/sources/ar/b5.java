package ar;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uq.c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "context", "", "fontName", "Landroid/graphics/Typeface;", ve.a.f33391e, "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b5 {
    @Nullable
    public static final Typeface a(@NotNull Context context, @NotNull String fontName) {
        Typeface typeface;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fontName, "fontName");
        String str = fontName + ".ttf";
        c.Companion companion = uq.c.INSTANCE;
        if (companion.a().containsKey(str)) {
            typeface = companion.a().get(str);
        } else {
            String[] list = context.getAssets().list("fonts");
            if (list == null || !kotlin.collections.m.G(list, str)) {
                Integer g10 = hq.z.g(context, fontName, hq.a0.f19547a);
                if (g10 != null) {
                    typeface = n2.h.h(context, g10.intValue());
                }
                typeface = null;
            } else {
                typeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + str);
            }
        }
        uq.c.INSTANCE.a().put(str, typeface);
        return typeface;
    }
}
