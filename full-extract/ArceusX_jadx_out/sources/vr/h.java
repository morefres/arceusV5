package vr;

import gt.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vr.i;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\n2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00112\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lvr/h;", "Lzr/b;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lvr/i;", "c", "(Ljava/lang/String;)Lvr/i;", "", "sortingMode", j6.b.f21518e, "(Ljava/util/List;Lvr/i;)Ljava/lang/Object;", "Lkotlin/Function0;", "ascSort", "descSort", ve.a.f33391e, "(Lvr/i;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements zr.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f33531a = new h();

    public final Object a(i sortingMode, Function0<? extends Object> ascSort, Function0<? extends Object> descSort) {
        if (Intrinsics.c(sortingMode, i.b.f33533a)) {
            return descSort.invoke();
        }
        if (Intrinsics.c(sortingMode, i.a.f33532a)) {
            return ascSort.invoke();
        }
        if (Intrinsics.c(sortingMode, i.c.f33534a)) {
            return null;
        }
        throw new l();
    }

    public final Object b(List<? extends Object> list, i iVar) {
        Integer num;
        Integer num2;
        Integer num3;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
            num = Integer.valueOf(arrayList.size());
        } else {
            num = null;
        }
        if (Intrinsics.c(num, list != null ? Integer.valueOf(list.size()) : null)) {
            if (!(list instanceof List)) {
                list = null;
            }
            if (list != null) {
                return a(iVar, new f(list), new g(list));
            }
            return null;
        }
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof Boolean) {
                    arrayList2.add(obj2);
                }
            }
            num2 = Integer.valueOf(arrayList2.size());
        } else {
            num2 = null;
        }
        if (Intrinsics.c(num2, list != null ? Integer.valueOf(list.size()) : null)) {
            if (!(list instanceof List)) {
                list = null;
            }
            if (list != null) {
                return a(iVar, new f(list), new g(list));
            }
            return null;
        }
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof Number) {
                    arrayList3.add(obj3);
                }
            }
            num3 = Integer.valueOf(arrayList3.size());
        } else {
            num3 = null;
        }
        if (!Intrinsics.c(num3, list != null ? Integer.valueOf(list.size()) : null)) {
            return null;
        }
        List a02 = CollectionsKt.a0(rs.a.b(list));
        return a(iVar, new f(a02), new g(a02));
    }

    public final i c(String str) {
        return Intrinsics.c(str, "desc") ? i.b.f33533a : Intrinsics.c(str, "asc") ? i.a.f33532a : i.c.f33534a;
    }

    @Override // zr.b
    @Nullable
    public Object l(@Nullable Object expression, @Nullable Object data) {
        List<Object> c10 = rs.a.c(expression);
        Object firstOrNull = CollectionsKt.firstOrNull(c10);
        List<? extends Object> list = firstOrNull instanceof List ? (List) firstOrNull : null;
        if (list == null) {
            return null;
        }
        h hVar = f33531a;
        Object b = rs.c.b(c10);
        return hVar.b(list, hVar.c(b instanceof String ? (String) b : null));
    }
}
