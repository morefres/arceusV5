.class public final Lhq/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Ltq/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhq/c0;


# direct methods
.method public constructor <init>(Lhq/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhq/f0;->a:Lhq/c0;

    return-void
.end method

.method public static a(Lhq/c0;)Lhq/f0;
    .locals 1

    new-instance v0, Lhq/f0;

    invoke-direct {v0, p0}, Lhq/f0;-><init>(Lhq/c0;)V

    return-object v0
.end method

.method public static c(Lhq/c0;)Ltq/a;
    .locals 0

    invoke-virtual {p0}, Lhq/c0;->c()Ltq/a;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ltq/a;

    return-object p0
.end method


# virtual methods
.method public b()Ltq/a;
    .locals 1

    iget-object v0, p0, Lhq/f0;->a:Lhq/c0;

    invoke-static {v0}, Lhq/f0;->c(Lhq/c0;)Ltq/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lhq/f0;->b()Ltq/a;

    move-result-object v0

    return-object v0
.end method
