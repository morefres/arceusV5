package com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts;

import android.app.Application;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader;
import gt.l;
import gt.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import ju.k;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import ve.a;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 52\u00020\u0001:\u00046\u0016\u0010\u001bB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ+\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u0013H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001dH\u0082@¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&RT\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110'0'2\u001e\u0010)\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110'0'8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b%\u0010+R\"\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010-0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010*R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader;", "Lir/a;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Landroid/app/Application;", "context", "Lju/p0;", "coroutineScope", "<init>", "(Lokhttp3/OkHttpClient;Landroid/app/Application;Lju/p0;)V", "Landroid/os/Bundle;", "outState", "", "e", "(Landroid/os/Bundle;)V", "inState", j6.b.f21518e, "", "fontUrl", "Lkotlin/Function1;", "Landroid/graphics/Typeface;", "onSuccess", a.f33391e, "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "Lir/f;", "remoteFonts", "c", "(Ljava/util/List;)V", "Ljava/io/File;", "m", "()Ljava/io/File;", "destinationFile", "k", "(Ljava/lang/String;Ljava/io/File;Lmt/b;)Ljava/lang/Object;", "Lokhttp3/OkHttpClient;", "Landroid/app/Application;", rl.d.f30696a, "Lju/p0;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "value", "Ljava/util/Map;", "()Ljava/util/Map;", "fontDownloaderMapping", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c;", "f", "fontCache", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$b;", "g", "Ljava/util/List;", "onFontDownloadedCallbacks", "h", "FontDownloaderState", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealFontDownloader implements ir.a {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final OkHttpClient okHttpClient;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Application context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Map<String, Map<StyleElements.FontWeight, String>> fontDownloaderMapping;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, c> fontCache;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<b> onFontDownloadedCallbacks;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R/\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$FontDownloaderState;", "Landroid/os/Parcelable;", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "fontDownloaderMapping", "<init>", "(Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, "Ljava/util/Map;", "()Ljava/util/Map;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FontDownloaderState implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FontDownloaderState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, Map<StyleElements.FontWeight, String>> fontDownloaderMapping;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FontDownloaderState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FontDownloaderState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    String readString = parcel.readString();
                    int readInt2 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                    for (int i11 = 0; i11 != readInt2; i11++) {
                        linkedHashMap2.put(StyleElements.FontWeight.valueOf(parcel.readString()), parcel.readString());
                    }
                    linkedHashMap.put(readString, linkedHashMap2);
                }
                return new FontDownloaderState(linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FontDownloaderState[] newArray(int i10) {
                return new FontDownloaderState[i10];
            }
        }

        public FontDownloaderState(@NotNull Map<String, Map<StyleElements.FontWeight, String>> fontDownloaderMapping) {
            Intrinsics.checkNotNullParameter(fontDownloaderMapping, "fontDownloaderMapping");
            this.fontDownloaderMapping = fontDownloaderMapping;
        }

        @NotNull
        public final Map<String, Map<StyleElements.FontWeight, String>> a() {
            return this.fontDownloaderMapping;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Map<String, Map<StyleElements.FontWeight, String>> map = this.fontDownloaderMapping;
            dest.writeInt(map.size());
            for (Map.Entry<String, Map<StyleElements.FontWeight, String>> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                Map<StyleElements.FontWeight, String> value = entry.getValue();
                dest.writeInt(value.size());
                for (Map.Entry<StyleElements.FontWeight, String> entry2 : value.entrySet()) {
                    dest.writeString(entry2.getKey().name());
                    dest.writeString(entry2.getValue());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\n\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$b;", "", "", "url", "Lkotlin/Function1;", "Landroid/graphics/Typeface;", "", "onFontDownloaded", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String url;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Function1<Typeface, Unit> onFontDownloaded;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull String url, @NotNull Function1<? super Typeface, Unit> onFontDownloaded) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(onFontDownloaded, "onFontDownloaded");
            this.url = url;
            this.onFontDownloaded = onFontDownloaded;
        }

        @NotNull
        public final Function1<Typeface, Unit> a() {
            return this.onFontDownloaded;
        }

        @NotNull
        /* renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c;", "", j6.b.f21518e, a.f33391e, "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c$a;", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c$b;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c$a;", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c;", "Landroid/graphics/Typeface;", "typeface", "<init>", "(Landroid/graphics/Typeface;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", a.f33391e, "Landroid/graphics/Typeface;", "()Landroid/graphics/Typeface;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$c$a, reason: from toString */
        public static final /* data */ class Cached implements c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Typeface typeface;

            public Cached(@NotNull Typeface typeface) {
                Intrinsics.checkNotNullParameter(typeface, "typeface");
                this.typeface = typeface;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final Typeface getTypeface() {
                return this.typeface;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Cached) && Intrinsics.c(this.typeface, ((Cached) other).typeface);
            }

            public int hashCode() {
                return this.typeface.hashCode();
            }

            @NotNull
            public String toString() {
                return "Cached(typeface=" + this.typeface + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c$b;", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f13676a = new b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1662305117;
            }

            @NotNull
            public String toString() {
                return "Downloading";
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1", f = "RealFontDownloader.kt", l = {84, 90}, m = "invokeSuspend")
    public static final class d extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f13677t;

        /* renamed from: u, reason: collision with root package name */
        public Object f13678u;

        /* renamed from: v, reason: collision with root package name */
        public int f13679v;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f13681x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<Typeface, Unit> f13682y;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1$1", f = "RealFontDownloader.kt", l = {}, m = "invokeSuspend")
        public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f13683t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Function1<Typeface, Unit> f13684u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Typeface f13685v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ RealFontDownloader f13686w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ String f13687x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super Typeface, Unit> function1, Typeface typeface, RealFontDownloader realFontDownloader, String str, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f13684u = function1;
                this.f13685v = typeface;
                this.f13686w = realFontDownloader;
                this.f13687x = str;
            }

            public static final boolean q(String str, b bVar) {
                return Intrinsics.c(bVar.getUrl(), str);
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f13684u, this.f13685v, this.f13686w, this.f13687x, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f13683t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                Function1<Typeface, Unit> function1 = this.f13684u;
                Typeface typeface = this.f13685v;
                Intrinsics.checkNotNull(typeface);
                function1.invoke(typeface);
                List list = this.f13686w.onFontDownloadedCallbacks;
                String str = this.f13687x;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (Intrinsics.c(((b) obj2).getUrl(), str)) {
                        arrayList.add(obj2);
                    }
                }
                List list2 = this.f13686w.onFontDownloadedCallbacks;
                final String str2 = this.f13687x;
                u.F(list2, new Function1() { // from class: ir.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        boolean q10;
                        q10 = RealFontDownloader.d.a.q(str2, (RealFontDownloader.b) obj3);
                        return Boolean.valueOf(q10);
                    }
                });
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    Function1<Typeface, Unit> a10 = ((b) obj3).a();
                    Typeface typeface2 = this.f13685v;
                    Intrinsics.checkNotNull(typeface2);
                    a10.invoke(typeface2);
                }
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, Function1<? super Typeface, Unit> function1, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f13681x = str;
            this.f13682y = function1;
        }

        public static final boolean q(String str, b bVar) {
            return Intrinsics.c(bVar.getUrl(), str);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return RealFontDownloader.this.new d(this.f13681x, this.f13682y, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
        
            if (ju.i.g(r10, r3, r9) == r0) goto L20;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r9.f13679v
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r9.f13678u
                android.graphics.Typeface r0 = (android.graphics.Typeface) r0
                java.lang.Object r0 = r9.f13677t
                java.io.File r0 = (java.io.File) r0
                gt.o.b(r10)     // Catch: java.lang.Exception -> L82
                goto L9e
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                java.lang.Object r1 = r9.f13677t
                java.io.File r1 = (java.io.File) r1
                gt.o.b(r10)     // Catch: java.lang.Exception -> L82
                goto L43
            L2b:
                gt.o.b(r10)
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.this     // Catch: java.lang.Exception -> L82
                java.io.File r1 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.i(r10)     // Catch: java.lang.Exception -> L82
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.this     // Catch: java.lang.Exception -> L82
                java.lang.String r4 = r9.f13681x     // Catch: java.lang.Exception -> L82
                r9.f13677t = r1     // Catch: java.lang.Exception -> L82
                r9.f13679v = r3     // Catch: java.lang.Exception -> L82
                java.lang.Object r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.g(r10, r4, r1, r9)     // Catch: java.lang.Exception -> L82
                if (r10 != r0) goto L43
                goto L81
            L43:
                android.graphics.Typeface r5 = android.graphics.Typeface.createFromFile(r1)     // Catch: java.lang.Exception -> L82
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.this     // Catch: java.lang.Exception -> L82
                java.util.Map r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.h(r10)     // Catch: java.lang.Exception -> L82
                java.lang.String r3 = r9.f13681x     // Catch: java.lang.Exception -> L82
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$c$a r4 = new com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$c$a     // Catch: java.lang.Exception -> L82
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch: java.lang.Exception -> L82
                r4.<init>(r5)     // Catch: java.lang.Exception -> L82
                r10.put(r3, r4)     // Catch: java.lang.Exception -> L82
                r1.delete()     // Catch: java.lang.Exception -> L82
                ju.n2 r10 = ju.g1.c()     // Catch: java.lang.Exception -> L82
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$d$a r3 = new com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$d$a     // Catch: java.lang.Exception -> L82
                kotlin.jvm.functions.Function1<android.graphics.Typeface, kotlin.Unit> r4 = r9.f13682y     // Catch: java.lang.Exception -> L82
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader r6 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.this     // Catch: java.lang.Exception -> L82
                java.lang.String r7 = r9.f13681x     // Catch: java.lang.Exception -> L82
                r8 = 0
                r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L82
                java.lang.Object r1 = ot.l.a(r1)     // Catch: java.lang.Exception -> L82
                r9.f13677t = r1     // Catch: java.lang.Exception -> L82
                java.lang.Object r1 = ot.l.a(r5)     // Catch: java.lang.Exception -> L82
                r9.f13678u = r1     // Catch: java.lang.Exception -> L82
                r9.f13679v = r2     // Catch: java.lang.Exception -> L82
                java.lang.Object r10 = ju.i.g(r10, r3, r9)     // Catch: java.lang.Exception -> L82
                if (r10 != r0) goto L9e
            L81:
                return r0
            L82:
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.this
                java.util.Map r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.h(r10)
                java.lang.String r0 = r9.f13681x
                r1 = 0
                r10.put(r0, r1)
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.this
                java.util.List r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.j(r10)
                java.lang.String r0 = r9.f13681x
                ir.c r1 = new ir.c
                r1.<init>()
                kotlin.collections.u.F(r10, r1)
            L9e:
                kotlin.Unit r10 = kotlin.Unit.f22894a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader", f = "RealFontDownloader.kt", l = {138}, m = "downloadFontFile")
    public static final class e extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f13688t;

        /* renamed from: u, reason: collision with root package name */
        public Object f13689u;

        /* renamed from: v, reason: collision with root package name */
        public Object f13690v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f13691w;

        /* renamed from: y, reason: collision with root package name */
        public int f13693y;

        public e(mt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f13691w = obj;
            this.f13693y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return RealFontDownloader.this.k(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return kt.a.a(Boolean.valueOf(((ir.f) t10).d()), Boolean.valueOf(((ir.f) t8).d()));
        }
    }

    public RealFontDownloader(@NotNull OkHttpClient okHttpClient, @NotNull Application context, @NotNull p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.okHttpClient = okHttpClient;
        this.context = context;
        this.coroutineScope = coroutineScope;
        this.fontDownloaderMapping = new LinkedHashMap();
        this.fontCache = new LinkedHashMap();
        this.onFontDownloadedCallbacks = new ArrayList();
    }

    public static final Response l(RealFontDownloader realFontDownloader, Request request) {
        return realFontDownloader.okHttpClient.newCall(request).execute();
    }

    @Override // ir.a
    public void a(@NotNull String fontUrl, @NotNull Function1<? super Typeface, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(fontUrl, "fontUrl");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        c cVar = this.fontCache.get(fontUrl);
        if (cVar instanceof c.Cached) {
            onSuccess.invoke(((c.Cached) cVar).getTypeface());
            return;
        }
        c.b bVar = c.b.f13676a;
        if (Intrinsics.c(cVar, bVar)) {
            this.onFontDownloadedCallbacks.add(new b(fontUrl, onSuccess));
        } else {
            if (cVar != null) {
                throw new l();
            }
            this.fontCache.put(fontUrl, bVar);
            k.d(this.coroutineScope, null, null, new d(fontUrl, onSuccess, null), 3, null);
        }
    }

    @Override // ir.a
    public void b(@Nullable Bundle inState) {
        Map<String, Map<StyleElements.FontWeight, String>> linkedHashMap;
        FontDownloaderState fontDownloaderState;
        if (inState == null || (fontDownloaderState = (FontDownloaderState) u2.c.a(inState, "font_downloader_mapping", FontDownloaderState.class)) == null || (linkedHashMap = fontDownloaderState.a()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        this.fontDownloaderMapping = linkedHashMap;
    }

    @Override // ir.a
    public void c(@Nullable List<ir.f> remoteFonts) {
        if (remoteFonts == null) {
            remoteFonts = p.k();
        }
        for (ir.f fVar : CollectionsKt.F0(remoteFonts, new f())) {
            String fontFamilyName = fVar.getFontFamilyName();
            String url = fVar.getUrl();
            StyleElements.FontWeight fontWeight = fVar.getFontWeight();
            if (fontFamilyName != null && url != null && fontWeight != null) {
                Map<String, Map<StyleElements.FontWeight, String>> d10 = d();
                Map<StyleElements.FontWeight, String> map = d10.get(fontFamilyName);
                if (map == null) {
                    map = new LinkedHashMap<>();
                    d10.put(fontFamilyName, map);
                }
                map.put(fontWeight, url);
            }
        }
    }

    @Override // ir.a
    @NotNull
    public Map<String, Map<StyleElements.FontWeight, String>> d() {
        return this.fontDownloaderMapping;
    }

    @Override // ir.a
    public void e(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putParcelable("font_downloader_mapping", new FontDownloaderState(d()));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077 A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #5 {all -> 0x007c, blocks: (B:12:0x0070, B:14:0x0077, B:31:0x009c, B:40:0x00a7, B:41:0x00aa, B:37:0x00a5, B:16:0x007f, B:28:0x0093, B:29:0x0096, B:30:0x0099, B:20:0x0088, B:24:0x0091), top: B:11:0x0070, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r6, java.io.File r7, mt.b<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.e
            if (r0 == 0) goto L13
            r0 = r8
            com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$e r0 = (com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.e) r0
            int r1 = r0.f13693y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13693y = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$e r0 = new com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f13691w
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f13693y
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.f13690v
            okhttp3.Request r6 = (okhttp3.Request) r6
            java.lang.Object r6 = r0.f13689u
            r7 = r6
            java.io.File r7 = (java.io.File) r7
            java.lang.Object r6 = r0.f13688t
            java.lang.String r6 = (java.lang.String) r6
            gt.o.b(r8)
            goto L6e
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            gt.o.b(r8)
            okhttp3.Request$Builder r8 = new okhttp3.Request$Builder
            r8.<init>()
            okhttp3.Request$Builder r8 = r8.url(r6)
            okhttp3.Request r8 = r8.build()
            ju.l0 r2 = ju.g1.b()
            ir.b r4 = new ir.b
            r4.<init>()
            java.lang.Object r6 = ot.l.a(r6)
            r0.f13688t = r6
            r0.f13689u = r7
            java.lang.Object r6 = ot.l.a(r8)
            r0.f13690v = r6
            r0.f13693y = r3
            java.lang.Object r8 = ju.a2.b(r2, r4, r0)
            if (r8 != r1) goto L6e
            return r1
        L6e:
            okhttp3.Response r8 = (okhttp3.Response) r8
            okhttp3.ResponseBody r6 = r8.body()     // Catch: java.lang.Throwable -> L7c
            r0 = 0
            if (r6 == 0) goto L7e
            java.io.InputStream r6 = r6.byteStream()     // Catch: java.lang.Throwable -> L7c
            goto L7f
        L7c:
            r6 = move-exception
            goto Lab
        L7e:
            r6 = r0
        L7f:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L97
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L97
            if (r6 == 0) goto L99
            r7 = 0
            r2 = 2
            long r2 = tt.b.b(r6, r1, r7, r2, r0)     // Catch: java.lang.Throwable -> L90
            ot.b.d(r2)     // Catch: java.lang.Throwable -> L90
            goto L99
        L90:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L92
        L92:
            r0 = move-exception
            tt.c.a(r1, r7)     // Catch: java.lang.Throwable -> L97
            throw r0     // Catch: java.lang.Throwable -> L97
        L97:
            r7 = move-exception
            goto La5
        L99:
            tt.c.a(r1, r0)     // Catch: java.lang.Throwable -> L97
            tt.c.a(r6, r0)     // Catch: java.lang.Throwable -> L7c
            tt.c.a(r8, r0)
            kotlin.Unit r6 = kotlin.Unit.f22894a
            return r6
        La5:
            throw r7     // Catch: java.lang.Throwable -> La6
        La6:
            r0 = move-exception
            tt.c.a(r6, r7)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7c
        Lab:
            throw r6     // Catch: java.lang.Throwable -> Lac
        Lac:
            r7 = move-exception
            tt.c.a(r8, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.k(java.lang.String, java.io.File, mt.b):java.lang.Object");
    }

    public final File m() {
        File file = new File(new File(this.context.getCacheDir(), ".com.withpersona.sdk2.inquiry"), "fonts");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, UUID.randomUUID().toString());
    }
}
