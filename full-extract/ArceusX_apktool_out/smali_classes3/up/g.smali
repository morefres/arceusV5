.class public final Lup/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lokhttp3/Interceptor;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lup/f;

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lup/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lup/f;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lup/f;",
            "Ldt/i<",
            "Lup/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lup/g;->a:Lup/f;

    iput-object p2, p0, Lup/g;->b:Ldt/i;

    return-void
.end method

.method public static a(Lup/f;Ldt/i;)Lup/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lup/f;",
            "Ldt/i<",
            "Lup/c;",
            ">;)",
            "Lup/g;"
        }
    .end annotation

    new-instance v0, Lup/g;

    invoke-direct {v0, p0, p1}, Lup/g;-><init>(Lup/f;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lup/f;Lup/c;)Lokhttp3/Interceptor;
    .locals 0

    invoke-virtual {p0, p1}, Lup/f;->b(Lup/c;)Lokhttp3/Interceptor;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lokhttp3/Interceptor;

    return-object p0
.end method


# virtual methods
.method public b()Lokhttp3/Interceptor;
    .locals 2

    iget-object v0, p0, Lup/g;->a:Lup/f;

    iget-object v1, p0, Lup/g;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lup/c;

    invoke-static {v0, v1}, Lup/g;->c(Lup/f;Lup/c;)Lokhttp3/Interceptor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lup/g;->b()Lokhttp3/Interceptor;

    move-result-object v0

    return-object v0
.end method
