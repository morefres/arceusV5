package t3;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.mlkit.common.MlKitException;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lt3/q;", "T", "Lt3/n;", "Lt3/k0;", "Ljava/io/File;", "file", "Lt3/a0;", "serializer", "<init>", "(Ljava/io/File;Lt3/a0;)V", "value", "", "e", "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q<T> extends n<T> implements k0<T> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @ot.f(c = "androidx.datastore.core.FileWriteScope", f = "FileStorage.kt", l = {MlKitException.CODE_SCANNER_CANCELLED}, m = "writeData")
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f31955t;

        /* renamed from: u, reason: collision with root package name */
        public Object f31956u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31957v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ q<T> f31958w;

        /* renamed from: x, reason: collision with root package name */
        public int f31959x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q<T> qVar, mt.b<? super a> bVar) {
            super(bVar);
            this.f31958w = qVar;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31957v = obj;
            this.f31959x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f31958w.e(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@NotNull File file, @NotNull a0<T> serializer) {
        super(file, serializer);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // t3.k0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(T r6, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof t3.q.a
            if (r0 == 0) goto L13
            r0 = r7
            t3.q$a r0 = (t3.q.a) r0
            int r1 = r0.f31959x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31959x = r1
            goto L18
        L13:
            t3.q$a r0 = new t3.q$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f31957v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f31959x
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f31956u
            java.io.FileOutputStream r6 = (java.io.FileOutputStream) r6
            java.lang.Object r0 = r0.f31955t
            java.io.Closeable r0 = (java.io.Closeable) r0
            gt.o.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L62
        L31:
            r6 = move-exception
            goto L74
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            gt.o.b(r7)
            r5.f()
            java.io.FileOutputStream r7 = new java.io.FileOutputStream
            java.io.File r2 = r5.getFile()
            r7.<init>(r2)
            t3.a0 r2 = r5.h()     // Catch: java.lang.Throwable -> L72
            t3.i0 r4 = new t3.i0     // Catch: java.lang.Throwable -> L72
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L72
            r0.f31955t = r7     // Catch: java.lang.Throwable -> L72
            r0.f31956u = r7     // Catch: java.lang.Throwable -> L72
            r0.f31959x = r3     // Catch: java.lang.Throwable -> L72
            java.lang.Object r6 = r2.writeTo(r6, r4, r0)     // Catch: java.lang.Throwable -> L72
            if (r6 != r1) goto L60
            return r1
        L60:
            r6 = r7
            r0 = r6
        L62:
            java.io.FileDescriptor r6 = r6.getFD()     // Catch: java.lang.Throwable -> L31
            r6.sync()     // Catch: java.lang.Throwable -> L31
            kotlin.Unit r6 = kotlin.Unit.f22894a     // Catch: java.lang.Throwable -> L31
            r6 = 0
            tt.c.a(r0, r6)
            kotlin.Unit r6 = kotlin.Unit.f22894a
            return r6
        L72:
            r6 = move-exception
            r0 = r7
        L74:
            throw r6     // Catch: java.lang.Throwable -> L75
        L75:
            r7 = move-exception
            tt.c.a(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.q.e(java.lang.Object, mt.b):java.lang.Object");
    }
}
