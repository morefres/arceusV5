.class public final Ljq/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lju/p0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljq/c;

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ljq/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljq/c;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljq/c;",
            "Ldt/i<",
            "Ljq/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljq/d;->a:Ljq/c;

    iput-object p2, p0, Ljq/d;->b:Ldt/i;

    return-void
.end method

.method public static a(Ljq/c;Ljq/a;)Lju/p0;
    .locals 0

    invoke-virtual {p0, p1}, Ljq/c;->a(Ljq/a;)Lju/p0;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lju/p0;

    return-object p0
.end method

.method public static b(Ljq/c;Ldt/i;)Ljq/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljq/c;",
            "Ldt/i<",
            "Ljq/a;",
            ">;)",
            "Ljq/d;"
        }
    .end annotation

    new-instance v0, Ljq/d;

    invoke-direct {v0, p0, p1}, Ljq/d;-><init>(Ljq/c;Ldt/i;)V

    return-object v0
.end method


# virtual methods
.method public c()Lju/p0;
    .locals 2

    iget-object v0, p0, Ljq/d;->a:Ljq/c;

    iget-object v1, p0, Ljq/d;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljq/a;

    invoke-static {v0, v1}, Ljq/d;->a(Ljq/c;Ljq/a;)Lju/p0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljq/d;->c()Lju/p0;

    move-result-object v0

    return-object v0
.end method
