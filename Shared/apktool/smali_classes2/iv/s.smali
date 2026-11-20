.class public abstract Liv/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Liv/s$q;,
        Liv/s$c;,
        Liv/s$j;,
        Liv/s$o;,
        Liv/s$i;,
        Liv/s$e;,
        Liv/s$d;,
        Liv/s$h;,
        Liv/s$g;,
        Liv/s$m;,
        Liv/s$n;,
        Liv/s$l;,
        Liv/s$k;,
        Liv/s$f;,
        Liv/s$p;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Liv/v;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liv/v;",
            "TT;)V"
        }
    .end annotation
.end method

.method public final b()Liv/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Liv/s<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Liv/s$b;

    invoke-direct {v0, p0}, Liv/s$b;-><init>(Liv/s;)V

    return-object v0
.end method

.method public final c()Liv/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Liv/s<",
            "Ljava/lang/Iterable<",
            "TT;>;>;"
        }
    .end annotation

    new-instance v0, Liv/s$a;

    invoke-direct {v0, p0}, Liv/s$a;-><init>(Liv/s;)V

    return-object v0
.end method
