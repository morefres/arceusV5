.class public final Lcom/withpersona/sdk2/inquiry/internal/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/internal/m$a;


# instance fields
.field public final a:Lxo/h0;


# direct methods
.method public constructor <init>(Lxo/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/n;->a:Lxo/h0;

    return-void
.end method

.method public static a(Lxo/h0;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxo/h0;",
            ")",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/m$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/n;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/n;-><init>(Lxo/h0;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/m;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/n;->a:Lxo/h0;

    invoke-virtual {v0, p1}, Lxo/h0;->b(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/m;

    move-result-object p1

    return-object p1
.end method
