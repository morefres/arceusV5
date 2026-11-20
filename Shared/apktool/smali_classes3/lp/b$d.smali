.class public final Llp/b$d;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llp/b;->i(Ljava/lang/String;Llp/a;Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.withpersona.sdk2.inquiry.logger.Logger$log$1"
    f = "Logger.kt"
    l = {
        0x58
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Llp/b;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Llp/a;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Llp/b;Ljava/lang/String;Llp/a;Ljava/lang/String;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Llp/b;",
            "Ljava/lang/String;",
            "Llp/a;",
            "Ljava/lang/String;",
            "Lmt/b<",
            "-",
            "Llp/b$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llp/b$d;->v:Ljava/lang/String;

    iput-object p2, p0, Llp/b$d;->w:Llp/b;

    iput-object p3, p0, Llp/b$d;->x:Ljava/lang/String;

    iput-object p4, p0, Llp/b$d;->y:Llp/a;

    iput-object p5, p0, Llp/b$d;->z:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lot/m;-><init>(ILmt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lmt/b;)Lmt/b;
    .locals 7
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

    new-instance v0, Llp/b$d;

    iget-object v1, p0, Llp/b$d;->v:Ljava/lang/String;

    iget-object v2, p0, Llp/b$d;->w:Llp/b;

    iget-object v3, p0, Llp/b$d;->x:Ljava/lang/String;

    iget-object v4, p0, Llp/b$d;->y:Llp/a;

    iget-object v5, p0, Llp/b$d;->z:Ljava/lang/String;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Llp/b$d;-><init>(Ljava/lang/String;Llp/b;Ljava/lang/String;Llp/a;Ljava/lang/String;Lmt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lju/p0;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Llp/b$d;->invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Llp/b$d;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Llp/b$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Llp/b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v6

    iget v0, p0, Llp/b$d;->u:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Llp/b$d;->t:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object v7, p0, Llp/b$d;->v:Ljava/lang/String;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v8, "\n"

    const-string v9, "\\n"

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lkotlin/text/x;->N(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Llp/b$d;->w:Llp/b;

    iget-object v2, p0, Llp/b$d;->x:Ljava/lang/String;

    move-object v3, v2

    iget-object v2, p0, Llp/b$d;->y:Llp/a;

    move-object v7, v3

    iget-object v3, p0, Llp/b$d;->z:Ljava/lang/String;

    invoke-static {v4}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, p0, Llp/b$d;->t:Ljava/lang/Object;

    iput v1, p0, Llp/b$d;->u:I

    move-object v5, p0

    move-object v1, v7

    invoke-static/range {v0 .. v5}, Llp/b;->b(Llp/b;Ljava/lang/String;Llp/a;Ljava/lang/String;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_2

    return-object v6

    :cond_2
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method
