.class public Liv/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Liv/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liv/i;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Liv/y;)Liv/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Liv/e<",
        "Ljava/lang/Object;",
        "Liv/d<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/reflect/Type;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Liv/i;


# direct methods
.method public constructor <init>(Liv/i;Ljava/lang/reflect/Type;Ljava/util/concurrent/Executor;)V
    .locals 0

    iput-object p1, p0, Liv/i$a;->c:Liv/i;

    iput-object p2, p0, Liv/i$a;->a:Ljava/lang/reflect/Type;

    iput-object p3, p0, Liv/i$a;->b:Ljava/util/concurrent/Executor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Liv/i$a;->a:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public bridge synthetic b(Liv/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Liv/i$a;->c(Liv/d;)Liv/d;

    move-result-object p1

    return-object p1
.end method

.method public c(Liv/d;)Liv/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liv/d<",
            "Ljava/lang/Object;",
            ">;)",
            "Liv/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Liv/i$a;->b:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    new-instance v1, Liv/i$b;

    invoke-direct {v1, v0, p1}, Liv/i$b;-><init>(Ljava/util/concurrent/Executor;Liv/d;)V

    return-object v1
.end method
