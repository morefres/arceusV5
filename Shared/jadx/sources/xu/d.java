package xu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wu.b0;
import wu.h0;
import wu.r0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\r\u001a)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aH\u0010\u001e\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001d\u0010 \u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lwu/l;", "Lwu/h0;", "path", "Lwu/k;", "g", "(Lwu/l;Lwu/h0;)Lwu/k;", "", "e", "(Lwu/l;Lwu/h0;)Z", "dir", "mustCreate", "", "c", "(Lwu/l;Lwu/h0;Z)V", Payload.SOURCE, "target", j6.b.f21518e, "(Lwu/l;Lwu/h0;Lwu/h0;)V", "fileOrDirectory", "mustExist", rl.d.f30696a, "followSymlinks", "Lkotlin/sequences/Sequence;", "f", "(Lwu/l;Lwu/h0;Z)Lkotlin/sequences/Sequence;", "Lhu/h;", "fileSystem", "Lkotlin/collections/i;", "stack", "postorder", ve.a.f33391e, "(Lhu/h;Lwu/l;Lkotlin/collections/i;Lwu/h0;ZZLmt/b;)Ljava/lang/Object;", "h", "(Lwu/l;Lwu/h0;)Lwu/h0;", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "okio.internal.-FileSystem", f = "FileSystem.kt", l = {116, 135, 145}, m = "collectRecursively", v = 1)
    public static final class a extends ot.d {
        public Object A;
        public boolean B;
        public boolean C;
        public int D;
        public /* synthetic */ Object E;
        public int F;

        /* renamed from: t, reason: collision with root package name */
        public Object f36106t;

        /* renamed from: u, reason: collision with root package name */
        public Object f36107u;

        /* renamed from: v, reason: collision with root package name */
        public Object f36108v;

        /* renamed from: w, reason: collision with root package name */
        public Object f36109w;

        /* renamed from: x, reason: collision with root package name */
        public Object f36110x;

        /* renamed from: y, reason: collision with root package name */
        public Object f36111y;

        /* renamed from: z, reason: collision with root package name */
        public Object f36112z;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.E = obj;
            this.F |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return d.a(null, null, null, null, false, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhu/h;", "Lwu/h0;", "", "<anonymous>", "(Lhu/h;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", l = {75}, m = "invokeSuspend", v = 1)
    public static final class b extends ot.k implements Function2<hu.h<? super h0>, mt.b<? super Unit>, Object> {

        /* renamed from: u, reason: collision with root package name */
        public int f36113u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f36114v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ wu.l f36115w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ h0 f36116x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wu.l lVar, h0 h0Var, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f36115w = lVar;
            this.f36116x = h0Var;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            b bVar2 = new b(this.f36115w, this.f36116x, bVar);
            bVar2.f36114v = obj;
            return bVar2;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            hu.h hVar = (hu.h) this.f36114v;
            Object e10 = nt.c.e();
            int i10 = this.f36113u;
            if (i10 == 0) {
                gt.o.b(obj);
                wu.l lVar = this.f36115w;
                kotlin.collections.i iVar = new kotlin.collections.i();
                h0 h0Var = this.f36116x;
                this.f36114v = ot.l.a(hVar);
                this.f36113u = 1;
                if (d.a(hVar, lVar, iVar, h0Var, false, true, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hu.h<? super h0> hVar, mt.b<? super Unit> bVar) {
            return ((b) create(hVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhu/h;", "Lwu/h0;", "", "<anonymous>", "(Lhu/h;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", l = {96}, m = "invokeSuspend", v = 1)
    public static final class c extends ot.k implements Function2<hu.h<? super h0>, mt.b<? super Unit>, Object> {
        public final /* synthetic */ wu.l A;
        public final /* synthetic */ boolean B;

        /* renamed from: u, reason: collision with root package name */
        public Object f36117u;

        /* renamed from: v, reason: collision with root package name */
        public Object f36118v;

        /* renamed from: w, reason: collision with root package name */
        public Object f36119w;

        /* renamed from: x, reason: collision with root package name */
        public int f36120x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f36121y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ h0 f36122z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h0 h0Var, wu.l lVar, boolean z10, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f36122z = h0Var;
            this.A = lVar;
            this.B = z10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            c cVar = new c(this.f36122z, this.A, this.B, bVar);
            cVar.f36121y = obj;
            return cVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Iterator<h0> it;
            kotlin.collections.i iVar;
            hu.h hVar = (hu.h) this.f36121y;
            Object e10 = nt.c.e();
            int i10 = this.f36120x;
            if (i10 == 0) {
                gt.o.b(obj);
                kotlin.collections.i iVar2 = new kotlin.collections.i();
                iVar2.addLast(this.f36122z);
                it = this.A.list(this.f36122z).iterator();
                iVar = iVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f36118v;
                iVar = (kotlin.collections.i) this.f36117u;
                gt.o.b(obj);
            }
            Iterator<h0> it2 = it;
            while (it2.hasNext()) {
                h0 next = it2.next();
                wu.l lVar = this.A;
                boolean z10 = this.B;
                this.f36121y = hVar;
                this.f36117u = iVar;
                this.f36118v = it2;
                this.f36119w = ot.l.a(next);
                this.f36120x = 1;
                if (d.a(hVar, lVar, iVar, next, z10, false, this) == e10) {
                    return e10;
                }
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hu.h<? super h0> hVar, mt.b<? super Unit> bVar) {
            return ((c) create(hVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01cb, code lost:
    
        if (r10.a(r1, r4) == r5) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0110, code lost:
    
        if (r0 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0112, code lost:
    
        if (r11 != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0114, code lost:
    
        r6.addLast(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011b, code lost:
    
        r13 = r1;
        r1 = r6;
        r6 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0190, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00c7, code lost:
    
        if (r17.a(r1, r4) == r5) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0127 A[Catch: all -> 0x017e, TRY_LEAVE, TryCatch #2 {all -> 0x017e, blocks: (B:23:0x0121, B:25:0x0127), top: B:22:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0173 -> B:21:0x0086). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull hu.h<? super wu.h0> r17, @org.jetbrains.annotations.NotNull wu.l r18, @org.jetbrains.annotations.NotNull kotlin.collections.i<wu.h0> r19, @org.jetbrains.annotations.NotNull wu.h0 r20, boolean r21, boolean r22, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xu.d.a(hu.h, wu.l, kotlin.collections.i, wu.h0, boolean, boolean, mt.b):java.lang.Object");
    }

    public static final void b(@NotNull wu.l lVar, @NotNull h0 source, @NotNull h0 target) {
        Throwable th2;
        Long l10;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        r0 source2 = lVar.source(source);
        Throwable th3 = null;
        try {
            wu.f b10 = b0.b(wu.l.sink$default(lVar, target, false, 2, null));
            try {
                l10 = Long.valueOf(b10.d3(source2));
                if (b10 != null) {
                    try {
                        b10.close();
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                th2 = null;
            } catch (Throwable th5) {
                if (b10 != null) {
                    try {
                        b10.close();
                    } catch (Throwable th6) {
                        gt.a.a(th5, th6);
                    }
                }
                th2 = th5;
                l10 = null;
            }
        } catch (Throwable th7) {
            if (source2 != null) {
                try {
                    source2.close();
                } catch (Throwable th8) {
                    gt.a.a(th7, th8);
                }
            }
            th3 = th7;
        }
        if (th2 != null) {
            throw th2;
        }
        l10.longValue();
        if (source2 != null) {
            try {
                source2.close();
            } catch (Throwable th9) {
                th3 = th9;
            }
        }
        if (th3 != null) {
            throw th3;
        }
    }

    public static final void c(@NotNull wu.l lVar, @NotNull h0 dir, boolean z10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        kotlin.collections.i iVar = new kotlin.collections.i();
        for (h0 h0Var = dir; h0Var != null && !lVar.exists(h0Var); h0Var = h0Var.j()) {
            iVar.addFirst(h0Var);
        }
        if (z10 && iVar.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = iVar.iterator();
        while (it.hasNext()) {
            wu.l.createDirectory$default(lVar, (h0) it.next(), false, 2, null);
        }
    }

    public static final void d(@NotNull wu.l lVar, @NotNull h0 fileOrDirectory, boolean z10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        Iterator it = hu.i.b(new b(lVar, fileOrDirectory, null)).iterator();
        while (it.hasNext()) {
            lVar.delete((h0) it.next(), z10 && !it.hasNext());
        }
    }

    public static final boolean e(@NotNull wu.l lVar, @NotNull h0 path) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return lVar.metadataOrNull(path) != null;
    }

    @NotNull
    public static final Sequence<h0> f(@NotNull wu.l lVar, @NotNull h0 dir, boolean z10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        return hu.i.b(new c(dir, lVar, z10, null));
    }

    @NotNull
    public static final wu.k g(@NotNull wu.l lVar, @NotNull h0 path) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        wu.k metadataOrNull = lVar.metadataOrNull(path);
        if (metadataOrNull != null) {
            return metadataOrNull;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    @Nullable
    public static final h0 h(@NotNull wu.l lVar, @NotNull h0 path) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        h0 symlinkTarget = lVar.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        h0 j10 = path.j();
        Intrinsics.checkNotNull(j10);
        return j10.o(symlinkTarget);
    }
}
