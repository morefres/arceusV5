.class public final Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;",
        ">;"
    }
.end annotation


# instance fields
.field private final contextProvider:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider_Factory;->contextProvider:Ldt/i;

    return-void
.end method

.method public static create(Ldt/i;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider_Factory;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider_Factory;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static newInstance(Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider_Factory;->contextProvider:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider_Factory;->newInstance(Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider_Factory;->get()Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    move-result-object v0

    return-object v0
.end method
