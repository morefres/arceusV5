package pp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.ViewEnvironment;
import ym.k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006 "}, d2 = {"Lpp/h0;", "Lym/b;", "Lpp/i0;", "permission", "", "isPermanentPermissionRejectionCheck", "Lkotlin/Function1;", "", "callback", "<init>", "(Lpp/i0;ZLkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lpp/i0;", j6.b.f21518e, "Z", "c", "Lkotlin/jvm/functions/Function1;", "Lym/a0;", rl.d.f30696a, "Lym/a0;", "()Lym/a0;", "viewFactory", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: pp.h0, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class OldCheckRequestPermissionRationaleStateView implements ym.b<OldCheckRequestPermissionRationaleStateView> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final i0 permission;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean isPermanentPermissionRejectionCheck;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Function1<Boolean, Unit> callback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ym.a0<OldCheckRequestPermissionRationaleStateView> viewFactory;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr5/a;", "BindingT", "", "RenderingT", "binding", "Lym/k;", ve.a.f33391e, "(Lr5/a;)Lym/k;"}, k = 3, mv = {2, 2, 0})
    /* renamed from: pp.h0$a */
    public static final class a extends kotlin.jvm.internal.m implements Function1<qp.a, ym.k<OldCheckRequestPermissionRationaleStateView>> {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lr5/a;", "BindingT", "", "RenderingT", "rendering", "Lym/y;", "viewEnvironment", "", j6.b.f21518e, "(Ljava/lang/Object;Lym/y;)V"}, k = 3, mv = {2, 2, 0})
        /* renamed from: pp.h0$a$a, reason: collision with other inner class name */
        public static final class C0507a<RenderingT> implements ym.k {
            public final /* synthetic */ r5.a b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ OldCheckRequestPermissionRationaleStateView f28904c;

            public C0507a(r5.a aVar, OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView) {
                this.b = aVar;
                this.f28904c = oldCheckRequestPermissionRationaleStateView;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ym.k
            public final void b(@NotNull RenderingT rendering, @NotNull ViewEnvironment viewEnvironment) {
                Intrinsics.checkNotNullParameter(rendering, "rendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView = (OldCheckRequestPermissionRationaleStateView) rendering;
                qp.a aVar = (qp.a) this.b;
                Context context = aVar.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                j.b h10 = hq.g.h(context);
                if (oldCheckRequestPermissionRationaleStateView.callback != null) {
                    aVar.getRoot().post(new c(aVar, this.f28904c, oldCheckRequestPermissionRationaleStateView, h10));
                }
            }
        }

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ym.k<OldCheckRequestPermissionRationaleStateView> invoke(@NotNull qp.a binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            return new C0507a(binding, OldCheckRequestPermissionRationaleStateView.this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: pp.h0$b */
    public static final /* synthetic */ class b extends kotlin.jvm.internal.k implements yt.n<LayoutInflater, ViewGroup, Boolean, qp.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28905a = new b();

        public b() {
            super(3, qp.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2CheckRequestPermissionRationaleStateBinding;", 0);
        }

        public final qp.a d(LayoutInflater p02, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return qp.a.b(p02, viewGroup, z10);
        }

        @Override // yt.n
        public /* bridge */ /* synthetic */ qp.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: pp.h0$c */
    public static final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qp.a f28906a;
        public final /* synthetic */ OldCheckRequestPermissionRationaleStateView b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ OldCheckRequestPermissionRationaleStateView f28907c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j.b f28908d;

        public c(qp.a aVar, OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView, OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView2, j.b bVar) {
            this.f28906a = aVar;
            this.b = oldCheckRequestPermissionRationaleStateView;
            this.f28907c = oldCheckRequestPermissionRationaleStateView2;
            this.f28908d = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f28906a.getRoot().isAttachedToWindow()) {
                if (this.b.permission != i0.b || this.b.isPermanentPermissionRejectionCheck) {
                    this.f28907c.callback.invoke(Boolean.valueOf(k2.b.v(this.f28908d, n1.c(this.f28907c.permission))));
                } else {
                    this.f28907c.callback.invoke(Boolean.TRUE);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OldCheckRequestPermissionRationaleStateView(@NotNull i0 permission, boolean z10, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        this.permission = permission;
        this.isPermanentPermissionRejectionCheck = z10;
        this.callback = function1;
        k.Companion companion = ym.k.INSTANCE;
        this.viewFactory = new ym.x(kotlin.jvm.internal.d0.b(OldCheckRequestPermissionRationaleStateView.class), b.f28905a, new a());
    }

    @Override // ym.b
    @NotNull
    public ym.a0<OldCheckRequestPermissionRationaleStateView> a() {
        return this.viewFactory;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OldCheckRequestPermissionRationaleStateView)) {
            return false;
        }
        OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView = (OldCheckRequestPermissionRationaleStateView) other;
        return this.permission == oldCheckRequestPermissionRationaleStateView.permission && this.isPermanentPermissionRejectionCheck == oldCheckRequestPermissionRationaleStateView.isPermanentPermissionRejectionCheck && Intrinsics.c(this.callback, oldCheckRequestPermissionRationaleStateView.callback);
    }

    public int hashCode() {
        int hashCode = ((this.permission.hashCode() * 31) + Boolean.hashCode(this.isPermanentPermissionRejectionCheck)) * 31;
        Function1<Boolean, Unit> function1 = this.callback;
        return hashCode + (function1 == null ? 0 : function1.hashCode());
    }

    @NotNull
    public String toString() {
        return "OldCheckRequestPermissionRationaleStateView(permission=" + this.permission + ", isPermanentPermissionRejectionCheck=" + this.isPermanentPermissionRejectionCheck + ", callback=" + this.callback + ")";
    }
}
