.class public final Lcom/withpersona/sdk2/inquiry/internal/workflows/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;


# instance fields
.field public final a:Lip/d;


# direct methods
.method public constructor <init>(Lip/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/f;->a:Lip/d;

    return-void
.end method

.method public static b(Lip/d;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lip/d;",
            ")",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/workflows/f;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/f;-><init>(Lip/d;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/internal/workflows/e;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/f;->a:Lip/d;

    invoke-virtual {v0, p1}, Lip/d;->b(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/internal/workflows/e;

    move-result-object p1

    return-object p1
.end method
