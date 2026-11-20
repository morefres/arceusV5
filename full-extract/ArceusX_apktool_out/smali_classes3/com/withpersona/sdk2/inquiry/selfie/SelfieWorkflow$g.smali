.class public final Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->z1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;Lwm/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
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
    c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderAcquireNextPose$1"
    f = "SelfieWorkflow.kt"
    l = {
        0x1ed
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

.field public final synthetic v:I

.field public final synthetic w:Lwm/k$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwm/k<",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "Ljava/lang/Object;",
            ">.a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;ILwm/k$a;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;",
            "I",
            "Lwm/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lmt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;->u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iput p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;->v:I

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;->w:Lwm/k$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lot/m;-><init>(ILmt/b;)V

    return-void
.end method

.method public static synthetic o(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;->q(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final q(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Lwm/r$c;)Lkotlin/Unit;
    .locals 17

    move-object/from16 v0, p2

    invoke-virtual {v0}, Lwm/r$c;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    if-nez v4, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const/16 v15, 0x1bf

    const/16 v16, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v4 .. v16}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;->A(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;Lcom/withpersona/sdk2/camera/CameraProperties;JLjava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1, v3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->s1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lwm/r$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwm/r$c;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
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

    new-instance p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;->u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;->v:I

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;->w:Lwm/k$a;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;ILwm/k$a;Lmt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lju/p0;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;->invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;->t:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Lgt/n;

    invoke-virtual {p1}, Lgt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;->u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lbq/a;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, "selfiePoseManager"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    move-object p1, v2

    :cond_2
    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;->v:I

    iput v3, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;->t:I

    invoke-virtual {p1, v1, p0}, Lbq/a;->k(ILmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;->w:Lwm/k$a;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;->u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    invoke-static {p1}, Lgt/n;->h(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    move-object v4, p1

    check-cast v4, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    invoke-virtual {v0}, Lwm/k$a;->d()Lwm/h;

    move-result-object v0

    new-instance v5, Lwp/x4;

    invoke-direct {v5, v1, v4}, Lwp/x4;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;)V

    invoke-static {v1, v2, v5, v3, v2}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object v1

    invoke-interface {v0, v1}, Lwm/h;->a(Ljava/lang/Object;)V

    :cond_4
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;->u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;->w:Lwm/k$a;

    invoke-static {p1}, Lgt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->t1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lwm/k$a;Ljava/lang/Throwable;)V

    :cond_5
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
