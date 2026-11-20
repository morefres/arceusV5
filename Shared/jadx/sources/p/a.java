package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class a implements r2.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f28157a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28158c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f28159d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f28160e;

    /* renamed from: f, reason: collision with root package name */
    public Intent f28161f;

    /* renamed from: g, reason: collision with root package name */
    public char f28162g;

    /* renamed from: i, reason: collision with root package name */
    public char f28164i;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f28166k;

    /* renamed from: l, reason: collision with root package name */
    public Context f28167l;

    /* renamed from: m, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f28168m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f28169n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f28170o;

    /* renamed from: h, reason: collision with root package name */
    public int f28163h = 4096;

    /* renamed from: j, reason: collision with root package name */
    public int f28165j = 4096;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f28171p = null;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f28172q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f28173r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f28174s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f28175t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f28167l = context;
        this.f28157a = i11;
        this.b = i10;
        this.f28158c = i13;
        this.f28159d = charSequence;
    }

    @Override // r2.b
    public androidx.core.view.b a() {
        return null;
    }

    @Override // r2.b
    @NonNull
    public r2.b b(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f28166k;
        if (drawable != null) {
            if (this.f28173r || this.f28174s) {
                Drawable r8 = q2.a.r(drawable);
                this.f28166k = r8;
                Drawable mutate = r8.mutate();
                this.f28166k = mutate;
                if (this.f28173r) {
                    q2.a.o(mutate, this.f28171p);
                }
                if (this.f28174s) {
                    q2.a.p(this.f28166k, this.f28172q);
                }
            }
        }
    }

    @Override // r2.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public r2.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public r2.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // r2.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public r2.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // r2.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // r2.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f28165j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f28164i;
    }

    @Override // r2.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f28169n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f28166k;
    }

    @Override // r2.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f28171p;
    }

    @Override // r2.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f28172q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f28161f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f28157a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // r2.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f28163h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f28162g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f28158c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f28159d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f28160e;
        return charSequence != null ? charSequence : this.f28159d;
    }

    @Override // r2.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f28170o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // r2.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f28175t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f28175t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f28175t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f28175t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f28164i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f28175t = (z10 ? 1 : 0) | (this.f28175t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f28175t = (z10 ? 2 : 0) | (this.f28175t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f28175t = (z10 ? 16 : 0) | (this.f28175t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f28166k = drawable;
        c();
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f28171p = colorStateList;
        this.f28173r = true;
        c();
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f28172q = mode;
        this.f28174s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f28161f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f28162g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f28168m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f28162g = c10;
        this.f28164i = Character.toLowerCase(c11);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f28159d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f28160e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f28175t = (this.f28175t & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f28164i = Character.toLowerCase(c10);
        this.f28165j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public r2.b setContentDescription(CharSequence charSequence) {
        this.f28169n = charSequence;
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f28162g = c10;
        this.f28163h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f28159d = this.f28167l.getResources().getString(i10);
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public r2.b setTooltipText(CharSequence charSequence) {
        this.f28170o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f28166k = l2.b.f(this.f28167l, i10);
        c();
        return this;
    }

    @Override // r2.b, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f28162g = c10;
        this.f28163h = KeyEvent.normalizeMetaState(i10);
        this.f28164i = Character.toLowerCase(c11);
        this.f28165j = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
