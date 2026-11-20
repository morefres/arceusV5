.class public final Lwn/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lwn/t;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lwn/m;",
            ">;"
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
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Lwn/m;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwn/u;->a:Ldt/i;

    iput-object p2, p0, Lwn/u;->b:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;)Lwn/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Lwn/m;",
            ">;)",
            "Lwn/u;"
        }
    .end annotation

    new-instance v0, Lwn/u;

    invoke-direct {v0, p0, p1}, Lwn/u;-><init>(Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lwn/m;)Lwn/t;
    .locals 1

    new-instance v0, Lwn/t;

    invoke-direct {v0, p0, p1}, Lwn/t;-><init>(Landroid/content/Context;Lwn/m;)V

    return-object v0
.end method


# virtual methods
.method public b()Lwn/t;
    .locals 2

    iget-object v0, p0, Lwn/u;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lwn/u;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwn/m;

    invoke-static {v0, v1}, Lwn/u;->c(Landroid/content/Context;Lwn/m;)Lwn/t;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwn/u;->b()Lwn/t;

    move-result-object v0

    return-object v0
.end method
