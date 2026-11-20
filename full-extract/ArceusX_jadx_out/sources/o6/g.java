package o6;

import k6.h0;
import k6.s;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m6.t;
import o6.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.Options;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\f\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lo6/g;", "Lo6/j;", "Lk6/h0;", "uri", "Lx6/p;", "options", "<init>", "(Lk6/h0;Lx6/p;)V", "Lo6/i;", ve.a.f33391e, "(Lmt/b;)Ljava/lang/Object;", "Lk6/h0;", j6.b.f21518e, "Lx6/p;", "c", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 uri;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lo6/g$b;", "Lo6/j$a;", "Lk6/h0;", "<init>", "()V", "data", "Lx6/p;", "options", "Lk6/s;", "imageLoader", "Lo6/j;", j6.b.f21518e, "(Lk6/h0;Lx6/p;Lk6/s;)Lo6/j;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements j.a<h0> {
        @Override // o6.j.a
        @Nullable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(@NotNull h0 data, @NotNull Options options, @NotNull s imageLoader) {
            if (Intrinsics.c(data.getScheme(), "data")) {
                return new g(data, options);
            }
            return null;
        }
    }

    public g(@NotNull h0 h0Var, @NotNull Options options) {
        this.uri = h0Var;
        this.options = options;
    }

    @Override // o6.j
    @Nullable
    public Object a(@NotNull mt.b<? super i> bVar) {
        int n02 = StringsKt.n0(this.uri.getData(), ";base64,", 0, false, 6, null);
        if (n02 == -1) {
            throw new IllegalStateException(("invalid data uri: " + this.uri).toString());
        }
        int m02 = StringsKt.m0(this.uri.getData(), ':', 0, false, 6, null);
        if (m02 == -1) {
            throw new IllegalStateException(("invalid data uri: " + this.uri).toString());
        }
        String substring = this.uri.getData().substring(m02 + 1, n02);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        byte[] f10 = Base64.f(Base64.INSTANCE, this.uri.getData(), n02 + 8, 0, 4, null);
        wu.e eVar = new wu.e();
        eVar.write(f10);
        return new SourceFetchResult(t.c(eVar, this.options.getFileSystem(), null, 4, null), substring, m6.f.b);
    }
}
