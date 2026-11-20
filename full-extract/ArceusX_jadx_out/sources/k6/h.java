package k6;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m6.i;
import o6.SourceFetchResult;
import o6.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.Options;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001'BÃ\u0001\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00120\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u00124\u0010\r\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00020\u000b0\u0002\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00020\u000b0\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*RA\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R9\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*RD\u0010\r\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00020\u000b0\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010(R(\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00020\u000b0\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010(R=\u00103\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u0010*R!\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b0\u0010*¨\u00065"}, d2 = {"Lk6/h;", "", "", "Lp6/d;", "interceptors", "Lkotlin/Pair;", "Lr6/c;", "Lgu/c;", "mappers", "Lq6/c;", "keyers", "Lkotlin/Function0;", "Lo6/j$a;", "lazyFetcherFactories", "Lm6/i$a;", "lazyDecoderFactories", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "()V", "data", "Lx6/p;", "options", "j", "(Ljava/lang/Object;Lx6/p;)Ljava/lang/Object;", "Lk6/s;", "imageLoader", "", "startIndex", "Lo6/j;", "m", "(Ljava/lang/Object;Lx6/p;Lk6/s;I)Lkotlin/Pair;", "Lo6/o;", "result", "Lm6/i;", "l", "(Lo6/o;Lx6/p;Lk6/s;I)Lkotlin/Pair;", "Lk6/h$a;", "k", "()Lk6/h$a;", ve.a.f33391e, "Ljava/util/List;", "g", "()Ljava/util/List;", j6.b.f21518e, "i", "c", "h", rl.d.f30696a, "e", "f", "Lgt/h;", "fetcherFactories", "decoderFactories", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<p6.d> interceptors;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<Pair<r6.c<? extends Object, ? extends Object>, gu.c<? extends Object>>> mappers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Pair<q6.c<? extends Object>, gu.c<? extends Object>>> keyers;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends Function0<? extends List<? extends Pair<? extends j.a<? extends Object>, ? extends gu.c<? extends Object>>>>> lazyFetcherFactories;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends Function0<? extends List<? extends i.a>>> lazyDecoderFactories;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h fetcherFactories;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h decoderFactories;

    public /* synthetic */ h(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    public static final List c(h hVar) {
        List<? extends Function0<? extends List<? extends i.a>>> list = hVar.lazyDecoderFactories;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            kotlin.collections.u.z(arrayList, list.get(i10).invoke());
        }
        hVar.lazyDecoderFactories = kotlin.collections.p.k();
        return arrayList;
    }

    public static final List d(h hVar) {
        List<? extends Function0<? extends List<? extends Pair<? extends j.a<? extends Object>, ? extends gu.c<? extends Object>>>>> list = hVar.lazyFetcherFactories;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            kotlin.collections.u.z(arrayList, list.get(i10).invoke());
        }
        hVar.lazyFetcherFactories = kotlin.collections.p.k();
        return arrayList;
    }

    @NotNull
    public final List<i.a> e() {
        return (List) this.decoderFactories.getValue();
    }

    @NotNull
    public final List<Pair<j.a<? extends Object>, gu.c<? extends Object>>> f() {
        return (List) this.fetcherFactories.getValue();
    }

    @NotNull
    public final List<p6.d> g() {
        return this.interceptors;
    }

    @NotNull
    public final List<Pair<q6.c<? extends Object>, gu.c<? extends Object>>> h() {
        return this.keyers;
    }

    @NotNull
    public final List<Pair<r6.c<? extends Object, ? extends Object>, gu.c<? extends Object>>> i() {
        return this.mappers;
    }

    @NotNull
    public final Object j(@NotNull Object data, @NotNull Options options) {
        List<Pair<r6.c<? extends Object, ? extends Object>, gu.c<? extends Object>>> list = this.mappers;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair<r6.c<? extends Object, ? extends Object>, gu.c<? extends Object>> pair = list.get(i10);
            r6.c<? extends Object, ? extends Object> a10 = pair.a();
            if (pair.b().b(data)) {
                Intrinsics.d(a10, "null cannot be cast to non-null type coil3.map.Mapper<kotlin.Any, *>");
                Object a11 = a10.a(data, options);
                if (a11 != null) {
                    data = a11;
                }
            }
        }
        return data;
    }

    @NotNull
    public final a k() {
        return new a(this);
    }

    @Nullable
    public final Pair<m6.i, Integer> l(@NotNull SourceFetchResult result, @NotNull Options options, @NotNull s imageLoader, int startIndex) {
        int size = e().size();
        while (startIndex < size) {
            m6.i a10 = e().get(startIndex).a(result, options, imageLoader);
            if (a10 != null) {
                return gt.s.a(a10, Integer.valueOf(startIndex));
            }
            startIndex++;
        }
        return null;
    }

    @Nullable
    public final Pair<o6.j, Integer> m(@NotNull Object data, @NotNull Options options, @NotNull s imageLoader, int startIndex) {
        int size = f().size();
        while (startIndex < size) {
            Pair<j.a<? extends Object>, gu.c<? extends Object>> pair = f().get(startIndex);
            j.a<? extends Object> a10 = pair.a();
            if (pair.b().b(data)) {
                Intrinsics.d(a10, "null cannot be cast to non-null type coil3.fetch.Fetcher.Factory<kotlin.Any>");
                o6.j a11 = a10.a(data, options, imageLoader);
                if (a11 != null) {
                    return gt.s.a(a11, Integer.valueOf(startIndex));
                }
            }
            startIndex++;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(List<? extends p6.d> list, List<? extends Pair<? extends r6.c<? extends Object, ? extends Object>, ? extends gu.c<? extends Object>>> list2, List<? extends Pair<? extends q6.c<? extends Object>, ? extends gu.c<? extends Object>>> list3, List<? extends Function0<? extends List<? extends Pair<? extends j.a<? extends Object>, ? extends gu.c<? extends Object>>>>> list4, List<? extends Function0<? extends List<? extends i.a>>> list5) {
        this.interceptors = list;
        this.mappers = list2;
        this.keyers = list3;
        this.lazyFetcherFactories = list4;
        this.lazyDecoderFactories = list5;
        this.fetcherFactories = gt.i.b(new Function0() { // from class: k6.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List d10;
                d10 = h.d(h.this);
                return d10;
            }
        });
        this.decoderFactories = gt.i.b(new Function0() { // from class: k6.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List c10;
                c10 = h.c(h.this);
                return c10;
            }
        });
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0010\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0014\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0018\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001d\u001a\u00020\u00002.\u0010\u0017\u001a*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001b0\u001a¢\u0006\u0004\b\"\u0010\u001eJ\r\u0010#\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R@\u0010-\u001a(\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R<\u00100\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)RH\u00103\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0\u001b0\u001a0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u0010)R,\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001b0\u001a0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010)¨\u00067"}, d2 = {"Lk6/h$a;", "", "<init>", "()V", "Lk6/h;", "registry", "(Lk6/h;)V", "Lp6/d;", "interceptor", "i", "(Lp6/d;)Lk6/h$a;", "T", "Lr6/c;", "mapper", "Lgu/c;", Payload.TYPE, "k", "(Lr6/c;Lgu/c;)Lk6/h$a;", "Lq6/c;", "keyer", "j", "(Lq6/c;Lgu/c;)Lk6/h$a;", "Lo6/j$a;", "factory", "h", "(Lo6/j$a;Lgu/c;)Lk6/h$a;", "Lkotlin/Function0;", "", "Lkotlin/Pair;", "o", "(Lkotlin/jvm/functions/Function0;)Lk6/h$a;", "Lm6/i$a;", "g", "(Lm6/i$a;)Lk6/h$a;", "n", "p", "()Lk6/h;", "", ve.a.f33391e, "Ljava/util/List;", "getInterceptors$coil_core_release", "()Ljava/util/List;", "interceptors", j6.b.f21518e, "getMappers$coil_core_release", "mappers", "c", "getKeyers$coil_core_release", "keyers", rl.d.f30696a, "r", "lazyFetcherFactories", "e", "q", "lazyDecoderFactories", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<p6.d> interceptors;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<Pair<r6.c<? extends Object, ?>, gu.c<? extends Object>>> mappers;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Pair<q6.c<? extends Object>, gu.c<? extends Object>>> keyers;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Function0<List<Pair<j.a<? extends Object>, gu.c<? extends Object>>>>> lazyFetcherFactories;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Function0<List<i.a>>> lazyDecoderFactories;

        public a() {
            this.interceptors = new ArrayList();
            this.mappers = new ArrayList();
            this.keyers = new ArrayList();
            this.lazyFetcherFactories = new ArrayList();
            this.lazyDecoderFactories = new ArrayList();
        }

        public static final List e(Pair pair) {
            return kotlin.collections.o.d(pair);
        }

        public static final List f(i.a aVar) {
            return kotlin.collections.o.d(aVar);
        }

        public static final List l(i.a aVar) {
            return kotlin.collections.o.d(aVar);
        }

        public static final List m(j.a aVar, gu.c cVar) {
            return kotlin.collections.o.d(gt.s.a(aVar, cVar));
        }

        @NotNull
        public final a g(@NotNull final i.a factory) {
            this.lazyDecoderFactories.add(new Function0() { // from class: k6.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    List l10;
                    l10 = h.a.l(i.a.this);
                    return l10;
                }
            });
            return this;
        }

        @NotNull
        public final <T> a h(@NotNull final j.a<T> factory, @NotNull final gu.c<T> type) {
            this.lazyFetcherFactories.add(new Function0() { // from class: k6.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    List m10;
                    m10 = h.a.m(j.a.this, type);
                    return m10;
                }
            });
            return this;
        }

        @NotNull
        public final a i(@NotNull p6.d interceptor) {
            this.interceptors.add(interceptor);
            return this;
        }

        @NotNull
        public final <T> a j(@NotNull q6.c<T> keyer, @NotNull gu.c<T> type) {
            this.keyers.add(gt.s.a(keyer, type));
            return this;
        }

        @NotNull
        public final <T> a k(@NotNull r6.c<T, ?> mapper, @NotNull gu.c<T> type) {
            this.mappers.add(gt.s.a(mapper, type));
            return this;
        }

        @NotNull
        public final a n(@NotNull Function0<? extends List<? extends i.a>> factory) {
            this.lazyDecoderFactories.add(factory);
            return this;
        }

        @NotNull
        public final a o(@NotNull Function0<? extends List<? extends Pair<? extends j.a<? extends Object>, ? extends gu.c<? extends Object>>>> factory) {
            this.lazyFetcherFactories.add(factory);
            return this;
        }

        @NotNull
        public final h p() {
            return new h(e7.d.c(this.interceptors), e7.d.c(this.mappers), e7.d.c(this.keyers), e7.d.c(this.lazyFetcherFactories), e7.d.c(this.lazyDecoderFactories), null);
        }

        @NotNull
        public final List<Function0<List<i.a>>> q() {
            return this.lazyDecoderFactories;
        }

        @NotNull
        public final List<Function0<List<Pair<j.a<? extends Object>, gu.c<? extends Object>>>>> r() {
            return this.lazyFetcherFactories;
        }

        public a(@NotNull h hVar) {
            this.interceptors = CollectionsKt.O0(hVar.g());
            this.mappers = CollectionsKt.O0(hVar.i());
            this.keyers = CollectionsKt.O0(hVar.h());
            List<Pair<j.a<? extends Object>, gu.c<? extends Object>>> f10 = hVar.f();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = f10.iterator();
            while (it.hasNext()) {
                final Pair pair = (Pair) it.next();
                arrayList.add(new Function0() { // from class: k6.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        List e10;
                        e10 = h.a.e(Pair.this);
                        return e10;
                    }
                });
            }
            this.lazyFetcherFactories = arrayList;
            List<i.a> e10 = hVar.e();
            ArrayList arrayList2 = new ArrayList();
            for (final i.a aVar : e10) {
                arrayList2.add(new Function0() { // from class: k6.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        List f11;
                        f11 = h.a.f(i.a.this);
                        return f11;
                    }
                });
            }
            this.lazyDecoderFactories = arrayList2;
        }
    }

    public h() {
        this(kotlin.collections.p.k(), kotlin.collections.p.k(), kotlin.collections.p.k(), kotlin.collections.p.k(), kotlin.collections.p.k());
    }
}
