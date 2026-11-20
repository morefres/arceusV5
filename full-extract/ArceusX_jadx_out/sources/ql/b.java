package ql;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0097@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H§@¢\u0006\u0004\b\r\u0010\fJ(\u0010\u0012\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H§@¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00070\u00192\u0006\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001c\u001a\u00020\u000eH§@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lql/b;", "", "Lql/l;", "localAchievement", "", "f", "(Lql/l;Lmt/b;)Ljava/lang/Object;", "", "Lql/u;", "remoteAchievements", "", rl.d.f30696a, "(Ljava/util/List;Lmt/b;)Ljava/lang/Object;", "e", "", "codeNames", "Ljava/time/Instant;", "syncedAt", ve.a.f33391e, "(Ljava/util/List;Ljava/time/Instant;Lmt/b;)Ljava/lang/Object;", "Lql/a;", "h", "(Lmt/b;)Ljava/lang/Object;", "", "highWatermarkId", "Lmu/h;", "c", "(I)Lmu/h;", "codeName", "g", "(Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.universalapp.achievement.AchievementDao", f = "AchievementDao.kt", l = {48, 49}, m = "replicateRemoteAchievements$suspendImpl", v = 1)
    public static final class a extends ot.d {
        public int A;
        public /* synthetic */ Object B;
        public int D;

        /* renamed from: t, reason: collision with root package name */
        public Object f29871t;

        /* renamed from: u, reason: collision with root package name */
        public Object f29872u;

        /* renamed from: v, reason: collision with root package name */
        public Object f29873v;

        /* renamed from: w, reason: collision with root package name */
        public Object f29874w;

        /* renamed from: x, reason: collision with root package name */
        public Object f29875x;

        /* renamed from: y, reason: collision with root package name */
        public Object f29876y;

        /* renamed from: z, reason: collision with root package name */
        public int f29877z;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return b.i(b.this, null, this);
        }
    }

    static /* synthetic */ Object b(b bVar, List list, Instant instant, mt.b bVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markAchievementSynced");
        }
        if ((i10 & 2) != 0) {
            instant = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instant, "now(...)");
        }
        return bVar.a(list, instant, bVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00db A[LOOP:0: B:17:0x00d5->B:19:0x00db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Iterable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0116 -> B:11:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object i(ql.b r13, java.util.List<ql.RemoteAchievement> r14, mt.b<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ql.b.i(ql.b, java.util.List, mt.b):java.lang.Object");
    }

    @Nullable
    Object a(@NotNull List<String> list, @NotNull Instant instant, @NotNull mt.b<? super Unit> bVar);

    @NotNull
    mu.h<List<Achievement>> c(int highWatermarkId);

    @Nullable
    default Object d(@NotNull List<RemoteAchievement> list, @NotNull mt.b<? super Unit> bVar) {
        return i(this, list, bVar);
    }

    @Nullable
    Object e(@NotNull List<RemoteAchievement> list, @NotNull mt.b<? super Unit> bVar);

    @Nullable
    Object f(@NotNull LocalAchievement localAchievement, @NotNull mt.b<? super Long> bVar);

    @Nullable
    Object g(@NotNull String str, @NotNull mt.b<? super Achievement> bVar);

    @Nullable
    Object h(@NotNull mt.b<? super List<Achievement>> bVar);
}
