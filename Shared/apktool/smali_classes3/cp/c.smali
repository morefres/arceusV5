.class public final Lcp/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lcp/a;",
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
            "Llp/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcp/f;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lju/l0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Llp/e$a;",
            ">;",
            "Ldt/i<",
            "Lcp/f;",
            ">;",
            "Ldt/i<",
            "Lju/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcp/c;->a:Ldt/i;

    iput-object p2, p0, Lcp/c;->b:Ldt/i;

    iput-object p3, p0, Lcp/c;->c:Ldt/i;

    iput-object p4, p0, Lcp/c;->d:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lcp/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Llp/e$a;",
            ">;",
            "Ldt/i<",
            "Lcp/f;",
            ">;",
            "Ldt/i<",
            "Lju/l0;",
            ">;)",
            "Lcp/c;"
        }
    .end annotation

    new-instance v0, Lcp/c;

    invoke-direct {v0, p0, p1, p2, p3}, Lcp/c;-><init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Llp/e$a;Lcp/f;Lju/l0;)Lcp/a;
    .locals 1

    new-instance v0, Lcp/a;

    invoke-direct {v0, p0, p1, p2, p3}, Lcp/a;-><init>(Landroid/content/Context;Llp/e$a;Lcp/f;Lju/l0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcp/a;
    .locals 4

    iget-object v0, p0, Lcp/c;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcp/c;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llp/e$a;

    iget-object v2, p0, Lcp/c;->c:Ldt/i;

    invoke-interface {v2}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcp/f;

    iget-object v3, p0, Lcp/c;->d:Ldt/i;

    invoke-interface {v3}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lju/l0;

    invoke-static {v0, v1, v2, v3}, Lcp/c;->c(Landroid/content/Context;Llp/e$a;Lcp/f;Lju/l0;)Lcp/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcp/c;->b()Lcp/a;

    move-result-object v0

    return-object v0
.end method
