.class public final Lbp/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lco/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lbp/c;

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lbp/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbp/c;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbp/c;",
            "Ldt/i<",
            "Lbp/i;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbp/f;->a:Lbp/c;

    iput-object p2, p0, Lbp/f;->b:Ldt/i;

    return-void
.end method

.method public static a(Lbp/c;Ldt/i;)Lbp/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbp/c;",
            "Ldt/i<",
            "Lbp/i;",
            ">;)",
            "Lbp/f;"
        }
    .end annotation

    new-instance v0, Lbp/f;

    invoke-direct {v0, p0, p1}, Lbp/f;-><init>(Lbp/c;Ldt/i;)V

    return-object v0
.end method

.method public static b(Lbp/c;Lbp/i;)Lco/a;
    .locals 0

    invoke-virtual {p0, p1}, Lbp/c;->c(Lbp/i;)Lco/a;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/a;

    return-object p0
.end method


# virtual methods
.method public c()Lco/a;
    .locals 2

    iget-object v0, p0, Lbp/f;->a:Lbp/c;

    iget-object v1, p0, Lbp/f;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbp/i;

    invoke-static {v0, v1}, Lbp/f;->b(Lbp/c;Lbp/i;)Lco/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbp/f;->c()Lco/a;

    move-result-object v0

    return-object v0
.end method
