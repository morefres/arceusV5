.class public interface abstract Lxk/h;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(JLjava/lang/String;)Liv/d;
    .param p1    # J
        .annotation runtime Llv/s;
            value = "placeId"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Llv/s;
            value = "eventType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            ")",
            "Liv/d<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation

    .annotation runtime Llv/o;
        value = "/v1/games/sessions/report/{placeId}/{eventType}"
    .end annotation
.end method
