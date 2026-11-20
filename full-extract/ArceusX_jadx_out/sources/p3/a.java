package p3;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p3.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f28338a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f28339c;

    /* renamed from: d, reason: collision with root package name */
    public Context f28340d;

    /* renamed from: e, reason: collision with root package name */
    public int f28341e;

    /* renamed from: f, reason: collision with root package name */
    public C0500a f28342f;

    /* renamed from: g, reason: collision with root package name */
    public DataSetObserver f28343g;

    /* renamed from: h, reason: collision with root package name */
    public p3.b f28344h;

    /* renamed from: p3.a$a, reason: collision with other inner class name */
    public class C0500a extends ContentObserver {
        public C0500a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.h();
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f28338a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f28338a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        e(context, cursor, z10 ? 1 : 2);
    }

    @Override // p3.b.a
    public void a(Cursor cursor) {
        Cursor i10 = i(cursor);
        if (i10 != null) {
            i10.close();
        }
    }

    @Override // p3.b.a
    public Cursor c() {
        return this.f28339c;
    }

    @Override // p3.b.a
    public abstract CharSequence convertToString(Cursor cursor);

    public abstract void d(View view, Context context, Cursor cursor);

    public void e(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.b = true;
        } else {
            this.b = false;
        }
        boolean z10 = cursor != null;
        this.f28339c = cursor;
        this.f28338a = z10;
        this.f28340d = context;
        this.f28341e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f28342f = new C0500a();
            this.f28343g = new b();
        } else {
            this.f28342f = null;
            this.f28343g = null;
        }
        if (z10) {
            C0500a c0500a = this.f28342f;
            if (c0500a != null) {
                cursor.registerContentObserver(c0500a);
            }
            DataSetObserver dataSetObserver = this.f28343g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f28338a || (cursor = this.f28339c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f28338a) {
            return null;
        }
        this.f28339c.moveToPosition(i10);
        if (view == null) {
            view = f(this.f28340d, this.f28339c, viewGroup);
        }
        d(view, this.f28340d, this.f28339c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f28344h == null) {
            this.f28344h = new p3.b(this);
        }
        return this.f28344h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f28338a || (cursor = this.f28339c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f28339c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f28338a && (cursor = this.f28339c) != null && cursor.moveToPosition(i10)) {
            return this.f28339c.getLong(this.f28341e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f28338a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f28339c.moveToPosition(i10)) {
            if (view == null) {
                view = g(this.f28340d, this.f28339c, viewGroup);
            }
            d(view, this.f28340d, this.f28339c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    public void h() {
        Cursor cursor;
        if (!this.b || (cursor = this.f28339c) == null || cursor.isClosed()) {
            return;
        }
        this.f28338a = this.f28339c.requery();
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f28339c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0500a c0500a = this.f28342f;
            if (c0500a != null) {
                cursor2.unregisterContentObserver(c0500a);
            }
            DataSetObserver dataSetObserver = this.f28343g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f28339c = cursor;
        if (cursor == null) {
            this.f28341e = -1;
            this.f28338a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0500a c0500a2 = this.f28342f;
        if (c0500a2 != null) {
            cursor.registerContentObserver(c0500a2);
        }
        DataSetObserver dataSetObserver2 = this.f28343g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f28341e = cursor.getColumnIndexOrThrow("_id");
        this.f28338a = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
