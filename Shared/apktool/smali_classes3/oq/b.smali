.class public final Loq/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Loq/c;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Loq/a;


# direct methods
.method public constructor <init>(Loq/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loq/b;->a:Loq/a;

    return-void
.end method

.method public static a(Loq/a;)Loq/b;
    .locals 1

    new-instance v0, Loq/b;

    invoke-direct {v0, p0}, Loq/b;-><init>(Loq/a;)V

    return-object v0
.end method

.method public static c(Loq/a;)Loq/c;
    .locals 0

    invoke-virtual {p0}, Loq/a;->a()Loq/c;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Loq/c;

    return-object p0
.end method


# virtual methods
.method public b()Loq/c;
    .locals 1

    iget-object v0, p0, Loq/b;->a:Loq/a;

    invoke-static {v0}, Loq/b;->c(Loq/a;)Loq/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Loq/b;->b()Loq/c;

    move-result-object v0

    return-object v0
.end method
