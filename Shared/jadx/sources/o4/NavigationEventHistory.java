package o4;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0010¢\u0006\u0004\b\u0007\u0010\tB1\b\u0011\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013¨\u0006\u001e"}, d2 = {"Lo4/f;", "", "", "Lo4/g;", "mergedHistory", "", "currentIndex", "<init>", "(Ljava/util/List;I)V", "()V", "currentInfo", "backInfo", "forwardInfo", "(Lo4/g;Ljava/util/List;Ljava/util/List;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", ve.a.f33391e, "Ljava/util/List;", "getMergedHistory", "()Ljava/util/List;", j6.b.f21518e, "I", "getCurrentIndex", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o4.f, reason: from toString */
/* loaded from: classes.dex */
public final class NavigationEventHistory {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<g> mergedHistory;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final int currentIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public NavigationEventHistory(List<? extends g> list, int i10) {
        this.mergedHistory = list;
        this.currentIndex = i10;
        if (list.isEmpty() && i10 == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i10 >= 0 && i10 < size) {
                return;
            }
        }
        throw new IllegalArgumentException(("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '" + i10 + "', bounds = '" + kotlin.collections.p.l(list) + "'.").toString());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || NavigationEventHistory.class != other.getClass()) {
            return false;
        }
        NavigationEventHistory navigationEventHistory = (NavigationEventHistory) other;
        return this.currentIndex == navigationEventHistory.currentIndex && Intrinsics.c(this.mergedHistory, navigationEventHistory.mergedHistory);
    }

    public int hashCode() {
        return (this.currentIndex * 31) + this.mergedHistory.hashCode();
    }

    @NotNull
    public String toString() {
        return "NavigationEventHistory(currentIndex=" + this.currentIndex + ", mergedHistory=" + this.mergedHistory + ')';
    }

    public NavigationEventHistory() {
        this(kotlin.collections.p.k(), -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NavigationEventHistory(@org.jetbrains.annotations.NotNull o4.g r4, @org.jetbrains.annotations.NotNull java.util.List<? extends o4.g> r5, @org.jetbrains.annotations.NotNull java.util.List<? extends o4.g> r6) {
        /*
            r3 = this;
            java.lang.String r0 = "currentInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "backInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "forwardInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.List r0 = kotlin.collections.o.c()
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            r2 = r5
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.collections.u.z(r1, r2)
            r1.add(r4)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            kotlin.collections.u.z(r1, r6)
            java.util.List r4 = kotlin.collections.o.a(r0)
            int r5 = r5.size()
            r3.<init>(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.NavigationEventHistory.<init>(o4.g, java.util.List, java.util.List):void");
    }
}
