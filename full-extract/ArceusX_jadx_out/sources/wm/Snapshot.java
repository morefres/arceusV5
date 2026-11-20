package wm;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00172\u00020\u0001:\u0001\u0011B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u00038GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0018"}, d2 = {"Lwm/i;", "", "Lkotlin/Function0;", "Lwu/h;", "toByteString", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", ve.a.f33391e, "Lkotlin/jvm/functions/Function0;", j6.b.f21518e, "Lgt/h;", "()Lwu/h;", "bytes", "c", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: wm.i, reason: from toString */
/* loaded from: classes3.dex */
public final class Snapshot {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<wu.h> toByteString;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final gt.h bytes;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lwm/i$a;", "", "<init>", "()V", "Lwu/h;", "byteString", "Lwm/i;", j6.b.f21518e, "(Lwu/h;)Lwm/i;", "Lkotlin/Function0;", "lazy", ve.a.f33391e, "(Lkotlin/jvm/functions/Function0;)Lwm/i;", "Lkotlin/Function1;", "Lwu/f;", "", "c", "(Lkotlin/jvm/functions/Function1;)Lwm/i;", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: wm.i$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwu/h;", j6.b.f21518e, "()Lwu/h;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: wm.i$a$a, reason: collision with other inner class name */
        public static final class C0642a extends kotlin.jvm.internal.m implements Function0<wu.h> {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ wu.h f34392i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0642a(wu.h hVar) {
                super(0);
                this.f34392i = hVar;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final wu.h invoke() {
                return this.f34392i;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwu/h;", j6.b.f21518e, "()Lwu/h;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: wm.i$a$b */
        public static final class b extends kotlin.jvm.internal.m implements Function0<wu.h> {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ Function1<wu.f, Unit> f34393i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function1<? super wu.f, Unit> function1) {
                super(0);
                this.f34393i = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final wu.h invoke() {
                wu.e eVar = new wu.e();
                this.f34393i.invoke(eVar);
                return eVar.G2();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Snapshot a(@NotNull Function0<? extends wu.h> lazy) {
            Intrinsics.checkNotNullParameter(lazy, "lazy");
            return new Snapshot(lazy, null);
        }

        @NotNull
        public final Snapshot b(@NotNull wu.h byteString) {
            Intrinsics.checkNotNullParameter(byteString, "byteString");
            return new Snapshot(new C0642a(byteString), null);
        }

        @NotNull
        public final Snapshot c(@NotNull Function1<? super wu.f, Unit> lazy) {
            Intrinsics.checkNotNullParameter(lazy, "lazy");
            return a(new b(lazy));
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwu/h;", j6.b.f21518e, "()Lwu/h;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: wm.i$b */
    public static final class b extends kotlin.jvm.internal.m implements Function0<wu.h> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final wu.h invoke() {
            return (wu.h) Snapshot.this.toByteString.invoke();
        }
    }

    public /* synthetic */ Snapshot(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    @NotNull
    public final wu.h b() {
        return (wu.h) this.bytes.getValue();
    }

    public boolean equals(@Nullable Object other) {
        Snapshot snapshot = other instanceof Snapshot ? (Snapshot) other : null;
        if (snapshot == null) {
            return false;
        }
        return Intrinsics.c(b(), snapshot.b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    @NotNull
    public String toString() {
        return "Snapshot(" + b() + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Snapshot(Function0<? extends wu.h> function0) {
        this.toByteString = function0;
        this.bytes = gt.i.b(new b());
    }
}
