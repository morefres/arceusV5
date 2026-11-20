package q;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class u0 extends p3.c implements View.OnClickListener {

    /* renamed from: l, reason: collision with root package name */
    public final SearchView f29438l;

    /* renamed from: m, reason: collision with root package name */
    public final SearchableInfo f29439m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f29440n;

    /* renamed from: o, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f29441o;

    /* renamed from: p, reason: collision with root package name */
    public final int f29442p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f29443q;

    /* renamed from: r, reason: collision with root package name */
    public int f29444r;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f29445s;

    /* renamed from: t, reason: collision with root package name */
    public int f29446t;

    /* renamed from: u, reason: collision with root package name */
    public int f29447u;

    /* renamed from: v, reason: collision with root package name */
    public int f29448v;

    /* renamed from: w, reason: collision with root package name */
    public int f29449w;

    /* renamed from: x, reason: collision with root package name */
    public int f29450x;

    /* renamed from: y, reason: collision with root package name */
    public int f29451y;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f29452a;
        public final TextView b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f29453c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f29454d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f29455e;

        public a(View view) {
            this.f29452a = (TextView) view.findViewById(R.id.text1);
            this.b = (TextView) view.findViewById(R.id.text2);
            this.f29453c = (ImageView) view.findViewById(R.id.icon1);
            this.f29454d = (ImageView) view.findViewById(R.id.icon2);
            this.f29455e = (ImageView) view.findViewById(i.f.f19883s);
        }
    }

    public u0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f29443q = false;
        this.f29444r = 1;
        this.f29446t = -1;
        this.f29447u = -1;
        this.f29448v = -1;
        this.f29449w = -1;
        this.f29450x = -1;
        this.f29451y = -1;
        this.f29438l = searchView;
        this.f29439m = searchableInfo;
        this.f29442p = searchView.getSuggestionCommitIconResId();
        this.f29440n = context;
        this.f29441o = weakHashMap;
    }

    public static String n(Cursor cursor, String str) {
        return v(cursor, cursor.getColumnIndex(str));
    }

    public static String v(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    public final void A(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // p3.a, p3.b.a
    public void a(Cursor cursor) {
        if (this.f29443q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f29446t = cursor.getColumnIndex("suggest_text_1");
                this.f29447u = cursor.getColumnIndex("suggest_text_2");
                this.f29448v = cursor.getColumnIndex("suggest_text_2_url");
                this.f29449w = cursor.getColumnIndex("suggest_icon_1");
                this.f29450x = cursor.getColumnIndex("suggest_icon_2");
                this.f29451y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // p3.b.a
    public Cursor b(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f29438l.getVisibility() == 0 && this.f29438l.getWindowVisibility() == 0) {
            try {
                Cursor u8 = u(this.f29439m, charSequence2, 50);
                if (u8 != null) {
                    u8.getCount();
                    return u8;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // p3.a, p3.b.a
    public CharSequence convertToString(Cursor cursor) {
        String n10;
        String n11;
        if (cursor == null) {
            return null;
        }
        String n12 = n(cursor, "suggest_intent_query");
        if (n12 != null) {
            return n12;
        }
        if (this.f29439m.shouldRewriteQueryFromData() && (n11 = n(cursor, "suggest_intent_data")) != null) {
            return n11;
        }
        if (!this.f29439m.shouldRewriteQueryFromText() || (n10 = n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return n10;
    }

    @Override // p3.a
    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.f29451y;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f29452a != null) {
            y(aVar.f29452a, v(cursor, this.f29446t));
        }
        if (aVar.b != null) {
            String v5 = v(cursor, this.f29448v);
            CharSequence k10 = v5 != null ? k(v5) : v(cursor, this.f29447u);
            if (TextUtils.isEmpty(k10)) {
                TextView textView = aVar.f29452a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f29452a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f29452a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f29452a.setMaxLines(1);
                }
            }
            y(aVar.b, k10);
        }
        ImageView imageView = aVar.f29453c;
        if (imageView != null) {
            x(imageView, s(cursor), 4);
        }
        ImageView imageView2 = aVar.f29454d;
        if (imageView2 != null) {
            x(imageView2, t(cursor), 8);
        }
        int i12 = this.f29444r;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f29455e.setVisibility(8);
            return;
        }
        aVar.f29455e.setVisibility(0);
        aVar.f29455e.setTag(aVar.f29452a.getText());
        aVar.f29455e.setOnClickListener(this);
    }

    @Override // p3.c, p3.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View g10 = super.g(context, cursor, viewGroup);
        g10.setTag(new a(g10));
        ((ImageView) g10.findViewById(i.f.f19883s)).setImageResource(this.f29442p);
        return g10;
    }

    @Override // p3.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View f10 = f(this.f29440n, c(), viewGroup);
            if (f10 != null) {
                ((a) f10.getTag()).f29452a.setText(e10.toString());
            }
            return f10;
        }
    }

    @Override // p3.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View g10 = g(this.f29440n, c(), viewGroup);
            if (g10 != null) {
                ((a) g10.getTag()).f29452a.setText(e10.toString());
            }
            return g10;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public final Drawable j(String str) {
        Drawable.ConstantState constantState = this.f29441o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    public final CharSequence k(CharSequence charSequence) {
        if (this.f29445s == null) {
            TypedValue typedValue = new TypedValue();
            this.f29440n.getTheme().resolveAttribute(i.a.O, typedValue, true);
            this.f29445s = this.f29440n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f29445s, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public final Drawable l(ComponentName componentName) {
        PackageManager packageManager = this.f29440n.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("SuggestionsAdapter", e10.toString());
            return null;
        }
    }

    public final Drawable m(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f29441o.containsKey(flattenToShortString)) {
            Drawable l10 = l(componentName);
            this.f29441o.put(flattenToShortString, l10 != null ? l10.getConstantState() : null);
            return l10;
        }
        Drawable.ConstantState constantState = this.f29441o.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f29440n.getResources());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        A(c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        A(c());
    }

    public final Drawable o() {
        Drawable m10 = m(this.f29439m.getSearchActivity());
        return m10 != null ? m10 : this.f29440n.getPackageManager().getDefaultActivityIcon();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f29438l.S((CharSequence) tag);
        }
    }

    public final Drawable p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f29440n.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                try {
                    return createFromStream;
                } catch (IOException e10) {
                    return createFromStream;
                }
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException e102) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e102);
                }
            }
        } catch (FileNotFoundException e11) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
        return null;
    }

    public Drawable q(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f29440n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    public final Drawable r(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f29440n.getPackageName() + "/" + parseInt;
            Drawable j10 = j(str2);
            if (j10 != null) {
                return j10;
            }
            Drawable f10 = l2.b.f(this.f29440n, parseInt);
            z(str2, f10);
            return f10;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable j11 = j(str);
            if (j11 != null) {
                return j11;
            }
            Drawable p8 = p(Uri.parse(str));
            z(str, p8);
            return p8;
        }
    }

    public final Drawable s(Cursor cursor) {
        int i10 = this.f29449w;
        if (i10 == -1) {
            return null;
        }
        Drawable r8 = r(cursor.getString(i10));
        return r8 != null ? r8 : o();
    }

    public final Drawable t(Cursor cursor) {
        int i10 = this.f29450x;
        if (i10 == -1) {
            return null;
        }
        return r(cursor.getString(i10));
    }

    public Cursor u(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f29440n.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void w(int i10) {
        this.f29444r = i10;
    }

    public final void x(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final void y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public final void z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f29441o.put(str, drawable.getConstantState());
        }
    }
}
