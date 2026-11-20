package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import ar.o;
import ar.x;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;
import sm.i;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BO\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b!\u0010\"Jb\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u001a\u0010*\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010,\u001a\u0004\b-\u0010&R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010B\u001a\u0004\bC\u0010DR&\u0010K\u001a\b\u0012\u0004\u0012\u00020F0E8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bG\u0010/\u0012\u0004\bI\u0010J\u001a\u0004\bH\u00101¨\u0006L"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "Lar/o;", "Lar/x;", "", "name", "", "children", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "styles", "", "isActive", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;ZJ)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;)V", "newChildren", "q1", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, "(Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;ZJ)Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", j6.b.f21518e, "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", d.f30696a, "getDisabled", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "g", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "f", "Z", "j", "()Z", "k", "(Z)V", "J", "P0", "()J", "", "Lkr/a;", "h", "i", "getAssociatedViews$annotations", "()V", "associatedViews", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ClickableStackComponent implements UiComponent, UiComponentGroup, o, x {

    @NotNull
    public static final Parcelable.Creator<ClickableStackComponent> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<UiComponent> children;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean disabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final ClickableStack.ClickableStackComponentStyle styles;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean isActive;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<kr.a> associatedViews;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClickableStackComponent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClickableStackComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(parcel.readParcelable(ClickableStackComponent.class.getClassLoader()));
            }
            return new ClickableStackComponent(readString, arrayList, (JsonLogicBoolean) parcel.readParcelable(ClickableStackComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(ClickableStackComponent.class.getClassLoader()), (ClickableStack.ClickableStackComponentStyle) parcel.readParcelable(ClickableStackComponent.class.getClassLoader()), parcel.readInt() != 0, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ClickableStackComponent[] newArray(int i10) {
            return new ClickableStackComponent[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClickableStackComponent(@NotNull String name, @NotNull List<? extends UiComponent> children, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @Nullable ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle, boolean z10, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(children, "children");
        this.name = name;
        this.children = children;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.styles = clickableStackComponentStyle;
        this.isActive = z10;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
    }

    public static /* synthetic */ ClickableStackComponent f(ClickableStackComponent clickableStackComponent, String str, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle, boolean z10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = clickableStackComponent.name;
        }
        if ((i10 & 2) != 0) {
            list = clickableStackComponent.children;
        }
        if ((i10 & 4) != 0) {
            jsonLogicBoolean = clickableStackComponent.hidden;
        }
        if ((i10 & 8) != 0) {
            jsonLogicBoolean2 = clickableStackComponent.disabled;
        }
        if ((i10 & 16) != 0) {
            clickableStackComponentStyle = clickableStackComponent.styles;
        }
        if ((i10 & 32) != 0) {
            z10 = clickableStackComponent.isActive;
        }
        if ((i10 & 64) != 0) {
            j10 = clickableStackComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle2 = clickableStackComponentStyle;
        boolean z11 = z10;
        return clickableStackComponent.a(str, list, jsonLogicBoolean, jsonLogicBoolean2, clickableStackComponentStyle2, z11, j11);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    /* renamed from: P0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @NotNull
    public final ClickableStackComponent a(@NotNull String name, @NotNull List<? extends UiComponent> children, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, @Nullable ClickableStack.ClickableStackComponentStyle styles, boolean isActive, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(children, "children");
        return new ClickableStackComponent(name, children, hidden, disabled, styles, isActive, lastValueUpdateTs);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClickableStackComponent)) {
            return false;
        }
        ClickableStackComponent clickableStackComponent = (ClickableStackComponent) other;
        return Intrinsics.c(this.name, clickableStackComponent.name) && Intrinsics.c(this.children, clickableStackComponent.children) && Intrinsics.c(this.hidden, clickableStackComponent.hidden) && Intrinsics.c(this.disabled, clickableStackComponent.disabled) && Intrinsics.c(this.styles, clickableStackComponent.styles) && this.isActive == clickableStackComponent.isActive && this.lastValueUpdateTs == clickableStackComponent.lastValueUpdateTs;
    }

    @Nullable
    /* renamed from: g, reason: from getter */
    public final ClickableStack.ClickableStackComponentStyle getStyles() {
        return this.styles;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup
    @NotNull
    public List<UiComponent> getChildren() {
        return this.children;
    }

    @Override // ar.o
    @Nullable
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // ar.x
    @Nullable
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    @NotNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + this.children.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int hashCode2 = (hashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int hashCode3 = (hashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle = this.styles;
        return ((((hashCode3 + (clickableStackComponentStyle != null ? clickableStackComponentStyle.hashCode() : 0)) * 31) + Boolean.hashCode(this.isActive)) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // ar.x
    @NotNull
    public List<kr.a> i() {
        return this.associatedViews;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public final void k(boolean z10) {
        this.isActive = z10;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup
    @NotNull
    public UiComponentGroup q1(@NotNull List<? extends UiComponent> newChildren) {
        Intrinsics.checkNotNullParameter(newChildren, "newChildren");
        return f(this, null, newChildren, null, null, null, false, 0L, 125, null);
    }

    @NotNull
    public String toString() {
        return "ClickableStackComponent(name=" + this.name + ", children=" + this.children + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", styles=" + this.styles + ", isActive=" + this.isActive + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        List<UiComponent> list = this.children;
        dest.writeInt(list.size());
        Iterator<UiComponent> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeParcelable(this.styles, flags);
        dest.writeInt(this.isActive ? 1 : 0);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ClickableStackComponent(java.lang.String r11, java.util.List r12, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean r13, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean r14, com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack.ClickableStackComponentStyle r15, boolean r16, long r17, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19 & 32
            if (r0 == 0) goto L7
            r0 = 0
            r7 = r0
            goto L9
        L7:
            r7 = r16
        L9:
            r0 = r19 & 64
            if (r0 == 0) goto L17
            r0 = 0
            r8 = r0
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r1 = r10
            goto L1f
        L17:
            r8 = r17
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
        L1f:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponent.<init>(java.lang.String, java.util.List, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack$ClickableStackComponentStyle, boolean, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ClickableStackComponent(@org.jetbrains.annotations.NotNull com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack r13) {
        /*
            r12 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r2 = r13.getName()
            java.util.List r0 = r13.getChildren()
            if (r0 == 0) goto L32
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r0.next()
            com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig r3 = (com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig) r3
            com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent r3 = com.withpersona.sdk2.inquiry.steps.ui.components.b.l(r3)
            if (r3 == 0) goto L1a
            r1.add(r3)
            goto L1a
        L30:
            r3 = r1
            goto L37
        L32:
            java.util.List r1 = kotlin.collections.p.k()
            goto L30
        L37:
            com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack$Attributes r0 = r13.getAttributes()
            r1 = 0
            if (r0 == 0) goto L44
            com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean r0 = r0.getHidden()
            r4 = r0
            goto L45
        L44:
            r4 = r1
        L45:
            com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack$Attributes r0 = r13.getAttributes()
            if (r0 == 0) goto L4f
            com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean r1 = r0.getDisabled()
        L4f:
            r5 = r1
            com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack$ClickableStackComponentStyle r6 = r13.getStyles()
            r10 = 96
            r11 = 0
            r7 = 0
            r8 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponent.<init>(com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack):void");
    }
}
