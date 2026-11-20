package x4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"", "", "migrationStartAndEndVersions", "migrationsNotRequiredFrom", "", j6.b.f21518e, "(Ljava/util/Set;Ljava/util/Set;)V", "Lx4/u;", "Lx4/c;", "configuration", ve.a.f33391e, "(Lx4/u;Lx4/c;)V", "c", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/RoomDatabaseKt")
/* loaded from: classes.dex */
public final /* synthetic */ class w {
    public static final void a(@NotNull u uVar, @NotNull c configuration) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<gu.c<? extends a5.a>> w5 = uVar.w();
        int size = configuration.autoMigrationSpecs.size();
        boolean[] zArr = new boolean[size];
        Iterator<gu.c<? extends a5.a>> it = w5.iterator();
        while (true) {
            int i10 = -1;
            if (!it.hasNext()) {
                int size2 = configuration.autoMigrationSpecs.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i11 = size2 - 1;
                        if (size2 >= size || !zArr[size2]) {
                            break;
                        } else if (i11 < 0) {
                            break;
                        } else {
                            size2 = i11;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                }
                for (a5.b bVar : uVar.j(linkedHashMap)) {
                    if (!configuration.migrationContainer.c(bVar.startVersion, bVar.endVersion)) {
                        configuration.migrationContainer.a(bVar);
                    }
                }
                return;
            }
            gu.c<? extends a5.a> next = it.next();
            int size3 = configuration.autoMigrationSpecs.size() - 1;
            if (size3 >= 0) {
                while (true) {
                    int i12 = size3 - 1;
                    if (next.b(configuration.autoMigrationSpecs.get(size3))) {
                        zArr[size3] = true;
                        i10 = size3;
                        break;
                    } else if (i12 < 0) {
                        break;
                    } else {
                        size3 = i12;
                    }
                }
            }
            if (i10 < 0) {
                throw new IllegalArgumentException(("A required auto migration spec (" + next.f() + ") is missing in the database configuration.").toString());
            }
            linkedHashMap.put(next, configuration.autoMigrationSpecs.get(i10));
        }
    }

    public static final void b(@NotNull Set<Integer> migrationStartAndEndVersions, @NotNull Set<Integer> migrationsNotRequiredFrom) {
        Intrinsics.checkNotNullParameter(migrationStartAndEndVersions, "migrationStartAndEndVersions");
        Intrinsics.checkNotNullParameter(migrationsNotRequiredFrom, "migrationsNotRequiredFrom");
        if (migrationStartAndEndVersions.isEmpty()) {
            return;
        }
        Iterator<Integer> it = migrationStartAndEndVersions.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (migrationsNotRequiredFrom.contains(Integer.valueOf(intValue))) {
                throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: " + intValue).toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c A[LOOP:1: B:5:0x003b->B:17:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@org.jetbrains.annotations.NotNull x4.u r9, @org.jetbrains.annotations.NotNull x4.c r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.Map r0 = r9.z()
            java.util.List<java.lang.Object> r1 = r10.typeConverters
            int r1 = r1.size()
            boolean[] r1 = new boolean[r1]
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r2 = r0.hasNext()
            r3 = -1
            if (r2 == 0) goto La6
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            gu.c r4 = (gu.c) r4
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L3b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L1e
            java.lang.Object r5 = r2.next()
            gu.c r5 = (gu.c) r5
            java.util.List<java.lang.Object> r6 = r10.typeConverters
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            int r6 = r6 + r3
            if (r6 < 0) goto L69
        L52:
            int r7 = r6 + (-1)
            java.util.List<java.lang.Object> r8 = r10.typeConverters
            java.lang.Object r8 = r8.get(r6)
            boolean r8 = r5.b(r8)
            if (r8 == 0) goto L64
            r7 = 1
            r1[r6] = r7
            goto L6a
        L64:
            if (r7 >= 0) goto L67
            goto L69
        L67:
            r6 = r7
            goto L52
        L69:
            r6 = r3
        L6a:
            if (r6 < 0) goto L76
            java.util.List<java.lang.Object> r7 = r10.typeConverters
            java.lang.Object r6 = r7.get(r6)
            r9.f(r5, r6)
            goto L3b
        L76:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "A required type converter ("
            r9.append(r10)
            java.lang.String r10 = r5.f()
            r9.append(r10)
            java.lang.String r10 = ") for "
            r9.append(r10)
            java.lang.String r10 = r4.f()
            r9.append(r10)
            java.lang.String r10 = " is missing in the database configuration."
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        La6:
            java.util.List<java.lang.Object> r9 = r10.typeConverters
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            int r9 = r9 + r3
            if (r9 < 0) goto Lde
        Lb1:
            int r0 = r9 + (-1)
            boolean r2 = r1[r9]
            if (r2 == 0) goto Lbc
            if (r0 >= 0) goto Lba
            goto Lde
        Lba:
            r9 = r0
            goto Lb1
        Lbc:
            java.util.List<java.lang.Object> r10 = r10.typeConverters
            java.lang.Object r9 = r10.get(r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected type converter "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            throw r10
        Lde:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.w.c(x4.u, x4.c):void");
    }
}
