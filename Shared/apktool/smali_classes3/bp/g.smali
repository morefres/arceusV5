.class public final Lbp/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Landroidx/lifecycle/l0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lbp/c;


# direct methods
.method public constructor <init>(Lbp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbp/g;->a:Lbp/c;

    return-void
.end method

.method public static a(Lbp/c;)Lbp/g;
    .locals 1

    new-instance v0, Lbp/g;

    invoke-direct {v0, p0}, Lbp/g;-><init>(Lbp/c;)V

    return-object v0
.end method

.method public static c(Lbp/c;)Landroidx/lifecycle/l0;
    .locals 0

    invoke-virtual {p0}, Lbp/c;->d()Landroidx/lifecycle/l0;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/l0;

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/lifecycle/l0;
    .locals 1

    iget-object v0, p0, Lbp/g;->a:Lbp/c;

    invoke-static {v0}, Lbp/g;->c(Lbp/c;)Landroidx/lifecycle/l0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbp/g;->b()Landroidx/lifecycle/l0;

    move-result-object v0

    return-object v0
.end method
