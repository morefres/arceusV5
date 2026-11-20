.class public final Lcom/withpersona/sdk2/inquiry/internal/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/internal/c$a;


# instance fields
.field public final a:Lxo/d;


# direct methods
.method public constructor <init>(Lxo/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/d;->a:Lxo/d;

    return-void
.end method

.method public static b(Lxo/d;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxo/d;",
            ")",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/c$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/d;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/d;-><init>(Lxo/d;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lep/e;)Lcom/withpersona/sdk2/inquiry/internal/c;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/d;->a:Lxo/d;

    invoke-virtual {v0, p1}, Lxo/d;->b(Lep/e;)Lcom/withpersona/sdk2/inquiry/internal/c;

    move-result-object p1

    return-object p1
.end method
