package tr;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.i;
import mu.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ltr/d;", "Ltr/h;", "", "", "delayMs", "<init>", "(J)V", "Lmu/h;", "run", "()Lmu/h;", "otherWorker", "", ve.a.f33391e, "(Ltr/h;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", j6.b.f21518e, "J", "workflows_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: tr.d, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class TimerWorker implements h<Unit> {

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final long delayMs;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmu/i;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.workflows.TimerWorker$run$1", f = "TimerWorker.kt", l = {11, 12}, m = "invokeSuspend")
    /* renamed from: tr.d$a */
    public static final class a extends m implements Function2<i<? super Unit>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f32425t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f32426u;

        public a(mt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            a aVar = TimerWorker.this.new a(bVar);
            aVar.f32426u = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        
            if (ju.z0.b(r5, r7) == r1) goto L15;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f32426u
                mu.i r0 = (mu.i) r0
                java.lang.Object r1 = nt.c.e()
                int r2 = r7.f32425t
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                gt.o.b(r8)
                goto L47
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                gt.o.b(r8)
                goto L36
            L22:
                gt.o.b(r8)
                tr.d r8 = tr.TimerWorker.this
                long r5 = tr.TimerWorker.c(r8)
                r7.f32426u = r0
                r7.f32425t = r4
                java.lang.Object r8 = ju.z0.b(r5, r7)
                if (r8 != r1) goto L36
                goto L46
            L36:
                kotlin.Unit r8 = kotlin.Unit.f22894a
                java.lang.Object r2 = ot.l.a(r0)
                r7.f32426u = r2
                r7.f32425t = r3
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L47
            L46:
                return r1
            L47:
                kotlin.Unit r8 = kotlin.Unit.f22894a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: tr.TimerWorker.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super Unit> iVar, mt.b<? super Unit> bVar) {
            return ((a) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public TimerWorker(long j10) {
        this.delayMs = j10;
    }

    @Override // tr.h
    public boolean a(@NotNull h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof TimerWorker) && ((TimerWorker) otherWorker).delayMs == this.delayMs;
    }

    @Override // tr.h
    public boolean b(@NotNull h<?> hVar) {
        return super.b(hVar);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TimerWorker) && this.delayMs == ((TimerWorker) other).delayMs;
    }

    public int hashCode() {
        return Long.hashCode(this.delayMs);
    }

    @Override // tr.h
    @NotNull
    public mu.h<Unit> run() {
        return j.w(new a(null));
    }

    @NotNull
    public String toString() {
        return "TimerWorker(delayMs=" + this.delayMs + ")";
    }
}
