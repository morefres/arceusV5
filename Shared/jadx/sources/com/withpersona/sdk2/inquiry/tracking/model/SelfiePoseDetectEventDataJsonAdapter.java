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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventDataJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", "fromJson", "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;", "Lsm/t;", "writer", "value_", "", "toJson", "(Lsm/t;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;)V", "Lsm/m$b;", "options", "Lsm/m$b;", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "selfiePoseTypeAdapter", "Lsm/h;", "", "floatAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "nullableTrackingMetadataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelfiePoseDetectEventDataJsonAdapter extends h<SelfiePoseDetectEventData> {

    @Nullable
    private volatile Constructor<SelfiePoseDetectEventData> constructorRef;

    @NotNull
    private final h<Float> floatAdapter;

    @NotNull
    private final h<TrackingMetadata> nullableTrackingMetadataAdapter;

    @NotNull
    private final m.b options;

    @NotNull
    private final h<SelfiePoseType> selfiePoseTypeAdapter;

    public SelfiePoseDetectEventDataJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b a10 = m.b.a("intended_pose", "actual_pose", "pitch", "yaw", "roll", "metadata");
        a10.getClass();
        this.options = a10;
        this.selfiePoseTypeAdapter = b.a(wVar, SelfiePoseType.class, "intendedPose");
        this.floatAdapter = b.a(wVar, Float.TYPE, "pitch");
        this.nullableTrackingMetadataAdapter = b.a(wVar, TrackingMetadata.class, "metadata");
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(SelfiePoseDetectEventData)", 47);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public SelfiePoseDetectEventData fromJson(@NotNull m reader) {
        reader.getClass();
        reader.b();
        int i10 = -1;
        SelfiePoseType selfiePoseType = null;
        SelfiePoseType selfiePoseType2 = null;
        Float f10 = null;
        Float f11 = null;
        Float f12 = null;
        TrackingMetadata trackingMetadata = null;
        while (reader.f()) {
            SelfiePoseType selfiePoseType3 = selfiePoseType;
            switch (reader.F(this.options)) {
                case -1:
                    reader.M();
                    reader.P();
                    break;
                case 0:
                    selfiePoseType = this.selfiePoseTypeAdapter.fromJson(reader);
                    if (selfiePoseType == null) {
                        throw c.x("intendedPose", "intended_pose", reader);
                    }
                    continue;
                case 1:
                    selfiePoseType2 = this.selfiePoseTypeAdapter.fromJson(reader);
                    if (selfiePoseType2 == null) {
                        throw c.x("actualPose", "actual_pose", reader);
                    }
                    break;
                case 2:
                    f10 = this.floatAdapter.fromJson(reader);
                    if (f10 == null) {
                        throw c.x("pitch", "pitch", reader);
                    }
                    break;
                case 3:
                    f11 = this.floatAdapter.fromJson(reader);
                    if (f11 == null) {
                        throw c.x("yaw", "yaw", reader);
                    }
                    break;
                case 4:
                    f12 = this.floatAdapter.fromJson(reader);
                    if (f12 == null) {
                        throw c.x("roll", "roll", reader);
                    }
                    break;
                case 5:
                    trackingMetadata = this.nullableTrackingMetadataAdapter.fromJson(reader);
                    selfiePoseType = selfiePoseType3;
                    i10 = -33;
                    continue;
            }
            selfiePoseType = selfiePoseType3;
        }
        SelfiePoseType selfiePoseType4 = selfiePoseType;
        reader.d();
        if (i10 == -33) {
            if (selfiePoseType4 == null) {
                throw c.o("intendedPose", "intended_pose", reader);
            }
            if (selfiePoseType2 == null) {
                throw c.o("actualPose", "actual_pose", reader);
            }
            if (f10 == null) {
                throw c.o("pitch", "pitch", reader);
            }
            Float f13 = f11;
            float floatValue = f10.floatValue();
            if (f13 == null) {
                throw c.o("yaw", "yaw", reader);
            }
            Float f14 = f12;
            float floatValue2 = f13.floatValue();
            if (f14 == null) {
                throw c.o("roll", "roll", reader);
            }
            return new SelfiePoseDetectEventData(selfiePoseType4, selfiePoseType2, floatValue, floatValue2, f14.floatValue(), trackingMetadata);
        }
        Float f15 = f11;
        Float f16 = f12;
        Constructor<SelfiePoseDetectEventData> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = c.f33031c;
            Class cls3 = Float.TYPE;
            constructor = SelfiePoseDetectEventData.class.getDeclaredConstructor(SelfiePoseType.class, SelfiePoseType.class, cls3, cls3, cls3, TrackingMetadata.class, cls, cls2);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (selfiePoseType4 == null) {
            throw c.o("intendedPose", "intended_pose", reader);
        }
        if (selfiePoseType2 == null) {
            throw c.o("actualPose", "actual_pose", reader);
        }
        if (f10 == null) {
            throw c.o("pitch", "pitch", reader);
        }
        if (f15 == null) {
            throw c.o("yaw", "yaw", reader);
        }
        if (f16 == null) {
            throw c.o("roll", "roll", reader);
        }
        SelfiePoseDetectEventData newInstance = constructor.newInstance(selfiePoseType4, selfiePoseType2, f10, f15, f16, trackingMetadata, Integer.valueOf(i10), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // sm.h
    public void toJson(@NotNull t writer, @Nullable SelfiePoseDetectEventData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("intended_pose");
        this.selfiePoseTypeAdapter.toJson(writer, (t) value_.getIntendedPose());
        writer.n("actual_pose");
        this.selfiePoseTypeAdapter.toJson(writer, (t) value_.getActualPose());
        writer.n("pitch");
        this.floatAdapter.toJson(writer, (t) Float.valueOf(value_.getPitch()));
        writer.n("yaw");
        this.floatAdapter.toJson(writer, (t) Float.valueOf(value_.getYaw()));
        writer.n("roll");
        this.floatAdapter.toJson(writer, (t) Float.valueOf(value_.getRoll()));
        writer.n("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, (t) value_.getMetadata());
        writer.g();
    }
}
