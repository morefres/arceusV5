package di;

import androidx.annotation.NonNull;
import com.github.luben.zstd.ZstdInputStream;
import com.roblox.client.RobloxApplication;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import wu.b0;
import wu.g;

/* loaded from: classes2.dex */
public class b implements Interceptor {
    @Override // okhttp3.Interceptor
    @NonNull
    public Response intercept(Interceptor.Chain chain) {
        String str;
        byte[] bArr;
        Response proceed = chain.proceed(chain.request());
        if (proceed.body() == null || (str = proceed.headers().get("Content-Encoding")) == null) {
            return proceed;
        }
        if (!str.equals("zstd") && !str.equals("dcz")) {
            return proceed;
        }
        if (str.equals("dcz")) {
            Response.Builder message = proceed.newBuilder().code(HttpStatusCode.NOT_FOUND_404).message("Dictionary not found");
            String header = proceed.request().header("X-Rbx-Zstd-Dict-SHA");
            if (header == null) {
                return message.build();
            }
            bArr = ci.b.b().a(RobloxApplication.f(), header);
            if (bArr == null) {
                return message.build();
            }
        } else {
            bArr = null;
        }
        ZstdInputStream zstdInputStream = new ZstdInputStream(proceed.body().byteStream());
        g c10 = b0.c(b0.j(zstdInputStream));
        if (bArr != null) {
            zstdInputStream.setDict(bArr);
        }
        return proceed.newBuilder().body(ResponseBody.create(proceed.body().getMediaType(), -1L, c10)).build();
    }
}
