.class public final Lmu/z$a$b;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmu/z$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmu/z$a$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lot/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lmu/k0;",
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lmu/k0;",
        "it",
        "",
        "<anonymous>",
        "(Lmu/k0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lot/f;
    c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2"
    f = "Share.kt"
    l = {
        0xdf
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lmu/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmu/h<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic w:Lmu/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmu/b0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic x:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lmu/h;Lmu/b0;Ljava/lang/Object;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu/h<",
            "+TT;>;",
            "Lmu/b0<",
            "TT;>;TT;",
            "Lmt/b<",
            "-",
            "Lmu/z$a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmu/z$a$b;->v:Lmu/h;

    iput-object p2, p0, Lmu/z$a$b;->w:Lmu/b0;

    iput-object p3, p0, Lmu/z$a$b;->x:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lot/m;-><init>(ILmt/b;)V

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

    new-instance v0, Lmu/z$a$b;

    iget-object v1, p0, Lmu/z$a$b;->v:Lmu/h;

    iget-object v2, p0, Lmu/z$a$b;->w:Lmu/b0;

    iget-object v3, p0, Lmu/z$a$b;->x:Ljava/lang/Object;

    invoke-direct {v0, v1, v2, v3, p2}, Lmu/z$a$b;-><init>(Lmu/h;Lmu/b0;Ljava/lang/Object;Lmt/b;)V

    iput-object p1, v0, Lmu/z$a$b;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmu/k0;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lmu/z$a$b;->o(Lmu/k0;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lmu/z$a$b;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lmu/z$a$b;->u:Ljava/lang/Object;

    check-cast p1, Lmu/k0;

    sget-object v1, Lmu/z$a$b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    if-eq p1, v2, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_5

    const/4 v0, 0x3

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Lmu/z$a$b;->x:Ljava/lang/Object;

    sget-object v0, Lmu/i0;->a:Lpu/e0;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lmu/z$a$b;->w:Lmu/b0;

    invoke-interface {p1}, Lmu/b0;->j()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lmu/z$a$b;->w:Lmu/b0;

    invoke-interface {v0, p1}, Lmu/b0;->a(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Lot/b;->a(Z)Ljava/lang/Boolean;

    goto :goto_0

    :cond_3
    new-instance p1, Lgt/l;

    invoke-direct {p1}, Lgt/l;-><init>()V

    throw p1

    :cond_4
    iget-object p1, p0, Lmu/z$a$b;->v:Lmu/h;

    iget-object v1, p0, Lmu/z$a$b;->w:Lmu/b0;

    iput v2, p0, Lmu/z$a$b;->t:I

    invoke-interface {p1, v1, p0}, Lmu/h;->collect(Lmu/i;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final o(Lmu/k0;Lmt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu/k0;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lmu/z$a$b;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lmu/z$a$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lmu/z$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
