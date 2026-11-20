.class public final Lh8/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld8/b<",
        "Li8/x;",
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
            "Lj8/d;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Li8/f;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Ll8/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/a;Lft/a;Lft/a;Lft/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/a<",
            "Landroid/content/Context;",
            ">;",
            "Lft/a<",
            "Lj8/d;",
            ">;",
            "Lft/a<",
            "Li8/f;",
            ">;",
            "Lft/a<",
            "Ll8/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh8/i;->a:Lft/a;

    iput-object p2, p0, Lh8/i;->b:Lft/a;

    iput-object p3, p0, Lh8/i;->c:Lft/a;

    iput-object p4, p0, Lh8/i;->d:Lft/a;

    return-void
.end method

.method public static a(Lft/a;Lft/a;Lft/a;Lft/a;)Lh8/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/a<",
            "Landroid/content/Context;",
            ">;",
            "Lft/a<",
            "Lj8/d;",
            ">;",
            "Lft/a<",
            "Li8/f;",
            ">;",
            "Lft/a<",
            "Ll8/a;",
            ">;)",
            "Lh8/i;"
        }
    .end annotation

    new-instance v0, Lh8/i;

    invoke-direct {v0, p0, p1, p2, p3}, Lh8/i;-><init>(Lft/a;Lft/a;Lft/a;Lft/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lj8/d;Li8/f;Ll8/a;)Li8/x;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lh8/h;->a(Landroid/content/Context;Lj8/d;Li8/f;Ll8/a;)Li8/x;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Ld8/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li8/x;

    return-object p0
.end method


# virtual methods
.method public b()Li8/x;
    .locals 4

    iget-object v0, p0, Lh8/i;->a:Lft/a;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lh8/i;->b:Lft/a;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj8/d;

    iget-object v2, p0, Lh8/i;->c:Lft/a;

    invoke-interface {v2}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li8/f;

    iget-object v3, p0, Lh8/i;->d:Lft/a;

    invoke-interface {v3}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll8/a;

    invoke-static {v0, v1, v2, v3}, Lh8/i;->c(Landroid/content/Context;Lj8/d;Li8/f;Ll8/a;)Li8/x;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lh8/i;->b()Li8/x;

    move-result-object v0

    return-object v0
.end method
