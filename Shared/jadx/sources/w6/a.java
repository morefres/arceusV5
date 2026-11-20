package w6;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import t6.NetworkRequest;
import t6.NetworkResponse;
import t6.i;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001c"}, d2 = {"Lw6/a;", "Lt6/i;", "Lokhttp3/Call$Factory;", "callFactory", "c", "(Lokhttp3/Call$Factory;)Lokhttp3/Call$Factory;", "T", "Lt6/o;", "request", "Lkotlin/Function2;", "Lt6/q;", "Lmt/b;", "", "block", "e", "(Lokhttp3/Call$Factory;Lt6/o;Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lokhttp3/Call$Factory;", "coil-network-okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Call.Factory callFactory;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "coil3.network.okhttp.internal.CallFactoryNetworkClient", f = "utils.kt", l = {MotionEventCompat.AXIS_DISTANCE, MotionEventCompat.AXIS_DISTANCE, 25}, m = "executeRequest-impl")
    /* renamed from: w6.a$a, reason: collision with other inner class name */
    public static final class C0631a<T> extends ot.d {
        public int A;

        /* renamed from: t, reason: collision with root package name */
        public Object f33720t;

        /* renamed from: u, reason: collision with root package name */
        public Object f33721u;

        /* renamed from: v, reason: collision with root package name */
        public Object f33722v;

        /* renamed from: w, reason: collision with root package name */
        public Object f33723w;

        /* renamed from: x, reason: collision with root package name */
        public Object f33724x;

        /* renamed from: y, reason: collision with root package name */
        public int f33725y;

        /* renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f33726z;

        public C0631a(mt.b<? super C0631a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33726z = obj;
            this.A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return a.e(null, null, null, this);
        }
    }

    public /* synthetic */ a(Call.Factory factory) {
        this.callFactory = factory;
    }

    public static final /* synthetic */ a b(Call.Factory factory) {
        return new a(factory);
    }

    @NotNull
    public static Call.Factory c(@NotNull Call.Factory factory) {
        return factory;
    }

    public static boolean d(Call.Factory factory, Object obj) {
        return (obj instanceof a) && Intrinsics.c(factory, ((a) obj).getCallFactory());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.lang.Object e(okhttp3.Call.Factory r8, @org.jetbrains.annotations.NotNull t6.NetworkRequest r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super t6.NetworkResponse, ? super mt.b<? super T>, ? extends java.lang.Object> r10, @org.jetbrains.annotations.NotNull mt.b<? super T> r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.a.e(okhttp3.Call$Factory, t6.o, kotlin.jvm.functions.Function2, mt.b):java.lang.Object");
    }

    public static int f(Call.Factory factory) {
        return factory.hashCode();
    }

    public static String g(Call.Factory factory) {
        return "CallFactoryNetworkClient(callFactory=" + factory + ')';
    }

    @Override // t6.i
    @Nullable
    public <T> Object a(@NotNull NetworkRequest networkRequest, @NotNull Function2<? super NetworkResponse, ? super mt.b<? super T>, ? extends Object> function2, @NotNull mt.b<? super T> bVar) {
        return e(this.callFactory, networkRequest, function2, bVar);
    }

    public boolean equals(Object other) {
        return d(this.callFactory, other);
    }

    /* renamed from: h, reason: from getter */
    public final /* synthetic */ Call.Factory getCallFactory() {
        return this.callFactory;
    }

    public int hashCode() {
        return f(this.callFactory);
    }

    public String toString() {
        return g(this.callFactory);
    }
}
