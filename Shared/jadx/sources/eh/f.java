package eh;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.a;
import com.appsflyer.sdk_base.referrer.Payload;
import eh.i;
import gt.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rg.q0;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Leh/f;", "Leh/i;", "Landroid/app/Activity;", "activity", "Lkotlin/Function0;", "", "message", "Lkotlin/Function1;", "Leh/i$a;", "", "shouldShowDialog", "", "startUpgrade", "<init>", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", Payload.TYPE, ve.a.f33391e, "(Leh/i$a;)V", "Landroid/app/Activity;", j6.b.f21518e, "Lkotlin/jvm/functions/Function0;", "c", "Lkotlin/jvm/functions/Function1;", rl.d.f30696a, "Landroidx/appcompat/app/a;", "e", "Landroidx/appcompat/app/a;", "dialog", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Activity activity;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<String> message;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<i.a, Boolean> shouldShowDialog;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> startUpgrade;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public androidx.appcompat.app.a dialog;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16027a;

        static {
            int[] iArr = new int[i.a.values().length];
            try {
                iArr[i.a.f16030a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.a.f16031c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16027a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            f.this.startUpgrade.invoke();
            androidx.appcompat.app.a aVar = f.this.dialog;
            if (aVar != null) {
                aVar.dismiss();
            }
            f.this.dialog = null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            f.this.startUpgrade.invoke();
            f.this.a(i.a.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull Activity activity, @NotNull Function0<String> message, @NotNull Function1<? super i.a, Boolean> shouldShowDialog, @NotNull Function0<Unit> startUpgrade) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(shouldShowDialog, "shouldShowDialog");
        Intrinsics.checkNotNullParameter(startUpgrade, "startUpgrade");
        this.activity = activity;
        this.message = message;
        this.shouldShowDialog = shouldShowDialog;
        this.startUpgrade = startUpgrade;
    }

    public static final boolean d(i.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    public static final void h(f fVar, i.a aVar) {
        androidx.appcompat.app.a aVar2;
        androidx.appcompat.app.a aVar3 = fVar.dialog;
        if (aVar3 != null) {
            h.d(aVar3);
        }
        if (fVar.shouldShowDialog.invoke(aVar).booleanValue()) {
            int i10 = a.f16027a[aVar.ordinal()];
            if (i10 == 1) {
                Activity activity = fVar.activity;
                aVar2 = new a.C0009a(activity).p(q0.f30479m).h(fVar.message.invoke()).m(q0.f30470j, fVar.new b()).d(false).r();
                Intrinsics.checkNotNullExpressionValue(aVar2, "show(...)");
            } else if (i10 == 2) {
                Activity activity2 = fVar.activity;
                aVar2 = new a.C0009a(activity2).p(q0.f30479m).h(fVar.message.invoke()).m(q0.f30470j, fVar.new c()).d(false).r();
                Intrinsics.checkNotNullExpressionValue(aVar2, "show(...)");
            } else {
                if (i10 != 3) {
                    throw new l();
                }
                aVar2 = h.e(fVar.activity);
            }
        } else {
            fVar.startUpgrade.invoke();
            Unit unit = Unit.f22894a;
            aVar2 = null;
        }
        fVar.dialog = aVar2;
    }

    @Override // eh.i
    public void a(@NotNull final i.a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.activity.runOnUiThread(new Runnable() { // from class: eh.e
            @Override // java.lang.Runnable
            public final void run() {
                f.h(f.this, type);
            }
        });
    }

    public /* synthetic */ f(Activity activity, Function0 function0, Function1 function1, Function0 function02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, function0, (i10 & 4) != 0 ? new Function1() { // from class: eh.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean d10;
                d10 = f.d((i.a) obj);
                return Boolean.valueOf(d10);
            }
        } : function1, function02);
    }
}
