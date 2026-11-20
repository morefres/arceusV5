.class public final Lum/b;
.super Lsm/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lsm/h<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lsm/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsm/h<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsm/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsm/h<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lsm/h;-><init>()V

    iput-object p1, p0, Lum/b;->a:Lsm/h;

    return-void
.end method


# virtual methods
.method public fromJson(Lsm/m;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsm/m;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Lsm/m;->u()Lsm/m$c;

    move-result-object v0

    sget-object v1, Lsm/m$c;->i:Lsm/m$c;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lsm/m;->o()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lum/b;->a:Lsm/h;

    invoke-virtual {v0, p1}, Lsm/h;->fromJson(Lsm/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lsm/t;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsm/t;",
            "TT;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lsm/t;->o()Lsm/t;

    return-void

    :cond_0
    iget-object v0, p0, Lum/b;->a:Lsm/h;

    invoke-virtual {v0, p1, p2}, Lsm/h;->toJson(Lsm/t;Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lum/b;->a:Lsm/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".nullSafe()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
