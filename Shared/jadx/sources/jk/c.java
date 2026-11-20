package jk;

import android.content.Context;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import ek.q;
import gt.n;
import gt.o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import ju.g1;
import ju.i;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000e\u0010\rJ \u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\nJ!\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljk/c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "newData", "", j6.b.f21518e, "(Landroid/content/Context;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "Lgt/n;", rl.d.f30696a, "(Landroid/content/Context;Lmt/b;)Ljava/lang/Object;", ve.a.f33391e, "data", "e", "fileName", "c", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider$isCacheStale$2", f = "RecentlyPlayedWidgetFileProvider.kt", l = {13}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, mt.b<? super Boolean>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f21839t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Context f21841v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f21842w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f21841v = context;
            this.f21842w = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return c.this.new b(this.f21841v, this.f21842w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            Object e10 = nt.c.e();
            int i10 = this.f21839t;
            if (i10 == 0) {
                o.b(obj);
                c cVar = c.this;
                Context context = this.f21841v;
                this.f21839t = 1;
                d10 = cVar.d(context, this);
                if (d10 == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                d10 = ((n) obj).getValue();
            }
            String str = this.f21842w;
            if (n.h(d10)) {
                d10 = ot.b.a(!Intrinsics.c((String) d10, str));
            }
            Object b = n.b(d10);
            Throwable e11 = n.e(b);
            if (e11 == null) {
                return b;
            }
            q.f("RecentlyPlayedWidgetFileProvider", "Encountered error while checking if recently played cache is stale", e11);
            return ot.b.a(true);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Boolean> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider", f = "RecentlyPlayedWidgetFileProvider.kt", l = {MotionEventCompat.AXIS_WHEEL}, m = "readCache-gIAlu-s", v = 1)
    /* renamed from: jk.c$c, reason: collision with other inner class name */
    public static final class C0385c extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f21843t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f21844u;

        /* renamed from: w, reason: collision with root package name */
        public int f21846w;

        public C0385c(mt.b<? super C0385c> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21844u = obj;
            this.f21846w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object d10 = c.this.d(null, this);
            return d10 == nt.c.e() ? d10 : n.a(d10);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lgt/n;", "", "<anonymous>", "(Lju/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider$readCache$2", f = "RecentlyPlayedWidgetFileProvider.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, mt.b<? super n<? extends String>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f21847t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Context f21849v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f21849v = context;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return c.this.new d(this.f21849v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, mt.b<? super n<? extends String>> bVar) {
            return invoke2(p0Var, (mt.b<? super n<String>>) bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f21847t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return n.a(c.this.c(this.f21849v, "recently_played_widget_data.json"));
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, mt.b<? super n<String>> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider$writeCache$2", f = "RecentlyPlayedWidgetFileProvider.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<p0, mt.b<? super Boolean>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f21850t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f21851u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f21852v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, String str, mt.b<? super e> bVar) {
            super(2, bVar);
            this.f21851u = context;
            this.f21852v = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new e(this.f21851u, this.f21852v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f21850t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            boolean z10 = false;
            try {
                FileOutputStream openFileOutput = this.f21851u.openFileOutput("recently_played_widget_data.json", 0);
                try {
                    byte[] bytes = this.f21852v.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    openFileOutput.write(bytes);
                    Unit unit = Unit.f22894a;
                    tt.c.a(openFileOutput, null);
                    z10 = true;
                } finally {
                }
            } catch (IOException e10) {
                q.f("RecentlyPlayedWidgetFileProvider", "Error writing recently played cache", e10);
            }
            return ot.b.a(z10);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Boolean> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Nullable
    public final Object a(@NotNull Context context, @NotNull mt.b<? super Boolean> bVar) {
        File file = new File(context.getFilesDir(), "recently_played_widget_data.json");
        return ot.b.a(file.exists() ? file.delete() : true);
    }

    @Nullable
    public final Object b(@NotNull Context context, @NotNull String str, @NotNull mt.b<? super Boolean> bVar) {
        return i.g(g1.b(), new b(context, str, null), bVar);
    }

    @NotNull
    public final Object c(@NotNull Context readBlocking, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(readBlocking, "$this$readBlocking");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        try {
            n.Companion companion = n.INSTANCE;
            File file = new File(readBlocking.getFilesDir(), fileName);
            return n.b(file.exists() ? tt.i.i(file, null, 1, null) : null);
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            return n.b(o.a(th2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull android.content.Context r6, @org.jetbrains.annotations.NotNull mt.b<? super gt.n<java.lang.String>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof jk.c.C0385c
            if (r0 == 0) goto L13
            r0 = r7
            jk.c$c r0 = (jk.c.C0385c) r0
            int r1 = r0.f21846w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21846w = r1
            goto L18
        L13:
            jk.c$c r0 = new jk.c$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f21844u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f21846w
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f21843t
            android.content.Context r6 = (android.content.Context) r6
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
            jk.c$d r2 = new jk.c$d
            r4 = 0
            r2.<init>(r6, r4)
            java.lang.Object r6 = ot.l.a(r6)
            r0.f21843t = r6
            r0.f21846w = r3
            java.lang.Object r7 = ju.i.g(r7, r2, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            gt.n r7 = (gt.n) r7
            java.lang.Object r6 = r7.getValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jk.c.d(android.content.Context, mt.b):java.lang.Object");
    }

    @Nullable
    public final Object e(@NotNull Context context, @NotNull String str, @NotNull mt.b<? super Boolean> bVar) {
        return i.g(g1.b(), new e(context, str, null), bVar);
    }
}
