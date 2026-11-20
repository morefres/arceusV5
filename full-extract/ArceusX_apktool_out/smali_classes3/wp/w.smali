.class public final Lwp/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lcom/withpersona/sdk2/inquiry/selfie/g;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lnq/c;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lnq/c;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwp/w;->a:Ldt/i;

    iput-object p2, p0, Lwp/w;->b:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;)Lwp/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lnq/c;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)",
            "Lwp/w;"
        }
    .end annotation

    new-instance v0, Lwp/w;

    invoke-direct {v0, p0, p1}, Lwp/w;-><init>(Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lnq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lcom/withpersona/sdk2/inquiry/selfie/g;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/g;-><init>(Lnq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/selfie/g;
    .locals 2

    iget-object v0, p0, Lwp/w;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnq/c;

    iget-object v1, p0, Lwp/w;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {v0, v1}, Lwp/w;->c(Lnq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lcom/withpersona/sdk2/inquiry/selfie/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwp/w;->b()Lcom/withpersona/sdk2/inquiry/selfie/g;

    move-result-object v0

    return-object v0
.end method
