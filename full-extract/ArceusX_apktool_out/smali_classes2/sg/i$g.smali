.class public final Lsg/i$g;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsg/i;->getQueryInfo(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.roblox.client.ads.NativeAdsHandler$getQueryInfo$1"
    f = "NativeAdsHandler.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Lsg/i;

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lsg/i;ILjava/lang/String;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lsg/i;",
            "I",
            "Ljava/lang/String;",
            "Lmt/b<",
            "-",
            "Lsg/i$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsg/i$g;->u:Ljava/lang/String;

    iput-object p2, p0, Lsg/i$g;->v:Ljava/lang/String;

    iput-object p3, p0, Lsg/i$g;->w:Lsg/i;

    iput p4, p0, Lsg/i$g;->x:I

    iput-object p5, p0, Lsg/i$g;->y:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p6}, Lot/m;-><init>(ILmt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lmt/b;)Lmt/b;
    .locals 7
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

    new-instance v0, Lsg/i$g;

    iget-object v1, p0, Lsg/i$g;->u:Ljava/lang/String;

    iget-object v2, p0, Lsg/i$g;->v:Ljava/lang/String;

    iget-object v3, p0, Lsg/i$g;->w:Lsg/i;

    iget v4, p0, Lsg/i$g;->x:I

    iget-object v5, p0, Lsg/i$g;->y:Ljava/lang/String;

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lsg/i$g;-><init>(Ljava/lang/String;Ljava/lang/String;Lsg/i;ILjava/lang/String;Lmt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmt/b;

    invoke-virtual {p0, p1}, Lsg/i$g;->o(Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    iget v0, p0, Lsg/i$g;->t:I

    if-nez v0, :cond_6

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lsg/i$g;->u:Ljava/lang/String;

    const-string v0, "IsolatedRewarded"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lsg/i$g;->u:Ljava/lang/String;

    const-string v0, "NonIsolatedRewarded"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-eqz p1, :cond_2

    sget-object v0, Lsg/b;->b:Lsg/b;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lsg/l;->f(Lsg/b;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Lsg/i$g;->v:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_5

    if-eqz p1, :cond_3

    sget-object p1, Lsg/b;->c:Lsg/b;

    const-string v0, "MISSING_AD_TRACING_ID"

    invoke-static {p1, v0}, Lsg/l;->b(Lsg/b;Ljava/lang/String;)V

    :cond_3
    iget-object p1, p0, Lsg/i$g;->w:Lsg/i;

    invoke-static {p1}, Lsg/i;->f(Lsg/i;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;

    move-result-object p1

    if-eqz p1, :cond_4

    iget v0, p0, Lsg/i$g;->x:I

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;->onGetQueryInfoCompleted(ILjava/lang/String;)V

    :cond_4
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_5
    iget-object v0, p0, Lsg/i$g;->w:Lsg/i;

    invoke-static {v0}, Lsg/i;->d(Lsg/i;)Lrl/c;

    move-result-object v0

    iget-object v1, p0, Lsg/i$g;->v:Ljava/lang/String;

    iget-object v2, p0, Lsg/i$g;->y:Ljava/lang/String;

    iget-object v3, p0, Lsg/i$g;->u:Ljava/lang/String;

    new-instance v4, Lsg/i$g$a;

    iget-object v5, p0, Lsg/i$g;->w:Lsg/i;

    iget v6, p0, Lsg/i$g;->x:I

    invoke-direct {v4, v5, p1, v6}, Lsg/i$g$a;-><init>(Lsg/i;ZI)V

    invoke-interface {v0, v1, v2, v3, v4}, Lrl/c;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl/j;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_6
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

    invoke-virtual {p0, p1}, Lsg/i$g;->create(Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lsg/i$g;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lsg/i$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
