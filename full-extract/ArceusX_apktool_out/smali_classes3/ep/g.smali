.class public final Lep/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/network/f;

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Liv/y;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/network/f;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/network/f;",
            "Ldt/i<",
            "Liv/y;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/g;->a:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    iput-object p2, p0, Lep/g;->b:Ldt/i;

    return-void
.end method

.method public static a(Lcom/withpersona/sdk2/inquiry/internal/network/f;Ldt/i;)Lep/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/network/f;",
            "Ldt/i<",
            "Liv/y;",
            ">;)",
            "Lep/g;"
        }
    .end annotation

    new-instance v0, Lep/g;

    invoke-direct {v0, p0, p1}, Lep/g;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/f;Ldt/i;)V

    return-object v0
.end method

.method public static b(Lcom/withpersona/sdk2/inquiry/internal/network/f;Liv/y;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/network/f;->b(Liv/y;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;

    return-object p0
.end method


# virtual methods
.method public c()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;
    .locals 2

    iget-object v0, p0, Lep/g;->a:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    iget-object v1, p0, Lep/g;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Liv/y;

    invoke-static {v0, v1}, Lep/g;->b(Lcom/withpersona/sdk2/inquiry/internal/network/f;Liv/y;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lep/g;->c()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;

    move-result-object v0

    return-object v0
.end method
