.class final Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TrackingEventsServiceComponentImpl"
.end annotation


# instance fields
.field appSetIdHelperProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lwn/k;",
            ">;"
        }
    .end annotation
.end field

.field deviceInfoProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lwn/b;",
            ">;"
        }
    .end annotation
.end field

.field factoryProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Llp/e$a;",
            ">;"
        }
    .end annotation
.end field

.field interceptorProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lokhttp3/Interceptor;",
            ">;"
        }
    .end annotation
.end field

.field keyInflectionProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field loggerProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Llp/b;",
            ">;"
        }
    .end annotation
.end field

.field mapOfStringAndStringProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field moshiProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lsm/w;",
            ">;"
        }
    .end annotation
.end field

.field networkStateManagerProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;",
            ">;"
        }
    .end annotation
.end field

.field okhttpClientProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lokhttp3/OkHttpClient;",
            ">;"
        }
    .end annotation
.end field

.field provideContextProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field provideTrackingEventsServiceApiProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;",
            ">;"
        }
    .end annotation
.end field

.field realDeviceInfoProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lwn/r;",
            ">;"
        }
    .end annotation
.end field

.field realDeviceVendorIDProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lwn/z;",
            ">;"
        }
    .end annotation
.end field

.field responseInterceptorProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lokhttp3/Interceptor;",
            ">;"
        }
    .end annotation
.end field

.field retrofitProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Liv/y;",
            ">;"
        }
    .end annotation
.end field

.field serverEndpointProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field setOfInterceptorProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ljava/util/Set<",
            "Lokhttp3/Interceptor;",
            ">;>;"
        }
    .end annotation
.end field

.field setOfJsonAdapterBindingOfProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ljava/util/Set<",
            "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding<",
            "*>;>;>;"
        }
    .end annotation
.end field

.field setOfJsonAdapterFactoryProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ljava/util/Set<",
            "Lsm/h$e;",
            ">;>;"
        }
    .end annotation
.end field

.field setOfObjectProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field subsystemLoggerProvider:Llp/f;

.field private final trackingEventsServiceComponentImpl:Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;

.field trackingEventsServiceProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;",
            ">;"
        }
    .end annotation
.end field

