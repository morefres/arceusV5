.class public final Lxp/k0$f;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxp/k0;->H(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Ltq/a;)V
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
    c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2"
    f = "CameraScreenRunner.kt"
    l = {
        0xc0,
        0xc2
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ldn/g;

.field public final synthetic v:Lxp/k0;

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;

.field public final synthetic x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;


# direct methods
.method public constructor <init>(Ldn/g;Lxp/k0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldn/g;",
            "Lxp/k0;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;",
            "Lmt/b<",
            "-",
            "Lxp/k0$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxp/k0$f;->u:Ldn/g;

    iput-object p2, p0, Lxp/k0$f;->v:Lxp/k0;

    iput-object p3, p0, Lxp/k0$f;->w:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;

    iput-object p4, p0, Lxp/k0$f;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lot/m;-><init>(ILmt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lmt/b;)Lmt/b;
    .locals 6
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

    new-instance v0, Lxp/k0$f;

    iget-object v1, p0, Lxp/k0$f;->u:Ldn/g;

    iget-object v2, p0, Lxp/k0$f;->v:Lxp/k0;

    iget-object v3, p0, Lxp/k0$f;->w:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;

    iget-object v4, p0, Lxp/k0$f;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lxp/k0$f;-><init>(Ldn/g;Lxp/k0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lmt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lju/p0;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lxp/k0$f;->invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lxp/k0$f;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lxp/k0$f;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lxp/k0$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lxp/k0$f;->t:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lxp/k0$f;->u:Ldn/g;

    invoke-interface {p1}, Ldn/g;->b()Lmu/p0;

    move-result-object p1

    new-instance v1, Lxp/k0$f$a;

    const/4 v4, 0x0

    invoke-direct {v1, v4}, Lxp/k0$f$a;-><init>(Lmt/b;)V

    invoke-static {p1, v1}, Lmu/j;->N(Lmu/h;Lkotlin/jvm/functions/Function2;)Lmu/h;

    move-result-object p1

    iput v3, p0, Lxp/k0$f;->t:I

    invoke-static {p1, p0}, Lmu/j;->i(Lmu/h;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    invoke-static {}, Lju/g1;->c()Lju/n2;

    move-result-object p1

    new-instance v3, Lxp/k0$f$b;

    iget-object v4, p0, Lxp/k0$f;->u:Ldn/g;

    iget-object v5, p0, Lxp/k0$f;->v:Lxp/k0;

    iget-object v6, p0, Lxp/k0$f;->w:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;

    iget-object v7, p0, Lxp/k0$f;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Lxp/k0$f$b;-><init>(Ldn/g;Lxp/k0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lmt/b;)V

    iput v2, p0, Lxp/k0$f;->t:I

    invoke-static {p1, v3, p0}, Lju/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
