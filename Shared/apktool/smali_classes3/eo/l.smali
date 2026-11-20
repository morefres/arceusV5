.class public final Leo/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Leo/d;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Leo/g;


# direct methods
.method public constructor <init>(Leo/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leo/l;->a:Leo/g;

    return-void
.end method

.method public static a(Leo/g;)Leo/l;
    .locals 1

    new-instance v0, Leo/l;

    invoke-direct {v0, p0}, Leo/l;-><init>(Leo/g;)V

    return-object v0
.end method

.method public static b(Leo/g;)Leo/d;
    .locals 0

    invoke-virtual {p0}, Leo/g;->e()Leo/d;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Leo/d;

    return-object p0
.end method


# virtual methods
.method public c()Leo/d;
    .locals 1

    iget-object v0, p0, Leo/l;->a:Leo/g;

    invoke-static {v0}, Leo/l;->b(Leo/g;)Leo/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Leo/l;->c()Leo/d;

    move-result-object v0

    return-object v0
.end method
