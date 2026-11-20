.class public final Lzn/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lzn/a$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lzn/c;",
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
            "Lzn/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzn/b;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Lzn/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lzn/c;",
            ">;)",
            "Lzn/b;"
        }
    .end annotation

    new-instance v0, Lzn/b;

    invoke-direct {v0, p0}, Lzn/b;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Lzn/c;)Lzn/a$a;
    .locals 1

    new-instance v0, Lzn/a$a;

    invoke-direct {v0, p0}, Lzn/a$a;-><init>(Lzn/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Lzn/a$a;
    .locals 1

    iget-object v0, p0, Lzn/b;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzn/c;

    invoke-static {v0}, Lzn/b;->c(Lzn/c;)Lzn/a$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzn/b;->b()Lzn/a$a;

    move-result-object v0

    return-object v0
.end method
