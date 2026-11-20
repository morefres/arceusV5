package com.withpersona.sdk2.inquiry.shared.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import hq.j;
import hq.r;
import hq.s;
import hq.w;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.text.StringsKt;
import lq.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\b2\b\b\u0001\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010!\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0011\u00102\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00106\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Landroid/graphics/Rect;", "padding", "setPreferredPadding", "(Landroid/graphics/Rect;)V", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "state", "Lkotlin/Function0;", "back", "cancel", "launchHelp", "G", "(Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", Title.type, "setTitle", "(Ljava/lang/String;)V", "", "controlsColor", "setControlsColor", "(I)V", "defStyleAttr", "defStyleRes", "s", "(Landroid/util/AttributeSet;II)V", "Llq/c;", "z", "Llq/c;", "binding", "A", "I", "defaultPadding", "B", "minPadding", "C", "Landroid/graphics/Rect;", "preferredPadding", "Landroid/view/View;", "getBackButton", "()Landroid/view/View;", "backButton", "Landroid/widget/TextView;", "getNavBarTitleView", "()Landroid/widget/TextView;", "navBarTitleView", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Pi2NavigationBar extends ConstraintLayout {

    /* renamed from: A, reason: from kotlin metadata */
    public final int defaultPadding;

    /* renamed from: B, reason: from kotlin metadata */
    public final int minPadding;

    /* renamed from: C, reason: from kotlin metadata */
    @NotNull
    public Rect preferredPadding;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2NavigationBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        c b = c.b(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(...)");
        this.binding = b;
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(r.b);
        this.defaultPadding = dimensionPixelOffset;
        this.minPadding = (int) j.a(12.0d);
        this.preferredPadding = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        s(attributeSet, 0, 0);
    }

    public static final void H(Function0 function0, View view) {
        function0.invoke();
    }

    public static final void I(Function0 function0, View view) {
        function0.invoke();
    }

    public static final void J(Function0 function0, View view) {
        function0.invoke();
    }

    public final void G(@NotNull NavigationState state, @NotNull final Function0<Unit> back, @NotNull final Function0<Unit> cancel, @NotNull final Function0<Unit> launchHelp) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(back, "back");
        Intrinsics.checkNotNullParameter(cancel, "cancel");
        Intrinsics.checkNotNullParameter(launchHelp, "launchHelp");
        if (!state.getShowNavBar()) {
            this.binding.b.setVisibility(8);
            this.binding.f23828c.setVisibility(8);
            this.binding.f23829d.setVisibility(8);
            return;
        }
        this.binding.b.setVisibility(state.getShowBackButton() ? 0 : 4);
        this.binding.b.setOnClickListener(new View.OnClickListener() { // from class: uq.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Pi2NavigationBar.H(Function0.this, view);
            }
        });
        this.binding.f23828c.setVisibility(state.getShowCancelButton() ? 0 : 4);
        this.binding.f23828c.setOnClickListener(new View.OnClickListener() { // from class: uq.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Pi2NavigationBar.I(Function0.this, view);
            }
        });
        this.binding.f23829d.setVisibility(state.getShowHelpButton() ? 0 : 4);
        this.binding.f23829d.setOnClickListener(new View.OnClickListener() { // from class: uq.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Pi2NavigationBar.J(Function0.this, view);
            }
        });
        this.binding.b.setEnabled(state.getIsNavigationEnabled());
        this.binding.f23828c.setEnabled(state.getIsNavigationEnabled());
        this.binding.f23829d.setEnabled(state.getIsNavigationEnabled());
    }

    @NotNull
    public final View getBackButton() {
        ImageView navBarBackButton = this.binding.b;
        Intrinsics.checkNotNullExpressionValue(navBarBackButton, "navBarBackButton");
        return navBarBackButton;
    }

    @NotNull
    public final TextView getNavBarTitleView() {
        TextView navBarTitle = this.binding.f23830e;
        Intrinsics.checkNotNullExpressionValue(navBarTitle, "navBarTitle");
        return navBarTitle;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(r.f19590a);
        setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
    }

    public final void s(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, w.f19673f, defStyleAttr, defStyleRes);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == w.f19674g) {
                    this.binding.b.setImageResource(obtainStyledAttributes.getResourceId(index, s.f19609t));
                } else if (index == w.f19675h) {
                    this.binding.f23828c.setImageResource(obtainStyledAttributes.getResourceId(index, s.f19610u));
                } else if (index == w.f19676i) {
                    this.binding.f23829d.setImageResource(obtainStyledAttributes.getResourceId(index, s.f19611v));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void setControlsColor(int controlsColor) {
        this.binding.b.setColorFilter(controlsColor);
        this.binding.f23828c.setColorFilter(controlsColor);
        this.binding.f23829d.setColorFilter(controlsColor);
        this.binding.f23830e.setTextColor(controlsColor);
    }

    public final void setPreferredPadding(@NotNull Rect padding) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        if (Intrinsics.c(padding, this.preferredPadding)) {
            return;
        }
        this.preferredPadding = padding;
        int i10 = padding.left;
        int i11 = this.minPadding;
        int i12 = i10 - i11;
        int i13 = padding.top - i11;
        int i14 = padding.right - i11;
        int i15 = padding.bottom - i11;
        if (i12 < 0) {
            i12 = d.c(this.defaultPadding - i11, 0);
        }
        if (i13 < 0) {
            i13 = d.c(this.defaultPadding - this.minPadding, 0);
        }
        if (i14 < 0) {
            i14 = d.c(this.defaultPadding - this.minPadding, 0);
        }
        if (i15 < 0) {
            i15 = d.c(this.defaultPadding - this.minPadding, 0);
        }
        setPadding(i12, i13, i14, i15);
    }

    public final void setTitle(@Nullable String title) {
        if (title == null || StringsKt.p0(title)) {
            this.binding.f23830e.setVisibility(8);
        } else {
            this.binding.f23830e.setText(title);
            this.binding.f23830e.setVisibility(0);
        }
    }
}
