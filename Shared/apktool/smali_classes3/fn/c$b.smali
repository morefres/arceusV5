.class public final Lfn/c$b;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lyt/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfn/c;->w(Lmu/p0;)Lmu/h;
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
        "-",
        "Lfn/s$d;",
        ">;",
        "Lfn/s$d;",
        "Lmt/b<",
        "-",
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lmu/i;",
        "Lfn/s$d;",
        "state",
        "",
        "<anonymous>",
        "(Lmu/i;Lfn/s$d;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lot/f;
    c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$completeWhenDestroyed$1"
    f = "Camera2Controller.kt"
    l = {
        0xca
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public synthetic v:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lmt/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmt/b<",
            "-",
            "Lfn/c$b;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lot/m;-><init>(ILmt/b;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmu/i;

    check-cast p2, Lfn/s$d;

    check-cast p3, Lmt/b;

    invoke-virtual {p0, p1, p2, p3}, Lfn/c$b;->o(Lmu/i;Lfn/s$d;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lfn/c$b;->u:Ljava/lang/Object;

    check-cast v0, Lmu/i;

    iget-object v1, p0, Lfn/c$b;->v:Ljava/lang/Object;

    check-cast v1, Lfn/s$d;

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v2

    iget v3, p0, Lfn/c$b;->t:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    invoke-static {v0}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lfn/c$b;->u:Ljava/lang/Object;

    iput-object v1, p0, Lfn/c$b;->v:Ljava/lang/Object;

    iput v4, p0, Lfn/c$b;->t:I

    invoke-interface {v0, v1, p0}, Lmu/i;->emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    sget-object p1, Lfn/s$d$b;->a:Lfn/s$d$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v4

    invoke-static {p1}, Lot/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final o(Lmu/i;Lfn/s$d;Lmt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu/i<",
            "-",
            "Lfn/s$d;",
            ">;",
            "Lfn/s$d;",
            "Lmt/b<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lfn/c$b;

    invoke-direct {v0, p3}, Lfn/c$b;-><init>(Lmt/b;)V

    iput-object p1, v0, Lfn/c$b;->u:Ljava/lang/Object;

    iput-object p2, v0, Lfn/c$b;->v:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lfn/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
