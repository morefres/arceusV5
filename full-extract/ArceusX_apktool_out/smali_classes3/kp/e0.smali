.class public final Lkp/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lkp/h0;",
        "Landroidx/activity/result/IntentSenderRequest;",
        "Landroidx/activity/result/ActivityResult;",
        "b",
        "()Lkp/h0;",
        "launchers_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Landroidx/activity/result/ActivityResult;)V
    .locals 0

    invoke-static {p0}, Lkp/e0;->c(Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method public static final b()Lkp/h0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkp/h0<",
            "Landroidx/activity/result/IntentSenderRequest;",
            "Landroidx/activity/result/ActivityResult;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lkp/h0;

    new-instance v1, Lh/j;

    invoke-direct {v1}, Lh/j;-><init>()V

    new-instance v2, Lkp/d0;

    invoke-direct {v2}, Lkp/d0;-><init>()V

    invoke-direct {v0, v1, v2}, Lkp/h0;-><init>(Lh/a;Lg/a;)V

    return-object v0
.end method

.method public static final c(Landroidx/activity/result/ActivityResult;)V
    .locals 1

    const-string v0, "success"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkp/g0;

    invoke-direct {v0}, Lkp/g0;-><init>()V

    invoke-virtual {v0, p0}, Lkp/g0;->b(Landroidx/activity/result/ActivityResult;)Z

    return-void
.end method
