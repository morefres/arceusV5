.class public interface abstract Lqn/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Lqn/f;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static b(Lon/s;Lqn/h;)Lqn/f;
    .locals 2

    new-instance v0, Lmn/k;

    sget-object v1, Lmn/k$a;->a:Lmn/k$a;

    invoke-direct {v0, v1, p0, p1}, Lmn/k;-><init>(Lmn/k$a;Lon/s;Lqn/h;)V

    return-object v0
.end method


# virtual methods
.method public abstract c()Lqn/f;
.end method
