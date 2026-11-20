.class public final Lcom/withpersona/sdk2/inquiry/internal/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/internal/o$a;


# instance fields
.field public final a:Lxo/i0;


# direct methods
.method public constructor <init>(Lxo/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/p;->a:Lxo/i0;

    return-void
.end method

.method public static b(Lxo/i0;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxo/i0;",
            ")",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/o$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/p;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/p;-><init>(Lxo/i0;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/o;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/p;->a:Lxo/i0;

    invoke-virtual {v0, p1, p2, p3}, Lxo/i0;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/o;

    move-result-object p1

    return-object p1
.end method
