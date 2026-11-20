package t3;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0015*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0011B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lt3/o;", "T", "Lt3/e0;", "Lt3/a0;", "serializer", "Lkotlin/Function1;", "Ljava/io/File;", "Lt3/t;", "coordinatorProducer", "Lkotlin/Function0;", "produceFile", "<init>", "(Lt3/a0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lt3/f0;", ve.a.f33391e, "()Lt3/f0;", "Lt3/a0;", j6.b.f21518e, "Lkotlin/jvm/functions/Function1;", "c", "Lkotlin/jvm/functions/Function0;", rl.d.f30696a, "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o<T> implements e0<T> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Set<String> f31931e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Object f31932f = new Object();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a0<T> serializer;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<File, t> coordinatorProducer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<File> produceFile;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ljava/io/File;", "it", "Lt3/t;", ve.a.f33391e, "(Ljava/io/File;)Lt3/t;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.m implements Function1<File, t> {

        /* renamed from: i, reason: collision with root package name */
        public static final a f31935i = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t invoke(@NotNull File it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return v.a(it);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lt3/o$b;", "", "<init>", "()V", "", "", "activeFiles", "Ljava/util/Set;", ve.a.f33391e, "()Ljava/util/Set;", "activeFilesLock", "Ljava/lang/Object;", j6.b.f21518e, "()Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: t3.o$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<String> a() {
            return o.f31931e;
        }

        @NotNull
        public final Object b() {
            return o.f31932f;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", j6.b.f21518e, "()V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends kotlin.jvm.internal.m implements Function0<Unit> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ File f31936i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file) {
            super(0);
            this.f31936i = file;
        }

        public final void b() {
            Companion companion = o.INSTANCE;
            Object b = companion.b();
            File file = this.f31936i;
            synchronized (b) {
                companion.a().remove(file.getAbsolutePath());
                Unit unit = Unit.f22894a;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            b();
            return Unit.f22894a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(@NotNull a0<T> serializer, @NotNull Function1<? super File, ? extends t> coordinatorProducer, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.produceFile = produceFile;
    }

    @Override // t3.e0
    @NotNull
    public f0<T> a() {
        File file = this.produceFile.invoke().getCanonicalFile();
        synchronized (f31932f) {
            String path = file.getAbsolutePath();
            Set<String> set = f31931e;
            if (set.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            Intrinsics.checkNotNullExpressionValue(path, "path");
            set.add(path);
        }
        Intrinsics.checkNotNullExpressionValue(file, "file");
        return new p(file, this.serializer, this.coordinatorProducer.invoke(file), new c(file));
    }

    public /* synthetic */ o(a0 a0Var, Function1 function1, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(a0Var, (i10 & 2) != 0 ? a.f31935i : function1, function0);
    }
}
