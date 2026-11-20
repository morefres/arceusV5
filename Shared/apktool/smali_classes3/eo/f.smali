.class public final Leo/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Leo/e;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ljava/util/Set<",
            "Leo/d;",
            ">;>;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Landroidx/lifecycle/l0;",
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
            "Ljava/util/Set<",
            "Leo/d;",
            ">;>;",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Landroidx/lifecycle/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leo/f;->a:Ldt/i;

    iput-object p2, p0, Leo/f;->b:Ldt/i;

    iput-object p3, p0, Leo/f;->c:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;)Leo/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Ljava/util/Set<",
            "Leo/d;",
            ">;>;",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Landroidx/lifecycle/l0;",
            ">;)",
            "Leo/f;"
        }
    .end annotation

    new-instance v0, Leo/f;

    invoke-direct {v0, p0, p1, p2}, Leo/f;-><init>(Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Ljava/util/Set;Landroid/content/Context;Landroidx/lifecycle/l0;)Leo/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Leo/d;",
            ">;",
            "Landroid/content/Context;",
            "Landroidx/lifecycle/l0;",
            ")",
            "Leo/e;"
        }
    .end annotation

    new-instance v0, Leo/e;

    invoke-direct {v0, p0, p1, p2}, Leo/e;-><init>(Ljava/util/Set;Landroid/content/Context;Landroidx/lifecycle/l0;)V

    return-object v0
.end method


# virtual methods
.method public b()Leo/e;
    .locals 3

    iget-object v0, p0, Leo/f;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    iget-object v1, p0, Leo/f;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Leo/f;->c:Ldt/i;

    invoke-interface {v2}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/l0;

    invoke-static {v0, v1, v2}, Leo/f;->c(Ljava/util/Set;Landroid/content/Context;Landroidx/lifecycle/l0;)Leo/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Leo/f;->b()Leo/e;

    move-result-object v0

    return-object v0
.end method
