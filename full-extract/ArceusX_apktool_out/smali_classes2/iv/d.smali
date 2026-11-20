.class public interface abstract Liv/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# virtual methods
.method public abstract F(Liv/f;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liv/f<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public abstract cancel()V
.end method

.method public abstract clone()Liv/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Liv/d<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract execute()Liv/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Liv/x<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract isCanceled()Z
.end method

.method public abstract request()Lokhttp3/Request;
.end method
