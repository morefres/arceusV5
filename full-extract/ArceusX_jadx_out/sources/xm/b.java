package xm;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wm.Snapshot;
import wm.q;
import wm.r;
import wm.t;
import yt.n;
import yt.o;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJQ\u0010\u0014\u001a\u00028\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J[\u0010\u001a\u001a\u00028\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u00012\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u008d\u0001\u0010#\u001a\u00028\u0003\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u001c\"\u0004\b\u0003\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00028\u00012\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020 22\u0010\u0013\u001a.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\"\u0012\u0004\u0012\u00028\u00030\u00192\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J=\u0010&\u001a\u0004\u0018\u00010\u0010\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0018\u001a\u00028\u00002\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00100%2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'Ji\u0010)\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\"\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u001c*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\"2\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\"H\u0002¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010+¨\u0006,"}, d2 = {"Lxm/b;", "Lwm/t;", "", "interceptors", "<init>", "(Ljava/util/List;)V", "Lju/p0;", "workflowScope", "Lwm/t$c;", "session", "", rl.d.f30696a, "(Lju/p0;Lwm/t$c;)V", "P", "S", "props", "Lwm/i;", "snapshot", "Lkotlin/Function2;", "proceed", ve.a.f33391e, "(Ljava/lang/Object;Lwm/i;Lkotlin/jvm/functions/Function2;Lwm/t$c;)Ljava/lang/Object;", "old", "new", "state", "Lkotlin/Function3;", j6.b.f21518e, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyt/n;Lwm/t$c;)Ljava/lang/Object;", "O", "R", "renderProps", "renderState", "Lwm/a;", "context", "Lwm/t$b;", "c", "(Ljava/lang/Object;Ljava/lang/Object;Lwm/a;Lyt/n;Lwm/t$c;)Ljava/lang/Object;", "Lkotlin/Function1;", "e", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lwm/t$c;)Lwm/i;", "inner", "g", "(Lwm/t$b;Lwm/t$b;)Lwm/t$b;", "Ljava/util/List;", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<t> interceptors;

    /* JADX INFO: Add missing generic type declarations: [P, S] */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"P", "S", "props", "Lwm/i;", "snapshot", ve.a.f33391e, "(Ljava/lang/Object;Lwm/i;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class a<P, S> extends kotlin.jvm.internal.m implements Function2<P, Snapshot, S> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ t f35608i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Function2<P, Snapshot, S> f35609j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ t.c f35610k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(t tVar, Function2<? super P, ? super Snapshot, ? extends S> function2, t.c cVar) {
            super(2);
            this.f35608i = tVar;
            this.f35609j = function2;
            this.f35610k = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S invoke(P p8, @Nullable Snapshot snapshot) {
            return (S) this.f35608i.a(p8, snapshot, this.f35609j, this.f35610k);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P, S] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\b\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "S", "P", "old", "new", "state", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: xm.b$b, reason: collision with other inner class name */
    public static final class C0655b<P, S> extends kotlin.jvm.internal.m implements n<P, P, S, S> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ t f35611i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ n<P, P, S, S> f35612j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ t.c f35613k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0655b(t tVar, n<? super P, ? super P, ? super S, ? extends S> nVar, t.c cVar) {
            super(3);
            this.f35611i = tVar;
            this.f35612j = nVar;
            this.f35613k = cVar;
        }

        @Override // yt.n
        public final S invoke(P p8, P p10, S s8) {
            return (S) this.f35611i.b(p8, p10, s8, this.f35612j, this.f35613k);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P, R, S, O] */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"P", "S", "O", "R", "props", "state", "Lwm/t$b;", "outerContextInterceptor", ve.a.f33391e, "(Ljava/lang/Object;Ljava/lang/Object;Lwm/t$b;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class c<O, P, R, S> extends kotlin.jvm.internal.m implements n<P, S, t.b<P, S, O>, R> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ t f35614i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ wm.a<P, S, O> f35615j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ t.c f35616k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b f35617l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ n<P, S, t.b<P, S, O>, R> f35618m;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"P", "S", "O", "R", "p", "s", "Lwm/t$b;", "innerContextInterceptor", ve.a.f33391e, "(Ljava/lang/Object;Ljava/lang/Object;Lwm/t$b;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        public static final class a extends kotlin.jvm.internal.m implements n<P, S, t.b<P, S, O>, R> {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ b f35619i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ t.b<P, S, O> f35620j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ n<P, S, t.b<P, S, O>, R> f35621k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b bVar, t.b<P, S, O> bVar2, n<? super P, ? super S, ? super t.b<P, S, O>, ? extends R> nVar) {
                super(3);
                this.f35619i = bVar;
                this.f35620j = bVar2;
                this.f35621k = nVar;
            }

            @Override // yt.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final R invoke(P p8, S s8, @Nullable t.b<P, S, O> bVar) {
                return this.f35621k.invoke(p8, s8, this.f35619i.g(this.f35620j, bVar));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(t tVar, wm.a<? extends P, S, ? super O> aVar, t.c cVar, b bVar, n<? super P, ? super S, ? super t.b<P, S, O>, ? extends R> nVar) {
            super(3);
            this.f35614i = tVar;
            this.f35615j = aVar;
            this.f35616k = cVar;
            this.f35617l = bVar;
            this.f35618m = nVar;
        }

        @Override // yt.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(P p8, S s8, @Nullable t.b<P, S, O> bVar) {
            return (R) this.f35614i.c(p8, s8, this.f35615j, new a(this.f35617l, bVar, this.f35618m), this.f35616k);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "state", "Lwm/i;", ve.a.f33391e, "(Ljava/lang/Object;)Lwm/i;"}, k = 3, mv = {1, 6, 0})
    public static final class d<S> extends kotlin.jvm.internal.m implements Function1<S, Snapshot> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ t f35622i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Function1<S, Snapshot> f35623j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ t.c f35624k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(t tVar, Function1<? super S, Snapshot> function1, t.c cVar) {
            super(1);
            this.f35622i = tVar;
            this.f35623j = function1;
            this.f35624k = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Snapshot invoke(S s8) {
            return this.f35622i.e(s8, this.f35623j, this.f35624k);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P, S, O] */
    @Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001JO\u0010\u0007\u001a\u00020\u00052\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00022$\u0010\u0006\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJÇ\u0001\u0010\u0013\u001a\u00028\u0005\"\u0004\b\u0003\u0010\t\"\u0004\b\u0004\u0010\n\"\u0004\b\u0005\u0010\u000b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f2\u0006\u0010\u000e\u001a\u00028\u00032\u0006\u0010\u0010\u001a\u00020\u000f2$\u0010\u0011\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00020\u00042T\u0010\u0006\u001aP\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u000f\u0012\"\u0012 \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00020\u0004\u0012\u0004\u0012\u00028\u00050\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014Jh\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u001c\u0010\u0017\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00042.\u0010\u0006\u001a*\u0012\u0004\u0012\u00020\u000f\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0004\u0012\u0004\u0012\u00020\u00050\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR/\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00018\u0006¢\u0006\u0012\n\u0004\b\u0013\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"xm/b$e", "Lwm/t$b;", "Lwm/r;", "action", "Lkotlin/Function1;", "", "proceed", j6.b.f21518e, "(Lwm/r;Lkotlin/jvm/functions/Function1;)V", "CP", "CO", "CR", "Lwm/q;", "child", "childProps", "", "key", "handler", "Lkotlin/Function4;", ve.a.f33391e, "(Lwm/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lyt/o;)Ljava/lang/Object;", "Lmt/b;", "", "sideEffect", "Lkotlin/Function2;", "c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lwm/t$b;", "getOuter", "()Lwm/t$b;", "getOuter$annotations", "()V", "outer", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class e<O, P, S> implements t.b<P, S, O> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final t.b<P, S, O> outer;
        public final /* synthetic */ t.b<P, S, O> b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t.b<P, S, O> f35626c;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"P", "S", "O", "Lwm/r;", "interceptedAction", "", ve.a.f33391e, "(Lwm/r;)V"}, k = 3, mv = {1, 6, 0})
        public static final class a extends kotlin.jvm.internal.m implements Function1<r<? super P, S, ? extends O>, Unit> {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ t.b<P, S, O> f35627i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ Function1<r<? super P, S, ? extends O>, Unit> f35628j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(t.b<P, S, O> bVar, Function1<? super r<? super P, S, ? extends O>, Unit> function1) {
                super(1);
                this.f35627i = bVar;
                this.f35628j = function1;
            }

            public final void a(@NotNull r<? super P, S, ? extends O> interceptedAction) {
                Intrinsics.checkNotNullParameter(interceptedAction, "interceptedAction");
                this.f35627i.b(interceptedAction, this.f35628j);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                a((r) obj);
                return Unit.f22894a;
            }
        }

        /* JADX INFO: Add missing generic type declarations: [CO, CP, CR] */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000e\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2$\u0010\r\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f0\u000bH\n¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"CP", "CO", "CR", "P", "S", "O", "Lwm/q;", "c", "p", "", "k", "Lkotlin/Function1;", "Lwm/r;", "h", ve.a.f33391e, "(Lwm/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: xm.b$e$b, reason: collision with other inner class name */
        public static final class C0656b<CO, CP, CR> extends kotlin.jvm.internal.m implements o<q<? super CP, ? extends CO, ? extends CR>, CP, String, Function1<? super CO, ? extends r<? super P, S, ? extends O>>, CR> {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ t.b<P, S, O> f35629i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ o<q<? super CP, ? extends CO, ? extends CR>, CP, String, Function1<? super CO, ? extends r<? super P, S, ? extends O>>, CR> f35630j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0656b(t.b<P, S, O> bVar, o<? super q<? super CP, ? extends CO, ? extends CR>, ? super CP, ? super String, ? super Function1<? super CO, ? extends r<? super P, S, ? extends O>>, ? extends CR> oVar) {
                super(4);
                this.f35629i = bVar;
                this.f35630j = oVar;
            }

            @Override // yt.o
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CR e(@NotNull q<? super CP, ? extends CO, ? extends CR> c10, CP cp2, @NotNull String k10, @NotNull Function1<? super CO, ? extends r<? super P, S, ? extends O>> h10) {
                Intrinsics.checkNotNullParameter(c10, "c");
                Intrinsics.checkNotNullParameter(k10, "k");
                Intrinsics.checkNotNullParameter(h10, "h");
                return (CR) this.f35629i.a(c10, cp2, k10, h10, this.f35630j);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"P", "S", "O", "", "iKey", "Lkotlin/Function1;", "Lmt/b;", "", "", "iSideEffect", ve.a.f33391e, "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V"}, k = 3, mv = {1, 6, 0})
        public static final class c extends kotlin.jvm.internal.m implements Function2<String, Function1<? super mt.b<? super Unit>, ? extends Object>, Unit> {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ t.b<P, S, O> f35631i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ Function2<String, Function1<? super mt.b<? super Unit>, ? extends Object>, Unit> f35632j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(t.b<P, S, O> bVar, Function2<? super String, ? super Function1<? super mt.b<? super Unit>, ? extends Object>, Unit> function2) {
                super(2);
                this.f35631i = bVar;
                this.f35632j = function2;
            }

            public final void a(@NotNull String iKey, @NotNull Function1<? super mt.b<? super Unit>, ? extends Object> iSideEffect) {
                Intrinsics.checkNotNullParameter(iKey, "iKey");
                Intrinsics.checkNotNullParameter(iSideEffect, "iSideEffect");
                this.f35631i.c(iKey, iSideEffect, this.f35632j);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Function1<? super mt.b<? super Unit>, ? extends Object> function1) {
                a(str, function1);
                return Unit.f22894a;
            }
        }

        public e(t.b<P, S, O> bVar, t.b<P, S, O> bVar2) {
            this.b = bVar;
            this.f35626c = bVar2;
            Intrinsics.checkNotNull(bVar);
            this.outer = bVar;
        }

        @Override // wm.t.b
        public <CP, CO, CR> CR a(@NotNull q<? super CP, ? extends CO, ? extends CR> child, CP childProps, @NotNull String key, @NotNull Function1<? super CO, ? extends r<? super P, S, ? extends O>> handler, @NotNull o<? super q<? super CP, ? extends CO, ? extends CR>, ? super CP, ? super String, ? super Function1<? super CO, ? extends r<? super P, S, ? extends O>>, ? extends CR> proceed) {
            Intrinsics.checkNotNullParameter(child, "child");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            return (CR) this.outer.a(child, childProps, key, handler, new C0656b(this.f35626c, proceed));
        }

        @Override // wm.t.b
        public void b(@NotNull r<? super P, S, ? extends O> action, @NotNull Function1<? super r<? super P, S, ? extends O>, Unit> proceed) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            this.outer.b(action, new a(this.f35626c, proceed));
        }

        @Override // wm.t.b
        public void c(@NotNull String key, @NotNull Function1<? super mt.b<? super Unit>, ? extends Object> sideEffect, @NotNull Function2<? super String, ? super Function1<? super mt.b<? super Unit>, ? extends Object>, Unit> proceed) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            this.outer.c(key, sideEffect, new c(this.f35626c, proceed));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull List<? extends t> interceptors) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.interceptors = interceptors;
    }

    @Override // wm.t
    public <P, S> S a(P props, @Nullable Snapshot snapshot, @NotNull Function2<? super P, ? super Snapshot, ? extends S> proceed, @NotNull t.c session) {
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<t> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                proceed = new a(listIterator.previous(), proceed, session);
            }
        }
        return proceed.invoke(props, snapshot);
    }

    @Override // wm.t
    public <P, S> S b(P old, P r52, S state, @NotNull n<? super P, ? super P, ? super S, ? extends S> proceed, @NotNull t.c session) {
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<t> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                proceed = new C0655b(listIterator.previous(), proceed, session);
            }
        }
        return proceed.invoke(old, r52, state);
    }

    @Override // wm.t
    public <P, S, O, R> R c(P renderProps, S renderState, @NotNull wm.a<? extends P, S, ? super O> context, @NotNull n<? super P, ? super S, ? super t.b<P, S, O>, ? extends R> proceed, @NotNull t.c session) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<t> listIterator = list.listIterator(list.size());
            n<? super P, ? super S, ? super t.b<P, S, O>, ? extends R> nVar = proceed;
            while (listIterator.hasPrevious()) {
                nVar = new c(listIterator.previous(), context, session, this, nVar);
            }
            proceed = nVar;
        }
        return proceed.invoke(renderProps, renderState, null);
    }

    @Override // wm.t
    public void d(@NotNull p0 workflowScope, @NotNull t.c session) {
        Intrinsics.checkNotNullParameter(workflowScope, "workflowScope");
        Intrinsics.checkNotNullParameter(session, "session");
        Iterator<T> it = this.interceptors.iterator();
        while (it.hasNext()) {
            ((t) it.next()).d(workflowScope, session);
        }
    }

    @Override // wm.t
    @Nullable
    public <S> Snapshot e(S state, @NotNull Function1<? super S, Snapshot> proceed, @NotNull t.c session) {
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<t> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                proceed = new d(listIterator.previous(), proceed, session);
            }
        }
        return proceed.invoke(state);
    }

    public final <P, S, O> t.b<P, S, O> g(t.b<P, S, O> bVar, t.b<P, S, O> bVar2) {
        if (bVar == null && bVar2 == null) {
            return null;
        }
        return bVar == null ? bVar2 : bVar2 == null ? bVar : new e(bVar, bVar2);
    }
}
