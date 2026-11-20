.class public final Lkk/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkk/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001b\u0010\u000c\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\t\u001a\u0004\u0008\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lkk/c$a;",
        "",
        "<init>",
        "()V",
        "Lkk/c;",
        "c",
        "()Lkk/c;",
        "Lju/l0;",
        "dedicatedUnpackDispatcher$delegate",
        "Lgt/h;",
        "b",
        "()Lju/l0;",
        "dedicatedUnpackDispatcher",
        "instance$delegate",
        "d",
        "instance",
        "",
        "CACERT_RELATIVE_PATH",
        "Ljava/lang/String;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkk/c$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lkk/c$a;)Lju/l0;
    .locals 0

    invoke-virtual {p0}, Lkk/c$a;->b()Lju/l0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b()Lju/l0;
    .locals 1

    invoke-static {}, Lkk/c;->e()Lgt/h;

    move-result-object v0

    invoke-interface {v0}, Lgt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lju/l0;

    return-object v0
.end method

.method public final c()Lkk/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lkk/c$a;->d()Lkk/c;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lkk/c;
    .locals 1

    invoke-static {}, Lkk/c;->f()Lgt/h;

    move-result-object v0

    invoke-interface {v0}, Lgt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkk/c;

    return-object v0
.end method
