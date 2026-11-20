.class public final Ljn/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Ljn/b;",
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

    iput-object p1, p0, Ljn/c;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Ljn/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;)",
            "Ljn/c;"
        }
    .end annotation

    new-instance v0, Ljn/c;

    invoke-direct {v0, p0}, Ljn/c;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Ljn/b;
    .locals 1

    new-instance v0, Ljn/b;

    invoke-direct {v0, p0}, Ljn/b;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()Ljn/b;
    .locals 1

    iget-object v0, p0, Ljn/c;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Ljn/c;->c(Landroid/content/Context;)Ljn/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljn/c;->b()Ljn/b;

    move-result-object v0

    return-object v0
.end method
