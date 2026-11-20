.class public final Ldq/k2$p;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldq/k2;->f3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lot/m;",
        "Lkotlin/jvm/functions/Function1<",
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
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lot/f;
    c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$runManualCaptureEnabledChecker$1"
    f = "SelfieStepStateManager.kt"
    l = {
        0x8a8
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lkotlin/jvm/internal/y;

.field public final synthetic v:Ldq/k2;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/y;Ldq/k2;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/y;",
            "Ldq/k2;",
            "Lmt/b<",
            "-",
            "Ldq/k2$p;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldq/k2$p;->u:Lkotlin/jvm/internal/y;

    iput-object p2, p0, Ldq/k2$p;->v:Ldq/k2;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lot/m;-><init>(ILmt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lmt/b;)Lmt/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmt/b<",
            "*>;)",
            "Lmt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Ldq/k2$p;

    iget-object v1, p0, Ldq/k2$p;->u:Lkotlin/jvm/internal/y;

    iget-object v2, p0, Ldq/k2$p;->v:Ldq/k2;

    invoke-direct {v0, v1, v2, p1}, Ldq/k2$p;-><init>(Lkotlin/jvm/internal/y;Ldq/k2;Lmt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmt/b;

    invoke-virtual {p0, p1}, Ldq/k2$p;->o(Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ldq/k2$p;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    iget-object p1, p0, Ldq/k2$p;->u:Lkotlin/jvm/internal/y;

    iget-boolean p1, p1, Lkotlin/jvm/internal/y;->a:Z

    if-eqz p1, :cond_4

    iput v2, p0, Ldq/k2$p;->t:I

    const-wide/16 v3, 0x3e8

    invoke-static {v3, v4, p0}, Lju/z0;->b(JLmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    iget-object p1, p0, Ldq/k2$p;->v:Ldq/k2;

    invoke-virtual {p1}, Ltr/c;->d()Ltr/f;

    move-result-object p1

    invoke-virtual {p1}, Ltr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    instance-of v1, p1, Lcom/withpersona/sdk2/inquiry/selfie/b;

    if-eqz v1, :cond_2

    move-object v1, p1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/selfie/b;

    invoke-interface {v1}, Lcom/withpersona/sdk2/inquiry/selfie/b;->o()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ldq/k2$p;->v:Ldq/k2;

    invoke-virtual {v1}, Ltr/c;->d()Ltr/f;

    move-result-object v1

    invoke-virtual {v1, p1}, Ltr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    iget-object p1, p0, Ldq/k2$p;->u:Lkotlin/jvm/internal/y;

    const/4 v1, 0x0

    iput-boolean v1, p1, Lkotlin/jvm/internal/y;->a:Z

    goto :goto_0

    :cond_4
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final o(Lmt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Ldq/k2$p;->create(Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Ldq/k2$p;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Ldq/k2$p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
