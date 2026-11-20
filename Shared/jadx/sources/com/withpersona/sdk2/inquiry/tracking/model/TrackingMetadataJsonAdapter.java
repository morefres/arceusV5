package com.withpersona.sdk2.inquiry.tracking.model;

import com.appsflyer.sdk_base.referrer.Payload;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.a0;
import sm.h;
import sm.m;
import sm.t;
import sm.w;
import um.c;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadataJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", "fromJson", "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "Lsm/t;", "writer", "value_", "", "toJson", "(Lsm/t;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "Lsm/m$b;", "options", "Lsm/m$b;", "nullableStringAdapter", "Lsm/h;", "", "nullableBooleanAdapter", "", "nullableDoubleAdapter", "", "nullableLongAdapter", "", "nullableMapOfStringBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrackingMetadataJsonAdapter extends h<TrackingMetadata> {

    @Nullable
    private volatile Constructor<TrackingMetadata> constructorRef;

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<Double> nullableDoubleAdapter;

    @NotNull
    private final h<Long> nullableLongAdapter;

    @NotNull
    private final h<Map<String, Boolean>> nullableMapOfStringBooleanAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options;

    public TrackingMetadataJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b a10 = m.b.a("sdk", "sdk_version", "app_version", "app_namespace", Payload.DEVICE_MODEL, "is_simulator", "os_version", "connection_type", "cellular_technology", "thermal_state", "system_available_memory_mb", "battery_level", "is_low_power_mode", "app_memory_usage_mb", "is_charging", "is_backgrounded", "locale", "timezone", "feature_flags");
        a10.getClass();
        this.options = a10;
        this.nullableStringAdapter = b.a(wVar, String.class, "sdk");
        this.nullableBooleanAdapter = b.a(wVar, Boolean.class, "isSimulator");
        this.nullableDoubleAdapter = b.a(wVar, Double.class, "systemAvailableMemoryMb");
        this.nullableLongAdapter = b.a(wVar, Long.class, "appMemoryUsageMb");
        h<Map<String, Boolean>> f10 = wVar.f(a0.j(Map.class, String.class, Boolean.class), q0.d(), "featureFlags");
        f10.getClass();
        this.nullableMapOfStringBooleanAdapter = f10;
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(TrackingMetadata)", 38);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public TrackingMetadata fromJson(@NotNull m reader) {
        int i10;
        reader.getClass();
        reader.b();
        int i11 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Double d10 = null;
        Double d11 = null;
        Boolean bool2 = null;
        Long l10 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        String str10 = null;
        String str11 = null;
        Map<String, Boolean> map = null;
        while (reader.f()) {
            switch (reader.F(this.options)) {
                case -1:
                    reader.M();
                    reader.P();
                    continue;
                case 0:
                    i10 = -2;
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    i10 = -3;
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    i10 = -5;
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    i10 = -9;
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    i10 = -17;
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    i10 = -33;
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 6:
                    i10 = -65;
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    i10 = -129;
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    i10 = -257;
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 9:
                    i10 = -513;
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 10:
                    i10 = -1025;
                    d10 = this.nullableDoubleAdapter.fromJson(reader);
                    break;
                case 11:
                    i10 = -2049;
                    d11 = this.nullableDoubleAdapter.fromJson(reader);
                    break;
                case 12:
                    i10 = -4097;
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 13:
                    i10 = -8193;
                    l10 = this.nullableLongAdapter.fromJson(reader);
                    break;
                case 14:
                    i10 = -16385;
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 15:
                    i10 = -32769;
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 16:
                    i10 = -65537;
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 17:
                    i10 = -131073;
                    str11 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 18:
                    i10 = -262145;
                    map = this.nullableMapOfStringBooleanAdapter.fromJson(reader);
                    break;
            }
            i11 &= i10;
        }
        reader.d();
        if (i11 == -524288) {
            String str12 = str8;
            String str13 = str7;
            String str14 = str6;
            Boolean bool5 = bool;
            String str15 = str5;
            String str16 = str4;
            return new TrackingMetadata(str, str2, str3, str16, str15, bool5, str14, str13, str12, str9, d10, d11, bool2, l10, bool3, bool4, str10, str11, map);
        }
        String str17 = str8;
        String str18 = str7;
        String str19 = str6;
        Boolean bool6 = bool;
        String str20 = str5;
        String str21 = str4;
        String str22 = str3;
        String str23 = str2;
        String str24 = str;
        Constructor<TrackingMetadata> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TrackingMetadata.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, Boolean.class, String.class, String.class, String.class, String.class, Double.class, Double.class, Boolean.class, Long.class, Boolean.class, Boolean.class, String.class, String.class, Map.class, Integer.TYPE, c.f33031c);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        TrackingMetadata newInstance = constructor.newInstance(str24, str23, str22, str21, str20, bool6, str19, str18, str17, str9, d10, d11, bool2, l10, bool3, bool4, str10, str11, map, Integer.valueOf(i11), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // sm.h
    public void toJson(@NotNull t writer, @Nullable TrackingMetadata value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("sdk");
        this.nullableStringAdapter.toJson(writer, (t) value_.getSdk());
        writer.n("sdk_version");
        this.nullableStringAdapter.toJson(writer, (t) value_.getSdkVersion());
        writer.n("app_version");
        this.nullableStringAdapter.toJson(writer, (t) value_.getAppVersion());
        writer.n("app_namespace");
        this.nullableStringAdapter.toJson(writer, (t) value_.getAppNamespace());
        writer.n(Payload.DEVICE_MODEL);
        this.nullableStringAdapter.toJson(writer, (t) value_.getDeviceModel());
        writer.n("is_simulator");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.isSimulator());
        writer.n("os_version");
        this.nullableStringAdapter.toJson(writer, (t) value_.getOsVersion());
        writer.n("connection_type");
        this.nullableStringAdapter.toJson(writer, (t) value_.getConnectionType());
        writer.n("cellular_technology");
        this.nullableStringAdapter.toJson(writer, (t) value_.getCellularTechnology());
        writer.n("thermal_state");
        this.nullableStringAdapter.toJson(writer, (t) value_.getThermalState());
        writer.n("system_available_memory_mb");
        this.nullableDoubleAdapter.toJson(writer, (t) value_.getSystemAvailableMemoryMb());
        writer.n("battery_level");
        this.nullableDoubleAdapter.toJson(writer, (t) value_.getBatteryLevel());
        writer.n("is_low_power_mode");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.isLowPowerMode());
        writer.n("app_memory_usage_mb");
        this.nullableLongAdapter.toJson(writer, (t) value_.getAppMemoryUsageMb());
        writer.n("is_charging");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.isCharging());
        writer.n("is_backgrounded");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.isBackgrounded());
        writer.n("locale");
        this.nullableStringAdapter.toJson(writer, (t) value_.getLocale());
        writer.n("timezone");
        this.nullableStringAdapter.toJson(writer, (t) value_.getTimezone());
        writer.n("feature_flags");
        this.nullableMapOfStringBooleanAdapter.toJson(writer, (t) value_.getFeatureFlags());
        writer.g();
    }
}
