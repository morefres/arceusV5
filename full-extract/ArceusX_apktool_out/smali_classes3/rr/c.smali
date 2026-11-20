.class public final Lrr/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lrr/b$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lrr/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lrr/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr/c;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Lrr/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lrr/a;",
            ">;)",
            "Lrr/c;"
        }
    .end annotation

    new-instance v0, Lrr/c;

    invoke-direct {v0, p0}, Lrr/c;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Lrr/a;)Lrr/b$a;
    .locals 1

    new-instance v0, Lrr/b$a;

    invoke-direct {v0, p0}, Lrr/b$a;-><init>(Lrr/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lrr/b$a;
    .locals 1

    iget-object v0, p0, Lrr/c;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrr/a;

    invoke-static {v0}, Lrr/c;->c(Lrr/a;)Lrr/b$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lrr/c;->b()Lrr/b$a;

    move-result-object v0

    return-object v0
.end method
