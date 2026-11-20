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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventDataJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", "fromJson", "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;", "Lsm/t;", "writer", "value_", "", "toJson", "(Lsm/t;Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;)V", "Lsm/m$b;", "options", "Lsm/m$b;", "Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;", "nullableIntegrationStateAdapter", "Lsm/h;", "nullableStringAdapter", "", "nullableBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "nullableTrackingMetadataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntegrationEventDataJsonAdapter extends h<IntegrationEventData> {

    @Nullable
    private volatile Constructor<IntegrationEventData> constructorRef;

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<IntegrationState> nullableIntegrationStateAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final h<TrackingMetadata> nullableTrackingMetadataAdapter;

    @NotNull
    private final m.b options;

    public IntegrationEventDataJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b a10 = m.b.a("state", "url", "isAuthTabEnabled", "metadata");
        a10.getClass();
        this.options = a10;
        this.nullableIntegrationStateAdapter = b.a(wVar, IntegrationState.class, "state");
        this.nullableStringAdapter = b.a(wVar, String.class, "url");
        this.nullableBooleanAdapter = b.a(wVar, Boolean.class, "isAuthTabEnabled");
        this.nullableTrackingMetadataAdapter = b.a(wVar, TrackingMetadata.class, "metadata");
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(IntegrationEventData)", 42);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public IntegrationEventData fromJson(@NotNull m reader) {
        reader.getClass();
        reader.b();
        IntegrationState integrationState = null;
        String str = null;
        Boolean bool = null;
        TrackingMetadata trackingMetadata = null;
        int i10 = -1;
        while (reader.f()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.M();
                reader.P();
            } else if (F == 0) {
                integrationState = this.nullableIntegrationStateAdapter.fromJson(reader);
                i10 &= -2;
            } else if (F == 1) {
                str = this.nullableStringAdapter.fromJson(reader);
                i10 &= -3;
            } else if (F == 2) {
                bool = this.nullableBooleanAdapter.fromJson(reader);
                i10 &= -5;
            } else if (F == 3) {
                trackingMetadata = this.nullableTrackingMetadataAdapter.fromJson(reader);
                i10 &= -9;
            }
        }
        reader.d();
        if (i10 == -16) {
            return new IntegrationEventData(integrationState, str, bool, trackingMetadata);
        }
        Constructor<IntegrationEventData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = IntegrationEventData.class.getDeclaredConstructor(IntegrationState.class, String.class, Boolean.class, TrackingMetadata.class, Integer.TYPE, c.f33031c);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        IntegrationEventData newInstance = constructor.newInstance(integrationState, str, bool, trackingMetadata, Integer.valueOf(i10), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // sm.h
    public void toJson(@NotNull t writer, @Nullable IntegrationEventData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("state");
        this.nullableIntegrationStateAdapter.toJson(writer, (t) value_.getState());
        writer.n("url");
        this.nullableStringAdapter.toJson(writer, (t) value_.getUrl());
        writer.n("isAuthTabEnabled");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.isAuthTabEnabled());
        writer.n("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, (t) value_.getMetadata());
        writer.g();
    }
}
