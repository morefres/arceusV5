package com.squareup.workflow1.ui;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.j0;
import android.view.l;
import android.view.q;
import android.widget.FrameLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import gt.o;
import j6.b;
import ju.k;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mu.h;
import mu.i;
import nt.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;
import ym.ViewEnvironment;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001$B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/squareup/workflow1/ui/WorkflowLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "newRendering", "Lym/y;", "environment", "", "c", "(Ljava/lang/Object;Lym/y;)V", "Landroidx/lifecycle/l;", "lifecycle", "Lmu/h;", "renderings", "Landroidx/lifecycle/l$b;", "repeatOnLifecycle", ve.a.f33391e, "(Landroidx/lifecycle/l;Lmu/h;Landroidx/lifecycle/l$b;Lym/y;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Lcom/squareup/workflow1/ui/WorkflowViewStub;", "Lcom/squareup/workflow1/ui/WorkflowViewStub;", "showing", "Landroid/util/SparseArray;", b.f21518e, "Landroid/util/SparseArray;", "restoredChildState", "SavedState", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkflowLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WorkflowViewStub showing;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public SparseArray<Parcelable> restoredChildState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 6, 0})
    @f(c = "com.squareup.workflow1.ui.WorkflowLayout$start$1", f = "WorkflowLayout.kt", l = {87}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f9911t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ l f9912u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ l.b f9913v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ h<Object> f9914w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ WorkflowLayout f9915x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ ViewEnvironment f9916y;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 6, 0})
        @f(c = "com.squareup.workflow1.ui.WorkflowLayout$start$1$1", f = "WorkflowLayout.kt", l = {212}, m = "invokeSuspend")
        /* renamed from: com.squareup.workflow1.ui.WorkflowLayout$a$a, reason: collision with other inner class name */
        public static final class C0161a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f9917t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ h<Object> f9918u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ WorkflowLayout f9919v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ ViewEnvironment f9920w;

            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"com/squareup/workflow1/ui/WorkflowLayout$a$a$a", "Lmu/i;", "value", "", "emit", "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
            /* renamed from: com.squareup.workflow1.ui.WorkflowLayout$a$a$a, reason: collision with other inner class name */
            public static final class C0162a implements i<Object> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ WorkflowLayout f9921a;
                public final /* synthetic */ ViewEnvironment b;

                public C0162a(WorkflowLayout workflowLayout, ViewEnvironment viewEnvironment) {
                    this.f9921a = workflowLayout;
                    this.b = viewEnvironment;
                }

                @Override // mu.i
                @Nullable
                public Object emit(Object obj, @NotNull mt.b<? super Unit> bVar) {
                    this.f9921a.c(obj, this.b);
                    return Unit.f22894a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0161a(h<? extends Object> hVar, WorkflowLayout workflowLayout, ViewEnvironment viewEnvironment, mt.b<? super C0161a> bVar) {
                super(2, bVar);
                this.f9918u = hVar;
                this.f9919v = workflowLayout;
                this.f9920w = viewEnvironment;
            }

            @Override // ot.a
            @NotNull
            public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
                return new C0161a(this.f9918u, this.f9919v, this.f9920w, bVar);
            }

            @Override // ot.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object e10 = c.e();
                int i10 = this.f9917t;
                if (i10 == 0) {
                    o.b(obj);
                    h<Object> hVar = this.f9918u;
                    C0162a c0162a = new C0162a(this.f9919v, this.f9920w);
                    this.f9917t = 1;
                    if (hVar.collect(c0162a, this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull p0 p0Var, @Nullable mt.b<? super Unit> bVar) {
                return ((C0161a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, l.b bVar, h<? extends Object> hVar, WorkflowLayout workflowLayout, ViewEnvironment viewEnvironment, mt.b<? super a> bVar2) {
            super(2, bVar2);
            this.f9912u = lVar;
            this.f9913v = bVar;
            this.f9914w = hVar;
            this.f9915x = workflowLayout;
            this.f9916y = viewEnvironment;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
            return new a(this.f9912u, this.f9913v, this.f9914w, this.f9915x, this.f9916y, bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object e10 = c.e();
            int i10 = this.f9911t;
            if (i10 == 0) {
                o.b(obj);
                l lVar = this.f9912u;
                l.b bVar = this.f9913v;
                C0161a c0161a = new C0161a(this.f9914w, this.f9915x, this.f9916y, null);
                this.f9911t = 1;
                if (j0.a(lVar, bVar, c0161a, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public /* synthetic */ WorkflowLayout(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public static /* synthetic */ void b(WorkflowLayout workflowLayout, l lVar, h hVar, l.b bVar, ViewEnvironment viewEnvironment, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bVar = l.b.f2629d;
        }
        if ((i10 & 8) != 0) {
            viewEnvironment = new ViewEnvironment(null, 1, null);
        }
        workflowLayout.a(lVar, hVar, bVar, viewEnvironment);
    }

    public final void a(@NotNull l lifecycle, @NotNull h<? extends Object> renderings, @NotNull l.b repeatOnLifecycle, @NotNull ViewEnvironment environment) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(renderings, "renderings");
        Intrinsics.checkNotNullParameter(repeatOnLifecycle, "repeatOnLifecycle");
        Intrinsics.checkNotNullParameter(environment, "environment");
        k.d(q.a(lifecycle), null, null, new a(lifecycle, repeatOnLifecycle, renderings, this, environment, null), 3, null);
    }

    public final void c(@NotNull Object newRendering, @NotNull ViewEnvironment environment) {
        Intrinsics.checkNotNullParameter(newRendering, "newRendering");
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.showing.c(newRendering, environment);
        SparseArray<Parcelable> sparseArray = this.restoredChildState;
        if (sparseArray == null) {
            return;
        }
        this.restoredChildState = null;
        this.showing.getActual().restoreHierarchyState(sparseArray);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable state) {
        Unit unit = null;
        SavedState savedState = state instanceof SavedState ? (SavedState) state : null;
        if (savedState != null) {
            this.restoredChildState = savedState.a();
            super.onRestoreInstanceState(((SavedState) state).getSuperState());
            unit = Unit.f22894a;
        }
        if (unit == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        }
    }

    @Override // android.view.View
    @NotNull
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNull(onSaveInstanceState);
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.showing.getActual().saveHierarchyState(sparseArray);
        return new SavedState(onSaveInstanceState, sparseArray);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/squareup/workflow1/ui/WorkflowLayout$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "Landroid/util/SparseArray;", "childState", "<init>", "(Landroid/os/Parcelable;Landroid/util/SparseArray;)V", "Landroid/os/Parcel;", Payload.SOURCE, "(Landroid/os/Parcel;)V", "out", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, "Landroid/util/SparseArray;", "()Landroid/util/SparseArray;", "CREATOR", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        /* renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final SparseArray<Parcelable> childState;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/workflow1/ui/WorkflowLayout$SavedState$a;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/WorkflowLayout$SavedState;", "<init>", "()V", "Landroid/os/Parcel;", Payload.SOURCE, ve.a.f33391e, "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/WorkflowLayout$SavedState;", "", "size", "", b.f21518e, "(I)[Lcom/squareup/workflow1/ui/WorkflowLayout$SavedState;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.squareup.workflow1.ui.WorkflowLayout$SavedState$a, reason: from kotlin metadata */
        public static final class Companion implements Parcelable.Creator<SavedState> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new SavedState(source);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }

            public Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@Nullable Parcelable parcelable, @NotNull SparseArray<Parcelable> childState) {
            super(parcelable);
            Intrinsics.checkNotNullParameter(childState, "childState");
            this.childState = childState;
        }

        @NotNull
        public final SparseArray<Parcelable> a() {
            return this.childState;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, flags);
            out.writeSparseArray(this.childState);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@NotNull Parcel source) {
            super(source);
            Intrinsics.checkNotNullParameter(source, "source");
            SparseArray<Parcelable> readSparseArray = source.readSparseArray(SavedState.class.getClassLoader());
            Intrinsics.checkNotNull(readSparseArray);
            Intrinsics.checkNotNullExpressionValue(readSparseArray, "source.readSparseArray(S…class.java.classLoader)!!");
            this.childState = readSparseArray;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkflowLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (getId() == -1) {
            setId(ym.o.f36794d);
        }
        WorkflowViewStub workflowViewStub = new WorkflowViewStub(context, null, 0, 0, 14, null);
        workflowViewStub.setUpdatesVisibility(false);
        addView(workflowViewStub, new ViewGroup.LayoutParams(-1, -1));
        this.showing = workflowViewStub;
    }
}
