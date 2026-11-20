package xk;

import lv.o;
import lv.s;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public interface h {
    @o("/v1/games/sessions/report/{placeId}/{eventType}")
    iv.d<ResponseBody> a(@s("placeId") long j10, @s("eventType") String str);
}
