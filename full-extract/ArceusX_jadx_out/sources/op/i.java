package op;

import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mu.b0;
import mu.g0;
import mu.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0096A¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lop/i;", "Lmu/g0;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "<init>", "()V", "output", "", j6.b.f21518e, "(Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;)Z", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", ve.a.f33391e, "nfc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements g0<PassportNfcReaderOutput> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final b0<PassportNfcReaderOutput> f28102c = i0.b(0, 1, lu.a.b, 1, null);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0<PassportNfcReaderOutput> f28103a = f28102c;

    public final boolean b(@NotNull PassportNfcReaderOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        return f28102c.a(output);
    }

    @Override // mu.g0, mu.h
    @Nullable
    public Object collect(@NotNull mu.i<? super PassportNfcReaderOutput> iVar, @NotNull mt.b<?> bVar) {
        return this.f28103a.collect(iVar, bVar);
    }
}
