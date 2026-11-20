.class public final Lwn/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lwn/p;",
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

    iput-object p1, p0, Lwn/q;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Lwn/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;)",
            "Lwn/q;"
        }
    .end annotation

    new-instance v0, Lwn/q;

    invoke-direct {v0, p0}, Lwn/q;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lwn/p;
    .locals 1

    new-instance v0, Lwn/p;

    invoke-direct {v0, p0}, Lwn/p;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()Lwn/p;
    .locals 1

    iget-object v0, p0, Lwn/q;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lwn/q;->c(Landroid/content/Context;)Lwn/p;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwn/q;->b()Lwn/p;

    move-result-object v0

    return-object v0
.end method
