.class public final synthetic Lpp/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lwm/k$a;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;


# direct methods
.method public synthetic constructor <init>(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpp/u0;->a:Lwm/k$a;

    iput-object p2, p0, Lpp/u0;->b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpp/u0;->a:Lwm/k$a;

    iget-object v1, p0, Lpp/u0;->b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->A(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
