package xk;

import lv.o;
import lv.s;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public interface f {
    @o("/v1/users/{requesterUserId}/decline-friend-request")
    iv.d<ResponseBody> a(@s("requesterUserId") long j10);

    @o("/v1/users/{requesterUserId}/accept-friend-request")
    iv.d<ResponseBody> b(@s("requesterUserId") long j10);
}
