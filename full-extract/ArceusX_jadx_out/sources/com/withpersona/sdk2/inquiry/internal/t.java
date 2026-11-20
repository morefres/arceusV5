package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import com.withpersona.sdk2.inquiry.FieldMapping;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<ep.w> f12136a;
    public final dt.i<co.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<UiStepSavedStateHelper> f12137c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<eo.e> f12138d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<Context> f12139e;

    public t(dt.i<ep.w> iVar, dt.i<co.a> iVar2, dt.i<UiStepSavedStateHelper> iVar3, dt.i<eo.e> iVar4, dt.i<Context> iVar5) {
        this.f12136a = iVar;
        this.b = iVar2;
        this.f12137c = iVar3;
        this.f12138d = iVar4;
        this.f12139e = iVar5;
    }

    public static t a(dt.i<ep.w> iVar, dt.i<co.a> iVar2, dt.i<UiStepSavedStateHelper> iVar3, dt.i<eo.e> iVar4, dt.i<Context> iVar5) {
        return new t(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static TransitionWorker c(String str, @Nullable String str2, String str3, @Nullable String str4, List<FieldMapping> list, InquirySessionConfig inquirySessionConfig, TransitionWorker.TransitionData transitionData, ep.w wVar, co.a aVar, UiStepSavedStateHelper uiStepSavedStateHelper, eo.e eVar, Context context) {
        return new TransitionWorker(str, str2, str3, str4, list, inquirySessionConfig, transitionData, wVar, aVar, uiStepSavedStateHelper, eVar, context);
    }

    public TransitionWorker b(String str, @Nullable String str2, String str3, @Nullable String str4, List<FieldMapping> list, InquirySessionConfig inquirySessionConfig, TransitionWorker.TransitionData transitionData) {
        return c(str, str2, str3, str4, list, inquirySessionConfig, transitionData, this.f12136a.get(), this.b.get(), this.f12137c.get(), this.f12138d.get(), this.f12139e.get());
    }
}
