.class public final Ldn/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Ldn/x;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lmu/b0<",
            "Lgt/n<",
            "Ldn/j0;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lmu/b0<",
            "Lgt/n<",
            "Ldn/j0;",
            ">;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldn/y;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Ldn/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lmu/b0<",
            "Lgt/n<",
            "Ldn/j0;",
            ">;>;>;)",
            "Ldn/y;"
        }
    .end annotation

    new-instance v0, Ldn/y;

    invoke-direct {v0, p0}, Ldn/y;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Lmu/b0;)Ldn/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu/b0<",
            "Lgt/n<",
            "Ldn/j0;",
            ">;>;)",
            "Ldn/x;"
        }
    .end annotation

    new-instance v0, Ldn/x;

    invoke-direct {v0, p0}, Ldn/x;-><init>(Lmu/b0;)V

    return-object v0
.end method


# virtual methods
.method public b()Ldn/x;
    .locals 1

    iget-object v0, p0, Ldn/y;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmu/b0;

    invoke-static {v0}, Ldn/y;->c(Lmu/b0;)Ldn/x;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldn/y;->b()Ldn/x;

    move-result-object v0

    return-object v0
.end method
