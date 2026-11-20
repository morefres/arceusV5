.class public final Lug/p$g;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug/p;->q(Z)V
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
    c = "com.roblox.client.analytics.EventUploadWorker$uploadEvents$1$1"
    f = "EventUploadWorker.kt"
    l = {
        0x90
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public final synthetic A:Z

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public w:I

.field public x:I

.field public final synthetic y:Lug/p;

.field public final synthetic z:Lkh/a;


# direct methods
.method public constructor <init>(Lug/p;Lkh/a;ZLmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lug/p;",
            "Lkh/a;",
            "Z",
            "Lmt/b<",
            "-",
            "Lug/p$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug/p$g;->y:Lug/p;

    iput-object p2, p0, Lug/p$g;->z:Lkh/a;

    iput-boolean p3, p0, Lug/p$g;->A:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lot/m;-><init>(ILmt/b;)V

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

    new-instance p1, Lug/p$g;

    iget-object v0, p0, Lug/p$g;->y:Lug/p;

    iget-object v1, p0, Lug/p$g;->z:Lkh/a;

    iget-boolean v2, p0, Lug/p$g;->A:Z

    invoke-direct {p1, v0, v1, v2, p2}, Lug/p$g;-><init>(Lug/p;Lkh/a;ZLmt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lju/p0;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lug/p$g;->invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lug/p$g;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lug/p$g;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lug/p$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lug/p$g;->x:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lug/p$g;->u:Ljava/lang/Object;

    check-cast v0, Ltu/a;

    iget-object v1, p0, Lug/p$g;->t:Ljava/lang/Object;

    check-cast v1, Lug/p;

    :try_start_0
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lug/p$g;->y:Lug/p;

    invoke-static {p1}, Lug/p;->e(Lug/p;)Ltu/a;

    move-result-object v1

    iget-object v4, p0, Lug/p$g;->y:Lug/p;

    iget-object v5, p0, Lug/p$g;->z:Lkh/a;

    iget-boolean v6, p0, Lug/p$g;->A:Z

    invoke-static {v1, v3, v2, v3}, Ltu/a$a;->b(Ltu/a;Ljava/lang/Object;ILjava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    :try_start_1
    invoke-static {p1}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lug/p$g;->t:Ljava/lang/Object;

    iput-object v1, p0, Lug/p$g;->u:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lug/p$g;->v:I

    iput p1, p0, Lug/p$g;->w:I

    iput v2, p0, Lug/p$g;->x:I

    invoke-static {v4, v5, v6, p0}, Lug/p;->c(Lug/p;Lkh/a;ZLmt/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, v1

    :goto_0
    invoke-static {v0, v3, v2, v3}, Ltu/a$a;->c(Ltu/a;Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object v0, v1

    :goto_1
    invoke-static {v0, v3, v2, v3}, Ltu/a$a;->c(Ltu/a;Ljava/lang/Object;ILjava/lang/Object;)V

    throw p1

    :cond_3
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
