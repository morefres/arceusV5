package k2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class v implements Iterable<Intent> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<Intent> f22332a = new ArrayList<>();
    public final Context b;

    public interface a {
        Intent t();
    }

    public v(Context context) {
        this.b = context;
    }

    public static v d(Context context) {
        return new v(context);
    }

    public v a(Intent intent) {
        this.f22332a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v b(Activity activity) {
        Intent t8 = activity instanceof a ? ((a) activity).t() : null;
        if (t8 == null) {
            t8 = i.a(activity);
        }
        if (t8 != null) {
            ComponentName component = t8.getComponent();
            if (component == null) {
                component = t8.resolveActivity(this.b.getPackageManager());
            }
            c(component);
            a(t8);
        }
        return this;
    }

    public v c(ComponentName componentName) {
        int size = this.f22332a.size();
        try {
            Intent b = i.b(this.b, componentName);
            while (b != null) {
                this.f22332a.add(size, b);
                b = i.b(this.b, b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public void e() {
        f(null);
    }

    public void f(Bundle bundle) {
        if (this.f22332a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f22332a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (l2.b.o(this.b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.b.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f22332a.iterator();
    }
}
