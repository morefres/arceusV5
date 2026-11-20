.class public final Lmi/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmi/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\t\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J3\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lmi/f;",
        "",
        "<init>",
        "()V",
        "",
        "conversationId",
        "",
        "conversationGuid",
        "message",
        "Lmi/f$a;",
        "onFailed",
        "",
        "d",
        "(JLjava/lang/String;Ljava/lang/String;Lmi/f$a;)V",
        "c",
        "(JLjava/lang/String;)V",
        "userId",
        "b",
        "(J)V",
        "a",
        "NativeShell_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lmi/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmi/f;

    invoke-direct {v0}, Lmi/f;-><init>()V

    sput-object v0, Lmi/f;->a:Lmi/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(J)V
    .locals 3

    sget-object v0, Lmi/c;->a:Lmi/c;

    new-instance v1, Lmi/f$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lmi/f$b;-><init>(JLmt/b;)V

    invoke-virtual {v0, v1}, Lmi/c;->f(Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public static final b(J)V
    .locals 3

    sget-object v0, Lmi/c;->a:Lmi/c;

    new-instance v1, Lmi/f$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lmi/f$c;-><init>(JLmt/b;)V

    invoke-virtual {v0, v1}, Lmi/c;->f(Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public static final c(JLjava/lang/String;)V
    .locals 3
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    sget-object v0, Lmi/c;->a:Lmi/c;

    new-instance v1, Lmi/f$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lmi/f$d;-><init>(JLjava/lang/String;Lmt/b;)V

    invoke-virtual {v0, v1}, Lmi/c;->f(Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public static final d(JLjava/lang/String;Ljava/lang/String;Lmi/f$a;)V
    .locals 9
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lmi/f$a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    sget-object v1, Lmi/c;->a:Lmi/c;

    new-instance v2, Lmi/f$e;

    const/4 v8, 0x0

    move-wide v3, p0

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v8}, Lmi/f$e;-><init>(JLjava/lang/String;Ljava/lang/String;Lmi/f$a;Lmt/b;)V

    invoke-virtual {v1, v0, v2}, Lmi/c;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
