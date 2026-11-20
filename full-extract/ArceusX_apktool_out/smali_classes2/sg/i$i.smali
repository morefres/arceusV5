.class public final Lsg/i$i;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsg/i;->initializeSdk(Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.roblox.client.ads.NativeAdsHandler$initializeSdk$1"
    f = "NativeAdsHandler.kt"
    l = {
        0xb9,
        0xc6
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lsg/i;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lsg/i;Ljava/lang/String;Ljava/lang/String;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsg/i;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lmt/b<",
            "-",
            "Lsg/i$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsg/i$i;->u:Lsg/i;

    iput-object p2, p0, Lsg/i$i;->v:Ljava/lang/String;

    iput-object p3, p0, Lsg/i$i;->w:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lot/m;-><init>(ILmt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lmt/b;)Lmt/b;
    .locals 4
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

    new-instance v0, Lsg/i$i;

    iget-object v1, p0, Lsg/i$i;->u:Lsg/i;

    iget-object v2, p0, Lsg/i$i;->v:Ljava/lang/String;

    iget-object v3, p0, Lsg/i$i;->w:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p1}, Lsg/i$i;-><init>(Lsg/i;Ljava/lang/String;Ljava/lang/String;Lmt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmt/b;

    invoke-virtual {p0, p1}, Lsg/i$i;->o(Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lsg/i$i;->t:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Lgt/n;

    invoke-virtual {p1}, Lgt/n;->j()Ljava/lang/Object;

    move-result-object p1

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

    iget-object p1, p0, Lsg/i$i;->u:Lsg/i;

    invoke-static {p1}, Lsg/i;->d(Lsg/i;)Lrl/c;

    move-result-object p1

    instance-of p1, p1, Lcom/roblox/universalapp/ads/NoopGmaSdkController;

    if-eqz p1, :cond_6

    invoke-static {}, Lcom/roblox/universalapp/ads/JNINativeAdsProtocol;->getGmaSdkBackgroundInstallIxpEnabled()Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "NativeAdsHandler"

    const-string v1, "gmasdk is not installed, trigger the installation"

    invoke-static {p1, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->n1()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lsg/i$i;->u:Lsg/i;

    invoke-static {p1}, Lsg/i;->e(Lsg/i;)Lrl/i;

    move-result-object p1

    sget-object v1, Lrl/i$a;->b:Lrl/i$a;

    iput v3, p0, Lsg/i$i;->t:I

    invoke-interface {p1, v1, p0}, Lrl/i;->b(Lrl/i$a;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lsg/i$i;->u:Lsg/i;

    invoke-static {p1}, Lsg/i;->e(Lsg/i;)Lrl/i;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lrl/i;->a(Z)V

    :cond_4
    :goto_0
    iget-object p1, p0, Lsg/i$i;->u:Lsg/i;

    invoke-static {p1}, Lsg/i;->f(Lsg/i;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v0, p0, Lsg/i$i;->v:Ljava/lang/String;

    sget-object v1, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->NOTINSTALLED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    const-string v2, "gmasdk module not installed"

    invoke-virtual {p1, v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;->onInitializeSdkFailed(Ljava/lang/String;Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;Ljava/lang/String;)V

    :cond_5
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_6
    iget-object p1, p0, Lsg/i$i;->u:Lsg/i;

    invoke-static {p1}, Lsg/i;->d(Lsg/i;)Lrl/c;

    move-result-object p1

    iget-object v1, p0, Lsg/i$i;->w:Ljava/lang/String;

    iput v2, p0, Lsg/i$i;->t:I

    invoke-interface {p1, v1, p0}, Lrl/c;->k(Ljava/lang/String;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_1
    return-object v0

    :cond_7
    :goto_2
    iget-object v0, p0, Lsg/i$i;->u:Lsg/i;

    iget-object v1, p0, Lsg/i$i;->v:Ljava/lang/String;

    invoke-static {p1}, Lgt/n;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    move-object v2, p1

    check-cast v2, Lkotlin/Unit;

    invoke-static {v0}, Lsg/i;->f(Lsg/i;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0, v1}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;->onInitializeSdkSuccess(Ljava/lang/String;)V

    :cond_8
    iget-object v0, p0, Lsg/i$i;->u:Lsg/i;

    iget-object v1, p0, Lsg/i$i;->v:Ljava/lang/String;

    invoke-static {p1}, Lgt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_c

    instance-of v2, p1, Lrl/b;

    if-eqz v2, :cond_9

    sget-object v2, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->NATIVESHUTTINGDOWN:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    goto :goto_3

    :cond_9
    instance-of v2, p1, Lju/e3;

    if-eqz v2, :cond_a

    sget-object v2, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->TIMEDOUT:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    goto :goto_3

    :cond_a
    sget-object v2, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->UNDEFINED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    :goto_3
    invoke-static {v0}, Lsg/i;->f(Lsg/i;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_b

    const-string p1, ""

    :cond_b
    invoke-virtual {v0, v1, v2, p1}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;->onInitializeSdkFailed(Ljava/lang/String;Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;Ljava/lang/String;)V

    :cond_c
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

    invoke-virtual {p0, p1}, Lsg/i$i;->create(Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lsg/i$i;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lsg/i$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
