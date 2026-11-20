.class public final Lkq/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lkq/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lkq/b;


# direct methods
.method public constructor <init>(Lkq/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkq/c;->a:Lkq/b;

    return-void
.end method

.method public static a(Lkq/b;)Lkq/c;
    .locals 1

    new-instance v0, Lkq/c;

    invoke-direct {v0, p0}, Lkq/c;-><init>(Lkq/b;)V

    return-object v0
.end method

.method public static b(Lkq/b;)Lkq/a;
    .locals 0

    invoke-virtual {p0}, Lkq/b;->a()Lkq/a;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkq/a;

    return-object p0
.end method


# virtual methods
.method public c()Lkq/a;
    .locals 1

    iget-object v0, p0, Lkq/c;->a:Lkq/b;

    invoke-static {v0}, Lkq/c;->b(Lkq/b;)Lkq/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkq/c;->c()Lkq/a;

    move-result-object v0

    return-object v0
.end method
