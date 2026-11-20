.class public final Lsg/i$p$a$a;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsg/i$p$a;->a(Ltl/b;)V
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
    c = "com.roblox.client.ads.NativeAdsHandler$showAd$1$1$onAdProgress$1"
    f = "NativeAdsHandler.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lsg/i;

.field public final synthetic v:Ltl/b;


# direct methods
.method public constructor <init>(Lsg/i;Ltl/b;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsg/i;",
            "Ltl/b;",
            "Lmt/b<",
            "-",
            "Lsg/i$p$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsg/i$p$a$a;->u:Lsg/i;

    iput-object p2, p0, Lsg/i$p$a$a;->v:Ltl/b;

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

    new-instance v0, Lsg/i$p$a$a;

    iget-object v1, p0, Lsg/i$p$a$a;->u:Lsg/i;

    iget-object v2, p0, Lsg/i$p$a$a;->v:Ltl/b;

    invoke-direct {v0, v1, v2, p1}, Lsg/i$p$a$a;-><init>(Lsg/i;Ltl/b;Lmt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmt/b;

    invoke-virtual {p0, p1}, Lsg/i$p$a$a;->o(Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    iget v0, p0, Lsg/i$p$a$a;->t:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lsg/i$p$a$a;->u:Lsg/i;

    invoke-static {p1}, Lsg/i;->f(Lsg/i;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lsg/i$p$a$a;->v:Ltl/b;

    invoke-virtual {p1}, Ltl/b;->a()D

    move-result-wide v1

    double-to-float v1, v1

    iget-object p1, p0, Lsg/i$p$a$a;->v:Ltl/b;

    invoke-virtual {p1}, Ltl/b;->e()D

    move-result-wide v2

    double-to-float v2, v2

    iget-object p1, p0, Lsg/i$p$a$a;->v:Ltl/b;

    invoke-virtual {p1}, Ltl/b;->b()J

    move-result-wide v3

    long-to-float v3, v3

    iget-object p1, p0, Lsg/i$p$a$a;->v:Ltl/b;

    invoke-virtual {p1}, Ltl/b;->d()I

    move-result p1

    int-to-float v4, p1

    iget-object p1, p0, Lsg/i$p$a$a;->v:Ltl/b;

    invoke-virtual {p1}, Ltl/b;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;->onAdProgress(FFFFLjava/lang/String;)V

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
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

    invoke-virtual {p0, p1}, Lsg/i$p$a$a;->create(Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lsg/i$p$a$a;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lsg/i$p$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
