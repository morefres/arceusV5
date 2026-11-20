.class public Lsm/u$e$a;
.super Lsm/u$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsm/u$e;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lsm/u<",
        "TK;TV;>.f<TK;>;"
    }
.end annotation


# instance fields
.field public final synthetic e:Lsm/u$e;


# direct methods
.method public constructor <init>(Lsm/u$e;)V
    .locals 0

    iput-object p1, p0, Lsm/u$e$a;->e:Lsm/u$e;

    iget-object p1, p1, Lsm/u$e;->a:Lsm/u;

    invoke-direct {p0, p1}, Lsm/u$f;-><init>(Lsm/u;)V

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    invoke-virtual {p0}, Lsm/u$f;->b()Lsm/u$g;

    move-result-object v0

    iget-object v0, v0, Lsm/u$g;->f:Ljava/lang/Object;

    return-object v0
.end method
