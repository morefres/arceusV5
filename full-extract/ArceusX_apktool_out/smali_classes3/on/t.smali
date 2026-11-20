.class public Lon/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lon/t$a;,
        Lon/t$b;
    }
.end annotation


# direct methods
.method public static a(Lon/s;Lon/s;)Ljava/lang/Iterable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lon/s;",
            "Lon/s;",
            ")",
            "Ljava/lang/Iterable<",
            "Lon/s;",
            ">;"
        }
    .end annotation

    new-instance v0, Lon/t$a;

    invoke-virtual {p0}, Lon/s;->f()Lon/s;

    move-result-object p0

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lon/t$a;-><init>(Lon/s;Lon/s;Lon/u;)V

    return-object v0
.end method
