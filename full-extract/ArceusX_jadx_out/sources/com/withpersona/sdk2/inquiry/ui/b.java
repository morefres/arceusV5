package com.withpersona.sdk2.inquiry.ui;

import com.withpersona.sdk2.inquiry.steps.ui.components.AutoSubmitableComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.ui.UiState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "", "componentName", j6.b.f21518e, "(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", rl.d.f30696a, "(Ljava/util/List;)Ljava/util/List;", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Function1<SubmitButtonComponent, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13878a = new a();

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SubmitButtonComponent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @NotNull
    public static final UiState.Displaying b(@NotNull UiState.Displaying displaying, @Nullable final String str) {
        AutoSubmitableComponent autoSubmitableComponent;
        Intrinsics.checkNotNullParameter(displaying, "<this>");
        if (str == null || str.length() == 0) {
            autoSubmitableComponent = (SubmitButtonComponent) cr.h.a(displaying.getComponents(), d0.b(SubmitButtonComponent.class), a.f13878a);
            if (autoSubmitableComponent == null) {
                return displaying;
            }
        } else {
            autoSubmitableComponent = (ButtonComponent) cr.h.a(displaying.getComponents(), d0.b(ButtonComponent.class), new Function1() { // from class: mr.k1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean c10;
                    c10 = com.withpersona.sdk2.inquiry.ui.b.c(str, (ButtonComponent) obj);
                    return Boolean.valueOf(c10);
                }
            });
            if (autoSubmitableComponent == null) {
                return displaying;
            }
        }
        return UiState.Displaying.v(displaying, null, null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(autoSubmitableComponent, 0, null), null, false, false, null, null, null, false, 0, null, 0, 261919, null);
    }

    public static final boolean c(String str, ButtonComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0010 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e A[SYNTHETIC] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent> d(@org.jetbrains.annotations.NotNull java.util.List<? extends com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent> r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L10:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r5.next()
            com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent r1 = (com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent) r1
            boolean r2 = r1 instanceof com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent
            r3 = 0
            if (r2 == 0) goto L23
        L21:
            r1 = r3
            goto L3c
        L23:
            boolean r2 = r1 instanceof com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup
            if (r2 == 0) goto L3c
            com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup r1 = (com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup) r1
            java.util.List r2 = r1.getChildren()
            java.util.List r2 = d(r2)
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L38
            goto L21
        L38:
            com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup r1 = r1.q1(r2)
        L3c:
            if (r1 == 0) goto L10
            r0.add(r1)
            goto L10
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.ui.b.d(java.util.List):java.util.List");
    }
}
