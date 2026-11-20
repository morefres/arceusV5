.class public final Ljq/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Ljq/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lju/l0;",
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
            "Lju/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljq/b;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Ljq/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lju/l0;",
            ">;)",
            "Ljq/b;"
        }
    .end annotation

    new-instance v0, Ljq/b;

    invoke-direct {v0, p0}, Ljq/b;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Lju/l0;)Ljq/a;
    .locals 1

    new-instance v0, Ljq/a;

    invoke-direct {v0, p0}, Ljq/a;-><init>(Lju/l0;)V

    return-object v0
.end method


# virtual methods
.method public b()Ljq/a;
    .locals 1

    iget-object v0, p0, Ljq/b;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lju/l0;

    invoke-static {v0}, Ljq/b;->c(Lju/l0;)Ljq/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljq/b;->b()Ljq/a;

    move-result-object v0

    return-object v0
.end method
