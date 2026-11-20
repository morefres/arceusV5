package com.withpersona.sdk2.inquiry.tracking.network;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_InterceptorFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_KeyInflectionFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_MoshiFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_OkhttpClientFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_ResponseInterceptorFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_RetrofitFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_UseServerStylesFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkStateManager;
import com.withpersona.sdk2.inquiry.network.core.NetworkStateManager_Factory;
import com.withpersona.sdk2.inquiry.network.dto.NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.network.dto.NetworkInquiryModule_UserAgentFactory;
import dt.c;
import dt.g;
import dt.h;
import dt.i;
import dt.j;
import iv.y;
import java.util.Map;
import java.util.Set;
import lp.d;
import lp.e;
import lp.f;
import lp.g;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import sm.h;
import sm.w;
import wn.a0;
import wn.b;
import wn.e;
import wn.k;
import wn.r;
import wn.s;
import wn.z;

/* loaded from: classes3.dex */
public final class DaggerTrackingEventsServiceComponent {

    public static final class Builder {
        private e deviceModule;
        private NetworkCoreModule networkCoreModule;
        private TrackingEventsServiceModule trackingEventsServiceModule;

        public TrackingEventsServiceComponent build() {
            h.a(this.networkCoreModule, NetworkCoreModule.class);
            h.a(this.trackingEventsServiceModule, TrackingEventsServiceModule.class);
            if (this.deviceModule == null) {
                this.deviceModule = new e();
            }
            return new TrackingEventsServiceComponentImpl(this.networkCoreModule, this.trackingEventsServiceModule, this.deviceModule);
        }

        public Builder deviceModule(e eVar) {
            this.deviceModule = (e) h.b(eVar);
            return this;
        }

        public Builder networkCoreModule(NetworkCoreModule networkCoreModule) {
            this.networkCoreModule = (NetworkCoreModule) h.b(networkCoreModule);
            return this;
        }

        public Builder trackingEventsServiceModule(TrackingEventsServiceModule trackingEventsServiceModule) {
            this.trackingEventsServiceModule = (TrackingEventsServiceModule) h.b(trackingEventsServiceModule);
            return this;
        }

        private Builder() {
        }
    }

    public static final class TrackingEventsServiceComponentImpl implements TrackingEventsServiceComponent {
        i<k> appSetIdHelperProvider;
        i<b> deviceInfoProvider;
        i<e.a> factoryProvider;
        i<Interceptor> interceptorProvider;
        i<String> keyInflectionProvider;
        i<lp.b> loggerProvider;
        i<Map<String, String>> mapOfStringAndStringProvider;
        i<w> moshiProvider;
        i<NetworkStateManager> networkStateManagerProvider;
        i<OkHttpClient> okhttpClientProvider;
        i<Context> provideContextProvider;
        i<TrackingEventsServiceApi> provideTrackingEventsServiceApiProvider;
        i<r> realDeviceInfoProvider;
        i<z> realDeviceVendorIDProvider;
        i<Interceptor> responseInterceptorProvider;
        i<y> retrofitProvider;
        i<String> serverEndpointProvider;
        i<Set<Interceptor>> setOfInterceptorProvider;
        i<Set<JsonAdapterBinding<?>>> setOfJsonAdapterBindingOfProvider;
        i<Set<h.e>> setOfJsonAdapterFactoryProvider;
        i<Set<Object>> setOfObjectProvider;
        f subsystemLoggerProvider;
        private final TrackingEventsServiceComponentImpl trackingEventsServiceComponentImpl = this;
        i<TrackingEventsService> trackingEventsServiceProvider;
        i<String> useServerStylesProvider;

        public TrackingEventsServiceComponentImpl(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, wn.e eVar) {
            initialize(networkCoreModule, trackingEventsServiceModule, eVar);
        }

