package xk;

import lv.o;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public interface k {
    @o("/platform-chat-api/v1/mark-conversations")
    iv.d<ResponseBody> a(@lv.a zk.a aVar);

    @o("/platform-chat-api/v1/send-messages")
    iv.d<ResponseBody> b(@lv.a zk.c cVar);

    @o("/platform-chat-api/v1/send-messages")
    iv.d<ResponseBody> c(@lv.a zk.d dVar);

    @o("/platform-chat-api/v1/mark-conversations")
    iv.d<ResponseBody> d(@lv.a zk.b bVar);
}
