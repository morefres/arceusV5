package io;

import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import dn.j0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "Ldn/j0$c;", j6.b.f21518e, "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Ldn/j0$c;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21090a;

        static {
            int[] iArr = new int[IdConfig.b.values().length];
            try {
                iArr[IdConfig.b.f10747d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.b.f10749f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21090a = iArr;
        }
    }

    public static final j0.c b(IdConfig.b bVar) {
        int i10 = a.f21090a[bVar.ordinal()];
        if (i10 != 1 && i10 != 2) {
            return j0.c.b;
        }
        return j0.c.f15098a;
    }
}
