.class public Lsm/u$d$a;
.super Lsm/u$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsm/u$d;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lsm/u<",
        "TK;TV;>.f<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic e:Lsm/u$d;


# direct methods
.method public constructor <init>(Lsm/u$d;)V
    .locals 0

    iput-object p1, p0, Lsm/u$d$a;->e:Lsm/u$d;

    iget-object p1, p1, Lsm/u$d;->a:Lsm/u;

    invoke-direct {p0, p1}, Lsm/u$f;-><init>(Lsm/u;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lsm/u$f;->b()Lsm/u$g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsm/u$d$a;->d()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
