.class public final Lxp/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lxp/p0;",
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
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Leo/e;",
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
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;",
            "Ldt/i<",
            "Leo/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxp/q0;->a:Ldt/i;

    iput-object p2, p0, Lxp/q0;->b:Ldt/i;

    iput-object p3, p0, Lxp/q0;->c:Ldt/i;

    iput-object p4, p0, Lxp/q0;->d:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lxp/q0;
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
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;",
            "Ldt/i<",
            "Leo/e;",
            ">;)",
            "Lxp/q0;"
        }
    .end annotation

    new-instance v0, Lxp/q0;

    invoke-direct {v0, p0, p1, p2, p3}, Lxp/q0;-><init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lcom/withpersona/sdk2/camera/b;Lat/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Leo/e;)Lxp/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/camera/b;",
            "Lat/a<",
            "Ldn/n0;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            "Leo/e;",
            ")",
            "Lxp/p0;"
        }
    .end annotation

    new-instance v0, Lxp/p0;

    invoke-direct {v0, p0, p1, p2, p3}, Lxp/p0;-><init>(Lcom/withpersona/sdk2/camera/b;Lat/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Leo/e;)V

    return-object v0
.end method


# virtual methods
.method public b()Lxp/p0;
    .locals 4

    iget-object v0, p0, Lxp/q0;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/camera/b;

    iget-object v1, p0, Lxp/q0;->b:Ldt/i;

    invoke-static {v1}, Ldt/c;->b(Ldt/i;)Lat/a;

    move-result-object v1

    iget-object v2, p0, Lxp/q0;->c:Ldt/i;

    invoke-interface {v2}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    iget-object v3, p0, Lxp/q0;->d:Ldt/i;

    invoke-interface {v3}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leo/e;

    invoke-static {v0, v1, v2, v3}, Lxp/q0;->c(Lcom/withpersona/sdk2/camera/b;Lat/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Leo/e;)Lxp/p0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxp/q0;->b()Lxp/p0;

    move-result-object v0

    return-object v0
.end method
