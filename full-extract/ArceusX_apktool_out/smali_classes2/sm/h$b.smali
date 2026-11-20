.class public Lsm/h$b;
.super Lsm/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsm/h;->lenient()Lsm/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lsm/h<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lsm/h;

.field public final synthetic b:Lsm/h;


# direct methods
.method public constructor <init>(Lsm/h;Lsm/h;)V
    .locals 0

    iput-object p1, p0, Lsm/h$b;->b:Lsm/h;

    iput-object p2, p0, Lsm/h$b;->a:Lsm/h;

    invoke-direct {p0}, Lsm/h;-><init>()V

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

    invoke-virtual {p1}, Lsm/m;->g()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lsm/m;->L(Z)V

    :try_start_0
    iget-object v1, p0, Lsm/h$b;->a:Lsm/h;

    invoke-virtual {v1, p1}, Lsm/h;->fromJson(Lsm/m;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v0}, Lsm/m;->L(Z)V

    return-object v1

    :catchall_0
    move-exception v1

    invoke-virtual {p1, v0}, Lsm/m;->L(Z)V

    throw v1
.end method

.method public isLenient()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toJson(Lsm/t;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsm/t;",
            "TT;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lsm/t;->l()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lsm/t;->y(Z)V

    :try_start_0
    iget-object v1, p0, Lsm/h$b;->a:Lsm/h;

    invoke-virtual {v1, p1, p2}, Lsm/h;->toJson(Lsm/t;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v0}, Lsm/t;->y(Z)V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1, v0}, Lsm/t;->y(Z)V

    throw p2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lsm/h$b;->a:Lsm/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".lenient()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
