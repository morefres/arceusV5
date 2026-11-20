package fh;

import android.content.ContentValues;
import android.net.Uri;

/* loaded from: classes2.dex */
public enum a {
    GetPing("ping.get", 1),
    GetConfig("config.get", 2),
    PostConfig("config.post", 3),
    GetUserAgent("ua.get", 4),
    GetDevRpcIpAndPort("devrpc.get", 5),
    GetDevBranchAndCommit("devbranchcommit.get", 6),
    GetCookie("cookie.get", 7);


    /* renamed from: a, reason: collision with root package name */
    public final String f17243a;
    public final int b;

    a(String str, int i10) {
        this.f17243a = str;
        this.b = i10;
    }

    public Uri b(String str) {
        return c(str, null);
    }

    public Uri c(String str, ContentValues contentValues) {
        Uri parse = Uri.parse("content://" + str + "/" + this.f17243a);
        if (contentValues != null) {
            for (String str2 : contentValues.keySet()) {
                parse = parse.buildUpon().appendQueryParameter(str2, contentValues.getAsString(str2)).build();
            }
        }
        return parse;
    }
}