.field useServerStylesProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lwn/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->trackingEventsServiceComponentImpl:Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;

    invoke-direct {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->initialize(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lwn/e;)V

    return-void
.end method

.method private initialize(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lwn/e;)V
    .locals 8

    invoke-static {p2}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ServerEndpointFactory;->create(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ServerEndpointFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->serverEndpointProvider:Ldt/i;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager_Factory;->create()Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager_Factory;

    move-result-object v0

    invoke-static {v0}, Ldt/c;->c(Ldt/i;)Ldt/i;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->networkStateManagerProvider:Ldt/i;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_ResponseInterceptorFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Ldt/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_ResponseInterceptorFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->responseInterceptorProvider:Ldt/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfObjectBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lwn/e;)Ldt/j;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfObjectProvider:Ldt/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfJsonAdapterBindingOfBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lwn/e;)Ldt/j;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfJsonAdapterBindingOfProvider:Ldt/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfJsonAdapterFactoryBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lwn/e;)Ldt/j;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfJsonAdapterFactoryProvider:Ldt/i;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfObjectProvider:Ldt/i;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfJsonAdapterBindingOfProvider:Ldt/i;

    invoke-static {p1, v1, v2, v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Ldt/i;Ldt/i;Ldt/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;

    move-result-object v0

    invoke-static {v0}, Ldt/c;->c(Ldt/i;)Ldt/i;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->moshiProvider:Ldt/i;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_InterceptorFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Ldt/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_InterceptorFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->interceptorProvider:Ldt/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfInterceptorBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lwn/e;)Ldt/j;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfInterceptorProvider:Ldt/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_KeyInflectionFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_KeyInflectionFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->keyInflectionProvider:Ldt/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_UseServerStylesFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_UseServerStylesFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->useServerStylesProvider:Ldt/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->mapOfStringAndStringBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lwn/e;)Ldt/g;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->mapOfStringAndStringProvider:Ldt/i;

    invoke-static {p2}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideContextFactory;->create(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideContextFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->provideContextProvider:Ldt/i;

    invoke-static {v0}, Lwn/a0;->a(Ldt/i;)Lwn/a0;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->realDeviceVendorIDProvider:Ldt/i;

    invoke-static {p3, v0}, Lwn/f;->b(Lwn/e;Ldt/i;)Lwn/f;

    move-result-object v0

    invoke-static {v0}, Ldt/c;->c(Ldt/i;)Ldt/i;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->appSetIdHelperProvider:Ldt/i;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->provideContextProvider:Ldt/i;

    invoke-static {v0}, Lwn/s;->a(Ldt/i;)Lwn/s;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->realDeviceInfoProvider:Ldt/i;

    invoke-static {p3, v0}, Lwn/h;->a(Lwn/e;Ldt/i;)Lwn/h;

    move-result-object p3

    invoke-static {p3}, Ldt/c;->c(Ldt/i;)Ldt/i;

    move-result-object p3

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->deviceInfoProvider:Ldt/i;

    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->provideContextProvider:Ldt/i;

    invoke-static {p3}, Llp/d;->a(Ldt/i;)Llp/d;

    move-result-object p3

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->loggerProvider:Ldt/i;

    invoke-static {p3}, Llp/f;->a(Ldt/i;)Llp/f;

    move-result-object p3

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->subsystemLoggerProvider:Llp/f;

    invoke-static {p3}, Llp/g;->a(Llp/f;)Ldt/i;

    move-result-object v6

    iput-object v6, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->factoryProvider:Ldt/i;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfInterceptorProvider:Ldt/i;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->mapOfStringAndStringProvider:Ldt/i;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->provideContextProvider:Ldt/i;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->appSetIdHelperProvider:Ldt/i;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->deviceInfoProvider:Ldt/i;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->networkStateManagerProvider:Ldt/i;

    move-object v0, p1

    invoke-static/range {v0 .. v7}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->okhttpClientProvider:Ldt/i;

    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->serverEndpointProvider:Ldt/i;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->moshiProvider:Ldt/i;

    invoke-static {v0, p3, p1, v1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Ldt/i;Ldt/i;Ldt/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;

    move-result-object p1

    invoke-static {p1}, Ldt/c;->c(Ldt/i;)Ldt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->retrofitProvider:Ldt/i;

    invoke-static {p2, p1}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory;->create(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Ldt/i;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory;

    move-result-object p1

    invoke-static {p1}, Ldt/c;->c(Ldt/i;)Ldt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->provideTrackingEventsServiceApiProvider:Ldt/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService_Factory;->create(Ldt/i;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService_Factory;

    move-result-object p1

    invoke-static {p1}, Ldt/c;->c(Ldt/i;)Ldt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->trackingEventsServiceProvider:Ldt/i;

    return-void
.end method


# virtual methods
.method public mapOfStringAndStringBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lwn/e;)Ldt/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;",
            "Lwn/e;",
            ")",
            "Ldt/g<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x3

    invoke-static {p1}, Ldt/g;->b(I)Ldt/g$b;

    move-result-object p1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_UserAgentFactory;->create()Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_UserAgentFactory;

    move-result-object p2

    const-string p3, "User-Agent"

    invoke-virtual {p1, p3, p2}, Ldt/g$b;->c(Ljava/lang/Object;Ldt/i;)Ldt/g$b;

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->keyInflectionProvider:Ldt/i;

    const-string p3, "Key-Inflection"

    invoke-virtual {p1, p3, p2}, Ldt/g$b;->c(Ljava/lang/Object;Ldt/i;)Ldt/g$b;

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->useServerStylesProvider:Ldt/i;

    const-string p3, "Persona-Use-Mobile-Server-Styles"

    invoke-virtual {p1, p3, p2}, Ldt/g$b;->c(Ljava/lang/Object;Ldt/i;)Ldt/g$b;

    invoke-virtual {p1}, Ldt/g$b;->b()Ldt/g;

    move-result-object p1

    return-object p1
.end method

.method public setOfInterceptorBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lwn/e;)Ldt/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;",
            "Lwn/e;",
            ")",
            "Ldt/j<",
            "Lokhttp3/Interceptor;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x2

    const/4 p2, 0x0

    invoke-static {p1, p2}, Ldt/j;->a(II)Ldt/j$b;

    move-result-object p1

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->responseInterceptorProvider:Ldt/i;

    invoke-virtual {p1, p2}, Ldt/j$b;->b(Ldt/i;)Ldt/j$b;

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->interceptorProvider:Ldt/i;

    invoke-virtual {p1, p2}, Ldt/j$b;->b(Ldt/i;)Ldt/j$b;

    invoke-virtual {p1}, Ldt/j$b;->c()Ldt/j;

    move-result-object p1

    return-object p1
.end method

.method public setOfJsonAdapterBindingOfBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lwn/e;)Ldt/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;",
            "Lwn/e;",
            ")",
            "Ldt/j<",
            "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding<",
            "*>;>;"
        }
    .end annotation

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {p1, p2}, Ldt/j;->a(II)Ldt/j$b;

    move-result-object p1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideMoshiJsonAdapterBindingFactory;->create()Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideMoshiJsonAdapterBindingFactory;

    move-result-object p2

    invoke-virtual {p1, p2}, Ldt/j$b;->a(Ldt/i;)Ldt/j$b;

    invoke-virtual {p1}, Ldt/j$b;->c()Ldt/j;

    move-result-object p1

    return-object p1
.end method

.method public setOfJsonAdapterFactoryBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lwn/e;)Ldt/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;",
            "Lwn/e;",
            ")",
            "Ldt/j<",
            "Lsm/h$e;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    const/4 p2, 0x2

    invoke-static {p1, p2}, Ldt/j;->a(II)Ldt/j$b;

    move-result-object p1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory;->create()Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory;

    move-result-object p2

    invoke-virtual {p1, p2}, Ldt/j$b;->a(Ldt/i;)Ldt/j$b;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory;->create()Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory;

    move-result-object p2

    invoke-virtual {p1, p2}, Ldt/j$b;->a(Ldt/i;)Ldt/j$b;

    invoke-virtual {p1}, Ldt/j$b;->c()Ldt/j;

    move-result-object p1

    return-object p1
.end method

.method public setOfObjectBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lwn/e;)Ldt/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;",
            "Lwn/e;",
            ")",
            "Ldt/j<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {p1, p2}, Ldt/j;->a(II)Ldt/j$b;

    move-result-object p1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideMoshiJsonAdapterFactory;->create()Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideMoshiJsonAdapterFactory;

    move-result-object p2

    invoke-virtual {p1, p2}, Ldt/j$b;->a(Ldt/i;)Ldt/j$b;

    invoke-virtual {p1}, Ldt/j$b;->c()Ldt/j;

    move-result-object p1

    return-object p1
.end method

.method public trackingEventsService()Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->trackingEventsServiceProvider:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;

    return-object v0
.end method
