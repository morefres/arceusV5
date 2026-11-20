.class public final Lfn/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfn/j0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lfn/i0;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lfn/j0;
    .locals 1

    sget-object v0, Lfn/j0$a;->a:Lfn/j0;

    return-object v0
.end method

.method public static c()Lfn/i0;
    .locals 1

    new-instance v0, Lfn/i0;

    invoke-direct {v0}, Lfn/i0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lfn/i0;
    .locals 1

    invoke-static {}, Lfn/j0;->c()Lfn/i0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfn/j0;->b()Lfn/i0;

    move-result-object v0

    return-object v0
.end method
