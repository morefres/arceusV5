package bj;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import bj.i;
import com.roblox.client.provider.ShellConfigurationContentProvider;

/* loaded from: classes2.dex */
public class e extends bj.a {

    /* renamed from: a, reason: collision with root package name */
    public final ShellConfigurationContentProvider f4287a;
    public Context b;

    public class a extends aj.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f4288a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f4288a = str;
            this.b = str2;
        }

        @Override // aj.a, android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[]{"dev_branch", "dev_commit"};
        }

        @Override // aj.a, android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            if (i10 == getColumnIndex("dev_branch")) {
                return this.f4288a;
            }
            if (i10 == getColumnIndex("dev_commit")) {
                return this.b;
            }
            return null;
        }
    }

    public e(ShellConfigurationContentProvider shellConfigurationContentProvider, Context context) {
        this.f4287a = shellConfigurationContentProvider;
        this.b = context;
    }

    @Override // bj.i
    public Cursor a(Uri uri) {
        return new a(this.f4287a.d().e(), this.f4287a.d().f());
    }

    @Override // bj.i
    public fh.a b(i.a aVar) {
        if (aVar == i.a.GET) {
            return fh.a.GetDevBranchAndCommit;
        }
        return null;
    }
}
