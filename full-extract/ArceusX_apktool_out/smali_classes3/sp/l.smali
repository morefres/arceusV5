.class public final Lsp/l;
.super Ljava/lang/Object;
.source "SourceFile"


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
            "Lcom/withpersona/sdk2/inquiry/permissions/d$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/a$a;",
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

.field public final e:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lju/p0;",
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
            "Lcom/withpersona/sdk2/inquiry/permissions/d$a;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/a$a;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;",
            "Ldt/i<",
            "Lju/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsp/l;->a:Ldt/i;

    iput-object p2, p0, Lsp/l;->b:Ldt/i;

    iput-object p3, p0, Lsp/l;->c:Ldt/i;

    iput-object p4, p0, Lsp/l;->d:Ldt/i;

    iput-object p5, p0, Lsp/l;->e:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lsp/l;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/d$a;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/a$a;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;",
            "Ldt/i<",
            "Lju/p0;",
            ">;)",
            "Lsp/l;"
        }
    .end annotation

    new-instance v0, Lsp/l;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lsp/l;-><init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Landroidx/lifecycle/l0;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/d$a;Lcom/withpersona/sdk2/inquiry/permissions/a$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lju/p0;)Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;
    .locals 8

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Landroidx/lifecycle/l0;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/d$a;Lcom/withpersona/sdk2/inquiry/permissions/a$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lju/p0;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;
    .locals 8

    iget-object v0, p0, Lsp/l;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/content/Context;

    iget-object v0, p0, Lsp/l;->b:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/withpersona/sdk2/inquiry/permissions/d$a;

    iget-object v0, p0, Lsp/l;->c:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/withpersona/sdk2/inquiry/permissions/a$a;

    iget-object v0, p0, Lsp/l;->d:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    iget-object v0, p0, Lsp/l;->e:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lju/p0;

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v1 .. v7}, Lsp/l;->c(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Landroidx/lifecycle/l0;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/d$a;Lcom/withpersona/sdk2/inquiry/permissions/a$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lju/p0;)Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    move-result-object p1

    return-object p1
.end method
