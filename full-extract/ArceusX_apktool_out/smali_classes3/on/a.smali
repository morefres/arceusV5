.class public abstract Lon/a;
.super Lon/s;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lon/s;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic g()Lon/s;
    .locals 1

    invoke-virtual {p0}, Lon/a;->o()Lon/a;

    move-result-object v0

    return-object v0
.end method

.method public k(Lon/s;)V
    .locals 1

    instance-of v0, p1, Lon/a;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lon/s;->k(Lon/s;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Parent of block must also be block (can not be inline)"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public o()Lon/a;
    .locals 1

    invoke-super {p0}, Lon/s;->g()Lon/s;

    move-result-object v0

    check-cast v0, Lon/a;

    return-object v0
.end method
