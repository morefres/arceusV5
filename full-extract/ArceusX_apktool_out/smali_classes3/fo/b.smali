.class public final Lfo/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwm/o;
.implements Ltr/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfo/b$a;,
        Lfo/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwm/o<",
        "Lfo/b$b;",
        ">;",
        "Ltr/h<",
        "Lfo/b$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u000f\u0015B#\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lfo/b;",
        "Lwm/o;",
        "Lfo/b$b;",
        "Ltr/h;",
        "",
        "sessionToken",
        "Leo/e;",
        "featureFlagManager",
        "Lfo/a;",
        "featureFlagService",
        "<init>",
        "(Ljava/lang/String;Leo/e;Lfo/a;)V",
        "Lmu/h;",
        "run",
        "()Lmu/h;",
        "b",
        "Ljava/lang/String;",
        "c",
        "Leo/e;",
        "d",
        "Lfo/a;",
        "a",
        "feature-flag_release"
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

.field public final c:Leo/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lfo/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Leo/e;Lfo/a;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leo/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lfo/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sessionToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfo/b;->b:Ljava/lang/String;

    iput-object p2, p0, Lfo/b;->c:Leo/e;

    iput-object p3, p0, Lfo/b;->d:Lfo/a;

    return-void
.end method

.method public static final synthetic d(Lfo/b;)Leo/e;
    .locals 0

    iget-object p0, p0, Lfo/b;->c:Leo/e;

    return-object p0
.end method

.method public static final synthetic e(Lfo/b;)Lfo/a;
    .locals 0

    iget-object p0, p0, Lfo/b;->d:Lfo/a;

    return-object p0
.end method

.method public static final synthetic f(Lfo/b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lfo/b;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public a(Ltr/h;)Z
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

    invoke-super {p0, p1}, Ltr/h;->a(Ltr/h;)Z

    move-result p1

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
    .locals 0
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

    invoke-static {p0, p1}, Lwm/o$b;->a(Lwm/o;Lwm/o;)Z

    move-result p1

    return p1
.end method

.method public run()Lmu/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmu/h<",
            "Lfo/b$b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lfo/b$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lfo/b$c;-><init>(Lfo/b;Lmt/b;)V

    invoke-static {v0}, Lmu/j;->w(Lkotlin/jvm/functions/Function2;)Lmu/h;

    move-result-object v0

    return-object v0
.end method
