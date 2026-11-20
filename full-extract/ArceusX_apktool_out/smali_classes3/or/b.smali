.class public final Lor/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lor/a$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lor/c;",
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
            "Lor/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/b;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Lor/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lor/c;",
            ">;)",
            "Lor/b;"
        }
    .end annotation

    new-instance v0, Lor/b;

    invoke-direct {v0, p0}, Lor/b;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Lor/c;)Lor/a$a;
    .locals 1

    new-instance v0, Lor/a$a;

    invoke-direct {v0, p0}, Lor/a$a;-><init>(Lor/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Lor/a$a;
    .locals 1

    iget-object v0, p0, Lor/b;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor/c;

    invoke-static {v0}, Lor/b;->c(Lor/c;)Lor/a$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lor/b;->b()Lor/a$a;

    move-result-object v0

    return-object v0
.end method
