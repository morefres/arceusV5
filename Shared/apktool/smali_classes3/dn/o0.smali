.class public final Ldn/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Ldn/n0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ldn/r0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lmu/b0<",
            "Lin/c;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Ldn/r0;",
            ">;",
            "Ldt/i<",
            "Lmu/b0<",
            "Lin/c;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldn/o0;->a:Ldt/i;

    iput-object p2, p0, Ldn/o0;->b:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;)Ldn/o0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Ldn/r0;",
            ">;",
            "Ldt/i<",
            "Lmu/b0<",
            "Lin/c;",
            ">;>;)",
            "Ldn/o0;"
        }
    .end annotation

    new-instance v0, Ldn/o0;

    invoke-direct {v0, p0, p1}, Ldn/o0;-><init>(Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Ldn/r0;Lmu/b0;)Ldn/n0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldn/r0;",
            "Lmu/b0<",
            "Lin/c;",
            ">;)",
            "Ldn/n0;"
        }
    .end annotation

    new-instance v0, Ldn/n0;

    invoke-direct {v0, p0, p1}, Ldn/n0;-><init>(Ldn/r0;Lmu/b0;)V

    return-object v0
.end method


# virtual methods
.method public b()Ldn/n0;
    .locals 2

    iget-object v0, p0, Ldn/o0;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldn/r0;

    iget-object v1, p0, Ldn/o0;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmu/b0;

    invoke-static {v0, v1}, Ldn/o0;->c(Ldn/r0;Lmu/b0;)Ldn/n0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldn/o0;->b()Ldn/n0;

    move-result-object v0

    return-object v0
.end method
