.class public final Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule_TrackingEventsLoggerFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        ">;"
    }
.end annotation


# instance fields
.field private final factoryProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;


# direct methods
.method private constructor <init>(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule_TrackingEventsLoggerFactory;->module:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule_TrackingEventsLoggerFactory;->factoryProvider:Ldt/i;

    return-void
.end method

.method public static create(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;Ldt/i;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule_TrackingEventsLoggerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule_TrackingEventsLoggerFactory;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule_TrackingEventsLoggerFactory;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule_TrackingEventsLoggerFactory;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;Ldt/i;)V

    return-object v0
.end method

.method public static trackingEventsLogger(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;->trackingEventsLogger(Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule_TrackingEventsLoggerFactory;->module:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule_TrackingEventsLoggerFactory;->factoryProvider:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule_TrackingEventsLoggerFactory;->trackingEventsLogger(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule_TrackingEventsLoggerFactory;->get()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v0

    return-object v0
.end method
