package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class e implements r2.a {
    public static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f759a;
    public final Resources b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f760c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f761d;

    /* renamed from: e, reason: collision with root package name */
    public a f762e;

    /* renamed from: m, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f770m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f771n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f772o;

    /* renamed from: p, reason: collision with root package name */
    public View f773p;

    /* renamed from: x, reason: collision with root package name */
    public g f781x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f783z;

    /* renamed from: l, reason: collision with root package name */
    public int f769l = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f774q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f775r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f776s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f777t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f778u = false;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList<g> f779v = new ArrayList<>();

    /* renamed from: w, reason: collision with root package name */
    public CopyOnWriteArrayList<WeakReference<i>> f780w = new CopyOnWriteArrayList<>();

    /* renamed from: y, reason: collision with root package name */
    public boolean f782y = false;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList<g> f763f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList<g> f764g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public boolean f765h = true;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList<g> f766i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList<g> f767j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    public boolean f768k = true;

    public interface a {
        boolean a(@NonNull e eVar, @NonNull MenuItem menuItem);

        void b(@NonNull e eVar);
    }

    public interface b {
        boolean b(g gVar);
    }

    public e(Context context) {
        this.f759a = context;
        this.b = context.getResources();
        c0(true);
    }

    public static int B(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public static int n(ArrayList<g> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean A() {
        return this.f777t;
    }

    public Resources C() {
        return this.b;
    }

    public e D() {
        return this;
    }

    @NonNull
    public ArrayList<g> E() {
        if (!this.f765h) {
            return this.f764g;
        }
        this.f764g.clear();
        int size = this.f763f.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.f763f.get(i10);
            if (gVar.isVisible()) {
                this.f764g.add(gVar);
            }
        }
        this.f765h = false;
        this.f768k = true;
        return this.f764g;
    }

    public boolean F() {
        return !this.f774q;
    }

    public boolean G() {
        return this.f782y;
    }

    public boolean H() {
        return this.f760c;
    }

    public boolean I() {
        return this.f761d;
    }

    public void J(g gVar) {
        this.f768k = true;
        L(true);
    }

    public void K(g gVar) {
        this.f765h = true;
        L(true);
    }

    public void L(boolean z10) {
        if (this.f774q) {
            this.f775r = true;
            if (z10) {
                this.f776s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f765h = true;
            this.f768k = true;
        }
        i(z10);
    }

    public boolean M(MenuItem menuItem, int i10) {
        return N(menuItem, null, i10);
    }

    public boolean N(MenuItem menuItem, i iVar, int i10) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean k10 = gVar.k();
        androidx.core.view.b a10 = gVar.a();
        boolean z10 = a10 != null && a10.a();
        if (gVar.j()) {
            boolean expandActionView = gVar.expandActionView() | k10;
            if (expandActionView) {
                e(true);
            }
            return expandActionView;
        }
        if (!gVar.hasSubMenu() && !z10) {
            if ((i10 & 1) == 0) {
                e(true);
            }
            return k10;
        }
        if ((i10 & 4) == 0) {
            e(false);
        }
        if (!gVar.hasSubMenu()) {
            gVar.x(new l(u(), this, gVar));
        }
        l lVar = (l) gVar.getSubMenu();
        if (z10) {
            a10.f(lVar);
        }
        boolean j10 = j(lVar, iVar) | k10;
        if (!j10) {
            e(true);
        }
        return j10;
    }

    public final void O(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f763f.size()) {
            return;
        }
        this.f763f.remove(i10);
        if (z10) {
            L(true);
        }
    }

    public void P(i iVar) {
        Iterator<WeakReference<i>> it = this.f780w.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar2 = next.get();
            if (iVar2 == null || iVar2 == iVar) {
                this.f780w.remove(next);
            }
        }
    }

    public void Q(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).Q(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (findItem = findItem(i11)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void R(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).R(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void S(a aVar) {
        this.f762e = aVar;
    }

    public e T(int i10) {
        this.f769l = i10;
        return this;
    }

    public void U(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f763f.size();
        e0();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.f763f.get(i10);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        d0();
    }

    public e V(int i10) {
        X(0, null, i10, null, null);
        return this;
    }

    public e W(Drawable drawable) {
        X(0, null, 0, drawable, null);
        return this;
    }

    public final void X(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources C = C();
        if (view != null) {
            this.f773p = view;
            this.f771n = null;
            this.f772o = null;
        } else {
            if (i10 > 0) {
                this.f771n = C.getText(i10);
            } else if (charSequence != null) {
                this.f771n = charSequence;
            }
            if (i11 > 0) {
                this.f772o = l2.b.f(u(), i11);
            } else if (drawable != null) {
                this.f772o = drawable;
            }
            this.f773p = null;
        }
        L(false);
    }

    public e Y(int i10) {
        X(i10, null, 0, null, null);
        return this;
    }

    public e Z(CharSequence charSequence) {
        X(0, charSequence, 0, null, null);
        return this;
    }

    public MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int B = B(i12);
        g g10 = g(i10, i11, i12, B, charSequence, this.f769l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f770m;
        if (contextMenuInfo != null) {
            g10.v(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.f763f;
        arrayList.add(n(arrayList, B), g10);
        L(true);
        return g10;
    }

    public e a0(View view) {
        X(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f759a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(i iVar) {
        c(iVar, this.f759a);
    }

    public void b0(boolean z10) {
        this.f783z = z10;
    }

    public void c(i iVar, Context context) {
        this.f780w.add(new WeakReference<>(iVar));
        iVar.i(context, this);
        this.f768k = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (androidx.core.view.r0.j(android.view.ViewConfiguration.get(r2.f759a), r2.f759a) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f759a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f759a
            boolean r3 = androidx.core.view.r0.j(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f761d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.c0(boolean):void");
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f781x;
        if (gVar != null) {
            f(gVar);
        }
        this.f763f.clear();
        L(true);
    }

    public void clearHeader() {
        this.f772o = null;
        this.f771n = null;
        this.f773p = null;
        L(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f762e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        this.f774q = false;
        if (this.f775r) {
            this.f775r = false;
            L(this.f776s);
        }
    }

    public final void e(boolean z10) {
        if (this.f778u) {
            return;
        }
        this.f778u = true;
        Iterator<WeakReference<i>> it = this.f780w.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar = next.get();
            if (iVar == null) {
                this.f780w.remove(next);
            } else {
                iVar.b(this, z10);
            }
        }
        this.f778u = false;
    }

    public void e0() {
        if (this.f774q) {
            return;
        }
        this.f774q = true;
        this.f775r = false;
        this.f776s = false;
    }

    public boolean f(g gVar) {
        boolean z10 = false;
        if (!this.f780w.isEmpty() && this.f781x == gVar) {
            e0();
            Iterator<WeakReference<i>> it = this.f780w.iterator();
            while (it.hasNext()) {
                WeakReference<i> next = it.next();
                i iVar = next.get();
                if (iVar == null) {
                    this.f780w.remove(next);
                } else {
                    z10 = iVar.h(this, gVar);
                    if (z10) {
                        break;
                    }
                }
            }
            d0();
            if (z10) {
                this.f781x = null;
            }
        }
        return z10;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f763f.get(i11);
            if (gVar.getItemId() == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final g g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new g(this, i10, i11, i12, i13, charSequence, i14);
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.f763f.get(i10);
    }

    public boolean h(@NonNull e eVar, @NonNull MenuItem menuItem) {
        a aVar = this.f762e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f783z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f763f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z10) {
        if (this.f780w.isEmpty()) {
            return;
        }
        e0();
        Iterator<WeakReference<i>> it = this.f780w.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar = next.get();
            if (iVar == null) {
                this.f780w.remove(next);
            } else {
                iVar.f(z10);
            }
        }
        d0();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return p(i10, keyEvent) != null;
    }

    public final boolean j(l lVar, i iVar) {
        if (this.f780w.isEmpty()) {
            return false;
        }
        boolean e10 = iVar != null ? iVar.e(lVar) : false;
        Iterator<WeakReference<i>> it = this.f780w.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar2 = next.get();
            if (iVar2 == null) {
                this.f780w.remove(next);
            } else if (!e10) {
                e10 = iVar2.e(lVar);
            }
        }
        return e10;
    }

    public boolean k(g gVar) {
        boolean z10 = false;
        if (this.f780w.isEmpty()) {
            return false;
        }
        e0();
        Iterator<WeakReference<i>> it = this.f780w.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar = next.get();
            if (iVar == null) {
                this.f780w.remove(next);
            } else {
                z10 = iVar.c(this, gVar);
                if (z10) {
                    break;
                }
            }
        }
        d0();
        if (z10) {
            this.f781x = gVar;
        }
        return z10;
    }

    public int l(int i10) {
        return m(i10, 0);
    }

    public int m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f763f.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public int o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f763f.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    public g p(int i10, KeyEvent keyEvent) {
        ArrayList<g> arrayList = this.f779v;
        arrayList.clear();
        q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean H = H();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = arrayList.get(i11);
            char alphabeticShortcut = H ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (H && alphabeticShortcut == '\b' && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return M(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g p8 = p(i10, keyEvent);
        boolean M = p8 != null ? M(p8, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return M;
    }

    public void q(List<g> list, int i10, KeyEvent keyEvent) {
        boolean H = H();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f763f.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = this.f763f.get(i11);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i10, keyEvent);
                }
                char alphabeticShortcut = H ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & SupportMenu.SUPPORTED_MODIFIERS_MASK) == ((H ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & SupportMenu.SUPPORTED_MODIFIERS_MASK) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (H && alphabeticShortcut == '\b' && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<g> E = E();
        if (this.f768k) {
            Iterator<WeakReference<i>> it = this.f780w.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference<i> next = it.next();
                i iVar = next.get();
                if (iVar == null) {
                    this.f780w.remove(next);
                } else {
                    z10 |= iVar.g();
                }
            }
            if (z10) {
                this.f766i.clear();
                this.f767j.clear();
                int size = E.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = E.get(i10);
                    if (gVar.l()) {
                        this.f766i.add(gVar);
                    } else {
                        this.f767j.add(gVar);
                    }
                }
            } else {
                this.f766i.clear();
                this.f767j.clear();
                this.f767j.addAll(E());
            }
            this.f768k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int l10 = l(i10);
        if (l10 >= 0) {
            int size = this.f763f.size() - l10;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f763f.get(l10).getGroupId() != i10) {
                    break;
                }
                O(l10, false);
                i11 = i12;
            }
            L(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        O(o(i10), true);
    }

    public ArrayList<g> s() {
        r();
        return this.f766i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f763f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f763f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.t(z11);
                gVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f782y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f763f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f763f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f763f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f763f.get(i11);
            if (gVar.getGroupId() == i10 && gVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            L(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f760c = z10;
        L(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f763f.size();
    }

    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f759a;
    }

    public g v() {
        return this.f781x;
    }

    public Drawable w() {
        return this.f772o;
    }

    public CharSequence x() {
        return this.f771n;
    }

    public View y() {
        return this.f773p;
    }

    public ArrayList<g> z() {
        r();
        return this.f767j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        l lVar = new l(this.f759a, this, gVar);
        gVar.x(lVar);
        return lVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.b.getString(i13));
    }
}
