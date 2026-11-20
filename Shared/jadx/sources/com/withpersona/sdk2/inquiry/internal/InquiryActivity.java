package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.a1;
import android.view.b1;
import android.view.z0;
import androidx.fragment.app.FragmentManager;
import com.withpersona.sdk2.inquiry.internal.InquiryActivity;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import e4.f0;
import k4.CreationExtras;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xo.e0;
import xo.x;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;", "Lj/b;", "<init>", "()V", "Landroid/content/Context;", "base", "", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onPause", "onResume", "J1", "", "L1", "()Z", "Lcom/withpersona/sdk2/inquiry/internal/h;", "E", "Lgt/h;", "H1", "()Lcom/withpersona/sdk2/inquiry/internal/h;", "args", "Lxo/x;", "F", "I1", "()Lxo/x;", "viewModel", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InquiryActivity extends j.b {

    /* renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final gt.h args = gt.i.b(new Function0() { // from class: xo.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            com.withpersona.sdk2.inquiry.internal.h G1;
            G1 = InquiryActivity.G1(InquiryActivity.this);
            return G1;
        }
    });

    /* renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final gt.h viewModel = new z0(d0.b(x.class), new b(this), new a(this), new c(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/a1$c;", j6.b.f21518e, "()Landroidx/lifecycle/a1$c;"}, k = 3, mv = {2, 2, 0})
    public static final class a extends kotlin.jvm.internal.m implements Function0<a1.c> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ e.p f11247i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e.p pVar) {
            super(0);
            this.f11247i = pVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return this.f11247i.W();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", j6.b.f21518e, "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class b extends kotlin.jvm.internal.m implements Function0<b1> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ e.p f11248i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e.p pVar) {
            super(0);
            this.f11248i = pVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            return this.f11248i.v();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", j6.b.f21518e, "()Lk4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class c extends kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f11249i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ e.p f11250j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, e.p pVar) {
            super(0);
            this.f11249i = function0;
            this.f11250j = pVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f11249i;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f11250j.Y() : creationExtras;
        }
    }

    public static final h G1(InquiryActivity inquiryActivity) {
        return new h(inquiryActivity.getIntent().getExtras());
    }

    public static final void K1(InquiryActivity inquiryActivity, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intent intent = new Intent();
        intent.putExtras(bundle);
        Unit unit = Unit.f22894a;
        inquiryActivity.setResult(-1, intent);
        inquiryActivity.finish();
    }

    public final h H1() {
        return (h) this.args.getValue();
    }

    public final x I1() {
        return (x) this.viewModel.getValue();
    }

    public final void J1(Bundle savedInstanceState) {
        if (L1()) {
            Intent intent = new Intent();
            intent.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_CANCELED");
            intent.putExtra("INQUIRY_ID_KEY", H1().m());
            String w5 = H1().w();
            intent.putExtra("SESSION_TOKEN_KEY", w5 != null ? h.INSTANCE.a(w5) : null);
            Unit unit = Unit.f22894a;
            setResult(0, intent);
            Integer C = H1().C();
            if (C != null) {
                setTheme(C.intValue());
            }
            zo.e c10 = zo.e.c(LayoutInflater.from(this));
            Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
            setContentView(c10.getRoot());
            if (savedInstanceState == null) {
                FragmentManager l12 = l1();
                Intrinsics.checkNotNullExpressionValue(l12, "getSupportFragmentManager(...)");
                androidx.fragment.app.h r8 = l12.r();
                int i10 = e0.f35814f;
                i iVar = new i();
                iVar.O1(getIntent().getExtras());
                r8.n(i10, iVar);
                r8.g();
            }
            l1().t1(H1().t(), this, new f0() { // from class: xo.m
                @Override // e4.f0
                public final void a(String str, Bundle bundle) {
                    InquiryActivity.K1(InquiryActivity.this, str, bundle);
                }
            });
        }
    }

    public final boolean L1() {
        String w5 = H1().w();
        if (w5 == null || !StringsKt.Z(w5, '\n', false, 2, null)) {
            return true;
        }
        Intent intent = new Intent();
        intent.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
        intent.putExtra("ERROR_DEBUG_MESSAGE_KEY", "Invalid session token.");
        ErrorCode errorCode = ErrorCode.f13734f;
        Intrinsics.d(errorCode, "null cannot be cast to non-null type android.os.Parcelable");
        intent.putExtra("ERROR_CODE_KEY", (Parcelable) errorCode);
        Unit unit = Unit.f22894a;
        setResult(0, intent);
        finish();
        return false;
    }

    @Override // j.b, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        super.attachBaseContext(base);
        wq.b.a(this);
    }

    @Override // e4.q, e.p, k2.g, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        e.x.c(this, null, null, 3, null);
        super.onCreate(savedInstanceState);
        try {
            J1(savedInstanceState);
        } catch (Exception e10) {
            if (!H1().b()) {
                throw e10;
            }
            if (H1().e()) {
                ap.c.c(this).c(e10);
            }
            Intent intent = new Intent();
            intent.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
            intent.putExtra("ERROR_DEBUG_MESSAGE_KEY", "A fatal exception occurred.");
            ErrorCode errorCode = ErrorCode.f13740l;
            Intrinsics.d(errorCode, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("ERROR_CODE_KEY", (Parcelable) errorCode);
            Unit unit = Unit.f22894a;
            setResult(0, intent);
            finish();
        }
    }

    @Override // e4.q, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            ap.c.e(this);
        }
    }

    @Override // e4.q, android.app.Activity
    public void onResume() {
        super.onResume();
        I1().F();
    }
}
