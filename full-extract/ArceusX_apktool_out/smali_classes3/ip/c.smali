.class public final Lip/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lfp/e0$b;",
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
            "Lfp/e0$b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lip/c;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Lip/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lfp/e0$b;",
            ">;)",
            "Lip/c;"
        }
    .end annotation

    new-instance v0, Lip/c;

    invoke-direct {v0, p0}, Lip/c;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;Lfp/e0$b;)Lcom/withpersona/sdk2/inquiry/internal/workflows/c;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/workflows/c;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/workflows/c;-><init>(Landroidx/lifecycle/l0;Lfp/e0$b;)V

    return-object v0
.end method


# virtual methods
.method public b(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/internal/workflows/c;
    .locals 1

    iget-object v0, p0, Lip/c;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfp/e0$b;

    invoke-static {p1, v0}, Lip/c;->c(Landroidx/lifecycle/l0;Lfp/e0$b;)Lcom/withpersona/sdk2/inquiry/internal/workflows/c;

    move-result-object p1

    return-object p1
.end method
