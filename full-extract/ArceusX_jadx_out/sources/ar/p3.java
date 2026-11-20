package ar;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001aQ\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;", "Lar/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;", "config", "Landroid/view/View;", "K", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;Lar/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;)Landroid/view/View;", "", "lottieRes", "drawableRes", "", "", "originalStrokeColors", "originalFillColors", "Lr5/a;", "H", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;Lar/y4;II[Ljava/lang/String;[Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;)Lr5/a;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p3 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3553a;

        static {
            int[] iArr = new int[LocalImage.Image.values().length];
            try {
                iArr[LocalImage.Image.START_HERO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalImage.Image.DOCUMENT_START_HERO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalImage.Image.ANIMATED_CHECK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocalImage.Image.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LocalImage.Image.ID_FRONT_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LocalImage.Image.ID_BACK_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LocalImage.Image.FAILURE_DEFAULT_ICON.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LocalImage.Image.SELFIE_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LocalImage.Image.DOCUMENT_FAILED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_START_HERO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_SCAN_HERO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_SCAN_READY_HERO.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_CHECK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_BACK_CLOSED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_FRONT_CLOSED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_FRONT_OPENED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_BACK_OPENED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_PHOTO_PAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_ID_CARD.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_BACK_THEN_FRONT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[LocalImage.Image.CREATE_PERSONA_CTA_CARD_ICON.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[LocalImage.Image.OPTION_CHECK_ICON.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[LocalImage.Image.OPTION_CHEVRON_ICON.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[LocalImage.Image.OPTION_FLAG_ICON.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[LocalImage.Image.OPTION_GLOBE_ICON.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[LocalImage.Image.OPTION_HOME_ICON.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[LocalImage.Image.OPTION_ID_DOCUMENT_ICON.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[LocalImage.Image.OPTION_ID_ICON.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[LocalImage.Image.OPTION_PHONE_ICON.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[LocalImage.Image.OPTION_USER_ICON.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[LocalImage.Image.REUSABLE_PERSONA_LOGO.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            f3553a = iArr;
        }
    }

    @NotNull
    public static final r5.a H(@NotNull LocalImageComponent localImageComponent, @NotNull y4 uiComponentHelper, int i10, int i11, @NotNull final String[] originalStrokeColors, @NotNull final String[] originalFillColors, @NotNull final LocalImage config) {
        Intrinsics.checkNotNullParameter(localImageComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(originalStrokeColors, "originalStrokeColors");
        Intrinsics.checkNotNullParameter(originalFillColors, "originalFillColors");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config.getStyles() != null) {
            final lq.g c10 = lq.g.c(uiComponentHelper.getLayoutInflater());
            c10.b.setAnimation(i10);
            uiComponentHelper.d(new Function0() { // from class: ar.g3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit I;
                    I = p3.I(lq.g.this, config, originalStrokeColors, originalFillColors);
                    return I;
                }
            });
            Intrinsics.checkNotNull(c10);
            return c10;
        }
        final int dimension = (int) uiComponentHelper.getContext().getResources().getDimension(tp.c.f32365f);
        final lq.h c11 = lq.h.c(uiComponentHelper.getLayoutInflater());
        c11.b.setImageResource(i11);
        uiComponentHelper.d(new Function0() { // from class: ar.h3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit J;
                J = p3.J(lq.h.this, dimension);
                return J;
            }
        });
        Intrinsics.checkNotNull(c11);
        return c11;
    }

    public static final Unit I(lq.g gVar, LocalImage localImage, String[] strArr, String[] strArr2) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), strArr, strArr2, null, new String[0], 8, null);
        return Unit.f22894a;
    }

    public static final Unit J(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22894a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x061e A[RETURN] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.view.View K(@org.jetbrains.annotations.NotNull com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponent r23, @org.jetbrains.annotations.NotNull ar.y4 r24, @org.jetbrains.annotations.NotNull final com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage r25) {
        /*
            Method dump skipped, instructions count: 1638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.p3.K(com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponent, ar.y4, com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage):android.view.View");
    }

    public static final Unit L(lq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), new String[]{"#02214F"}, new String[]{"#AA84FF", "#F2EAFF"}, null, new String[]{"#FFFFFF"}, 8, null);
        return Unit.f22894a;
    }

    public static final Unit M(lq.g gVar) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).V = 0.5f;
        }
        lottieView.setLayoutParams(layoutParams);
        return Unit.f22894a;
    }

    public static final void N(lq.g gVar, f7.i iVar) {
        gVar.b.v();
    }

    public static final Unit O(lq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), new String[]{"#02214F"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f22894a;
    }

    public static final Unit P(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22894a;
    }

    public static final Unit Q(lq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f22894a;
    }

    public static final Unit R(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22894a;
    }

    public static final Unit S(lq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f22894a;
    }

    public static final Unit T(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22894a;
    }

    public static final Unit U(lq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), new String[]{"#180052"}, new String[0], null, new String[]{"#FFFFFF"}, 8, null);
        return Unit.f22894a;
    }

    public static final Unit V(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22894a;
    }

    public static final Unit W(lq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f22894a;
    }

    public static final Unit X(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22894a;
    }

    public static final Unit Y(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22894a;
    }

    public static final Unit Z(lq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), new String[]{"#4C4293"}, new String[]{"#B5B5CC"}, null, new String[0], 8, null);
        return Unit.f22894a;
    }

    public static final Unit a0(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22894a;
    }

    public static final Unit b0(lq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051", "#02214F"}, new String[]{"#AA84FF"}, null, new String[]{"#AA84FF"}, 8, null);
        return Unit.f22894a;
    }

    public static final Unit c0(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22894a;
    }

    public static final Unit d0(lq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22894a;
    }

    public static final Unit e0(lq.g gVar) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).V = 0.5f;
        }
        lottieView.setLayoutParams(layoutParams);
        return Unit.f22894a;
    }

    public static final Unit f0(lq.g gVar) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).V = 0.5f;
        }
        lottieView.setLayoutParams(layoutParams);
        return Unit.f22894a;
    }

    public static final Unit g0(lq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22894a;
    }

    public static final Unit h0(lq.g gVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        hr.g.e(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF", "#F2EAFF"}, null, new String[]{"#FFFFFF"}, 8, null);
        return Unit.f22894a;
    }

    public static final Unit i0(lq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22894a;
    }

    public static final Unit j0(lq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22894a;
    }

    public static final Unit k0(lq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22894a;
    }

    public static final Unit l0(lq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22894a;
    }

    public static final Unit m0(lq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22894a;
    }

    public static final Unit n0(lq.g gVar) {
        gVar.b.setRepeatMode(1);
        gVar.b.setRepeatCount(-1);
        gVar.b.v();
        return Unit.f22894a;
    }

    public static final Unit o0(lq.g gVar) {
        ThemeableLottieAnimationView lottieView = gVar.b;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = (int) hq.j.a(44.0d);
        lottieView.setLayoutParams(layoutParams);
        return Unit.f22894a;
    }

    public static final Unit p0(lq.h hVar, int i10) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        return Unit.f22894a;
    }
}
