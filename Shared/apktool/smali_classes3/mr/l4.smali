.class public final synthetic Lmr/l4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;

.field public final synthetic b:Lwm/k$a;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

.field public final synthetic d:Z

.field public final synthetic e:Lcom/withpersona/sdk2/inquiry/ui/UiState;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;ZLcom/withpersona/sdk2/inquiry/ui/UiState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmr/l4;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;

    iput-object p2, p0, Lmr/l4;->b:Lwm/k$a;

    iput-object p3, p0, Lmr/l4;->c:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iput-boolean p4, p0, Lmr/l4;->d:Z

    iput-object p5, p0, Lmr/l4;->e:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lmr/l4;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;

    iget-object v1, p0, Lmr/l4;->b:Lwm/k$a;

    iget-object v2, p0, Lmr/l4;->c:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iget-boolean v3, p0, Lmr/l4;->d:Z

    iget-object v4, p0, Lmr/l4;->e:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    move-object v5, p1

    check-cast v5, Lwm/r$c;

    invoke-static/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;->i(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;ZLcom/withpersona/sdk2/inquiry/ui/UiState;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
