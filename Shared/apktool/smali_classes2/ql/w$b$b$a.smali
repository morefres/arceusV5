.class public final Lql/w$b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lql/w$b$b;->collect(Lmu/i;Lmt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lmu/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lmu/i;


# direct methods
.method public constructor <init>(Lmu/i;)V
    .locals 0

    iput-object p1, p0, Lql/w$b$b$a;->a:Lmu/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lql/w$b$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lql/w$b$b$a$a;

    iget v1, v0, Lql/w$b$b$a$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lql/w$b$b$a$a;->u:I

    goto :goto_0

    :cond_0
    new-instance v0, Lql/w$b$b$a$a;

    invoke-direct {v0, p0, p2}, Lql/w$b$b$a$a;-><init>(Lql/w$b$b$a;Lmt/b;)V

    :goto_0
    iget-object p2, v0, Lql/w$b$b$a$a;->t:Ljava/lang/Object;

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lql/w$b$b$a$a;->u:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lql/w$b$b$a$a;->z:Ljava/lang/Object;

    check-cast p1, Lmu/i;

    iget-object p1, v0, Lql/w$b$b$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lql/w$b$b$a$a;

    invoke-static {p2}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lql/w$b$b$a;->a:Lmu/i;

    move-object v2, p1

    check-cast v2, Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {p1}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lql/w$b$b$a$a;->v:Ljava/lang/Object;

    invoke-static {v0}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lql/w$b$b$a$a;->w:Ljava/lang/Object;

    invoke-static {p1}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lql/w$b$b$a$a;->y:Ljava/lang/Object;

    invoke-static {p2}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lql/w$b$b$a$a;->z:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lql/w$b$b$a$a;->A:I

    iput v3, v0, Lql/w$b$b$a$a;->u:I

    invoke-interface {p2, p1, v0}, Lmu/i;->emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
