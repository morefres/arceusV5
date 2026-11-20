.class public final Ldn/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Ljn/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldn/k;

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ljn/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldn/k;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldn/k;",
            "Ldt/i<",
            "Ljn/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldn/l;->a:Ldn/k;

    iput-object p2, p0, Ldn/l;->b:Ldt/i;

    return-void
.end method

.method public static a(Ldn/k;Lat/a;)Ljn/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldn/k;",
            "Lat/a<",
            "Ljn/b;",
            ">;)",
            "Ljn/a;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Ldn/k;->a(Lat/a;)Ljn/a;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljn/a;

    return-object p0
.end method

.method public static b(Ldn/k;Ldt/i;)Ldn/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldn/k;",
            "Ldt/i<",
            "Ljn/b;",
            ">;)",
            "Ldn/l;"
        }
    .end annotation

    new-instance v0, Ldn/l;

    invoke-direct {v0, p0, p1}, Ldn/l;-><init>(Ldn/k;Ldt/i;)V

    return-object v0
.end method


# virtual methods
.method public c()Ljn/a;
    .locals 2

    iget-object v0, p0, Ldn/l;->a:Ldn/k;

    iget-object v1, p0, Ldn/l;->b:Ldt/i;

    invoke-static {v1}, Ldt/c;->b(Ldt/i;)Lat/a;

    move-result-object v1

    invoke-static {v0, v1}, Ldn/l;->a(Ldn/k;Lat/a;)Ljn/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldn/l;->c()Ljn/a;

    move-result-object v0

    return-object v0
.end method
