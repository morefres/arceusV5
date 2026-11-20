.class public final Lkp/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lg/c<",
        "Landroid/net/Uri;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Lkp/i;


# direct methods
.method public constructor <init>(Lkp/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkp/p;->a:Lkp/i;

    return-void
.end method

.method public static a(Lkp/i;)Lkp/p;
    .locals 1

    new-instance v0, Lkp/p;

    invoke-direct {v0, p0}, Lkp/p;-><init>(Lkp/i;)V

    return-object v0
.end method

.method public static c(Lkp/i;)Lg/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkp/i;",
            ")",
            "Lg/c<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lkp/i;->c()Lg/c;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg/c;

    return-object p0
.end method


# virtual methods
.method public b()Lg/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg/c<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkp/p;->a:Lkp/i;

    invoke-static {v0}, Lkp/p;->c(Lkp/i;)Lg/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkp/p;->b()Lg/c;

    move-result-object v0

    return-object v0
.end method
