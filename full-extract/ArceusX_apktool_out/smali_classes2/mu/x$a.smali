.class public final Lmu/x$a;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lyt/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmu/x;->a(Lmu/h;Lkotlin/jvm/functions/Function2;)Lmu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lot/m;",
        "Lyt/n<",
        "Lmu/i<",
        "-TR;>;TT;",
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
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lmu/i;",
        "it",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lot/f;
    c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1"
    f = "Merge.kt"
    l = {
        0xd5,
        0xd5
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "TT;",
            "Lmt/b<",
            "-TR;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-",
            "Lmt/b<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lmt/b<",
            "-",
            "Lmu/x$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmu/x$a;->w:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lot/m;-><init>(ILmt/b;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmu/i;

    check-cast p3, Lmt/b;

    invoke-virtual {p0, p1, p2, p3}, Lmu/x$a;->o(Lmu/i;Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lmu/x$a;->t:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lmu/x$a;->u:Ljava/lang/Object;

    check-cast v1, Lmu/i;

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lmu/x$a;->u:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lmu/i;

    iget-object p1, p0, Lmu/x$a;->v:Ljava/lang/Object;

    iget-object v4, p0, Lmu/x$a;->w:Lkotlin/jvm/functions/Function2;

    iput-object v1, p0, Lmu/x$a;->u:Ljava/lang/Object;

    iput v3, p0, Lmu/x$a;->t:I

    invoke-interface {v4, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v3, 0x0

    iput-object v3, p0, Lmu/x$a;->u:Ljava/lang/Object;

    iput v2, p0, Lmu/x$a;->t:I

    invoke-interface {v1, p1, p0}, Lmu/i;->emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final o(Lmu/i;Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu/i<",
            "-TR;>;TT;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lmu/x$a;

    iget-object v1, p0, Lmu/x$a;->w:Lkotlin/jvm/functions/Function2;

    invoke-direct {v0, v1, p3}, Lmu/x$a;-><init>(Lkotlin/jvm/functions/Function2;Lmt/b;)V

    iput-object p1, v0, Lmu/x$a;->u:Ljava/lang/Object;

    iput-object p2, v0, Lmu/x$a;->v:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lmu/x$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
