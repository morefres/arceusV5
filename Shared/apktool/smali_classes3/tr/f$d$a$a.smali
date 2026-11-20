.class public final Ltr/f$d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltr/f$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic a:Ltr/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltr/f<",
            "TState;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Ltr/f$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltr/f$b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ltr/f;Ltr/f$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr/f<",
            "TState;>;",
            "Ltr/f$b<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Ltr/f$d$a$a;->a:Ltr/f;

    iput-object p2, p0, Ltr/f$d$a$a;->b:Ltr/f$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Ltr/f$d$a$a;->a:Ltr/f;

    invoke-static {p2}, Ltr/f;->b(Ltr/f;)Lju/p0;

    move-result-object v0

    new-instance v3, Ltr/f$d$a$a$a;

    iget-object p2, p0, Ltr/f$d$a$a;->b:Ltr/f$b;

    const/4 v1, 0x0

    invoke-direct {v3, p2, p1, v1}, Ltr/f$d$a$a$a;-><init>(Ltr/f$b;Ljava/lang/Object;Lmt/b;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lju/i;->d(Lju/p0;Lkotlin/coroutines/CoroutineContext;Lju/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lju/d2;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
