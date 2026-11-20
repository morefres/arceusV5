.class public final Lfr/j$a$a;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfr/j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1"
    f = "InputSelectBottomSheetController.kt"
    l = {
        0x128,
        0xc6
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public v:I

.field public final synthetic w:Lju/a0;

.field public final synthetic x:Lfr/j;

.field public final synthetic y:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lju/a0;Lfr/j;Lkotlin/jvm/functions/Function0;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lju/a0;",
            "Lfr/j;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lmt/b<",
            "-",
            "Lfr/j$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfr/j$a$a;->w:Lju/a0;

    iput-object p2, p0, Lfr/j$a$a;->x:Lfr/j;

    iput-object p3, p0, Lfr/j$a$a;->y:Lkotlin/jvm/functions/Function0;

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

    new-instance p1, Lfr/j$a$a;

    iget-object v0, p0, Lfr/j$a$a;->w:Lju/a0;

    iget-object v1, p0, Lfr/j$a$a;->x:Lfr/j;

    iget-object v2, p0, Lfr/j$a$a;->y:Lkotlin/jvm/functions/Function0;

    invoke-direct {p1, v0, v1, v2, p2}, Lfr/j$a$a;-><init>(Lju/a0;Lfr/j;Lkotlin/jvm/functions/Function0;Lmt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lju/p0;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lfr/j$a$a;->invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lfr/j$a$a;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lfr/j$a$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lfr/j$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lfr/j$a$a;->v:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lfr/j$a$a;->t:Ljava/lang/Object;

    check-cast v1, Lfr/j;

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lfr/j$a$a;->x:Lfr/j;

    iput-object p1, p0, Lfr/j$a$a;->t:Ljava/lang/Object;

    const/4 v1, 0x0

    iput v1, p0, Lfr/j$a$a;->u:I

    iput v4, p0, Lfr/j$a$a;->v:I

    new-instance v1, Lju/p;

    invoke-static {p0}, Lnt/b;->c(Lmt/b;)Lmt/b;

    move-result-object v5

    invoke-direct {v1, v5, v4}, Lju/p;-><init>(Lmt/b;I)V

    invoke-virtual {v1}, Lju/p;->F()V

    new-instance v5, Lkotlin/jvm/internal/y;

    invoke-direct {v5}, Lkotlin/jvm/internal/y;-><init>()V

    invoke-static {p1}, Lfr/j;->j(Lfr/j;)Ler/a;

    move-result-object p1

    invoke-virtual {p1}, Ler/a;->b()Landroid/widget/FrameLayout;

    move-result-object p1

    const-string v6, "getRoot(...)"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lfr/j$a$a$a;

    invoke-direct {v6, v5, v1}, Lfr/j$a$a$a;-><init>(Lkotlin/jvm/internal/y;Lju/n;)V

    invoke-static {p1, v6}, Luq/g;->g(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1}, Lju/p;->z()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_3

    invoke-static {p0}, Lot/h;->c(Lmt/b;)V

    :cond_3
    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    invoke-static {}, Lju/g1;->c()Lju/n2;

    move-result-object p1

    new-instance v1, Lfr/j$a$a$b;

    iget-object v5, p0, Lfr/j$a$a;->y:Lkotlin/jvm/functions/Function0;

    invoke-direct {v1, v5, v3}, Lfr/j$a$a$b;-><init>(Lkotlin/jvm/functions/Function0;Lmt/b;)V

    iput-object v3, p0, Lfr/j$a$a;->t:Ljava/lang/Object;

    iput v2, p0, Lfr/j$a$a;->v:I

    invoke-static {p1, v1, p0}, Lju/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    iget-object p1, p0, Lfr/j$a$a;->w:Lju/a0;

    invoke-static {p1, v3, v4, v3}, Lju/d2$a;->a(Lju/d2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
