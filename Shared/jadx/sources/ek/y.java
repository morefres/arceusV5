package ek;

import java.io.IOException;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public class y {
    public static String a(iv.x<ResponseBody> xVar) {
        try {
            return xVar.a() != null ? xVar.a().string() : xVar.e() != null ? xVar.e().string() : "";
        } catch (IOException unused) {
            return "";
        }
    }
}
