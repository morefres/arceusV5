package com.withpersona.sdk2.inquiry.tracking.model;

import com.appsflyer.sdk_base.referrer.Payload;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.h;
import sm.m;
import sm.t;
import sm.w;
import um.c;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventDataJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", "fromJson", "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;", "Lsm/t;", "writer", "value_", "", "toJson", "(Lsm/t;Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;)V", "Lsm/m$b;", "options", "Lsm/m$b;", "stringAdapter", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "nullableTrackingMetadataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PermissionTrackingEventDataJsonAdapter extends h<PermissionTrackingEventData> {

    @Nullable
    private volatile Constructor<PermissionTrackingEventData> constructorRef;

    @NotNull
    private final h<TrackingMetadata> nullableTrackingMetadataAdapter;

    @NotNull
    private final m.b options;

    @NotNull
    private final h<String> stringAdapter;

    public PermissionTrackingEventDataJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b a10 = m.b.a(Payload.TYPE, "state", "metadata");
        a10.getClass();
        this.options = a10;
        this.stringAdapter = b.a(wVar, String.class, "component");
        this.nullableTrackingMetadataAdapter = b.a(wVar, TrackingMetadata.class, "metadata");
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(PermissionTrackingEventData)", 49);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public PermissionTrackingEventData fromJson(@NotNull m reader) {
        reader.getClass();
        reader.b();
        String str = null;
        String str2 = null;
        TrackingMetadata trackingMetadata = null;
        int i10 = -1;
        while (reader.f()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.M();
                reader.P();
            } else if (F == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.x("component", Payload.TYPE, reader);
                }
            } else if (F == 1) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw c.x("state", "state", reader);
                }
            } else if (F == 2) {
                trackingMetadata = this.nullableTrackingMetadataAdapter.fromJson(reader);
                i10 = -5;
            }
        }
        reader.d();
        if (i10 == -5) {
            if (str == null) {
                throw c.o("component", Payload.TYPE, reader);
            }
            if (str2 != null) {
                return new PermissionTrackingEventData(str, str2, trackingMetadata);
            }
            throw c.o("state", "state", reader);
        }
        Constructor<PermissionTrackingEventData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PermissionTrackingEventData.class.getDeclaredConstructor(String.class, String.class, TrackingMetadata.class, Integer.TYPE, c.f33031c);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (str == null) {
            throw c.o("component", Payload.TYPE, reader);
        }
        if (str2 == null) {
            throw c.o("state", "state", reader);
        }
        PermissionTrackingEventData newInstance = constructor.newInstance(str, str2, trackingMetadata, Integer.valueOf(i10), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // sm.h
    public void toJson(@NotNull t writer, @Nullable PermissionTrackingEventData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n(Payload.TYPE);
        this.stringAdapter.toJson(writer, (t) value_.getComponent());
        writer.n("state");
        this.stringAdapter.toJson(writer, (t) value_.getState());
        writer.n("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, (t) value_.getMetadata());
        writer.g();
    }
}
