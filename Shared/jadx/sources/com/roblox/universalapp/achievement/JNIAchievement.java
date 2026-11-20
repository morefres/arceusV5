package com.roblox.universalapp.achievement;

import android.util.Log;
import androidx.annotation.Keep;
import gt.n;
import gt.o;
import ju.g1;
import ju.k;
import ju.p0;
import ju.q0;
import ju.z2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ot.f;
import ot.m;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/roblox/universalapp/achievement/JNIAchievement;", "", "<init>", "()V", "", "init", "()Ljava/lang/String;", "", "handle", "", "result", "success", "(JZ)Z", "error", "failure", "(JLjava/lang/String;)Z", "codeName", "hasAchievedForNativeAsync", "(Ljava/lang/String;J)Z", "grantAchievementForNativeAsync", "c", "()Z", "Lju/p0;", j6.b.f21518e, "Lju/p0;", "scope", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JNIAchievement {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final JNIAchievement f9804a = new JNIAchievement();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final p0 scope = q0.a(g1.b().plus(z2.b(null, 1, null)));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.universalapp.achievement.JNIAchievement$grantAchievementForNativeAsync$1", f = "JNIAchievement.kt", l = {55}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f9805t;

        /* renamed from: u, reason: collision with root package name */
        public int f9806u;

        /* renamed from: v, reason: collision with root package name */
        public int f9807v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f9808w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f9809x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ long f9810y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j10, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f9809x = str;
            this.f9810y = j10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            a aVar = new a(this.f9809x, this.f9810y, bVar);
            aVar.f9808w = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
        
            if (r5 == null) goto L38;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f9808w
                ju.p0 r0 = (ju.p0) r0
                java.lang.Object r1 = nt.c.e()
                int r2 = r8.f9807v
                r3 = 0
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L23
                if (r2 != r4) goto L1b
                java.lang.Object r0 = r8.f9805t
                ju.p0 r0 = (ju.p0) r0
                gt.o.b(r9)     // Catch: java.lang.Throwable -> L19
                goto L4f
            L19:
                r9 = move-exception
                goto L58
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                gt.o.b(r9)
                java.lang.String r9 = r8.f9809x
                gt.n$a r2 = gt.n.INSTANCE     // Catch: java.lang.Throwable -> L19
                com.roblox.universalapp.achievement.b r2 = com.roblox.universalapp.achievement.b.f9827a     // Catch: java.lang.Throwable -> L19
                ql.b r2 = r2.a()     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L52
                ql.l r6 = new ql.l     // Catch: java.lang.Throwable -> L19
                r7 = 2
                r6.<init>(r9, r5, r7, r5)     // Catch: java.lang.Throwable -> L19
                java.lang.Object r9 = ot.l.a(r0)     // Catch: java.lang.Throwable -> L19
                r8.f9808w = r9     // Catch: java.lang.Throwable -> L19
                java.lang.Object r9 = ot.l.a(r0)     // Catch: java.lang.Throwable -> L19
                r8.f9805t = r9     // Catch: java.lang.Throwable -> L19
                r8.f9806u = r3     // Catch: java.lang.Throwable -> L19
                r8.f9807v = r4     // Catch: java.lang.Throwable -> L19
                java.lang.Object r9 = r2.f(r6, r8)     // Catch: java.lang.Throwable -> L19
                if (r9 != r1) goto L4f
                return r1
            L4f:
                java.lang.Long r9 = (java.lang.Long) r9     // Catch: java.lang.Throwable -> L19
                goto L53
            L52:
                r9 = r5
            L53:
                java.lang.Object r9 = gt.n.b(r9)     // Catch: java.lang.Throwable -> L19
                goto L62
            L58:
                gt.n$a r0 = gt.n.INSTANCE
                java.lang.Object r9 = gt.o.a(r9)
                java.lang.Object r9 = gt.n.b(r9)
            L62:
                long r0 = r8.f9810y
                boolean r2 = gt.n.h(r9)
                if (r2 == 0) goto L75
                r2 = r9
                java.lang.Long r2 = (java.lang.Long) r2
                com.roblox.universalapp.achievement.JNIAchievement r6 = com.roblox.universalapp.achievement.JNIAchievement.f9804a
                if (r2 == 0) goto L72
                r3 = r4
            L72:
                com.roblox.universalapp.achievement.JNIAchievement.b(r6, r0, r3)
            L75:
                long r0 = r8.f9810y
                java.lang.Throwable r9 = gt.n.e(r9)
                if (r9 == 0) goto L9d
                com.roblox.universalapp.achievement.JNIAchievement r2 = com.roblox.universalapp.achievement.JNIAchievement.f9804a
                java.lang.String r3 = r9.getMessage()
                if (r3 == 0) goto L8f
                boolean r4 = kotlin.text.StringsKt.p0(r3)
                if (r4 == 0) goto L8c
                goto L8d
            L8c:
                r5 = r3
            L8d:
                if (r5 != 0) goto L97
            L8f:
                java.lang.Class r9 = r9.getClass()
                java.lang.String r5 = r9.getName()
            L97:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
                com.roblox.universalapp.achievement.JNIAchievement.a(r2, r0, r5)
            L9d:
                kotlin.Unit r9 = kotlin.Unit.f22894a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.universalapp.achievement.JNIAchievement.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.universalapp.achievement.JNIAchievement$hasAchievedForNativeAsync$1", f = "JNIAchievement.kt", l = {40}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f9811t;

        /* renamed from: u, reason: collision with root package name */
        public int f9812u;

        /* renamed from: v, reason: collision with root package name */
        public int f9813v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f9814w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f9815x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ long f9816y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, long j10, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f9815x = str;
            this.f9816y = j10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            b bVar2 = new b(this.f9815x, this.f9816y, bVar);
            bVar2.f9814w = obj;
            return bVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
        
            if (r3 == null) goto L38;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f9814w
                ju.p0 r0 = (ju.p0) r0
                java.lang.Object r1 = nt.c.e()
                int r2 = r7.f9813v
                r3 = 0
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L23
                if (r2 != r5) goto L1b
                java.lang.Object r0 = r7.f9811t
                ju.p0 r0 = (ju.p0) r0
                gt.o.b(r8)     // Catch: java.lang.Throwable -> L19
                goto L49
            L19:
                r8 = move-exception
                goto L52
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                gt.o.b(r8)
                java.lang.String r8 = r7.f9815x
                gt.n$a r2 = gt.n.INSTANCE     // Catch: java.lang.Throwable -> L19
                com.roblox.universalapp.achievement.b r2 = com.roblox.universalapp.achievement.b.f9827a     // Catch: java.lang.Throwable -> L19
                ql.b r2 = r2.a()     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L4c
                java.lang.Object r6 = ot.l.a(r0)     // Catch: java.lang.Throwable -> L19
                r7.f9814w = r6     // Catch: java.lang.Throwable -> L19
                java.lang.Object r0 = ot.l.a(r0)     // Catch: java.lang.Throwable -> L19
                r7.f9811t = r0     // Catch: java.lang.Throwable -> L19
                r7.f9812u = r4     // Catch: java.lang.Throwable -> L19
                r7.f9813v = r5     // Catch: java.lang.Throwable -> L19
                java.lang.Object r8 = r2.g(r8, r7)     // Catch: java.lang.Throwable -> L19
                if (r8 != r1) goto L49
                return r1
            L49:
                ql.a r8 = (ql.Achievement) r8     // Catch: java.lang.Throwable -> L19
                goto L4d
            L4c:
                r8 = r3
            L4d:
                java.lang.Object r8 = gt.n.b(r8)     // Catch: java.lang.Throwable -> L19
                goto L5c
            L52:
                gt.n$a r0 = gt.n.INSTANCE
                java.lang.Object r8 = gt.o.a(r8)
                java.lang.Object r8 = gt.n.b(r8)
            L5c:
                long r0 = r7.f9816y
                boolean r2 = gt.n.h(r8)
                if (r2 == 0) goto L6f
                r2 = r8
                ql.a r2 = (ql.Achievement) r2
                com.roblox.universalapp.achievement.JNIAchievement r6 = com.roblox.universalapp.achievement.JNIAchievement.f9804a
                if (r2 == 0) goto L6c
                r4 = r5
            L6c:
                com.roblox.universalapp.achievement.JNIAchievement.b(r6, r0, r4)
            L6f:
                long r0 = r7.f9816y
                java.lang.Throwable r8 = gt.n.e(r8)
                if (r8 == 0) goto L97
                com.roblox.universalapp.achievement.JNIAchievement r2 = com.roblox.universalapp.achievement.JNIAchievement.f9804a
                java.lang.String r4 = r8.getMessage()
                if (r4 == 0) goto L89
                boolean r5 = kotlin.text.StringsKt.p0(r4)
                if (r5 == 0) goto L86
                goto L87
            L86:
                r3 = r4
            L87:
                if (r3 != 0) goto L91
            L89:
                java.lang.Class r8 = r8.getClass()
                java.lang.String r3 = r8.getName()
            L91:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                com.roblox.universalapp.achievement.JNIAchievement.a(r2, r0, r3)
            L97:
                kotlin.Unit r8 = kotlin.Unit.f22894a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.universalapp.achievement.JNIAchievement.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean failure(long handle, String error);

    @Keep
    private static final boolean grantAchievementForNativeAsync(String codeName, long handle) {
        k.d(scope, null, null, new a(codeName, handle, null), 3, null);
        return true;
    }

    @Keep
    private static final boolean hasAchievedForNativeAsync(String codeName, long handle) {
        k.d(scope, null, null, new b(codeName, handle, null), 3, null);
        return true;
    }

    private final native String init();

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean success(long handle, boolean result);

    public final boolean c() {
        Object b10;
        try {
            n.Companion companion = n.INSTANCE;
            b10 = n.b(ql.k.valueOf(init()));
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            b10 = n.b(o.a(th2));
        }
        Throwable e10 = n.e(b10);
        if (e10 != null) {
            Log.e("rbx.achievement.jni", "failed to register with JNI: " + e10.getMessage(), e10);
            b10 = n.b(ql.k.f29889a);
        }
        if (n.h(b10)) {
            Log.i("rbx.achievement.jni", "Init result: " + ((ql.k) b10));
        }
        o.b(b10);
        return b10 != ql.k.f29889a;
    }
}
