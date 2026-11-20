.class public final Lnq/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lnq/c;",
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
            "Lju/p0;",
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
            "Lnq/e;",
            ">;",
            "Ldt/i<",
            "Lju/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnq/d;->a:Ldt/i;

    iput-object p2, p0, Lnq/d;->b:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;)Lnq/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lnq/e;",
            ">;",
            "Ldt/i<",
            "Lju/p0;",
            ">;)",
            "Lnq/d;"
        }
    .end annotation

    new-instance v0, Lnq/d;

    invoke-direct {v0, p0, p1}, Lnq/d;-><init>(Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lnq/e;Lju/p0;)Lnq/c;
    .locals 1

    new-instance v0, Lnq/c;

    invoke-direct {v0, p0, p1}, Lnq/c;-><init>(Lnq/e;Lju/p0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lnq/c;
    .locals 2

    iget-object v0, p0, Lnq/d;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnq/e;

    iget-object v1, p0, Lnq/d;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lju/p0;

    invoke-static {v0, v1}, Lnq/d;->c(Lnq/e;Lju/p0;)Lnq/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnq/d;->b()Lnq/c;

    move-result-object v0

    return-object v0
.end method
