.class public final Lcr/g$a;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcr/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lot/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lmu/i<",
        "-",
        "Ljava/lang/String;",
        ">;",
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lmu/i;",
        "",
        "",
        "<anonymous>",
        "(Lmu/i;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lot/f;
    c = "com.withpersona.sdk2.inquiry.steps.ui.components.utils.DateController$1"
    f = "DateController.kt"
    l = {
        0x3c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lcr/g;


# direct methods
.method public constructor <init>(Lcr/g;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcr/g;",
            "Lmt/b<",
            "-",
            "Lcr/g$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcr/g$a;->v:Lcr/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lot/m;-><init>(ILmt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lmt/b;)Lmt/b;
    .locals 2
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

    new-instance v0, Lcr/g$a;

    iget-object v1, p0, Lcr/g$a;->v:Lcr/g;

    invoke-direct {v0, v1, p2}, Lcr/g$a;-><init>(Lcr/g;Lmt/b;)V

    iput-object p1, v0, Lcr/g$a;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmu/i;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lcr/g$a;->o(Lmu/i;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcr/g$a;->u:Ljava/lang/Object;

    check-cast v0, Lmu/i;

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcr/g$a;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcr/g$a;->v:Lcr/g;

    invoke-virtual {p1}, Lcr/g;->g()Lym/r;

    move-result-object p1

    invoke-interface {p1}, Lym/r;->a()Lmu/h;

    move-result-object p1

    iget-object v2, p0, Lcr/g$a;->v:Lcr/g;

    invoke-virtual {v2}, Lcr/g;->d()Lym/r;

    move-result-object v2

    invoke-interface {v2}, Lym/r;->a()Lmu/h;

    move-result-object v2

    iget-object v4, p0, Lcr/g$a;->v:Lcr/g;

    invoke-virtual {v4}, Lcr/g;->c()Lym/r;

    move-result-object v4

    invoke-interface {v4}, Lym/r;->a()Lmu/h;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Lmu/h;

    const/4 v6, 0x0

    aput-object p1, v5, v6

    aput-object v2, v5, v3

    const/4 p1, 0x2

    aput-object v4, v5, p1

    invoke-static {v5}, Lmu/j;->C([Lmu/h;)Lmu/h;

    move-result-object p1

    new-instance v2, Lcr/g$a$a;

    iget-object v4, p0, Lcr/g$a;->v:Lcr/g;

    invoke-direct {v2, v0, v4}, Lcr/g$a$a;-><init>(Lmu/i;Lcr/g;)V

    invoke-static {v0}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcr/g$a;->u:Ljava/lang/Object;

    iput v3, p0, Lcr/g$a;->t:I

    invoke-interface {p1, v2, p0}, Lmu/h;->collect(Lmu/i;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final o(Lmu/i;Lmt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu/i<",
            "-",
            "Ljava/lang/String;",
            ">;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcr/g$a;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lcr/g$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcr/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
