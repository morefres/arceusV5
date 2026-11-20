package wm;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xm.WorkflowNodeId;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0014B-\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00028@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, d2 = {"Lwm/m;", "", "Lwm/i;", "workflowSnapshot", "Lkotlin/Function0;", "", "Lxm/k;", "childTreeSnapshots", "<init>", "(Lwm/i;Lkotlin/jvm/functions/Function0;)V", "Lwu/h;", "c", "()Lwu/h;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", ve.a.f33391e, "Lgt/h;", j6.b.f21518e, "()Lwm/i;", "()Ljava/util/Map;", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h workflowSnapshot;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final gt.h childTreeSnapshots;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwm/m$a;", "", "<init>", "()V", "Lwu/h;", "bytes", "Lwm/m;", ve.a.f33391e, "(Lwu/h;)Lwm/m;", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: wm.m$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lxm/k;", "Lwm/m;", j6.b.f21518e, "()Ljava/util/Map;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: wm.m$a$a, reason: collision with other inner class name */
        public static final class C0643a extends kotlin.jvm.internal.m implements Function0<Map<WorkflowNodeId, ? extends m>> {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ wu.g f34403i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0643a(wu.g gVar) {
                super(0);
                this.f34403i = gVar;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Map<WorkflowNodeId, m> invoke() {
                int readInt = this.f34403i.readInt();
                wu.g gVar = this.f34403i;
                Map e10 = j0.e(readInt);
                int i10 = 0;
                while (i10 < readInt) {
                    i10++;
                    e10.put(WorkflowNodeId.INSTANCE.a(j.a(gVar)), m.INSTANCE.a(j.a(gVar)));
                }
                return j0.c(e10);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final m a(@NotNull wu.h bytes) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            wu.e s22 = new wu.e().s2(bytes);
            return new m(Snapshot.INSTANCE.b(j.a(s22)), new C0643a(s22));
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwm/i;", j6.b.f21518e, "()Lwm/i;"}, k = 3, mv = {1, 6, 0})
    public static final class b extends kotlin.jvm.internal.m implements Function0<Snapshot> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Snapshot f34404i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Snapshot snapshot) {
            super(0);
            this.f34404i = snapshot;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Snapshot invoke() {
            Snapshot snapshot = this.f34404i;
            if (snapshot == null || snapshot.b().I() == 0) {
                return null;
            }
            return snapshot;
        }
    }

    public m(@Nullable Snapshot snapshot, @NotNull Function0<? extends Map<WorkflowNodeId, m>> childTreeSnapshots) {
        Intrinsics.checkNotNullParameter(childTreeSnapshots, "childTreeSnapshots");
        gt.k kVar = gt.k.f18836c;
        this.workflowSnapshot = gt.i.a(kVar, new b(snapshot));
        this.childTreeSnapshots = gt.i.a(kVar, childTreeSnapshots);
    }

    @NotNull
    public final Map<WorkflowNodeId, m> a() {
        return (Map) this.childTreeSnapshots.getValue();
    }

    @Nullable
    public final Snapshot b() {
        return (Snapshot) this.workflowSnapshot.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a A[SYNTHETIC] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final wu.h c() {
        /*
            r7 = this;
            wu.e r0 = new wu.e
            r0.<init>()
            wm.i r1 = r7.b()
            r2 = 0
            if (r1 != 0) goto Le
            r1 = r2
            goto L12
        Le:
            wu.h r1 = r1.b()
        L12:
            if (r1 != 0) goto L16
            wu.h r1 = wu.h.f34820e
        L16:
            wm.j.c(r0, r1)
            java.util.Map r1 = r7.a()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L64
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            xm.k r5 = (xm.WorkflowNodeId) r5
            java.lang.Object r4 = r4.getValue()
            wm.m r4 = (wm.m) r4
            wu.h r5 = r5.d()
            if (r5 != 0) goto L4a
        L48:
            r6 = r2
            goto L5d
        L4a:
            wu.h r4 = r4.c()
            int r6 = r4.I()
            if (r6 != 0) goto L55
            r4 = r2
        L55:
            if (r4 != 0) goto L58
            goto L48
        L58:
            kotlin.Pair r6 = new kotlin.Pair
            r6.<init>(r5, r4)
        L5d:
            if (r6 != 0) goto L60
            goto L2a
        L60:
            r3.add(r6)
            goto L2a
        L64:
            int r1 = r3.size()
            r0.writeInt(r1)
            int r1 = r3.size()
            r2 = 0
        L70:
            if (r2 >= r1) goto L8d
            java.lang.Object r4 = r3.get(r2)
            int r2 = r2 + 1
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.a()
            wu.h r5 = (wu.h) r5
            java.lang.Object r4 = r4.b()
            wu.h r4 = (wu.h) r4
            wm.j.c(r0, r5)
            wm.j.c(r0, r4)
            goto L70
        L8d:
            wu.h r0 = r0.G2()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wm.m.c():wu.h");
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof m)) {
            return false;
        }
        m mVar = (m) other;
        return Intrinsics.c(mVar.b(), b()) && Intrinsics.c(mVar.a(), a());
    }

    public int hashCode() {
        Snapshot b10 = b();
        return ((b10 == null ? 0 : b10.hashCode()) * 31) + a().hashCode();
    }
}
