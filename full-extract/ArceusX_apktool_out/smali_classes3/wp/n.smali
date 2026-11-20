.class public final Lwp/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lcom/withpersona/sdk2/inquiry/selfie/d;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/camera/b;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ldn/n0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lfn/i0;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/camera/b;",
            ">;",
            "Ldt/i<",
            "Ldn/n0;",
            ">;",
            "Ldt/i<",
            "Lfn/i0;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwp/n;->a:Ldt/i;

    iput-object p2, p0, Lwp/n;->b:Ldt/i;

    iput-object p3, p0, Lwp/n;->c:Ldt/i;

    iput-object p4, p0, Lwp/n;->d:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lwp/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/camera/b;",
            ">;",
            "Ldt/i<",
            "Ldn/n0;",
            ">;",
            "Ldt/i<",
            "Lfn/i0;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)",
            "Lwp/n;"
        }
    .end annotation

    new-instance v0, Lwp/n;

    invoke-direct {v0, p0, p1, p2, p3}, Lwp/n;-><init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lcom/withpersona/sdk2/camera/b;Lat/a;Lfn/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lcom/withpersona/sdk2/inquiry/selfie/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/camera/b;",
            "Lat/a<",
            "Ldn/n0;",
            ">;",
            "Lfn/i0;",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/selfie/d;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/d;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/d;-><init>(Lcom/withpersona/sdk2/camera/b;Lat/a;Lfn/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/selfie/d;
    .locals 4

    iget-object v0, p0, Lwp/n;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/camera/b;

    iget-object v1, p0, Lwp/n;->b:Ldt/i;

    invoke-static {v1}, Ldt/c;->b(Ldt/i;)Lat/a;

    move-result-object v1

    iget-object v2, p0, Lwp/n;->c:Ldt/i;

    invoke-interface {v2}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfn/i0;

    iget-object v3, p0, Lwp/n;->d:Ldt/i;

    invoke-interface {v3}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {v0, v1, v2, v3}, Lwp/n;->c(Lcom/withpersona/sdk2/camera/b;Lat/a;Lfn/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lcom/withpersona/sdk2/inquiry/selfie/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwp/n;->b()Lcom/withpersona/sdk2/inquiry/selfie/d;

    move-result-object v0

    return-object v0
.end method
