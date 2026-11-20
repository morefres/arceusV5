.class public final Lmo/a$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmo/a$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmu/i<",
            "Lmo/a$c;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:Lmo/a;


# direct methods
.method public constructor <init>(Lmu/i;Lmo/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu/i<",
            "-",
            "Lmo/a$c;",
            ">;",
            "Lmo/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lmo/a$e$a;->a:Lmu/i;

    iput-object p2, p0, Lmo/a$e$a;->b:Lmo/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;
    .locals 3
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

    check-cast p1, Lgt/n;

    invoke-virtual {p1}, Lgt/n;->j()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lmo/a$e$a;->a:Lmu/i;

    iget-object v1, p0, Lmo/a$e$a;->b:Lmo/a;

    invoke-static {p1}, Lgt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_0

    check-cast p1, Ldn/j0;

    invoke-static {v1, p1}, Lmo/a;->e(Lmo/a;Ldn/j0;)Lmo/a$c;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lmu/i;->emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    invoke-interface {v0, p1, p2}, Lmu/i;->emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
