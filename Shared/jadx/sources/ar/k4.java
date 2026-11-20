package ar;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponent;
import java.nio.charset.Charset;
import k6.h;
import k6.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import m6.i;
import o6.SourceFetchResult;
import org.jetbrains.annotations.NotNull;
import x6.ImageRequest;
import x6.Options;
import z6.g;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0007\u001a%\u0010\t\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\u0007\u001a#\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0007\u001a!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u001c\u001a\u00020\r*\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;", "Lar/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "config", "Landroid/view/View;", "n", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;Lar/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)Landroid/view/View;", "q", "o", "v", "Landroid/widget/ImageView;", "imageView", "", "uri", "", "k", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;", "styles", "l", "(Landroid/widget/ImageView;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;)V", "originalSvg", "j", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;)Ljava/lang/String;", "originalHex", "newHex", "fallbackColor", "z", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k4 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3525a;

        static {
            int[] iArr = new int[RemoteImage.ContentType.values().length];
            try {
                iArr[RemoteImage.ContentType.JSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RemoteImage.ContentType.Image.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RemoteImage.ContentType.SVG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3525a = iArr;
        }
    }

    public static final String j(String str, RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle) {
        String str2;
        Integer originalStrokeColorValue;
        String g10;
        Integer originalBackgroundColorValue;
        String g11;
        Integer originalHighlightColorValue;
        String g12;
        Integer originalFillColorValue;
        String g13;
        Integer originalStrokeColorValue2;
        Integer originalBackgroundColorValue2;
        Integer originalHighlightColorValue2;
        Integer originalFillColorValue2;
        if (remoteImageComponentStyle == null || (originalFillColorValue2 = remoteImageComponentStyle.getOriginalFillColorValue()) == null) {
            str2 = str;
        } else {
            int intValue = originalFillColorValue2.intValue();
            Integer newFillColorValue = remoteImageComponentStyle.getNewFillColorValue();
            str2 = (newFillColorValue == null || hq.j.g(newFillColorValue.intValue()) == null) ? str : kotlin.text.x.N(str, hq.j.g(intValue), "{{ fill_color }}", false, 4, null);
        }
        if (remoteImageComponentStyle != null && (originalHighlightColorValue2 = remoteImageComponentStyle.getOriginalHighlightColorValue()) != null) {
            int intValue2 = originalHighlightColorValue2.intValue();
            Integer newHighlightColorValue = remoteImageComponentStyle.getNewHighlightColorValue();
            if (newHighlightColorValue != null && hq.j.g(newHighlightColorValue.intValue()) != null) {
                str2 = kotlin.text.x.N(str2, hq.j.g(intValue2), "{{ highlight_color }}", false, 4, null);
            }
        }
        String str3 = str2;
        if (remoteImageComponentStyle != null && (originalBackgroundColorValue2 = remoteImageComponentStyle.getOriginalBackgroundColorValue()) != null) {
            int intValue3 = originalBackgroundColorValue2.intValue();
            Integer newBackgroundColorValue = remoteImageComponentStyle.getNewBackgroundColorValue();
            if (newBackgroundColorValue != null && hq.j.g(newBackgroundColorValue.intValue()) != null) {
                str3 = kotlin.text.x.N(str3, hq.j.g(intValue3), "{{ background_color }}", false, 4, null);
            }
        }
        String str4 = str3;
        if (remoteImageComponentStyle != null && (originalStrokeColorValue2 = remoteImageComponentStyle.getOriginalStrokeColorValue()) != null) {
            int intValue4 = originalStrokeColorValue2.intValue();
            Integer newStrokeColorValue = remoteImageComponentStyle.getNewStrokeColorValue();
            if (newStrokeColorValue != null && hq.j.g(newStrokeColorValue.intValue()) != null) {
                str4 = kotlin.text.x.N(str4, hq.j.g(intValue4), "{{ stroke_color }}", false, 4, null);
            }
        }
        if (remoteImageComponentStyle != null && (originalFillColorValue = remoteImageComponentStyle.getOriginalFillColorValue()) != null) {
            int intValue5 = originalFillColorValue.intValue();
            Integer newFillColorValue2 = remoteImageComponentStyle.getNewFillColorValue();
            if (newFillColorValue2 != null && (g13 = hq.j.g(newFillColorValue2.intValue())) != null) {
                str4 = z(str4, "{{ fill_color }}", g13, hq.j.g(intValue5));
            }
        }
        if (remoteImageComponentStyle != null && (originalHighlightColorValue = remoteImageComponentStyle.getOriginalHighlightColorValue()) != null) {
            int intValue6 = originalHighlightColorValue.intValue();
            Integer newHighlightColorValue2 = remoteImageComponentStyle.getNewHighlightColorValue();
            if (newHighlightColorValue2 != null && (g12 = hq.j.g(newHighlightColorValue2.intValue())) != null) {
                str4 = z(str4, "{{ highlight_color }}", g12, hq.j.g(intValue6));
            }
        }
        if (remoteImageComponentStyle != null && (originalBackgroundColorValue = remoteImageComponentStyle.getOriginalBackgroundColorValue()) != null) {
            int intValue7 = originalBackgroundColorValue.intValue();
            Integer newBackgroundColorValue2 = remoteImageComponentStyle.getNewBackgroundColorValue();
            if (newBackgroundColorValue2 != null && (g11 = hq.j.g(newBackgroundColorValue2.intValue())) != null) {
                str4 = z(str4, "{{ background_color }}", g11, hq.j.g(intValue7));
            }
        }
        if (remoteImageComponentStyle != null && (originalStrokeColorValue = remoteImageComponentStyle.getOriginalStrokeColorValue()) != null) {
            int intValue8 = originalStrokeColorValue.intValue();
            Integer newStrokeColorValue2 = remoteImageComponentStyle.getNewStrokeColorValue();
            if (newStrokeColorValue2 != null && (g10 = hq.j.g(newStrokeColorValue2.intValue())) != null) {
                return z(str4, "{{ stroke_color }}", g10, hq.j.g(intValue8));
            }
        }
        return str4;
    }

    public static final void k(ImageView imageView, String str) {
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        s.a aVar = new s.a(context);
        h.a aVar2 = new h.a();
        aVar2.g(new g.b(false, false, false, 7, null));
        x6.j.c(x6.i.b(aVar.h(aVar2.p()), true), 500).d().c(x6.j.q(new ImageRequest.a(imageView.getContext()).c(str), imageView).b());
    }

    public static final void l(ImageView imageView, String str, final RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle) {
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        k6.s d10 = x6.j.c(x6.i.b(new s.a(context), true), 500).d();
        ImageRequest.a q10 = x6.j.q(new ImageRequest.a(imageView.getContext()).c(str), imageView);
        q10.d(new i.a() { // from class: ar.i4
            @Override // m6.i.a
            public final m6.i a(SourceFetchResult sourceFetchResult, Options options, k6.s sVar) {
                m6.i m10;
                m10 = k4.m(RemoteImage.RemoteImageComponentStyle.this, sourceFetchResult, options, sVar);
                return m10;
            }
        });
        d10.c(q10.b());
    }

    public static final m6.i m(RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle, SourceFetchResult result, Options options, k6.s sVar) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(sVar, "<unused var>");
        byte[] V1 = result.getSource().source().V1();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = j(new String(V1, charset), remoteImageComponentStyle).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new z6.g(m6.t.c(new wu.e().write(bytes), options.getFileSystem(), null, 4, null), options, false, false, false, 28, null);
    }

    @NotNull
    public static final View n(@NotNull RemoteImageComponent remoteImageComponent, @NotNull y4 uiComponentHelper, @NotNull RemoteImage config) {
        Intrinsics.checkNotNullParameter(remoteImageComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        View q10 = q(remoteImageComponent, uiComponentHelper, config);
        return (q10 == null && (q10 = o(remoteImageComponent, uiComponentHelper, config)) == null) ? v(remoteImageComponent, uiComponentHelper, config) : q10;
    }

    public static final View o(RemoteImageComponent remoteImageComponent, y4 y4Var, final RemoteImage remoteImage) {
        String localAssetName;
        RemoteImage.ContentType localAssetContentType;
        String str;
        final lq.g gVar;
        RemoteImage.Attributes attributes = remoteImage.getAttributes();
        if (attributes == null || (localAssetName = attributes.getLocalAssetName()) == null || (localAssetContentType = attributes.getLocalAssetContentType()) == null) {
            return null;
        }
        Context context = y4Var.getContext();
        int[] iArr = a.f3525a;
        int i10 = iArr[localAssetContentType.ordinal()];
        if (i10 == 1) {
            str = "json";
        } else if (i10 == 2) {
            str = "png";
        } else {
            if (i10 != 3) {
                throw new gt.l();
            }
            str = "svg";
        }
        String str2 = localAssetName + "." + str;
        try {
            context.getAssets().open(str2).close();
            if (iArr[localAssetContentType.ordinal()] == 1) {
                gVar = lq.g.c(y4Var.getLayoutInflater());
                y4Var.d(new Function0() { // from class: ar.e4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit p8;
                        p8 = k4.p(lq.g.this, remoteImage);
                        return p8;
                    }
                });
                gVar.b.setAnimation(str2);
            } else {
                gVar = null;
            }
            if (gVar != null) {
                return gVar.getRoot();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final Unit p(lq.g gVar, RemoteImage remoteImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.k(lottieView, remoteImage);
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22894a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final View q(RemoteImageComponent remoteImageComponent, y4 y4Var, final RemoteImage remoteImage) {
        Integer g10;
        lq.g gVar;
        RemoteImage.Attributes attributes = remoteImage.getAttributes();
        String localAssetName = attributes != null ? attributes.getLocalAssetName() : null;
        RemoteImage.ContentType localAssetContentType = attributes != null ? attributes.getLocalAssetContentType() : null;
        Context context = y4Var.getContext();
        if (localAssetName != null && localAssetContentType != null) {
            final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
            int[] iArr = a.f3525a;
            int i10 = iArr[localAssetContentType.ordinal()];
            if (i10 == 1) {
                g10 = hq.z.g(context, localAssetName, hq.a0.f19548c);
            } else if (i10 == 2) {
                g10 = hq.z.g(context, localAssetName, hq.a0.b);
            } else {
                if (i10 != 3) {
                    throw new gt.l();
                }
                g10 = hq.z.g(context, localAssetName, hq.a0.f19548c);
                if (g10 != null) {
                    yVar.f22979a = true;
                } else {
                    g10 = hq.z.g(context, localAssetName, hq.a0.b);
                }
            }
            if (g10 != null) {
                final int intValue = g10.intValue();
                int i11 = iArr[localAssetContentType.ordinal()];
                if (i11 == 1) {
                    final lq.g c10 = lq.g.c(y4Var.getLayoutInflater());
                    y4Var.d(new Function0() { // from class: ar.f4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit r8;
                            r8 = k4.r(lq.g.this, remoteImage);
                            return r8;
                        }
                    });
                    c10.b.setAnimation(intValue);
                    gVar = c10;
                } else if (i11 == 2) {
                    final lq.h c11 = lq.h.c(y4Var.getLayoutInflater());
                    y4Var.d(new Function0() { // from class: ar.g4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit s8;
                            s8 = k4.s(lq.h.this, remoteImage, intValue);
                            return s8;
                        }
                    });
                    gVar = c11;
                } else {
                    if (i11 != 3) {
                        throw new gt.l();
                    }
                    final lq.h c12 = lq.h.c(y4Var.getLayoutInflater());
                    y4Var.d(new Function0() { // from class: ar.h4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit t8;
                            t8 = k4.t(lq.h.this, remoteImage, yVar, intValue);
                            return t8;
                        }
                    });
                    gVar = c12;
                }
                return gVar.getRoot();
            }
        }
        return null;
    }

    public static final Unit r(lq.g gVar, RemoteImage remoteImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.k(lottieView, remoteImage);
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22894a;
    }

    public static final Unit s(lq.h hVar, RemoteImage remoteImage, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        hr.g.k(imageView, remoteImage);
        hVar.b.setImageResource(i10);
        hVar.b.setScaleType(ImageView.ScaleType.FIT_XY);
        hVar.b.setAdjustViewBounds(true);
        return Unit.f22894a;
    }

    public static final Unit t(lq.h hVar, final RemoteImage remoteImage, kotlin.jvm.internal.y yVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        hr.g.k(imageView, remoteImage);
        if (yVar.f22979a) {
            Context context = hVar.b.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            k6.s d10 = new s.a(context).d();
            ImageView imageView2 = hVar.b;
            Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
            ImageRequest.a q10 = x6.j.q(new ImageRequest.a(imageView2.getContext()).c(Integer.valueOf(i10)), imageView2);
            q10.d(new i.a() { // from class: ar.j4
                @Override // m6.i.a
                public final m6.i a(SourceFetchResult sourceFetchResult, Options options, k6.s sVar) {
                    m6.i u8;
                    u8 = k4.u(RemoteImage.this, sourceFetchResult, options, sVar);
                    return u8;
                }
            });
            d10.c(q10.b());
        } else {
            hVar.b.setImageResource(i10);
        }
        hVar.b.setScaleType(ImageView.ScaleType.FIT_XY);
        hVar.b.setAdjustViewBounds(true);
        return Unit.f22894a;
    }

    public static final m6.i u(RemoteImage remoteImage, SourceFetchResult result, Options options, k6.s sVar) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(sVar, "<unused var>");
        byte[] V1 = result.getSource().source().V1();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = j(new String(V1, charset), remoteImage.getStyles()).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new z6.g(m6.t.c(new wu.e().write(bytes), options.getFileSystem(), null, 4, null), options, false, false, false, 28, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final View v(RemoteImageComponent remoteImageComponent, y4 y4Var, final RemoteImage remoteImage) {
        lq.g gVar;
        final RemoteImage.Attributes attributes = remoteImage.getAttributes();
        RemoteImage.ContentType contentType = attributes != null ? attributes.getContentType() : null;
        int i10 = contentType == null ? -1 : a.f3525a[contentType.ordinal()];
        if (i10 == 1) {
            final lq.g c10 = lq.g.c(y4Var.getLayoutInflater());
            y4Var.d(new Function0() { // from class: ar.c4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit x10;
                    x10 = k4.x(lq.g.this, remoteImage);
                    return x10;
                }
            });
            c10.b.G(attributes.getUrl());
            gVar = c10;
        } else if (i10 != 3) {
            final lq.h c11 = lq.h.c(y4Var.getLayoutInflater());
            y4Var.d(new Function0() { // from class: ar.d4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit y10;
                    y10 = k4.y(lq.h.this, remoteImage, attributes);
                    return y10;
                }
            });
            gVar = c11;
        } else {
            final lq.h c12 = lq.h.c(y4Var.getLayoutInflater());
            y4Var.d(new Function0() { // from class: ar.b4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit w5;
                    w5 = k4.w(lq.h.this, remoteImage, attributes);
                    return w5;
                }
            });
            gVar = c12;
        }
        View root = gVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final Unit w(lq.h hVar, RemoteImage remoteImage, RemoteImage.Attributes attributes) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        hr.g.k(imageView, remoteImage);
        ImageView imageView2 = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
        l(imageView2, attributes.getUrl(), remoteImage.getStyles());
        return Unit.f22894a;
    }

    public static final Unit x(lq.g gVar, RemoteImage remoteImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.k(lottieView, remoteImage);
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22894a;
    }

    public static final Unit y(lq.h hVar, RemoteImage remoteImage, RemoteImage.Attributes attributes) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        hr.g.k(imageView, remoteImage);
        String url = attributes != null ? attributes.getUrl() : null;
        ImageView imageView2 = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
        k(imageView2, url);
        return Unit.f22894a;
    }

    public static final String z(String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        try {
            Color.parseColor(str3);
            str5 = str;
            str6 = str2;
        } catch (IllegalArgumentException unused) {
            str5 = str;
            str6 = str2;
        }
        try {
            return kotlin.text.x.N(str5, str6, str3, false, 4, null);
        } catch (IllegalArgumentException unused2) {
            return kotlin.text.x.N(str5, str6, str4, false, 4, null);
        }
    }
}
