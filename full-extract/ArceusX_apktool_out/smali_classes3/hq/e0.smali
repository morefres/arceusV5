.class public final Lhq/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lpq/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhq/c0;

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lpq/c;",
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
            "Lpq/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhq/e0;->a:Lhq/c0;

    iput-object p2, p0, Lhq/e0;->b:Ldt/i;

    return-void
.end method

.method public static a(Lhq/c0;Ldt/i;)Lhq/e0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhq/c0;",
            "Ldt/i<",
            "Lpq/c;",
            ">;)",
            "Lhq/e0;"
        }
    .end annotation

    new-instance v0, Lhq/e0;

    invoke-direct {v0, p0, p1}, Lhq/e0;-><init>(Lhq/c0;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lhq/c0;Lpq/c;)Lpq/a;
    .locals 0

    invoke-virtual {p0, p1}, Lhq/c0;->b(Lpq/c;)Lpq/a;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpq/a;

    return-object p0
.end method


# virtual methods
.method public b()Lpq/a;
    .locals 2

    iget-object v0, p0, Lhq/e0;->a:Lhq/c0;

    iget-object v1, p0, Lhq/e0;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpq/c;

    invoke-static {v0, v1}, Lhq/e0;->c(Lhq/c0;Lpq/c;)Lpq/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lhq/e0;->b()Lpq/a;

    move-result-object v0

    return-object v0
.end method
