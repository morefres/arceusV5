package x3;

import java.io.File;
import java.util.List;
import ju.p0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t3.e0;
import t3.o;
import tt.k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011JU\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lx3/e;", "", "<init>", "()V", "Lu3/b;", "Lx3/f;", "corruptionHandler", "", "Lt3/g;", "migrations", "Lju/p0;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Lt3/i;", j6.b.f21518e, "(Lu3/b;Ljava/util/List;Lju/p0;Lkotlin/jvm/functions/Function0;)Lt3/i;", "Lt3/e0;", "storage", ve.a.f33391e, "(Lt3/e0;Lu3/b;Ljava/util/List;Lju/p0;)Lt3/i;", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f35025a = new e();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/File;", j6.b.f21518e, "()Ljava/io/File;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends m implements Function0<File> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0<File> f35026i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0<? extends File> function0) {
            super(0);
            this.f35026i = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File invoke = this.f35026i.invoke();
            if (Intrinsics.c(k.p(invoke), "preferences_pb")) {
                File absoluteFile = invoke.getAbsoluteFile();
                Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
                return absoluteFile;
            }
            throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    @NotNull
    public final t3.i<f> a(@NotNull e0<f> storage, @Nullable u3.b<f> corruptionHandler, @NotNull List<? extends t3.g<f>> migrations, @NotNull p0 scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new d(t3.j.f31774a.b(storage, corruptionHandler, migrations, scope));
    }

    @NotNull
    public final t3.i<f> b(@Nullable u3.b<f> corruptionHandler, @NotNull List<? extends t3.g<f>> migrations, @NotNull p0 scope, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return new d(a(new o(h.f35029a, null, new a(produceFile), 2, null), corruptionHandler, migrations, scope));
    }
}
