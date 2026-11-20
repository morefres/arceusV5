package j;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.core.view.o0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import q.b0;
import q.d0;
import q.u;
import q.v;
import q.x;
import q.x0;

/* loaded from: classes.dex */
public class n {
    public static final Class<?>[] b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f21382c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f21383d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f21384e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f21385f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f21386g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final w1.j<String, Constructor<? extends View>> f21387h = new w1.j<>();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f21388a = new Object[2];

    public static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final View f21389a;
        public final String b;

        /* renamed from: c, reason: collision with root package name */
        public Method f21390c;

        /* renamed from: d, reason: collision with root package name */
        public Context f21391d;

        public a(@NonNull View view, @NonNull String str) {
            this.f21389a = view;
            this.b = str;
        }

        public final void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.b, View.class)) != null) {
                        this.f21390c = method;
                        this.f21391d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id2 = this.f21389a.getId();
            if (id2 == -1) {
                str = "";
            } else {
                str = " with id '" + this.f21389a.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f21389a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NonNull View view) {
            if (this.f21390c == null) {
                a(this.f21389a.getContext());
            }
            try {
                this.f21390c.invoke(this.f21391d, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public static Context u(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.J3, 0, 0);
        int resourceId = z10 ? obtainStyledAttributes.getResourceId(i.j.K3, 0) : 0;
        if (z11 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(i.j.L3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof o.d) && ((o.d) context).c() == resourceId)) ? context : new o.d(context, resourceId);
    }

    public final void a(@NonNull Context context, @NonNull View view, @NonNull AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f21383d);
        if (obtainStyledAttributes.hasValue(0)) {
            o0.n0(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f21384e);
        if (obtainStyledAttributes2.hasValue(0)) {
            o0.p0(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f21385f);
        if (obtainStyledAttributes3.hasValue(0)) {
            o0.C0(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    public final void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f21382c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public q.d c(Context context, AttributeSet attributeSet) {
        return new q.d(context, attributeSet);
    }

    @NonNull
    public q.f d(Context context, AttributeSet attributeSet) {
        return new q.f(context, attributeSet);
    }

    @NonNull
    public q.g e(Context context, AttributeSet attributeSet) {
        return new q.g(context, attributeSet);
    }

    @NonNull
    public q.h f(Context context, AttributeSet attributeSet) {
        return new q.h(context, attributeSet);
    }

    @NonNull
    public q.l g(Context context, AttributeSet attributeSet) {
        return new q.l(context, attributeSet);
    }

    @NonNull
    public AppCompatImageButton h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    @NonNull
    public q.q i(Context context, AttributeSet attributeSet) {
        return new q.q(context, attributeSet);
    }

    @NonNull
    public q.r j(Context context, AttributeSet attributeSet) {
        return new q.r(context, attributeSet);
    }

    @NonNull
    public u k(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    @NonNull
    public v l(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    @NonNull
    public x m(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    @NonNull
    public AppCompatSpinner n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    @NonNull
    public b0 o(Context context, AttributeSet attributeSet) {
        return new b0(context, attributeSet);
    }

    @NonNull
    public d0 p(Context context, AttributeSet attributeSet) {
        return new d0(context, attributeSet);
    }

    public View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        Context context2;
        View l10;
        context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = u(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = x0.b(context2);
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                l10 = l(context2, attributeSet);
                v(l10, str);
                break;
            case "CheckedTextView":
                l10 = f(context2, attributeSet);
                v(l10, str);
                break;
            case "MultiAutoCompleteTextView":
                l10 = j(context2, attributeSet);
                v(l10, str);
                break;
            case "TextView":
                l10 = o(context2, attributeSet);
                v(l10, str);
                break;
            case "ImageButton":
                l10 = h(context2, attributeSet);
                v(l10, str);
                break;
            case "SeekBar":
                l10 = m(context2, attributeSet);
                v(l10, str);
                break;
            case "Spinner":
                l10 = n(context2, attributeSet);
                v(l10, str);
                break;
            case "RadioButton":
                l10 = k(context2, attributeSet);
                v(l10, str);
                break;
            case "ToggleButton":
                l10 = p(context2, attributeSet);
                v(l10, str);
                break;
            case "ImageView":
                l10 = i(context2, attributeSet);
                v(l10, str);
                break;
            case "AutoCompleteTextView":
                l10 = c(context2, attributeSet);
                v(l10, str);
                break;
            case "CheckBox":
                l10 = e(context2, attributeSet);
                v(l10, str);
                break;
            case "EditText":
                l10 = g(context2, attributeSet);
                v(l10, str);
                break;
            case "Button":
                l10 = d(context2, attributeSet);
                v(l10, str);
                break;
            default:
                l10 = q(context2, str, attributeSet);
                break;
        }
        if (l10 == null && context != context2) {
            l10 = t(context2, str, attributeSet);
        }
        if (l10 != null) {
            b(l10, attributeSet);
            a(context2, l10, attributeSet);
        }
        return l10;
    }

    public final View s(Context context, String str, String str2) {
        String str3;
        w1.j<String, Constructor<? extends View>> jVar = f21387h;
        Constructor<? extends View> constructor = jVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            jVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f21388a);
    }

    public final View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f21388a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f21386g;
                if (i10 >= strArr.length) {
                    return null;
                }
                View s8 = s(context, str, strArr[i10]);
                if (s8 != null) {
                    return s8;
                }
                i10++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f21388a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    public final void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
