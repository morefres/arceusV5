.class public final Lzn/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwm/o;
.implements Ltr/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzn/a$a;,
        Lzn/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwm/o<",
        "Lzn/a$b;",
        ">;",
        "Ltr/h<",
        "Lzn/a$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0016\u0011B)\u0008\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\u0008\u00030\u0001H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\u0008\u00030\u0003H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0018R\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0017\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lzn/a;",
        "Lwm/o;",
        "Lzn/a$b;",
        "Ltr/h;",
        "",
        "sessionToken",
        "Lzn/c;",
        "service",
        "documentId",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;",
        "remoteDocument",
        "<init>",
        "(Ljava/lang/String;Lzn/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V",
        "otherWorker",
        "",
        "c",
        "(Lwm/o;)Z",
        "a",
        "(Ltr/h;)Z",
        "Lmu/h;",
        "run",
        "()Lmu/h;",
        "b",
        "Ljava/lang/String;",
        "Lzn/c;",
        "d",
        "getDocumentId",
        "()Ljava/lang/String;",
        "e",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;",
        "f",
        "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;",
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
.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lzn/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lzn/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lzn/a;->b:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lzn/a;->c:Lzn/c;

    .line 5
    iput-object p3, p0, Lzn/a;->d:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lzn/a;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lzn/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lzn/a;-><init>(Ljava/lang/String;Lzn/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V

    return-void
.end method

.method public static final synthetic d(Lzn/a;)Lzn/c;
    .locals 0

    iget-object p0, p0, Lzn/a;->c:Lzn/c;

    return-object p0
.end method

.method public static final synthetic e(Lzn/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lzn/a;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public a(Ltr/h;)Z
    .locals 2
    .param p1    # Ltr/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr/h<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lzn/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzn/a;->b:Ljava/lang/String;

    check-cast p1, Lzn/a;

    iget-object v1, p1, Lzn/a;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzn/a;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    iget-object p1, p1, Lzn/a;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b(Ltr/h;)Z
    .locals 0
    .param p1    # Ltr/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr/h<",
            "*>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Ltr/h;->b(Ltr/h;)Z

    move-result p1

    return p1
.end method

.method public c(Lwm/o;)Z
    .locals 2
    .param p1    # Lwm/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwm/o<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lzn/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzn/a;->b:Ljava/lang/String;

    check-cast p1, Lzn/a;

    iget-object v1, p1, Lzn/a;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzn/a;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    iget-object p1, p1, Lzn/a;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final f()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lzn/a;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    return-object v0
.end method

.method public run()Lmu/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmu/h<",
            "Lzn/a$b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lzn/a$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lzn/a$c;-><init>(Lzn/a;Lmt/b;)V

    invoke-static {v0}, Lmu/j;->w(Lkotlin/jvm/functions/Function2;)Lmu/h;

    move-result-object v0

    return-object v0
.end method
