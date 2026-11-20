package t6;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import t6.NetworkHeaders;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lt6/a;", "", "<init>", "()V", "Lwu/g;", Payload.SOURCE, "Lt6/q;", ve.a.f33391e, "(Lwu/g;)Lt6/q;", Payload.RESPONSE, "Lwu/f;", "sink", "", j6.b.f21518e, "(Lt6/q;Lwu/f;)V", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f31985a = new a();

    @NotNull
    public final NetworkResponse a(@NotNull wu.g source) {
        int parseInt = Integer.parseInt(source.Z0());
        long parseLong = Long.parseLong(source.Z0());
        long parseLong2 = Long.parseLong(source.Z0());
        NetworkHeaders.a aVar = new NetworkHeaders.a();
        int parseInt2 = Integer.parseInt(source.Z0());
        for (int i10 = 0; i10 < parseInt2; i10++) {
            u6.e.b(aVar, source.Z0());
        }
        return new NetworkResponse(parseInt, parseLong, parseLong2, aVar.b(), null, null, 48, null);
    }

    public final void b(@NotNull NetworkResponse response, @NotNull wu.f sink) {
        sink.y1(response.getCode()).writeByte(10);
        sink.y1(response.getRequestMillis()).writeByte(10);
        sink.y1(response.getResponseMillis()).writeByte(10);
        Set<Map.Entry<String, List<String>>> entrySet = response.getHeaders().b().entrySet();
        Iterator<T> it = entrySet.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        sink.y1(i10).writeByte(10);
        for (Map.Entry<String, List<String>> entry : entrySet) {
            Iterator<String> it2 = entry.getValue().iterator();
            while (it2.hasNext()) {
                sink.A0(entry.getKey()).A0(":").A0(it2.next()).writeByte(10);
            }
        }
    }
}
