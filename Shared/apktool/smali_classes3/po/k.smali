.class public final Lpo/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lpo/i;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lsq/a;",
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
            "Lsq/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpo/k;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Lpo/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lsq/a;",
            ">;)",
            "Lpo/k;"
        }
    .end annotation

    new-instance v0, Lpo/k;

    invoke-direct {v0, p0}, Lpo/k;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Lsq/a;)Lpo/i;
    .locals 1

    new-instance v0, Lpo/i;

    invoke-direct {v0, p0}, Lpo/i;-><init>(Lsq/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lpo/i;
    .locals 1

    iget-object v0, p0, Lpo/k;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsq/a;

    invoke-static {v0}, Lpo/k;->c(Lsq/a;)Lpo/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lpo/k;->b()Lpo/i;

    move-result-object v0

    return-object v0
.end method
