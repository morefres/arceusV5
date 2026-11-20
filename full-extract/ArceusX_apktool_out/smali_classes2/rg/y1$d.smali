.class public Lrg/y1$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcj/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrg/y1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lrg/y1;


# direct methods
.method public constructor <init>(Lrg/y1;)V
    .locals 0

    iput-object p1, p0, Lrg/y1$d;->a:Lrg/y1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 0

    return-void
.end method

.method public c(Lcj/p;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onPurchaseFinishedListener: Result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.amazon.purchaseflow"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lrg/y1$d;->a:Lrg/y1;

    invoke-virtual {v0, p1}, Lrg/y1;->x2(Lcj/p;)V

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method
