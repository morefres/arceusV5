.class public final Lpo/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lpo/j1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/camera/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lfn/c$a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lsq/a;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/camera/e$a;",
            ">;",
            "Ldt/i<",
            "Lfn/c$a;",
            ">;",
            "Ldt/i<",
            "Lsq/a;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpo/k1;->a:Ldt/i;

    iput-object p2, p0, Lpo/k1;->b:Ldt/i;

    iput-object p3, p0, Lpo/k1;->c:Ldt/i;

    iput-object p4, p0, Lpo/k1;->d:Ldt/i;

    iput-object p5, p0, Lpo/k1;->e:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lpo/k1;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/camera/e$a;",
            ">;",
            "Ldt/i<",
            "Lfn/c$a;",
            ">;",
            "Ldt/i<",
            "Lsq/a;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)",
            "Lpo/k1;"
        }
    .end annotation

    new-instance v0, Lpo/k1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lpo/k1;-><init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lfn/c$a;Lsq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lpo/j1;
    .locals 6

    new-instance v0, Lpo/j1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lpo/j1;-><init>(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lfn/c$a;Lsq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    return-object v0
.end method


# virtual methods
.method public b()Lpo/j1;
    .locals 5

    iget-object v0, p0, Lpo/k1;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lpo/k1;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/camera/e$a;

    iget-object v2, p0, Lpo/k1;->c:Ldt/i;

    invoke-interface {v2}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfn/c$a;

    iget-object v3, p0, Lpo/k1;->d:Ldt/i;

    invoke-interface {v3}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsq/a;

    iget-object v4, p0, Lpo/k1;->e:Ldt/i;

    invoke-interface {v4}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {v0, v1, v2, v3, v4}, Lpo/k1;->c(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lfn/c$a;Lsq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lpo/j1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lpo/k1;->b()Lpo/j1;

    move-result-object v0

    return-object v0
.end method
