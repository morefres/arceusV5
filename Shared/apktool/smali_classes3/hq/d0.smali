.class public final Lhq/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lhq/k;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhq/c0;

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lhq/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhq/c0;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhq/c0;",
            "Ldt/i<",
            "Lhq/x;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhq/d0;->a:Lhq/c0;

    iput-object p2, p0, Lhq/d0;->b:Ldt/i;

    return-void
.end method

.method public static a(Lhq/c0;Ldt/i;)Lhq/d0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhq/c0;",
            "Ldt/i<",
            "Lhq/x;",
            ">;)",
            "Lhq/d0;"
        }
    .end annotation

    new-instance v0, Lhq/d0;

    invoke-direct {v0, p0, p1}, Lhq/d0;-><init>(Lhq/c0;Ldt/i;)V

    return-object v0
.end method

.method public static b(Lhq/c0;Lhq/x;)Lhq/k;
    .locals 0

    invoke-virtual {p0, p1}, Lhq/c0;->a(Lhq/x;)Lhq/k;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lhq/k;

    return-object p0
.end method


# virtual methods
.method public c()Lhq/k;
    .locals 2

    iget-object v0, p0, Lhq/d0;->a:Lhq/c0;

    iget-object v1, p0, Lhq/d0;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhq/x;

    invoke-static {v0, v1}, Lhq/d0;->b(Lhq/c0;Lhq/x;)Lhq/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lhq/d0;->c()Lhq/k;

    move-result-object v0

    return-object v0
.end method
