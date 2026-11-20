.class public final Lcom/withpersona/sdk2/inquiry/internal/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/internal/k$b;


# instance fields
.field public final a:Lxo/c0;


# direct methods
.method public constructor <init>(Lxo/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/l;->a:Lxo/c0;

    return-void
.end method

.method public static b(Lxo/c0;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxo/c0;",
            ")",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/k$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/l;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/l;-><init>(Lxo/c0;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxo/a0;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Z)Lcom/withpersona/sdk2/inquiry/internal/k;
    .locals 7
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/l;->a:Lxo/c0;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lxo/c0;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxo/a0;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Z)Lcom/withpersona/sdk2/inquiry/internal/k;

    move-result-object p1

    return-object p1
.end method
