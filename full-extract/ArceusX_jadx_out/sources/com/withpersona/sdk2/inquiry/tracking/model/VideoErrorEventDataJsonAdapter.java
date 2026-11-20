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

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", "fromJson", "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;", "Lsm/t;", "writer", "value_", "", "toJson", "(Lsm/t;Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;)V", "Lsm/m$b;", "options", "Lsm/m$b;", "nullableStringAdapter", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "nullableTrackingMetadataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VideoErrorEventDataJsonAdapter extends h<VideoErrorEventData> {

    @Nullable
    private volatile Constructor<VideoErrorEventData> constructorRef;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final h<TrackingMetadata> nullableTrackingMetadataAdapter;

    @NotNull
    private final m.b options;

    public VideoErrorEventDataJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b a10 = m.b.a("step_name", "page_name", "capture_method", "error_name", "error_reason", "metadata");
        a10.getClass();
        this.options = a10;
        this.nullableStringAdapter = b.a(wVar, String.class, "stepName");
        this.nullableTrackingMetadataAdapter = b.a(wVar, TrackingMetadata.class, "metadata");
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(VideoErrorEventData)", 41);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public VideoErrorEventData fromJson(@NotNull m reader) {
        reader.getClass();
        reader.b();
        int i10 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        TrackingMetadata trackingMetadata = null;
        while (reader.f()) {
            switch (reader.F(this.options)) {
                case -1:
                    reader.M();
                    reader.P();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    trackingMetadata = this.nullableTrackingMetadataAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
            }
        }
        reader.d();
        if (i10 == -63) {
            TrackingMetadata trackingMetadata2 = trackingMetadata;
            String str6 = str5;
            String str7 = str4;
            return new VideoErrorEventData(str, str2, str3, str7, str6, trackingMetadata2);
        }
        TrackingMetadata trackingMetadata3 = trackingMetadata;
        String str8 = str5;
        String str9 = str4;
        String str10 = str3;
        String str11 = str2;
        String str12 = str;
        Constructor<VideoErrorEventData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = VideoErrorEventData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, TrackingMetadata.class, Integer.TYPE, c.f33031c);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        VideoErrorEventData newInstance = constructor.newInstance(str12, str11, str10, str9, str8, trackingMetadata3, Integer.valueOf(i10), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // sm.h
    public void toJson(@NotNull t writer, @Nullable VideoErrorEventData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("step_name");
        this.nullableStringAdapter.toJson(writer, (t) value_.getStepName());
        writer.n("page_name");
        this.nullableStringAdapter.toJson(writer, (t) value_.getPageName());
        writer.n("capture_method");
        this.nullableStringAdapter.toJson(writer, (t) value_.getCaptureMethod());
        writer.n("error_name");
        this.nullableStringAdapter.toJson(writer, (t) value_.getErrorName());
        writer.n("error_reason");
        this.nullableStringAdapter.toJson(writer, (t) value_.getErrorReason());
        writer.n("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, (t) value_.getMetadata());
        writer.g();
    }
}
