.class public final Lwn/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lwn/r;",
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


# direct methods
.method public constructor <init>(Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwn/s;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Lwn/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;)",
            "Lwn/s;"
        }
    .end annotation

    new-instance v0, Lwn/s;

    invoke-direct {v0, p0}, Lwn/s;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lwn/r;
    .locals 1

    new-instance v0, Lwn/r;

    invoke-direct {v0, p0}, Lwn/r;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()Lwn/r;
    .locals 1

    iget-object v0, p0, Lwn/s;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lwn/s;->c(Landroid/content/Context;)Lwn/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwn/s;->b()Lwn/r;

    move-result-object v0

    return-object v0
.end method
