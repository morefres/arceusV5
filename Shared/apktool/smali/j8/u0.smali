.class public final Lj8/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld8/b<",
        "Lj8/t0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/a;Lft/a;Lft/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/a<",
            "Landroid/content/Context;",
            ">;",
            "Lft/a<",
            "Ljava/lang/String;",
            ">;",
            "Lft/a<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/u0;->a:Lft/a;

    iput-object p2, p0, Lj8/u0;->b:Lft/a;

    iput-object p3, p0, Lj8/u0;->c:Lft/a;

    return-void
.end method

.method public static a(Lft/a;Lft/a;Lft/a;)Lj8/u0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/a<",
            "Landroid/content/Context;",
            ">;",
            "Lft/a<",
            "Ljava/lang/String;",
            ">;",
            "Lft/a<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lj8/u0;"
        }
    .end annotation

    new-instance v0, Lj8/u0;

    invoke-direct {v0, p0, p1, p2}, Lj8/u0;-><init>(Lft/a;Lft/a;Lft/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;I)Lj8/t0;
    .locals 1

    new-instance v0, Lj8/t0;

    invoke-direct {v0, p0, p1, p2}, Lj8/t0;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public b()Lj8/t0;
    .locals 3

    iget-object v0, p0, Lj8/u0;->a:Lft/a;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lj8/u0;->b:Lft/a;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lj8/u0;->c:Lft/a;

    invoke-interface {v2}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v0, v1, v2}, Lj8/u0;->c(Landroid/content/Context;Ljava/lang/String;I)Lj8/t0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lj8/u0;->b()Lj8/t0;

    move-result-object v0

    return-object v0
.end method
