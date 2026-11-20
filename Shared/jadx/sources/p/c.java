package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.b;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class c extends p.b implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    public final r2.b f28178d;

    /* renamed from: e, reason: collision with root package name */
    public Method f28179e;

    public class a extends androidx.core.view.b implements ActionProvider.VisibilityListener {

        /* renamed from: d, reason: collision with root package name */
        public b.InterfaceC0024b f28180d;

        /* renamed from: e, reason: collision with root package name */
        public final ActionProvider f28181e;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f28181e = actionProvider;
        }

        @Override // androidx.core.view.b
        public boolean a() {
            return this.f28181e.hasSubMenu();
        }

        @Override // androidx.core.view.b
        public boolean b() {
            return this.f28181e.isVisible();
        }

        @Override // androidx.core.view.b
        @NonNull
        public View c() {
            return this.f28181e.onCreateActionView();
        }

        @Override // androidx.core.view.b
        public View d(MenuItem menuItem) {
            return this.f28181e.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.b
        public boolean e() {
            return this.f28181e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.b
        public void f(SubMenu subMenu) {
            this.f28181e.onPrepareSubMenu(c.this.d(subMenu));
        }

        @Override // androidx.core.view.b
        public boolean g() {
            return this.f28181e.overridesItemVisibility();
        }

        @Override // androidx.core.view.b
        public void j(b.InterfaceC0024b interfaceC0024b) {
            this.f28180d = interfaceC0024b;
            this.f28181e.setVisibilityListener(interfaceC0024b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            b.InterfaceC0024b interfaceC0024b = this.f28180d;
            if (interfaceC0024b != null) {
                interfaceC0024b.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    public static class b extends FrameLayout implements o.c {

        /* renamed from: a, reason: collision with root package name */
        public final CollapsibleActionView f28183a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(View view) {
            super(view.getContext());
            this.f28183a = (CollapsibleActionView) view;
            addView(view);
        }

        public View a() {
            return (View) this.f28183a;
        }

        @Override // o.c
        public void onActionViewCollapsed() {
            this.f28183a.onActionViewCollapsed();
        }

        @Override // o.c
        public void onActionViewExpanded() {
            this.f28183a.onActionViewExpanded();
        }
    }

    /* renamed from: p.c$c, reason: collision with other inner class name */
    public class MenuItemOnActionExpandListenerC0497c implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f28184a;

        public MenuItemOnActionExpandListenerC0497c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f28184a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f28184a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f28184a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    public class d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f28185a;

        public d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f28185a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f28185a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, r2.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f28178d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f28178d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f28178d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.b a10 = this.f28178d.a();
        if (a10 instanceof a) {
            return ((a) a10).f28181e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f28178d.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f28178d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f28178d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f28178d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f28178d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f28178d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f28178d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f28178d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f28178d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f28178d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f28178d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f28178d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f28178d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f28178d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f28178d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f28178d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f28178d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f28178d.getTooltipText();
    }

    public void h(boolean z10) {
        try {
            if (this.f28179e == null) {
                this.f28179e = this.f28178d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f28179e.invoke(this.f28178d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f28178d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f28178d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f28178d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f28178d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f28178d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f28178d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f28176a, actionProvider);
        r2.b bVar = this.f28178d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.b(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f28178d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f28178d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f28178d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f28178d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f28178d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f28178d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f28178d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f28178d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f28178d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f28178d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f28178d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f28178d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0497c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f28178d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f28178d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f28178d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f28178d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f28178d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f28178d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f28178d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f28178d.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f28178d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f28178d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f28178d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f28178d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f28178d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f28178d.setActionView(i10);
        View actionView = this.f28178d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f28178d.setActionView(new b(actionView));
        }
        return this;
    }
}
