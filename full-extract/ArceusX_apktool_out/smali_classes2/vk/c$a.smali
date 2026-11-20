.class public Lvk/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Liv/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvk/c;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Liv/y;)Liv/e;
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

.field public final synthetic b:Lvk/c;


# direct methods
.method public constructor <init>(Lvk/c;Ljava/lang/reflect/Type;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lvk/c$a;->b:Lvk/c;

    iput-object p2, p0, Lvk/c$a;->a:Ljava/lang/reflect/Type;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lvk/c$a;->a:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public bridge synthetic b(Liv/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lvk/c$a;->c(Liv/d;)Liv/d;

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

    new-instance v0, Lvk/b;

    iget-object v1, p0, Lvk/c$a;->b:Lvk/c;

    invoke-static {v1}, Lvk/c;->d(Lvk/c;)Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lvk/b;-><init>(Ljava/util/concurrent/Executor;Liv/d;)V

    return-object v0
.end method
