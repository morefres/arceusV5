.class public final Lxo/x$a$b;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxo/x$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1$2"
    f = "InquiryViewModel.kt"
    l = {
        0x72
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lxo/x;


# direct methods
.method public constructor <init>(Lxo/x;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxo/x;",
            "Lmt/b<",
            "-",
            "Lxo/x$a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxo/x$a$b;->u:Lxo/x;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lot/m;-><init>(ILmt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lmt/b;)Lmt/b;
    .locals 1
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

    new-instance p1, Lxo/x$a$b;

    iget-object v0, p0, Lxo/x$a$b;->u:Lxo/x;

    invoke-direct {p1, v0, p2}, Lxo/x$a$b;-><init>(Lxo/x;Lmt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lju/p0;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lxo/x$a$b;->invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lxo/x$a$b;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lxo/x$a$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lxo/x$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lxo/x$a$b;->t:I

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

    iget-object p1, p0, Lxo/x$a$b;->u:Lxo/x;

    invoke-virtual {p1}, Lxo/x;->l()Lmu/b0;

    move-result-object p1

    new-instance v1, Lxo/x$a$b$a;

    iget-object v3, p0, Lxo/x$a$b;->u:Lxo/x;

    invoke-direct {v1, v3}, Lxo/x$a$b$a;-><init>(Lxo/x;)V

    iput v2, p0, Lxo/x$a$b;->t:I

    invoke-interface {p1, v1, p0}, Lmu/g0;->collect(Lmu/i;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    new-instance p1, Lgt/d;

    invoke-direct {p1}, Lgt/d;-><init>()V

    throw p1
.end method
