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

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventDataJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", "fromJson", "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "Lsm/t;", "writer", "value_", "", "toJson", "(Lsm/t;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;)V", "Lsm/m$b;", "options", "Lsm/m$b;", "nullableStringAdapter", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraSize;", "nullableCameraSizeAdapter", "", "nullableDoubleAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;", "nullableCameraDebugDataAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "nullableTrackingMetadataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraInfoEventDataJsonAdapter extends h<CameraInfoEventData> {

    @Nullable
    private volatile Constructor<CameraInfoEventData> constructorRef;

    @NotNull
    private final h<CameraDebugData> nullableCameraDebugDataAdapter;

    @NotNull
    private final h<CameraSize> nullableCameraSizeAdapter;

    @NotNull
    private final h<Double> nullableDoubleAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final h<TrackingMetadata> nullableTrackingMetadataAdapter;

    @NotNull
    private final m.b options;

    public CameraInfoEventDataJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b a10 = m.b.a("label", "position", "size", "frame_rate", "aspect_ratio", "debug_data", "metadata");
        a10.getClass();
        this.options = a10;
        this.nullableStringAdapter = b.a(wVar, String.class, "label");
        this.nullableCameraSizeAdapter = b.a(wVar, CameraSize.class, "size");
        this.nullableDoubleAdapter = b.a(wVar, Double.class, "frameRate");
        this.nullableCameraDebugDataAdapter = b.a(wVar, CameraDebugData.class, "debugData");
        this.nullableTrackingMetadataAdapter = b.a(wVar, TrackingMetadata.class, "metadata");
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(CameraInfoEventData)", 41);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public CameraInfoEventData fromJson(@NotNull m reader) {
        reader.getClass();
        reader.b();
        int i10 = -1;
        String str = null;
        String str2 = null;
        CameraSize cameraSize = null;
        Double d10 = null;
        Double d11 = null;
        CameraDebugData cameraDebugData = null;
        TrackingMetadata trackingMetadata = null;
        while (reader.f()) {
            switch (reader.F(this.options)) {
                case -1:
                    reader.M();
                    reader.P();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -2;
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    cameraSize = this.nullableCameraSizeAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    d10 = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    d11 = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    cameraDebugData = this.nullableCameraDebugDataAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
                case 6:
                    trackingMetadata = this.nullableTrackingMetadataAdapter.fromJson(reader);
                    i10 &= -65;
                    break;
            }
        }
        reader.d();
        if (i10 == -128) {
            TrackingMetadata trackingMetadata2 = trackingMetadata;
            CameraDebugData cameraDebugData2 = cameraDebugData;
            Double d12 = d11;
            Double d13 = d10;
            return new CameraInfoEventData(str, str2, cameraSize, d13, d12, cameraDebugData2, trackingMetadata2);
        }
        TrackingMetadata trackingMetadata3 = trackingMetadata;
        CameraDebugData cameraDebugData3 = cameraDebugData;
        Double d14 = d11;
        Double d15 = d10;
        CameraSize cameraSize2 = cameraSize;
        String str3 = str2;
        String str4 = str;
        Constructor<CameraInfoEventData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CameraInfoEventData.class.getDeclaredConstructor(String.class, String.class, CameraSize.class, Double.class, Double.class, CameraDebugData.class, TrackingMetadata.class, Integer.TYPE, c.f33031c);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        CameraInfoEventData newInstance = constructor.newInstance(str4, str3, cameraSize2, d15, d14, cameraDebugData3, trackingMetadata3, Integer.valueOf(i10), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // sm.h
    public void toJson(@NotNull t writer, @Nullable CameraInfoEventData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("label");
        this.nullableStringAdapter.toJson(writer, (t) value_.getLabel());
        writer.n("position");
        this.nullableStringAdapter.toJson(writer, (t) value_.getPosition());
        writer.n("size");
        this.nullableCameraSizeAdapter.toJson(writer, (t) value_.getSize());
        writer.n("frame_rate");
        this.nullableDoubleAdapter.toJson(writer, (t) value_.getFrameRate());
        writer.n("aspect_ratio");
        this.nullableDoubleAdapter.toJson(writer, (t) value_.getAspectRatio());
        writer.n("debug_data");
        this.nullableCameraDebugDataAdapter.toJson(writer, (t) value_.getDebugData());
        writer.n("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, (t) value_.getMetadata());
        writer.g();
    }
}
