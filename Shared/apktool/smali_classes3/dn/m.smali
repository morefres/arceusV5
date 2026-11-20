.class public final Ldn/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lmu/b0<",
        "Lgt/n<",
        "Ldn/j0;",
        ">;>;>;"
    }
.end annotation


# instance fields
.field public final a:Ldn/k;


# direct methods
.method public constructor <init>(Ldn/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldn/m;->a:Ldn/k;

    return-void
.end method

.method public static a(Ldn/k;)Ldn/m;
    .locals 1

    new-instance v0, Ldn/m;

    invoke-direct {v0, p0}, Ldn/m;-><init>(Ldn/k;)V

    return-object v0
.end method

.method public static c(Ldn/k;)Lmu/b0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldn/k;",
            ")",
            "Lmu/b0<",
            "Lgt/n<",
            "Ldn/j0;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Ldn/k;->b()Lmu/b0;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmu/b0;

    return-object p0
.end method


# virtual methods
.method public b()Lmu/b0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmu/b0<",
            "Lgt/n<",
            "Ldn/j0;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Ldn/m;->a:Ldn/k;

    invoke-static {v0}, Ldn/m;->c(Ldn/k;)Lmu/b0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldn/m;->b()Lmu/b0;

    move-result-object v0

    return-object v0
.end method
