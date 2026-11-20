.class public final Lao/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyq/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lyq/f<",
        "Lcom/withpersona/sdk2/inquiry/document/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lao/a;",
        "Lyq/f;",
        "Lcom/withpersona/sdk2/inquiry/document/b;",
        "wrapped",
        "<init>",
        "(Lyq/f;)V",
        "rendering",
        "Ltq/a;",
        "systemUiController",
        "",
        "b",
        "(Lcom/withpersona/sdk2/inquiry/document/b;Ltq/a;)V",
        "Lyq/f;",
        "document_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:Lyq/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyq/f<",
            "Lcom/withpersona/sdk2/inquiry/document/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lyq/f;)V
    .locals 1
    .param p1    # Lyq/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyq/f<",
            "Lcom/withpersona/sdk2/inquiry/document/b;",
            ">;)V"
        }
    .end annotation

    const-string v0, "wrapped"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lao/a;->b:Lyq/f;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ltq/a;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/b;

    invoke-virtual {p0, p1, p2}, Lao/a;->b(Lcom/withpersona/sdk2/inquiry/document/b;Ltq/a;)V

    return-void
.end method

.method public b(Lcom/withpersona/sdk2/inquiry/document/b;Ltq/a;)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/document/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltq/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "rendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lao/a;->b:Lyq/f;

    invoke-interface {v0, p1, p2}, Lyq/f;->a(Ljava/lang/Object;Ltq/a;)V

    return-void
.end method
