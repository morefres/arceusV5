.class public final Ljj/a$d;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljj/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
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
    c = "com.roblox.client.pushnotification.http.PushNotificationService$makeNotificationMetadataApiCall$1"
    f = "PushNotificationService.kt"
    l = {
        0xb5
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ljj/a;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkj/g0;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljj/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/a;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkj/g0;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lmt/b<",
            "-",
            "Ljj/a$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljj/a$d;->u:Ljj/a;

    iput-object p2, p0, Ljj/a$d;->v:Ljava/lang/String;

    iput-object p3, p0, Ljj/a$d;->w:Ljava/lang/String;

    iput-object p4, p0, Ljj/a$d;->x:Ljava/lang/String;

    iput-object p5, p0, Ljj/a$d;->y:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Ljj/a$d;->z:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lot/m;-><init>(ILmt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lmt/b;)Lmt/b;
    .locals 8
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

    new-instance v0, Ljj/a$d;

    iget-object v1, p0, Ljj/a$d;->u:Ljj/a;

    iget-object v2, p0, Ljj/a$d;->v:Ljava/lang/String;

    iget-object v3, p0, Ljj/a$d;->w:Ljava/lang/String;

    iget-object v4, p0, Ljj/a$d;->x:Ljava/lang/String;

    iget-object v5, p0, Ljj/a$d;->y:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Ljj/a$d;->z:Lkotlin/jvm/functions/Function1;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Ljj/a$d;-><init>(Ljj/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lmt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lju/p0;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Ljj/a$d;->invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ljj/a$d;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Ljj/a$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ljj/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ljj/a$d;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Ljj/a$d;->u:Ljj/a;

    move p1, v2

    iget-object v2, p0, Ljj/a$d;->v:Ljava/lang/String;

    iget-object v3, p0, Ljj/a$d;->w:Ljava/lang/String;

    iget-object v4, p0, Ljj/a$d;->x:Ljava/lang/String;

    iget-object v5, p0, Ljj/a$d;->y:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Ljj/a$d;->z:Lkotlin/jvm/functions/Function1;

    iput p1, p0, Ljj/a$d;->t:I

    move-object v7, p0

    invoke-virtual/range {v1 .. v7}, Ljj/a;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
