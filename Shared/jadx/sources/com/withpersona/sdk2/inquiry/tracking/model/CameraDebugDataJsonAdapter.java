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

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugDataJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", "fromJson", "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;", "Lsm/t;", "writer", "value_", "", "toJson", "(Lsm/t;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;)V", "Lsm/m$b;", "options", "Lsm/m$b;", "nullableStringAdapter", "Lsm/h;", "", "nullableDoubleAdapter", "", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraDebugDataJsonAdapter extends h<CameraDebugData> {

    @Nullable
    private volatile Constructor<CameraDebugData> constructorRef;

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<Double> nullableDoubleAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options;

    public CameraDebugDataJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b a10 = m.b.a("device_type", "lens_aperture", "system_pressure_level", "is_low_light_boost_enabled", "current_iso", "current_exposure_duration", "current_zoom_factor", "auto_focus_system", "is_virtual_device", "has_flash", "is_flash_available");
        a10.getClass();
        this.options = a10;
        this.nullableStringAdapter = b.a(wVar, String.class, "deviceType");
        this.nullableDoubleAdapter = b.a(wVar, Double.class, "lensAperture");
        this.nullableBooleanAdapter = b.a(wVar, Boolean.class, "isLowLightBoostEnabled");
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(CameraDebugData)", 37);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public CameraDebugData fromJson(@NotNull m reader) {
        reader.getClass();
        reader.b();
        int i10 = -1;
        String str = null;
        Double d10 = null;
        String str2 = null;
        Boolean bool = null;
        Double d11 = null;
        Double d12 = null;
        Double d13 = null;
        String str3 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
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
                    d10 = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    d11 = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    d12 = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
                case 6:
                    d13 = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -65;
                    break;
                case 7:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -129;
                    break;
                case 8:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    i10 &= -257;
                    break;
                case 9:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    i10 &= -513;
                    break;
                case 10:
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    i10 &= -1025;
                    break;
            }
        }
        reader.d();
        if (i10 == -2048) {
            Boolean bool5 = bool2;
            String str4 = str3;
            Double d14 = d13;
            Double d15 = d12;
            Double d16 = d11;
            Boolean bool6 = bool;
            return new CameraDebugData(str, d10, str2, bool6, d16, d15, d14, str4, bool5, bool3, bool4);
        }
        Boolean bool7 = bool2;
        String str5 = str3;
        Double d17 = d13;
        Double d18 = d12;
        Double d19 = d11;
        Boolean bool8 = bool;
        String str6 = str2;
        Double d20 = d10;
        String str7 = str;
        Constructor<CameraDebugData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CameraDebugData.class.getDeclaredConstructor(String.class, Double.class, String.class, Boolean.class, Double.class, Double.class, Double.class, String.class, Boolean.class, Boolean.class, Boolean.class, Integer.TYPE, c.f33031c);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        CameraDebugData newInstance = constructor.newInstance(str7, d20, str6, bool8, d19, d18, d17, str5, bool7, bool3, bool4, Integer.valueOf(i10), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // sm.h
    public void toJson(@NotNull t writer, @Nullable CameraDebugData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("device_type");
        this.nullableStringAdapter.toJson(writer, (t) value_.getDeviceType());
        writer.n("lens_aperture");
        this.nullableDoubleAdapter.toJson(writer, (t) value_.getLensAperture());
        writer.n("system_pressure_level");
        this.nullableStringAdapter.toJson(writer, (t) value_.getSystemPressureLevel());
        writer.n("is_low_light_boost_enabled");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.isLowLightBoostEnabled());
        writer.n("current_iso");
        this.nullableDoubleAdapter.toJson(writer, (t) value_.getCurrentIso());
        writer.n("current_exposure_duration");
        this.nullableDoubleAdapter.toJson(writer, (t) value_.getCurrentExposureDuration());
        writer.n("current_zoom_factor");
        this.nullableDoubleAdapter.toJson(writer, (t) value_.getCurrentZoomFactor());
        writer.n("auto_focus_system");
        this.nullableStringAdapter.toJson(writer, (t) value_.getAutoFocusSystem());
        writer.n("is_virtual_device");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.isVirtualDevice());
        writer.n("has_flash");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.getHasFlash());
        writer.n("is_flash_available");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.isFlashAvailable());
        writer.g();
    }
}
