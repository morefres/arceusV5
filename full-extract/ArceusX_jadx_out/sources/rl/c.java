package rl;

import gt.n;
import gt.o;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H'¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H&¢\u0006\u0004\b\u001a\u0010\u0019J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJX\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022(\u0010#\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001c0\"\u0012\u0006\u0012\u0004\u0018\u00010\u00010!H\u0096@¢\u0006\u0004\b$\u0010%J \u0010&\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*¨\u0006+À\u0006\u0003"}, d2 = {"Lrl/c;", "", "", "experimentVariant", "Ljava/util/function/BiConsumer;", "", "callback", "", "i", "(Ljava/lang/String;Ljava/util/function/BiConsumer;)V", "adTracingId", "adUnitId", "Lrl/j;", "listener", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl/j;)V", "Lorg/json/JSONObject;", "params", "Lrl/f;", "g", "(Ljava/lang/String;Lorg/json/JSONObject;Lrl/f;)V", "Lrl/k;", j6.b.f21518e, "(Ljava/lang/String;Lrl/k;)V", d.f30696a, "()V", "destroy", "initializeAdUnitId", "Lgt/n;", "k", "(Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "Lrl/a;", "adFormat", "Lkotlin/Function2;", "Lmt/b;", "serveAd", "c", "(Lrl/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;", ve.a.f33391e, "(Lrl/a;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "method", "l", "(Ljava/lang/String;)Ljava/lang/Object;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface c {
    static /* synthetic */ Object e(c cVar, a aVar, String str, mt.b<? super Unit> bVar) {
        cVar.l("destroyAd");
        return Unit.f22894a;
    }

    static /* synthetic */ Object h(c cVar, a aVar, String str, String str2, Function2<? super String, ? super mt.b<? super n<String>>, ? extends Object> function2, mt.b<? super n<Unit>> bVar) {
        return cVar.l("getQueryInfoAndLoadAd");
    }

    static /* synthetic */ Object j(c cVar, String str, mt.b<? super n<Unit>> bVar) {
        return cVar.l("initializeSDK");
    }

    @Nullable
    default Object a(@NotNull a aVar, @NotNull String str, @NotNull mt.b<? super Unit> bVar) {
        return e(this, aVar, str, bVar);
    }

    void b(@NotNull String adTracingId, @NotNull k listener);

    @Nullable
    default Object c(@NotNull a aVar, @NotNull String str, @NotNull String str2, @NotNull Function2<? super String, ? super mt.b<? super n<String>>, ? extends Object> function2, @NotNull mt.b<? super n<Unit>> bVar) {
        return h(this, aVar, str, str2, function2, bVar);
    }

    void d();

    void destroy();

    void f(@NotNull String adTracingId, @NotNull String adUnitId, @NotNull String experimentVariant, @NotNull j listener);

    void g(@NotNull String adTracingId, @NotNull JSONObject params, @NotNull f listener);

    void i(@NotNull String experimentVariant, @NotNull BiConsumer<Boolean, String> callback);

    @Nullable
    default Object k(@NotNull String str, @NotNull mt.b<? super n<Unit>> bVar) {
        return j(this, str, bVar);
    }

    default Object l(String method) {
        n.Companion companion = n.INSTANCE;
        return n.b(o.a(new UnsupportedOperationException(method + " not supported")));
    }
}