        private void initialize(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, wn.e eVar) {
            this.serverEndpointProvider = TrackingEventsServiceModule_ServerEndpointFactory.create(trackingEventsServiceModule);
            i<NetworkStateManager> c10 = c.c(NetworkStateManager_Factory.create());
            this.networkStateManagerProvider = c10;
            this.responseInterceptorProvider = NetworkCoreModule_ResponseInterceptorFactory.create(networkCoreModule, c10);
            this.setOfObjectProvider = setOfObjectBuilder(networkCoreModule, trackingEventsServiceModule, eVar);
            this.setOfJsonAdapterBindingOfProvider = setOfJsonAdapterBindingOfBuilder(networkCoreModule, trackingEventsServiceModule, eVar);
            j<h.e> ofJsonAdapterFactoryBuilder = setOfJsonAdapterFactoryBuilder(networkCoreModule, trackingEventsServiceModule, eVar);
            this.setOfJsonAdapterFactoryProvider = ofJsonAdapterFactoryBuilder;
            i<w> c11 = c.c(NetworkCoreModule_MoshiFactory.create(networkCoreModule, this.setOfObjectProvider, this.setOfJsonAdapterBindingOfProvider, ofJsonAdapterFactoryBuilder));
            this.moshiProvider = c11;
            this.interceptorProvider = NetworkCoreModule_InterceptorFactory.create(networkCoreModule, c11);
            this.setOfInterceptorProvider = setOfInterceptorBuilder(networkCoreModule, trackingEventsServiceModule, eVar);
            this.keyInflectionProvider = NetworkCoreModule_KeyInflectionFactory.create(networkCoreModule);
            this.useServerStylesProvider = NetworkCoreModule_UseServerStylesFactory.create(networkCoreModule);
            this.mapOfStringAndStringProvider = mapOfStringAndStringBuilder(networkCoreModule, trackingEventsServiceModule, eVar);
            TrackingEventsServiceModule_ProvideContextFactory create = TrackingEventsServiceModule_ProvideContextFactory.create(trackingEventsServiceModule);
            this.provideContextProvider = create;
            a0 a10 = a0.a(create);
            this.realDeviceVendorIDProvider = a10;
            this.appSetIdHelperProvider = c.c(wn.f.b(eVar, a10));
            s a11 = s.a(this.provideContextProvider);
            this.realDeviceInfoProvider = a11;
            this.deviceInfoProvider = c.c(wn.h.a(eVar, a11));
            d a12 = d.a(this.provideContextProvider);
            this.loggerProvider = a12;
            f a13 = f.a(a12);
            this.subsystemLoggerProvider = a13;
            i<e.a> a14 = g.a(a13);
            this.factoryProvider = a14;
            NetworkCoreModule_OkhttpClientFactory create2 = NetworkCoreModule_OkhttpClientFactory.create(networkCoreModule, this.setOfInterceptorProvider, this.mapOfStringAndStringProvider, this.provideContextProvider, this.appSetIdHelperProvider, this.deviceInfoProvider, a14, this.networkStateManagerProvider);
            this.okhttpClientProvider = create2;
            i<y> c12 = c.c(NetworkCoreModule_RetrofitFactory.create(networkCoreModule, this.serverEndpointProvider, create2, this.moshiProvider));
            this.retrofitProvider = c12;
            i<TrackingEventsServiceApi> c13 = c.c(TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory.create(trackingEventsServiceModule, c12));
            this.provideTrackingEventsServiceApiProvider = c13;
            this.trackingEventsServiceProvider = c.c(TrackingEventsService_Factory.create(c13));
        }

        public dt.g<String, String> mapOfStringAndStringBuilder(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, wn.e eVar) {
            g.b b = dt.g.b(3);
            b.c("User-Agent", NetworkInquiryModule_UserAgentFactory.create());
            b.c("Key-Inflection", this.keyInflectionProvider);
            b.c("Persona-Use-Mobile-Server-Styles", this.useServerStylesProvider);
            return b.b();
        }

        public j<Interceptor> setOfInterceptorBuilder(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, wn.e eVar) {
            j.b a10 = j.a(2, 0);
            a10.b(this.responseInterceptorProvider);
            a10.b(this.interceptorProvider);
            return a10.c();
        }

        public j<JsonAdapterBinding<?>> setOfJsonAdapterBindingOfBuilder(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, wn.e eVar) {
            j.b a10 = j.a(0, 1);
            a10.a(TrackingEventsServiceModule_ProvideMoshiJsonAdapterBindingFactory.create());
            return a10.c();
        }

        public j<h.e> setOfJsonAdapterFactoryBuilder(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, wn.e eVar) {
            j.b a10 = j.a(0, 2);
            a10.a(NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory.create());
            a10.a(NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory.create());
            return a10.c();
        }

        public j<Object> setOfObjectBuilder(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, wn.e eVar) {
            j.b a10 = j.a(0, 1);
            a10.a(TrackingEventsServiceModule_ProvideMoshiJsonAdapterFactory.create());
            return a10.c();
        }

        @Override // com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsServiceComponent
        public TrackingEventsService trackingEventsService() {
            return this.trackingEventsServiceProvider.get();
        }
    }

    private DaggerTrackingEventsServiceComponent() {
    }

    public static Builder builder() {
        return new Builder();
    }
}
