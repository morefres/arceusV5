.class public final Liv/n$a;
.super Liv/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Liv/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseT:",
        "Ljava/lang/Object;",
        "ReturnT:",
        "Ljava/lang/Object;",
        ">",
        "Liv/n<",
        "TResponseT;TReturnT;>;"
    }
.end annotation


# instance fields
.field public final d:Liv/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Liv/e<",
            "TResponseT;TReturnT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Liv/w;Lokhttp3/Call$Factory;Liv/h;Liv/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liv/w;",
            "Lokhttp3/Call$Factory;",
            "Liv/h<",
            "Lokhttp3/ResponseBody;",
            "TResponseT;>;",
            "Liv/e<",
            "TResponseT;TReturnT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Liv/n;-><init>(Liv/w;Lokhttp3/Call$Factory;Liv/h;)V

    iput-object p4, p0, Liv/n$a;->d:Liv/e;

    return-void
.end method


# virtual methods
.method public c(Liv/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liv/d<",
            "TResponseT;>;[",
            "Ljava/lang/Object;",
            ")TReturnT;"
        }
    .end annotation

    iget-object p2, p0, Liv/n$a;->d:Liv/e;

    invoke-interface {p2, p1}, Liv/e;->b(Liv/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
