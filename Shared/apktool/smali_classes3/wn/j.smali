.class public final Lwn/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lwn/m;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwn/e;

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lwn/b0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwn/e;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwn/e;",
            "Ldt/i<",
            "Lwn/b0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwn/j;->a:Lwn/e;

    iput-object p2, p0, Lwn/j;->b:Ldt/i;

    return-void
.end method

.method public static a(Lwn/e;Ldt/i;)Lwn/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwn/e;",
            "Ldt/i<",
            "Lwn/b0;",
            ">;)",
            "Lwn/j;"
        }
    .end annotation

    new-instance v0, Lwn/j;

    invoke-direct {v0, p0, p1}, Lwn/j;-><init>(Lwn/e;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lwn/e;Lwn/b0;)Lwn/m;
    .locals 0

    invoke-virtual {p0, p1}, Lwn/e;->e(Lwn/b0;)Lwn/m;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lwn/m;

    return-object p0
.end method


# virtual methods
.method public b()Lwn/m;
    .locals 2

    iget-object v0, p0, Lwn/j;->a:Lwn/e;

    iget-object v1, p0, Lwn/j;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwn/b0;

    invoke-static {v0, v1}, Lwn/j;->c(Lwn/e;Lwn/b0;)Lwn/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwn/j;->b()Lwn/m;

    move-result-object v0

    return-object v0
.end method
