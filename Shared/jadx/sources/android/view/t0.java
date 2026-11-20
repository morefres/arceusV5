package android.view;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import android.view.a1;
import d5.f;
import d5.i;
import gu.c;
import j6.b;
import java.lang.reflect.Constructor;
import java.util.List;
import k4.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;
import ve.a;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroidx/lifecycle/t0;", "Landroidx/lifecycle/a1$e;", "Landroidx/lifecycle/a1$c;", "Landroid/app/Application;", "application", "Ld5/i;", "owner", "Landroid/os/Bundle;", "defaultArgs", "<init>", "(Landroid/app/Application;Ld5/i;Landroid/os/Bundle;)V", "Landroidx/lifecycle/x0;", "T", "Lgu/c;", "modelClass", "Lk4/a;", "extras", b.f21518e, "(Lgu/c;Lk4/a;)Landroidx/lifecycle/x0;", "Ljava/lang/Class;", a.f33391e, "(Ljava/lang/Class;Lk4/a;)Landroidx/lifecycle/x0;", "", "key", "e", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/x0;", "c", "(Ljava/lang/Class;)Landroidx/lifecycle/x0;", "viewModel", "", d.f30696a, "(Landroidx/lifecycle/x0;)V", "Landroid/app/Application;", "Landroidx/lifecycle/a1$c;", "factory", "Landroid/os/Bundle;", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/l;", "lifecycle", "Ld5/f;", "f", "Ld5/f;", "savedStateRegistry", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t0 extends a1.e implements a1.c {

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Application application;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a1.c factory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Bundle defaultArgs;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public l lifecycle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public f savedStateRegistry;

    @SuppressLint({"LambdaLast"})
    public t0(@Nullable Application application, @NotNull i owner, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.savedStateRegistry = owner.z();
        this.lifecycle = owner.a();
        this.defaultArgs = bundle;
        this.application = application;
        this.factory = application != null ? a1.a.INSTANCE.a(application) : new a1.a();
    }

    @Override // androidx.lifecycle.a1.c
    @NotNull
    public <T extends x0> T a(@NotNull Class<T> modelClass, @NotNull CreationExtras extras) {
        List list;
        Constructor c10;
        List list2;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(a1.f2559c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(o0.f2645a) == null || extras.a(o0.b) == null) {
            if (this.lifecycle != null) {
                return (T) e(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(a1.a.f2563h);
        boolean isAssignableFrom = b.class.isAssignableFrom(modelClass);
        if (!isAssignableFrom || application == null) {
            list = u0.b;
            c10 = u0.c(modelClass, list);
        } else {
            list2 = u0.f2665a;
            c10 = u0.c(modelClass, list2);
        }
        return c10 == null ? (T) this.factory.a(modelClass, extras) : (!isAssignableFrom || application == null) ? (T) u0.d(modelClass, c10, o0.b(extras)) : (T) u0.d(modelClass, c10, application, o0.b(extras));
    }

    @Override // androidx.lifecycle.a1.c
    @NotNull
    public <T extends x0> T b(@NotNull c<T> modelClass, @NotNull CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return (T) a(xt.a.a(modelClass), extras);
    }

    @Override // androidx.lifecycle.a1.c
    @NotNull
    public <T extends x0> T c(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) e(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.a1.e
    public void d(@NotNull x0 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.lifecycle != null) {
            f fVar = this.savedStateRegistry;
            Intrinsics.checkNotNull(fVar);
            l lVar = this.lifecycle;
            Intrinsics.checkNotNull(lVar);
            k.a(viewModel, fVar, lVar);
        }
    }

    @NotNull
    public final <T extends x0> T e(@NotNull String key, @NotNull Class<T> modelClass) {
        List list;
        Constructor c10;
        T t8;
        Application application;
        List list2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        l lVar = this.lifecycle;
        if (lVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = b.class.isAssignableFrom(modelClass);
        if (!isAssignableFrom || this.application == null) {
            list = u0.b;
            c10 = u0.c(modelClass, list);
        } else {
            list2 = u0.f2665a;
            c10 = u0.c(modelClass, list2);
        }
        if (c10 == null) {
            return this.application != null ? (T) this.factory.c(modelClass) : (T) a1.d.INSTANCE.a().c(modelClass);
        }
        f fVar = this.savedStateRegistry;
        Intrinsics.checkNotNull(fVar);
        n0 b = k.b(fVar, lVar, key, this.defaultArgs);
        if (!isAssignableFrom || (application = this.application) == null) {
            t8 = (T) u0.d(modelClass, c10, b.getHandle());
        } else {
            Intrinsics.checkNotNull(application);
            t8 = (T) u0.d(modelClass, c10, application, b.getHandle());
        }
        t8.a("androidx.lifecycle.savedstate.vm.tag", b);
        return t8;
    }
}
