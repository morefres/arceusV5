.class public final Lmu/q$a$b;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmu/q$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lot/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Llu/k<",
        "+",
        "Ljava/lang/Object;",
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Llu/k;",
        "",
        "value",
        "",
        "<anonymous>",
        "(Llu/k;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lot/f;
    c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2"
    f = "Delay.kt"
    l = {
        0xec
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lkotlin/jvm/internal/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/c0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic x:Lmu/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmu/i<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/c0;Lmu/i;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/c0<",
            "Ljava/lang/Object;",
            ">;",
            "Lmu/i<",
            "-TT;>;",
            "Lmt/b<",
            "-",
            "Lmu/q$a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmu/q$a$b;->w:Lkotlin/jvm/internal/c0;

    iput-object p2, p0, Lmu/q$a$b;->x:Lmu/i;

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

    new-instance v0, Lmu/q$a$b;

    iget-object v1, p0, Lmu/q$a$b;->w:Lkotlin/jvm/internal/c0;

    iget-object v2, p0, Lmu/q$a$b;->x:Lmu/i;

    invoke-direct {v0, v1, v2, p2}, Lmu/q$a$b;-><init>(Lkotlin/jvm/internal/c0;Lmu/i;Lmt/b;)V

    iput-object p1, v0, Lmu/q$a$b;->v:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llu/k;

    invoke-virtual {p1}, Llu/k;->k()Ljava/lang/Object;

    move-result-object p1

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lmu/q$a$b;->o(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lmu/q$a$b;->u:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lmu/q$a$b;->t:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/c0;

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lmu/q$a$b;->v:Ljava/lang/Object;

    check-cast p1, Llu/k;

    invoke-virtual {p1}, Llu/k;->k()Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, Lmu/q$a$b;->w:Lkotlin/jvm/internal/c0;

    instance-of v3, p1, Llu/k$c;

    if-nez v3, :cond_2

    iput-object p1, v1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    :cond_2
    iget-object v4, p0, Lmu/q$a$b;->x:Lmu/i;

    if-eqz v3, :cond_7

    invoke-static {p1}, Llu/k;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_6

    iget-object v3, v1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    if-eqz v3, :cond_5

    sget-object v5, Lnu/t;->a:Lpu/e0;

    if-ne v3, v5, :cond_3

    const/4 v3, 0x0

    :cond_3
    iput-object p1, p0, Lmu/q$a$b;->v:Ljava/lang/Object;

    iput-object v1, p0, Lmu/q$a$b;->t:Ljava/lang/Object;

    iput v2, p0, Lmu/q$a$b;->u:I

    invoke-interface {v4, v3, p0}, Lmu/i;->emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v0, v1

    :goto_0
    move-object v1, v0

    :cond_5
    sget-object p1, Lnu/t;->c:Lpu/e0;

    iput-object p1, v1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    goto :goto_1

    :cond_6
    throw v3

    :cond_7
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final o(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1}, Llu/k;->b(Ljava/lang/Object;)Llu/k;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lmu/q$a$b;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lmu/q$a$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lmu/q$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
