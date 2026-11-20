.class public Lcom/withpersona/sdk2/inquiry/internal/e$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/e$f;->p(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/internal/network/f;Lkp/q;Ldn/k;Lkp/w;Loq/a;Lxo/n;Lkp/d;Lkp/i;Lup/f;Lop/e;Ljp/c;Lkq/b;Lbp/c;Lhq/c0;Ljq/c;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;Lnq/f;Lkp/c0;Lwn/e;Leo/g;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/i<",
        "Loo/p$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/internal/e$f;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$f$a;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Loo/p$a;
    .locals 3

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/e$d;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$f$a;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/internal/e$f;->k(Lcom/withpersona/sdk2/inquiry/internal/e$f;)Lcom/withpersona/sdk2/inquiry/internal/e$f;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/internal/e$d;-><init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;Lxo/e;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/e$f$a;->a()Loo/p$a;

    move-result-object v0

    return-object v0
.end method
