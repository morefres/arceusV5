package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0001\u001eBY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B)\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJj\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010\u0017J\u001a\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b(\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u0010\t\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00100\u001a\u0004\b4\u00102\"\u0004\b5\u00106R\"\u0010\n\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00100\u001a\u0004\b8\u00102\"\u0004\b9\u00106R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\b:\u00102R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010?\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;", "ctaCard", "url", "", "autoCompleteOnDismiss", "shown", "showing", "hideWhenTappedOutside", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "screen", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;Ljava/lang/String;ZZZZLcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;Ljava/lang/String;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;Ljava/lang/String;ZZZZLcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;", "i", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;", "c", "getUrl", d.f30696a, "Z", "g", "()Z", "e", "W2", "e1", "(Z)V", "f", "D1", "o2", "j1", "h", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "Y0", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "J", "P0", "()J", "j", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreatePersonaSheetComponent implements SheetComponent {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final CreatePersonaSheet.CardCtaPage ctaCard;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String url;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean autoCompleteOnDismiss;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean shown;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean showing;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean hideWhenTappedOutside;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final UiComponentScreen screen;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<CreatePersonaSheetComponent> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;", "config", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final CreatePersonaSheetComponent a(@NotNull CreatePersonaSheet config) {
            CreatePersonaSheet.Pages pages;
            CreatePersonaSheet.CardCtaPage ctaCard;
            CreatePersonaSheet.Attributes attributes;
            String url;
            Boolean autoCompleteOnDismiss;
            Intrinsics.checkNotNullParameter(config, "config");
            CreatePersonaSheet.Attributes attributes2 = config.getAttributes();
            if (attributes2 == null || (pages = attributes2.getPages()) == null || (ctaCard = pages.getCtaCard()) == null || (attributes = config.getAttributes()) == null || (url = attributes.getUrl()) == null) {
                return null;
            }
            CreatePersonaSheet.Attributes attributes3 = config.getAttributes();
            return new CreatePersonaSheetComponent(config, ctaCard, url, (attributes3 == null || (autoCompleteOnDismiss = attributes3.getAutoCompleteOnDismiss()) == null) ? false : autoCompleteOnDismiss.booleanValue());
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CreatePersonaSheetComponent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CreatePersonaSheetComponent createFromParcel(Parcel parcel) {
            boolean z10;
            boolean z11;
            boolean z12;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            CreatePersonaSheet.CardCtaPage cardCtaPage = (CreatePersonaSheet.CardCtaPage) parcel.readParcelable(CreatePersonaSheetComponent.class.getClassLoader());
            String readString2 = parcel.readString();
            boolean z13 = false;
            boolean z14 = true;
            if (parcel.readInt() != 0) {
                z10 = false;
                z13 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = true;
                z14 = z10;
            }
            if (parcel.readInt() != 0) {
                z12 = z11;
            } else {
                z12 = z11;
                z11 = z10;
            }
            if (parcel.readInt() == 0) {
                z12 = z10;
            }
            return new CreatePersonaSheetComponent(readString, cardCtaPage, readString2, z13, z14, z11, z12, UiComponentScreen.CREATOR.createFromParcel(parcel), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreatePersonaSheetComponent[] newArray(int i10) {
            return new CreatePersonaSheetComponent[i10];
        }
    }

    public CreatePersonaSheetComponent(@NotNull String name, @NotNull CreatePersonaSheet.CardCtaPage ctaCard, @NotNull String url, boolean z10, boolean z11, boolean z12, boolean z13, @NotNull UiComponentScreen screen, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ctaCard, "ctaCard");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.name = name;
        this.ctaCard = ctaCard;
        this.url = url;
        this.autoCompleteOnDismiss = z10;
        this.shown = z11;
        this.showing = z12;
        this.hideWhenTappedOutside = z13;
        this.screen = screen;
        this.lastValueUpdateTs = j10;
    }

    public static /* synthetic */ CreatePersonaSheetComponent f(CreatePersonaSheetComponent createPersonaSheetComponent, String str, CreatePersonaSheet.CardCtaPage cardCtaPage, String str2, boolean z10, boolean z11, boolean z12, boolean z13, UiComponentScreen uiComponentScreen, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = createPersonaSheetComponent.name;
        }
        if ((i10 & 2) != 0) {
            cardCtaPage = createPersonaSheetComponent.ctaCard;
        }
        if ((i10 & 4) != 0) {
            str2 = createPersonaSheetComponent.url;
        }
        if ((i10 & 8) != 0) {
            z10 = createPersonaSheetComponent.autoCompleteOnDismiss;
        }
        if ((i10 & 16) != 0) {
            z11 = createPersonaSheetComponent.shown;
        }
        if ((i10 & 32) != 0) {
            z12 = createPersonaSheetComponent.showing;
        }
        if ((i10 & 64) != 0) {
            z13 = createPersonaSheetComponent.hideWhenTappedOutside;
        }
        if ((i10 & 128) != 0) {
            uiComponentScreen = createPersonaSheetComponent.screen;
        }
        if ((i10 & 256) != 0) {
            j10 = createPersonaSheetComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        boolean z14 = z13;
        UiComponentScreen uiComponentScreen2 = uiComponentScreen;
        boolean z15 = z11;
        boolean z16 = z12;
        return createPersonaSheetComponent.a(str, cardCtaPage, str2, z10, z15, z16, z14, uiComponentScreen2, j11);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.SheetComponent
    /* renamed from: D1, reason: from getter */
    public boolean getShowing() {
        return this.showing;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    /* renamed from: P0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.SheetComponent
    /* renamed from: W2, reason: from getter */
    public boolean getShown() {
        return this.shown;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.SheetComponent
    @NotNull
    /* renamed from: Y0, reason: from getter */
    public UiComponentScreen getScreen() {
        return this.screen;
    }

    @NotNull
    public final CreatePersonaSheetComponent a(@NotNull String name, @NotNull CreatePersonaSheet.CardCtaPage ctaCard, @NotNull String url, boolean autoCompleteOnDismiss, boolean shown, boolean showing, boolean hideWhenTappedOutside, @NotNull UiComponentScreen screen, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ctaCard, "ctaCard");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new CreatePersonaSheetComponent(name, ctaCard, url, autoCompleteOnDismiss, shown, showing, hideWhenTappedOutside, screen, lastValueUpdateTs);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.SheetComponent
    public void e1(boolean z10) {
        this.shown = z10;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatePersonaSheetComponent)) {
            return false;
        }
        CreatePersonaSheetComponent createPersonaSheetComponent = (CreatePersonaSheetComponent) other;
        return Intrinsics.c(this.name, createPersonaSheetComponent.name) && Intrinsics.c(this.ctaCard, createPersonaSheetComponent.ctaCard) && Intrinsics.c(this.url, createPersonaSheetComponent.url) && this.autoCompleteOnDismiss == createPersonaSheetComponent.autoCompleteOnDismiss && this.shown == createPersonaSheetComponent.shown && this.showing == createPersonaSheetComponent.showing && this.hideWhenTappedOutside == createPersonaSheetComponent.hideWhenTappedOutside && Intrinsics.c(this.screen, createPersonaSheetComponent.screen) && this.lastValueUpdateTs == createPersonaSheetComponent.lastValueUpdateTs;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getAutoCompleteOnDismiss() {
        return this.autoCompleteOnDismiss;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((((((((((this.name.hashCode() * 31) + this.ctaCard.hashCode()) * 31) + this.url.hashCode()) * 31) + Boolean.hashCode(this.autoCompleteOnDismiss)) * 31) + Boolean.hashCode(this.shown)) * 31) + Boolean.hashCode(this.showing)) * 31) + Boolean.hashCode(this.hideWhenTappedOutside)) * 31) + this.screen.hashCode()) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @NotNull
    /* renamed from: i, reason: from getter */
    public final CreatePersonaSheet.CardCtaPage getCtaCard() {
        return this.ctaCard;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.SheetComponent
    /* renamed from: j1, reason: from getter */
    public boolean getHideWhenTappedOutside() {
        return this.hideWhenTappedOutside;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.SheetComponent
    public void o2(boolean z10) {
        this.showing = z10;
    }

    @NotNull
    public String toString() {
        return "CreatePersonaSheetComponent(name=" + this.name + ", ctaCard=" + this.ctaCard + ", url=" + this.url + ", autoCompleteOnDismiss=" + this.autoCompleteOnDismiss + ", shown=" + this.shown + ", showing=" + this.showing + ", hideWhenTappedOutside=" + this.hideWhenTappedOutside + ", screen=" + this.screen + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.ctaCard, flags);
        dest.writeString(this.url);
        dest.writeInt(this.autoCompleteOnDismiss ? 1 : 0);
        dest.writeInt(this.shown ? 1 : 0);
        dest.writeInt(this.showing ? 1 : 0);
        dest.writeInt(this.hideWhenTappedOutside ? 1 : 0);
        this.screen.writeToParcel(dest, flags);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CreatePersonaSheetComponent(java.lang.String r3, com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet.CardCtaPage r4, java.lang.String r5, boolean r6, boolean r7, boolean r8, boolean r9, com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen r10, long r11, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r2 = this;
            r14 = r13 & 16
            r0 = 0
            if (r14 == 0) goto L6
            r7 = r0
        L6:
            r14 = r13 & 32
            if (r14 == 0) goto Lb
            r8 = r0
        Lb:
            r14 = r13 & 64
            if (r14 == 0) goto L10
            r9 = r0
        L10:
            r14 = r13 & 128(0x80, float:1.8E-43)
            if (r14 == 0) goto L4b
            com.withpersona.sdk2.inquiry.steps.ui.components.CtaCardPage r10 = new com.withpersona.sdk2.inquiry.steps.ui.components.CtaCardPage
            com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui r14 = r4.getUiStep()
            com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Config r14 = r14.getConfig()
            java.util.List r14 = r14.getComponents()
            if (r14 == 0) goto L29
            java.util.List r14 = com.withpersona.sdk2.inquiry.steps.ui.components.b.i(r14)
            goto L2a
        L29:
            r14 = 0
        L2a:
            com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui r0 = r4.getUiStep()
            com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Config r0 = r0.getConfig()
            java.util.List r0 = r0.getComponents()
            if (r0 != 0) goto L3c
            java.util.List r0 = kotlin.collections.p.k()
        L3c:
            com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui r1 = r4.getUiStep()
            com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$UiStepStyle r1 = r1.getStyles()
            r10.<init>(r14, r0, r1)
            com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen r10 = yq.b.a(r10)
        L4b:
            r13 = r13 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L51
            r11 = 0
        L51:
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent.<init>(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet$CardCtaPage, java.lang.String, boolean, boolean, boolean, boolean, com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePersonaSheetComponent(@NotNull CreatePersonaSheet config, @NotNull CreatePersonaSheet.CardCtaPage ctaCard, @NotNull String url, boolean z10) {
        this(config.getName(), ctaCard, url, z10, false, false, false, null, 0L, 496, null);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(ctaCard, "ctaCard");
        Intrinsics.checkNotNullParameter(url, "url");
    }
}
