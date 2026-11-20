.class public final Lj8/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld8/b<",
        "Lj8/m0;",
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
            "Lj8/e;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Lj8/t0;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Ljava/lang/String;",
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
            "Lj8/e;",
            ">;",
            "Lft/a<",
            "Lj8/t0;",
            ">;",
            "Lft/a<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/n0;->a:Lft/a;

    iput-object p2, p0, Lj8/n0;->b:Lft/a;

    iput-object p3, p0, Lj8/n0;->c:Lft/a;

    iput-object p4, p0, Lj8/n0;->d:Lft/a;

    iput-object p5, p0, Lj8/n0;->e:Lft/a;

    return-void
.end method

.method public static a(Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;)Lj8/n0;
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
            "Lj8/e;",
            ">;",
            "Lft/a<",
            "Lj8/t0;",
            ">;",
            "Lft/a<",
            "Ljava/lang/String;",
            ">;)",
            "Lj8/n0;"
        }
    .end annotation

    new-instance v0, Lj8/n0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lj8/n0;-><init>(Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;)V

    return-object v0
.end method

.method public static c(Ll8/a;Ll8/a;Ljava/lang/Object;Ljava/lang/Object;Lft/a;)Lj8/m0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll8/a;",
            "Ll8/a;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lft/a<",
            "Ljava/lang/String;",
            ">;)",
            "Lj8/m0;"
        }
    .end annotation

    new-instance v0, Lj8/m0;

    move-object v3, p2

    check-cast v3, Lj8/e;

    move-object v4, p3

    check-cast v4, Lj8/t0;

    move-object v1, p0

    move-object v2, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lj8/m0;-><init>(Ll8/a;Ll8/a;Lj8/e;Lj8/t0;Lft/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lj8/m0;
    .locals 5

    iget-object v0, p0, Lj8/n0;->a:Lft/a;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll8/a;

    iget-object v1, p0, Lj8/n0;->b:Lft/a;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll8/a;

    iget-object v2, p0, Lj8/n0;->c:Lft/a;

    invoke-interface {v2}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lj8/n0;->d:Lft/a;

    invoke-interface {v3}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lj8/n0;->e:Lft/a;

    invoke-static {v0, v1, v2, v3, v4}, Lj8/n0;->c(Ll8/a;Ll8/a;Ljava/lang/Object;Ljava/lang/Object;Lft/a;)Lj8/m0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lj8/n0;->b()Lj8/m0;

    move-result-object v0

    return-object v0
.end method
