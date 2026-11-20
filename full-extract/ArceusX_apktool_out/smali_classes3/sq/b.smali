.class public final Lsq/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lsq/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lnq/e;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Leo/e;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lju/p0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lnq/e;",
            ">;",
            "Ldt/i<",
            "Leo/e;",
            ">;",
            "Ldt/i<",
            "Lju/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsq/b;->a:Ldt/i;

    iput-object p2, p0, Lsq/b;->b:Ldt/i;

    iput-object p3, p0, Lsq/b;->c:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;)Lsq/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lnq/e;",
            ">;",
            "Ldt/i<",
            "Leo/e;",
            ">;",
            "Ldt/i<",
            "Lju/p0;",
            ">;)",
            "Lsq/b;"
        }
    .end annotation

    new-instance v0, Lsq/b;

    invoke-direct {v0, p0, p1, p2}, Lsq/b;-><init>(Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lnq/e;Leo/e;Lju/p0;)Lsq/a;
    .locals 1

    new-instance v0, Lsq/a;

    invoke-direct {v0, p0, p1, p2}, Lsq/a;-><init>(Lnq/e;Leo/e;Lju/p0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lsq/a;
    .locals 3

    iget-object v0, p0, Lsq/b;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnq/e;

    iget-object v1, p0, Lsq/b;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leo/e;

    iget-object v2, p0, Lsq/b;->c:Ldt/i;

    invoke-interface {v2}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lju/p0;

    invoke-static {v0, v1, v2}, Lsq/b;->c(Lnq/e;Leo/e;Lju/p0;)Lsq/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsq/b;->b()Lsq/a;

    move-result-object v0

    return-object v0
.end method
