package com.withpersona.sdk2.inquiry.tracking.model;

import androidx.core.app.NotificationCompat;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.h;
import sm.m;
import sm.t;
import sm.w;
import um.c;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", "fromJson", "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;", "Lsm/t;", "writer", "value_", "", "toJson", "(Lsm/t;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;)V", "Lsm/m$b;", "options", "Lsm/m$b;", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;", "nfcScanPhaseAdapter", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanStatus;", "nfcScanStatusAdapter", "", "nullableLongAdapter", "nullableStringAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "nullableTrackingMetadataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NfcScanEventDataJsonAdapter extends h<NfcScanEventData> {

    @Nullable
    private volatile Constructor<NfcScanEventData> constructorRef;

    @NotNull
    private final h<NfcScanPhase> nfcScanPhaseAdapter;

    @NotNull
    private final h<NfcScanStatus> nfcScanStatusAdapter;

    @NotNull
    private final h<Long> nullableLongAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final h<TrackingMetadata> nullableTrackingMetadataAdapter;

    @NotNull
    private final m.b options;

    public NfcScanEventDataJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b a10 = m.b.a("phase", NotificationCompat.CATEGORY_STATUS, "duration_ms", "auth_method", "chip_auth_status", "data_group_type", "metadata");
        a10.getClass();
        this.options = a10;
        this.nfcScanPhaseAdapter = b.a(wVar, NfcScanPhase.class, "phase");
        this.nfcScanStatusAdapter = b.a(wVar, NfcScanStatus.class, NotificationCompat.CATEGORY_STATUS);
        this.nullableLongAdapter = b.a(wVar, Long.class, "durationMs");
        this.nullableStringAdapter = b.a(wVar, String.class, "authMethod");
        this.nullableTrackingMetadataAdapter = b.a(wVar, TrackingMetadata.class, "metadata");
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(NfcScanEventData)", 38);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public NfcScanEventData fromJson(@NotNull m reader) {
        reader.getClass();
        reader.b();
        int i10 = -1;
        NfcScanPhase nfcScanPhase = null;
        NfcScanStatus nfcScanStatus = null;
        Long l10 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
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
                    nfcScanStatus = this.nfcScanStatusAdapter.fromJson(reader);
                    if (nfcScanStatus == null) {
                        throw c.x(NotificationCompat.CATEGORY_STATUS, NotificationCompat.CATEGORY_STATUS, reader);
                    }
                    break;
                case 2:
                    l10 = this.nullableLongAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
                case 6:
                    trackingMetadata = this.nullableTrackingMetadataAdapter.fromJson(reader);
                    i10 &= -65;
                    break;
            }
        }
        reader.d();
        if (i10 == -125) {
            TrackingMetadata trackingMetadata2 = trackingMetadata;
            String str4 = str3;
            String str5 = str2;
            String str6 = str;
            Long l11 = l10;
            NfcScanStatus nfcScanStatus2 = nfcScanStatus;
            NfcScanPhase nfcScanPhase2 = nfcScanPhase;
            if (nfcScanPhase2 == null) {
                throw c.o("phase", "phase", reader);
            }
            if (nfcScanStatus2 != null) {
                return new NfcScanEventData(nfcScanPhase2, nfcScanStatus2, l11, str6, str5, str4, trackingMetadata2);
            }
            throw c.o(NotificationCompat.CATEGORY_STATUS, NotificationCompat.CATEGORY_STATUS, reader);
        }
        TrackingMetadata trackingMetadata3 = trackingMetadata;
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        Long l12 = l10;
        NfcScanStatus nfcScanStatus3 = nfcScanStatus;
        NfcScanPhase nfcScanPhase3 = nfcScanPhase;
        Constructor<NfcScanEventData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NfcScanEventData.class.getDeclaredConstructor(NfcScanPhase.class, NfcScanStatus.class, Long.class, String.class, String.class, String.class, TrackingMetadata.class, Integer.TYPE, c.f33031c);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Constructor<NfcScanEventData> constructor2 = constructor;
        if (nfcScanPhase3 == null) {
            throw c.o("phase", "phase", reader);
        }
        if (nfcScanStatus3 == null) {
            throw c.o(NotificationCompat.CATEGORY_STATUS, NotificationCompat.CATEGORY_STATUS, reader);
        }
        NfcScanEventData newInstance = constructor2.newInstance(nfcScanPhase3, nfcScanStatus3, l12, str9, str8, str7, trackingMetadata3, Integer.valueOf(i10), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // sm.h
    public void toJson(@NotNull t writer, @Nullable NfcScanEventData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("phase");
        this.nfcScanPhaseAdapter.toJson(writer, (t) value_.getPhase());
        writer.n(NotificationCompat.CATEGORY_STATUS);
        this.nfcScanStatusAdapter.toJson(writer, (t) value_.getStatus());
        writer.n("duration_ms");
        this.nullableLongAdapter.toJson(writer, (t) value_.getDurationMs());
        writer.n("auth_method");
        this.nullableStringAdapter.toJson(writer, (t) value_.getAuthMethod());
        writer.n("chip_auth_status");
        this.nullableStringAdapter.toJson(writer, (t) value_.getChipAuthStatus());
        writer.n("data_group_type");
        this.nullableStringAdapter.toJson(writer, (t) value_.getDataGroupType());
        writer.n("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, (t) value_.getMetadata());
        writer.g();
    }
}
