.class public Liv/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liv/q;->F(Liv/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Liv/f;

.field public final synthetic b:Liv/q;


# direct methods
.method public constructor <init>(Liv/q;Liv/f;)V
    .locals 0

    iput-object p1, p0, Liv/q$a;->b:Liv/q;

    iput-object p2, p0, Liv/q$a;->a:Liv/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Liv/q$a;->a:Liv/f;

    iget-object v1, p0, Liv/q$a;->b:Liv/q;

    invoke-interface {v0, v1, p1}, Liv/f;->a(Liv/d;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Liv/c0;->t(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public onFailure(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 0

    invoke-virtual {p0, p2}, Liv/q$a;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onResponse(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 1

    :try_start_0
    iget-object p1, p0, Liv/q$a;->b:Liv/q;

    invoke-virtual {p1, p2}, Liv/q;->e(Lokhttp3/Response;)Liv/x;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object p2, p0, Liv/q$a;->a:Liv/f;

    iget-object v0, p0, Liv/q$a;->b:Liv/q;

    invoke-interface {p2, v0, p1}, Liv/f;->b(Liv/d;Liv/x;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Liv/c0;->t(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void

    :catchall_1
    move-exception p1

    invoke-static {p1}, Liv/c0;->t(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Liv/q$a;->a(Ljava/lang/Throwable;)V

    return-void
.end method
