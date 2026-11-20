.class public Lbk/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbk/e$b;
    }
.end annotation


# instance fields
.field public a:Lbk/e$b;


# direct methods
.method public constructor <init>(Lbk/e$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbk/e;->a:Lbk/e$b;

    return-void
.end method

.method public static bridge synthetic a(Lbk/e;)Lbk/e$b;
    .locals 0

    iget-object p0, p0, Lbk/e;->a:Lbk/e$b;

    return-object p0
.end method


# virtual methods
.method public b(Landroidx/lifecycle/s;)V
    .locals 2

    invoke-static {}, Ldk/c;->c()Ldk/c;

    move-result-object v0

    invoke-virtual {v0}, Ldk/c;->h()Landroidx/lifecycle/a0;

    move-result-object v0

    new-instance v1, Lbk/e$a;

    invoke-direct {v1, p0}, Lbk/e$a;-><init>(Lbk/e;)V

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/a0;->i(Landroidx/lifecycle/s;Landroidx/lifecycle/e0;)V

    return-void
.end method
