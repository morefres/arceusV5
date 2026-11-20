.class public final Lxp/k0$e;
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
    c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$12"
    f = "CameraScreenRunner.kt"
    l = {
        0x193
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ldn/g;

.field public final synthetic v:Lxp/k0;

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

.field public final synthetic x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;


# direct methods
.method public constructor <init>(Ldn/g;Lxp/k0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldn/g;",
            "Lxp/k0;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;",
            "Lmt/b<",
            "-",
            "Lxp/k0$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxp/k0$e;->u:Ldn/g;

    iput-object p2, p0, Lxp/k0$e;->v:Lxp/k0;

    iput-object p3, p0, Lxp/k0$e;->w:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    iput-object p4, p0, Lxp/k0$e;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;

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

    new-instance v0, Lxp/k0$e;

    iget-object v1, p0, Lxp/k0$e;->u:Ldn/g;

    iget-object v2, p0, Lxp/k0$e;->v:Lxp/k0;

    iget-object v3, p0, Lxp/k0$e;->w:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    iget-object v4, p0, Lxp/k0$e;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lxp/k0$e;-><init>(Ldn/g;Lxp/k0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;Lmt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lju/p0;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lxp/k0$e;->invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lxp/k0$e;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lxp/k0$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lxp/k0$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lxp/k0$e;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

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

    iget-object p1, p0, Lxp/k0$e;->u:Ldn/g;

    iput v2, p0, Lxp/k0$e;->t:I

    invoke-interface {p1, p0}, Ldn/g;->k(Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object v0, p0, Lxp/k0$e;->v:Lxp/k0;

    iget-object v1, p0, Lxp/k0$e;->w:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    iget-object v2, p0, Lxp/k0$e;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;

    invoke-static {p1}, Lgt/n;->h(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    move-object v3, p1

    check-cast v3, Ljava/io/File;

    invoke-static {v0}, Lxp/k0;->v(Lxp/k0;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v4

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;->E()Lkn/a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    const/16 v12, 0x7c

    const/4 v13, 0x0

    const-string v5, "selfie"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v4 .. v13}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logVideoStopEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;ZILjava/lang/Object;)V

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$d;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$d;->b()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$d;->c()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_3
    iget-object v0, p0, Lxp/k0$e;->v:Lxp/k0;

    iget-object v1, p0, Lxp/k0$e;->w:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    iget-object v2, p0, Lxp/k0$e;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;

    invoke-static {p1}, Lgt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {v0}, Lxp/k0;->v(Lxp/k0;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v3

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;->E()Lkn/a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {p1}, Lgt/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v7

    const/16 v9, 0x14

    const/4 v10, 0x0

    const-string v4, "selfie"

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v10}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logVideoErrorEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    instance-of v0, p1, Ldn/h0;

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;->r()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$d;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$d;->c()Lkotlin/jvm/functions/Function0;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_5
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
