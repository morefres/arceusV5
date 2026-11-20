package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public e f754a;
    public int b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f755c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f756d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f757e;

    /* renamed from: f, reason: collision with root package name */
    public final int f758f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f756d = z10;
        this.f757e = layoutInflater;
        this.f754a = eVar;
        this.f758f = i10;
        a();
    }

    public void a() {
        g v5 = this.f754a.v();
        if (v5 != null) {
            ArrayList<g> z10 = this.f754a.z();
            int size = z10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (z10.get(i10) == v5) {
                    this.b = i10;
                    return;
                }
            }
        }
        this.b = -1;
    }

    public e b() {
        return this.f754a;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i10) {
        ArrayList<g> z10 = this.f756d ? this.f754a.z() : this.f754a.E();
        int i11 = this.b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return z10.get(i10);
    }

    public void d(boolean z10) {
        this.f755c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b < 0 ? (this.f756d ? this.f754a.z() : this.f754a.E()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f757e.inflate(this.f758f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f754a.G() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        j.a aVar = (j.a) view;
        if (this.f755c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
