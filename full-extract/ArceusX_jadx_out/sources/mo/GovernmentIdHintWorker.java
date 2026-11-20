package mo;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.camera.ImageLightCondition;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.HoldStillHint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.LowLightHint;
import dn.j0;
import dn.x;
import gt.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.i;
import mu.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.l;
import ot.m;
import tr.h;
import wm.o;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003:\u0003\u0010\u000e$B#\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lmo/a;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "Ltr/h;", "Landroid/content/Context;", "context", "Ldn/x;", "governmentIdFeed", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "<init>", "(Landroid/content/Context;Ldn/x;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)V", "otherWorker", "", "c", "(Lwm/o;)Z", ve.a.f33391e, "(Ltr/h;)Z", "Lmu/h;", "run", "()Lmu/h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ldn/j0;", "it", "Lmo/a$c;", "f", "(Ldn/j0;)Lmo/a$c;", j6.b.f21518e, "Landroid/content/Context;", "Ldn/x;", rl.d.f30696a, "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "e", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: mo.a, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class GovernmentIdHintWorker implements o<Hint>, h<Hint> {

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final x governmentIdFeed;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final IdConfig.b side;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lmo/a$b;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "Lmo/a;", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lmo/a;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: mo.a$b */
    public interface b {
        @NotNull
        GovernmentIdHintWorker a(@NotNull IdConfig.b side);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lmo/a$c;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "hint", "", "minDurationMs", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "()Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", j6.b.f21518e, "J", "()J", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: mo.a$c, reason: from toString */
    public static final /* data */ class HintEvent {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Hint hint;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        public final long minDurationMs;

        public HintEvent(@NotNull Hint hint, long j10) {
            Intrinsics.checkNotNullParameter(hint, "hint");
            this.hint = hint;
            this.minDurationMs = j10;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final Hint getHint() {
            return this.hint;
        }

        /* renamed from: b, reason: from getter */
        public final long getMinDurationMs() {
            return this.minDurationMs;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HintEvent)) {
                return false;
            }
            HintEvent hintEvent = (HintEvent) other;
            return Intrinsics.c(this.hint, hintEvent.hint) && this.minDurationMs == hintEvent.minDurationMs;
        }

        public int hashCode() {
            return (this.hint.hashCode() * 31) + Long.hashCode(this.minDurationMs);
        }

        @NotNull
        public String toString() {
            return "HintEvent(hint=" + this.hint + ", minDurationMs=" + this.minDurationMs + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1", f = "GovernmentIdHintWorker.kt", l = {98}, m = "invokeSuspend")
    /* renamed from: mo.a$d */
    public static final class d extends m implements Function2<i<? super Hint>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f24652t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f24653u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ mu.h<HintEvent> f24654v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: mo.a$d$a, reason: collision with other inner class name */
        public static final class C0429a<T> implements i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i<Hint> f24655a;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            @f(c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1$1", f = "GovernmentIdHintWorker.kt", l = {99, 100}, m = "emit")
            /* renamed from: mo.a$d$a$a, reason: collision with other inner class name */
            public static final class C0430a extends ot.d {

                /* renamed from: t, reason: collision with root package name */
                public Object f24656t;

                /* renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f24657u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ C0429a<T> f24658v;

                /* renamed from: w, reason: collision with root package name */
                public int f24659w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0430a(C0429a<? super T> c0429a, mt.b<? super C0430a> bVar) {
                    super(bVar);
                    this.f24658v = c0429a;
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    this.f24657u = obj;
                    this.f24659w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return this.f24658v.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0429a(i<? super Hint> iVar) {
                this.f24655a = iVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
            
                if (ju.z0.b(r4, r0) != r1) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
            
                if (r10.emit(r2, r0) == r1) goto L28;
             */
            /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(mo.GovernmentIdHintWorker.HintEvent r9, mt.b<? super kotlin.Unit> r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof mo.GovernmentIdHintWorker.d.C0429a.C0430a
                    if (r0 == 0) goto L13
                    r0 = r10
                    mo.a$d$a$a r0 = (mo.GovernmentIdHintWorker.d.C0429a.C0430a) r0
                    int r1 = r0.f24659w
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f24659w = r1
                    goto L18
                L13:
                    mo.a$d$a$a r0 = new mo.a$d$a$a
                    r0.<init>(r8, r10)
                L18:
                    java.lang.Object r10 = r0.f24657u
                    java.lang.Object r1 = nt.c.e()
                    int r2 = r0.f24659w
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L38
                    if (r2 != r3) goto L30
                    java.lang.Object r9 = r0.f24656t
                    mo.a$c r9 = (mo.GovernmentIdHintWorker.HintEvent) r9
                    gt.o.b(r10)
                    goto L76
                L30:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L38:
                    java.lang.Object r9 = r0.f24656t
                    mo.a$c r9 = (mo.GovernmentIdHintWorker.HintEvent) r9
                    gt.o.b(r10)
                    goto L58
                L40:
                    gt.o.b(r10)
                    mu.i<com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint> r10 = r8.f24655a
                    if (r9 == 0) goto L4c
                    com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint r2 = r9.getHint()
                    goto L4d
                L4c:
                    r2 = 0
                L4d:
                    r0.f24656t = r9
                    r0.f24659w = r4
                    java.lang.Object r10 = r10.emit(r2, r0)
                    if (r10 != r1) goto L58
                    goto L75
                L58:
                    if (r9 == 0) goto L5f
                    long r4 = r9.getMinDurationMs()
                    goto L61
                L5f:
                    r4 = 0
                L61:
                    r6 = 33
                    long r4 = kotlin.ranges.d.d(r4, r6)
                    java.lang.Object r9 = ot.l.a(r9)
                    r0.f24656t = r9
                    r0.f24659w = r3
                    java.lang.Object r9 = ju.z0.b(r4, r0)
                    if (r9 != r1) goto L76
                L75:
                    return r1
                L76:
                    kotlin.Unit r9 = kotlin.Unit.f22894a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: mo.GovernmentIdHintWorker.d.C0429a.emit(mo.a$c, mt.b):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(mu.h<HintEvent> hVar, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f24654v = hVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            d dVar = new d(this.f24654v, bVar);
            dVar.f24653u = obj;
            return dVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            i iVar = (i) this.f24653u;
            Object e10 = nt.c.e();
            int i10 = this.f24652t;
            if (i10 == 0) {
                gt.o.b(obj);
                mu.h k10 = j.k(this.f24654v);
                C0429a c0429a = new C0429a(iVar);
                this.f24653u = l.a(iVar);
                this.f24652t = 1;
                if (k10.collect(c0429a, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super Hint> iVar, mt.b<? super Unit> bVar) {
            return ((d) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lmo/a$c;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$hintFlow$1", f = "GovernmentIdHintWorker.kt", l = {82}, m = "invokeSuspend")
    /* renamed from: mo.a$e */
    public static final class e extends m implements Function2<i<? super HintEvent>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f24660t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f24661u;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: mo.a$e$a, reason: collision with other inner class name */
        public static final class C0431a<T> implements i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i<HintEvent> f24663a;
            public final /* synthetic */ GovernmentIdHintWorker b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0431a(i<? super HintEvent> iVar, GovernmentIdHintWorker governmentIdHintWorker) {
                this.f24663a = iVar;
                this.b = governmentIdHintWorker;
            }

            @Override // mu.i
            public final Object emit(Object obj, mt.b<? super Unit> bVar) {
                Object value = ((n) obj).getValue();
                i<HintEvent> iVar = this.f24663a;
                GovernmentIdHintWorker governmentIdHintWorker = this.b;
                if (n.e(value) == null) {
                    Object emit = iVar.emit(governmentIdHintWorker.f((j0) value), bVar);
                    if (emit == nt.c.e()) {
                        return emit;
                    }
                } else {
                    Object emit2 = iVar.emit(null, bVar);
                    if (emit2 == nt.c.e()) {
                        return emit2;
                    }
                }
                return Unit.f22894a;
            }
        }

        public e(mt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            e eVar = GovernmentIdHintWorker.this.new e(bVar);
            eVar.f24661u = obj;
            return eVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            i iVar = (i) this.f24661u;
            Object e10 = nt.c.e();
            int i10 = this.f24660t;
            if (i10 == 0) {
                gt.o.b(obj);
                x xVar = GovernmentIdHintWorker.this.governmentIdFeed;
                C0431a c0431a = new C0431a(iVar, GovernmentIdHintWorker.this);
                this.f24661u = l.a(iVar);
                this.f24660t = 1;
                if (xVar.collect(c0431a, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            throw new gt.d();
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super HintEvent> iVar, mt.b<? super Unit> bVar) {
            return ((e) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public GovernmentIdHintWorker(@NotNull Context context, @NotNull x governmentIdFeed, @NotNull IdConfig.b side) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(side, "side");
        this.context = context;
        this.governmentIdFeed = governmentIdFeed;
        this.side = side;
    }

    @Override // tr.h
    public boolean a(@NotNull h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof GovernmentIdHintWorker) && ((GovernmentIdHintWorker) otherWorker).side == this.side;
    }

    @Override // tr.h
    public boolean b(@NotNull h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof GovernmentIdHintWorker) && ((GovernmentIdHintWorker) otherWorker).side == this.side;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdHintWorker)) {
            return false;
        }
        GovernmentIdHintWorker governmentIdHintWorker = (GovernmentIdHintWorker) other;
        return Intrinsics.c(this.context, governmentIdHintWorker.context) && Intrinsics.c(this.governmentIdFeed, governmentIdHintWorker.governmentIdFeed) && this.side == governmentIdHintWorker.side;
    }

    public final HintEvent f(j0 it) {
        if (it instanceof j0.ParsedIdSide) {
            return new HintEvent(HoldStillHint.f10977a, 1000L);
        }
        ImageLightCondition imageLightCondition = it.getImageLightCondition();
        if (imageLightCondition == null) {
            return null;
        }
        boolean z10 = imageLightCondition.getRmsContrast() < 0.2d || imageLightCondition.getLowHighContrast() < 0.2d;
        boolean z11 = imageLightCondition.getRmsContrast() > 0.3d && imageLightCondition.getLowHighContrast() > 0.5d;
        if ((imageLightCondition.getLuminosity() >= 0.34d || z11) && (imageLightCondition.getLuminosity() >= 0.45d || !z10)) {
            return null;
        }
        return new HintEvent(LowLightHint.f10978a, 1000L);
    }

    public int hashCode() {
        return (((this.context.hashCode() * 31) + this.governmentIdFeed.hashCode()) * 31) + this.side.hashCode();
    }

    @Override // wm.o, tr.h
    @NotNull
    public mu.h<Hint> run() {
        return j.m(j.w(new d(j.w(new e(null)), null)));
    }

    @NotNull
    public String toString() {
        return "GovernmentIdHintWorker(context=" + this.context + ", governmentIdFeed=" + this.governmentIdFeed + ", side=" + this.side + ")";
    }
}
