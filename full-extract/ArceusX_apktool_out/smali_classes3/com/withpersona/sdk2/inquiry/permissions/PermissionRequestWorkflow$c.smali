.class public final Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->J(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;Lwm/k$a;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lot/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lju/p0;",
        "Lmt/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lju/p0;",
        "",
        "<anonymous>",
        "(Lju/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lot/f;
    c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$7"
    f = "PermissionRequestWorkflow.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lwm/k$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwm/k<",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;",
            "Ljava/lang/Object;",
            ">.a;"
        }
    .end annotation
.end field

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;


# direct methods
.method public constructor <init>(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwm/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;",
            "Lmt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;->u:Lwm/k$a;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;->v:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;->w:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lot/m;-><init>(ILmt/b;)V

    return-void
.end method

.method public static synthetic o(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;->q(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final q(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lpp/i0;

    move-result-object p1

    sget-object v1, Lpp/j1;->a:Lpp/j1;

    invoke-direct {v0, p1, v1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lpp/i0;Lpp/j1;)V

    invoke-static {p0, p2, v0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->E(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lwm/r$c;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lmt/b;)Lmt/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lmt/b<",
            "*>;)",
            "Lmt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;->u:Lwm/k$a;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;->v:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;->w:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;-><init>(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lmt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lju/p0;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;->invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lju/p0;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;->u:Lwm/k$a;

    invoke-virtual {p1}, Lwm/k$a;->d()Lwm/h;

    move-result-object p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;->v:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;->w:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    new-instance v2, Lpp/i1;

    invoke-direct {v2, v0, v1}, Lpp/i1;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    const/4 v1, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v1, v3}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lwm/h;->a(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
