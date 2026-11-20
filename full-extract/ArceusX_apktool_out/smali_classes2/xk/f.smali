.class public interface abstract Lxk/f;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(J)Liv/d;
    .param p1    # J
        .annotation runtime Llv/s;
            value = "requesterUserId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Liv/d<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation

    .annotation runtime Llv/o;
        value = "/v1/users/{requesterUserId}/decline-friend-request"
    .end annotation
.end method

.method public abstract b(J)Liv/d;
    .param p1    # J
        .annotation runtime Llv/s;
            value = "requesterUserId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Liv/d<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation

    .annotation runtime Llv/o;
        value = "/v1/users/{requesterUserId}/accept-friend-request"
    .end annotation
.end method
