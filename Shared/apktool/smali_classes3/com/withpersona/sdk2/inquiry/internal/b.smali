.class public final Lcom/withpersona/sdk2/inquiry/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/internal/a$a;


# instance fields
.field public final a:Lxo/c;


# direct methods
.method public constructor <init>(Lxo/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/b;->a:Lxo/c;

    return-void
.end method

.method public static b(Lxo/c;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxo/c;",
            ")",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/a$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/b;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/b;-><init>(Lxo/c;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;)Lcom/withpersona/sdk2/inquiry/internal/a;
    .locals 1
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/b;->a:Lxo/c;

    invoke-virtual {v0, p1, p2}, Lxo/c;->b(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;)Lcom/withpersona/sdk2/inquiry/internal/a;

    move-result-object p1

    return-object p1
.end method
