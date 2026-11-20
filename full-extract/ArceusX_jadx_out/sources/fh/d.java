package fh;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f17255a;
    public String b;

    public d(Context context) {
        this(context.getPackageName() + context.getString(b.f17244a));
    }

    public c a(Context context) {
        c cVar;
        Cursor b = b(context, a.GetConfig.b(this.b));
        if (b == null || !b.moveToFirst()) {
            cVar = null;
        } else {
            cVar = new c(b.getString(b.getColumnIndex("channel_param")), b.getString(b.getColumnIndex("default_channel_param")), b.getString(b.getColumnIndex("base_url_param")), b.getString(b.getColumnIndex("default_base_url_param")), b.getString(b.getColumnIndex("settings_param")), b.getString(b.getColumnIndex("user_agent_param")), b.getString(b.getColumnIndex("default_user_agent_param")), b.getString(b.getColumnIndex("dev_rpc_ip_port_override")), b.getString(b.getColumnIndex("dev_branch")), b.getString(b.getColumnIndex("dev_commit")));
            int columnIndex = b.getColumnIndex("browser_tracker_id");
            if (columnIndex >= 0) {
                cVar.n(b.getString(columnIndex));
            }
        }
        if (b != null) {
            b.close();
        }
        return cVar;
    }

    public final Cursor b(Context context, Uri uri) {
        try {
            return context.getContentResolver().query(uri, this.f17255a, null, null, null);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public d(String str) {
        this.f17255a = new String[]{"PROJECTION_NONE"};
        this.b = str;
    }
}
