package g;

import h.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001c8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u000e\u0010\u001f\"\u0004\b \u0010!R*\u0010%\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR*\u0010+\u001a\u00020&2\u0006\u0010\u0005\u001a\u00020&8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010'\u001a\u0004\b\u0006\u0010(\"\u0004\b)\u0010*R.\u0010-\u001a\u0004\u0018\u00010,2\b\u0010\u0005\u001a\u0004\u0018\u00010,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b\u001d\u0010/\"\u0004\b0\u00101¨\u00062"}, d2 = {"Lg/h;", "", "<init>", "()V", "Lh/f$h;", "value", ve.a.f33391e, "Lh/f$h;", "e", "()Lh/f$h;", "m", "(Lh/f$h;)V", "mediaType", "", j6.b.f21518e, "I", "c", "()I", "k", "(I)V", "maxItems", "", "Z", "g", "()Z", "n", "(Z)V", "isOrderedSelection", "Lh/f$b;", rl.d.f30696a, "Lh/f$b;", "()Lh/f$b;", "j", "(Lh/f$b;)V", "defaultTab", "f", "i", "isCustomAccentColorApplied", "", "J", "()J", "h", "(J)V", "accentColor", "Lh/f$e;", "mediaCapabilitiesForTranscoding", "Lh/f$e;", "()Lh/f$e;", "l", "(Lh/f$e;)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isOrderedSelection;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isCustomAccentColorApplied;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public long accentColor;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public f.h mediaType = f.c.f18922a;

    /* renamed from: b, reason: from kotlin metadata */
    public int maxItems = h.e.INSTANCE.a();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public f.b defaultTab = f.b.a.f18921a;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lg/h$a;", "", "<init>", "()V", "Lh/f$h;", "mediaType", rl.d.f30696a, "(Lh/f$h;)Lg/h$a;", "", "maxItems", "c", "(I)Lg/h$a;", "", "isOrderedSelection", "e", "(Z)Lg/h$a;", "Lh/f$b;", "defaultTab", j6.b.f21518e, "(Lh/f$b;)Lg/h$a;", "Lg/h;", ve.a.f33391e, "()Lg/h;", "Lh/f$h;", "I", "Z", "Lh/f$b;", "isCustomAccentColorApplied", "", "f", "J", "accentColor", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public boolean isOrderedSelection;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public boolean isCustomAccentColorApplied;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public long accentColor;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public f.h mediaType = f.c.f18922a;

        /* renamed from: b, reason: from kotlin metadata */
        public int maxItems = h.e.INSTANCE.a();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public f.b defaultTab = f.b.a.f18921a;

        @NotNull
        public final h a() {
            h hVar = new h();
            hVar.m(this.mediaType);
            hVar.k(this.maxItems);
            hVar.n(this.isOrderedSelection);
            hVar.j(this.defaultTab);
            hVar.i(this.isCustomAccentColorApplied);
            hVar.h(this.accentColor);
            hVar.l(null);
            return hVar;
        }

        @NotNull
        public final a b(@NotNull f.b defaultTab) {
            Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
            this.defaultTab = defaultTab;
            return this;
        }

        @NotNull
        public final a c(int maxItems) {
            this.maxItems = maxItems;
            return this;
        }

        @NotNull
        public final a d(@NotNull f.h mediaType) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            this.mediaType = mediaType;
            return this;
        }

        @NotNull
        public final a e(boolean isOrderedSelection) {
            this.isOrderedSelection = isOrderedSelection;
            return this;
        }
    }

    /* renamed from: a, reason: from getter */
    public final long getAccentColor() {
        return this.accentColor;
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final f.b getDefaultTab() {
        return this.defaultTab;
    }

    /* renamed from: c, reason: from getter */
    public final int getMaxItems() {
        return this.maxItems;
    }

    @Nullable
    public final f.e d() {
        return null;
    }

    @NotNull
    /* renamed from: e, reason: from getter */
    public final f.h getMediaType() {
        return this.mediaType;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsCustomAccentColorApplied() {
        return this.isCustomAccentColorApplied;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsOrderedSelection() {
        return this.isOrderedSelection;
    }

    public final void h(long j10) {
        this.accentColor = j10;
    }

    public final void i(boolean z10) {
        this.isCustomAccentColorApplied = z10;
    }

    public final void j(@NotNull f.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.defaultTab = bVar;
    }

    public final void k(int i10) {
        this.maxItems = i10;
    }

    public final void l(@Nullable f.e eVar) {
    }

    public final void m(@NotNull f.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.mediaType = hVar;
    }

    public final void n(boolean z10) {
        this.isOrderedSelection = z10;
    }
}
