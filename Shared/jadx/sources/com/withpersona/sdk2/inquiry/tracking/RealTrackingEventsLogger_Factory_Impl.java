package com.withpersona.sdk2.inquiry.tracking;

import com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger;
import dt.e;
import dt.i;

/* loaded from: classes3.dex */
public final class RealTrackingEventsLogger_Factory_Impl implements RealTrackingEventsLogger.Factory {
    private final C0704RealTrackingEventsLogger_Factory delegateFactory;

    public RealTrackingEventsLogger_Factory_Impl(C0704RealTrackingEventsLogger_Factory c0704RealTrackingEventsLogger_Factory) {
        this.delegateFactory = c0704RealTrackingEventsLogger_Factory;
    }

    public static i<RealTrackingEventsLogger.Factory> createFactoryProvider(C0704RealTrackingEventsLogger_Factory c0704RealTrackingEventsLogger_Factory) {
        return e.a(new RealTrackingEventsLogger_Factory_Impl(c0704RealTrackingEventsLogger_Factory));
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger.Factory
    public RealTrackingEventsLogger create(String str) {
        return this.delegateFactory.get(str);
    }

    public static ft.a<RealTrackingEventsLogger.Factory> create(C0704RealTrackingEventsLogger_Factory c0704RealTrackingEventsLogger_Factory) {
        return e.a(new RealTrackingEventsLogger_Factory_Impl(c0704RealTrackingEventsLogger_Factory));
    }
}
