package br;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.HelpBottomSheetComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextViewStyle;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import hr.e0;
import hr.h0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zl.t;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lbr/r;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;", "helpBottomSheetComponentStyle", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;)V", "", "Lbr/s;", "tips", "", "G", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", t.f38095d, "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$f0;", "holder", "position", "r", "(Landroidx/recyclerview/widget/RecyclerView$f0;I)V", "e", "()I", "Lhq/e;", rl.d.f30696a, "Lhq/e;", "adapterHelper", ve.a.f33391e, "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r extends RecyclerView.h<RecyclerView.f0> {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String[] f4428f = {"#02099C", "#030A9C", "#020A9B", "#02089B"};

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String[] f4429g = {"#D3D5FF", "#D4D6FF", "#D3D6FF", "#D2D4FF", "#7379FC"};

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String[] f4430h = {"#7379FD"};

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final hq.e<HelpPagerItem> adapterHelper;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b extends kotlin.jvm.internal.k implements yt.n<LayoutInflater, ViewGroup, Boolean, lq.e> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4432a = new b();

        public b() {
            super(3, lq.e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2NavigationTroubleshootingTipsPageItemBinding;", 0);
        }

        public final lq.e d(LayoutInflater p02, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return lq.e.c(p02, viewGroup, z10);
        }

        @Override // yt.n
        public /* bridge */ /* synthetic */ lq.e invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    public r(@Nullable final HelpBottomSheetComponentStyle helpBottomSheetComponentStyle) {
        hq.e<HelpPagerItem> eVar = new hq.e<>(new Function2() { // from class: br.p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                boolean E;
                E = r.E((HelpPagerItem) obj, (HelpPagerItem) obj2);
                return Boolean.valueOf(E);
            }
        }, null, null, 6, null);
        eVar.j(d0.b(HelpPagerItem.class), d0.b(lq.e.class), b.f4432a, new yt.n() { // from class: br.q
            @Override // yt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit F;
                F = r.F(HelpBottomSheetComponentStyle.this, (HelpPagerItem) obj, (lq.e) obj2, (RecyclerView.f0) obj3);
                return F;
            }
        }, null);
        this.adapterHelper = eVar;
    }

    public static final boolean E(HelpPagerItem old, HelpPagerItem helpPagerItem) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(helpPagerItem, "new");
        return Intrinsics.c(old.getDescription(), helpPagerItem.getDescription()) && Intrinsics.c(old.getLocalAsset(), helpPagerItem.getLocalAsset());
    }

    public static final Unit F(HelpBottomSheetComponentStyle helpBottomSheetComponentStyle, HelpPagerItem item, lq.e viewBinding, RecyclerView.f0 viewHolder) {
        TextViewStyle helpTextviewStyle;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        viewBinding.b.setText(item.getDescription());
        if (helpBottomSheetComponentStyle != null && (helpTextviewStyle = helpBottomSheetComponentStyle.getHelpTextviewStyle()) != null) {
            TextView description = viewBinding.b;
            Intrinsics.checkNotNullExpressionValue(description, "description");
            h0.k(description, helpTextviewStyle, p0.c(e0.f19692c));
        }
        Integer localAsset = item.getLocalAsset();
        if (localAsset != null) {
            int intValue = localAsset.intValue();
            ThemeableLottieAnimationView themeableLottieAnimationView = viewBinding.f23843c;
            themeableLottieAnimationView.setAnimation(intValue);
            if (helpBottomSheetComponentStyle != null) {
                Intrinsics.checkNotNull(themeableLottieAnimationView);
                hr.g.m(themeableLottieAnimationView, helpBottomSheetComponentStyle.getStrokeColorValue(), helpBottomSheetComponentStyle.getFillColorValue(), null, helpBottomSheetComponentStyle.getBackgroundColorValue(), f4428f, f4429g, null, f4430h, 68, null);
            }
            themeableLottieAnimationView.v();
        }
        return Unit.f22894a;
    }

    public final void G(@NotNull List<HelpPagerItem> tips) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        hq.e.t(this.adapterHelper, tips, this, null, 4, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.adapterHelper.m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void r(@NotNull RecyclerView.f0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.adapterHelper.q(holder, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.f0 t(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return this.adapterHelper.r(parent, viewType);
    }
}
