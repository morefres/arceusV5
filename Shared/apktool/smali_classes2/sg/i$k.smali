.class public final Lsg/i$k;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsg/i;->k(Lrl/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lyt/n;)V
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
    c = "com.roblox.client.ads.NativeAdsHandler$loadAd$1"
    f = "NativeAdsHandler.kt"
    l = {
        0xeb
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Lyt/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/n<",
            "Ljava/lang/String;",
            "Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic w:Lsg/i;

.field public final synthetic x:Lrl/a;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lyt/n;Lsg/i;Lrl/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lyt/n<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lsg/i;",
            "Lrl/a;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lmt/b<",
            "-",
            "Lsg/i$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsg/i$k;->u:Ljava/lang/String;

    iput-object p2, p0, Lsg/i$k;->v:Lyt/n;

    iput-object p3, p0, Lsg/i$k;->w:Lsg/i;

    iput-object p4, p0, Lsg/i$k;->x:Lrl/a;

    iput-object p5, p0, Lsg/i$k;->y:Ljava/lang/String;

    iput-object p6, p0, Lsg/i$k;->z:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p7}, Lot/m;-><init>(ILmt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lmt/b;)Lmt/b;
    .locals 8
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

    new-instance v0, Lsg/i$k;

    iget-object v1, p0, Lsg/i$k;->u:Ljava/lang/String;

    iget-object v2, p0, Lsg/i$k;->v:Lyt/n;

    iget-object v3, p0, Lsg/i$k;->w:Lsg/i;

    iget-object v4, p0, Lsg/i$k;->x:Lrl/a;

    iget-object v5, p0, Lsg/i$k;->y:Ljava/lang/String;

    iget-object v6, p0, Lsg/i$k;->z:Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lsg/i$k;-><init>(Ljava/lang/String;Lyt/n;Lsg/i;Lrl/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lmt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmt/b;

    invoke-virtual {p0, p1}, Lsg/i$k;->o(Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lsg/i$k;->t:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Lgt/n;

    invoke-virtual {p1}, Lgt/n;->j()Ljava/lang/Object;

    move-result-object p1

    move-object v9, p0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lsg/i$k;->u:Ljava/lang/String;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lsg/i$k;->v:Lyt/n;

    iget-object v0, p0, Lsg/i$k;->u:Ljava/lang/String;

    sget-object v1, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->ADTRACINGIDABSENT:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    const-string v2, "adTracingId is empty"

    invoke-interface {p1, v0, v1, v2}, Lyt/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_2
    iget-object p1, p0, Lsg/i$k;->w:Lsg/i;

    invoke-static {p1}, Lsg/i;->d(Lsg/i;)Lrl/c;

    move-result-object v4

    iget-object v5, p0, Lsg/i$k;->x:Lrl/a;

    iget-object v6, p0, Lsg/i$k;->u:Ljava/lang/String;

    iget-object v7, p0, Lsg/i$k;->y:Ljava/lang/String;

    new-instance v8, Lsg/i$k$a;

    iget-object p1, p0, Lsg/i$k;->w:Lsg/i;

    invoke-direct {v8, p1, v5, v6, v3}, Lsg/i$k$a;-><init>(Lsg/i;Lrl/a;Ljava/lang/String;Lmt/b;)V

    iput v2, p0, Lsg/i$k;->t:I

    move-object v9, p0

    invoke-interface/range {v4 .. v9}, Lrl/c;->c(Lrl/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iget-object v0, v9, Lsg/i$k;->z:Lkotlin/jvm/functions/Function1;

    iget-object v1, v9, Lsg/i$k;->u:Ljava/lang/String;

    invoke-static {p1}, Lgt/n;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move-object v2, p1

    check-cast v2, Lkotlin/Unit;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object v0, v9, Lsg/i$k;->v:Lyt/n;

    iget-object v1, v9, Lsg/i$k;->u:Ljava/lang/String;

    invoke-static {p1}, Lgt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_9

    instance-of v2, p1, Lrl/b;

    if-eqz v2, :cond_5

    sget-object v2, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->NATIVESHUTTINGDOWN:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    goto :goto_2

    :cond_5
    instance-of v2, p1, Lrl/e;

    if-eqz v2, :cond_6

    move-object v2, p1

    check-cast v2, Lrl/e;

    goto :goto_1

    :cond_6
    move-object v2, v3

    :goto_1
    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lrl/e;->a()Lrl/g;

    move-result-object v3

    :cond_7
    invoke-static {v3}, Lrl/h;->a(Lrl/g;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    move-result-object v2

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_8

    const-string p1, ""

    :cond_8
    invoke-interface {v0, v1, v2, p1}, Lyt/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
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

    invoke-virtual {p0, p1}, Lsg/i$k;->create(Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lsg/i$k;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lsg/i$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
