package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import i.h;

/* loaded from: classes.dex */
public class ShareActionProvider extends androidx.core.view.b {

    /* renamed from: d, reason: collision with root package name */
    public int f1024d;

    /* renamed from: e, reason: collision with root package name */
    public final a f1025e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f1026f;

    /* renamed from: g, reason: collision with root package name */
    public String f1027g;

    public class a implements MenuItem.OnMenuItemClickListener {
        public a() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ShareActionProvider shareActionProvider = ShareActionProvider.this;
            Intent b = q.c.d(shareActionProvider.f1026f, shareActionProvider.f1027g).b(menuItem.getItemId());
            if (b == null) {
                return true;
            }
            String action = b.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                ShareActionProvider.this.l(b);
            }
            ShareActionProvider.this.f1026f.startActivity(b);
            return true;
        }
    }

    public ShareActionProvider(Context context) {
        super(context);
        this.f1024d = 4;
        this.f1025e = new a();
        this.f1027g = "share_history.xml";
        this.f1026f = context;
    }

    @Override // androidx.core.view.b
    public boolean a() {
        return true;
    }

    @Override // androidx.core.view.b
    public View c() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f1026f);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(q.c.d(this.f1026f, this.f1027g));
        }
        TypedValue typedValue = new TypedValue();
        this.f1026f.getTheme().resolveAttribute(i.a.f19806j, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(k.a.b(this.f1026f, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(h.f19927r);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(h.f19926q);
        return activityChooserView;
    }

    @Override // androidx.core.view.b
    public void f(SubMenu subMenu) {
        subMenu.clear();
        q.c d10 = q.c.d(this.f1026f, this.f1027g);
        PackageManager packageManager = this.f1026f.getPackageManager();
        int f10 = d10.f();
        int min = Math.min(f10, this.f1024d);
        for (int i10 = 0; i10 < min; i10++) {
            ResolveInfo e10 = d10.e(i10);
            subMenu.add(0, i10, i10, e10.loadLabel(packageManager)).setIcon(e10.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1025e);
        }
        if (min < f10) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f1026f.getString(h.b));
            for (int i11 = 0; i11 < f10; i11++) {
                ResolveInfo e11 = d10.e(i11);
                addSubMenu.add(0, i11, i11, e11.loadLabel(packageManager)).setIcon(e11.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1025e);
            }
        }
    }

    public void l(Intent intent) {
        intent.addFlags(134742016);
    }
}
