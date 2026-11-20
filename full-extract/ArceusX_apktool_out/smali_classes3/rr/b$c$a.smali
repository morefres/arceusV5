.class public final Lrr/b$c$a;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrr/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Liv/x<",
        "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Liv/x;",
        "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;",
        "<anonymous>",
        "()Liv/x;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lot/f;
    c = "com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1$1"
    f = "WebRtcWorker.kt"
    l = {
        0x26
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lrr/b;


# direct methods
.method public constructor <init>(Lrr/b;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrr/b;",
            "Lmt/b<",
            "-",
            "Lrr/b$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrr/b$c$a;->u:Lrr/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Lot/m;-><init>(ILmt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lmt/b;)Lmt/b;
    .locals 2
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

    new-instance v0, Lrr/b$c$a;

    iget-object v1, p0, Lrr/b$c$a;->u:Lrr/b;

    invoke-direct {v0, v1, p1}, Lrr/b$c$a;-><init>(Lrr/b;Lmt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmt/b;

    invoke-virtual {p0, p1}, Lrr/b$c$a;->o(Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lrr/b$c$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lrr/b$c$a;->u:Lrr/b;

    invoke-static {p1}, Lrr/b;->e(Lrr/b;)Lrr/a;

    move-result-object p1

    iget-object v1, p0, Lrr/b$c$a;->u:Lrr/b;

    invoke-static {v1}, Lrr/b;->d(Lrr/b;)Ljava/lang/String;

    move-result-object v1

    iput v2, p0, Lrr/b$c$a;->t:I

    invoke-interface {p1, v1, p0}, Lrr/a;->a(Ljava/lang/String;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method

.method public final o(Lmt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmt/b<",
            "-",
            "Liv/x<",
            "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lrr/b$c$a;->create(Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lrr/b$c$a;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lrr/b$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
