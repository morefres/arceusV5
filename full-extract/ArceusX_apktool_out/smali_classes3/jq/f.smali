.class public final Ljq/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lju/l0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljq/c;


# direct methods
.method public constructor <init>(Ljq/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljq/f;->a:Ljq/c;

    return-void
.end method

.method public static a(Ljq/c;)Ljq/f;
    .locals 1

    new-instance v0, Ljq/f;

    invoke-direct {v0, p0}, Ljq/f;-><init>(Ljq/c;)V

    return-object v0
.end method

.method public static c(Ljq/c;)Lju/l0;
    .locals 0

    invoke-virtual {p0}, Ljq/c;->c()Lju/l0;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lju/l0;

    return-object p0
.end method


# virtual methods
.method public b()Lju/l0;
    .locals 1

    iget-object v0, p0, Ljq/f;->a:Ljq/c;

    invoke-static {v0}, Ljq/f;->c(Ljq/c;)Lju/l0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljq/f;->b()Lju/l0;

    move-result-object v0

    return-object v0
.end method
