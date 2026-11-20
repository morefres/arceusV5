.class public final Lhq/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhq/y$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lhq/x;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lhq/y;
    .locals 1

    sget-object v0, Lhq/y$a;->a:Lhq/y;

    return-object v0
.end method

.method public static c()Lhq/x;
    .locals 1

    new-instance v0, Lhq/x;

    invoke-direct {v0}, Lhq/x;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lhq/x;
    .locals 1

    invoke-static {}, Lhq/y;->c()Lhq/x;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lhq/y;->b()Lhq/x;

    move-result-object v0

    return-object v0
.end method
