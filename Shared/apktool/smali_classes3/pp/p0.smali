.class public final synthetic Lpp/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lwm/k$a;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;


# direct methods
.method public synthetic constructor <init>(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpp/p0;->a:Lwm/k$a;

    iput-object p2, p0, Lpp/p0;->b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpp/p0;->a:Lwm/k$a;

    iget-object v1, p0, Lpp/p0;->b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    check-cast p1, Lwm/r$c;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->q(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
