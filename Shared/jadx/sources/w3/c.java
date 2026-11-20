package w3;

import android.content.Context;
import gu.l;
import java.io.File;
import java.util.List;
import ju.p0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R,\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lw3/c;", "Lcu/a;", "Landroid/content/Context;", "Lt3/i;", "Lx3/f;", "", "name", "Lu3/b;", "corruptionHandler", "Lkotlin/Function1;", "", "Lt3/g;", "produceMigrations", "Lju/p0;", "scope", "<init>", "(Ljava/lang/String;Lu3/b;Lkotlin/jvm/functions/Function1;Lju/p0;)V", "thisRef", "Lgu/l;", "property", j6.b.f21518e, "(Landroid/content/Context;Lgu/l;)Lt3/i;", ve.a.f33391e, "Ljava/lang/String;", "Lu3/b;", "c", "Lkotlin/jvm/functions/Function1;", rl.d.f30696a, "Lju/p0;", "", "e", "Ljava/lang/Object;", "lock", "f", "Lt3/i;", "INSTANCE", "datastore-preferences_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c implements cu.a<Context, t3.i<x3.f>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final u3.b<x3.f> corruptionHandler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<Context, List<t3.g<x3.f>>> produceMigrations;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object lock;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public volatile t3.i<x3.f> INSTANCE;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/File;", j6.b.f21518e, "()Ljava/io/File;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends m implements Function0<File> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Context f33693i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ c f33694j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, c cVar) {
            super(0);
            this.f33693i = context;
            this.f33694j = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f33693i;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f33694j.name);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull String name, @Nullable u3.b<x3.f> bVar, @NotNull Function1<? super Context, ? extends List<? extends t3.g<x3.f>>> produceMigrations, @NotNull p0 scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.name = name;
        this.corruptionHandler = bVar;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // cu.a
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t3.i<x3.f> getValue(@NotNull Context thisRef, @NotNull l<?> property) {
        t3.i<x3.f> iVar;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        t3.i<x3.f> iVar2 = this.INSTANCE;
        if (iVar2 != null) {
            return iVar2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    x3.e eVar = x3.e.f35025a;
                    u3.b<x3.f> bVar = this.corruptionHandler;
                    Function1<Context, List<t3.g<x3.f>>> function1 = this.produceMigrations;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.INSTANCE = eVar.b(bVar, function1.invoke(applicationContext), this.scope, new a(applicationContext, this));
                }
                iVar = this.INSTANCE;
                Intrinsics.checkNotNull(iVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }
}
