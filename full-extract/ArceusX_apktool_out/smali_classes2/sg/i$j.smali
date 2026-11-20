.class public final Lsg/i$j;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsg/i;->install(Z)V
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
    c = "com.roblox.client.ads.NativeAdsHandler$install$1"
    f = "NativeAdsHandler.kt"
    l = {
        0x9d,
        0x9f
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Z

.field public final synthetic v:Lsg/i;


# direct methods
.method public constructor <init>(ZLsg/i;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lsg/i;",
            "Lmt/b<",
            "-",
            "Lsg/i$j;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lsg/i$j;->u:Z

    iput-object p2, p0, Lsg/i$j;->v:Lsg/i;

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

    new-instance v0, Lsg/i$j;

    iget-boolean v1, p0, Lsg/i$j;->u:Z

    iget-object v2, p0, Lsg/i$j;->v:Lsg/i;

    invoke-direct {v0, v1, v2, p1}, Lsg/i$j;-><init>(ZLsg/i;Lmt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmt/b;

    invoke-virtual {p0, p1}, Lsg/i$j;->o(Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lsg/i$j;->t:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lcom/roblox/universalapp/ads/JNINativeAdsProtocol;->getGmaSdkBackgroundInstallIxpEnabled()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Lqh/h;->y()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-boolean p1, p0, Lsg/i$j;->u:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "engine triggered gmasdk install, eager install: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "NativeAdsHandler"

    invoke-static {v1, p1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean p1, p0, Lsg/i$j;->u:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lsg/i$j;->v:Lsg/i;

    invoke-static {p1}, Lsg/i;->e(Lsg/i;)Lrl/i;

    move-result-object p1

    sget-object v1, Lrl/i$a;->b:Lrl/i$a;

    iput v3, p0, Lsg/i$j;->t:I

    invoke-interface {p1, v1, p0}, Lrl/i;->b(Lrl/i$a;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lsg/i$j;->v:Lsg/i;

    invoke-static {p1}, Lsg/i;->e(Lsg/i;)Lrl/i;

    move-result-object p1

    sget-object v1, Lrl/i$a;->a:Lrl/i$a;

    iput v2, p0, Lsg/i$j;->t:I

    invoke-interface {p1, v1, p0}, Lrl/i;->b(Lrl/i$a;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_4
    iget-object p1, p0, Lsg/i$j;->v:Lsg/i;

    invoke-static {p1}, Lsg/i;->e(Lsg/i;)Lrl/i;

    move-result-object p1

    iget-boolean v0, p0, Lsg/i$j;->u:Z

    invoke-interface {p1, v0}, Lrl/i;->a(Z)V

    :cond_5
    :goto_2
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

    invoke-virtual {p0, p1}, Lsg/i$j;->create(Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lsg/i$j;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lsg/i$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
