.class public final Lgo/m;
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
            "Lio/z;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lio/z;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgo/m;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Lgo/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lio/z;",
            ">;)",
            "Lgo/m;"
        }
    .end annotation

    new-instance v0, Lgo/m;

    invoke-direct {v0, p0}, Lgo/m;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Lio/z;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/z;",
            ")",
            "Ljava/util/Set<",
            "Lym/a0<",
            "*>;>;"
        }
    .end annotation

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/k;->b(Lio/z;)Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method


# virtual methods
.method public b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lym/a0<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lgo/m;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/z;

    invoke-static {v0}, Lgo/m;->c(Lio/z;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgo/m;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
