.class public final Llp/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Llp/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Llp/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llp/f;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Llp/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Llp/b;",
            ">;)",
            "Llp/f;"
        }
    .end annotation

    new-instance v0, Llp/f;

    invoke-direct {v0, p0}, Llp/f;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Llp/b;Ljava/lang/String;)Llp/e;
    .locals 1

    new-instance v0, Llp/e;

    invoke-direct {v0, p0, p1}, Llp/e;-><init>(Llp/b;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;)Llp/e;
    .locals 1

    iget-object v0, p0, Llp/f;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llp/b;

    invoke-static {v0, p1}, Llp/f;->c(Llp/b;Ljava/lang/String;)Llp/e;

    move-result-object p1

    return-object p1
.end method
