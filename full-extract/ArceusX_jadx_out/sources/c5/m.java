package c5;

import c5.o;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.collections.k0;
import kotlin.collections.p0;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000`\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u000e\u001a)\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!¨\u0006#"}, d2 = {"", Payload.TYPE, "", ve.a.f33391e, "(Ljava/lang/String;)I", "Lf5/b;", "connection", "tableName", "Lc5/o;", "g", "(Lf5/b;Ljava/lang/String;)Lc5/o;", "", "Lc5/o$c;", rl.d.f30696a, "(Lf5/b;Ljava/lang/String;)Ljava/util/Set;", "Lf5/d;", "stmt", "", "Lc5/e;", "c", "(Lf5/d;)Ljava/util/List;", "", "Lc5/o$a;", j6.b.f21518e, "(Lf5/b;Ljava/lang/String;)Ljava/util/Map;", "Lc5/o$d;", "f", "name", "", "unique", "e", "(Lf5/b;Ljava/lang/String;Z)Lc5/o$d;", "", "[Ljava/lang/String;", "FTS_OPTIONS", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String[] f4745a = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return kt.a.a((Integer) ((Map.Entry) t8).getKey(), (Integer) ((Map.Entry) t10).getKey());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return kt.a.a((Integer) ((Map.Entry) t8).getKey(), (Integer) ((Map.Entry) t10).getKey());
        }
    }

    public static final int a(@Nullable String str) {
        if (str == null) {
            return 5;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (StringsKt.a0(upperCase, "INT", false, 2, null)) {
            return 3;
        }
        if (StringsKt.a0(upperCase, "CHAR", false, 2, null) || StringsKt.a0(upperCase, "CLOB", false, 2, null) || StringsKt.a0(upperCase, "TEXT", false, 2, null)) {
            return 2;
        }
        if (StringsKt.a0(upperCase, "BLOB", false, 2, null)) {
            return 5;
        }
        return (StringsKt.a0(upperCase, "REAL", false, 2, null) || StringsKt.a0(upperCase, "FLOA", false, 2, null) || StringsKt.a0(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
    }

    public static final Map<String, o.a> b(f5.b bVar, String str) {
        f5.d r32 = bVar.r3("PRAGMA table_info(`" + str + "`)");
        try {
            if (!r32.i3()) {
                Map<String, o.a> j10 = k0.j();
                wt.a.a(r32, null);
                return j10;
            }
            int a10 = j.a(r32, "name");
            int a11 = j.a(r32, Payload.TYPE);
            int a12 = j.a(r32, "notnull");
            int a13 = j.a(r32, "pk");
            int a14 = j.a(r32, "dflt_value");
            Map d10 = j0.d();
            do {
                String F2 = r32.F2(a10);
                d10.put(F2, new o.a(F2, r32.F2(a11), r32.getLong(a12) != 0, (int) r32.getLong(a13), r32.isNull(a14) ? null : r32.F2(a14), 2));
            } while (r32.i3());
            Map<String, o.a> c10 = j0.c(d10);
            wt.a.a(r32, null);
            return c10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                wt.a.a(r32, th2);
                throw th3;
            }
        }
    }

    public static final List<e> c(f5.d dVar) {
        int a10 = j.a(dVar, "id");
        int a11 = j.a(dVar, "seq");
        int a12 = j.a(dVar, "from");
        int a13 = j.a(dVar, "to");
        List c10 = kotlin.collections.o.c();
        while (dVar.i3()) {
            c10.add(new e((int) dVar.getLong(a10), (int) dVar.getLong(a11), dVar.F2(a12), dVar.F2(a13)));
        }
        return CollectionsKt.D0(kotlin.collections.o.a(c10));
    }

    public static final Set<o.c> d(f5.b bVar, String str) {
        f5.d r32 = bVar.r3("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int a10 = j.a(r32, "id");
            int a11 = j.a(r32, "seq");
            int a12 = j.a(r32, "table");
            int a13 = j.a(r32, "on_delete");
            int a14 = j.a(r32, "on_update");
            List<e> c10 = c(r32);
            r32.reset();
            Set b10 = p0.b();
            while (r32.i3()) {
                if (r32.getLong(a11) == 0) {
                    int i10 = (int) r32.getLong(a10);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : c10) {
                        if (((e) obj).getId() == i10) {
                            arrayList3.add(obj);
                        }
                    }
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        e eVar = (e) obj2;
                        arrayList.add(eVar.getFrom());
                        arrayList2.add(eVar.getTo());
                    }
                    b10.add(new o.c(r32.F2(a12), r32.F2(a13), r32.F2(a14), arrayList, arrayList2));
                }
            }
            Set<o.c> a15 = p0.a(b10);
            wt.a.a(r32, null);
            return a15;
        } finally {
        }
    }

    public static final o.d e(f5.b bVar, String str, boolean z10) {
        f5.d r32 = bVar.r3("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int a10 = j.a(r32, "seqno");
            int a11 = j.a(r32, "cid");
            int a12 = j.a(r32, "name");
            int a13 = j.a(r32, "desc");
            if (a10 != -1 && a11 != -1 && a12 != -1 && a13 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (r32.i3()) {
                    if (((int) r32.getLong(a11)) >= 0) {
                        int i10 = (int) r32.getLong(a10);
                        String F2 = r32.F2(a12);
                        String str2 = r32.getLong(a13) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i10), F2);
                        linkedHashMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                List F0 = CollectionsKt.F0(linkedHashMap.entrySet(), new a());
                ArrayList arrayList = new ArrayList(q.u(F0, 10));
                Iterator it = F0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List M0 = CollectionsKt.M0(arrayList);
                List F02 = CollectionsKt.F0(linkedHashMap2.entrySet(), new b());
                ArrayList arrayList2 = new ArrayList(q.u(F02, 10));
                Iterator it2 = F02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                o.d dVar = new o.d(str, z10, M0, CollectionsKt.M0(arrayList2));
                wt.a.a(r32, null);
                return dVar;
            }
            wt.a.a(r32, null);
            return null;
        } finally {
        }
    }

    public static final Set<o.d> f(f5.b bVar, String str) {
        f5.d r32 = bVar.r3("PRAGMA index_list(`" + str + "`)");
        try {
            int a10 = j.a(r32, "name");
            int a11 = j.a(r32, "origin");
            int a12 = j.a(r32, "unique");
            if (a10 != -1 && a11 != -1 && a12 != -1) {
                Set b10 = p0.b();
                while (r32.i3()) {
                    if (Intrinsics.c("c", r32.F2(a11))) {
                        o.d e10 = e(bVar, r32.F2(a10), r32.getLong(a12) == 1);
                        if (e10 == null) {
                            wt.a.a(r32, null);
                            return null;
                        }
                        b10.add(e10);
                    }
                }
                Set<o.d> a13 = p0.a(b10);
                wt.a.a(r32, null);
                return a13;
            }
            wt.a.a(r32, null);
            return null;
        } finally {
        }
    }

    @NotNull
    public static final o g(@NotNull f5.b connection, @NotNull String tableName) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        return new o(tableName, b(connection, tableName), d(connection, tableName), f(connection, tableName));
    }
}
