package com.roblox.client.widgets;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.mlkit.common.MlKitException;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.client.widgets.RecentlyPlayedWidgetHandler;
import gt.l;
import j6.b;
import ju.g1;
import ju.i;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import ot.m;
import rg.k0;
import rg.m0;
import rg.n0;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u000245B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\"\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\nH\u0082@¢\u0006\u0004\b\"\u0010#J0\u0010&\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0082@¢\u0006\u0004\b&\u0010'J)\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010,J'\u0010.\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0002¢\u0006\u0004\b.\u0010/J,\u00102\u001a\u000600j\u0002`12\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\bH\u0082@¢\u0006\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/roblox/client/widgets/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "options", "", "variant", "Lcom/roblox/client/widgets/a$b;", "i", "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/String;)Lcom/roblox/client/widgets/a$b;", "Landroid/appwidget/AppWidgetManager;", "appWidgetManager", "", "appWidgetId", "config", "", "o", "(Landroid/appwidget/AppWidgetManager;Landroid/content/Context;ILcom/roblox/client/widgets/a$b;Lmt/b;)Ljava/lang/Object;", PinShortcutHandler.EXTRA_PLACE_ID, "thumbnailUrl", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "recentlyPlayedData", "m", "(Ljava/lang/String;Landroid/content/Context;Lcom/roblox/client/widgets/a$b;Landroid/appwidget/AppWidgetManager;ILmt/b;)Ljava/lang/Object;", "k", "(Landroid/content/Context;Lcom/roblox/client/widgets/a$b;Landroid/appwidget/AppWidgetManager;I)V", "Lorg/json/JSONObject;", "experience", "Landroid/widget/RemoteViews;", "remoteViews", "n", "(Lorg/json/JSONObject;Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/roblox/client/widgets/a$b;Lmt/b;)Ljava/lang/Object;", "Lorg/json/JSONArray;", "jsonArray", "l", "(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/roblox/client/widgets/a$b;Lorg/json/JSONArray;Lmt/b;)Ljava/lang/Object;", "", "sizeName", "Landroid/app/PendingIntent;", "h", "(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;)Landroid/app/PendingIntent;", "entryPoint", "g", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/PendingIntent;", "Landroid/graphics/Bitmap;", "Lcoil3/Bitmap;", "f", "(Landroid/content/Context;JLjava/lang/String;Lmt/b;)Ljava/lang/Object;", b.f21518e, "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f9614a = new a();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.roblox.client.widgets.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0155a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9615a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f9623c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.f9622a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9615a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u001d\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u001aR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010#\"\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b'\u0010\u0010R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b!\u0010)¨\u0006*"}, d2 = {"Lcom/roblox/client/widgets/a$b;", "", "", "layoutId", "itemLayoutId", "emptyLayoutId", "totalItems", "", "showRating", "", "typeName", "Lcom/roblox/client/widgets/a$c;", "size", "<init>", "(IIIIZLjava/lang/String;Lcom/roblox/client/widgets/a$c;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "I", "c", "setLayoutId", "(I)V", b.f21518e, "setItemLayoutId", "setEmptyLayoutId", rl.d.f30696a, "f", "setTotalItems", "e", "Z", "()Z", "setShowRating", "(Z)V", "Ljava/lang/String;", "g", "Lcom/roblox/client/widgets/a$c;", "()Lcom/roblox/client/widgets/a$c;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.roblox.client.widgets.a$b, reason: from toString */
    public static final /* data */ class WidgetLayoutConfig {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public int layoutId;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        public int itemLayoutId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public int emptyLayoutId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public int totalItems;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public boolean showRating;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String typeName;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final c size;

        public WidgetLayoutConfig(int i10, int i11, int i12, int i13, boolean z10, @NotNull String typeName, @NotNull c size) {
            Intrinsics.checkNotNullParameter(typeName, "typeName");
            Intrinsics.checkNotNullParameter(size, "size");
            this.layoutId = i10;
            this.itemLayoutId = i11;
            this.emptyLayoutId = i12;
            this.totalItems = i13;
            this.showRating = z10;
            this.typeName = typeName;
            this.size = size;
        }

        /* renamed from: a, reason: from getter */
        public final int getEmptyLayoutId() {
            return this.emptyLayoutId;
        }

        /* renamed from: b, reason: from getter */
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        /* renamed from: c, reason: from getter */
        public final int getLayoutId() {
            return this.layoutId;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getShowRating() {
            return this.showRating;
        }

        @NotNull
        /* renamed from: e, reason: from getter */
        public final c getSize() {
            return this.size;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetLayoutConfig)) {
                return false;
            }
            WidgetLayoutConfig widgetLayoutConfig = (WidgetLayoutConfig) other;
            return this.layoutId == widgetLayoutConfig.layoutId && this.itemLayoutId == widgetLayoutConfig.itemLayoutId && this.emptyLayoutId == widgetLayoutConfig.emptyLayoutId && this.totalItems == widgetLayoutConfig.totalItems && this.showRating == widgetLayoutConfig.showRating && Intrinsics.c(this.typeName, widgetLayoutConfig.typeName) && this.size == widgetLayoutConfig.size;
        }

        /* renamed from: f, reason: from getter */
        public final int getTotalItems() {
            return this.totalItems;
        }

        @NotNull
        /* renamed from: g, reason: from getter */
        public final String getTypeName() {
            return this.typeName;
        }

        public int hashCode() {
            return (((((((((((Integer.hashCode(this.layoutId) * 31) + Integer.hashCode(this.itemLayoutId)) * 31) + Integer.hashCode(this.emptyLayoutId)) * 31) + Integer.hashCode(this.totalItems)) * 31) + Boolean.hashCode(this.showRating)) * 31) + this.typeName.hashCode()) * 31) + this.size.hashCode();
        }

        @NotNull
        public String toString() {
            return "WidgetLayoutConfig(layoutId=" + this.layoutId + ", itemLayoutId=" + this.itemLayoutId + ", emptyLayoutId=" + this.emptyLayoutId + ", totalItems=" + this.totalItems + ", showRating=" + this.showRating + ", typeName=" + this.typeName + ", size=" + this.size + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/roblox/client/widgets/a$c;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, b.f21518e, "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f9622a = new c("SMALL", 0);
        public static final c b = new c("MEDIUM", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final c f9623c = new c("LARGE", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ c[] f9624d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ pt.a f9625e;

        static {
            c[] a10 = a();
            f9624d = a10;
            f9625e = pt.b.a(a10);
        }

        public c(String str, int i10) {
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{f9622a, b, f9623c};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f9624d.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdater", f = "RecentlyPlayedWidgetUpdater.kt", l = {431}, m = "fetchThumbnail", v = 1)
    public static final class d extends ot.d {
        public /* synthetic */ Object A;
        public int C;

        /* renamed from: t, reason: collision with root package name */
        public Object f9626t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9627u;

        /* renamed from: v, reason: collision with root package name */
        public Object f9628v;

        /* renamed from: w, reason: collision with root package name */
        public Object f9629w;

        /* renamed from: x, reason: collision with root package name */
        public Object f9630x;

        /* renamed from: y, reason: collision with root package name */
        public Object f9631y;

        /* renamed from: z, reason: collision with root package name */
        public long f9632z;

        public d(mt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.A = obj;
            this.C |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return a.this.f(null, 0L, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Landroid/widget/RemoteViews;", "<anonymous>", "(Lju/p0;)Landroid/widget/RemoteViews;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdater$renderMedLargeLayout$2", f = "RecentlyPlayedWidgetUpdater.kt", l = {290}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<p0, mt.b<? super RemoteViews>, Object> {
        public final /* synthetic */ RemoteViews A;
        public final /* synthetic */ JSONArray B;
        public final /* synthetic */ WidgetLayoutConfig C;
        public final /* synthetic */ Context D;

        /* renamed from: t, reason: collision with root package name */
        public int f9633t;

        /* renamed from: u, reason: collision with root package name */
        public int f9634u;

        /* renamed from: v, reason: collision with root package name */
        public Object f9635v;

        /* renamed from: w, reason: collision with root package name */
        public Object f9636w;

        /* renamed from: x, reason: collision with root package name */
        public Object f9637x;

        /* renamed from: y, reason: collision with root package name */
        public long f9638y;

        /* renamed from: z, reason: collision with root package name */
        public int f9639z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(RemoteViews remoteViews, JSONArray jSONArray, WidgetLayoutConfig widgetLayoutConfig, Context context, mt.b<? super e> bVar) {
            super(2, bVar);
            this.A = remoteViews;
            this.B = jSONArray;
            this.C = widgetLayoutConfig;
            this.D = context;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new e(this.A, this.B, this.C, this.D, bVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x00c3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0081 -> B:5:0x0082). Please report as a decompilation issue!!! */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.widgets.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super RemoteViews> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdater", f = "RecentlyPlayedWidgetUpdater.kt", l = {MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, 209}, m = "renderRecentlyPlayed", v = 1)
    public static final class f extends ot.d {
        public /* synthetic */ Object A;
        public int C;

        /* renamed from: t, reason: collision with root package name */
        public Object f9640t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9641u;

        /* renamed from: v, reason: collision with root package name */
        public Object f9642v;

        /* renamed from: w, reason: collision with root package name */
        public Object f9643w;

        /* renamed from: x, reason: collision with root package name */
        public Object f9644x;

        /* renamed from: y, reason: collision with root package name */
        public Object f9645y;

        /* renamed from: z, reason: collision with root package name */
        public int f9646z;

        public f(mt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.A = obj;
            this.C |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return a.this.m(null, null, null, null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdater", f = "RecentlyPlayedWidgetUpdater.kt", l = {251}, m = "renderSmallLayout", v = 1)
    public static final class g extends ot.d {
        public /* synthetic */ Object A;
        public int C;

        /* renamed from: t, reason: collision with root package name */
        public Object f9647t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9648u;

        /* renamed from: v, reason: collision with root package name */
        public Object f9649v;

        /* renamed from: w, reason: collision with root package name */
        public Object f9650w;

        /* renamed from: x, reason: collision with root package name */
        public Object f9651x;

        /* renamed from: y, reason: collision with root package name */
        public Object f9652y;

        /* renamed from: z, reason: collision with root package name */
        public long f9653z;

        public g(mt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.A = obj;
            this.C |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return a.this.n(null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdater", f = "RecentlyPlayedWidgetUpdater.kt", l = {147, 165}, m = "updateRecentlyPlayedWidget", v = 1)
    public static final class h extends ot.d {
        public int B;

        /* renamed from: t, reason: collision with root package name */
        public Object f9654t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9655u;

        /* renamed from: v, reason: collision with root package name */
        public Object f9656v;

        /* renamed from: w, reason: collision with root package name */
        public Object f9657w;

        /* renamed from: x, reason: collision with root package name */
        public int f9658x;

        /* renamed from: y, reason: collision with root package name */
        public int f9659y;

        /* renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f9660z;

        public h(mt.b<? super h> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9660z = obj;
            this.B |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return a.this.o(null, null, 0, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(android.content.Context r10, long r11, java.lang.String r13, mt.b<? super android.graphics.Bitmap> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof com.roblox.client.widgets.a.d
            if (r0 == 0) goto L13
            r0 = r14
            com.roblox.client.widgets.a$d r0 = (com.roblox.client.widgets.a.d) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            com.roblox.client.widgets.a$d r0 = new com.roblox.client.widgets.a$d
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.A
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.C
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4b
            if (r2 != r3) goto L43
            java.lang.Object r10 = r0.f9631y
            x6.g r10 = (x6.ImageRequest) r10
            java.lang.Object r10 = r0.f9630x
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f9629w
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f9628v
            k6.s r10 = (k6.s) r10
            java.lang.Object r10 = r0.f9627u
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f9626t
            android.content.Context r10 = (android.content.Context) r10
            gt.o.b(r14)
            goto Ld6
        L43:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L4b:
            gt.o.b(r14)
            k6.s r14 = k6.d0.a(r10)
            com.roblox.client.widgets.RecentlyPlayedWidgetHandler r2 = com.roblox.client.widgets.RecentlyPlayedWidgetHandler.INSTANCE
            android.content.Context r5 = r10.getApplicationContext()
            java.lang.String r6 = "getApplicationContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String r2 = r2.getCachedWidgetVariant(r5)
            java.lang.String r5 = java.lang.String.valueOf(r11)
            java.lang.String r5 = r9.j(r5, r13, r2)
            x6.g$a r6 = new x6.g$a
            r6.<init>(r10)
            x6.g$a r6 = r6.c(r13)
            x6.g$a r6 = r6.f(r5)
            x6.g$a r6 = r6.j(r5)
            x6.c r7 = x6.c.f35364d
            x6.g$a r6 = r6.l(r7)
            x6.g$a r6 = r6.g(r7)
            x6.c r7 = x6.c.f35366f
            x6.g$a r6 = r6.m(r7)
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.RGB_565
            x6.g$a r6 = x6.j.b(r6, r7)
            x6.g$a r6 = x6.j.a(r6, r4)
            c7.b r7 = new c7.b
            r8 = 1098907648(0x41800000, float:16.0)
            r7.<init>(r8)
            c7.c[] r8 = new c7.c[r3]
            r8[r4] = r7
            x6.g$a r6 = x6.i.j(r6, r8)
            x6.g r6 = r6.b()
            java.lang.Object r10 = ot.l.a(r10)
            r0.f9626t = r10
            java.lang.Object r10 = ot.l.a(r13)
            r0.f9627u = r10
            java.lang.Object r10 = ot.l.a(r14)
            r0.f9628v = r10
            java.lang.Object r10 = ot.l.a(r2)
            r0.f9629w = r10
            java.lang.Object r10 = ot.l.a(r5)
            r0.f9630x = r10
            java.lang.Object r10 = ot.l.a(r6)
            r0.f9631y = r10
            r0.f9632z = r11
            r0.C = r3
            java.lang.Object r14 = r14.d(r6, r0)
            if (r14 != r1) goto Ld6
            return r1
        Ld6:
            x6.k r14 = (x6.k) r14
            boolean r10 = r14 instanceof x6.ErrorResult
            if (r10 != 0) goto Lee
            java.lang.String r10 = "null cannot be cast to non-null type coil3.request.SuccessResult"
            kotlin.jvm.internal.Intrinsics.d(r14, r10)
            x6.t r14 = (x6.SuccessResult) r14
            k6.n r10 = r14.getImage()
            r11 = 3
            r12 = 0
            android.graphics.Bitmap r10 = k6.v.g(r10, r4, r4, r11, r12)
            return r10
        Lee:
            x6.e r14 = (x6.ErrorResult) r14
            java.lang.Throwable r10 = r14.getThrowable()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.widgets.a.f(android.content.Context, long, java.lang.String, mt.b):java.lang.Object");
    }

    public final PendingIntent g(Context context, String entryPoint, String sizeName) {
        Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("roblox").authority("open").appendPath("widget").appendQueryParameter("entry_point", entryPoint).appendQueryParameter("joinAttemptOrigin", "RecentsWidget" + sizeName).build());
        intent.setPackage(context.getPackageName());
        intent.setFlags(335544320);
        PendingIntent activity = PendingIntent.getActivity(context, entryPoint.hashCode(), intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    public final PendingIntent h(Context context, Long placeId, String sizeName) {
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("roblox").authority("experiences").appendPath("start").appendQueryParameter("joinAttemptOrigin", "RecentsWidget" + sizeName);
        if (placeId != null) {
            appendQueryParameter.appendQueryParameter(PinShortcutHandler.EXTRA_PLACE_ID, String.valueOf(placeId.longValue()));
        }
        Intent intent = new Intent("android.intent.action.VIEW", appendQueryParameter.build());
        intent.setPackage(context.getPackageName());
        intent.setFlags(335544320);
        PendingIntent activity = PendingIntent.getActivity(context, placeId != null ? (int) placeId.longValue() : 0, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    @NotNull
    public final WidgetLayoutConfig i(@NotNull Context context, @NotNull Bundle options, @NotNull String variant) {
        WidgetLayoutConfig widgetLayoutConfig;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(variant, "variant");
        float f10 = options.getInt("appWidgetMinWidth") * context.getResources().getDisplayMetrics().density;
        float f11 = options.getInt("appWidgetMinHeight") * context.getResources().getDisplayMetrics().density;
        float dimension = context.getResources().getDimension(k0.f30323e);
        float dimension2 = context.getResources().getDimension(k0.f30322d);
        RecentlyPlayedWidgetHandler.a aVar = RecentlyPlayedWidgetHandler.a.f9547d;
        if (Intrinsics.c(variant, aVar.getValue())) {
            int i10 = n0.D;
            widgetLayoutConfig = new WidgetLayoutConfig(i10, i10, n0.f30425t, 1, true, "Small_V2", c.f9622a);
        } else {
            int i11 = n0.C;
            widgetLayoutConfig = new WidgetLayoutConfig(i11, i11, n0.f30425t, 1, true, "Small_V1", c.f9622a);
        }
        return (f10 <= dimension || f11 <= dimension2) ? f10 > dimension ? Intrinsics.c(variant, aVar.getValue()) ? new WidgetLayoutConfig(n0.B, n0.A, n0.f30424s, 4, true, "Medium_V2", c.b) : new WidgetLayoutConfig(n0.f30430y, n0.f30431z, n0.f30424s, 3, true, "Medium_V1", c.b) : widgetLayoutConfig : Intrinsics.c(variant, aVar.getValue()) ? new WidgetLayoutConfig(n0.f30429x, n0.f30428w, n0.f30424s, 12, false, "Large_V2", c.f9623c) : new WidgetLayoutConfig(n0.f30426u, n0.f30427v, n0.f30424s, 5, true, "Large_V1", c.f9623c);
    }

    @NotNull
    public final String j(@NotNull String placeId, @NotNull String thumbnailUrl, @NotNull String variant) {
        Intrinsics.checkNotNullParameter(placeId, "placeId");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(variant, "variant");
        if (!Intrinsics.c(variant, RecentlyPlayedWidgetHandler.a.f9547d.getValue())) {
            return "thumb_" + placeId;
        }
        return "thumb_" + placeId + "_" + thumbnailUrl.hashCode();
    }

    public final void k(Context context, WidgetLayoutConfig config, AppWidgetManager appWidgetManager, int appWidgetId) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), config.getEmptyLayoutId());
        remoteViews.setOnClickPendingIntent(m0.f30399x, rh.h.a().y() ? f9614a.g(context, "empty", config.getTypeName()) : f9614a.h(context, null, config.getTypeName()));
        int i10 = C0155a.f9615a[config.getSize().ordinal()];
        if (i10 == 1) {
            remoteViews.setViewVisibility(m0.f30397w, 0);
        } else if (i10 == 2) {
            remoteViews.setViewVisibility(m0.f30397w, 8);
        } else if (i10 != 3) {
            throw new l();
        }
        appWidgetManager.updateAppWidget(appWidgetId, remoteViews);
    }

    public final Object l(Context context, RemoteViews remoteViews, WidgetLayoutConfig widgetLayoutConfig, JSONArray jSONArray, mt.b<? super RemoteViews> bVar) {
        return i.g(g1.b(), new e(remoteViews, jSONArray, widgetLayoutConfig, context, null), bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.String r8, android.content.Context r9, com.roblox.client.widgets.a.WidgetLayoutConfig r10, android.appwidget.AppWidgetManager r11, int r12, mt.b<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.widgets.a.m(java.lang.String, android.content.Context, com.roblox.client.widgets.a$b, android.appwidget.AppWidgetManager, int, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(org.json.JSONObject r9, android.content.Context r10, android.widget.RemoteViews r11, com.roblox.client.widgets.a.WidgetLayoutConfig r12, mt.b<? super kotlin.Unit> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof com.roblox.client.widgets.a.g
            if (r0 == 0) goto L14
            r0 = r13
            com.roblox.client.widgets.a$g r0 = (com.roblox.client.widgets.a.g) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.C = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.roblox.client.widgets.a$g r0 = new com.roblox.client.widgets.a$g
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.A
            java.lang.Object r0 = nt.c.e()
            int r1 = r6.C
            r2 = 1
            if (r1 == 0) goto L51
            if (r1 != r2) goto L49
            long r9 = r6.f9653z
            java.lang.Object r11 = r6.f9652y
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r6.f9651x
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r6.f9650w
            com.roblox.client.widgets.a$b r12 = (com.roblox.client.widgets.a.WidgetLayoutConfig) r12
            java.lang.Object r0 = r6.f9649v
            android.widget.RemoteViews r0 = (android.widget.RemoteViews) r0
            java.lang.Object r1 = r6.f9648u
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r6.f9647t
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            gt.o.b(r13)
            r7 = r13
            r13 = r11
            r11 = r0
            r0 = r7
            goto L8a
        L49:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L51:
            gt.o.b(r13)
            java.lang.String r13 = "placeId"
            long r3 = r9.optLong(r13)
            java.lang.String r13 = "thumbnailUrl"
            java.lang.String r5 = r9.optString(r13)
            java.lang.String r13 = "name"
            java.lang.String r13 = r9.optString(r13)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r6.f9647t = r9
            r6.f9648u = r10
            r6.f9649v = r11
            r6.f9650w = r12
            java.lang.Object r1 = ot.l.a(r5)
            r6.f9651x = r1
            r6.f9652y = r13
            r6.f9653z = r3
            r6.C = r2
            r1 = r8
            r2 = r10
            java.lang.Object r10 = r1.f(r2, r3, r5, r6)
            if (r10 != r0) goto L86
            return r0
        L86:
            r0 = r10
            r1 = r2
            r2 = r9
            r9 = r3
        L8a:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            int r3 = rg.m0.A
            r11.setTextViewText(r3, r13)
            int r13 = rg.m0.f30400y
            r11.setImageViewBitmap(r13, r0)
            int r13 = rg.m0.f30401z
            com.roblox.client.widgets.a r0 = com.roblox.client.widgets.a.f9614a
            java.lang.Long r9 = ot.b.d(r9)
            java.lang.String r10 = r12.getTypeName()
            android.app.PendingIntent r9 = r0.h(r1, r9, r10)
            r11.setOnClickPendingIntent(r13, r9)
            boolean r9 = r12.getShowRating()
            if (r9 == 0) goto Lc4
            java.lang.String r9 = "rating"
            java.lang.String r9 = r2.optString(r9)
            int r10 = rg.m0.B
            int r12 = rg.q0.J1
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r9 = r1.getString(r12, r9)
            r11.setTextViewText(r10, r9)
        Lc4:
            kotlin.Unit r9 = kotlin.Unit.f22894a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.widgets.a.n(org.json.JSONObject, android.content.Context, android.widget.RemoteViews, com.roblox.client.widgets.a$b, mt.b):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c6, code lost:
    
        if (r1.m(r14, r3, r4, r5, r6, r7) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0083, code lost:
    
        if (r14 == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@org.jetbrains.annotations.NotNull android.appwidget.AppWidgetManager r10, @org.jetbrains.annotations.NotNull android.content.Context r11, int r12, @org.jetbrains.annotations.NotNull com.roblox.client.widgets.a.WidgetLayoutConfig r13, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.widgets.a.o(android.appwidget.AppWidgetManager, android.content.Context, int, com.roblox.client.widgets.a$b, mt.b):java.lang.Object");
    }
}
