.class public final Lxu/d$c;
.super Lot/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxu/d;->f(Lwu/l;Lwu/h0;Z)Lkotlin/sequences/Sequence;
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
    c = "okio.internal.-FileSystem$commonListRecursively$1"
    f = "FileSystem.kt"
    l = {
        0x60
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public final synthetic A:Lwu/l;

.field public final synthetic B:Z

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lwu/h0;


# direct methods
.method public constructor <init>(Lwu/h0;Lwu/l;ZLmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwu/h0;",
            "Lwu/l;",
            "Z",
            "Lmt/b<",
            "-",
            "Lxu/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxu/d$c;->z:Lwu/h0;

    iput-object p2, p0, Lxu/d$c;->A:Lwu/l;

    iput-boolean p3, p0, Lxu/d$c;->B:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lot/k;-><init>(ILmt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lmt/b;)Lmt/b;
    .locals 4
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

    new-instance v0, Lxu/d$c;

    iget-object v1, p0, Lxu/d$c;->z:Lwu/h0;

    iget-object v2, p0, Lxu/d$c;->A:Lwu/l;

    iget-boolean v3, p0, Lxu/d$c;->B:Z

    invoke-direct {v0, v1, v2, v3, p2}, Lxu/d$c;-><init>(Lwu/h0;Lwu/l;ZLmt/b;)V

    iput-object p1, v0, Lxu/d$c;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhu/h;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lxu/d$c;->o(Lhu/h;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lxu/d$c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhu/h;

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v2, p0, Lxu/d$c;->x:I

    const/4 v8, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v8, :cond_0

    iget-object v2, p0, Lxu/d$c;->w:Ljava/lang/Object;

    check-cast v2, Lwu/h0;

    iget-object v2, p0, Lxu/d$c;->v:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v3, p0, Lxu/d$c;->u:Ljava/lang/Object;

    check-cast v3, Lkotlin/collections/i;

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/collections/i;

    invoke-direct {p1}, Lkotlin/collections/i;-><init>()V

    iget-object v2, p0, Lxu/d$c;->z:Lwu/h0;

    invoke-virtual {p1, v2}, Lkotlin/collections/i;->addLast(Ljava/lang/Object;)V

    iget-object v2, p0, Lxu/d$c;->A:Lwu/l;

    iget-object v3, p0, Lxu/d$c;->z:Lwu/h0;

    invoke-virtual {v2, v3}, Lwu/l;->list(Lwu/h0;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v3, p1

    :goto_0
    move-object p1, v2

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lwu/h0;

    iget-object v2, p0, Lxu/d$c;->A:Lwu/l;

    iget-boolean v5, p0, Lxu/d$c;->B:Z

    iput-object v1, p0, Lxu/d$c;->y:Ljava/lang/Object;

    iput-object v3, p0, Lxu/d$c;->u:Ljava/lang/Object;

    iput-object p1, p0, Lxu/d$c;->v:Ljava/lang/Object;

    invoke-static {v4}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lxu/d$c;->w:Ljava/lang/Object;

    iput v8, p0, Lxu/d$c;->x:I

    const/4 v6, 0x0

    move-object v7, p0

    invoke-static/range {v1 .. v7}, Lxu/d;->a(Lhu/h;Lwu/l;Lkotlin/collections/i;Lwu/h0;ZZLmt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2

    return-object v0

    :cond_3
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

    invoke-virtual {p0, p1, p2}, Lxu/d$c;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lxu/d$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lxu/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
