.class public final Lwp/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Ljava/util/Set<",
        "Lym/a0<",
        "*>;>;>;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/selfie/d;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lxp/p0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/selfie/d;",
            ">;",
            "Ldt/i<",
            "Lxp/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwp/b0;->a:Ldt/i;

    iput-object p2, p0, Lwp/b0;->b:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;)Lwp/b0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/selfie/d;",
            ">;",
            "Ldt/i<",
            "Lxp/p0;",
            ">;)",
            "Lwp/b0;"
        }
    .end annotation

    new-instance v0, Lwp/b0;

    invoke-direct {v0, p0, p1}, Lwp/b0;-><init>(Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lcom/withpersona/sdk2/inquiry/selfie/d;Lxp/p0;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/d;",
            "Lxp/p0;",
            ")",
            "Ljava/util/Set<",
            "Lym/a0<",
            "*>;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/j;->a(Lcom/withpersona/sdk2/inquiry/selfie/d;Lxp/p0;)Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method


# virtual methods
.method public b()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lym/a0<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lwp/b0;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/d;

    iget-object v1, p0, Lwp/b0;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxp/p0;

    invoke-static {v0, v1}, Lwp/b0;->c(Lcom/withpersona/sdk2/inquiry/selfie/d;Lxp/p0;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwp/b0;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
