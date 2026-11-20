.class public final Lxu/d$b;
.super Lot/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxu/d;->d(Lwu/l;Lwu/h0;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lot/k;",
        "Lkotlin/jvm/functions/Function2<",
        "Lhu/h<",
        "-",
        "Lwu/h0;",
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lhu/h;",
        "Lwu/h0;",
        "",
        "<anonymous>",
        "(Lhu/h;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lot/f;
    c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1"
    f = "FileSystem.kt"
    l = {
        0x4b
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lwu/l;

.field public final synthetic x:Lwu/h0;


# direct methods
.method public constructor <init>(Lwu/l;Lwu/h0;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwu/l;",
            "Lwu/h0;",
            "Lmt/b<",
            "-",
            "Lxu/d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxu/d$b;->w:Lwu/l;

    iput-object p2, p0, Lxu/d$b;->x:Lwu/h0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lot/k;-><init>(ILmt/b;)V

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

    new-instance v0, Lxu/d$b;

    iget-object v1, p0, Lxu/d$b;->w:Lwu/l;

    iget-object v2, p0, Lxu/d$b;->x:Lwu/h0;

    invoke-direct {v0, v1, v2, p2}, Lxu/d$b;-><init>(Lwu/l;Lwu/h0;Lmt/b;)V

    iput-object p1, v0, Lxu/d$b;->v:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhu/h;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lxu/d$b;->o(Lhu/h;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lxu/d$b;->v:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhu/h;

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v2, p0, Lxu/d$b;->u:I

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

    iget-object v2, p0, Lxu/d$b;->w:Lwu/l;

    move p1, v3

    new-instance v3, Lkotlin/collections/i;

    invoke-direct {v3}, Lkotlin/collections/i;-><init>()V

    iget-object v4, p0, Lxu/d$b;->x:Lwu/h0;

    invoke-static {v1}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lxu/d$b;->v:Ljava/lang/Object;

    iput p1, p0, Lxu/d$b;->u:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v7, p0

    invoke-static/range {v1 .. v7}, Lxu/d;->a(Lhu/h;Lwu/l;Lkotlin/collections/i;Lwu/h0;ZZLmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final o(Lhu/h;Lmt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhu/h<",
            "-",
            "Lwu/h0;",
            ">;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lxu/d$b;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lxu/d$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lxu/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
