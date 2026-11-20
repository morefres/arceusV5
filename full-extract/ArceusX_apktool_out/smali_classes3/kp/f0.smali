.class public final Lkp/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lg/c<",
        "Landroidx/activity/result/IntentSenderRequest;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Lkp/c0;


# direct methods
.method public constructor <init>(Lkp/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkp/f0;->a:Lkp/c0;

    return-void
.end method

.method public static a(Lkp/c0;)Lkp/f0;
    .locals 1

    new-instance v0, Lkp/f0;

    invoke-direct {v0, p0}, Lkp/f0;-><init>(Lkp/c0;)V

    return-object v0
.end method

.method public static c(Lkp/c0;)Lg/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkp/c0;",
            ")",
            "Lg/c<",
            "Landroidx/activity/result/IntentSenderRequest;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lkp/c0;->a()Lg/c;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg/c;

    return-object p0
.end method


# virtual methods
.method public b()Lg/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg/c<",
            "Landroidx/activity/result/IntentSenderRequest;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkp/f0;->a:Lkp/c0;

    invoke-static {v0}, Lkp/f0;->c(Lkp/c0;)Lg/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkp/f0;->b()Lg/c;

    move-result-object v0

    return-object v0
.end method
