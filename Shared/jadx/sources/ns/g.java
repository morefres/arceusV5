package ns;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import gt.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u000b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u0019\u001a\u00020\u00162\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0016*\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lns/g;", "Lzr/b;", "Lns/o;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lns/h;", "f", "(Ljava/util/List;)Lns/h;", "options", "", "Lkotlin/text/m;", j6.b.f21518e, "(Ljava/util/List;)Ljava/util/Set;", "", "regexPattern", Text.type, "", rl.d.f30696a, "(Ljava/lang/String;Ljava/lang/String;)Z", "e", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Z", "c", "(Lns/h;)Z", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements zr.b, o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f27345a = new g();

    public final Set<kotlin.text.m> b(List<? extends Object> options) {
        List<? extends Object> list = options;
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list, 10));
        for (Object obj : list) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(kotlin.text.m.valueOf((String) obj));
        }
        return CollectionsKt.Q0(arrayList);
    }

    public final boolean c(MatchArguments matchArguments) {
        List<Object> a10 = matchArguments.a();
        return (a10 == null || a10.isEmpty()) ? d(matchArguments.getRegexPattern(), matchArguments.getText()) : e(matchArguments.a(), matchArguments.getRegexPattern(), matchArguments.getText());
    }

    public final boolean d(String regexPattern, String text) {
        return new Regex(regexPattern).f(text);
    }

    public final boolean e(List<? extends Object> options, String regexPattern, String text) {
        Set<kotlin.text.m> b = b(options);
        Regex regex = new Regex(regexPattern, b);
        Set<kotlin.text.m> set = b;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (((kotlin.text.m) it.next()) == kotlin.text.m.f23077d) {
                    List split$default = StringsKt.split$default(text, new String[]{"\n"}, false, 0, 6, null);
                    if ((split$default instanceof Collection) && split$default.isEmpty()) {
                        return true;
                    }
                    Iterator it2 = split$default.iterator();
                    while (it2.hasNext()) {
                        if (!regex.f((String) it2.next())) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return regex.f(text);
    }

    public final MatchArguments f(List<? extends Object> list) {
        Object b;
        try {
            n.Companion companion = gt.n.INSTANCE;
            Object obj = list.get(0);
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = list.get(1);
            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(2);
            Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            b = gt.n.b(new MatchArguments((String) obj, (String) obj2, (List) obj3));
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b = gt.n.b(gt.o.a(th2));
        }
        if (gt.n.e(b) == null) {
            return (MatchArguments) b;
        }
        return null;
    }

    @Override // zr.b
    @Nullable
    public Object l(@Nullable Object expression, @Nullable Object data) {
        MatchArguments f10 = f(rs.a.c(expression));
        if (f10 != null) {
            return Boolean.valueOf(c(f10));
        }
        return null;
    }
}
