.class public final Lsg/i$o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrl/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsg/i$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "sg/i$o$a",
        "Lrl/f;",
        "",
        "onSuccess",
        "()V",
        "",
        "errorMessage",
        "onFailure",
        "(Ljava/lang/String;)V",
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


# instance fields
.field public final synthetic a:Lsg/i;

.field public final synthetic b:I


# direct methods
.method public constructor <init>(Lsg/i;I)V
    .locals 0

    iput-object p1, p0, Lsg/i$o$a;->a:Lsg/i;

    iput p2, p0, Lsg/i$o$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/String;)V
    .locals 4

    const-string v0, "errorMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lsg/i$o$a;->a:Lsg/i;

    new-instance v1, Lsg/i$o$a$a;

    iget v2, p0, Lsg/i$o$a;->b:I

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, p1, v3}, Lsg/i$o$a$a;-><init>(Lsg/i;ILjava/lang/String;Lmt/b;)V

    invoke-static {v0, v1}, Lsg/i;->c(Lsg/i;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public onSuccess()V
    .locals 4

    iget-object v0, p0, Lsg/i$o$a;->a:Lsg/i;

    new-instance v1, Lsg/i$o$a$b;

    iget v2, p0, Lsg/i$o$a;->b:I

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Lsg/i$o$a$b;-><init>(Lsg/i;ILmt/b;)V

    invoke-static {v0, v1}, Lsg/i;->c(Lsg/i;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
