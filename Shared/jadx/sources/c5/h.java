package c5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.u;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aA\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e*\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lx4/c;", "", "fromVersion", "toVersion", "", rl.d.f30696a, "(Lx4/c;II)Z", "Lx4/u$e;", "startVersion", "endVersion", ve.a.f33391e, "(Lx4/u$e;II)Z", "start", "end", "", "La5/b;", j6.b.f21518e, "(Lx4/u$e;II)Ljava/util/List;", "", "result", "upgrade", "c", "(Lx4/u$e;Ljava/util/List;ZII)Ljava/util/List;", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {
    public static final boolean a(@NotNull u.e eVar, int i10, int i11) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Map<Integer, Map<Integer, a5.b>> e10 = eVar.e();
        if (!e10.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        Map<Integer, a5.b> map = e10.get(Integer.valueOf(i10));
        if (map == null) {
            map = k0.j();
        }
        return map.containsKey(Integer.valueOf(i11));
    }

    @Nullable
    public static final List<a5.b> b(@NotNull u.e eVar, int i10, int i11) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (i10 == i11) {
            return kotlin.collections.p.k();
        }
        return c(eVar, new ArrayList(), i11 > i10, i10, i11);
    }

    public static final List<a5.b> c(u.e eVar, List<a5.b> list, boolean z10, int i10, int i11) {
        int i12;
        boolean z11;
        while (true) {
            if (z10) {
                if (i10 >= i11) {
                    return list;
                }
            } else if (i10 <= i11) {
                return list;
            }
            Pair<Map<Integer, a5.b>, Iterable<Integer>> f10 = z10 ? eVar.f(i10) : eVar.g(i10);
            if (f10 == null) {
                return null;
            }
            Map<Integer, a5.b> a10 = f10.a();
            Iterator<Integer> it = f10.b().iterator();
            while (it.hasNext()) {
                i12 = it.next().intValue();
                if (!z10) {
                    if (i11 <= i12 && i12 < i10) {
                        a5.b bVar = a10.get(Integer.valueOf(i12));
                        Intrinsics.checkNotNull(bVar);
                        list.add(bVar);
                        z11 = true;
                        break;
                    }
                } else if (i10 + 1 <= i12 && i12 <= i11) {
                    a5.b bVar2 = a10.get(Integer.valueOf(i12));
                    Intrinsics.checkNotNull(bVar2);
                    list.add(bVar2);
                    z11 = true;
                    break;
                }
            }
            i12 = i10;
            z11 = false;
            if (!z11) {
                return null;
            }
            i10 = i12;
        }
    }

    public static final boolean d(@NotNull x4.c cVar, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (i10 > i11 && cVar.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        Set<Integer> c10 = cVar.c();
        return cVar.requireMigration && (c10 == null || !c10.contains(Integer.valueOf(i10)));
    }
}
