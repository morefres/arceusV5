package com.roblox.client.scheduledwork;

import android.content.Context;
import androidx.core.text.HtmlCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.d;
import ot.f;
import rg.a1;
import ve.a;
import x5.p0;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/roblox/client/scheduledwork/FlagFetchWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lmt/b;)Ljava/lang/Object;", "", "c", "()Z", "", j6.b.f21518e, "()V", a.f33391e, "Landroid/content/Context;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FlagFetchWorker extends CoroutineWorker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.scheduledwork.FlagFetchWorker", f = "FlagFetchWorker.kt", l = {HtmlCompat.FROM_HTML_MODE_COMPACT}, m = "doWork", v = 1)
    public static final class b extends d {

        /* renamed from: t, reason: collision with root package name */
        public boolean f9387t;

        /* renamed from: u, reason: collision with root package name */
        public int f9388u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f9389v;

        /* renamed from: x, reason: collision with root package name */
        public int f9391x;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9389v = obj;
            this.f9391x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return FlagFetchWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagFetchWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        this.context = context;
    }

    public final void b() {
        p0.INSTANCE.a(this.context).a("fetch_flags");
    }

    public final boolean c() {
        return System.currentTimeMillis() - a1.U(this.context).getLong("last_startup_time", 0L) <= TimeUnit.DAYS.toMillis(8L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f6 A[Catch: all -> 0x0038, Exception -> 0x003c, CancellationException -> 0x0040, TRY_LEAVE, TryCatch #7 {CancellationException -> 0x0040, Exception -> 0x003c, all -> 0x0038, blocks: (B:12:0x0033, B:13:0x00ee, B:15:0x00f6, B:39:0x0136, B:41:0x0154, B:43:0x015a), top: B:11:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0136 A[Catch: all -> 0x0038, Exception -> 0x003c, CancellationException -> 0x0040, TRY_ENTER, TryCatch #7 {CancellationException -> 0x0040, Exception -> 0x003c, all -> 0x0038, blocks: (B:12:0x0033, B:13:0x00ee, B:15:0x00f6, B:39:0x0136, B:41:0x0154, B:43:0x015a), top: B:11:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // androidx.work.CoroutineWorker
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull mt.b<? super androidx.work.c.a> r13) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.scheduledwork.FlagFetchWorker.doWork(mt.b):java.lang.Object");
    }
}
