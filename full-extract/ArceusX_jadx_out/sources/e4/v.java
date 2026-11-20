package e4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes.dex */
public class v implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentManager f15681a;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.g f15682a;

        public a(androidx.fragment.app.g gVar) {
            this.f15682a = gVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            androidx.fragment.app.c k10 = this.f15682a.k();
            this.f15682a.m();
            androidx.fragment.app.i.u((ViewGroup) k10.K.getParent(), v.this.f15681a).q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public v(FragmentManager fragmentManager) {
        this.f15681a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        androidx.fragment.app.g A;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f15681a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d4.c.f14380a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(d4.c.b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(d4.c.f14381c, -1);
        String string = obtainStyledAttributes.getString(d4.c.f14382d);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !androidx.fragment.app.e.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        androidx.fragment.app.c m02 = resourceId != -1 ? this.f15681a.m0(resourceId) : null;
        if (m02 == null && string != null) {
            m02 = this.f15681a.n0(string);
        }
        if (m02 == null && id2 != -1) {
            m02 = this.f15681a.m0(id2);
        }
        if (m02 == null) {
            m02 = this.f15681a.y0().a(context.getClassLoader(), attributeValue);
            m02.f2425p = true;
            m02.f2435z = resourceId != 0 ? resourceId : id2;
            m02.A = id2;
            m02.B = string;
            m02.f2426q = true;
            FragmentManager fragmentManager = this.f15681a;
            m02.f2431v = fragmentManager;
            m02.f2432w = fragmentManager.A0();
            m02.R0(this.f15681a.A0().getContext(), attributeSet, m02.b);
            A = this.f15681a.l(m02);
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Fragment " + m02 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (m02.f2426q) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            m02.f2426q = true;
            FragmentManager fragmentManager2 = this.f15681a;
            m02.f2431v = fragmentManager2;
            m02.f2432w = fragmentManager2.A0();
            m02.R0(this.f15681a.A0().getContext(), attributeSet, m02.b);
            A = this.f15681a.A(m02);
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + m02 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        f4.c.g(m02, viewGroup);
        m02.J = viewGroup;
        A.m();
        A.j();
        View view2 = m02.K;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (m02.K.getTag() == null) {
            m02.K.setTag(string);
        }
        m02.K.addOnAttachStateChangeListener(new a(A));
        return m02.K;
    }
}
