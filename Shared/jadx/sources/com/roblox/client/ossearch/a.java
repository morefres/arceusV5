package com.roblox.client.ossearch;

import android.net.Uri;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.shortcuts.PinShortcutHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;
import ug.m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0003J\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/roblox/client/ossearch/a;", "", "<init>", "()V", "", "deeplink", "", "c", "(Ljava/lang/String;)V", "e", "Lcom/roblox/client/ossearch/a$a;", "metrics", d.f30696a, "(Lcom/roblox/client/ossearch/a$a;)V", "g", "f", "ctx", j6.b.f21518e, ve.a.f33391e, "(Ljava/lang/String;Lcom/roblox/client/ossearch/a$a;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f9210a = new a();

    public static final void c(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String lastPathSegment = Uri.parse(deeplink).getLastPathSegment();
        List p8 = p.p(new NameValuePair("deeplink", deeplink));
        if (lastPathSegment != null) {
            p8.add(new NameValuePair(PinShortcutHandler.EXTRA_PLACE_ID, lastPathSegment));
        }
        m.c("OSSearchClick", "AndroidSearch", p8, false);
    }

    public final void a(String ctx, SyncMetrics metrics) {
        List p8 = p.p(new NameValuePair("itemsReceived", String.valueOf(metrics.getItemsReceived())), new NameValuePair("thumbnailURLsReceived", String.valueOf(metrics.getThumbnailURLsReceived())), new NameValuePair("thumbnailsDownloaded", String.valueOf(metrics.getThumbnailsDownloaded())), new NameValuePair("itemsAttached", String.valueOf(metrics.getItemsAttached())));
        p8.add(new NameValuePair("thumbnailsFromCache", String.valueOf(metrics.getThumbnailsFromCache())));
        p8.add(new NameValuePair("thumbnailsFailed", String.valueOf(metrics.getThumbnailsFailed())));
        Unit unit = Unit.f22894a;
        m.c("OSSearchUpdate", ctx, p8, false);
    }

    public final void b(String ctx) {
        m.c("OSSearchUpdate", ctx, p.k(), false);
    }

    public final void d(@NotNull SyncMetrics metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        a("osSearch.refresh.done", metrics);
    }

    public final void e() {
        b("osSearch.refresh.start");
    }

    public final void f(@NotNull SyncMetrics metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        a("osSearch.refreshOne.done", metrics);
    }

    public final void g() {
        b("osSearch.refreshOne.start");
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJP\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0011¨\u0006 "}, d2 = {"Lcom/roblox/client/ossearch/a$a;", "", "", "itemsReceived", "thumbnailURLsReceived", "thumbnailsDownloaded", "thumbnailsFromCache", "thumbnailsFailed", "itemsAttached", "<init>", "(IIILjava/lang/Integer;Ljava/lang/Integer;I)V", ve.a.f33391e, "(IIILjava/lang/Integer;Ljava/lang/Integer;I)Lcom/roblox/client/ossearch/a$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", d.f30696a, j6.b.f21518e, "e", "c", "f", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "g", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.roblox.client.ossearch.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class SyncMetrics {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final int itemsReceived;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        public final int thumbnailURLsReceived;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final int thumbnailsDownloaded;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Integer thumbnailsFromCache;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Integer thumbnailsFailed;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final int itemsAttached;

        public SyncMetrics(int i10, int i11, int i12, @Nullable Integer num, @Nullable Integer num2, int i13) {
            this.itemsReceived = i10;
            this.thumbnailURLsReceived = i11;
            this.thumbnailsDownloaded = i12;
            this.thumbnailsFromCache = num;
            this.thumbnailsFailed = num2;
            this.itemsAttached = i13;
        }

        public static /* synthetic */ SyncMetrics b(SyncMetrics syncMetrics, int i10, int i11, int i12, Integer num, Integer num2, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i10 = syncMetrics.itemsReceived;
            }
            if ((i14 & 2) != 0) {
                i11 = syncMetrics.thumbnailURLsReceived;
            }
            if ((i14 & 4) != 0) {
                i12 = syncMetrics.thumbnailsDownloaded;
            }
            if ((i14 & 8) != 0) {
                num = syncMetrics.thumbnailsFromCache;
            }
            if ((i14 & 16) != 0) {
                num2 = syncMetrics.thumbnailsFailed;
            }
            if ((i14 & 32) != 0) {
                i13 = syncMetrics.itemsAttached;
            }
            Integer num3 = num2;
            int i15 = i13;
            return syncMetrics.a(i10, i11, i12, num, num3, i15);
        }

        @NotNull
        public final SyncMetrics a(int itemsReceived, int thumbnailURLsReceived, int thumbnailsDownloaded, @Nullable Integer thumbnailsFromCache, @Nullable Integer thumbnailsFailed, int itemsAttached) {
            return new SyncMetrics(itemsReceived, thumbnailURLsReceived, thumbnailsDownloaded, thumbnailsFromCache, thumbnailsFailed, itemsAttached);
        }

        /* renamed from: c, reason: from getter */
        public final int getItemsAttached() {
            return this.itemsAttached;
        }

        /* renamed from: d, reason: from getter */
        public final int getItemsReceived() {
            return this.itemsReceived;
        }

        /* renamed from: e, reason: from getter */
        public final int getThumbnailURLsReceived() {
            return this.thumbnailURLsReceived;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SyncMetrics)) {
                return false;
            }
            SyncMetrics syncMetrics = (SyncMetrics) other;
            return this.itemsReceived == syncMetrics.itemsReceived && this.thumbnailURLsReceived == syncMetrics.thumbnailURLsReceived && this.thumbnailsDownloaded == syncMetrics.thumbnailsDownloaded && Intrinsics.c(this.thumbnailsFromCache, syncMetrics.thumbnailsFromCache) && Intrinsics.c(this.thumbnailsFailed, syncMetrics.thumbnailsFailed) && this.itemsAttached == syncMetrics.itemsAttached;
        }

        /* renamed from: f, reason: from getter */
        public final int getThumbnailsDownloaded() {
            return this.thumbnailsDownloaded;
        }

        @Nullable
        /* renamed from: g, reason: from getter */
        public final Integer getThumbnailsFailed() {
            return this.thumbnailsFailed;
        }

        @Nullable
        /* renamed from: h, reason: from getter */
        public final Integer getThumbnailsFromCache() {
            return this.thumbnailsFromCache;
        }

        public int hashCode() {
            int hashCode = ((((Integer.hashCode(this.itemsReceived) * 31) + Integer.hashCode(this.thumbnailURLsReceived)) * 31) + Integer.hashCode(this.thumbnailsDownloaded)) * 31;
            Integer num = this.thumbnailsFromCache;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.thumbnailsFailed;
            return ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + Integer.hashCode(this.itemsAttached);
        }

        @NotNull
        public String toString() {
            return "SyncMetrics(itemsReceived=" + this.itemsReceived + ", thumbnailURLsReceived=" + this.thumbnailURLsReceived + ", thumbnailsDownloaded=" + this.thumbnailsDownloaded + ", thumbnailsFromCache=" + this.thumbnailsFromCache + ", thumbnailsFailed=" + this.thumbnailsFailed + ", itemsAttached=" + this.itemsAttached + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ SyncMetrics(int r2, int r3, int r4, java.lang.Integer r5, java.lang.Integer r6, int r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 8
                r0 = 0
                if (r9 == 0) goto L6
                r5 = r0
            L6:
                r8 = r8 & 16
                if (r8 == 0) goto L12
                r8 = r7
                r7 = r0
            Lc:
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                goto L15
            L12:
                r8 = r7
                r7 = r6
                goto Lc
            L15:
                r2.<init>(r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.ossearch.a.SyncMetrics.<init>(int, int, int, java.lang.Integer, java.lang.Integer, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
