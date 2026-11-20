package com.withpersona.sdk2.inquiry.tracking.model;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.h;
import sm.m;
import sm.t;
import sm.w;
import um.c;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventDataJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", "fromJson", "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;", "Lsm/t;", "writer", "value_", "", "toJson", "(Lsm/t;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;)V", "Lsm/m$b;", "options", "Lsm/m$b;", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;", "nfcScanPhaseAdapter", "Lsm/h;", "nullableStringAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorType;", "nullableNfcErrorTypeAdapter", "", "nullableLongAdapter", "", "nullableIntAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "nullableTrackingMetadataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NfcErrorEventDataJsonAdapter extends h<NfcErrorEventData> {

    @Nullable
    private volatile Constructor<NfcErrorEventData> constructorRef;

    @NotNull
    private final h<NfcScanPhase> nfcScanPhaseAdapter;

    @NotNull
    private final h<Integer> nullableIntAdapter;

    @NotNull
    private final h<Long> nullableLongAdapter;

    @NotNull
    private final h<NfcErrorType> nullableNfcErrorTypeAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final h<TrackingMetadata> nullableTrackingMetadataAdapter;

    @NotNull
    private final m.b options;

    public NfcErrorEventDataJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b a10 = m.b.a("phase", "category", "error_message", "error_type", "duration_ms", "auth_method", "data_group_type", "card_status_word", "metadata");
        a10.getClass();
        this.options = a10;
        this.nfcScanPhaseAdapter = b.a(wVar, NfcScanPhase.class, "phase");
        this.nullableStringAdapter = b.a(wVar, String.class, "category");
        this.nullableNfcErrorTypeAdapter = b.a(wVar, NfcErrorType.class, "errorType");
        this.nullableLongAdapter = b.a(wVar, Long.class, "durationMs");
        this.nullableIntAdapter = b.a(wVar, Integer.class, "cardStatusWord");
        this.nullableTrackingMetadataAdapter = b.a(wVar, TrackingMetadata.class, "metadata");
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(NfcErrorEventData)", 39);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public NfcErrorEventData fromJson(@NotNull m reader) {
        reader.getClass();
        reader.b();
        int i10 = -1;
        NfcScanPhase nfcScanPhase = null;
        String str = null;
        String str2 = null;
        NfcErrorType nfcErrorType = null;
        Long l10 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        TrackingMetadata trackingMetadata = null;
        while (reader.f()) {
            switch (reader.F(this.options)) {
                case -1:
                    reader.M();
                    reader.P();
                    break;
                case 0:
                    nfcScanPhase = this.nfcScanPhaseAdapter.fromJson(reader);
                    if (nfcScanPhase == null) {
                        throw c.x("phase", "phase", reader);
                    }
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    nfcErrorType = this.nullableNfcErrorTypeAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    l10 = this.nullableLongAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
                case 6:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -65;
                    break;
                case 7:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i10 &= -129;
                    break;
                case 8:
                    trackingMetadata = this.nullableTrackingMetadataAdapter.fromJson(reader);
                    i10 &= -257;
                    break;
            }
        }
        reader.d();
        if (i10 == -511) {
            TrackingMetadata trackingMetadata2 = trackingMetadata;
            Integer num2 = num;
            String str5 = str4;
            String str6 = str3;
            Long l11 = l10;
            NfcErrorType nfcErrorType2 = nfcErrorType;
            String str7 = str2;
            String str8 = str;
            NfcScanPhase nfcScanPhase2 = nfcScanPhase;
            if (nfcScanPhase2 != null) {
                return new NfcErrorEventData(nfcScanPhase2, str8, str7, nfcErrorType2, l11, str6, str5, num2, trackingMetadata2);
            }
            throw c.o("phase", "phase", reader);
        }
        TrackingMetadata trackingMetadata3 = trackingMetadata;
        Integer num3 = num;
        String str9 = str4;
        String str10 = str3;
        Long l12 = l10;
        NfcErrorType nfcErrorType3 = nfcErrorType;
        String str11 = str2;
        String str12 = str;
        NfcScanPhase nfcScanPhase3 = nfcScanPhase;
        Constructor<NfcErrorEventData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NfcErrorEventData.class.getDeclaredConstructor(NfcScanPhase.class, String.class, String.class, NfcErrorType.class, Long.class, String.class, String.class, Integer.class, TrackingMetadata.class, Integer.TYPE, c.f33031c);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (nfcScanPhase3 == null) {
            throw c.o("phase", "phase", reader);
        }
        NfcErrorEventData newInstance = constructor.newInstance(nfcScanPhase3, str12, str11, nfcErrorType3, l12, str10, str9, num3, trackingMetadata3, Integer.valueOf(i10), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // sm.h
    public void toJson(@NotNull t writer, @Nullable NfcErrorEventData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("phase");
        this.nfcScanPhaseAdapter.toJson(writer, (t) value_.getPhase());
        writer.n("category");
        this.nullableStringAdapter.toJson(writer, (t) value_.getCategory());
        writer.n("error_message");
        this.nullableStringAdapter.toJson(writer, (t) value_.getErrorMessage());
        writer.n("error_type");
        this.nullableNfcErrorTypeAdapter.toJson(writer, (t) value_.getErrorType());
        writer.n("duration_ms");
        this.nullableLongAdapter.toJson(writer, (t) value_.getDurationMs());
        writer.n("auth_method");
        this.nullableStringAdapter.toJson(writer, (t) value_.getAuthMethod());
        writer.n("data_group_type");
        this.nullableStringAdapter.toJson(writer, (t) value_.getDataGroupType());
        writer.n("card_status_word");
        this.nullableIntAdapter.toJson(writer, (t) value_.getCardStatusWord());
        writer.n("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, (t) value_.getMetadata());
        writer.g();
    }
}
