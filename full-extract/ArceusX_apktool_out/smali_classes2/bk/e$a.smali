.class public Lbk/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbk/e;->b(Landroidx/lifecycle/s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/lifecycle/e0<",
        "Lml/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lbk/e;


# direct methods
.method public constructor <init>(Lbk/e;)V
    .locals 0

    iput-object p1, p0, Lbk/e$a;->a:Lbk/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lml/a;

    invoke-virtual {p0, p1}, Lbk/e$a;->b(Lml/a;)V

    return-void
.end method

.method public b(Lml/a;)V
    .locals 1

    iget-object v0, p0, Lbk/e$a;->a:Lbk/e;

    invoke-static {v0}, Lbk/e;->a(Lbk/e;)Lbk/e$b;

    move-result-object v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ldk/c;->k:Lml/a;

    :goto_0
    invoke-interface {v0, p1}, Lbk/e$b;->a0(Lml/a;)V

    return-void
.end method
