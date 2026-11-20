.class public final synthetic Lgo/c2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lwm/k$a;


# direct methods
.method public synthetic constructor <init>(Lwm/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgo/c2;->a:Lwm/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lgo/c2;->a:Lwm/k$a;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->p(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;)Lwm/r;

    move-result-object p1

    return-object p1
.end method
