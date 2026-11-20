package bj;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import bj.i;
import rg.t;

/* loaded from: classes2.dex */
public class f extends bj.a {

    /* renamed from: a, reason: collision with root package name */
    public Context f4290a;

    public class a extends aj.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f4291a;

        public a(String str) {
            this.f4291a = str;
        }

        @Override // aj.a, android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[]{"dev_rpc_ip_port_override"};
        }

        @Override // aj.a, android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return this.f4291a;
        }
    }

    public f(Context context) {
        this.f4290a = context;
    }

    @Override // bj.i
    public Cursor a(Uri uri) {
        return new a(t.b(this.f4290a));
    }

    @Override // bj.i
    public fh.a b(i.a aVar) {
        if (aVar == i.a.GET) {
            return fh.a.GetDevRpcIpAndPort;
        }
        return null;
    }
}
