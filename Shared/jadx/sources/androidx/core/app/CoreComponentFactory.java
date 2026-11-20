package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.MotionEventCompat;

/* JADX WARN: Classes with same name are omitted:
  classes.dex
 */
@RequiresApi(api = MotionEventCompat.AXIS_RELATIVE_Y)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class CoreComponentFactory extends android.app.AppComponentFactory {
    private static final String TAG = "CoreComponentFactory";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface CompatWrapped {
        Object getWrapper();
    }

    /* loaded from: classes.dex */
    public interface a {
        Object a();
    }

    public Activity instantiateActivity(ClassLoader cl2, String className, Intent intent) {
        return (Activity) checkCompatWrapper(super.instantiateActivity(cl2, className, intent));
    }

    public Application instantiateApplication(ClassLoader cl2, String className) {
        return (Application) checkCompatWrapper(super.instantiateApplication(cl2, className));
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader cl2, String className, Intent intent) {
        return (BroadcastReceiver) checkCompatWrapper(super.instantiateReceiver(cl2, className, intent));
    }

    public ContentProvider instantiateProvider(ClassLoader cl2, String className) {
        return (ContentProvider) checkCompatWrapper(super.instantiateProvider(cl2, className));
    }

    public Service instantiateService(ClassLoader cl2, String className, Intent intent) {
        return (Service) checkCompatWrapper(super.instantiateService(cl2, className, intent));
    }

    static <T> T checkCompatWrapper(T t8) {
        T t10;
        if ((t8 instanceof CompatWrapped) && (t10 = (T) ((CompatWrapped) t8).getWrapper()) != null) {
            return t10;
        }
        return t8;
    }
}
