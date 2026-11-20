.class public final Ldn/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Ldn/r0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Leo/e;",
            ">;"
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
            "Leo/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldn/s0;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Ldn/s0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Leo/e;",
            ">;)",
            "Ldn/s0;"
        }
    .end annotation

    new-instance v0, Ldn/s0;

    invoke-direct {v0, p0}, Ldn/s0;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Leo/e;)Ldn/r0;
    .locals 1

    new-instance v0, Ldn/r0;

    invoke-direct {v0, p0}, Ldn/r0;-><init>(Leo/e;)V

    return-object v0
.end method


# virtual methods
.method public b()Ldn/r0;
    .locals 1

    iget-object v0, p0, Ldn/s0;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leo/e;

    invoke-static {v0}, Ldn/s0;->c(Leo/e;)Ldn/r0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldn/s0;->b()Ldn/r0;

    move-result-object v0

    return-object v0
.end method
