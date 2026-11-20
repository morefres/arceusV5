package xo;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;
import k6.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u001c\u0010\u0019\u001a\n \u0017*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001c"}, d2 = {"Lxo/n;", "", "Landroid/app/Activity;", "activity", "", "locale", "Lju/p0;", "lifecycleCoroutineScope", "<init>", "(Landroid/app/Activity;Ljava/lang/String;Lju/p0;)V", "Landroid/content/Context;", j6.b.f21518e, "()Landroid/content/Context;", "Landroid/app/Application;", ve.a.f33391e, "()Landroid/app/Application;", "context", "Lk6/s;", "c", "(Landroid/content/Context;)Lk6/s;", rl.d.f30696a, "()Lju/p0;", "Lju/p0;", "kotlin.jvm.PlatformType", "Landroid/app/Application;", "application", "Landroid/content/Context;", "localeOverrideContext", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ju.p0 lifecycleCoroutineScope;

    /* renamed from: b, reason: from kotlin metadata */
    public final Application application;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Context localeOverrideContext;

    public n(@NotNull Activity activity, @Nullable String str, @NotNull ju.p0 lifecycleCoroutineScope) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "lifecycleCoroutineScope");
        this.lifecycleCoroutineScope = lifecycleCoroutineScope;
        Application application = activity.getApplication();
        this.application = application;
        Context context = null;
        if (str != null) {
            String str2 = !StringsKt.p0(str) ? str : null;
            if (str2 != null) {
                Configuration configuration = new Configuration(application.getResources().getConfiguration());
                configuration.setLocale(Locale.forLanguageTag(kotlin.text.x.N(str2, "_", "-", false, 4, null)));
                context = application.createConfigurationContext(configuration);
            }
        }
        this.localeOverrideContext = context;
    }

    @NotNull
    public final Application a() {
        Application application = this.application;
        Intrinsics.checkNotNullExpressionValue(application, "application");
        return application;
    }

    @NotNull
    public final Context b() {
        Context context = this.localeOverrideContext;
        if (context != null) {
            return context;
        }
        Context applicationContext = this.application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    @NotNull
    public final k6.s c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return x6.i.b(new s.a(context), true).i(null).d();
    }

    @NotNull
    /* renamed from: d, reason: from getter */
    public final ju.p0 getLifecycleCoroutineScope() {
        return this.lifecycleCoroutineScope;
    }
}
