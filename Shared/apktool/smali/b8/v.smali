.class public final Lb8/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld8/b<",
        "Lb8/t;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Ll8/a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Ll8/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Lh8/e;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Li8/r;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Li8/v;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/a<",
            "Ll8/a;",
            ">;",
            "Lft/a<",
            "Ll8/a;",
            ">;",
            "Lft/a<",
            "Lh8/e;",
            ">;",
            "Lft/a<",
            "Li8/r;",
            ">;",
            "Lft/a<",
            "Li8/v;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8/v;->a:Lft/a;

    iput-object p2, p0, Lb8/v;->b:Lft/a;

    iput-object p3, p0, Lb8/v;->c:Lft/a;

    iput-object p4, p0, Lb8/v;->d:Lft/a;

    iput-object p5, p0, Lb8/v;->e:Lft/a;

    return-void
.end method

.method public static a(Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;)Lb8/v;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/a<",
            "Ll8/a;",
            ">;",
            "Lft/a<",
            "Ll8/a;",
            ">;",
            "Lft/a<",
            "Lh8/e;",
            ">;",
            "Lft/a<",
            "Li8/r;",
            ">;",
            "Lft/a<",
            "Li8/v;",
            ">;)",
            "Lb8/v;"
        }
    .end annotation

    new-instance v0, Lb8/v;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lb8/v;-><init>(Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;)V

    return-object v0
.end method

.method public static c(Ll8/a;Ll8/a;Lh8/e;Li8/r;Li8/v;)Lb8/t;
    .locals 6

    new-instance v0, Lb8/t;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lb8/t;-><init>(Ll8/a;Ll8/a;Lh8/e;Li8/r;Li8/v;)V

    return-object v0
.end method


# virtual methods
.method public b()Lb8/t;
    .locals 5

    iget-object v0, p0, Lb8/v;->a:Lft/a;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll8/a;

    iget-object v1, p0, Lb8/v;->b:Lft/a;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll8/a;

    iget-object v2, p0, Lb8/v;->c:Lft/a;

    invoke-interface {v2}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh8/e;

    iget-object v3, p0, Lb8/v;->d:Lft/a;

    invoke-interface {v3}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li8/r;

    iget-object v4, p0, Lb8/v;->e:Lft/a;

    invoke-interface {v4}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li8/v;

    invoke-static {v0, v1, v2, v3, v4}, Lb8/v;->c(Ll8/a;Ll8/a;Lh8/e;Li8/r;Li8/v;)Lb8/t;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb8/v;->b()Lb8/t;

    move-result-object v0

    return-object v0
.end method
