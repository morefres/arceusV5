package p3;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
public class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public a f28347a;

    public interface a {
        void a(Cursor cursor);

        Cursor b(CharSequence charSequence);

        Cursor c();

        CharSequence convertToString(Cursor cursor);
    }

    public b(a aVar) {
        this.f28347a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f28347a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor b = this.f28347a.b(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (b != null) {
            filterResults.count = b.getCount();
            filterResults.values = b;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor c10 = this.f28347a.c();
        Object obj = filterResults.values;
        if (obj == null || obj == c10) {
            return;
        }
        this.f28347a.a((Cursor) obj);
    }
}
