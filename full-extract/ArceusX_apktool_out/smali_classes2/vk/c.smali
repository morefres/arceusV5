.class public Lvk/c;
.super Liv/e$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvk/c$b;
    }
.end annotation


# instance fields
.field public a:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Liv/e$a;-><init>()V

    iput-object p1, p0, Lvk/c;->a:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static bridge synthetic d(Lvk/c;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lvk/c;->a:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public static e()Lvk/c;
    .locals 3

    new-instance v0, Lvk/c;

    new-instance v1, Lvk/c$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lvk/c$b;-><init>(Lvk/d;)V

    invoke-direct {v0, v1}, Lvk/c;-><init>(Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Liv/y;)Liv/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Liv/y;",
            ")",
            "Liv/e<",
            "**>;"
        }
    .end annotation

    invoke-static {p1}, Liv/e$a;->c(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    const-class p3, Liv/d;

    if-eq p2, p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 p2, 0x0

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    invoke-static {p2, p1}, Liv/e$a;->b(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p1

    new-instance p2, Lvk/c$a;

    invoke-direct {p2, p0, p1}, Lvk/c$a;-><init>(Lvk/c;Ljava/lang/reflect/Type;)V

    return-object p2
.end method
