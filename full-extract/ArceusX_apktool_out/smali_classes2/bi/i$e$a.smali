.class public final Lbi/i$e$a;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbi/i$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1"
    f = "PlayGamesIntegration.kt"
    l = {
        0xa4,
        0xc5
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public final synthetic A:Lj/b;

.field public final synthetic B:Lql/b;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Z

.field public x:I

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lj/b;Lql/b;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/b;",
            "Lql/b;",
            "Lmt/b<",
            "-",
            "Lbi/i$e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbi/i$e$a;->A:Lj/b;

    iput-object p2, p0, Lbi/i$e$a;->B:Lql/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lot/m;-><init>(ILmt/b;)V

    return-void
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

    new-instance v0, Lbi/i$e$a;

    iget-object v1, p0, Lbi/i$e$a;->A:Lj/b;

    iget-object v2, p0, Lbi/i$e$a;->B:Lql/b;

    invoke-direct {v0, v1, v2, p2}, Lbi/i$e$a;-><init>(Lj/b;Lql/b;Lmt/b;)V

    iput-object p1, v0, Lbi/i$e$a;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lju/p0;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lbi/i$e$a;->invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lbi/i$e$a;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lbi/i$e$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lbi/i$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lbi/i$e$a;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lju/p0;

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v2, p0, Lbi/i$e$a;->y:I

    const-string v7, "rbx.achievements.playgames"

    const/4 v8, 0x2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    if-ne v2, v8, :cond_0

    iget-object v0, p0, Lbi/i$e$a;->v:Ljava/lang/Object;

    check-cast v0, Lql/w;

    iget-object v0, p0, Lbi/i$e$a;->u:Ljava/lang/Object;

    check-cast v0, Lbi/k;

    iget-object v0, p0, Lbi/i$e$a;->t:Ljava/lang/Object;

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Lgt/n;

    invoke-virtual {p1}, Lgt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    sget-object p1, Lbi/i;->a:Lbi/i;

    iget-object v2, p0, Lbi/i$e$a;->A:Lj/b;

    invoke-static {v2}, Lda/g;->b(Landroid/app/Activity;)Lda/e;

    move-result-object v2

    const-string v4, "getGamesSignInClient(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lbi/i$e$a;->z:Ljava/lang/Object;

    iput v3, p0, Lbi/i$e$a;->y:I

    invoke-static {p1, v2, p0}, Lbi/i;->e(Lbi/i;Lda/e;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object v9, p0, Lbi/i$e$a;->A:Lj/b;

    iget-object v2, p0, Lbi/i$e$a;->B:Lql/b;

    invoke-static {p1}, Lgt/n;->h(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    move-object v3, p1

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v3

    invoke-interface {v3}, Lrh/i;->C()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-static {}, Lbi/g;->a()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lql/t;->a:Lql/t;

    invoke-virtual {v4, v10, v3}, Lql/t;->m(ZLjava/lang/String;)V

    :cond_4
    if-eqz v10, :cond_6

    new-instance v11, Lbi/k;

    invoke-static {v9}, Lda/g;->a(Landroid/app/Activity;)Lda/a;

    move-result-object v3

    const-string v4, "getAchievementsClient(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v11, v3}, Lbi/k;-><init>(Lda/a;)V

    new-instance v12, Lql/w;

    invoke-direct {v12, v2, v11}, Lql/w;-><init>(Lql/b;Lql/v;)V

    new-instance v4, Lbi/i$e$a$a;

    const/4 v13, 0x0

    invoke-direct {v4, v12, v13}, Lbi/i$e$a$a;-><init>(Lql/w;Lmt/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lju/i;->d(Lju/p0;Lkotlin/coroutines/CoroutineContext;Lju/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lju/d2;

    sget-object v2, Landroidx/lifecycle/l$b;->e:Landroidx/lifecycle/l$b;

    new-instance v3, Lbi/i$e$a$b;

    invoke-direct {v3, v12, v13}, Lbi/i$e$a$b;-><init>(Lql/w;Lmt/b;)V

    invoke-static {v1}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lbi/i$e$a;->z:Ljava/lang/Object;

    iput-object p1, p0, Lbi/i$e$a;->t:Ljava/lang/Object;

    invoke-static {v11}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lbi/i$e$a;->u:Ljava/lang/Object;

    invoke-static {v12}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lbi/i$e$a;->v:Ljava/lang/Object;

    iput-boolean v10, p0, Lbi/i$e$a;->w:Z

    const/4 v1, 0x0

    iput v1, p0, Lbi/i$e$a;->x:I

    iput v8, p0, Lbi/i$e$a;->y:I

    invoke-static {v9, v2, v3, p0}, Landroidx/lifecycle/j0;->b(Landroidx/lifecycle/s;Landroidx/lifecycle/l$b;Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    move-object v0, p1

    :goto_2
    move-object p1, v0

    goto :goto_3

    :cond_6
    const-string v0, "PGS is not authenticated."

    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lot/b;->c(I)Ljava/lang/Integer;

    :cond_7
    :goto_3
    invoke-static {p1}, Lgt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_8

    const-string v0, "GooglePlayGames signIn failed exceptionally"

    invoke-static {v7, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_8
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
