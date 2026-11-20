package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import go.OverlayAssets;
import go.m2;
import go.p2;
import hq.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "overlay", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "captureSide", "Lgo/k2;", j6.b.f21518e, "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lgo/k2;", "", "attr", "Landroid/graphics/drawable/GradientDrawable;", ve.a.f33391e, "(Landroid/content/Context;I)Landroid/graphics/drawable/GradientDrawable;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o {
    @NotNull
    public static final GradientDrawable a(@NotNull Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        float dimension = context.getResources().getDimension(tp.c.f32362c);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(tp.c.f32363d);
        int c10 = l2.b.c(context, tp.b.f32360e);
        Integer f10 = z.f(context, i10, null, false, 6, null);
        if (f10 != null) {
            int intValue = f10.intValue();
            int[] Pi2IdFrame = tp.i.f32411a;
            Intrinsics.checkNotNullExpressionValue(Pi2IdFrame, "Pi2IdFrame");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, Pi2IdFrame);
            dimension = obtainStyledAttributes.getDimension(tp.i.b, dimension);
            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(tp.i.f32413d, dimensionPixelSize);
            c10 = obtainStyledAttributes.getColor(tp.i.f32412c, c10);
            obtainStyledAttributes.recycle();
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setStroke(dimensionPixelSize, c10);
        return gradientDrawable;
    }

    @NotNull
    public static final OverlayAssets b(@NotNull Context context, @NotNull Screen.Overlay overlay, @NotNull IdConfig.b captureSide) {
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        Intrinsics.checkNotNullParameter(captureSide, "captureSide");
        Screen.Overlay.Passport passport = Screen.Overlay.Passport.f10766a;
        if (Intrinsics.c(overlay, passport)) {
            i10 = p2.f18742c;
        } else if (Intrinsics.c(overlay, Screen.Overlay.Barcode.f10762a)) {
            i10 = p2.f18741a;
        } else {
            if (!Intrinsics.c(overlay, Screen.Overlay.CornersOnly.f10763a) && !(overlay instanceof Screen.Overlay.Custom) && !Intrinsics.c(overlay, Screen.Overlay.GenericFront.f10765a) && !Intrinsics.c(overlay, Screen.Overlay.Rectangle.f10767a)) {
                throw new gt.l();
            }
            i10 = captureSide == IdConfig.b.f10748e ? p2.f18741a : p2.b;
        }
        if (Intrinsics.c(overlay, passport)) {
            i11 = m2.f18668j;
        } else if (Intrinsics.c(overlay, Screen.Overlay.Barcode.f10762a)) {
            i11 = m2.f18660a;
        } else if (Intrinsics.c(overlay, Screen.Overlay.Rectangle.f10767a)) {
            i11 = m2.b;
        } else if (Intrinsics.c(overlay, Screen.Overlay.CornersOnly.f10763a)) {
            i11 = m2.f18664f;
        } else {
            if (!(overlay instanceof Screen.Overlay.Custom) && !Intrinsics.c(overlay, Screen.Overlay.GenericFront.f10765a)) {
                throw new gt.l();
            }
            i11 = m2.f18665g;
        }
        if (Intrinsics.c(overlay, passport)) {
            i12 = tp.a.f32346j;
        } else if (Intrinsics.c(overlay, Screen.Overlay.Barcode.f10762a)) {
            i12 = tp.a.f32342f;
        } else {
            if (!Intrinsics.c(overlay, Screen.Overlay.CornersOnly.f10763a) && !(overlay instanceof Screen.Overlay.Custom) && !Intrinsics.c(overlay, Screen.Overlay.GenericFront.f10765a) && !Intrinsics.c(overlay, Screen.Overlay.Rectangle.f10767a)) {
                throw new gt.l();
            }
            i12 = tp.a.f32345i;
        }
        Integer f10 = z.f(context, i12, null, false, 6, null);
        if (f10 != null) {
            int intValue = f10.intValue();
            int[] Pi2IdFrameGuideAssets = tp.i.f32414e;
            Intrinsics.checkNotNullExpressionValue(Pi2IdFrameGuideAssets, "Pi2IdFrameGuideAssets");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, Pi2IdFrameGuideAssets);
            i10 = obtainStyledAttributes.getResourceId(tp.i.f32415f, i10);
            i11 = obtainStyledAttributes.getResourceId(tp.i.f32416g, i11);
            obtainStyledAttributes.recycle();
        }
        return new OverlayAssets(i10, i11);
    }
}
