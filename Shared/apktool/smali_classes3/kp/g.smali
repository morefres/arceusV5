.class public final Lkp/g;
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
        "Lkp/b;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Lkp/d;


# direct methods
.method public constructor <init>(Lkp/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkp/g;->a:Lkp/d;

    return-void
.end method

.method public static a(Lkp/d;)Lkp/g;
    .locals 1

    new-instance v0, Lkp/g;

    invoke-direct {v0, p0}, Lkp/g;-><init>(Lkp/d;)V

    return-object v0
.end method

.method public static b(Lkp/d;)Lg/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkp/d;",
            ")",
            "Lg/c<",
            "Lkp/b;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lkp/d;->a()Lg/c;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg/c;

    return-object p0
.end method


# virtual methods
.method public c()Lg/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg/c<",
            "Lkp/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkp/g;->a:Lkp/d;

    invoke-static {v0}, Lkp/g;->b(Lkp/d;)Lg/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkp/g;->c()Lg/c;

    move-result-object v0

    return-object v0
.end method
