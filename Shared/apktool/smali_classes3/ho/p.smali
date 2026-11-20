.class public final Lho/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lho/n;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lsq/a;",
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
            "Lsq/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lho/p;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Lho/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lsq/a;",
            ">;)",
            "Lho/p;"
        }
    .end annotation

    new-instance v0, Lho/p;

    invoke-direct {v0, p0}, Lho/p;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Lsq/a;)Lho/n;
    .locals 1

    new-instance v0, Lho/n;

    invoke-direct {v0, p0}, Lho/n;-><init>(Lsq/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lho/n;
    .locals 1

    iget-object v0, p0, Lho/p;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsq/a;

    invoke-static {v0}, Lho/p;->c(Lsq/a;)Lho/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lho/p;->b()Lho/n;

    move-result-object v0

    return-object v0
.end method
