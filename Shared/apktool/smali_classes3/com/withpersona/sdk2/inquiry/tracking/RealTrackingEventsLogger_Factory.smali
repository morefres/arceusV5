.class public final Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final cacheProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;",
            ">;"
        }
    .end annotation
.end field

.field private final contextProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final coroutineScopeProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lju/p0;",
            ">;"
        }
    .end annotation
.end field

.field private final featureFlagManagerProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Leo/e;",
            ">;"
        }
    .end annotation
.end field

.field private final metadataProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final moshiProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lsm/w;",
            ">;"
        }
    .end annotation
.end field

.field private final networkStateManagerProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;",
            ">;"
        }
    .end annotation
.end field

.field private final sdkFilesManagerProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Loq/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;",
            ">;",
            "Ldt/i<",
            "Lsm/w;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;",
            ">;",
            "Ldt/i<",
            "Loq/c;",
            ">;",
            "Ldt/i<",
            "Leo/e;",
            ">;",
            "Ldt/i<",
            "Lju/p0;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->contextProvider:Ldt/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->cacheProvider:Ldt/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->moshiProvider:Ldt/i;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->metadataProvider:Ldt/i;

    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->sdkFilesManagerProvider:Ldt/i;

    iput-object p6, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->featureFlagManagerProvider:Ldt/i;

    iput-object p7, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->coroutineScopeProvider:Ldt/i;

    iput-object p8, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->networkStateManagerProvider:Ldt/i;

    return-void
.end method

.method public static create(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;",
            ">;",
            "Ldt/i<",
            "Lsm/w;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;",
            ">;",
            "Ldt/i<",
            "Loq/c;",
            ">;",
            "Ldt/i<",
            "Leo/e;",
            ">;",
            "Ldt/i<",
            "Lju/p0;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;-><init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static newInstance(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lsm/w;Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;Loq/c;Leo/e;Ljava/lang/String;Lju/p0;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;
    .locals 10

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;-><init>(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lsm/w;Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;Loq/c;Leo/e;Ljava/lang/String;Lju/p0;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)V

    return-object v0
.end method


# virtual methods
.method public get(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;
    .locals 10

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->contextProvider:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->cacheProvider:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->moshiProvider:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lsm/w;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->metadataProvider:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->sdkFilesManagerProvider:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Loq/c;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->featureFlagManagerProvider:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Leo/e;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->coroutineScopeProvider:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lju/p0;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->networkStateManagerProvider:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;

    move-object v7, p1

    invoke-static/range {v1 .. v9}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->newInstance(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lsm/w;Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;Loq/c;Leo/e;Ljava/lang/String;Lju/p0;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;

    move-result-object p1

    return-object p1
.end method
