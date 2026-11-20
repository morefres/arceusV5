.class public final Lym/s$a;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lym/s;->b(Lym/r;Landroid/widget/EditText;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lju/p0;",
        "",
        "<anonymous>",
        "(Lju/p0;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation

.annotation runtime Lot/f;
    c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt$control$subscription$1"
    f = "TextControllerControlEditText.kt"
    l = {
        0x2f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lym/r;

.field public final synthetic w:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Lym/r;Landroid/widget/EditText;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/r;",
            "Landroid/widget/EditText;",
            "Lmt/b<",
            "-",
            "Lym/s$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lym/s$a;->v:Lym/r;

    iput-object p2, p0, Lym/s$a;->w:Landroid/widget/EditText;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lot/m;-><init>(ILmt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lmt/b;)Lmt/b;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lym/s$a;

    iget-object v1, p0, Lym/s$a;->v:Lym/r;

    iget-object v2, p0, Lym/s$a;->w:Landroid/widget/EditText;

    invoke-direct {v0, v1, v2, p2}, Lym/s$a;-><init>(Lym/r;Landroid/widget/EditText;Lmt/b;)V

    iput-object p1, v0, Lym/s$a;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lju/p0;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lym/s$a;->invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lju/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
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

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lym/s$a;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lym/s$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lym/s$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lym/s$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lym/s$a;->u:Ljava/lang/Object;

    check-cast p1, Lju/p0;

    iget-object v1, p0, Lym/s$a;->v:Lym/r;

    invoke-interface {v1}, Lym/r;->a()Lmu/h;

    move-result-object v1

    new-instance v3, Lym/s$a$a;

    iget-object v4, p0, Lym/s$a;->w:Landroid/widget/EditText;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lym/s$a$a;-><init>(Landroid/widget/EditText;Lmt/b;)V

    invoke-static {v1, v3}, Lmu/j;->E(Lmu/h;Lkotlin/jvm/functions/Function2;)Lmu/h;

    move-result-object v1

    invoke-static {v1, p1}, Lmu/j;->z(Lmu/h;Lju/p0;)Lju/d2;

    iget-object p1, p0, Lym/s$a;->w:Landroid/widget/EditText;

    new-instance v1, Lym/s$a$b;

    iget-object v3, p0, Lym/s$a;->v:Lym/r;

    invoke-direct {v1, v3}, Lym/s$a$b;-><init>(Lym/r;)V

    iput v2, p0, Lym/s$a;->t:I

    invoke-static {p1, v1, p0}, Lym/s;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    new-instance p1, Lgt/d;

    invoke-direct {p1}, Lgt/d;-><init>()V

    throw p1
.end method
