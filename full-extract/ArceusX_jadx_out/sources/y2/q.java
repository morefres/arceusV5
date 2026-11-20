package y2;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f36294a;

    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        public final q f36295a;

        public a(q qVar) {
            this.f36295a = qVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            p b = this.f36295a.b(i10);
            if (b == null) {
                return null;
            }
            return b.N0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            List<p> c10 = this.f36295a.c(str, i10);
            if (c10 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c10.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(c10.get(i11).N0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            p d10 = this.f36295a.d(i10);
            if (d10 == null) {
                return null;
            }
            return d10.N0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f36295a.f(i10, i11, bundle);
        }
    }

    public static class b extends a {
        public b(q qVar) {
            super(qVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f36295a.a(i10, p.O0(accessibilityNodeInfo), str, bundle);
        }
    }

    public q() {
        this.f36294a = new b(this);
    }

    public void a(int i10, p pVar, String str, Bundle bundle) {
    }

    public p b(int i10) {
        return null;
    }

    public List<p> c(String str, int i10) {
        return null;
    }

    public p d(int i10) {
        return null;
    }

    public Object e() {
        return this.f36294a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public q(Object obj) {
        this.f36294a = obj;
    }
}
