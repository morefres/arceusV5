.class public final Lcp/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcp/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lcp/d;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcp/e;
    .locals 1

    sget-object v0, Lcp/e$a;->a:Lcp/e;

    return-object v0
.end method

.method public static c()Lcp/d;
    .locals 1

    new-instance v0, Lcp/d;

    invoke-direct {v0}, Lcp/d;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lcp/d;
    .locals 1

    invoke-static {}, Lcp/e;->c()Lcp/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcp/e;->b()Lcp/d;

    move-result-object v0

    return-object v0
.end method
