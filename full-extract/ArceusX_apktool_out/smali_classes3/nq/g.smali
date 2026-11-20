.class public final Lnq/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lnq/e;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lnq/f;


# direct methods
.method public constructor <init>(Lnq/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnq/g;->a:Lnq/f;

    return-void
.end method

.method public static a(Lnq/f;)Lnq/g;
    .locals 1

    new-instance v0, Lnq/g;

    invoke-direct {v0, p0}, Lnq/g;-><init>(Lnq/f;)V

    return-object v0
.end method

.method public static b(Lnq/f;)Lnq/e;
    .locals 0

    invoke-virtual {p0}, Lnq/f;->a()Lnq/e;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnq/e;

    return-object p0
.end method


# virtual methods
.method public c()Lnq/e;
    .locals 1

    iget-object v0, p0, Lnq/g;->a:Lnq/f;

    invoke-static {v0}, Lnq/g;->b(Lnq/f;)Lnq/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnq/g;->c()Lnq/e;

    move-result-object v0

    return-object v0
.end method
