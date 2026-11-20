.class public final Lfn/s$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfn/s$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lmu/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lfn/s;


# direct methods
.method public constructor <init>(Lfn/s;)V
    .locals 0

    iput-object p1, p0, Lfn/s$a$a;->a:Lfn/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroid/media/Image;Lmt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/media/Image;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lfn/s$a$a;->a:Lfn/s;

    invoke-static {p2, p1}, Lfn/s;->M(Lfn/s;Landroid/media/Image;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/media/Image;

    invoke-virtual {p0, p1, p2}, Lfn/s$a$a;->b(Landroid/media/Image;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
