package y2;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
import y2.s;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f36265a;
    public int b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f36266c = -1;

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;

        /* renamed from: e, reason: collision with root package name */
        public static final a f36267e = new a(1, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f36268f = new a(2, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f36269g = new a(4, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f36270h = new a(8, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f36271i = new a(16, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f36272j = new a(32, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f36273k = new a(64, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f36274l = new a(128, null);

        /* renamed from: m, reason: collision with root package name */
        public static final a f36275m = new a(256, (CharSequence) null, (Class<? extends s.a>) s.b.class);

        /* renamed from: n, reason: collision with root package name */
        public static final a f36276n = new a(512, (CharSequence) null, (Class<? extends s.a>) s.b.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f36277o = new a(1024, (CharSequence) null, (Class<? extends s.a>) s.c.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f36278p = new a(2048, (CharSequence) null, (Class<? extends s.a>) s.c.class);

        /* renamed from: q, reason: collision with root package name */
        public static final a f36279q = new a(4096, null);

        /* renamed from: r, reason: collision with root package name */
        public static final a f36280r = new a(8192, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f36281s = new a(16384, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f36282t = new a(32768, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f36283u = new a(65536, null);

        /* renamed from: v, reason: collision with root package name */
        public static final a f36284v = new a(131072, (CharSequence) null, (Class<? extends s.a>) s.g.class);

        /* renamed from: w, reason: collision with root package name */
        public static final a f36285w = new a(262144, null);

        /* renamed from: x, reason: collision with root package name */
        public static final a f36286x = new a(524288, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f36287y = new a(1048576, null);

        /* renamed from: z, reason: collision with root package name */
        public static final a f36288z = new a(2097152, (CharSequence) null, (Class<? extends s.a>) s.h.class);

        /* renamed from: a, reason: collision with root package name */
        public final Object f36289a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final Class<? extends s.a> f36290c;

        /* renamed from: d, reason: collision with root package name */
        public final s f36291d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            int i10 = Build.VERSION.SDK_INT;
            A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, s.e.class);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            if (i10 >= 29) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction = accessibilityAction20;
            } else {
                accessibilityAction = null;
            }
            H = new a(accessibilityAction, R.id.accessibilityActionPageDown, null, null, null);
            if (i10 >= 29) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction2 = accessibilityAction19;
            } else {
                accessibilityAction2 = null;
            }
            I = new a(accessibilityAction2, R.id.accessibilityActionPageLeft, null, null, null);
            if (i10 >= 29) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction3 = accessibilityAction18;
            } else {
                accessibilityAction3 = null;
            }
            J = new a(accessibilityAction3, R.id.accessibilityActionPageRight, null, null, null);
            K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, s.f.class);
            M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, s.d.class);
            N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i10 >= 28) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction4 = accessibilityAction17;
            } else {
                accessibilityAction4 = null;
            }
            O = new a(accessibilityAction4, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i10 >= 30) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction5 = accessibilityAction16;
            } else {
                accessibilityAction5 = null;
            }
            P = new a(accessibilityAction5, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i10 >= 30) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction6 = accessibilityAction15;
            } else {
                accessibilityAction6 = null;
            }
            Q = new a(accessibilityAction6, R.id.accessibilityActionImeEnter, null, null, null);
            if (i10 >= 32) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction7 = accessibilityAction14;
            } else {
                accessibilityAction7 = null;
            }
            R = new a(accessibilityAction7, R.id.accessibilityActionDragStart, null, null, null);
            if (i10 >= 32) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction8 = accessibilityAction13;
            } else {
                accessibilityAction8 = null;
            }
            S = new a(accessibilityAction8, R.id.accessibilityActionDragDrop, null, null, null);
            if (i10 >= 32) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction9 = accessibilityAction12;
            } else {
                accessibilityAction9 = null;
            }
            T = new a(accessibilityAction9, R.id.accessibilityActionDragCancel, null, null, null);
            if (i10 >= 33) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
                accessibilityAction10 = accessibilityAction11;
            } else {
                accessibilityAction10 = null;
            }
            U = new a(accessibilityAction10, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            V = new a(i10 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a a(CharSequence charSequence, s sVar) {
            return new a(null, this.b, charSequence, sVar, this.f36290c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f36289a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f36289a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            s.a newInstance;
            if (this.f36291d == null) {
                return false;
            }
            Class<? extends s.a> cls = this.f36290c;
            s.a aVar = null;
            if (cls != null) {
                try {
                    newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    newInstance.a(bundle);
                    aVar = newInstance;
                } catch (Exception e11) {
                    e = e11;
                    aVar = newInstance;
                    Class<? extends s.a> cls2 = this.f36290c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    return this.f36291d.a(view, aVar);
                }
            }
            return this.f36291d.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f36289a;
            return obj2 == null ? aVar.f36289a == null : obj2.equals(aVar.f36289a);
        }

        public int hashCode() {
            Object obj = this.f36289a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String g10 = p.g(this.b);
            if (g10.equals("ACTION_UNKNOWN") && c() != null) {
                g10 = c().toString();
            }
            sb2.append(g10);
            return sb2.toString();
        }

        public a(int i10, CharSequence charSequence, s sVar) {
            this(null, i10, charSequence, sVar, null);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i10, CharSequence charSequence, Class<? extends s.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        public a(Object obj, int i10, CharSequence charSequence, s sVar, Class<? extends s.a> cls) {
            this.b = i10;
            this.f36291d = sVar;
            if (obj == null) {
                this.f36289a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f36289a = obj;
            }
            this.f36290c = cls;
        }
    }

    public static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    public static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    public static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    public static class e {
        public static int b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getChecked();
        }

        public static int c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExpandedState();
        }

        public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getSupplementalDescription();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isFieldRequired();
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final Object f36292a;

        public f(Object obj) {
            this.f36292a = obj;
        }

        public static f a(int i10, int i11, boolean z10) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
        }

        public static f b(int i10, int i11, boolean z10, int i12) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public final Object f36293a;

        public g(Object obj) {
            this.f36293a = obj;
        }

        public static g a(int i10, int i11, int i12, int i13, boolean z10) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
        }

        public static g b(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    public p(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f36265a = accessibilityNodeInfo;
    }

    public static p O0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new p(accessibilityNodeInfo);
    }

    public static p Y() {
        return O0(AccessibilityNodeInfo.obtain());
    }

    public static p Z(View view) {
        return O0(AccessibilityNodeInfo.obtain(view));
    }

    public static p a0(p pVar) {
        return O0(AccessibilityNodeInfo.obtain(pVar.f36265a));
    }

    public static String g(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static String v(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "FULL" : "PARTIAL" : "COLLAPSED" : "UNDEFINED";
    }

    public CharSequence A() {
        return Build.VERSION.SDK_INT >= 36 ? e.d(this.f36265a) : this.f36265a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
    }

    public void A0(CharSequence charSequence) {
        this.f36265a.setPackageName(charSequence);
    }

    public CharSequence B() {
        if (!F()) {
            return this.f36265a.getText();
        }
        List<Integer> e10 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> e11 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> e12 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> e13 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f36265a.getText(), 0, this.f36265a.getText().length()));
        for (int i10 = 0; i10 < e10.size(); i10++) {
            spannableString.setSpan(new y2.a(e13.get(i10).intValue(), this, w().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), e10.get(i10).intValue(), e11.get(i10).intValue(), e12.get(i10).intValue());
        }
        return spannableString;
    }

    public void B0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f36265a.setPaneTitle(charSequence);
        } else {
            this.f36265a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public CharSequence C() {
        return Build.VERSION.SDK_INT >= 28 ? this.f36265a.getTooltipText() : this.f36265a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void C0(View view) {
        this.b = -1;
        this.f36265a.setParent(view);
    }

    public String D() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.f36265a) : this.f36265a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void D0(View view, int i10) {
        this.b = i10;
        this.f36265a.setParent(view, i10);
    }

    public String E() {
        return this.f36265a.getViewIdResourceName();
    }

    public void E0(CharSequence charSequence) {
        this.f36265a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public final boolean F() {
        return !e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public void F0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f36265a.setScreenReaderFocusable(z10);
        } else {
            f0(1, z10);
        }
    }

    public boolean G() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f36265a) : i(64);
    }

    public void G0(boolean z10) {
        this.f36265a.setScrollable(z10);
    }

    public boolean H() {
        return this.f36265a.isCheckable();
    }

    public void H0(boolean z10) {
        this.f36265a.setShowingHintText(z10);
    }

    @Deprecated
    public boolean I() {
        return this.f36265a.isChecked();
    }

    public void I0(View view, int i10) {
        this.f36266c = i10;
        this.f36265a.setSource(view, i10);
    }

    public boolean J() {
        return this.f36265a.isClickable();
    }

    public void J0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.f36265a, charSequence);
        } else {
            this.f36265a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean K() {
        return this.f36265a.isContextClickable();
    }

    public void K0(CharSequence charSequence) {
        this.f36265a.setText(charSequence);
    }

    public boolean L() {
        return this.f36265a.isEnabled();
    }

    public void L0(View view) {
        this.f36265a.setTraversalAfter(view);
    }

    public boolean M() {
        return Build.VERSION.SDK_INT >= 36 ? e.e(this.f36265a) : this.f36265a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    public void M0(boolean z10) {
        this.f36265a.setVisibleToUser(z10);
    }

    public boolean N() {
        return this.f36265a.isFocusable();
    }

    public AccessibilityNodeInfo N0() {
        return this.f36265a;
    }

    public boolean O() {
        return this.f36265a.isFocused();
    }

    public boolean P() {
        return i(67108864);
    }

    public boolean Q() {
        return this.f36265a.isImportantForAccessibility();
    }

    public boolean R() {
        return this.f36265a.isLongClickable();
    }

    public boolean S() {
        return this.f36265a.isPassword();
    }

    public boolean T() {
        return this.f36265a.isScrollable();
    }

    public boolean U() {
        return this.f36265a.isSelected();
    }

    public boolean V() {
        return this.f36265a.isShowingHintText();
    }

    public boolean W() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f36265a) : i(8388608);
    }

    public boolean X() {
        return this.f36265a.isVisibleToUser();
    }

    public void a(int i10) {
        this.f36265a.addAction(i10);
    }

    public void b(a aVar) {
        this.f36265a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f36289a);
    }

    public boolean b0(int i10, Bundle bundle) {
        return this.f36265a.performAction(i10, bundle);
    }

    public void c(View view, int i10) {
        this.f36265a.addChild(view, i10);
    }

    @Deprecated
    public void c0() {
    }

    public void d(CharSequence charSequence, View view) {
    }

    public boolean d0(a aVar) {
        return this.f36265a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f36289a);
    }

    public final List<Integer> e(String str) {
        ArrayList<Integer> integerArrayList = this.f36265a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f36265a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void e0(boolean z10) {
        this.f36265a.setAccessibilityFocused(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f36265a;
        if (accessibilityNodeInfo == null) {
            if (pVar.f36265a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(pVar.f36265a)) {
            return false;
        }
        return this.f36266c == pVar.f36266c && this.b == pVar.b;
    }

    public List<a> f() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f36265a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public final void f0(int i10, boolean z10) {
        Bundle w5 = w();
        if (w5 != null) {
            int i11 = w5.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            w5.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    @Deprecated
    public void g0(Rect rect) {
        this.f36265a.setBoundsInParent(rect);
    }

    @Deprecated
    public int h() {
        return this.f36265a.getActions();
    }

    public void h0(Rect rect) {
        this.f36265a.setBoundsInScreen(rect);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f36265a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final boolean i(int i10) {
        Bundle w5 = w();
        return w5 != null && (w5.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public void i0(boolean z10) {
        this.f36265a.setCanOpenPopup(z10);
    }

    @Deprecated
    public void j(Rect rect) {
        this.f36265a.getBoundsInParent(rect);
    }

    public void j0(boolean z10) {
        this.f36265a.setCheckable(z10);
    }

    public void k(Rect rect) {
        this.f36265a.getBoundsInScreen(rect);
    }

    @Deprecated
    public void k0(boolean z10) {
        this.f36265a.setChecked(z10);
    }

    public void l(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f36265a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f36265a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void l0(CharSequence charSequence) {
        this.f36265a.setClassName(charSequence);
    }

    public int m() {
        return Build.VERSION.SDK_INT >= 36 ? e.b(this.f36265a) : this.f36265a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", this.f36265a.isChecked() ? 1 : 0);
    }

    public void m0(boolean z10) {
        this.f36265a.setClickable(z10);
    }

    public final String n() {
        int m10 = m();
        return m10 == 1 ? "TRUE" : m10 == 2 ? "PARTIAL" : "FALSE";
    }

    public void n0(Object obj) {
        this.f36265a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((f) obj).f36292a);
    }

    public int o() {
        return this.f36265a.getChildCount();
    }

    public void o0(Object obj) {
        this.f36265a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).f36293a);
    }

    public CharSequence p() {
        return this.f36265a.getClassName();
    }

    public void p0(CharSequence charSequence) {
        this.f36265a.setContentDescription(charSequence);
    }

    public void q0(boolean z10) {
        this.f36265a.setDismissable(z10);
    }

    public CharSequence r() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f36265a) : this.f36265a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void r0(boolean z10) {
        this.f36265a.setEnabled(z10);
    }

    public CharSequence s() {
        return this.f36265a.getContentDescription();
    }

    public void s0(CharSequence charSequence) {
        this.f36265a.setError(charSequence);
    }

    public CharSequence t() {
        return this.f36265a.getError();
    }

    public void t0(boolean z10) {
        this.f36265a.setFocusable(z10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        j(rect);
        sb2.append("; boundsInParent: " + rect);
        k(rect);
        sb2.append("; boundsInScreen: " + rect);
        l(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(y());
        sb2.append("; className: ");
        sb2.append(p());
        sb2.append("; text: ");
        sb2.append(B());
        sb2.append("; error: ");
        sb2.append(t());
        sb2.append("; maxTextLength: ");
        sb2.append(x());
        sb2.append("; stateDescription: ");
        sb2.append(z());
        sb2.append("; contentDescription: ");
        sb2.append(s());
        sb2.append("; supplementalDescription: ");
        sb2.append(A());
        sb2.append("; tooltipText: ");
        sb2.append(C());
        sb2.append("; viewIdResName: ");
        sb2.append(E());
        sb2.append("; uniqueId: ");
        sb2.append(D());
        sb2.append("; checkable: ");
        sb2.append(H());
        sb2.append("; checked: ");
        sb2.append(n());
        sb2.append("; fieldRequired: ");
        sb2.append(M());
        sb2.append("; focusable: ");
        sb2.append(N());
        sb2.append("; focused: ");
        sb2.append(O());
        sb2.append("; selected: ");
        sb2.append(U());
        sb2.append("; clickable: ");
        sb2.append(J());
        sb2.append("; longClickable: ");
        sb2.append(R());
        sb2.append("; contextClickable: ");
        sb2.append(K());
        sb2.append("; expandedState: ");
        sb2.append(v(u()));
        sb2.append("; enabled: ");
        sb2.append(L());
        sb2.append("; password: ");
        sb2.append(S());
        sb2.append("; scrollable: " + T());
        sb2.append("; containerTitle: ");
        sb2.append(r());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(P());
        sb2.append("; importantForAccessibility: ");
        sb2.append(Q());
        sb2.append("; visible: ");
        sb2.append(X());
        sb2.append("; isTextSelectable: ");
        sb2.append(W());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(G());
        sb2.append("; [");
        List<a> f10 = f();
        for (int i10 = 0; i10 < f10.size(); i10++) {
            a aVar = f10.get(i10);
            String g10 = g(aVar.b());
            if (g10.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                g10 = aVar.c().toString();
            }
            sb2.append(g10);
            if (i10 != f10.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public int u() {
        return Build.VERSION.SDK_INT >= 36 ? e.c(this.f36265a) : this.f36265a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
    }

    public void u0(boolean z10) {
        this.f36265a.setFocused(z10);
    }

    public void v0(boolean z10) {
        f0(67108864, z10);
    }

    public Bundle w() {
        return this.f36265a.getExtras();
    }

    public void w0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f36265a.setHeading(z10);
        } else {
            f0(2, z10);
        }
    }

    public int x() {
        return this.f36265a.getMaxTextLength();
    }

    public void x0(CharSequence charSequence) {
        this.f36265a.setHintText(charSequence);
    }

    public CharSequence y() {
        return this.f36265a.getPackageName();
    }

    public void y0(View view) {
        this.f36265a.setLabelFor(view);
    }

    public CharSequence z() {
        return Build.VERSION.SDK_INT >= 30 ? b.a(this.f36265a) : this.f36265a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void z0(int i10) {
        this.f36265a.setMaxTextLength(i10);
    }
}
