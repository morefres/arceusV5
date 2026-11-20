package bi;

import android.util.Log;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.gms.tasks.Task;
import gt.n;
import gt.o;
import ie.q;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql.Achievement;
import ql.RemoteAchievement;
import ql.v;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\bH\u0096@¢\u0006\u0004\b\u0007\u0010\u000eJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0013*\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u0013\u0010\u0017\u001a\u00020\u0010*\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u0019"}, d2 = {"Lbi/k;", "Lql/v;", "Lda/a;", "achievementsClient", "<init>", "(Lda/a;)V", "Lql/a;", ve.a.f33391e, "Lgt/n;", "", j6.b.f21518e, "(Lql/a;Lmt/b;)Ljava/lang/Object;", "", "Lql/u;", "(Lmt/b;)Ljava/lang/Object;", "Lcom/google/android/gms/games/achievement/Achievement;", "Lbi/l;", "h", "(Lcom/google/android/gms/games/achievement/Achievement;)Ljava/lang/String;", "Lbi/j;", "g", "(Lql/a;)Ljava/lang/String;", "f", "i", "Lda/a;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class k implements v {

    /* renamed from: c, reason: collision with root package name */
    public static final q<l, j> f4244c = new q.a().f(l.a(l.b("AchievementOneNameManyFaces")), j.a(j.b("CgkIyM-UotMBEAIQAg"))).f(l.a(bi.b.c().getRobloxId()), j.a(bi.b.c().getPlayId())).f(l.a(bi.b.b().getRobloxId()), j.a(bi.b.b().getPlayId())).f(l.a(bi.b.d().getRobloxId()), j.a(bi.b.d().getPlayId())).f(l.a(l.b("AchievementMarathon")), j.a(j.b("CgkIyM-UotMBEAIQBg"))).f(l.a(l.b("AchievementFoursCompany")), j.a(j.b("CgkIyM-UotMBEAIQBw"))).f(l.a(l.b("AchievementPollster")), j.a(j.b("CgkIyM-UotMBEAIQCA"))).f(l.a(l.b("AchievementScout")), j.a(j.b("CgkIyM-UotMBEAIQCQ"))).f(l.a(l.b("AchievementExplorer")), j.a(j.b("CgkIyM-UotMBEAIQCg"))).f(l.a(l.b("AchievementTrailblazer")), j.a(j.b("CgkIyM-UotMBEAIQCw"))).f(l.a(l.b("AchievementStrengthInNumbers")), j.a(j.b("CgkIyM-UotMBEAIQDA"))).a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final da.a achievementsClient;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository", f = "PlayStoreRemoteAchievementRepository.kt", l = {MotionEventCompat.AXIS_GENERIC_12}, m = "grantAchievement-gIAlu-s", v = 1)
    public static final class b extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f4246t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f4247u;

        /* renamed from: w, reason: collision with root package name */
        public int f4249w;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4247u = obj;
            this.f4249w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object b = k.this.b(null, this);
            return b == nt.c.e() ? b : n.a(b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lgt/n;", "", "<anonymous>", "(Lju/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository$grantAchievement$2", f = "PlayStoreRemoteAchievementRepository.kt", l = {MotionEventCompat.AXIS_GENERIC_15}, m = "invokeSuspend", v = 1)
    public static final class c extends ot.m implements Function2<p0, mt.b<? super n<? extends Boolean>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f4250t;

        /* renamed from: u, reason: collision with root package name */
        public Object f4251u;

        /* renamed from: v, reason: collision with root package name */
        public int f4252v;

        /* renamed from: w, reason: collision with root package name */
        public int f4253w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f4254x;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Achievement f4256z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Achievement achievement, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f4256z = achievement;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            c cVar = k.this.new c(this.f4256z, bVar);
            cVar.f4254x = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, mt.b<? super n<? extends Boolean>> bVar) {
            return invoke2(p0Var, (mt.b<? super n<Boolean>>) bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object b;
            p0 p0Var = (p0) this.f4254x;
            Object e10 = nt.c.e();
            int i10 = this.f4253w;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    k kVar = k.this;
                    Achievement achievement = this.f4256z;
                    n.Companion companion = n.INSTANCE;
                    String g10 = kVar.g(achievement);
                    j a10 = g10 != null ? j.a(g10) : null;
                    if (a10 == null) {
                        throw new IllegalStateException((achievement.getCodeName() + " has no mapping to Play store achievement").toString());
                    }
                    String id2 = a10.getId();
                    Task<Void> b10 = kVar.achievementsClient.b(id2);
                    Intrinsics.checkNotNullExpressionValue(b10, "unlockImmediate(...)");
                    this.f4254x = ot.l.a(p0Var);
                    this.f4250t = ot.l.a(p0Var);
                    this.f4251u = ot.l.a(id2);
                    this.f4252v = 0;
                    this.f4253w = 1;
                    if (uu.b.a(b10, this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                b = n.b(ot.b.a(true));
            } catch (Throwable th2) {
                n.Companion companion2 = n.INSTANCE;
                b = n.b(o.a(th2));
            }
            Throwable e11 = n.e(b);
            if (e11 != null) {
                try {
                    Log.w("rbx.achievements.playgames", "Unable to grant achievement", e11);
                    b = n.b(ot.b.a(false));
                } catch (Throwable th3) {
                    n.Companion companion3 = n.INSTANCE;
                    b = n.b(o.a(th3));
                }
            }
            return n.a(b);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, mt.b<? super n<Boolean>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository", f = "PlayStoreRemoteAchievementRepository.kt", l = {57}, m = "listGrantedAchievements-IoAF18A", v = 1)
    public static final class d extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f4257t;

        /* renamed from: v, reason: collision with root package name */
        public int f4259v;

        public d(mt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4257t = obj;
            this.f4259v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object a10 = k.this.a(this);
            return a10 == nt.c.e() ? a10 : n.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Lgt/n;", "", "Lql/u;", "<anonymous>", "(Lju/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository$listGrantedAchievements$2", f = "PlayStoreRemoteAchievementRepository.kt", l = {59}, m = "invokeSuspend", v = 1)
    public static final class e extends ot.m implements Function2<p0, mt.b<? super n<? extends List<? extends RemoteAchievement>>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f4260t;

        /* renamed from: u, reason: collision with root package name */
        public Object f4261u;

        /* renamed from: v, reason: collision with root package name */
        public int f4262v;

        /* renamed from: w, reason: collision with root package name */
        public int f4263w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f4264x;

        public e(mt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            e eVar = k.this.new e(bVar);
            eVar.f4264x = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, mt.b<? super n<? extends List<? extends RemoteAchievement>>> bVar) {
            return invoke2(p0Var, (mt.b<? super n<? extends List<RemoteAchievement>>>) bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object b;
            k kVar;
            List arrayList;
            p0 p0Var = (p0) this.f4264x;
            Object e10 = nt.c.e();
            int i10 = this.f4263w;
            int i11 = 0;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    k kVar2 = k.this;
                    n.Companion companion = n.INSTANCE;
                    Task<da.b<ea.a>> a10 = kVar2.achievementsClient.a(false);
                    Intrinsics.checkNotNullExpressionValue(a10, "load(...)");
                    this.f4264x = ot.l.a(p0Var);
                    this.f4260t = kVar2;
                    this.f4261u = ot.l.a(p0Var);
                    this.f4262v = 0;
                    this.f4263w = 1;
                    Object a11 = uu.b.a(a10, this);
                    if (a11 == e10) {
                        return e10;
                    }
                    kVar = kVar2;
                    obj = a11;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = (k) this.f4260t;
                    o.b(obj);
                }
                ea.a aVar = (ea.a) ((da.b) obj).a();
                if (aVar != null) {
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        for (com.google.android.gms.games.achievement.Achievement achievement : aVar) {
                            com.google.android.gms.games.achievement.Achievement achievement2 = achievement;
                            Intrinsics.checkNotNull(achievement2);
                            if (kVar.h(achievement2) != null && achievement2.getState() == 0) {
                                arrayList2.add(achievement);
                            }
                        }
                        arrayList = new ArrayList();
                        int size = arrayList2.size();
                        while (true) {
                            RemoteAchievement remoteAchievement = null;
                            if (i11 >= size) {
                                break;
                            }
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            com.google.android.gms.games.achievement.Achievement achievement3 = (com.google.android.gms.games.achievement.Achievement) obj2;
                            Intrinsics.checkNotNull(achievement3);
                            String h10 = kVar.h(achievement3);
                            if (h10 != null) {
                                String id2 = l.a(h10).getId();
                                Instant ofEpochMilli = Instant.ofEpochMilli(achievement3.g1());
                                Intrinsics.checkNotNullExpressionValue(ofEpochMilli, "ofEpochMilli(...)");
                                remoteAchievement = new RemoteAchievement(id2, ofEpochMilli);
                            }
                            if (remoteAchievement != null) {
                                arrayList.add(remoteAchievement);
                            }
                        }
                        tt.c.a(aVar, null);
                    } finally {
                    }
                } else {
                    arrayList = p.k();
                }
                b = n.b(arrayList);
            } catch (Throwable th2) {
                n.Companion companion2 = n.INSTANCE;
                b = n.b(o.a(th2));
            }
            Throwable e11 = n.e(b);
            if (e11 != null) {
                Log.w("rbx.achievements.playgames", "Unable to list Google Play Games Achievements", e11);
                b = n.b(p.k());
            }
            return n.a(b);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, mt.b<? super n<? extends List<RemoteAchievement>>> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public k(@NotNull da.a achievementsClient) {
        Intrinsics.checkNotNullParameter(achievementsClient, "achievementsClient");
        this.achievementsClient = achievementsClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ql.v
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull mt.b<? super gt.n<? extends java.util.List<ql.RemoteAchievement>>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof bi.k.d
            if (r0 == 0) goto L13
            r0 = r6
            bi.k$d r0 = (bi.k.d) r0
            int r1 = r0.f4259v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4259v = r1
            goto L18
        L13:
            bi.k$d r0 = new bi.k$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f4257t
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f4259v
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            gt.o.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            gt.o.b(r6)
            ju.l0 r6 = ju.g1.b()
            bi.k$e r2 = new bi.k$e
            r4 = 0
            r2.<init>(r4)
            r0.f4259v = r3
            java.lang.Object r6 = ju.i.g(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            gt.n r6 = (gt.n) r6
            java.lang.Object r6 = r6.getValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.k.a(mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ql.v
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@org.jetbrains.annotations.NotNull ql.Achievement r6, @org.jetbrains.annotations.NotNull mt.b<? super gt.n<java.lang.Boolean>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof bi.k.b
            if (r0 == 0) goto L13
            r0 = r7
            bi.k$b r0 = (bi.k.b) r0
            int r1 = r0.f4249w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4249w = r1
            goto L18
        L13:
            bi.k$b r0 = new bi.k$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4247u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f4249w
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f4246t
            ql.a r6 = (ql.Achievement) r6
            gt.o.b(r7)
            goto L51
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            gt.o.b(r7)
            ju.l0 r7 = ju.g1.b()
            bi.k$c r2 = new bi.k$c
            r4 = 0
            r2.<init>(r6, r4)
            java.lang.Object r6 = ot.l.a(r6)
            r0.f4246t = r6
            r0.f4249w = r3
            java.lang.Object r7 = ju.i.g(r7, r2, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            gt.n r7 = (gt.n) r7
            java.lang.Object r6 = r7.getValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.k.b(ql.a, mt.b):java.lang.Object");
    }

    public final String f(com.google.android.gms.games.achievement.Achievement achievement) {
        String F0 = achievement.F0();
        Intrinsics.checkNotNullExpressionValue(F0, "getAchievementId(...)");
        return j.b(F0);
    }

    public final String g(Achievement achievement) {
        j jVar = f4244c.get(l.a(i(achievement)));
        if (jVar != null) {
            return jVar.getId();
        }
        return null;
    }

    public final String h(com.google.android.gms.games.achievement.Achievement achievement) {
        l lVar = f4244c.r().get(j.a(f(achievement)));
        if (lVar != null) {
            return lVar.getId();
        }
        return null;
    }

    public final String i(Achievement achievement) {
        return l.b(achievement.getCodeName());
    }
}
